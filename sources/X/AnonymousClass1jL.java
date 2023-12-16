package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.1jL  reason: invalid class name */
public final class AnonymousClass1jL extends C55212pz implements AnonymousClass4G9 {
    public AnonymousClass4DK A00;
    public final C54292oU A01;

    public void B3J(Map map) {
        AnonymousClass4DK r1 = this.A00;
        if (r1 != null) {
            r1.BdH(map);
            this.A00 = null;
            return;
        }
        Log.e("native_upi_add_payment_method/finish: callback is null");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1jL(C54292oU r1, AnonymousClass1j2 r2) {
        super(r2);
        C18260x0.A0Q(r1, r2);
        this.A01 = r1;
    }
}
