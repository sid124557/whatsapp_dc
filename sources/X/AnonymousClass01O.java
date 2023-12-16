package X;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: X.01O  reason: invalid class name */
public final class AnonymousClass01O extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ AnonymousClass0BM A00;

    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        C162457s7.A0J(networkCapabilities, 1);
        C06240Wu.A02(C06240Wu.A00(), networkCapabilities, "Network capabilities changed: ", AnonymousClass0VK.A00, AnonymousClass001.A0o());
        AnonymousClass0BM r1 = this.A00;
        r1.A02(AnonymousClass0VK.A00(r1.A00));
    }

    public AnonymousClass01O(AnonymousClass0BM r1) {
        this.A00 = r1;
    }

    public void onLost(Network network) {
        C06240Wu.A00().A04(AnonymousClass0VK.A00, "Network connection lost");
        AnonymousClass0BM r1 = this.A00;
        r1.A02(AnonymousClass0VK.A00(r1.A00));
    }
}
