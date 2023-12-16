package X;

/* renamed from: X.7XU  reason: invalid class name */
public abstract class AnonymousClass7XU {
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
            boolean r0 = r0 instanceof X.AnonymousClass6YI
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
            X.C162367ro.A08(r7, r0, r2)
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
            X.C162367ro.A08(r7, r0, r2)
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
            X.C162367ro.A08(r7, r9, r2)
            long r15 = r0 + r18
            r3 = r13 & 63
            r2 = 128(0x80, float:1.794E-43)
            r3 = r3 | r2
            byte r2 = (byte) r3
        L_0x0072:
            X.C162367ro.A08(r7, r2, r0)
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
            X.C162367ro.A08(r7, r0, r2)
            long r0 = r9 + r18
            int r2 = r13 >>> 6
            r2 = r2 & 63
            r3 = 128(0x80, float:1.794E-43)
            r2 = r2 | r3
            byte r2 = (byte) r2
            X.C162367ro.A08(r7, r2, r9)
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
            X.C162367ro.A08(r7, r10, r2)
            long r2 = r0 + r18
            int r10 = r14 >>> 12
            r10 = r10 & 63
            r13 = 128(0x80, float:1.794E-43)
            r10 = r10 | 128(0x80, float:1.794E-43)
            byte r10 = (byte) r10
            X.C162367ro.A08(r7, r10, r0)
            long r0 = r2 + r18
            int r10 = r14 >>> 6
            r10 = r10 & 63
            r10 = r10 | r13
            byte r10 = (byte) r10
            X.C162367ro.A08(r7, r10, r2)
            long r15 = r0 + r18
            r2 = r14 & 63
            r2 = r2 | r13
            byte r2 = (byte) r2
            X.C162367ro.A08(r7, r2, r0)
            r14 = r9
            goto L_0x004e
        L_0x00ef:
            r14 = r9
        L_0x00f0:
            int r0 = r14 + -1
            X.6zn r1 = new X.6zn
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
            X.6zn r1 = new X.6zn
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
            X.6zn r1 = new X.6zn
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
            X.6zn r1 = new X.6zn
            r1.<init>(r5, r3)
            throw r1
        L_0x01de:
            java.lang.StringBuilder r1 = X.AnonymousClass6C9.A0j(r4)
            java.lang.String r0 = " at index "
            java.lang.ArrayIndexOutOfBoundsException r1 = X.AnonymousClass6C7.A0T(r0, r1, r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7XU.A00(java.lang.CharSequence, byte[], int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0156, code lost:
        r3 = r14[r7 - 1];
        r4 = r16 - r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x015c, code lost:
        if (r4 == 0) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x015f, code lost:
        if (r4 == 1) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0162, code lost:
        if (r4 != 2) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0164, code lost:
        r2 = r14[r7];
        r1 = r14[r7 + 1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x016c, code lost:
        if (r3 > -12) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x016e, code lost:
        if (r2 > -65) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0170, code lost:
        if (r1 > -65) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0172, code lost:
        r3 = r3 ^ (r2 << 8);
        r0 = r1 << 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0178, code lost:
        return r3 ^ r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0179, code lost:
        r1 = r14[r7];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x017d, code lost:
        if (r3 > -12) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x017f, code lost:
        if (r1 > -65) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0181, code lost:
        r0 = r1 << 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0186, code lost:
        if (r3 <= -12) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0191, code lost:
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
    public int A01(byte[] r14, int r15, int r16) {
        /*
            r13 = this;
            r4 = r16
            boolean r0 = r13 instanceof X.AnonymousClass6YI
            if (r0 == 0) goto L_0x00ef
            r1 = r15 | r16
            int r2 = r14.length
            int r0 = r2 - r16
            r1 = r1 | r0
            r5 = 2
            r6 = 3
            r0 = 0
            if (r1 < 0) goto L_0x00d8
            long r2 = (long) r15
            long r0 = (long) r4
            long r0 = r0 - r2
            int r4 = (int) r0
            r0 = 16
            r11 = 1
            if (r4 >= r0) goto L_0x00c0
            r9 = 0
        L_0x001c:
            int r4 = r4 - r9
            long r0 = (long) r9
            long r2 = r2 + r0
        L_0x001f:
            r7 = 0
        L_0x0020:
            if (r4 <= 0) goto L_0x002e
            long r0 = r2 + r11
            byte r7 = X.C162367ro.A00(r14, r2)
            if (r7 < 0) goto L_0x0032
            int r4 = r4 + -1
            r2 = r0
            goto L_0x0020
        L_0x002e:
            if (r4 != 0) goto L_0x0033
            r7 = 0
        L_0x0031:
            return r7
        L_0x0032:
            r2 = r0
        L_0x0033:
            int r1 = r4 + -1
            r10 = -32
            r9 = -65
            if (r7 >= r10) goto L_0x004d
            if (r1 == 0) goto L_0x0031
            int r4 = r1 + -1
            r0 = -62
            if (r7 < r0) goto L_0x006b
        L_0x0043:
            long r7 = r2 + r11
            byte r0 = X.C162367ro.A00(r14, r2)
            if (r0 > r9) goto L_0x006b
            r2 = r7
            goto L_0x001f
        L_0x004d:
            r0 = -16
            if (r7 >= r0) goto L_0x0074
            if (r1 < r5) goto L_0x008f
            int r4 = r1 + -2
            long r0 = r2 + r11
            byte r8 = X.C162367ro.A00(r14, r2)
            if (r8 > r9) goto L_0x006b
            r3 = -96
            if (r7 != r10) goto L_0x006d
            if (r8 < r3) goto L_0x006b
        L_0x0063:
            long r2 = r0 + r11
            byte r0 = X.C162367ro.A00(r14, r0)
            if (r0 <= r9) goto L_0x001f
        L_0x006b:
            r7 = -1
            return r7
        L_0x006d:
            r2 = -19
            if (r7 != r2) goto L_0x0063
            if (r8 >= r3) goto L_0x006b
            goto L_0x0063
        L_0x0074:
            if (r1 < r6) goto L_0x008f
            int r4 = r1 + -3
            long r0 = r2 + r11
            byte r2 = X.C162367ro.A00(r14, r2)
            if (r2 > r9) goto L_0x006b
            int r2 = X.AnonymousClass6C9.A08(r7, r2)
            if (r2 != 0) goto L_0x006b
            long r2 = r0 + r11
            byte r0 = X.C162367ro.A00(r14, r0)
            if (r0 > r9) goto L_0x006b
            goto L_0x0043
        L_0x008f:
            if (r1 == 0) goto L_0x00bb
            r0 = 1
            if (r1 == r0) goto L_0x00ae
            if (r1 != r5) goto L_0x00d2
            byte r4 = X.C162367ro.A00(r14, r2)
            long r2 = r2 + r11
            byte r1 = X.C162367ro.A00(r14, r2)
            r0 = -12
            if (r7 > r0) goto L_0x006b
            if (r4 > r9) goto L_0x006b
            if (r1 > r9) goto L_0x006b
            int r0 = r4 << 8
            r7 = r7 ^ r0
            int r0 = r1 << 16
        L_0x00ac:
            r7 = r7 ^ r0
            return r7
        L_0x00ae:
            byte r1 = X.C162367ro.A00(r14, r2)
            r0 = -12
            if (r7 > r0) goto L_0x006b
            if (r1 > r9) goto L_0x006b
            int r0 = r1 << 8
            goto L_0x00ac
        L_0x00bb:
            r0 = -12
            if (r7 <= r0) goto L_0x0031
            goto L_0x006b
        L_0x00c0:
            r0 = r2
            r9 = 0
        L_0x00c2:
            long r7 = r0 + r11
            byte r0 = X.C162367ro.A00(r14, r0)
            if (r0 < 0) goto L_0x001c
            int r9 = r9 + 1
            r0 = r7
            if (r9 < r4) goto L_0x00c2
            r9 = r4
            goto L_0x001c
        L_0x00d2:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x00d8:
            java.lang.Object[] r1 = new java.lang.Object[r6]
            X.AnonymousClass000.A1P(r1, r2, r0)
            X.AnonymousClass000.A1M(r1, r15)
            X.AnonymousClass000.A1P(r1, r4, r5)
            java.lang.String r0 = "Array length=%d, index=%d, limit=%d"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        L_0x00ef:
            if (r15 >= r4) goto L_0x00f8
            byte r0 = r14[r15]
            if (r0 < 0) goto L_0x00f8
            int r15 = r15 + 1
            goto L_0x00ef
        L_0x00f8:
            r3 = 0
            if (r15 < r4) goto L_0x00fc
        L_0x00fb:
            return r3
        L_0x00fc:
            if (r15 >= r4) goto L_0x00fb
            int r7 = r15 + 1
            byte r8 = r14[r15]
            if (r8 >= 0) goto L_0x0189
            r9 = -32
            r5 = -65
            if (r8 >= r9) goto L_0x0116
            if (r7 < r4) goto L_0x010d
            return r8
        L_0x010d:
            r0 = -62
            if (r8 < r0) goto L_0x0130
            int r15 = r7 + 1
            byte r0 = r14[r7]
            goto L_0x012e
        L_0x0116:
            r0 = -16
            if (r8 >= r0) goto L_0x0139
            int r0 = r16 + -1
            if (r7 >= r0) goto L_0x0156
            int r6 = r7 + 1
            byte r2 = r14[r7]
            if (r2 > r5) goto L_0x0130
            r1 = -96
            if (r8 != r9) goto L_0x0132
            if (r2 < r1) goto L_0x0130
        L_0x012a:
            int r15 = r6 + 1
            byte r0 = r14[r6]
        L_0x012e:
            if (r0 <= r5) goto L_0x00fc
        L_0x0130:
            r3 = -1
            return r3
        L_0x0132:
            r0 = -19
            if (r8 != r0) goto L_0x012a
            if (r2 >= r1) goto L_0x0130
            goto L_0x012a
        L_0x0139:
            int r0 = r16 + -2
            if (r7 >= r0) goto L_0x0156
            int r2 = r7 + 1
            byte r0 = r14[r7]
            if (r0 > r5) goto L_0x0130
            int r0 = X.AnonymousClass6C9.A08(r8, r0)
            if (r0 != 0) goto L_0x0130
            int r1 = r2 + 1
            byte r0 = r14[r2]
            if (r0 > r5) goto L_0x0130
            int r7 = r1 + 1
            byte r0 = r14[r1]
            if (r0 <= r5) goto L_0x0189
            goto L_0x0130
        L_0x0156:
            int r0 = r7 + -1
            byte r3 = r14[r0]
            int r4 = r16 - r7
            if (r4 == 0) goto L_0x0184
            r0 = 1
            if (r4 == r0) goto L_0x0179
            r0 = 2
            if (r4 != r0) goto L_0x018c
            byte r2 = r14[r7]
            int r0 = r7 + 1
            byte r1 = r14[r0]
            r0 = -12
            if (r3 > r0) goto L_0x0130
            if (r2 > r5) goto L_0x0130
            if (r1 > r5) goto L_0x0130
            int r0 = r2 << 8
            r3 = r3 ^ r0
            int r0 = r1 << 16
        L_0x0177:
            r3 = r3 ^ r0
            return r3
        L_0x0179:
            byte r1 = r14[r7]
            r0 = -12
            if (r3 > r0) goto L_0x0130
            if (r1 > r5) goto L_0x0130
            int r0 = r1 << 8
            goto L_0x0177
        L_0x0184:
            r0 = -12
            if (r3 <= r0) goto L_0x00fb
            goto L_0x0130
        L_0x0189:
            r15 = r7
            goto L_0x00fc
        L_0x018c:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7XU.A01(byte[], int, int):int");
    }
}
