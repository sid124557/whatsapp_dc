package X;

import com.whatsapp.payments.ui.BrazilOrderDetailsActivity;

/* renamed from: X.9hz  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200229hz implements Runnable {
    public final /* synthetic */ BrazilOrderDetailsActivity A00;
    public final /* synthetic */ String A01;

    public final void run() {
        AnonymousClass39W r0;
        AnonymousClass39S r02;
        BrazilOrderDetailsActivity brazilOrderDetailsActivity = this.A00;
        String str = this.A01;
        C66543Lv r03 = brazilOrderDetailsActivity.A08;
        C30791n7 r1 = (C30791n7) r03.A2D.A05(brazilOrderDetailsActivity.A0H);
        if (r1 != null && (r0 = r1.A00) != null && (r02 = r0.A01) != null) {
            r02.A04 = str;
            brazilOrderDetailsActivity.A08.A0Y(r1);
        }
    }

    public /* synthetic */ C200229hz(BrazilOrderDetailsActivity brazilOrderDetailsActivity, String str) {
        this.A00 = brazilOrderDetailsActivity;
        this.A01 = str;
    }
}
