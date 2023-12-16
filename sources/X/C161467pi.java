package X;

import java.util.Arrays;

/* renamed from: X.7pi  reason: invalid class name and case insensitive filesystem */
public final class C161467pi {
    public int A00;
    public int A01;
    public byte[] A02;

    public static void A06(C187648xa r2, C161467pi r3, int i) {
        r2.Bgd(r3.A02, 0, i);
    }

    public String A0L() {
        int i = this.A00;
        int i2 = this.A01;
        if (i - i2 == 0) {
            return null;
        }
        int i3 = i2;
        while (i3 < i && this.A02[i3] != 0) {
            i3++;
        }
        String A0W = AnonymousClass6CA.A0W(AnonymousClass79T.A05, this.A02, i2, i3 - i2);
        this.A01 = i3;
        if (i3 >= this.A00) {
            return A0W;
        }
        this.A01 = i3 + 1;
        return A0W;
    }

    public static int A00(C161467pi r2) {
        return r2.A00 - r2.A01;
    }

    public static int A01(C161467pi r1) {
        r1.A0S(8);
        return (r1.A07() >> 24) & 255;
    }

    public static C161467pi A05(int i) {
        return new C161467pi(i);
    }

    public int A07() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int A0G = AnonymousClass6C9.A0G(bArr, i2, (bArr[i] & 255) << 24);
        int i4 = i3 + 1;
        int A0G2 = AnonymousClass6C8.A0G(bArr, i3, A0G);
        this.A01 = i4 + 1;
        return AnonymousClass6CA.A0B(bArr, i4, A0G2);
    }

    public int A08() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int A0G = AnonymousClass6C8.A0G(bArr, i2, bArr[i] & 255);
        int i4 = i3 + 1;
        int A0G2 = AnonymousClass6C9.A0G(bArr, i3, A0G);
        this.A01 = i4 + 1;
        return ((bArr[i4] & 255) << 24) | A0G2;
    }

    public int A0A() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        byte b = bArr[i] & 255;
        this.A01 = i2 + 1;
        return AnonymousClass6C9.A0F(bArr, i2) | b;
    }

    public int A0C() {
        byte[] bArr = this.A02;
        int i = this.A01;
        this.A01 = i + 1;
        return bArr[i] & 255;
    }

    public int A0D() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int A0G = AnonymousClass6C8.A0G(bArr, i2, (bArr[i] & 255) << 16);
        this.A01 = i3 + 1;
        return AnonymousClass6CA.A0B(bArr, i3, A0G);
    }

    public int A0F() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        int A0F = AnonymousClass6C9.A0F(bArr, i);
        this.A01 = i2 + 1;
        return AnonymousClass6CA.A0B(bArr, i2, A0F);
    }

    public long A0G() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        long A0O = AnonymousClass6C8.A0O(bArr[i3], AnonymousClass6C9.A0L(bArr[i2], ((long) bArr[i]) & 255));
        this.A01 = i4 + 1;
        return A0O | ((((long) bArr[i4]) & 255) << 24);
    }

    public long A0H() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        int i7 = i6 + 1;
        int i8 = i7 + 1;
        long A0L = AnonymousClass6C9.A0L(bArr[i7], AnonymousClass6C8.A0O(bArr[i6], ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i2]) & 255) << 48) | ((((long) bArr[i3]) & 255) << 40) | ((((long) bArr[i4]) & 255) << 32) | ((((long) bArr[i5]) & 255) << 24)));
        this.A01 = i8 + 1;
        return A0L | (((long) bArr[i8]) & 255);
    }

    public long A0I() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        long A0L = AnonymousClass6C9.A0L(bArr[i3], AnonymousClass6C8.A0O(bArr[i2], (((long) bArr[i]) & 255) << 24));
        this.A01 = i4 + 1;
        return A0L | (((long) bArr[i4]) & 255);
    }

    public long A0K() {
        int i;
        byte[] bArr = this.A02;
        int i2 = this.A01;
        long j = (long) bArr[i2];
        int i3 = 7;
        while (true) {
            int i4 = 1;
            if (i3 < 0) {
                break;
            }
            int i5 = 1 << i3;
            if ((((long) i5) & j) == 0) {
                if (i3 < 6) {
                    j &= (long) (i5 - 1);
                    i = 7 - i3;
                    if (i != 0) {
                        while (i4 < i) {
                            byte b = bArr[i2 + i4];
                            if ((b & 192) == 128) {
                                j = (j << 6) | ((long) (b & 63));
                                i4++;
                            } else {
                                throw new NumberFormatException(AnonymousClass000.A0Z("Invalid UTF-8 sequence continuation byte: ", AnonymousClass001.A0o(), j));
                            }
                        }
                    }
                } else if (i3 == 7) {
                    i = 1;
                }
                this.A01 = i2 + i;
                return j;
            }
            i3--;
        }
        throw new NumberFormatException(AnonymousClass000.A0Z("Invalid UTF-8 sequence first byte: ", AnonymousClass001.A0o(), j));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        if (r5 == r3) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0M() {
        /*
            r6 = this;
            int r2 = r6.A00
            int r3 = r6.A01
            int r0 = r2 - r3
            if (r0 != 0) goto L_0x000a
            r0 = 0
            return r0
        L_0x000a:
            r5 = r3
        L_0x000b:
            if (r5 >= r2) goto L_0x001c
            byte[] r0 = r6.A02
            byte r1 = r0[r5]
            r0 = 10
            if (r1 == r0) goto L_0x001c
            r0 = 13
            if (r1 == r0) goto L_0x001c
            int r5 = r5 + 1
            goto L_0x000b
        L_0x001c:
            int r1 = r5 - r3
            r0 = 3
            if (r1 < r0) goto L_0x003d
            byte[] r2 = r6.A02
            byte r1 = r2[r3]
            r0 = -17
            if (r1 != r0) goto L_0x003d
            int r0 = r3 + 1
            byte r1 = r2[r0]
            r0 = -69
            if (r1 != r0) goto L_0x003d
            int r0 = r3 + 2
            byte r1 = r2[r0]
            r0 = -65
            if (r1 != r0) goto L_0x003d
            int r3 = r3 + 3
            r6.A01 = r3
        L_0x003d:
            byte[] r2 = r6.A02
            int r1 = r5 - r3
            java.nio.charset.Charset r0 = X.AnonymousClass79T.A05
            java.lang.String r4 = X.AnonymousClass6CA.A0W(r0, r2, r3, r1)
            r6.A01 = r5
            int r3 = r6.A00
            if (r5 == r3) goto L_0x005b
            byte[] r2 = r6.A02
            byte r1 = r2[r5]
            r0 = 13
            if (r1 != r0) goto L_0x005c
            int r5 = r5 + 1
            r6.A01 = r5
            if (r5 != r3) goto L_0x005c
        L_0x005b:
            return r4
        L_0x005c:
            byte r1 = r2[r5]
            r0 = 10
            if (r1 != r0) goto L_0x005b
            int r0 = r5 + 1
            r6.A01 = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161467pi.A0M():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r4.A02[r1] != 0) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0N(int r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x0005
            java.lang.String r0 = ""
            return r0
        L_0x0005:
            int r3 = r4.A01
            int r0 = r3 + r5
            int r1 = r0 + -1
            int r0 = r4.A00
            if (r1 >= r0) goto L_0x0017
            byte[] r0 = r4.A02
            byte r0 = r0[r1]
            int r2 = r5 + -1
            if (r0 == 0) goto L_0x0018
        L_0x0017:
            r2 = r5
        L_0x0018:
            byte[] r1 = r4.A02
            java.nio.charset.Charset r0 = X.AnonymousClass79T.A05
            java.lang.String r1 = X.AnonymousClass6CA.A0W(r0, r1, r3, r2)
            int r0 = r4.A01
            int r0 = r0 + r5
            r4.A01 = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161467pi.A0N(int):java.lang.String");
    }

    public String A0O(int i) {
        String A0W = AnonymousClass6CA.A0W(AnonymousClass79T.A05, this.A02, this.A01, i);
        this.A01 += i;
        return A0W;
    }

    public void A0P(int i) {
        byte[] bArr = this.A02;
        if (i > bArr.length) {
            this.A02 = Arrays.copyOf(bArr, i);
        }
    }

    public void A0Q(int i) {
        byte[] bArr = this.A02;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        A0U(bArr, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        if (r3 > r2.A02.length) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0R(int r3) {
        /*
            r2 = this;
            if (r3 < 0) goto L_0x0008
            byte[] r0 = r2.A02
            int r1 = r0.length
            r0 = 1
            if (r3 <= r1) goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            X.C161487pm.A03(r0)
            r2.A00 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161467pi.A0R(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        if (r3 > r2.A00) goto L_0x0007;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0S(int r3) {
        /*
            r2 = this;
            if (r3 < 0) goto L_0x0007
            int r1 = r2.A00
            r0 = 1
            if (r3 <= r1) goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            X.C161487pm.A03(r0)
            r2.A01 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161467pi.A0S(int):void");
    }

    public void A0T(int i) {
        A0S(this.A01 + i);
    }

    public void A0U(byte[] bArr, int i) {
        this.A02 = bArr;
        this.A00 = i;
        this.A01 = 0;
    }

    public void A0V(byte[] bArr, int i, int i2) {
        System.arraycopy(this.A02, this.A01, bArr, i, i2);
        this.A01 += i2;
    }

    public C161467pi(byte[] bArr, int i) {
        this.A02 = bArr;
        this.A00 = i;
    }

    public static int A02(C161467pi r0, int i) {
        r0.A0T(i);
        return r0.A0C();
    }

    public static int A03(C161467pi r0, int i) {
        r0.A0S(i);
        return r0.A0E();
    }

    public static int A04(C161467pi r0, int i) {
        r0.A0S(i);
        return r0.A07();
    }

    public int A09() {
        int A08 = A08();
        if (A08 >= 0) {
            return A08;
        }
        throw C86604Kt.A0h("Top bit not zero: ", AnonymousClass001.A0o(), A08);
    }

    public int A0B() {
        return (A0C() << 21) | (A0C() << 14) | (A0C() << 7) | A0C();
    }

    public int A0E() {
        int A07 = A07();
        if (A07 >= 0) {
            return A07;
        }
        throw C86604Kt.A0h("Top bit not zero: ", AnonymousClass001.A0o(), A07);
    }

    public long A0J() {
        long A0H = A0H();
        if (A0H >= 0) {
            return A0H;
        }
        throw AnonymousClass001.A0e(AnonymousClass000.A0Z("Top bit not zero: ", AnonymousClass001.A0o(), A0H));
    }

    public C161467pi() {
        this.A02 = C162387ry.A0A;
    }

    public C161467pi(int i) {
        this.A02 = new byte[i];
        this.A00 = i;
    }

    public C161467pi(byte[] bArr) {
        this.A02 = bArr;
        this.A00 = bArr.length;
    }
}
