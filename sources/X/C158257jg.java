package X;

/* renamed from: X.7jg  reason: invalid class name and case insensitive filesystem */
public abstract class C158257jg {
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        if (r13 < 2048) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x016f, code lost:
        if (r4 < 2048) goto L_0x0171;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c A[LOOP:1: B:15:0x003c->B:21:0x004e, LOOP_START, PHI: r1 r2 r14 
      PHI: (r1v15 char) = (r1v14 char), (r1v21 char) binds: [B:12:0x0038, B:21:0x004e] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r2v4 long) = (r2v3 long), (r2v19 long) binds: [B:12:0x0038, B:21:0x004e] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r14v2 int) = (r14v1 int), (r14v8 int) binds: [B:12:0x0038, B:21:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(java.lang.CharSequence r21, byte[] r22, int r23, int r24) {
        /*
            r20 = this;
            r10 = r24
            r9 = r23
            r0 = r20
            boolean r0 = r0 instanceof X.AnonymousClass6W8
            r8 = r21
            r7 = r22
            if (r0 == 0) goto L_0x0139
            long r2 = (long) r9
            long r5 = (long) r10
            long r5 = r5 + r2
            int r4 = r8.length()
            java.lang.String r12 = " at index "
            java.lang.String r11 = "Failed writing "
            if (r4 > r10) goto L_0x0123
            int r0 = r7.length
            int r0 = r0 - r24
            if (r0 < r9) goto L_0x0123
            r14 = 0
        L_0x0021:
            r1 = 128(0x80, float:1.794E-43)
            r18 = 1
            if (r14 >= r4) goto L_0x0038
            char r0 = r8.charAt(r14)
            if (r0 >= r1) goto L_0x0038
            long r18 = r18 + r2
            byte r0 = (byte) r0
            X.C162337rj.A06(r7, r0, r2)
            int r14 = r14 + 1
            r2 = r18
            goto L_0x0021
        L_0x0038:
            if (r14 != r4) goto L_0x003c
        L_0x003a:
            int r0 = (int) r2
            return r0
        L_0x003c:
            if (r14 >= r4) goto L_0x003a
            char r13 = r8.charAt(r14)
            if (r13 >= r1) goto L_0x0054
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0058
            long r15 = r2 + r18
            byte r0 = (byte) r13
            X.C162337rj.A06(r7, r0, r2)
        L_0x004e:
            int r14 = r14 + 1
            r1 = 128(0x80, float:1.794E-43)
            r2 = r15
            goto L_0x003c
        L_0x0054:
            r0 = 2048(0x800, float:2.87E-42)
            if (r13 >= r0) goto L_0x0076
        L_0x0058:
            r0 = 2
            long r9 = r5 - r0
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x0076
            long r0 = r2 + r18
            int r9 = r13 >>> 6
            r9 = r9 | 960(0x3c0, float:1.345E-42)
            byte r9 = (byte) r9
            X.C162337rj.A06(r7, r9, r2)
            long r15 = r0 + r18
            r3 = r13 & 63
            r2 = 128(0x80, float:1.794E-43)
            r3 = r3 | r2
            byte r2 = (byte) r3
        L_0x0072:
            X.C162337rj.A06(r7, r2, r0)
            goto L_0x004e
        L_0x0076:
            r15 = 57343(0xdfff, float:8.0355E-41)
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r13 < r1) goto L_0x0080
            if (r15 >= r13) goto L_0x00a6
        L_0x0080:
            r16 = 3
            long r9 = r5 - r16
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x00a6
            long r9 = r2 + r18
            int r0 = r13 >>> 12
            r0 = r0 | 480(0x1e0, float:6.73E-43)
            byte r0 = (byte) r0
            X.C162337rj.A06(r7, r0, r2)
            long r0 = r9 + r18
            int r2 = r13 >>> 6
            r2 = r2 & 63
            r3 = 128(0x80, float:1.794E-43)
            r2 = r2 | r3
            byte r2 = (byte) r2
            X.C162337rj.A06(r7, r2, r9)
            long r15 = r0 + r18
            r2 = r13 & 63
            r2 = r2 | r3
            byte r2 = (byte) r2
            goto L_0x0072
        L_0x00a6:
            r16 = 4
            long r9 = r5 - r16
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x00f8
            int r9 = r14 + 1
            if (r9 == r4) goto L_0x00f0
            char r1 = r8.charAt(r9)
            boolean r0 = java.lang.Character.isSurrogatePair(r13, r1)
            if (r0 == 0) goto L_0x00ef
            int r14 = java.lang.Character.toCodePoint(r13, r1)
            long r0 = r2 + r18
            int r10 = r14 >>> 18
            r10 = r10 | 240(0xf0, float:3.36E-43)
            byte r10 = (byte) r10
            X.C162337rj.A06(r7, r10, r2)
            long r2 = r0 + r18
            int r10 = r14 >>> 12
            r10 = r10 & 63
            r13 = 128(0x80, float:1.794E-43)
            r10 = r10 | 128(0x80, float:1.794E-43)
            byte r10 = (byte) r10
            X.C162337rj.A06(r7, r10, r0)
            long r0 = r2 + r18
            int r10 = r14 >>> 6
            r10 = r10 & 63
            r10 = r10 | r13
            byte r10 = (byte) r10
            X.C162337rj.A06(r7, r10, r2)
            long r15 = r0 + r18
            r2 = r14 & 63
            r2 = r2 | r13
            byte r2 = (byte) r2
            X.C162337rj.A06(r7, r2, r0)
            r14 = r9
            goto L_0x004e
        L_0x00ef:
            r14 = r9
        L_0x00f0:
            int r0 = r14 + -1
            X.6zm r1 = new X.6zm
            r1.<init>(r0, r4)
            throw r1
        L_0x00f8:
            if (r1 > r13) goto L_0x0110
            if (r13 > r15) goto L_0x0110
            int r0 = r14 + 1
            if (r0 == r4) goto L_0x010a
            char r0 = r8.charAt(r0)
            boolean r0 = java.lang.Character.isSurrogatePair(r13, r0)
            if (r0 != 0) goto L_0x0110
        L_0x010a:
            X.6zm r1 = new X.6zm
            r1.<init>(r14, r4)
            throw r1
        L_0x0110:
            r0 = 46
            java.lang.StringBuilder r0 = X.AnonymousClass6C8.A0g(r0, r11)
            r0.append(r13)
            java.lang.String r0 = X.AnonymousClass000.A0Z(r12, r0, r2)
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            r1.<init>(r0)
            throw r1
        L_0x0123:
            int r0 = r4 + -1
            char r1 = r8.charAt(r0)
            int r9 = r23 + r24
            r0 = 37
            java.lang.StringBuilder r0 = X.AnonymousClass6C8.A0g(r0, r11)
            r0.append(r1)
            java.lang.ArrayIndexOutOfBoundsException r1 = X.AnonymousClass6C7.A0T(r12, r0, r9)
            throw r1
        L_0x0139:
            int r3 = r8.length()
            int r10 = r24 + r23
            r5 = 0
        L_0x0140:
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r3) goto L_0x0153
            int r1 = r5 + r23
            if (r1 >= r10) goto L_0x0153
            char r0 = r8.charAt(r5)
            if (r0 >= r6) goto L_0x0153
            int r5 = X.AnonymousClass6CA.A0D(r7, r0, r1, r5)
            goto L_0x0140
        L_0x0153:
            if (r5 != r3) goto L_0x0158
            int r9 = r23 + r3
        L_0x0157:
            return r9
        L_0x0158:
            int r9 = r23 + r5
        L_0x015a:
            if (r5 >= r3) goto L_0x0157
            char r4 = r8.charAt(r5)
            if (r4 >= r6) goto L_0x016d
            if (r9 >= r10) goto L_0x0171
            int r1 = r9 + 1
        L_0x0166:
            byte r0 = (byte) r4
            r22[r9] = r0
            r9 = r1
        L_0x016a:
            int r5 = r5 + 1
            goto L_0x015a
        L_0x016d:
            r0 = 2048(0x800, float:2.87E-42)
            if (r4 >= r0) goto L_0x0185
        L_0x0171:
            int r0 = r10 + -2
            if (r9 > r0) goto L_0x0185
            int r1 = r9 + 1
            int r0 = r4 >>> 6
            r0 = r0 | 960(0x3c0, float:1.345E-42)
            int r9 = X.AnonymousClass6CA.A0D(r7, r0, r9, r1)
            r0 = r4 & 63
            X.AnonymousClass6C8.A0u(r0, r7, r6, r1)
            goto L_0x016a
        L_0x0185:
            r2 = 57343(0xdfff, float:8.0355E-41)
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r1) goto L_0x018f
            if (r2 >= r4) goto L_0x019d
        L_0x018f:
            int r0 = r10 + -3
            if (r9 > r0) goto L_0x019d
            int r9 = X.AnonymousClass6C8.A0H(r7, r9, r4)
            int r1 = r9 + 1
            r4 = r4 & 63
            r4 = r4 | r6
            goto L_0x0166
        L_0x019d:
            int r0 = r10 + -4
            if (r9 > r0) goto L_0x01c2
            int r2 = r5 + 1
            int r0 = r8.length()
            if (r2 == r0) goto L_0x01ba
            char r1 = r8.charAt(r2)
            boolean r0 = java.lang.Character.isSurrogatePair(r4, r1)
            if (r0 == 0) goto L_0x01b9
            int r9 = X.AnonymousClass6C7.A0A(r7, r4, r1, r9)
            r5 = r2
            goto L_0x016a
        L_0x01b9:
            r5 = r2
        L_0x01ba:
            int r0 = r5 + -1
            X.6zm r1 = new X.6zm
            r1.<init>(r0, r3)
            throw r1
        L_0x01c2:
            if (r1 > r4) goto L_0x01de
            if (r4 > r2) goto L_0x01de
            int r1 = r5 + 1
            int r0 = r8.length()
            if (r1 == r0) goto L_0x01d8
            char r0 = r8.charAt(r1)
            boolean r0 = java.lang.Character.isSurrogatePair(r4, r0)
            if (r0 != 0) goto L_0x01de
        L_0x01d8:
            X.6zm r1 = new X.6zm
            r1.<init>(r5, r3)
            throw r1
        L_0x01de:
            java.lang.StringBuilder r1 = X.AnonymousClass6C9.A0j(r4)
            java.lang.String r0 = " at index "
            java.lang.ArrayIndexOutOfBoundsException r1 = X.AnonymousClass6C7.A0T(r0, r1, r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C158257jg.A00(java.lang.CharSequence, byte[], int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0186, code lost:
        r4 = r19[r7 - 1];
        r3 = r21 - r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x018c, code lost:
        if (r3 == 0) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x018f, code lost:
        if (r3 == 1) goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0192, code lost:
        if (r3 != 2) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0194, code lost:
        r2 = r19[r7];
        r1 = r19[r7 + 1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x019c, code lost:
        if (r4 > -12) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x019e, code lost:
        if (r2 > -65) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01a0, code lost:
        if (r1 > -65) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01a2, code lost:
        r4 = r4 ^ (r2 << 8);
        r0 = r1 << 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01a8, code lost:
        return r4 ^ r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01a9, code lost:
        r1 = r19[r7];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01ad, code lost:
        if (r4 > -12) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01af, code lost:
        if (r1 > -65) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01b1, code lost:
        r0 = r1 << 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01b6, code lost:
        if (r4 <= -12) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01c1, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:?, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A01(byte[] r19, int r20, int r21) {
        /*
            r18 = this;
            r3 = r21
            r9 = r20
            r0 = r18
            boolean r0 = r0 instanceof X.AnonymousClass6W8
            r8 = r19
            if (r0 == 0) goto L_0x011f
            r1 = r20 | r21
            int r2 = r8.length
            int r0 = r2 - r21
            r1 = r1 | r0
            r10 = 2
            r11 = 3
            r0 = 0
            if (r1 < 0) goto L_0x0108
            long r4 = (long) r9
            long r0 = (long) r3
            long r0 = r0 - r4
            int r9 = (int) r0
            r0 = 16
            r16 = 1
            if (r9 >= r0) goto L_0x00eb
            r3 = 0
        L_0x0022:
            int r9 = r9 - r3
            long r0 = (long) r3
            long r4 = r4 + r0
        L_0x0025:
            r7 = 0
        L_0x0026:
            if (r9 <= 0) goto L_0x0039
            long r12 = r4 + r16
            X.7bt r2 = X.C162337rj.A02
            long r0 = X.C162337rj.A00
            long r0 = r0 + r4
            byte r7 = r2.A01(r8, r0)
            if (r7 < 0) goto L_0x003d
            int r9 = r9 + -1
            r4 = r12
            goto L_0x0026
        L_0x0039:
            if (r9 != 0) goto L_0x003e
            r7 = 0
        L_0x003c:
            return r7
        L_0x003d:
            r4 = r12
        L_0x003e:
            int r1 = r9 + -1
            r13 = -32
            r6 = -65
            if (r7 >= r13) goto L_0x005d
            if (r1 == 0) goto L_0x003c
            int r9 = r1 + -1
            r0 = -62
            if (r7 < r0) goto L_0x0082
        L_0x004e:
            long r12 = r4 + r16
            X.7bt r2 = X.C162337rj.A02
            long r0 = X.C162337rj.A00
            long r0 = r0 + r4
            byte r0 = r2.A01(r8, r0)
            if (r0 > r6) goto L_0x0082
            r4 = r12
            goto L_0x0025
        L_0x005d:
            r0 = -16
            if (r7 >= r0) goto L_0x008b
            if (r1 < r10) goto L_0x00ad
            int r9 = r1 + -2
            long r14 = r4 + r16
            X.7bt r12 = X.C162337rj.A02
            long r2 = X.C162337rj.A00
            long r0 = r2 + r4
            byte r4 = r12.A01(r8, r0)
            if (r4 > r6) goto L_0x0082
            r1 = -96
            if (r7 != r13) goto L_0x0084
            if (r4 < r1) goto L_0x0082
        L_0x0079:
            long r4 = r14 + r16
            long r2 = r2 + r14
            byte r0 = r12.A01(r8, r2)
            if (r0 <= r6) goto L_0x0025
        L_0x0082:
            r7 = -1
            return r7
        L_0x0084:
            r0 = -19
            if (r7 != r0) goto L_0x0079
            if (r4 >= r1) goto L_0x0082
            goto L_0x0079
        L_0x008b:
            if (r1 < r11) goto L_0x00ad
            int r9 = r1 + -3
            long r13 = r4 + r16
            X.7bt r12 = X.C162337rj.A02
            long r2 = X.C162337rj.A00
            long r0 = r2 + r4
            byte r0 = r12.A01(r8, r0)
            if (r0 > r6) goto L_0x0082
            int r0 = X.AnonymousClass6C9.A08(r7, r0)
            if (r0 != 0) goto L_0x0082
            long r4 = r13 + r16
            long r2 = r2 + r13
            byte r0 = r12.A01(r8, r2)
            if (r0 > r6) goto L_0x0082
            goto L_0x004e
        L_0x00ad:
            if (r1 == 0) goto L_0x00e6
            r0 = 1
            if (r1 == r0) goto L_0x00d4
            if (r1 != r10) goto L_0x0102
            X.7bt r9 = X.C162337rj.A02
            long r0 = X.C162337rj.A00
            long r2 = r0 + r4
            byte r2 = r9.A01(r8, r2)
            long r4 = r4 + r16
            long r0 = r0 + r4
            byte r1 = r9.A01(r8, r0)
            r0 = -12
            if (r7 > r0) goto L_0x0082
            if (r2 > r6) goto L_0x0082
            if (r1 > r6) goto L_0x0082
            int r0 = r2 << 8
            r7 = r7 ^ r0
            int r0 = r1 << 16
        L_0x00d2:
            r7 = r7 ^ r0
            return r7
        L_0x00d4:
            X.7bt r2 = X.C162337rj.A02
            long r0 = X.C162337rj.A00
            long r0 = r0 + r4
            byte r1 = r2.A01(r8, r0)
            r0 = -12
            if (r7 > r0) goto L_0x0082
            if (r1 > r6) goto L_0x0082
            int r0 = r1 << 8
            goto L_0x00d2
        L_0x00e6:
            r0 = -12
            if (r7 <= r0) goto L_0x003c
            goto L_0x0082
        L_0x00eb:
            r12 = r4
            r3 = 0
        L_0x00ed:
            long r6 = r12 + r16
            X.7bt r2 = X.C162337rj.A02
            long r0 = X.C162337rj.A00
            long r0 = r0 + r12
            byte r0 = r2.A01(r8, r0)
            if (r0 < 0) goto L_0x0022
            int r3 = r3 + 1
            r12 = r6
            if (r3 < r9) goto L_0x00ed
            r3 = r9
            goto L_0x0022
        L_0x0102:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x0108:
            java.lang.Object[] r1 = new java.lang.Object[r11]
            X.AnonymousClass000.A1P(r1, r2, r0)
            X.AnonymousClass000.A1M(r1, r9)
            X.AnonymousClass000.A1P(r1, r3, r10)
            java.lang.String r0 = "Array length=%d, index=%d, limit=%d"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        L_0x011f:
            if (r9 >= r3) goto L_0x0128
            byte r0 = r19[r9]
            if (r0 < 0) goto L_0x0128
            int r9 = r9 + 1
            goto L_0x011f
        L_0x0128:
            r4 = 0
            if (r9 < r3) goto L_0x012c
        L_0x012b:
            return r4
        L_0x012c:
            if (r9 >= r3) goto L_0x012b
            int r7 = r9 + 1
            byte r9 = r19[r9]
            if (r9 >= 0) goto L_0x01b9
            r10 = -32
            r6 = -65
            if (r9 >= r10) goto L_0x0146
            if (r7 < r3) goto L_0x013d
            return r9
        L_0x013d:
            r0 = -62
            if (r9 < r0) goto L_0x0160
            int r9 = r7 + 1
            byte r0 = r19[r7]
            goto L_0x015e
        L_0x0146:
            r0 = -16
            if (r9 >= r0) goto L_0x0169
            int r0 = r21 + -1
            if (r7 >= r0) goto L_0x0186
            int r5 = r7 + 1
            byte r2 = r19[r7]
            if (r2 > r6) goto L_0x0160
            r1 = -96
            if (r9 != r10) goto L_0x0162
            if (r2 < r1) goto L_0x0160
        L_0x015a:
            int r9 = r5 + 1
            byte r0 = r19[r5]
        L_0x015e:
            if (r0 <= r6) goto L_0x012c
        L_0x0160:
            r4 = -1
            return r4
        L_0x0162:
            r0 = -19
            if (r9 != r0) goto L_0x015a
            if (r2 >= r1) goto L_0x0160
            goto L_0x015a
        L_0x0169:
            int r0 = r21 + -2
            if (r7 >= r0) goto L_0x0186
            int r2 = r7 + 1
            byte r0 = r19[r7]
            if (r0 > r6) goto L_0x0160
            int r0 = X.AnonymousClass6C9.A08(r9, r0)
            if (r0 != 0) goto L_0x0160
            int r1 = r2 + 1
            byte r0 = r19[r2]
            if (r0 > r6) goto L_0x0160
            int r7 = r1 + 1
            byte r0 = r19[r1]
            if (r0 <= r6) goto L_0x01b9
            goto L_0x0160
        L_0x0186:
            int r0 = r7 + -1
            byte r4 = r19[r0]
            int r3 = r21 - r7
            if (r3 == 0) goto L_0x01b4
            r0 = 1
            if (r3 == r0) goto L_0x01a9
            r0 = 2
            if (r3 != r0) goto L_0x01bc
            byte r2 = r19[r7]
            int r0 = r7 + 1
            byte r1 = r19[r0]
            r0 = -12
            if (r4 > r0) goto L_0x0160
            if (r2 > r6) goto L_0x0160
            if (r1 > r6) goto L_0x0160
            int r0 = r2 << 8
            r4 = r4 ^ r0
            int r0 = r1 << 16
        L_0x01a7:
            r4 = r4 ^ r0
            return r4
        L_0x01a9:
            byte r1 = r19[r7]
            r0 = -12
            if (r4 > r0) goto L_0x0160
            if (r1 > r6) goto L_0x0160
            int r0 = r1 << 8
            goto L_0x01a7
        L_0x01b4:
            r0 = -12
            if (r4 <= r0) goto L_0x012b
            goto L_0x0160
        L_0x01b9:
            r9 = r7
            goto L_0x012c
        L_0x01bc:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C158257jg.A01(byte[], int, int):int");
    }
}
