package X;

import android.net.wifi.p2p.WifiP2pInfo;
import com.whatsapp.util.Log;
import java.net.InetAddress;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.3R6  reason: invalid class name */
public class AnonymousClass3R6 implements C85054Et {
    public CountDownLatch A00;
    public final /* synthetic */ C61002zX A01;

    public AnonymousClass3R6(C61002zX r1) {
        this.A01 = r1;
    }

    public void BPn() {
        Log.i("fpm/DonorConnectionHandler/onConnectionChanged");
        C61002zX r2 = this.A01;
        C70023Zo.A00(r2.A06, r2, 15);
    }

    public void BS0(int i, String str) {
        Log.i("fpm/DonorConnectionHandler/onError");
        C61002zX r2 = this.A01;
        Runnable runnable = r2.A02;
        if (runnable != null) {
            r2.A06.BjN(runnable);
        }
        r2.A03.A0A(602, str);
    }

    public void BWy(WifiP2pInfo wifiP2pInfo) {
        Log.i("fpm/DonorConnectionHandler/onNetworkConnected");
        CountDownLatch countDownLatch = this.A00;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        if (wifiP2pInfo.isGroupOwner) {
            new C28281ga(new C384427o(), new AnonymousClass4IQ(this.A01, 0)).start();
            return;
        }
        InetAddress inetAddress = wifiP2pInfo.groupOwnerAddress;
        if (inetAddress != null && inetAddress.getHostAddress() != null) {
            this.A01.A05.A00(wifiP2pInfo.groupOwnerAddress.getHostAddress());
        }
    }

    public void BbM(String str) {
        Log.i("fpm/DonorConnectionHandler/onServiceFound");
        this.A00 = C18290x4.A14();
        this.A01.A06.BkM(new C71323bv(46, str, this));
    }
}
