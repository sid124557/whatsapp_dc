package X;

import android.net.TrafficStats;
import android.os.Build;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.2y8  reason: invalid class name and case insensitive filesystem */
public class C60182y8 {
    public static final Socket A05 = new Socket();
    public ThreadPoolExecutor A00;
    public SSLSocketFactory A01;
    public boolean A02;
    public final C55132pq A03;
    public final AnonymousClass4FS A04;

    public final synchronized ThreadPoolExecutor A00() {
        ThreadPoolExecutor threadPoolExecutor;
        threadPoolExecutor = this.A00;
        if (threadPoolExecutor == null) {
            AnonymousClass4FS r1 = this.A04;
            threadPoolExecutor = new C34091uD((C69423Wy) r1, "happy-eyeball", new ArrayBlockingQueue(2), new C117985so(1, "happy-eyeball"), TimeUnit.SECONDS, 2, 2, 30, false);
            this.A00 = threadPoolExecutor;
        }
        return threadPoolExecutor;
    }

    public C60182y8(C55132pq r1, AnonymousClass4FS r2) {
        this.A04 = r2;
        this.A03 = r1;
    }

    public final void A01(C49272gG r9, InetSocketAddress inetSocketAddress, boolean z) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("HappyEyeball/connectAndCountDown/");
        A0o.append(inetSocketAddress);
        C18260x0.A1J(A0o, "/begin");
        try {
            TrafficStats.setThreadStatsTag(1);
            SSLSocketFactory sSLSocketFactory = this.A01;
            Socket createSocket = SocketFactory.getDefault().createSocket();
            StringBuilder A0l = AnonymousClass000.A0l("HappyEyeball");
            A0l.append("/try_connect/");
            A0l.append(inetSocketAddress);
            A0l.append(" (secureSocket? ");
            Log.i(C18260x0.A0A(A0l, z));
            createSocket.connect(inetSocketAddress, 30000);
            if (z) {
                createSocket = sSLSocketFactory.createSocket(createSocket, inetSocketAddress.getHostName(), inetSocketAddress.getPort(), true);
                ((SSLSocket) createSocket).startHandshake();
            }
            C18260x0.A1J(AnonymousClass000.A0l("HappyEyeball"), "/try_connect/connected");
            C54332oY r1 = new C54332oY(createSocket);
            if (!r9.A01(r1.A00)) {
                Log.i("HappyEyeball/closeSocket");
                r1.A01();
            }
        } catch (IOException | ClassCastException e) {
            if (!(e instanceof ClassCastException) || Build.VERSION.SDK_INT == 26) {
                C18260x0.A15("/couldn't connect to ip", AnonymousClass000.A0k(inetSocketAddress, "HappyEyeball/connectAndCountDown/"), e);
                synchronized (this) {
                    if (this.A02) {
                        r9.A01(A05);
                    } else {
                        this.A02 = true;
                    }
                }
            } else {
                throw ((ClassCastException) e);
            }
        } catch (Throwable th) {
            TrafficStats.clearThreadStatsTag();
            throw th;
        }
        TrafficStats.clearThreadStatsTag();
        C18260x0.A1J(AnonymousClass000.A0k(inetSocketAddress, "HappyEyeball/connectAndCountDown/"), "/finish");
    }
}
