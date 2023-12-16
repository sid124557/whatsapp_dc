package dagger.hilt.android.internal.managers;

import X.AnonymousClass0GH;
import X.C15910sA;
import X.C17280vG;
import X.C86674La;

public class ViewComponentManager$FragmentContextWrapper$1 implements C17280vG {
    public final /* synthetic */ C86674La A00;

    public ViewComponentManager$FragmentContextWrapper$1(C86674La r1) {
        this.A00 = r1;
    }

    public void BcK(AnonymousClass0GH r3, C15910sA r4) {
        if (r3 == AnonymousClass0GH.ON_DESTROY) {
            C86674La r1 = this.A00;
            r1.A02 = null;
            r1.A00 = null;
            r1.A01 = null;
        }
    }
}
