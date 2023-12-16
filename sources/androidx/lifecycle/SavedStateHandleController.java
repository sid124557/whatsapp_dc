package androidx.lifecycle;

import X.AnonymousClass001;
import X.AnonymousClass0GH;
import X.AnonymousClass0O9;
import X.AnonymousClass0UG;
import X.AnonymousClass0XV;
import X.C15910sA;
import X.C17280vG;

public final class SavedStateHandleController implements C17280vG {
    public boolean A00 = false;
    public final AnonymousClass0XV A01;
    public final String A02;

    public void A00(AnonymousClass0O9 r3, AnonymousClass0UG r4) {
        if (!this.A00) {
            this.A00 = true;
            r3.A00(this);
            r4.A04(this.A01.A00, this.A02);
            return;
        }
        throw AnonymousClass001.A0e("Already attached to lifecycleOwner");
    }

    public void BcK(AnonymousClass0GH r2, C15910sA r3) {
        if (r2 == AnonymousClass0GH.ON_DESTROY) {
            this.A00 = false;
            r3.getLifecycle().A01(this);
        }
    }

    public SavedStateHandleController(AnonymousClass0XV r2, String str) {
        this.A02 = str;
        this.A01 = r2;
    }
}
