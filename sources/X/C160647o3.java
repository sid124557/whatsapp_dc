package X;

import java.util.Arrays;

/* renamed from: X.7o3  reason: invalid class name and case insensitive filesystem */
public final class C160647o3 {
    public static final C160647o3 A05 = new C160647o3(new int[0], new Object[0], 0, false);
    public int A00;
    public int A01;
    public boolean A02;
    public int[] A03;
    public Object[] A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof C160647o3)) {
                C160647o3 r9 = (C160647o3) obj;
                int i = this.A00;
                if (i == r9.A00) {
                    int[] iArr = this.A03;
                    int[] iArr2 = r9.A03;
                    int i2 = 0;
                    while (true) {
                        if (i2 < i) {
                            if (iArr[i2] != iArr2[i2]) {
                                break;
                            }
                            i2++;
                        } else {
                            Object[] objArr = this.A04;
                            Object[] objArr2 = r9.A04;
                            int i3 = 0;
                            while (i3 < i) {
                                if (objArr[i3].equals(objArr2[i3])) {
                                    i3++;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int A00() {
        int i;
        int i2;
        int i3;
        int i4 = this.A01;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.A00; i6++) {
            int i7 = this.A03[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 == 0) {
                long A0B = C18310x6.A0B(this.A04[i6]);
                i = C150347Qg.A02(i8);
                i2 = C128346Vs.A01(A0B);
                i3 = i + i2;
            } else if (i9 != 1) {
                if (i9 == 2) {
                    i = C150347Qg.A02(i8);
                    int A022 = ((C172528Lo) this.A04[i6]).A02();
                    i2 = AnonymousClass6C7.A00(A022) + A022;
                } else if (i9 == 3) {
                    i = C150347Qg.A02(i8) << 1;
                    i2 = ((C160647o3) this.A04[i6]).A00();
                } else if (i9 == 5) {
                    i3 = C150347Qg.A02(i8) + 4;
                } else {
                    throw new IllegalStateException(new AnonymousClass6W1());
                }
                i3 = i + i2;
            } else {
                i3 = C150347Qg.A02(i8) + 8;
            }
            i5 += i3;
        }
        this.A01 = i5;
        return i5;
    }

    public final void A01(int i, Object obj) {
        if (this.A02) {
            int i2 = this.A00;
            int[] iArr = this.A03;
            if (i2 == iArr.length) {
                int i3 = i2 >> 1;
                if (i2 < 4) {
                    i3 = 8;
                }
                int i4 = i2 + i3;
                this.A03 = Arrays.copyOf(iArr, i4);
                this.A04 = Arrays.copyOf(this.A04, i4);
            }
            int[] iArr2 = this.A03;
            int i5 = this.A00;
            iArr2[i5] = i;
            this.A04[i5] = obj;
            this.A00 = i5 + 1;
            return;
        }
        throw C18320x8.A0m();
    }

    public final void A02(C181018m0 r7) {
        if (this.A00 != 0) {
            for (int i = 0; i < this.A00; i++) {
                int i2 = this.A03[i];
                Object obj = this.A04[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    C150347Qg.A07(((C169658Ad) r7).A00, i3, C18310x6.A0B(obj));
                } else if (i4 == 1) {
                    ((C169658Ad) r7).A00.A07(i3, C18310x6.A0B(obj));
                } else if (i4 == 2) {
                    ((C169658Ad) r7).A00.A0B((C172528Lo) obj, i3);
                } else if (i4 == 3) {
                    C128346Vs r2 = ((C169658Ad) r7).A00;
                    int i5 = i3 << 3;
                    r2.A03(i5 | 3);
                    ((C160647o3) obj).A02(r7);
                    r2.A03(i5 | 4);
                } else if (i4 == 5) {
                    ((C169658Ad) r7).A00.A06(i3, AnonymousClass001.A0K(obj));
                } else {
                    throw C18330xA.A09(new AnonymousClass6W1());
                }
            }
        }
    }

    public final int hashCode() {
        int i = this.A00;
        int i2 = (i + 527) * 31;
        int[] iArr = this.A03;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.A04;
        for (int i7 = 0; i7 < i; i7++) {
            i3 = AnonymousClass002.A02(objArr[i7], i3 * 31);
        }
        return i6 + i3;
    }

    public C160647o3(int[] iArr, Object[] objArr, int i, boolean z) {
        this.A01 = -1;
        this.A00 = i;
        this.A03 = iArr;
        this.A04 = objArr;
        this.A02 = z;
    }

    public C160647o3() {
        this(new int[8], new Object[8], 0, true);
    }
}
