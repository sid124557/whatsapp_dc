package androidx.lifecycle;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0GH;
import X.C08620em;
import X.C15910sA;
import X.C162457s7;
import X.C17280vG;

public final class SavedStateHandleAttacher implements C17280vG {
    public final C08620em A00;

    public void BcK(AnonymousClass0GH r4, C15910sA r5) {
        C162457s7.A0J(r5, 0);
        C162457s7.A0J(r4, 1);
        if (r4 == AnonymousClass0GH.ON_CREATE) {
            r5.getLifecycle().A01(this);
            C08620em r2 = this.A00;
            if (!r2.A01) {
                r2.A00 = r2.A02.A01("androidx.lifecycle.internal.SavedStateHandlesProvider");
                r2.A01 = true;
                r2.A01();
                return;
            }
            return;
        }
        throw AnonymousClass000.A0H(r4, "Next event must be ON_CREATE, it was ", AnonymousClass001.A0o());
    }

    public SavedStateHandleAttacher(C08620em r1) {
        this.A00 = r1;
    }
}
