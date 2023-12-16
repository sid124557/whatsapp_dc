package X;

/* renamed from: X.6bh  reason: invalid class name and case insensitive filesystem */
public final class C130276bh extends C153797c2 {
    public int A00;
    public int A01 = Integer.MAX_VALUE;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public final byte[] A06;

    public int A0P() {
        int i = this.A04;
        if (this.A03 - i >= 4) {
            byte[] bArr = this.A06;
            this.A04 = i + 4;
            return AnonymousClass6C7.A0B(bArr, i);
        }
        throw AnonymousClass6u5.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r4[r2] < 0) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0Q() {
        /*
            r5 = this;
            int r0 = r5.A04
            int r1 = r5.A03
            if (r1 == r0) goto L_0x003c
            byte[] r4 = r5.A06
            int r2 = r0 + 1
            byte r3 = r4[r0]
            if (r3 < 0) goto L_0x005d
            r5.A04 = r2
            return r3
        L_0x0011:
            int r2 = r1 + 1
            byte r1 = r4[r1]
            int r0 = r1 << 28
            r3 = r3 ^ r0
            r0 = 266354560(0xfe03f80, float:2.2112565E-29)
            r3 = r3 ^ r0
            if (r1 >= 0) goto L_0x004d
            int r1 = r2 + 1
            byte r0 = r4[r2]
            if (r0 >= 0) goto L_0x006d
            int r2 = r1 + 1
            byte r0 = r4[r1]
            if (r0 >= 0) goto L_0x004d
            int r1 = r2 + 1
            byte r0 = r4[r2]
            if (r0 >= 0) goto L_0x006d
            int r2 = r1 + 1
            byte r0 = r4[r1]
            if (r0 >= 0) goto L_0x004d
            int r1 = r2 + 1
            byte r0 = r4[r2]
            if (r0 >= 0) goto L_0x006d
        L_0x003c:
            long r1 = r5.A0T()
            int r0 = (int) r1
            return r0
        L_0x0042:
            int r2 = r1 + 1
            byte r0 = r4[r1]
            int r0 = r0 << 14
            r3 = r3 ^ r0
            if (r3 < 0) goto L_0x004f
            r3 = r3 ^ 16256(0x3f80, float:2.278E-41)
        L_0x004d:
            r1 = r2
            goto L_0x006d
        L_0x004f:
            int r1 = r2 + 1
            byte r0 = r4[r2]
            int r0 = r0 << 21
            r3 = r3 ^ r0
            if (r3 >= 0) goto L_0x0011
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r3 = r3 ^ r0
            goto L_0x006d
        L_0x005d:
            int r1 = r1 - r2
            r0 = 9
            if (r1 < r0) goto L_0x003c
            int r1 = r2 + 1
            byte r0 = r4[r2]
            int r0 = r0 << 7
            r3 = r3 ^ r0
            if (r3 >= 0) goto L_0x0042
            r3 = r3 ^ -128(0xffffffffffffff80, float:NaN)
        L_0x006d:
            r5.A04 = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C130276bh.A0Q():int");
    }

    public long A0R() {
        int i = this.A04;
        if (this.A03 - i >= 8) {
            byte[] bArr = this.A06;
            this.A04 = i + 8;
            return C153797c2.A00(bArr, i);
        }
        throw AnonymousClass6u5.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        if (((long) r5[r9]) < 0) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A0S() {
        /*
            r10 = this;
            int r0 = r10.A04
            int r3 = r10.A03
            if (r3 == r0) goto L_0x002e
            byte[] r5 = r10.A06
            int r1 = r0 + 1
            byte r2 = r5[r0]
            if (r2 < 0) goto L_0x0083
            r10.A04 = r1
            long r0 = (long) r2
            return r0
        L_0x0012:
            int r9 = r6 + 1
            byte r0 = r5[r6]
            long r1 = (long) r0
            r0 = 56
            long r1 = r1 << r0
            long r3 = r3 ^ r1
            r0 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r3 ^ r0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0047
            int r6 = r9 + 1
            byte r0 = r5[r9]
            long r1 = (long) r0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0094
        L_0x002e:
            long r0 = r10.A0T()
            return r0
        L_0x0033:
            long r3 = (long) r2
            int r9 = r6 + 1
            byte r0 = r5[r6]
            long r1 = (long) r0
            r0 = 28
            long r1 = r1 << r0
            long r3 = r3 ^ r1
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0049
            r0 = 266354560(0xfe03f80, double:1.315966377E-315)
        L_0x0046:
            long r3 = r3 ^ r0
        L_0x0047:
            r6 = r9
            goto L_0x0094
        L_0x0049:
            int r6 = r9 + 1
            byte r0 = r5[r9]
            long r1 = (long) r0
            r0 = 35
            long r1 = r1 << r0
            long r3 = r3 ^ r1
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x005d
            r0 = -34093383808(0xfffffff80fe03f80, double:NaN)
        L_0x005b:
            long r3 = r3 ^ r0
            goto L_0x0094
        L_0x005d:
            int r9 = r6 + 1
            byte r0 = r5[r6]
            long r1 = (long) r0
            r0 = 42
            long r1 = r1 << r0
            long r3 = r3 ^ r1
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0070
            r0 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L_0x0046
        L_0x0070:
            int r6 = r9 + 1
            byte r0 = r5[r9]
            long r1 = (long) r0
            r0 = 49
            long r1 = r1 << r0
            long r3 = r3 ^ r1
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0012
            r0 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L_0x005b
        L_0x0083:
            int r3 = r3 - r1
            r0 = 9
            if (r3 < r0) goto L_0x002e
            int r6 = r1 + 1
            byte r0 = r5[r1]
            int r0 = r0 << 7
            r2 = r2 ^ r0
            if (r2 >= 0) goto L_0x0097
            r2 = r2 ^ -128(0xffffffffffffff80, float:NaN)
        L_0x0093:
            long r3 = (long) r2
        L_0x0094:
            r10.A04 = r6
            return r3
        L_0x0097:
            int r1 = r6 + 1
            byte r0 = r5[r6]
            int r0 = r0 << 14
            r2 = r2 ^ r0
            if (r2 < 0) goto L_0x00a5
            r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
            long r3 = (long) r0
            r6 = r1
            goto L_0x0094
        L_0x00a5:
            int r6 = r1 + 1
            byte r0 = r5[r1]
            int r0 = r0 << 21
            r2 = r2 ^ r0
            if (r2 >= 0) goto L_0x0033
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r2 = r2 ^ r0
            goto L_0x0093
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C130276bh.A0S():long");
    }

    public long A0T() {
        long j = 0;
        int i = 0;
        do {
            int i2 = this.A04;
            if (i2 != this.A03) {
                byte[] bArr = this.A06;
                this.A04 = i2 + 1;
                byte b = bArr[i2];
                j |= ((long) (b & Byte.MAX_VALUE)) << i;
                if ((b & 128) == 0) {
                    return j;
                }
                i += 7;
            } else {
                throw AnonymousClass6u5.A00();
            }
        } while (i < 64);
        throw AnonymousClass6u5.A02("CodedInputStream encountered a malformed varint.");
    }

    public final void A0U() {
        int i = this.A03 + this.A00;
        this.A03 = i;
        int i2 = i - this.A05;
        int i3 = this.A01;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.A00 = i4;
            this.A03 = i - i4;
            return;
        }
        this.A00 = 0;
    }

    public C130276bh(byte[] bArr, int i, int i2) {
        this.A06 = bArr;
        this.A03 = i2 + i;
        this.A04 = i;
        this.A05 = i;
    }
}
