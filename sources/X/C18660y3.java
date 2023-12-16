package X;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.telephony.TelephonyManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0y3  reason: invalid class name and case insensitive filesystem */
public class C18660y3 extends ConnectivityManager.NetworkCallback {
    public final AnonymousClass5ZR A00;
    public final AtomicBoolean A01 = C18280x3.A0l();
    public volatile ConnectivityManager A02;
    public volatile Network A03;
    public volatile TelephonyManager A04;
    public final /* synthetic */ C29441ip A05;

    public static void A00(C18660y3 r2) {
        r2.A03 = null;
        r2.A01.set(false);
        r2.A05.A0C();
    }

    public C18660y3(C29441ip r2, AnonymousClass5ZR r3) {
        this.A05 = r2;
        this.A00 = r3;
    }

    public int A01() {
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = this.A02;
        int i = 0;
        if (!(connectivityManager == null || this.A03 == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(this.A03)) == null)) {
            i = 1;
            if (!networkCapabilities.hasTransport(1) && !networkCapabilities.hasTransport(3)) {
                if (!networkCapabilities.hasCapability(18)) {
                    return 3;
                }
                return 2;
            }
        }
        return i;
    }

    public int A02() {
        TelephonyManager telephonyManager = this.A04;
        if (telephonyManager == null || this.A00.A02("android.permission.READ_PHONE_STATE") != 0) {
            return 0;
        }
        return telephonyManager.getDataNetworkType();
    }

    public boolean A03() {
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = this.A02;
        if (connectivityManager == null || this.A03 == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(this.A03)) == null || networkCapabilities.hasCapability(11) || connectivityManager.getRestrictBackgroundStatus() != 3) {
            return false;
        }
        return true;
    }

    public boolean A04() {
        return this.A01.get();
    }

    public void onBlockedStatusChanged(Network network, boolean z) {
        if (!z) {
            this.A03 = network;
            this.A01.set(true);
            this.A05.A0C();
        } else if (network.equals(this.A03)) {
            A00(this);
        }
    }

    public void onLost(Network network) {
        if (network.equals(this.A03)) {
            A00(this);
        }
    }

    public void onUnavailable() {
        A00(this);
    }
}
