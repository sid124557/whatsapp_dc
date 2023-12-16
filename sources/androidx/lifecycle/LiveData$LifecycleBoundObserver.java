package androidx.lifecycle;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass08A;
import X.AnonymousClass0GC;
import X.AnonymousClass0GH;
import X.AnonymousClass0QG;
import X.C06270Wx;
import X.C15910sA;
import X.C15930sC;
import X.C17280vG;

public class LiveData$LifecycleBoundObserver extends AnonymousClass0QG implements C17280vG {
    public final C15910sA A00;
    public final /* synthetic */ C06270Wx A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveData$LifecycleBoundObserver(C15910sA r1, C06270Wx r2, C15930sC r3) {
        super(r2, r3);
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A00() {
        this.A00.getLifecycle().A01(this);
    }

    public boolean A02() {
        return AnonymousClass001.A1U(((AnonymousClass08A) this.A00.getLifecycle()).A02.compareTo(AnonymousClass0GC.STARTED));
    }

    public boolean A03(C15910sA r2) {
        return AnonymousClass000.A1Y(this.A00, r2);
    }

    public void BcK(AnonymousClass0GH r5, C15910sA r6) {
        C15910sA r2 = this.A00;
        AnonymousClass0GC r1 = ((AnonymousClass08A) r2.getLifecycle()).A02;
        AnonymousClass0GC r3 = r1;
        if (r1 == AnonymousClass0GC.DESTROYED) {
            this.A01.A0F(this.A02);
            return;
        }
        AnonymousClass0GC r0 = null;
        while (r0 != r1) {
            A01(A02());
            r1 = ((AnonymousClass08A) r2.getLifecycle()).A02;
            r0 = r3;
            r3 = r1;
        }
    }
}
