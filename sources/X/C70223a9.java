package X;

import com.whatsapp.R;
import com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity;

/* renamed from: X.3a9  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70223a9 implements Runnable {
    public final /* synthetic */ P2mLiteOrderDetailsActivity A00;
    public final /* synthetic */ C30791n7 A01;
    public final /* synthetic */ String A02;

    public final void run() {
        P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity = this.A00;
        String str = this.A02;
        C30791n7 r1 = this.A01;
        p2mLiteOrderDetailsActivity.Bp9(R.string.f11nameremoved);
        AnonymousClass9b0 r3 = p2mLiteOrderDetailsActivity.A0E;
        if (r3 != null) {
            C67893Rb r2 = new C67893Rb(p2mLiteOrderDetailsActivity, r1, str);
            AnonymousClass9U4 r12 = p2mLiteOrderDetailsActivity.A0D;
            if (r12 != null) {
                C203719oC A0H = r12.A0H("P2M_LITE");
                C626936e.A06(A0H);
                r3.A00(r2, A0H, str, false);
                return;
            }
            throw C18270x1.A0S("paymentsManager");
        }
        throw C18270x1.A0S("paymentTransactionActions");
    }

    public /* synthetic */ C70223a9(P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity, C30791n7 r2, String str) {
        this.A00 = p2mLiteOrderDetailsActivity;
        this.A02 = str;
        this.A01 = r2;
    }
}
