package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.5m8  reason: invalid class name and case insensitive filesystem */
public class C113875m8 implements AnonymousClass4FW {
    public boolean A00;
    public final /* synthetic */ AnonymousClass51u A01;

    public C113875m8(AnonymousClass51u r1) {
        this.A01 = r1;
    }

    public /* synthetic */ void BNb(C624134x r1, int i) {
    }

    public /* synthetic */ void BWS(C624134x r1, int i) {
    }

    public void BWU(C624134x r4, int i) {
        if (r4 != null) {
            AnonymousClass2z0 r2 = r4.A1J;
            AnonymousClass51u r1 = this.A01;
            if (C86664Kz.A1X(r1.A06, r2) && !r2.A02) {
                C69263Wi r22 = r1.A0D;
                r22.A02.post(new C71713cY(this, r4, i, 22));
            }
        }
    }

    public /* synthetic */ void BWX(C624134x r1, C624134x r2) {
    }

    public void BWg(Collection collection, Map map) {
        AnonymousClass33C r0;
        AnonymousClass51u r5 = this.A01;
        C624134x r4 = r5.A06;
        AnonymousClass5LV A09 = r5.A09();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C624134x A0T = C18300x5.A0T(it);
            if (C86664Kz.A1X(r4, A0T.A1J)) {
                A09.A04.setVisibility(8);
                r4.A1N = true;
                if ((A0T instanceof C30471mV) && (r0 = ((C30471mV) A0T).A01) != null && !r0.A0R) {
                    r5.A0C();
                    return;
                }
                return;
            }
        }
    }

    public /* synthetic */ void BX5(C95804uY r1, boolean z) {
    }

    public /* synthetic */ void BXI() {
    }

    public /* synthetic */ void BY8(C624134x r1, C624134x r2) {
    }

    public /* synthetic */ void BY9(C624134x r1, C624134x r2) {
    }

    public /* synthetic */ void BRi(C624134x r1) {
    }

    public /* synthetic */ void BVB(C95814uZ r1) {
    }

    public /* synthetic */ void BWW(C624134x r1) {
    }

    public /* synthetic */ void BWY(C624134x r1) {
    }

    public /* synthetic */ void BWf(C95814uZ r1) {
    }

    public /* synthetic */ void BWj(Collection collection) {
    }

    public /* synthetic */ void BX3(C95804uY r1) {
    }

    public /* synthetic */ void BX4(C624134x r1) {
    }

    public /* synthetic */ void BX6(C95804uY r1) {
    }

    public /* synthetic */ void BWh(C95814uZ r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void BWi(C95814uZ r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void BWe(Collection collection, int i) {
        C381525x.A00(this, collection, i);
    }
}
