package X;

import android.net.wifi.p2p.WifiP2pInfo;
import android.net.wifi.p2p.WifiP2pManager;

/* renamed from: X.37U  reason: invalid class name */
public final /* synthetic */ class AnonymousClass37U implements WifiP2pManager.ConnectionInfoListener {
    public final /* synthetic */ C60242yE A00;

    public final void onConnectionInfoAvailable(WifiP2pInfo wifiP2pInfo) {
        C60242yE r2 = this.A00;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("fpm/WifiDirectManager/Connection information available. group_formed: ");
        A0o.append(wifiP2pInfo.groupFormed);
        A0o.append(" group_owner: ");
        C18260x0.A1V(A0o, wifiP2pInfo.isGroupOwner);
        C85054Et r0 = r2.A03;
        if (r0 != null) {
            r0.BWy(wifiP2pInfo);
        }
    }

    public /* synthetic */ AnonymousClass37U(C60242yE r1) {
        this.A00 = r1;
    }
}
