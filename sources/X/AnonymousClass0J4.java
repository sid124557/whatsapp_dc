package X;

import android.net.ConnectivityManager;

/* renamed from: X.0J4  reason: invalid class name */
public final class AnonymousClass0J4 {
    public static final void A00(ConnectivityManager.NetworkCallback networkCallback, ConnectivityManager connectivityManager) {
        C162457s7.A0J(connectivityManager, 0);
        C162457s7.A0J(networkCallback, 1);
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
