package X;

import com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity;
import java.util.List;

/* renamed from: X.3aB  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70243aB implements Runnable {
    public final /* synthetic */ C624034w A00;
    public final /* synthetic */ P2mLiteOrderDetailsActivity A01;
    public final /* synthetic */ C30791n7 A02;

    public final void run() {
        boolean z;
        P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity = this.A01;
        C30791n7 r6 = this.A02;
        C624034w r4 = this.A00;
        p2mLiteOrderDetailsActivity.BjL();
        if (r4 != null) {
            z = r4.A0M();
        } else {
            z = false;
        }
        p2mLiteOrderDetailsActivity.A79(r6, !z);
        C197419d8 A75 = p2mLiteOrderDetailsActivity.A75();
        AnonymousClass9U0 r2 = p2mLiteOrderDetailsActivity.A75().A08;
        AnonymousClass213 r5 = AnonymousClass213.NONE;
        A75.A01(r5, r2.A01(p2mLiteOrderDetailsActivity, r4, r5, r6, (List) null));
    }

    public /* synthetic */ C70243aB(C624034w r1, P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity, C30791n7 r3) {
        this.A01 = p2mLiteOrderDetailsActivity;
        this.A02 = r3;
        this.A00 = r1;
    }
}
