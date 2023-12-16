package X;

import com.whatsapp.payments.ui.GlobalPaymentOrderDetailsActivity;
import java.util.List;

/* renamed from: X.3Zc  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C69913Zc implements Runnable {
    public final /* synthetic */ GlobalPaymentOrderDetailsActivity A00;

    public final void run() {
        AnonymousClass39W r0;
        AnonymousClass39S r02;
        GlobalPaymentOrderDetailsActivity globalPaymentOrderDetailsActivity = this.A00;
        C66543Lv r1 = globalPaymentOrderDetailsActivity.A04;
        if (r1 != null) {
            C30791n7 r3 = (C30791n7) C55832qz.A00(r1, globalPaymentOrderDetailsActivity.A74().A09);
            List list = null;
            if (!(r3 == null || (r0 = r3.A00) == null || (r02 = r0.A01) == null)) {
                list = r02.A0H;
            }
            globalPaymentOrderDetailsActivity.A0L = list;
            C55942rA r2 = globalPaymentOrderDetailsActivity.A0J;
            if (r2 != null) {
                C162457s7.A0K(r3, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageInteractive");
                r2.A02(r3, (Integer) null, (String) null, (List) null, 4, false, true, true);
                return;
            }
            throw C18270x1.A0S("orderDetailsMessageLogging");
        }
        throw C18270x1.A0S("coreMessageStore");
    }

    public /* synthetic */ C69913Zc(GlobalPaymentOrderDetailsActivity globalPaymentOrderDetailsActivity) {
        this.A00 = globalPaymentOrderDetailsActivity;
    }
}
