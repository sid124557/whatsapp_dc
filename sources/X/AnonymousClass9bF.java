package X;

import com.whatsapp.util.Log;

/* renamed from: X.9bF  reason: invalid class name */
public class AnonymousClass9bF implements C203309nU {
    public void BTy() {
        C1899593h.A1Q("IndiaUpiDeviceBindActivity", "onGetChallengeFailure");
    }

    public void BU4(AnonymousClass34V r3, boolean z) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("onToken success: ");
        A0o.append(z);
        Log.i(C160757oG.A01("IndiaUpiDeviceBindActivity", AnonymousClass000.A0P(r3, " error: ", A0o)));
    }

    public void BZe(boolean z) {
        Log.i(C160757oG.A01("IndiaUpiDeviceBindActivity", AnonymousClass000.A0b("/onRegisterApp registered: ", AnonymousClass001.A0o(), z)));
    }
}
