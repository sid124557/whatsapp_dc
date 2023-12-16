package androidx.fragment.app;

import X.AnonymousClass0GH;
import X.C08310eF;
import X.C15910sA;
import X.C17280vG;
import android.view.View;

public class Fragment$6 implements C17280vG {
    public final /* synthetic */ C08310eF A00;

    public Fragment$6(C08310eF r1) {
        this.A00 = r1;
    }

    public void BcK(AnonymousClass0GH r2, C15910sA r3) {
        View view;
        if (r2 == AnonymousClass0GH.ON_STOP && (view = this.A00.A0B) != null) {
            view.cancelPendingInputEvents();
        }
    }
}
