package X;

import java.util.HashMap;

/* renamed from: X.9Qi  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9Qi {
    public final /* synthetic */ C52792m3 A00;

    public final void A00(C133706ho r7, AnonymousClass34V r8) {
        String str;
        String str2;
        C52792m3 r5 = this.A00;
        HashMap A0t = AnonymousClass001.A0t();
        if (r8 == null) {
            C133776hv r0 = (C133776hv) r7.A08;
            if (r0 != null) {
                int i = r0.A01;
                boolean z = true;
                if ((i & 1) <= 0) {
                    z = false;
                }
                if (!z) {
                    str2 = "sell_pending";
                } else if ((i & 2) <= 0) {
                    str2 = "payout_pending";
                }
                A0t.put(str2, "1");
            }
            str = "on_success";
        } else {
            C1899693i.A0v(A0t, r8.A00);
            str = "on_failure";
        }
        r5.A01(str, A0t);
    }

    public /* synthetic */ AnonymousClass9Qi(C52792m3 r1) {
        this.A00 = r1;
    }
}
