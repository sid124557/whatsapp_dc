package X;

import java.util.Arrays;

/* renamed from: X.6WB  reason: invalid class name */
public final class AnonymousClass6WB extends AnonymousClass6WD implements Cloneable {
    public int[] A00 = AnonymousClass79M.A01;
    public long[] A01;
    public long[] A02;
    public String[] A03;
    public String[] A04;

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0046, code lost:
        if (r1.length != 0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005b, code lost:
        if (r1.length != 0) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r4 = 1
            if (r6 == r5) goto L_0x0074
            boolean r0 = r6 instanceof X.AnonymousClass6WB
            r3 = 0
            if (r0 == 0) goto L_0x002d
            X.6WB r6 = (X.AnonymousClass6WB) r6
            java.lang.String[] r1 = r5.A03
            java.lang.String[] r0 = r6.A03
            boolean r0 = X.C159867mb.A00(r1, r0)
            if (r0 == 0) goto L_0x002d
            java.lang.String[] r1 = r5.A04
            java.lang.String[] r0 = r6.A04
            boolean r0 = X.C159867mb.A00(r1, r0)
            if (r0 == 0) goto L_0x002d
            int[] r2 = r5.A00
            int[] r1 = r6.A00
            if (r2 == 0) goto L_0x002e
            int r0 = r2.length
            if (r0 == 0) goto L_0x002e
            boolean r0 = java.util.Arrays.equals(r2, r1)
            if (r0 != 0) goto L_0x0033
        L_0x002d:
            return r3
        L_0x002e:
            if (r1 == 0) goto L_0x0033
            int r0 = r1.length
            if (r0 != 0) goto L_0x002d
        L_0x0033:
            long[] r2 = r5.A01
            long[] r1 = r6.A01
            if (r2 == 0) goto L_0x0043
            int r0 = r2.length
            if (r0 == 0) goto L_0x0043
            boolean r0 = java.util.Arrays.equals(r2, r1)
            if (r0 != 0) goto L_0x0048
            return r3
        L_0x0043:
            if (r1 == 0) goto L_0x0048
            int r0 = r1.length
            if (r0 != 0) goto L_0x002d
        L_0x0048:
            long[] r2 = r5.A02
            long[] r1 = r6.A02
            if (r2 == 0) goto L_0x0058
            int r0 = r2.length
            if (r0 == 0) goto L_0x0058
            boolean r0 = java.util.Arrays.equals(r2, r1)
            if (r0 != 0) goto L_0x005d
            return r3
        L_0x0058:
            if (r1 == 0) goto L_0x005d
            int r0 = r1.length
            if (r0 != 0) goto L_0x002d
        L_0x005d:
            X.8LR r1 = r5.A00
            if (r1 == 0) goto L_0x006c
            int r0 = r1.A00
            if (r0 == 0) goto L_0x006c
            X.8LR r0 = r6.A00
            boolean r0 = r1.equals(r0)
            return r0
        L_0x006c:
            X.8LR r0 = r6.A00
            if (r0 == 0) goto L_0x0074
            int r0 = r0.A00
            if (r0 != 0) goto L_0x002d
        L_0x0074:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6WB.equals(java.lang.Object):boolean");
    }

