package X;

/* renamed from: X.0Qd  reason: invalid class name and case insensitive filesystem */
public class C04660Qd {
    public final C10550i7 A00 = new C10550i7();
    public final C06290Wz A01 = new C06290Wz();

    public final AnonymousClass0NE A00(C05570Ua r7, int i) {
        AnonymousClass0TA r3;
        AnonymousClass0NE r1;
        C06290Wz r5 = this.A01;
        int A06 = r5.A06(r7, r7.hashCode());
        if (A06 >= 0 && (r3 = (AnonymousClass0TA) C06290Wz.A00(r5, A06)) != null) {
            int i2 = r3.A00;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                r3.A00 = i3;
                if (i == 4) {
                    r1 = r3.A02;
                } else if (i == 8) {
                    r1 = r3.A01;
                } else {
                    throw AnonymousClass001.A0c("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    r5.A07(A06);
                    r3.A00 = 0;
                    r3.A02 = null;
                    r3.A01 = null;
                    AnonymousClass0TA.A03.Bio(r3);
                }
                return r1;
            }
        }
        return null;
    }

    public void A01(C05570Ua r3) {
        AnonymousClass0TA r1 = (AnonymousClass0TA) this.A01.get(r3);
        if (r1 != null) {
            r1.A00 &= -2;
        }
    }

    public void A02(C05570Ua r6) {
        C10550i7 r4 = this.A00;
        int A012 = r4.A01();
        while (true) {
            A012--;
            if (A012 < 0) {
                break;
            } else if (r6 == r4.A04(A012)) {
                Object[] objArr = r4.A03;
                Object obj = objArr[A012];
                Object obj2 = C10550i7.A04;
                if (obj != obj2) {
                    objArr[A012] = obj2;
                    r4.A01 = true;
                }
            }
        }
        AnonymousClass0TA r1 = (AnonymousClass0TA) this.A01.remove(r6);
        if (r1 != null) {
            r1.A00 = 0;
            r1.A02 = null;
            r1.A01 = null;
            AnonymousClass0TA.A03.Bio(r1);
        }
    }
}
