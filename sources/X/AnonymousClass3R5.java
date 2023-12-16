package X;

import android.net.wifi.p2p.WifiP2pInfo;
import com.whatsapp.util.Log;
import java.net.InetAddress;
import java.net.Socket;

/* renamed from: X.3R5  reason: invalid class name */
public class AnonymousClass3R5 implements C85054Et {
    public final /* synthetic */ C46762cA A00;

    public AnonymousClass3R5(C46762cA r1) {
        this.A00 = r1;
    }

    public void BPn() {
        Log.i("fpm/ReceiverConnectionHandler/onConnectionChanged");
        C46762cA r2 = this.A00;
        C70023Zo.A00(r2.A04, r2, 17);
    }

    public void BS0(int i, String str) {
        Log.i("fpm/ReceiverConnectionHandler/onError");
        this.A00.A02.A0A(602, str);
    }

    public void BWy(WifiP2pInfo wifiP2pInfo) {
        InetAddress inetAddress;
        Log.i("fpm/ReceiverConnectionHandler/onNetworkConnected");
        C46762cA r4 = this.A00;
        Runnable runnable = r4.A01;
        if (runnable != null) {
            r4.A04.BjN(runnable);
        }
        if (!wifiP2pInfo.isGroupOwner && (inetAddress = wifiP2pInfo.groupOwnerAddress) != null && inetAddress.getHostAddress() != null) {
            new C28291gb(new AnonymousClass4IQ(r4, 1), wifiP2pInfo.groupOwnerAddress.getHostAddress(), new Socket()).start();
        }
    }

    public void BbM(String str) {
    }
}
