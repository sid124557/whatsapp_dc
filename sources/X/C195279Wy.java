package X;

import com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;

/* renamed from: X.9Wy  reason: invalid class name and case insensitive filesystem */
public class C195279Wy implements C202739mV {
    public Object A00;
    public final int A01;

    public C195279Wy(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BXR(AnonymousClass39S r4, C30791n7 r5) {
        if (this.A01 != 0) {
            C624034w r1 = (C624034w) this.A00;
            r4.A04 = r1.A0K;
            if (r1.A0M()) {
                r4.A03 = "captured";
                if (r1.A04() != null) {
                    r4.A01 = r1.A09;
                    return;
                }
                return;
            }
            return;
        }
        IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = (IndiaUpiCheckOrderDetailsActivity) this.A00;
        r4.A05 = true;
        if (!indiaUpiCheckOrderDetailsActivity.BIW()) {
            indiaUpiCheckOrderDetailsActivity.A05.A0S(new C200309i7(indiaUpiCheckOrderDetailsActivity, r5));
        }
    }
}
