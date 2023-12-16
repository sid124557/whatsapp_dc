package X;

import com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity;

/* renamed from: X.3aU  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70433aU implements Runnable {
    public final /* synthetic */ P2mLiteOrderDetailsActivity A00;
    public final /* synthetic */ C30791n7 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public final void run() {
        AnonymousClass39S r0;
        C30791n7 r5 = this.A01;
        String str = this.A02;
        P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity = this.A00;
        String str2 = this.A03;
        if (r5 != null) {
            AnonymousClass39W r02 = r5.A00;
            if (!(r02 == null || (r0 = r02.A01) == null)) {
                r0.A04 = str;
            }
            p2mLiteOrderDetailsActivity.A74().A0Y(r5);
        }
        if ("COMPLETED".equals(str2) || "SUCCESS".equals(str2)) {
            AnonymousClass303 A002 = C57062t0.A00();
            A002.A04("success_redirect", true);
            A002.A04("unsuccessful_redirect", false);
            A002.A03("transaction_status", "SUCCESS");
            p2mLiteOrderDetailsActivity.A76(A002, r5, (Integer) null, "api_event", "in_app_browser_checkout", 3);
        }
    }

    public /* synthetic */ C70433aU(P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity, C30791n7 r2, String str, String str2) {
        this.A01 = r2;
        this.A02 = str;
        this.A00 = p2mLiteOrderDetailsActivity;
        this.A03 = str2;
    }
}
