package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3Gl  reason: invalid class name and case insensitive filesystem */
public class C65163Gl implements AnonymousClass4FW {
    public final AnonymousClass4AP A00;
    public final C27991fJ A01;

    public final boolean A00(C624134x r3) {
        if (!(r3 instanceof C30391mN) || !r3.A1J.A02) {
            return false;
        }
        return this.A01.equals(((C30391mN) r3).A02);
    }

    public /* synthetic */ void BRi(C624134x r1) {
    }

    public /* synthetic */ void BVB(C95814uZ r1) {
    }

    public void BWS(C624134x r5, int i) {
        C27991fJ r3 = this.A01;
        AnonymousClass2z0 r1 = r5.A1J;
        C95814uZ r2 = r1.A00;
        if ((r3.equals(r2) && !r1.A02 && r5.A1I == 5) || A00(r5) || (r3.equals(r2) && r5.A1I == 92)) {
            this.A00.Bf0();
        }
    }

    public void BWU(C624134x r4, int i) {
        C27991fJ r2 = this.A01;
        C95814uZ r1 = r4.A1J.A00;
        if ((r2.equals(r1) && C627636p.A0H(r4.A1I) && i == 3) || A00(r4) || i == 30 || (r2.equals(r1) && r4.A1I == 92)) {
            this.A00.Bf0();
        }
    }

    public /* synthetic */ void BWW(C624134x r1) {
    }

    public /* synthetic */ void BWY(C624134x r1) {
    }

    public /* synthetic */ void BWf(C95814uZ r1) {
    }

    public void BWi(C95814uZ r4, Collection collection, boolean z) {
        if (collection != null && !collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (AnonymousClass2z0.A0E(C18300x5.A0T(it), this.A01)) {
                }
            }
            return;
        } else if (r4 == null || this.A01.equals(r4)) {
            this.A00.Bf0();
        } else {
            return;
        }
        this.A00.Bf0();
    }

    public /* synthetic */ void BWj(Collection collection) {
    }

    public /* synthetic */ void BX3(C95804uY r1) {
    }

    public /* synthetic */ void BX4(C624134x r1) {
    }

    public /* synthetic */ void BX6(C95804uY r1) {
    }

    public C65163Gl(AnonymousClass4AP r1, C27991fJ r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BWg(Collection collection, Map map) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C624134x A0T = C18300x5.A0T(it);
            if (AnonymousClass2z0.A0E(A0T, this.A01) && (C627636p.A0H(A0T.A1I) || A0T.A1F)) {
                this.A00.Bf0();
                return;
            } else if (A00(A0T)) {
                this.A00.Bf0();
            }
        }
    }

    public /* synthetic */ void BXI() {
    }

    public /* synthetic */ void BNb(C624134x r1, int i) {
    }

    public /* synthetic */ void BWX(C624134x r1, C624134x r2) {
    }

    public /* synthetic */ void BWe(Collection collection, int i) {
        C381525x.A00(this, collection, i);
    }

    public /* synthetic */ void BWh(C95814uZ r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void BX5(C95804uY r1, boolean z) {
    }

    public /* synthetic */ void BY8(C624134x r1, C624134x r2) {
    }

    public /* synthetic */ void BY9(C624134x r1, C624134x r2) {
    }
}
