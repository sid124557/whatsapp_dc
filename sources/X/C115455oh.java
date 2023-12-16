package X;

import android.net.Network;
import com.whatsapp.registration.VerifyPhoneNumber;
import com.whatsapp.util.Log;

/* renamed from: X.5oh  reason: invalid class name and case insensitive filesystem */
public class C115455oh implements C184568s9 {
    public final /* synthetic */ VerifyPhoneNumber A00;
    public final /* synthetic */ String A01;

    public C115455oh(VerifyPhoneNumber verifyPhoneNumber, String str) {
        this.A00 = verifyPhoneNumber;
        this.A01 = str;
    }

    public void BN5(Network network) {
        Log.i("VerifyPhoneNumber/onSilentAuthCodeSent/CellularNetworkAvailabilityCallback available");
        VerifyPhoneNumber verifyPhoneNumber = this.A00;
        C71403c3.A00(verifyPhoneNumber.A04, verifyPhoneNumber, network, this.A01, 13);
    }

    public void Ben() {
        Log.i("VerifyPhoneNumber/onSilentAuthCodeSent/CellularNetworkAvailabilityCallback unavailable");
        VerifyPhoneNumber verifyPhoneNumber = this.A00;
        verifyPhoneNumber.A7U(verifyPhoneNumber.A04);
    }
}
