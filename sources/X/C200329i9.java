package X;

import com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;

/* renamed from: X.9i9  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200329i9 implements Runnable {
    public final /* synthetic */ AnonymousClass39L A00;
    public final /* synthetic */ IndiaUpiCheckOrderDetailsActivity A01;

    public final void run() {
        IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = this.A01;
        AnonymousClass39L r2 = this.A00;
        indiaUpiCheckOrderDetailsActivity.A8R(false);
        if (indiaUpiCheckOrderDetailsActivity.A0E == null || !indiaUpiCheckOrderDetailsActivity.A0D.A0X(1916) || AnonymousClass9DC.A17(indiaUpiCheckOrderDetailsActivity)) {
            indiaUpiCheckOrderDetailsActivity.A8V(r2);
            return;
        }
        AnonymousClass39Q r1 = r2.A02;
        indiaUpiCheckOrderDetailsActivity.A09 = r1;
        indiaUpiCheckOrderDetailsActivity.A8Z(r1, (String) indiaUpiCheckOrderDetailsActivity.A0I.A00);
    }

    public /* synthetic */ C200329i9(AnonymousClass39L r1, IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity) {
        this.A01 = indiaUpiCheckOrderDetailsActivity;
        this.A00 = r1;
    }
}
