package androidx.core.view;

import X.AnonymousClass001;
import X.AnonymousClass0GH;
import X.AnonymousClass0NQ;
import X.C14960qY;
import X.C15910sA;
import X.C17280vG;

public final /* synthetic */ class MenuHostHelper$$ExternalSyntheticLambda0 implements C17280vG {
    public final /* synthetic */ AnonymousClass0NQ A00;
    public final /* synthetic */ C14960qY A01;

    public final void BcK(AnonymousClass0GH r4, C15910sA r5) {
        AnonymousClass0NQ r2 = this.A00;
        C14960qY r1 = this.A01;
        if (r4 == AnonymousClass0GH.ON_DESTROY) {
            r2.A02.remove(r1);
            AnonymousClass001.A1J(r1, r2.A01);
            r2.A00.run();
        }
    }

    public /* synthetic */ MenuHostHelper$$ExternalSyntheticLambda0(AnonymousClass0NQ r1, C14960qY r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
