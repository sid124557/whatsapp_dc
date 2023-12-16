package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.1jN  reason: invalid class name */
public final class AnonymousClass1jN extends C55212pz implements AnonymousClass4G9 {
    public AnonymousClass4DK A00;
    public final C54292oU A01;

    public void B3J(Map map) {
        AnonymousClass4DK r0 = this.A00;
        if (r0 != null) {
            r0.BdH(map);
        } else {
            Log.e("native_upi_reset_pin/finish: callback is null");
        }
        this.A00 = null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1jN(C54292oU r1, AnonymousClass1j2 r2) {
        super(r2);
        C18260x0.A0Q(r1, r2);
        this.A01 = r1;
    }
}
