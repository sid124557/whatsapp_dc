package X;

import com.whatsapp.util.Log;

/* renamed from: X.9R2  reason: invalid class name */
public class AnonymousClass9R2 {
    public final AnonymousClass36F A00;
    public final AnonymousClass2RZ A01;

    public void A00(C30791n7 r14) {
        String str;
        AnonymousClass39W r0 = r14.A00;
        C626936e.A06(r0);
        AnonymousClass39S r1 = r0.A01;
        if (r1 == null) {
            str = "BipRepository/updateTransaction Checkout content was null";
        } else {
            String str2 = r1.A04;
            if (str2 == null) {
                str = "BipRepository/updateTransaction transaction was null";
            } else {
                AnonymousClass36F r6 = this.A00;
                C624034w A0G = r6.A0G(str2);
                if (A0G == null) {
                    str = "BipRepository/updateTransaction old transaction was null";
                } else {
                    int i = A0G.A02;
                    AnonymousClass1S4 r5 = A0G.A0A;
                    if (r5 != null) {
                        A0G.A08(new AnonymousClass39U(0, r1.A0E, r14.A1J.A01), r5);
                    } else {
                        Log.d("BipRepository/updateTransaction countryData is null or checkoutInfo is null");
                    }
                    r6.A0g(A0G, C1899593h.A0R(A0G), i, 0, -1);
                    return;
                }
            }
        }
        Log.i(str);
    }

    public AnonymousClass9R2(AnonymousClass36F r1, AnonymousClass2RZ r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
