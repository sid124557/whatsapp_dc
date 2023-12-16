package androidx.core.view;

import X.AnonymousClass001;
import X.AnonymousClass0GC;
import X.AnonymousClass0GH;
import X.AnonymousClass0NQ;
import X.C14960qY;
import X.C15910sA;
import X.C17280vG;

public final /* synthetic */ class MenuHostHelper$$ExternalSyntheticLambda1 implements C17280vG {
    public final /* synthetic */ AnonymousClass0NQ A00;
    public final /* synthetic */ C14960qY A01;
    public final /* synthetic */ AnonymousClass0GC A02;

    public final void BcK(AnonymousClass0GH r6, C15910sA r7) {
        AnonymousClass0GH r0;
        AnonymousClass0NQ r4 = this.A00;
        AnonymousClass0GC r3 = this.A02;
        C14960qY r2 = this.A01;
        int ordinal = r3.ordinal();
        if (ordinal == 2) {
            r0 = AnonymousClass0GH.ON_CREATE;
        } else if (ordinal == 3) {
            r0 = AnonymousClass0GH.ON_START;
        } else if (ordinal != 4) {
            r0 = null;
        } else {
            r0 = AnonymousClass0GH.ON_RESUME;
        }
        if (r6 == r0) {
            r4.A02.add(r2);
        } else if (r6 == AnonymousClass0GH.ON_DESTROY) {
            r4.A02.remove(r2);
            AnonymousClass001.A1J(r2, r4.A01);
        } else if (r6 == AnonymousClass0GH.A00(r3)) {
            r4.A02.remove(r2);
        } else {
            return;
        }
        r4.A00.run();
    }

    public /* synthetic */ MenuHostHelper$$ExternalSyntheticLambda1(AnonymousClass0NQ r1, C14960qY r2, AnonymousClass0GC r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
