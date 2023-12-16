package X;

import android.net.ConnectivityManager;
import android.net.Network;
import com.whatsapp.util.Log;

/* renamed from: X.6DN  reason: invalid class name */
public class AnonymousClass6DN extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ AnonymousClass33p A00;
    public final /* synthetic */ C184568s9 A01;

    public AnonymousClass6DN(AnonymousClass33p r1, C184568s9 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void onAvailable(Network network) {
        Log.i("RegistrationUtils/maybeExecuteSilentAuthRequestOnCellular/requestNetwork/cellular is available");
        this.A01.BN5(network);
    }

    public void onUnavailable() {
        Log.e("RegistrationUtils/maybeExecuteSilentAuthRequestOnCellular/requestNetwork/cellular network is unavailable");
        this.A00.A1X("silent_auth_no_cellular");
        this.A01.Ben();
    }
}
