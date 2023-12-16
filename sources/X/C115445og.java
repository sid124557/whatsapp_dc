package X;

import android.net.Network;
import com.whatsapp.registration.VerifyPhoneNumber;
import com.whatsapp.util.Log;

/* renamed from: X.5og  reason: invalid class name and case insensitive filesystem */
public class C115445og implements C184568s9 {
    public final /* synthetic */ VerifyPhoneNumber A00;

    public C115445og(VerifyPhoneNumber verifyPhoneNumber) {
        this.A00 = verifyPhoneNumber;
    }

    public void BN5(Network network) {
        Log.i("VerifyPhoneNumber/requestSilentAuth/CellularNetworkAvailabilityCallback available");
        this.A00.A7g(network);
    }

    public void Ben() {
        Log.i("VerifyPhoneNumber/requestSilentAuth/CellularNetworkAvailabilityCallback unavailable");
        VerifyPhoneNumber verifyPhoneNumber = this.A00;
        verifyPhoneNumber.A7U(verifyPhoneNumber.A04);
    }
}
