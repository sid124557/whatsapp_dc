package X;

import com.whatsapp.util.Log;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocket;

/* renamed from: X.32e  reason: invalid class name and case insensitive filesystem */
public class C617732e {
    public final C60182y8 A00;
    public final C55132pq A01;
    public final Random A02;

    public static InputStream A00(C54332oY r1, C58782vo r2) {
        boolean z = r2.A01;
        InputStream inputStream = r1.A00.getInputStream();
        if (z) {
            return new C140336tZ(inputStream);
        }
        return inputStream;
    }

    public static OutputStream A01(C54332oY r1, C58782vo r2) {
        boolean z = r2.A01;
        OutputStream outputStream = r1.A00.getOutputStream();
        if (z) {
            return new C36751zp(outputStream);
        }
        return outputStream;
    }

    public C617732e(C60182y8 r1, C55132pq r2, Random random) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = random;
    }

    public C54332oY A02(C58782vo r18) {
        C32551r7 r5;
        ReentrantLock reentrantLock;
        C32551r7 r2;
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        C58782vo r22 = r18;
        InetAddress[] inetAddressArr = r22.A04;
        boolean z = false;
        for (InetAddress inetAddress : inetAddressArr) {
            if (inetAddress.getAddress().length > 4) {
                A0s2.add(inetAddress);
            } else {
                A0s.add(inetAddress);
            }
        }
        C55132pq r3 = this.A01;
        synchronized (r3) {
            r5 = r3.A01;
            if (r5 == null) {
                r5 = new C32551r7(r3.A06.A00, r3.A08);
                r3.A01 = r5;
            }
        }
        if (A0s.size() <= 0 || A0s2.size() <= 0) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("ConnectionSocketFactory/try_connect/notHappyEyeball/ ipv4 found = ");
            A0o.append(AnonymousClass001.A1W(A0s.size()));
            A0o.append("; ipv6 found = ");
            if (A0s2.size() > 0) {
                z = true;
            }
            A0o.append(z);
            C18260x0.A1J(A0o, ";");
            C626936e.A06(inetAddressArr);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(inetAddressArr[this.A02.nextInt(r9)], r22.A00);
            StringBuilder A0o2 = AnonymousClass001.A0o();
            AnonymousClass000.A17(inetSocketAddress, "ConnectionSocketFactory/try_connect/", " (secureSocket? ", A0o2);
            boolean z2 = r22.A03;
            A0o2.append(z2);
            A0o2.append(')');
            C18280x3.A14(A0o2);
            Socket createSocket = SocketFactory.getDefault().createSocket();
            createSocket.connect(inetSocketAddress, 30000);
            if (z2) {
                createSocket = r5.createSocket(createSocket, inetSocketAddress.getHostName(), inetSocketAddress.getPort(), true);
                ((SSLSocket) createSocket).startHandshake();
            }
            return new C54332oY(createSocket);
        }
        Random random = this.A02;
        InetSocketAddress inetSocketAddress2 = new InetSocketAddress((InetAddress) A0s.get(random.nextInt(A0s.size())), r22.A00);
        InetSocketAddress inetSocketAddress3 = new InetSocketAddress((InetAddress) A0s2.get(random.nextInt(A0s2.size())), r22.A00);
        Log.i("ConnectionSocketFactory/try_connect/using-happyEyeball");
        C60182y8 r6 = this.A00;
        boolean z3 = r22.A03;
        C49272gG r7 = new C49272gG();
        synchronized (r6) {
            r6.A02 = false;
            if (r6.A01 == null) {
                C55132pq r32 = r6.A03;
                synchronized (r32) {
                    r2 = r32.A01;
                    if (r2 == null) {
                        r2 = new C32551r7(r32.A06.A00, r32.A08);
                        r32.A01 = r2;
                    }
                }
                r6.A01 = r2;
            }
        }
        Log.d("happyEyeball/tryConnect");
        r6.A00().execute(new C71673cU(r6, r7, inetSocketAddress3, 2, z3));
        try {
            reentrantLock = r7.A02;
            reentrantLock.lockInterruptibly();
            for (long nanos = TimeUnit.MILLISECONDS.toNanos(250); nanos > 0; nanos = r7.A01.awaitNanos(nanos)) {
                if (r7.A00 != null) {
                    break;
                }
            }
            Object obj = r7.A00;
            reentrantLock.unlock();
            Socket socket = (Socket) obj;
            if (socket != null) {
                return new C54332oY(socket);
            }
            Log.i("happyEyeball/couldn't connect to ipv6 in 250 ms");
            r6.A00().execute(new C71673cU(r6, r7, inetSocketAddress2, 3, z3));
            try {
                Socket socket2 = (Socket) r7.A00();
                if (!(socket2 == null || !socket2.isConnected() || socket2 == C60182y8.A05)) {
                    return new C54332oY(socket2);
                }
            } catch (InterruptedException e) {
                Log.w("HappyEyeball", e);
            }
            throw AnonymousClass002.A0C("HappyEyeball/couldn't connect to neither of ips");
        } catch (InterruptedException e2) {
            Log.e("HappyEyeball/try_connect exception short wait for ipv6", e2);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
