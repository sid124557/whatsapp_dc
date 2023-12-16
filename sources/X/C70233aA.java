package X;

import com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity;
import java.util.List;

/* renamed from: X.3aA  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70233aA implements Runnable {
    public final /* synthetic */ P2mLiteOrderDetailsActivity A00;
    public final /* synthetic */ AnonymousClass213 A01;
    public final /* synthetic */ AnonymousClass9QL A02;

    public final void run() {
        Integer num;
        AnonymousClass39W r0;
        AnonymousClass39S r02;
        AnonymousClass39W r03;
        AnonymousClass39S r04;
        P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity = this.A00;
        AnonymousClass213 r4 = this.A01;
        AnonymousClass9QL r3 = this.A02;
        C30791n7 A1o = AnonymousClass1Ha.A1o(p2mLiteOrderDetailsActivity);
        List list = null;
        if (A1o == null || (r03 = A1o.A00) == null || (r04 = r03.A01) == null) {
            num = null;
        } else {
            num = Integer.valueOf(r04.A02());
        }
        p2mLiteOrderDetailsActivity.A0S = num;
        if (!(A1o == null || (r0 = A1o.A00) == null || (r02 = r0.A01) == null)) {
            list = r02.A0H;
        }
        p2mLiteOrderDetailsActivity.A0U = list;
        p2mLiteOrderDetailsActivity.runOnUiThread(new C70413aS(p2mLiteOrderDetailsActivity, r4, r3, A1o));
    }

    public /* synthetic */ C70233aA(P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity, AnonymousClass213 r2, AnonymousClass9QL r3) {
        this.A00 = p2mLiteOrderDetailsActivity;
        this.A01 = r2;
        this.A02 = r3;
    }
}
