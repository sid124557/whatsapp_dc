package X;

import android.view.View;
import android.view.animation.AnimationUtils;
import com.whatsapp.R;
import java.util.TreeSet;

/* renamed from: X.5kV  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C112865kV implements C1225964z {
    public final /* synthetic */ C117035rH A00;
    public final /* synthetic */ AnonymousClass5PZ A01;

    public final void BUI() {
        AnonymousClass5PZ r1 = this.A01;
        C117035rH r0 = this.A00;
        TreeSet treeSet = r1.A01;
        treeSet.remove(r0);
        while (!treeSet.isEmpty()) {
            C117035rH r12 = (C117035rH) treeSet.first();
            if (r12.A06()) {
                r12.A02();
                View A012 = r12.A01();
                if (A012 != null) {
                    A012.startAnimation(AnimationUtils.loadAnimation(A012.getContext(), R.anim.f0nameremoved));
                    return;
                }
                return;
            }
            treeSet.remove(r12);
        }
    }

    public /* synthetic */ C112865kV(C117035rH r1, AnonymousClass5PZ r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
