package X;

import com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity;

/* renamed from: X.3Zg  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C69943Zg implements Runnable {
    public final /* synthetic */ P2mLiteOrderDetailsActivity A00;

    public final void run() {
        AnonymousClass39W r0;
        AnonymousClass39S r02;
        String str;
        P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity = this.A00;
        C30791n7 A1o = AnonymousClass1Ha.A1o(p2mLiteOrderDetailsActivity);
        if (A1o != null && (r0 = A1o.A00) != null && (r02 = r0.A01) != null && (str = r02.A04) != null) {
            C620933l r03 = p2mLiteOrderDetailsActivity.A0A;
            if (r03 != null) {
                C18270x1.A0l(C620933l.A00(r03), "has_p2mlite_transactions", true);
                C46782cC r04 = p2mLiteOrderDetailsActivity.A0K;
                if (r04 != null) {
                    C624034w A0G = r04.A02.A0G(str);
                    if (A0G == null || !A0G.A0M()) {
                        p2mLiteOrderDetailsActivity.A05.A0S(new C70223a9(p2mLiteOrderDetailsActivity, A1o, str));
                        return;
                    }
                    return;
                }
                throw C18270x1.A0S("paymentCheckoutOrderRepository");
            }
            throw C18270x1.A0S("paymentSharedPrefs");
        }
    }

    public /* synthetic */ C69943Zg(P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity) {
        this.A00 = p2mLiteOrderDetailsActivity;
    }
}
