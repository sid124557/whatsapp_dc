package X;

import androidx.fragment.app.DialogFragment;
import com.whatsapp.LegacyMessageDialogFragment;
import com.whatsapp.R;
import com.whatsapp.support.DescribeProblemActivity;
import com.whatsapp.util.Log;

/* renamed from: X.5nL  reason: invalid class name and case insensitive filesystem */
public class C114625nL implements AnonymousClass4ER {
    public final /* synthetic */ C89654ea A00;
    public final /* synthetic */ DescribeProblemActivity A01;

    public C114625nL(C89654ea r1, DescribeProblemActivity describeProblemActivity) {
        this.A01 = describeProblemActivity;
        this.A00 = r1;
    }

    public void BOp() {
        Log.e("DescribeProblemActivity/contactSupport/onDeliveryFailure, falling back to email support.");
        this.A00.BjL();
        this.A01.A76();
    }

    public void BOq(int i) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("DescribeProblemActivity/contactSupport/onError/errorCode=");
        A0o.append(i);
        C18260x0.A1K(A0o, " falling back to email support.");
        this.A00.BjL();
        this.A01.A76();
    }

    public void BOr(C95814uZ r5) {
        C50472iE A002 = LegacyMessageDialogFragment.A00(AnonymousClass4L0.A0U(), R.string.f11nameremoved);
        A002.A01(new C1892590p(15), R.string.f11nameremoved);
        A002.A00 = 1;
        DialogFragment A003 = A002.A00();
        DescribeProblemActivity describeProblemActivity = this.A01;
        C18270x1.A0t(A003, describeProblemActivity);
        C89654ea r0 = this.A00;
        r0.BjL();
        describeProblemActivity.A6T(C627736r.A0O(r0, r5), true);
    }
}
