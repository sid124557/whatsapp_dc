package X;

import com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;

/* renamed from: X.9i6  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200299i6 implements Runnable {
    public final /* synthetic */ C202739mV A00;
    public final /* synthetic */ IndiaUpiCheckOrderDetailsActivity A01;

    public final void run() {
        AnonymousClass39W r0;
        IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = this.A01;
        C202739mV r3 = this.A00;
        C66543Lv r2 = indiaUpiCheckOrderDetailsActivity.A08;
        C30791n7 r22 = (C30791n7) r2.A2D.A05(indiaUpiCheckOrderDetailsActivity.A07.A09);
        if (r22 != null && (r0 = r22.A00) != null && r0.A01 != null) {
            indiaUpiCheckOrderDetailsActivity.A05.A0S(new C200339iA(r3, r22));
        }
    }

    public /* synthetic */ C200299i6(C202739mV r1, IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity) {
        this.A01 = indiaUpiCheckOrderDetailsActivity;
        this.A00 = r1;
    }
}