    public final void A04(C161777qQ r6) {
        String[] strArr = this.A03;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.A03;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    r6.A05(1, str);
                }
                i2++;
            }
        }
        String[] strArr3 = this.A04;
        if (strArr3 != null && strArr3.length > 0) {
            int i3 = 0;
            while (true) {
                String[] strArr4 = this.A04;
                if (i3 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i3];
                if (str2 != null) {
                    r6.A05(2, str2);
                }
                i3++;
            }
        }
        int[] iArr = this.A00;
        if (iArr != null && iArr.length > 0) {
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.A00;
                if (i4 >= iArr2.length) {
                    break;
                }
                int i5 = iArr2[i4];
                r6.A03(24);
                if (i5 >= 0) {
                    r6.A04(i5);
                } else {
                    r6.A07((long) i5);
                }
                i4++;
            }
        }
        long[] jArr = this.A01;
        if (jArr != null && jArr.length > 0) {
            int i6 = 0;
            while (true) {
                long[] jArr2 = this.A01;
                if (i6 >= jArr2.length) {
                    break;
                }
                long j = jArr2[i6];
                r6.A03(32);
                r6.A07(j);
                i6++;
            }
        }
        long[] jArr3 = this.A02;
        if (jArr3 != null && jArr3.length > 0) {
            while (true) {
                long[] jArr4 = this.A02;
                if (i >= jArr4.length) {
                    break;
                }
                long j2 = jArr4[i];
                r6.A03(40);
                r6.A07(j2);
                i++;
            }
        }
        super.A04(r6);
    }

    public final int hashCode() {
        int length;
        int length2;
        int i;
        int i2;
        int i3;
        int i4;
        int hashCode = (AnonymousClass6WB.class.getName().hashCode() + 527) * 31;
        String[] strArr = this.A03;
        if (strArr == null) {
            length = 0;
        } else {
            length = strArr.length;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            String str = strArr[i6];
            if (str != null) {
                i5 = AnonymousClass002.A02(str, i5 * 31);
            }
        }
        int i7 = (hashCode + i5) * 31;
        String[] strArr2 = this.A04;
        if (strArr2 == null) {
            length2 = 0;
        } else {
            length2 = strArr2.length;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < length2; i9++) {
            String str2 = strArr2[i9];
            if (str2 != null) {
                i8 = AnonymousClass002.A02(str2, i8 * 31);
            }
        }
        int i10 = (i7 + i8) * 31;
        int[] iArr = this.A00;
        if (iArr == null || iArr.length == 0) {
            i = 0;
        } else {
            i = Arrays.hashCode(iArr);
        }
        int i11 = (i10 + i) * 31;
        long[] jArr = this.A01;
        if (jArr == null || jArr.length == 0) {
            i2 = 0;
        } else {
            i2 = Arrays.hashCode(jArr);
        }
        int i12 = (i11 + i2) * 31;
        long[] jArr2 = this.A02;
        if (jArr2 == null || jArr2.length == 0) {
            i3 = 0;
        } else {
            i3 = Arrays.hashCode(jArr2);
        }
        int i13 = (i12 + i3) * 31;
        AnonymousClass8LR r1 = this.A00;
        if (r1 == null || r1.A00 == 0) {
            i4 = 0;
        } else {
            i4 = r1.hashCode();
        }
        return i13 + i4;
    }

    public AnonymousClass6WB() {
        String[] strArr = AnonymousClass79M.A03;
        this.A03 = strArr;
        this.A04 = strArr;
        long[] jArr = AnonymousClass79M.A02;
        this.A01 = jArr;
        this.A02 = jArr;
        this.A00 = null;
        this.A00 = -1;
    }

    public final int A02() {
        int length;
        int length2;
        int length3;
        int i;
        int A022 = super.A02();
        String[] strArr = this.A03;
        int i2 = 0;
        if (strArr != null && strArr.length > 0) {
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                String[] strArr2 = this.A03;
                if (i3 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i3];
                if (str != null) {
                    i5++;
                    int A012 = C161777qQ.A01(str);
                    i4 += AnonymousClass6C7.A00(A012) + A012;
                }
                i3++;
            }
            A022 = A022 + i4 + i5;
        }
        String[] strArr3 = this.A04;
        if (strArr3 != null && strArr3.length > 0) {
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                String[] strArr4 = this.A04;
                if (i6 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i6];
                if (str2 != null) {
                    i8++;
                    int A013 = C161777qQ.A01(str2);
                    i7 += AnonymousClass6C7.A00(A013) + A013;
                }
                i6++;
            }
            A022 = A022 + i7 + i8;
        }
        int[] iArr = this.A00;
        if (iArr != null && (length3 = iArr.length) > 0) {
            int i9 = 0;
            int i10 = 0;
            do {
                int i11 = iArr[i9];
                if (i11 >= 0) {
                    i = AnonymousClass6C7.A00(i11);
                } else {
                    i = 10;
                }
                i10 += i;
                i9++;
            } while (i9 < length3);
            A022 = A022 + i10 + length3;
        }
        long[] jArr = this.A01;
        if (jArr != null && (length2 = jArr.length) > 0) {
            int i12 = 0;
            int i13 = 0;
            do {
                i13 += C161777qQ.A00(jArr[i12]);
                i12++;
            } while (i12 < length2);
            A022 = A022 + i13 + length2;
        }
        long[] jArr2 = this.A02;
        if (jArr2 == null || (length = jArr2.length) <= 0) {
            return A022;
        }
        int i14 = 0;
        do {
            i14 += C161777qQ.A00(jArr2[i2]);
            i2++;
        } while (i2 < length);
        return A022 + i14 + length;
    }

    public final /* synthetic */ Object clone() {
        try {
            AnonymousClass6WB r2 = (AnonymousClass6WB) super.A05();
            String[] strArr = this.A03;
            if (strArr != null && strArr.length > 0) {
                r2.A03 = (String[]) strArr.clone();
            }
            String[] strArr2 = this.A04;
            if (strArr2 != null && strArr2.length > 0) {
                r2.A04 = (String[]) strArr2.clone();
            }
            int[] iArr = this.A00;
            if (iArr != null && iArr.length > 0) {
                r2.A00 = (int[]) iArr.clone();
            }
            long[] jArr = this.A01;
            if (jArr != null && jArr.length > 0) {
                r2.A01 = (long[]) jArr.clone();
            }
            long[] jArr2 = this.A02;
            if (jArr2 != null && jArr2.length > 0) {
                r2.A02 = (long[]) jArr2.clone();
            }
            return r2;
        } catch (CloneNotSupportedException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }
}
