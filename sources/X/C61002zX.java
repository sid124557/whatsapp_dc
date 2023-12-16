package X;

import android.net.wifi.p2p.WifiP2pManager;
import android.net.wifi.p2p.nsd.WifiP2pDnsSdServiceRequest;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2zX  reason: invalid class name and case insensitive filesystem */
public class C61002zX {
    public static final long A08 = TimeUnit.SECONDS.toMillis(15);
    public int A00 = 0;
    public C28311gd A01;
    public Runnable A02;
    public final C28901hx A03;
    public final AnonymousClass2HD A04;
    public final C44472We A05;
    public final AnonymousClass4FS A06;
    public final String A07;

    public void A00() {
        int i = this.A00 + 1;
        this.A00 = i;
        if (i > 3) {
            Log.i("fpm/DonorConnectionHandler/retryServiceDiscovery/maximum retries reached, reporting error");
            this.A03.A0A(603, (String) null);
            return;
        }
        Log.i("fpm/DonorConnectionHandler/retryServiceDiscovery/restarting WiFiDirect since peer has not been discovered");
        A02();
        A01();
    }

    public void A01() {
        C28311gd r2 = new C28311gd(this.A04.A00.A03);
        this.A01 = r2;
        r2.A01(new AnonymousClass3R6(this), this.A07);
        C28311gd r4 = this.A01;
        if (r4.A00 != null) {
            Log.w("fpm/DonorWifiDirectManager/Discover service already called and active.");
        } else {
            WifiP2pManager wifiP2pManager = r4.A01;
            if (wifiP2pManager == null) {
                Log.e("fpm/DonorWifiDirectManager/Trying to start service discovery without manager");
            } else {
                wifiP2pManager.setDnsSdResponseListeners(r4.A00, new AnonymousClass37V(r4), new AnonymousClass37W());
                r4.A00 = WifiP2pDnsSdServiceRequest.newInstance();
                AnonymousClass37S r3 = new AnonymousClass37S("add service request");
                r4.A01.addServiceRequest(r4.A00, r4.A00, r3);
                AnonymousClass37S r22 = new AnonymousClass37S("discover services");
                r4.A01.discoverServices(r4.A00, r22);
                if (r3.A00() && r22.A00()) {
                    this.A02 = this.A06.Bkn(new C70023Zo(this, 14), "fpm/DonorConnectionHandler/startServiceDiscovery", A08);
                    Log.i("fpm/DonorConnectionHandler/started service discovery and scheduled pending restart");
                    Iterator A032 = C61102zi.A03(this.A03);
                    while (A032.hasNext()) {
                        ((AnonymousClass3R4) A032.next()).A00.A0X.A01(16);
                    }
                    return;
                }
            }
        }
        C28311gd r0 = this.A01;
        WifiP2pManager wifiP2pManager2 = r0.A01;
        if (wifiP2pManager2 != null) {
            wifiP2pManager2.clearServiceRequests(r0.A00, new AnonymousClass37S("clearServiceRequests"));
        }
        A02();
        this.A03.A0A(602, "failure to start service discovery");
    }

    public final void A02() {
        if (this.A01 != null) {
            Log.i("fpm/DonorConnectionHandler/stopping WifiDirect");
            this.A01.A00();
            this.A01 = null;
        }
    }

    public C61002zX(C28901hx r2, AnonymousClass2HD r3, C44472We r4, AnonymousClass4FS r5, String str) {
        this.A07 = str;
        this.A06 = r5;
        this.A03 = r2;
        this.A04 = r3;
        this.A05 = r4;
    }
}
