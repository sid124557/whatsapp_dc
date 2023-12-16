package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.04N  reason: invalid class name */
public class AnonymousClass04N extends AnonymousClass0QK {
    public final /* synthetic */ C07530bB A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass04N(Context context, View view, AnonymousClass04J r12, C07530bB r13) {
        super(context, view, r12, R.attr.f3nameremoved, 0, false);
        this.A00 = r13;
        if ((((C07910d1) r12.getItem()).A02 & 32) != 32) {
            View view2 = r13.A0G;
            this.A01 = view2 == null ? (View) r13.A0C : view2;
        }
        AnonymousClass0b5 r1 = r13.A0N;
        this.A04 = r1;
        C07520bA r0 = this.A03;
        if (r0 != null) {
            r0.Bls(r1);
        }
    }

    public void A02() {
        C07530bB r1 = this.A00;
        r1.A0D = null;
        r1.A03 = 0;
        super.A02();
    }
}
