package X;

import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: X.7XY  reason: invalid class name */
public abstract class AnonymousClass7XY {
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        if (r12 < 2048) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0173, code lost:
        if (r3 < 2048) goto L_0x0175;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c A[LOOP:1: B:15:0x003c->B:21:0x004e, LOOP_START, PHI: r1 r2 r13 
      PHI: (r1v15 char) = (r1v14 char), (r1v20 char) binds: [B:12:0x0038, B:21:0x004e] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r2v4 long) = (r2v3 long), (r2v19 long) binds: [B:12:0x0038, B:21:0x004e] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r13v2 int) = (r13v1 int), (r13v8 int) binds: [B:12:0x0038, B:21:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(java.lang.CharSequence r21, byte[] r22, int r23, int r24) {
        /*
            r20 = this;
            r10 = r24
            r9 = r23
            r0 = r20
            boolean r0 = r0 instanceof X.C130876cg
            r8 = r21
            r7 = r22
            if (r0 == 0) goto L_0x013d
            long r2 = (long) r9
            long r5 = (long) r10
            long r5 = r5 + r2
            int r4 = r8.length()
            java.lang.String r11 = " at index "
            java.lang.String r19 = "Failed writing "
            if (r4 > r10) goto L_0x0121
            int r0 = r7.length
            int r0 = r0 - r24
            if (r0 < r9) goto L_0x0121
            r13 = 0
        L_0x0021:
            r1 = 128(0x80, float:1.794E-43)
            r17 = 1
            if (r13 >= r4) goto L_0x0038
            char r0 = r8.charAt(r13)
            if (r0 >= r1) goto L_0x0038
            long r17 = r17 + r2
            byte r0 = (byte) r0
            com.google.protobuf.UnsafeUtil.A07(r7, r0, r2)
            int r13 = r13 + 1
            r2 = r17
            goto L_0x0021
        L_0x0038:
            if (r13 != r4) goto L_0x003c
        L_0x003a:
            int r0 = (int) r2
            return r0
        L_0x003c:
            if (r13 >= r4) goto L_0x003a
            char r12 = r8.charAt(r13)
            if (r12 >= r1) goto L_0x0054
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0058
            long r14 = r2 + r17
            byte r0 = (byte) r12
            com.google.protobuf.UnsafeUtil.A07(r7, r0, r2)
        L_0x004e:
            int r13 = r13 + 1
            r1 = 128(0x80, float:1.794E-43)
            r2 = r14
            goto L_0x003c
        L_0x0054:
            r0 = 2048(0x800, float:2.87E-42)
            if (r12 >= r0) goto L_0x0076
        L_0x0058:
            r0 = 2
            long r9 = r5 - r0
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x0076
            long r0 = r2 + r17
            int r9 = r12 >>> 6
            r9 = r9 | 960(0x3c0, float:1.345E-42)
            byte r9 = (byte) r9
            com.google.protobuf.UnsafeUtil.A07(r7, r9, r2)
            long r14 = r0 + r17
            r3 = r12 & 63
            r2 = 128(0x80, float:1.794E-43)
            r3 = r3 | r2
            byte r2 = (byte) r3
        L_0x0072:
            com.google.protobuf.UnsafeUtil.A07(r7, r2, r0)
            goto L_0x004e
        L_0x0076:
            r14 = 57343(0xdfff, float:8.0355E-41)
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r12 < r1) goto L_0x0080
            if (r14 >= r12) goto L_0x00a6
        L_0x0080:
            r15 = 3
            long r9 = r5 - r15
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x00a6
            long r9 = r2 + r17
            int r0 = r12 >>> 12
            r0 = r0 | 480(0x1e0, float:6.73E-43)
            byte r0 = (byte) r0
            com.google.protobuf.UnsafeUtil.A07(r7, r0, r2)
            long r0 = r9 + r17
            int r2 = r12 >>> 6
            r2 = r2 & 63
            r3 = 128(0x80, float:1.794E-43)
            r2 = r2 | r3
            byte r2 = (byte) r2
            com.google.protobuf.UnsafeUtil.A07(r7, r2, r9)
            long r14 = r0 + r17
            r2 = r12 & 63
            r2 = r2 | r3
            byte r2 = (byte) r2
            goto L_0x0072
        L_0x00a6:
            r15 = 4
            long r9 = r5 - r15
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x00f8
            int r9 = r13 + 1
            if (r9 == r4) goto L_0x00f0
            char r1 = r8.charAt(r9)
            boolean r0 = java.lang.Character.isSurrogatePair(r12, r1)
            if (r0 == 0) goto L_0x00ef
            int r13 = java.lang.Character.toCodePoint(r12, r1)
            long r0 = r2 + r17
            int r10 = r13 >>> 18
            r10 = r10 | 240(0xf0, float:3.36E-43)
            byte r10 = (byte) r10
            com.google.protobuf.UnsafeUtil.A07(r7, r10, r2)
            long r2 = r0 + r17
            int r10 = r13 >>> 12
            r10 = r10 & 63
            r12 = 128(0x80, float:1.794E-43)
            r10 = r10 | 128(0x80, float:1.794E-43)
            byte r10 = (byte) r10
            com.google.protobuf.UnsafeUtil.A07(r7, r10, r0)
            long r0 = r2 + r17
            int r10 = r13 >>> 6
            r10 = r10 & 63
            r10 = r10 | r12
            byte r10 = (byte) r10
            com.google.protobuf.UnsafeUtil.A07(r7, r10, r2)
            long r14 = r0 + r17
            r2 = r13 & 63
            r2 = r2 | r12
            byte r2 = (byte) r2
            com.google.protobuf.UnsafeUtil.A07(r7, r2, r0)
            r13 = r9
            goto L_0x004e
        L_0x00ef:
            r13 = r9
        L_0x00f0:
            int r1 = r13 + -1
            X.6zo r0 = new X.6zo
            r0.<init>(r1, r4)
            throw r0
        L_0x00f8:
            if (r1 > r12) goto L_0x0110
            if (r12 > r14) goto L_0x0110
            int r0 = r13 + 1
            if (r0 == r4) goto L_0x010a
            char r0 = r8.charAt(r0)
            boolean r0 = java.lang.Character.isSurrogatePair(r12, r0)
            if (r0 != 0) goto L_0x0110
        L_0x010a:
            X.6zo r0 = new X.6zo
            r0.<init>(r13, r4)
            throw r0
        L_0x0110:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r19)
            r0.append(r12)
            java.lang.String r1 = X.AnonymousClass000.A0Z(r11, r0, r2)
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        L_0x0121:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r19)
            int r0 = r4 + -1
            char r0 = r8.charAt(r0)
            r1.append(r0)
            r1.append(r11)
            int r9 = r23 + r24
            java.lang.String r1 = X.AnonymousClass000.A0h(r1, r9)
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        L_0x013d:
            int r4 = r8.length()
            int r10 = r24 + r23
            r5 = 0
        L_0x0144:
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r4) goto L_0x0157
            int r1 = r5 + r23
            if (r1 >= r10) goto L_0x0157
            char r0 = r8.charAt(r5)
            if (r0 >= r6) goto L_0x0157
            int r5 = X.AnonymousClass6CA.A0D(r7, r0, r1, r5)
            goto L_0x0144
        L_0x0157:
            if (r5 != r4) goto L_0x015c
            int r9 = r23 + r4
        L_0x015b:
            return r9
        L_0x015c:
            int r9 = r23 + r5
        L_0x015e:
            if (r5 >= r4) goto L_0x015b
            char r3 = r8.charAt(r5)
            if (r3 >= r6) goto L_0x0171
            if (r9 >= r10) goto L_0x0175
            int r1 = r9 + 1
        L_0x016a:
            byte r0 = (byte) r3
            r22[r9] = r0
            r9 = r1
        L_0x016e:
            int r5 = r5 + 1
            goto L_0x015e
        L_0x0171:
            r0 = 2048(0x800, float:2.87E-42)
            if (r3 >= r0) goto L_0x0189
        L_0x0175:
            int r0 = r10 + -2
            if (r9 > r0) goto L_0x0189
            int r1 = r9 + 1
            int r0 = r3 >>> 6
            r0 = r0 | 960(0x3c0, float:1.345E-42)
            int r9 = X.AnonymousClass6CA.A0D(r7, r0, r9, r1)
            r0 = r3 & 63
            X.AnonymousClass6C8.A0u(r0, r7, r6, r1)
            goto L_0x016e
        L_0x0189:
            r2 = 57343(0xdfff, float:8.0355E-41)
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r1) goto L_0x0193
            if (r2 >= r3) goto L_0x01a1
        L_0x0193:
            int r0 = r10 + -3
            if (r9 > r0) goto L_0x01a1
            int r9 = X.AnonymousClass6C8.A0H(r7, r9, r3)
            int r1 = r9 + 1
            r3 = r3 & 63
            r3 = r3 | r6
            goto L_0x016a
        L_0x01a1:
            int r0 = r10 + -4
            if (r9 > r0) goto L_0x01c6
            int r2 = r5 + 1
            int r0 = r8.length()
            if (r2 == r0) goto L_0x01be
            char r1 = r8.charAt(r2)
            boolean r0 = java.lang.Character.isSurrogatePair(r3, r1)
            if (r0 == 0) goto L_0x01bd
            int r9 = X.AnonymousClass6C7.A0A(r7, r3, r1, r9)
            r5 = r2
            goto L_0x016e
        L_0x01bd:
            r5 = r2
        L_0x01be:
            int r0 = r5 + -1
            X.6zo r1 = new X.6zo
            r1.<init>(r0, r4)
            throw r1
        L_0x01c6:
            if (r1 > r3) goto L_0x01e2
            if (r3 > r2) goto L_0x01e2
            int r1 = r5 + 1
            int r0 = r8.length()
            if (r1 == r0) goto L_0x01dc
            char r0 = r8.charAt(r1)
            boolean r0 = java.lang.Character.isSurrogatePair(r3, r0)
            if (r0 != 0) goto L_0x01e2
        L_0x01dc:
            X.6zo r1 = new X.6zo
            r1.<init>(r5, r4)
            throw r1
        L_0x01e2:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Failed writing "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " at index "
            java.lang.ArrayIndexOutOfBoundsException r1 = X.AnonymousClass6C7.A0T(r0, r1, r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7XY.A00(java.lang.CharSequence, byte[], int, int):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:157:0x0131 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a4 A[LOOP:3: B:23:0x006d->B:39:0x00a4, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A01(byte[] r17, int r18, int r19) {
        /*
            r16 = this;
            r6 = r19
            r5 = r18
            r0 = r16
            boolean r0 = r0 instanceof X.C130876cg
            r8 = r17
            if (r0 == 0) goto L_0x014f
            r1 = r18 | r19
            int r2 = r8.length
            int r0 = r2 - r19
            r1 = r1 | r0
            r0 = 0
            if (r1 < 0) goto L_0x0139
            long r4 = (long) r5
            long r0 = (long) r6
            long r0 = r0 - r4
            int r9 = (int) r0
            r14 = r4
            r0 = 16
            r3 = 0
            if (r9 < r0) goto L_0x006a
            int r0 = (int) r4
            r0 = r0 & 7
            int r6 = 8 - r0
        L_0x0024:
            r12 = 1
            if (r3 >= r6) goto L_0x0038
            long r12 = r12 + r14
            X.7bz r2 = com.google.protobuf.UnsafeUtil.A01
            long r0 = com.google.protobuf.UnsafeUtil.A00
            long r0 = r0 + r14
            byte r0 = r2.A01(r8, r0)
            if (r0 < 0) goto L_0x006a
            int r3 = r3 + 1
            r14 = r12
            goto L_0x0024
        L_0x0038:
            int r6 = r3 + 8
            if (r6 > r9) goto L_0x0056
            long r0 = com.google.protobuf.UnsafeUtil.A00
            long r0 = r0 + r14
            X.7bz r2 = com.google.protobuf.UnsafeUtil.A01
            long r10 = r2.A06(r8, r0)
            r0 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r0
            r1 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0056
            r0 = 8
            long r14 = r14 + r0
            r3 = r6
            goto L_0x0038
        L_0x0056:
            if (r3 >= r9) goto L_0x0069
            long r6 = r14 + r12
            X.7bz r2 = com.google.protobuf.UnsafeUtil.A01
            long r0 = com.google.protobuf.UnsafeUtil.A00
            long r0 = r0 + r14
            byte r0 = r2.A01(r8, r0)
            if (r0 < 0) goto L_0x006a
            int r3 = r3 + 1
            r14 = r6
            goto L_0x0056
        L_0x0069:
            r3 = r9
        L_0x006a:
            int r9 = r9 - r3
            long r0 = (long) r3
            long r4 = r4 + r0
        L_0x006d:
            r7 = 0
        L_0x006e:
            r14 = 1
            if (r9 <= 0) goto L_0x0083
            long r10 = r4 + r14
            X.7bz r2 = com.google.protobuf.UnsafeUtil.A01
            long r0 = com.google.protobuf.UnsafeUtil.A00
            long r0 = r0 + r4
            byte r7 = r2.A01(r8, r0)
            if (r7 < 0) goto L_0x0087
            int r9 = r9 + -1
            r4 = r10
            goto L_0x006e
        L_0x0083:
            if (r9 != 0) goto L_0x0088
            r7 = 0
        L_0x0086:
            return r7
        L_0x0087:
            r4 = r10
        L_0x0088:
            int r1 = r9 + -1
            r13 = -32
            r6 = -65
            if (r7 >= r13) goto L_0x00a6
            if (r1 == 0) goto L_0x0086
            int r9 = r1 + -1
            r0 = -62
            if (r7 < r0) goto L_0x0131
        L_0x0098:
            long r14 = r14 + r4
            X.7bz r2 = com.google.protobuf.UnsafeUtil.A01
            long r0 = com.google.protobuf.UnsafeUtil.A00
            long r0 = r0 + r4
            byte r0 = r2.A01(r8, r0)
        L_0x00a2:
            if (r0 > r6) goto L_0x0131
            r4 = r14
            goto L_0x006d
        L_0x00a6:
            r0 = -16
            if (r7 >= r0) goto L_0x00d1
            r0 = 2
            if (r1 < r0) goto L_0x00f4
            int r9 = r1 + -2
            long r11 = r4 + r14
            X.7bz r10 = com.google.protobuf.UnsafeUtil.A01
            long r2 = com.google.protobuf.UnsafeUtil.A00
            long r0 = r2 + r4
            byte r4 = r10.A01(r8, r0)
            if (r4 > r6) goto L_0x0131
            r1 = -96
            if (r7 != r13) goto L_0x00ca
            if (r4 < r1) goto L_0x0131
        L_0x00c3:
            long r14 = r14 + r11
            long r2 = r2 + r11
            byte r0 = r10.A01(r8, r2)
            goto L_0x00a2
        L_0x00ca:
            r0 = -19
            if (r7 != r0) goto L_0x00c3
            if (r4 >= r1) goto L_0x0131
            goto L_0x00c3
        L_0x00d1:
            r0 = 3
            if (r1 < r0) goto L_0x00f4
            int r9 = r1 + -3
            long r11 = r4 + r14
            X.7bz r10 = com.google.protobuf.UnsafeUtil.A01
            long r2 = com.google.protobuf.UnsafeUtil.A00
            long r0 = r2 + r4
            byte r0 = r10.A01(r8, r0)
            if (r0 > r6) goto L_0x0131
            int r0 = X.AnonymousClass6C9.A08(r7, r0)
            if (r0 != 0) goto L_0x0131
            long r4 = r11 + r14
            long r2 = r2 + r11
            byte r0 = r10.A01(r8, r2)
            if (r0 > r6) goto L_0x0131
            goto L_0x0098
        L_0x00f4:
            if (r1 == 0) goto L_0x012d
            r0 = 1
            if (r1 == r0) goto L_0x011b
            r0 = 2
            if (r1 != r0) goto L_0x0133
            X.7bz r9 = com.google.protobuf.UnsafeUtil.A01
            long r0 = com.google.protobuf.UnsafeUtil.A00
            long r2 = r0 + r4
            byte r2 = r9.A01(r8, r2)
            long r4 = r4 + r14
            long r0 = r0 + r4
            byte r1 = r9.A01(r8, r0)
            r0 = -12
            if (r7 > r0) goto L_0x0131
            if (r2 > r6) goto L_0x0131
            if (r1 > r6) goto L_0x0131
            int r0 = r2 << 8
            r7 = r7 ^ r0
            int r0 = r1 << 16
        L_0x0119:
            r7 = r7 ^ r0
            return r7
        L_0x011b:
            X.7bz r2 = com.google.protobuf.UnsafeUtil.A01
            long r0 = com.google.protobuf.UnsafeUtil.A00
            long r0 = r0 + r4
            byte r1 = r2.A01(r8, r0)
            r0 = -12
            if (r7 > r0) goto L_0x0131
            if (r1 > r6) goto L_0x0131
            int r0 = r1 << 8
            goto L_0x0119
        L_0x012d:
            r0 = -12
            if (r7 <= r0) goto L_0x0086
        L_0x0131:
            r7 = -1
            return r7
        L_0x0133:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x0139:
            java.lang.Object[] r1 = X.AnonymousClass0x9.A1X()
            X.AnonymousClass000.A1P(r1, r2, r0)
            X.AnonymousClass6C7.A1U(r1, r5, r6)
            java.lang.String r0 = "Array length=%d, index=%d, limit=%d"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        L_0x014f:
            if (r5 >= r6) goto L_0x0158
            byte r0 = r17[r5]
            if (r0 < 0) goto L_0x0158
            int r5 = r5 + 1
            goto L_0x014f
        L_0x0158:
            if (r5 < r6) goto L_0x015c
        L_0x015a:
            r5 = 0
        L_0x015b:
            return r5
        L_0x015c:
            if (r5 >= r6) goto L_0x015a
            int r7 = r5 + 1
            byte r5 = r17[r5]
            if (r5 >= 0) goto L_0x01e8
            r9 = -32
            r4 = -65
            if (r5 >= r9) goto L_0x0178
            if (r7 >= r6) goto L_0x015b
            r0 = -62
            if (r5 < r0) goto L_0x0176
            int r5 = r7 + 1
            byte r0 = r17[r7]
        L_0x0174:
            if (r0 <= r4) goto L_0x015c
        L_0x0176:
            r5 = -1
            return r5
        L_0x0178:
            r0 = -16
            if (r5 >= r0) goto L_0x0198
            int r0 = r19 + -1
            if (r7 >= r0) goto L_0x01b5
            int r3 = r7 + 1
            byte r2 = r17[r7]
            if (r2 > r4) goto L_0x0176
            r1 = -96
            if (r5 != r9) goto L_0x0191
            if (r2 < r1) goto L_0x0176
        L_0x018c:
            int r5 = r3 + 1
            byte r0 = r17[r3]
            goto L_0x0174
        L_0x0191:
            r0 = -19
            if (r5 != r0) goto L_0x018c
            if (r2 >= r1) goto L_0x0176
            goto L_0x018c
        L_0x0198:
            int r0 = r19 + -2
            if (r7 >= r0) goto L_0x01b5
            int r2 = r7 + 1
            byte r0 = r17[r7]
            if (r0 > r4) goto L_0x0176
            int r0 = X.AnonymousClass6C9.A08(r5, r0)
            if (r0 != 0) goto L_0x0176
            int r1 = r2 + 1
            byte r0 = r17[r2]
            if (r0 > r4) goto L_0x0176
            int r7 = r1 + 1
            byte r0 = r17[r1]
            if (r0 <= r4) goto L_0x01e8
            goto L_0x0176
        L_0x01b5:
            int r0 = r7 + -1
            byte r5 = r17[r0]
            int r6 = r19 - r7
            if (r6 == 0) goto L_0x01e3
            r0 = 1
            if (r6 == r0) goto L_0x01d8
            r0 = 2
            if (r6 != r0) goto L_0x01eb
            byte r2 = r17[r7]
            int r0 = r7 + 1
            byte r1 = r17[r0]
            r0 = -12
            if (r5 > r0) goto L_0x0176
            if (r2 > r4) goto L_0x0176
            if (r1 > r4) goto L_0x0176
            int r0 = r2 << 8
            r5 = r5 ^ r0
            int r0 = r1 << 16
        L_0x01d6:
            r5 = r5 ^ r0
            return r5
        L_0x01d8:
            byte r1 = r17[r7]
            r0 = -12
            if (r5 > r0) goto L_0x0176
            if (r1 > r4) goto L_0x0176
            int r0 = r1 << 8
            goto L_0x01d6
        L_0x01e3:
            r0 = -12
            if (r5 <= r0) goto L_0x015b
            goto L_0x0176
        L_0x01e8:
            r5 = r7
            goto L_0x015c
        L_0x01eb:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7XY.A01(byte[], int, int):int");
    }

    public String A02(byte[] bArr, int i, int i2) {
        int i3;
        byte b;
        int i4;
        int i5;
        if (this instanceof C130876cg) {
            Charset charset = C155647fF.A04;
            String A0W = AnonymousClass6CA.A0W(charset, bArr, i, i2);
            if (!A0W.contains("�") || Arrays.equals(A0W.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                return A0W;
            }
            throw AnonymousClass6u5.A02("Protocol message had invalid UTF-8.");
        }
        int length = bArr.length;
        if ((i | i2 | ((length - i) - i2)) >= 0) {
            int i6 = i + i2;
            char[] cArr = new char[i2];
            int i7 = 0;
            while (r13 < i6) {
                byte b2 = bArr[r13];
                if (b2 < 0) {
                    break;
                }
                i = r13 + 1;
                cArr[i3] = (char) b2;
                i7 = i3 + 1;
            }
            while (r13 < i6) {
                int i8 = r13 + 1;
                byte b3 = bArr[r13];
                if (b3 >= 0) {
                    int i9 = i3 + 1;
                    cArr[i3] = (char) b3;
                    while (i8 < i6) {
                        byte b4 = bArr[i8];
                        if (b4 < 0) {
                            break;
                        }
                        i8++;
                        cArr[i9] = (char) b4;
                        i9++;
                    }
                    r13 = i8;
                    i3 = i9;
                } else {
                    if (b3 >= -32) {
                        if (b3 < -16) {
                            if (i8 < i6 - 1) {
                                int i10 = i8 + 1;
                                byte b5 = bArr[i8];
                                r13 = i10 + 1;
                                b = bArr[i10];
                                i4 = i3 + 1;
                                if (b5 <= -65) {
                                    if (b3 == -32) {
                                        if (b5 < -96) {
                                        }
                                    } else if (b3 == -19 && b5 >= -96) {
                                    }
                                    if (b <= -65) {
                                        i5 = ((b3 & 15) << 12) | ((b5 & 63) << 6);
                                    }
                                }
                                throw AnonymousClass6u5.A02("Protocol message had invalid UTF-8.");
                            }
                        } else if (i8 < i6 - 2) {
                            int i11 = i8 + 1;
                            byte b6 = bArr[i8];
                            int i12 = i11 + 1;
                            byte b7 = bArr[i11];
                            r13 = i12 + 1;
                            byte b8 = bArr[i12];
                            int i13 = i3 + 1;
                            if (b6 > -65 || AnonymousClass6C9.A08(b3, b6) != 0 || b7 > -65 || b8 > -65) {
                                throw AnonymousClass6u5.A02("Protocol message had invalid UTF-8.");
                            }
                            cArr[i13] = (char) ((AnonymousClass6C9.A0H(cArr, b7, ((b3 & 7) << 18) | ((b6 & 63) << 12), b8, i3) & 1023) + 56320);
                            i3 = i13 + 1;
                        }
                        throw AnonymousClass6u5.A02("Protocol message had invalid UTF-8.");
                    } else if (i8 < i6) {
                        r13 = i8 + 1;
                        b = bArr[i8];
                        i4 = i3 + 1;
                        if (b3 < -62 || b > -65) {
                            throw AnonymousClass6u5.A02("Protocol message had invalid UTF-8.");
                        }
                        i5 = (b3 & 31) << 6;
                    } else {
                        throw AnonymousClass6u5.A02("Protocol message had invalid UTF-8.");
                    }
                    cArr[i3] = (char) (i5 | (b & 63));
                    i3 = i4;
                }
            }
            return new String(cArr, 0, i3);
        }
        Object[] A1X = AnonymousClass0x9.A1X();
        C86604Kt.A1X(A1X, length, 0, i, 1);
        AnonymousClass000.A1N(A1X, i2);
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", A1X));
    }
}
