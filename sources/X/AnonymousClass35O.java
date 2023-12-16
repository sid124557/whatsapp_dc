package X;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.net.TrafficStats;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.whatsapp.calling.MultiNetworkCallback;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.35O  reason: invalid class name */
public class AnonymousClass35O {
    public ConnectivityManager.NetworkCallback A00;
    public Network A01;
    public DatagramSocket A02;
    public boolean A03 = false;
    public final ConnectivityManager A04;
    public final AnonymousClass2F8 A05;
    public final AnonymousClass49P A06;
    public final ScheduledExecutorService A07;

    public AnonymousClass35O(ConnectivityManager connectivityManager, AnonymousClass49P r4) {
        AnonymousClass2F8 r1 = new AnonymousClass2F8(r4);
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.A04 = connectivityManager;
        this.A05 = r1;
        this.A07 = newSingleThreadScheduledExecutor;
        this.A06 = r4;
    }

    public static /* synthetic */ void A00(AnonymousClass35O r2) {
        C626936e.A0D(r2.A03, "provider must not have already shutdown");
        if (!r2.A03) {
            Log.e("voip/weak-wifi/shutdown: provider is already shutdown");
            return;
        }
        r2.A07(true);
        Voip.nativeUnregisterMultiNetworkCallback();
        r2.A03 = false;
    }

    public static /* synthetic */ void A01(AnonymousClass35O r3) {
        C626936e.A0D(!r3.A03, "provider must not have already started");
        if (r3.A03) {
            Log.e("voip/weak-wifi/startup: provider is already started");
            return;
        }
        Voip.nativeRegisterMultiNetworkCallback(new MultiNetworkCallback(r3));
        r3.A03 = true;
    }

    public static /* synthetic */ void A02(AnonymousClass35O r1, boolean z) {
        if (!r1.A03) {
            Log.i("voip/weak-wifi/closeAlternativeSocket: provider is not running");
        } else {
            r1.A07(z);
        }
    }

    public static /* synthetic */ void A03(AnonymousClass35O r6, boolean z, boolean z2) {
        String str;
        String str2;
        String str3;
        if (!r6.A03) {
            Log.i("voip/weak-wifi/createAlternativeSocket: provider is not running");
        } else if (r6.A01 != null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("voip/weak-wifi/re-use-alt-network: ");
            if (z) {
                str2 = "cellular";
            } else {
                str2 = "wifi";
            }
            A0o.append(str2);
            A0o.append("; test_network_cond=");
            if (z2) {
                str3 = "true";
            } else {
                str3 = "false";
            }
            C18260x0.A1L(A0o, str3);
            if (r6.A02 != null) {
                Log.i("voip/weak-wifi/create-alt-sock: previously created sock was not closed");
                Voip.notifyFailureToCreateAlternativeSocket(z2);
                return;
            }
            r6.A06(r6.A01, z2);
        } else {
            NetworkRequest.Builder builder = new NetworkRequest.Builder();
            if (z) {
                builder.addTransportType(0);
                str = "voip/weak-wifi/alt-network: cellular";
            } else {
                builder.addTransportType(1);
                str = "voip/weak-wifi/alt-network: wifi";
            }
            Log.i(str);
            builder.addCapability(12);
            r6.A00 = new C18670y4(r6, r6.A07.schedule(new C71703cX(r6, 11, z2), 5000, TimeUnit.MILLISECONDS), z2);
            int i = Build.VERSION.SDK_INT;
            ConnectivityManager connectivityManager = r6.A04;
            NetworkRequest build = builder.build();
            ConnectivityManager.NetworkCallback networkCallback = r6.A00;
            if (i >= 26) {
                connectivityManager.requestNetwork(build, networkCallback, 5000);
            } else {
                connectivityManager.requestNetwork(build, networkCallback);
            }
        }
    }

    public void A04() {
        ScheduledExecutorService scheduledExecutorService = this.A07;
        scheduledExecutorService.execute(new C117125rQ(this, 39));
        scheduledExecutorService.shutdown();
    }

    public void A05() {
        this.A07.execute(new C117125rQ(this, 38));
    }

    public final void A06(Network network, boolean z) {
        DatagramSocket datagramSocket;
        String str;
        boolean z2 = false;
        C626936e.A0D(AnonymousClass000.A1X(this.A02), "alternative socket must not have created");
        if (this.A02 != null) {
            Log.i("voip/weak-wifi/alt-sock: socket already created");
        } else {
            try {
                TrafficStats.setThreadStatsTag(15);
                this.A01 = network;
                DatagramSocket datagramSocket2 = new DatagramSocket();
                this.A02 = datagramSocket2;
                this.A01.bindSocket(datagramSocket2);
                z2 = true;
            } catch (SocketException unused) {
                str = "voip/weak-wifi/create-sock: socket exception to create alternative socket.";
            } catch (IOException unused2) {
                str = "voip/weak-wifi/create-sock: io exception to bind socket to alternative network.";
            }
            datagramSocket = this.A02;
            if (datagramSocket != null || !z2) {
                A07(true);
            } else {
                String str2 = null;
                try {
                    datagramSocket.connect(network.getByName("1.1.1.1"), 53);
                    InetAddress localAddress = datagramSocket.getLocalAddress();
                    if (!localAddress.isAnyLocalAddress()) {
                        str2 = localAddress.getHostAddress();
                    }
                    datagramSocket.disconnect();
                } catch (UnknownHostException unused3) {
                    Log.e("voip/weak-wifi/create-sock: unknown host exception to retrieve local ip.");
                }
                int detachFd = ParcelFileDescriptor.fromDatagramSocket(this.A02).detachFd();
                int localPort = this.A02.getLocalPort();
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("voip/weak-wifi/create-sock: ip=");
                A0o.append(str2);
                A0o.append("; port=");
                A0o.append(localPort);
                A0o.append("; fd=");
                A0o.append(detachFd);
                C18260x0.A1E("; test_network_cond = ", A0o, z);
                if (z) {
                    Voip.startTestNetworkConditionWithAlternativeSocket(detachFd, str2, localPort);
                    return;
                } else {
                    Voip.switchNetworkWithAlternativeSocket(detachFd, str2, localPort);
                    return;
                }
            }
        }
        Voip.notifyFailureToCreateAlternativeSocket(z);
        Log.e(str);
        datagramSocket = this.A02;
        if (datagramSocket != null) {
        }
        A07(true);
        Voip.notifyFailureToCreateAlternativeSocket(z);
    }

    public final void A07(boolean z) {
        if (this.A02 != null) {
            Log.i("voip/weak-wifi/close-sock");
            this.A02.close();
            this.A02 = null;
        }
        if (z) {
            ConnectivityManager.NetworkCallback networkCallback = this.A00;
            if (networkCallback != null) {
                try {
                    this.A04.unregisterNetworkCallback(networkCallback);
                    Log.i("voip/weak-wifi/unregister-alt-network-callback: succeeded.");
                } catch (IllegalArgumentException unused) {
                    Log.i("voip/weak-wifi/unregister-alt-network-callback: failed.");
                }
                this.A00 = null;
            }
            this.A01 = null;
        }
    }
}
