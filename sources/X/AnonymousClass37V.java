package X;

import android.net.wifi.p2p.WifiP2pDevice;
import android.net.wifi.p2p.WifiP2pManager;
import com.whatsapp.util.Log;

/* renamed from: X.37V  reason: invalid class name */
public class AnonymousClass37V implements WifiP2pManager.DnsSdServiceResponseListener {
    public final /* synthetic */ C28311gd A00;

    public AnonymousClass37V(C28311gd r1) {
        this.A00 = r1;
    }

    public void onDnsSdServiceAvailable(String str, String str2, WifiP2pDevice wifiP2pDevice) {
        C28311gd r1 = this.A00;
        if (str.equals(r1.A04)) {
            Log.i("fpm/DonorWifiDirectManager/Service discovered, instance name: matching, session ID: matching");
            C85054Et r12 = r1.A03;
            if (r12 != null) {
                r12.BbM(wifiP2pDevice.deviceAddress);
            }
        } else if (str.contains("_chattransfer._whatsapp.com")) {
            Log.i("fpm/DonorWifiDirectManager/Service discovered, instance name: matching, session ID: not matching");
            C85054Et r13 = r1.A03;
            if (r13 != null) {
                r13.BS0(602, "fpm/DonorWifiDirectManager/Service discovered, instance name: matching, session ID: not matching");
            }
        } else {
            Log.i("fpm/DonorWifiDirectManager/Service discovered, instance name: not matching");
        }
    }
}
