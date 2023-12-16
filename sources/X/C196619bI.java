package X;

import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiVpaContactInfoActivity;

/* renamed from: X.9bI  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C196619bI implements C202479m5 {
    public final /* synthetic */ IndiaUpiVpaContactInfoActivity A00;
    public final /* synthetic */ boolean A01;

    public final void BaJ(AnonymousClass34V r3) {
        IndiaUpiVpaContactInfoActivity indiaUpiVpaContactInfoActivity = this.A00;
        boolean z = this.A01;
        if (r3 == null) {
            indiaUpiVpaContactInfoActivity.A6k(z);
        } else if (z) {
            indiaUpiVpaContactInfoActivity.Bot(R.string.f11nameremoved);
        } else {
            C1899693i.A0p(indiaUpiVpaContactInfoActivity, R.string.f11nameremoved);
        }
    }

    public /* synthetic */ C196619bI(IndiaUpiVpaContactInfoActivity indiaUpiVpaContactInfoActivity, boolean z) {
        this.A00 = indiaUpiVpaContactInfoActivity;
        this.A01 = z;
    }
}
