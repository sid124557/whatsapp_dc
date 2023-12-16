package androidx.lifecycle;

import X.AnonymousClass001;
import X.AnonymousClass0GH;
import X.C15910sA;
import X.C17280vG;
import X.C17290vH;

public class FullLifecycleObserverAdapter implements C17280vG {
    public final C17290vH A00;
    public final C17280vG A01;

    public FullLifecycleObserverAdapter(C17290vH r1, C17280vG r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void BcK(AnonymousClass0GH r2, C15910sA r3) {
        switch (r2.ordinal()) {
            case 2:
                this.A00.BaY(r3);
                break;
            case 3:
                this.A00.BXj(r3);
                break;
            case 4:
                this.A00.Bcn(r3);
                break;
            case 5:
                this.A00.BQu(r3);
                break;
            case 6:
                throw AnonymousClass001.A0c("ON_ANY must not been send by anybody");
        }
        C17280vG r0 = this.A01;
        if (r0 != null) {
            r0.BcK(r2, r3);
        }
    }
}
