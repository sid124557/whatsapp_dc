package X;

import java.util.HashMap;

/* renamed from: X.9Qj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C193859Qj {
    public final /* synthetic */ C52792m3 A00;

    public final void A00(AnonymousClass34V r5, C193709Pr r6) {
        String str;
        C52792m3 r3 = this.A00;
        HashMap A0t = AnonymousClass001.A0t();
        if (r5 == null) {
            A0t.put("business_name", r6.A02);
            A0t.put("owner_full_name", r6.A04);
            A0t.put("verify_type", r6.A05);
            A0t.put("bank_name", r6.A01);
            A0t.put("credential_id", r6.A03);
            str = "on_success";
        } else {
            C1899693i.A0v(A0t, r5.A00);
            str = "on_failure";
        }
        r3.A01(str, A0t);
    }

    public /* synthetic */ C193859Qj(C52792m3 r1) {
        this.A00 = r1;
    }
}
