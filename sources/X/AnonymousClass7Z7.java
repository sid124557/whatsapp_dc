package X;

/* renamed from: X.7Z7  reason: invalid class name */
public final class AnonymousClass7Z7 {
    public C160357nV A00;
    public C161347pT A01;
    public boolean A02;
    public final AnonymousClass8LQ A03;

    public final int A00(int i, int i2, int i3) {
        boolean A032;
        boolean z = this.A02;
        AnonymousClass8LQ r0 = this.A03;
        if (z) {
            A032 = r0.A03(i2, i);
        } else {
            A032 = r0.A03(i, i2);
        }
        int i4 = i3 << 1;
        if (A032) {
            return i4 | 1;
        }
        return i4;
    }

    public C160357nV A01() {
        C160357nV r0 = this.A00;
        if (r0 == null) {
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < 6; i3++) {
                i2 = A00(i3, 8, i2);
            }
            int A002 = A00(8, 7, A00(8, 8, A00(7, 8, i2)));
            int i4 = 5;
            do {
                A002 = A00(8, i4, A002);
                i4--;
            } while (i4 >= 0);
            int i5 = this.A03.A00;
            int i6 = i5 - 7;
            for (int i7 = i5 - 1; i7 >= i6; i7--) {
                i = A00(8, i7, i);
            }
            for (int i8 = i5 - 8; i8 < i5; i8++) {
                i = A00(i8, 8, i);
            }
            r0 = C160357nV.A00(A002, i);
            if (r0 == null) {
                r0 = C160357nV.A00(A002 ^ 21522, i ^ 21522);
            }
            this.A00 = r0;
            if (r0 == null) {
                throw C130946cn.A00();
            }
        }
        return r0;
    }

    public C161347pT A02() {
        int i;
        C161347pT r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        int i2 = this.A03.A00;
        int i3 = (i2 - 17) / 4;
        if (i3 <= 6) {
            return C161347pT.A03(i3);
        }
        int i4 = i2 - 11;
        int i5 = 5;
        int i6 = 0;
        int i7 = 5;
        int i8 = 0;
        do {
            int i9 = i2 - 9;
            i = i9;
            while (i9 >= i4) {
                i8 = A00(i9, i7, i8);
                i9--;
            }
            i7--;
        } while (i7 >= 0);
        C161347pT A022 = C161347pT.A02(i8);
        if (A022 == null || (A022.A01 * 4) + 17 != i2) {
            do {
                for (int i10 = i; i10 >= i4; i10--) {
                    i6 = A00(i5, i10, i6);
                }
                i5--;
            } while (i5 >= 0);
            A022 = C161347pT.A02(i6);
            if (A022 == null || (A022.A01 * 4) + 17 != i2) {
                throw C130946cn.A00();
            }
        }
        this.A01 = A022;
        return A022;
    }

    public AnonymousClass7Z7(AnonymousClass8LQ r3) {
        int i = r3.A00;
        if (i < 21 || (i & 3) != 1) {
            throw C130946cn.A00();
        }
        this.A03 = r3;
    }
}
