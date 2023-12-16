package X;

import com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity;
import java.util.List;

/* renamed from: X.3aT  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70423aT implements Runnable {
    public final /* synthetic */ AnonymousClass2Oi A00;
    public final /* synthetic */ P2mLiteOrderDetailsActivity A01;
    public final /* synthetic */ C30791n7 A02;
    public final /* synthetic */ String A03;

    public final void run() {
        AnonymousClass2Oi r0 = this.A00;
        P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity = this.A01;
        String str = this.A03;
        C30791n7 r3 = this.A02;
        List list = ((C29491iu) r0).A01;
        if (list != null && list.size() > 0) {
            AnonymousClass36F r02 = p2mLiteOrderDetailsActivity.A07;
            if (r02 != null) {
                r02.A0h(list);
            } else {
                throw C18270x1.A0S("paymentTransactionStore");
            }
        }
        C46782cC r03 = p2mLiteOrderDetailsActivity.A0K;
        if (r03 != null) {
            C624034w A0G = r03.A02.A0G(str);
            p2mLiteOrderDetailsActivity.A74().A0Y(r3);
            p2mLiteOrderDetailsActivity.A05.A0S(new C70243aB(A0G, p2mLiteOrderDetailsActivity, r3));
            return;
        }
        throw C18270x1.A0S("paymentCheckoutOrderRepository");
    }

    public /* synthetic */ C70423aT(AnonymousClass2Oi r1, P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity, C30791n7 r3, String str) {
        this.A00 = r1;
        this.A01 = p2mLiteOrderDetailsActivity;
        this.A03 = str;
        this.A02 = r3;
    }
}
