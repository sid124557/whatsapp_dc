package androidx.activity;

import X.AnonymousClass0GH;
import X.C004805c;
import X.C15910sA;
import X.C17280vG;

public class ComponentActivity$4 implements C17280vG {
    public final /* synthetic */ C004805c A00;

    public ComponentActivity$4(C004805c r1) {
        this.A00 = r1;
    }

    public void BcK(AnonymousClass0GH r4, C15910sA r5) {
        if (r4 == AnonymousClass0GH.ON_DESTROY) {
            C004805c r2 = this.A00;
            r2.A03.A01 = null;
            if (!r2.isChangingConfigurations()) {
                r2.BEL().A00();
            }
        }
    }
}
