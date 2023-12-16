package X;

import java.io.IOException;

/* renamed from: X.87w  reason: invalid class name and case insensitive filesystem */
public final class C1690787w implements AnonymousClass4F1, C178068gu {
    public C156317gQ A00;
    public C159017kx A01;
    public final Object A02;
    public final /* synthetic */ AnonymousClass6PJ A03;

    public C1690787w(AnonymousClass6PJ r5, Object obj) {
        this.A03 = r5;
        this.A01 = new C159017kx((AnonymousClass6PS) null, r5.A03.A02, 0);
        this.A00 = new C156317gQ((AnonymousClass6PS) null, r5.A02.A02, 0);
        this.A02 = obj;
    }

    public final AnonymousClass7P1 A00(AnonymousClass7P1 r11) {
        long j = r11.A04;
        long j2 = r11.A03;
        if (j == j && j2 == j2) {
            return r11;
        }
        int i = r11.A00;
        int i2 = r11.A02;
        return new AnonymousClass7P1(r11.A05, r11.A06, i, i2, r11.A01, j, j2);
    }

    public final boolean A01(AnonymousClass6PS r4, int i) {
        if (r4 != null) {
            AnonymousClass6PJ r2 = this.A03;
            Object obj = this.A02;
            if (!(r2 instanceof AnonymousClass6PO)) {
                if (r2 instanceof AnonymousClass6PN) {
                    Object obj2 = r4.A04;
                    Object obj3 = ((AnonymousClass6PN) r2).A01.A00;
                    if (obj3 != null && obj3.equals(obj2)) {
                        obj2 = AnonymousClass6PR.A02;
                    }
                    r4 = r4.A00(obj2);
                } else if (r2 instanceof AnonymousClass6PM) {
                    AnonymousClass6PM r22 = (AnonymousClass6PM) r2;
                    if (r22.A00 != Integer.MAX_VALUE) {
                        r4 = (AnonymousClass6PS) r22.A02.get(r4);
                    }
                }
                if (r4 == null) {
                    return false;
                }
            } else if (((Number) obj).intValue() != 0) {
                return false;
            }
        } else {
            r4 = null;
        }
        AnonymousClass6PJ r23 = this.A03;
        C159017kx r1 = this.A01;
        if (r1.A00 != i || !C162387ry.A0D(r1.A01, r4)) {
            this.A01 = new C159017kx(r4, r23.A03.A02, i);
        }
        C156317gQ r12 = this.A00;
        if (r12.A00 == i && C162387ry.A0D(r12.A01, r4)) {
            return true;
        }
        this.A00 = new C156317gQ(r4, r23.A02.A02, i);
        return true;
    }

    public void BRc(AnonymousClass7P1 r3, AnonymousClass6PS r4, int i) {
        if (A01(r4, i)) {
            this.A01.A06(A00(r3));
        }
    }

    public void BVJ(C156527gm r3, AnonymousClass7P1 r4, AnonymousClass6PS r5, int i) {
        if (A01(r5, i)) {
            this.A01.A02(r3, A00(r4));
        }
    }

    public void BVN(C156527gm r3, AnonymousClass7P1 r4, AnonymousClass6PS r5, int i) {
        if (A01(r5, i)) {
            this.A01.A03(r3, A00(r4));
        }
    }

    public void BVS(C156527gm r3, AnonymousClass7P1 r4, AnonymousClass6PS r5, IOException iOException, int i, boolean z) {
        if (A01(r5, i)) {
            this.A01.A05(r3, A00(r4), iOException, z);
        }
    }

    public void BVa(C156527gm r3, AnonymousClass7P1 r4, AnonymousClass6PS r5, int i) {
        if (A01(r5, i)) {
            this.A01.A04(r3, A00(r4));
        }
    }
}
