package X;

import android.net.wifi.p2p.WifiP2pManager;

/* renamed from: X.37T  reason: invalid class name */
public final /* synthetic */ class AnonymousClass37T implements WifiP2pManager.ChannelListener {
    public final /* synthetic */ C60242yE A00;

    public final void onChannelDisconnected() {
        C85054Et r1 = this.A00.A03;
        if (r1 != null) {
            r1.BS0(602, "onChannelDisconnected");
        }
    }

    public /* synthetic */ AnonymousClass37T(C60242yE r1) {
        this.A00 = r1;
    }
}
