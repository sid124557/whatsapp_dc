package X;

import android.util.Pair;
import java.io.IOException;
import java.util.List;

/* renamed from: X.87v  reason: invalid class name and case insensitive filesystem */
public final class C1690687v implements AnonymousClass4F1, C178068gu {
    public C156317gQ A00;
    public C159017kx A01;
    public final C1685385u A02;
    public final /* synthetic */ C153507bR A03;

    public C1690687v(C1685385u r2, C153507bR r3) {
        this.A03 = r3;
        this.A01 = r3.A05;
        this.A00 = r3.A04;
        this.A02 = r2;
    }

    public final boolean A00(AnonymousClass6PS r8, int i) {
        AnonymousClass6PS r2;
        if (r8 != null) {
            C1685385u r6 = this.A02;
            int i2 = 0;
            while (true) {
                List list = r6.A04;
                if (i2 >= list.size()) {
                    return false;
                }
                if (((C158567kB) list.get(i2)).A03 == r8.A03) {
                    r2 = r8.A00(Pair.create(r6.A03, r8.A04));
                    break;
                }
                i2++;
            }
        } else {
            r2 = null;
        }
        int i3 = i + this.A02.A00;
        C159017kx r1 = this.A01;
        if (r1.A00 != i3 || !C162387ry.A0D(r1.A01, r2)) {
            this.A01 = new C159017kx(r2, this.A03.A05.A02, i3);
        }
        C156317gQ r12 = this.A00;
        if (r12.A00 == i3 && C162387ry.A0D(r12.A01, r2)) {
            return true;
        }
        this.A00 = new C156317gQ(r2, this.A03.A04.A02, i3);
        return true;
    }

    public void BRc(AnonymousClass7P1 r2, AnonymousClass6PS r3, int i) {
        if (A00(r3, i)) {
            this.A01.A06(r2);
        }
    }

    public void BVJ(C156527gm r2, AnonymousClass7P1 r3, AnonymousClass6PS r4, int i) {
        if (A00(r4, i)) {
            this.A01.A02(r2, r3);
        }
    }

    public void BVN(C156527gm r2, AnonymousClass7P1 r3, AnonymousClass6PS r4, int i) {
        if (A00(r4, i)) {
            this.A01.A03(r2, r3);
        }
    }

    public void BVS(C156527gm r2, AnonymousClass7P1 r3, AnonymousClass6PS r4, IOException iOException, int i, boolean z) {
        if (A00(r4, i)) {
            this.A01.A05(r2, r3, iOException, z);
        }
    }

    public void BVa(C156527gm r2, AnonymousClass7P1 r3, AnonymousClass6PS r4, int i) {
        if (A00(r4, i)) {
            this.A01.A04(r2, r3);
        }
    }
}
