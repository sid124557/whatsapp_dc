package X;

import android.content.Intent;

/* renamed from: X.9i4  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200279i4 implements Runnable {
    public final /* synthetic */ C624034w A00;
    public final /* synthetic */ AnonymousClass9D7 A01;

    public final void run() {
        AnonymousClass9D7 r3 = this.A01;
        C624034w r1 = this.A00;
        C166587yw r0 = r3.A03;
        if (r0 == null) {
            r3.BjL();
            Intent A05 = C1899593h.A05(r3);
            A05.putExtra("extra_payments_entry_type", 6);
            A05.putExtra("extra_is_first_payment_method", true);
            A05.putExtra("extra_skip_value_props_display", false);
            r3.A6T(A05, true);
            return;
        }
        AnonymousClass99H r02 = (AnonymousClass99H) r0.A08;
        if (r02 == null || AnonymousClass99H.A00(r02)) {
            r3.A7l(r1);
            return;
        }
        r3.BjL();
        r3.A7o(r3.A09);
    }

    public /* synthetic */ C200279i4(C624034w r1, AnonymousClass9D7 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
