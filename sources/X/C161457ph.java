package X;

import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.7ph  reason: invalid class name and case insensitive filesystem */
public final class C161457ph {
    public int A00;
    public int A01;
    public byte[] A02;

    public C161457ph(byte[] bArr, int i) {
        this.A02 = bArr;
        this.A00 = 0;
    }

    public String A0B() {
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

    public static int A00(C161457ph r1) {
        r1.A0H(8);
        return (r1.A03() >> 24) & 255;
    }

    public int A03() {
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

    public int A04() {
        byte[] bArr = this.A02;
        int i = this.A01;
        this.A01 = i + 1;
        return bArr[i] & 255;
    }

    public int A06() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        int A0F = AnonymousClass6C9.A0F(bArr, i);
        this.A01 = i2 + 1;
        return AnonymousClass6CA.A0B(bArr, i2, A0F);
    }

    public long A07() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        long A0O = AnonymousClass6C8.A0O(bArr[i3], AnonymousClass6C9.A0L(bArr[i2], ((long) bArr[i]) & 255));
        this.A01 = i4 + 1;
        return A0O | ((((long) bArr[i4]) & 255) << 24);
    }

    public long A08() {
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

    public long A09() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        long A0L = AnonymousClass6C9.A0L(bArr[i3], AnonymousClass6C8.A0O(bArr[i2], (((long) bArr[i]) & 255) << 24));
        this.A01 = i4 + 1;
        return A0L | (((long) bArr[i4]) & 255);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r4.A02[r1] != 0) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0C(int r5) {
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
        throw new UnsupportedOperationException("Method not decompiled: X.C161457ph.A0C(int):java.lang.String");
    }

    public String A0D(int i) {
        String A0W = AnonymousClass6CA.A0W(AnonymousClass79T.A05, this.A02, this.A01, i);
        this.A01 += i;
        return A0W;
    }

    public short A0E() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        int A0F = AnonymousClass6C9.A0F(bArr, i);
        this.A01 = i2 + 1;
        return (short) AnonymousClass6CA.A0B(bArr, i2, A0F);
    }

    public void A0F(int i) {
        byte[] bArr = this.A02;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        this.A02 = bArr;
        this.A00 = i;
        this.A01 = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        if (r3 > r2.A02.length) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0G(int r3) {
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
            X.C159197lM.A01(r0)
            r2.A00 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161457ph.A0G(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        if (r3 > r2.A00) goto L_0x0007;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H(int r3) {
        /*
            r2 = this;
            if (r3 < 0) goto L_0x0007
            int r1 = r2.A00
            r0 = 1
            if (r3 <= r1) goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            X.C159197lM.A01(r0)
            r2.A01 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161457ph.A0H(int):void");
    }

    public void A0I(int i) {
        A0H(this.A01 + i);
    }

    public void A0J(byte[] bArr, int i, int i2) {
        System.arraycopy(this.A02, this.A01, bArr, i, i2);
        this.A01 += i2;
    }

    public static int A01(C161457ph r0, int i) {
        r0.A0I(i);
        return r0.A04();
    }

    public static int A02(C161457ph r0, int i) {
        r0.A0H(i);
        return r0.A03();
    }

    public int A05() {
        int A03 = A03();
        if (A03 >= 0) {
            return A03;
        }
        throw C86604Kt.A0h("Top bit not zero: ", AnonymousClass001.A0o(), A03);
    }

    public long A0A() {
        long A08 = A08();
        if (A08 >= 0) {
            return A08;
        }
        throw AnonymousClass001.A0e(AnonymousClass000.A0Z("Top bit not zero: ", AnonymousClass001.A0o(), A08));
    }

    public C161457ph() {
        this.A02 = Util.A09;
    }

    public C161457ph(int i) {
        this.A02 = new byte[i];
        this.A00 = i;
    }

    public C161457ph(byte[] bArr) {
        this.A02 = bArr;
        this.A00 = bArr.length;
    }
}
