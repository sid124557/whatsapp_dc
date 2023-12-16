package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import com.whatsapp.util.Log;

/* renamed from: X.0xS  reason: invalid class name and case insensitive filesystem */
public class C18460xS extends BroadcastReceiver {
    public C85054Et A00;

    public C18460xS(C85054Et r1) {
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.net.wifi.p2p.CONNECTION_STATE_CHANGE".equals(intent.getAction())) {
            NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
            if (networkInfo == null) {
                Log.w("fpm/WifiDirectManager/WiFi P2P broadcast connection changed action with null network info.");
            } else if (!networkInfo.isConnected()) {
                Log.i("fpm/WifiDirectManager/WiFi P2P broadcast connection changed action, network not connected");
            } else {
                C85054Et r0 = this.A00;
                if (r0 != null) {
                    r0.BPn();
                }
            }
        }
    }
}
