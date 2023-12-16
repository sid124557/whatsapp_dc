package androidx.lifecycle;

import X.AnonymousClass08A;
import X.AnonymousClass0GC;
import X.AnonymousClass0GH;
import X.AnonymousClass0O9;
import X.AnonymousClass20D;
import X.AnonymousClass2AI;
import X.AnonymousClass34M;
import X.C13770ni;
import X.C15910sA;
import X.C162457s7;
import X.C17280vG;
import X.C616131n;
import X.C84814Du;
import X.C85474Gj;
import X.C85494Gl;

public final class LifecycleCoroutineScopeImpl extends C13770ni implements C17280vG {
    public final AnonymousClass0O9 A00;
    public final C85494Gl A01;

    public LifecycleCoroutineScopeImpl(AnonymousClass0O9 r3, C85494Gl r4) {
        C162457s7.A0J(r4, 2);
        this.A00 = r3;
        this.A01 = r4;
        if (((AnonymousClass08A) r3).A02 == AnonymousClass0GC.DESTROYED) {
            AnonymousClass2AI.A00(B61());
        }
    }

    public AnonymousClass0O9 A00() {
        return this.A00;
    }

    public C85494Gl B61() {
        return this.A01;
    }

    public void BcK(AnonymousClass0GH r4, C15910sA r5) {
        AnonymousClass0O9 r2 = this.A00;
        if (((AnonymousClass08A) r2).A02.compareTo(AnonymousClass0GC.DESTROYED) <= 0) {
            r2.A01(this);
            AnonymousClass2AI.A00(B61());
        }
    }

    public final void A01() {
        C85474Gj unused = C616131n.A02(AnonymousClass34M.A01().A04(), new LifecycleCoroutineScopeImpl$register$1(this, (C84814Du) null), this, (AnonymousClass20D) null, 2);
    }
}
