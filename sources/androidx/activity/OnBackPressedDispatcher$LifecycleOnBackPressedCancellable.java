package androidx.activity;

import X.AnonymousClass0GH;
import X.AnonymousClass0N7;
import X.AnonymousClass0O9;
import X.AnonymousClass0Ts;
import X.C07450at;
import X.C15510rU;
import X.C15910sA;
import X.C17280vG;

public class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements C15510rU, C17280vG {
    public C15510rU A00;
    public final AnonymousClass0N7 A01;
    public final AnonymousClass0O9 A02;
    public final /* synthetic */ AnonymousClass0Ts A03;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(AnonymousClass0N7 r1, AnonymousClass0Ts r2, AnonymousClass0O9 r3) {
        this.A03 = r2;
        this.A02 = r3;
        this.A01 = r1;
        r3.A00(this);
    }

    public void BcK(AnonymousClass0GH r5, C15910sA r6) {
        if (r5 == AnonymousClass0GH.ON_START) {
            AnonymousClass0Ts r3 = this.A03;
            AnonymousClass0N7 r2 = this.A01;
            r3.A01.add(r2);
            C07450at r1 = new C07450at(r2, r3);
            r2.A00.add(r1);
            this.A00 = r1;
        } else if (r5 == AnonymousClass0GH.ON_STOP) {
            C15510rU r0 = this.A00;
            if (r0 != null) {
                r0.cancel();
            }
        } else if (r5 == AnonymousClass0GH.ON_DESTROY) {
            cancel();
        }
    }

    public void cancel() {
        this.A02.A01(this);
        this.A01.A00.remove(this);
        C15510rU r0 = this.A00;
        if (r0 != null) {
            r0.cancel();
            this.A00 = null;
        }
    }
}
