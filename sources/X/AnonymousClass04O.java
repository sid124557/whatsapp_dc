package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.04O  reason: invalid class name */
public class AnonymousClass04O extends AnonymousClass0QK {
    public final /* synthetic */ C07530bB A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass04O(Context context, View view, C07890cz r12, C07530bB r13) {
        super(context, view, r12, R.attr.f3nameremoved, 0, true);
        this.A00 = r13;
        this.A00 = 8388613;
        AnonymousClass0b5 r1 = r13.A0N;
        this.A04 = r1;
        C07520bA r0 = this.A03;
        if (r0 != null) {
            r0.Bls(r1);
        }
    }

    public void A02() {
        C07530bB r1 = this.A00;
        C07890cz r0 = r1.A0A;
        if (r0 != null) {
            r0.close();
        }
        r1.A0H = null;
        super.A02();
    }
}
