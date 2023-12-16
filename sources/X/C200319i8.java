package X;

import com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;

/* renamed from: X.9i8  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200319i8 implements Runnable {
    public final /* synthetic */ C202739mV A00;
    public final /* synthetic */ IndiaUpiCheckOrderDetailsActivity A01;

    public final void run() {
        AnonymousClass39W r0;
        AnonymousClass39S r02;
        IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = this.A01;
        C202739mV r3 = this.A00;
        C66543Lv r2 = indiaUpiCheckOrderDetailsActivity.A08;
        C30791n7 r1 = (C30791n7) r2.A2D.A05(indiaUpiCheckOrderDetailsActivity.A07.A09);
        if (r1 != null && (r0 = r1.A00) != null && (r02 = r0.A01) != null) {
            r3.BXR(r02, r1);
            indiaUpiCheckOrderDetailsActivity.A08.A0Y(r1);
        }
    }

    public /* synthetic */ C200319i8(C202739mV r1, IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity) {
        this.A01 = indiaUpiCheckOrderDetailsActivity;
        this.A00 = r1;
    }
}
