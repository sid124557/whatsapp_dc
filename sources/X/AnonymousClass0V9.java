package X;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: X.0V9  reason: invalid class name */
public final class AnonymousClass0V9 {
    public static final NetworkCapabilities A00(ConnectivityManager connectivityManager, Network network) {
        C162457s7.A0J(connectivityManager, 0);
        return connectivityManager.getNetworkCapabilities(network);
    }

    public static final void A01(ConnectivityManager.NetworkCallback networkCallback, ConnectivityManager connectivityManager) {
        C162457s7.A0J(connectivityManager, 0);
        C162457s7.A0J(networkCallback, 1);
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }

    public static final boolean A02(NetworkCapabilities networkCapabilities, int i) {
        C162457s7.A0J(networkCapabilities, 0);
        return networkCapabilities.hasCapability(i);
    }
}
