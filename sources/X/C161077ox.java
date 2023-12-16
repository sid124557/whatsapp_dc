package X;

/* renamed from: X.7ox  reason: invalid class name and case insensitive filesystem */
public final class C161077ox {
    public static final C158257jg A00;

    static {
        C158257jg r0;
        if (!C162337rj.A06 || !C162337rj.A07) {
            r0 = new AnonymousClass6W7();
        } else {
            r0 = new AnonymousClass6W8();
        }
        A00 = r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008c, code lost:
        if (r13 < 2048) goto L_0x008e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0072 A[LOOP:1: B:19:0x0072->B:25:0x0085, LOOP_START, PHI: r1 r2 r14 
      PHI: (r1v20 char) = (r1v19 char), (r1v26 char) binds: [B:17:0x006c, B:25:0x0085] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r2v15 long) = (r2v14 long), (r2v25 long) binds: [B:17:0x006c, B:25:0x0085] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r14v2 int) = (r14v1 int), (r14v8 int) binds: [B:17:0x006c, B:25:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(java.lang.CharSequence r22, java.nio.ByteBuffer r23) {
        /*
            X.7jg r4 = A00
            r8 = r23
            boolean r0 = r8.hasArray()
            r9 = r22
            if (r0 == 0) goto L_0x0026
            int r3 = r8.arrayOffset()
            byte[] r2 = r8.array()
            int r1 = r8.position()
            int r1 = r1 + r3
            int r0 = r8.remaining()
            int r0 = r4.A00(r9, r2, r1, r0)
            int r0 = r0 - r3
        L_0x0022:
            r8.position(r0)
            return
        L_0x0026:
            boolean r0 = r8.isDirect()
            if (r0 == 0) goto L_0x0172
            boolean r0 = r4 instanceof X.AnonymousClass6W8
            if (r0 == 0) goto L_0x0172
            X.7bt r7 = X.C162337rj.A02
            long r0 = X.C162337rj.A01
            long r22 = r7.A05(r8, r0)
            int r0 = r8.position()
            long r2 = (long) r0
            long r2 = r2 + r22
            int r0 = r8.limit()
            long r4 = (long) r0
            long r4 = r4 + r22
            int r6 = r9.length()
            long r0 = (long) r6
            long r13 = r4 - r2
            java.lang.String r15 = " at index "
            java.lang.String r12 = "Failed writing "
            int r10 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r10 > 0) goto L_0x015a
            r14 = 0
        L_0x0056:
            r1 = 128(0x80, float:1.794E-43)
            r20 = 1
            if (r14 >= r6) goto L_0x006c
            char r0 = r9.charAt(r14)
            if (r0 >= r1) goto L_0x006c
            long r10 = r2 + r20
            byte r0 = (byte) r0
            r7.A07(r2, r0)
            int r14 = r14 + 1
            r2 = r10
            goto L_0x0056
        L_0x006c:
            if (r14 != r6) goto L_0x0072
        L_0x006e:
            long r2 = r2 - r22
            int r0 = (int) r2
            goto L_0x0022
        L_0x0072:
            if (r14 >= r6) goto L_0x006e
            char r13 = r9.charAt(r14)
            if (r13 >= r1) goto L_0x008a
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x008e
            long r10 = r2 + r20
            byte r0 = (byte) r13
            r7.A07(r2, r0)
            r2 = r10
        L_0x0085:
            int r14 = r14 + 1
            r1 = 128(0x80, float:1.794E-43)
            goto L_0x0072
        L_0x008a:
            r0 = 2048(0x800, float:2.87E-42)
            if (r13 >= r0) goto L_0x00ac
        L_0x008e:
            r0 = 2
            long r10 = r4 - r0
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x00ac
            long r0 = r2 + r20
            int r10 = r13 >>> 6
            r10 = r10 | 960(0x3c0, float:1.345E-42)
            byte r10 = (byte) r10
            r7.A07(r2, r10)
            long r2 = r0 + r20
            r11 = r13 & 63
            r10 = 128(0x80, float:1.794E-43)
            r11 = r11 | r10
            byte r10 = (byte) r11
        L_0x00a8:
            r7.A07(r0, r10)
            goto L_0x0085
        L_0x00ac:
            r10 = 57343(0xdfff, float:8.0355E-41)
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r13 < r1) goto L_0x00b6
            if (r10 >= r13) goto L_0x00de
        L_0x00b6:
            r18 = 3
            long r16 = r4 - r18
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x00de
            long r10 = r2 + r20
            int r0 = r13 >>> 12
            r0 = r0 | 480(0x1e0, float:6.73E-43)
            byte r0 = (byte) r0
            r7.A07(r2, r0)
            long r0 = r10 + r20
            int r2 = r13 >>> 6
            r2 = r2 & 63
            r16 = 128(0x80, float:1.794E-43)
            r2 = r2 | r16
            byte r2 = (byte) r2
            r7.A07(r10, r2)
            long r2 = r0 + r20
            r10 = r13 & 63
            r10 = r10 | r16
            byte r10 = (byte) r10
            goto L_0x00a8
        L_0x00de:
            r18 = 4
            long r16 = r4 - r18
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x012f
            int r10 = r14 + 1
            if (r10 == r6) goto L_0x0127
            char r1 = r9.charAt(r10)
            boolean r0 = java.lang.Character.isSurrogatePair(r13, r1)
            if (r0 == 0) goto L_0x0126
            int r14 = java.lang.Character.toCodePoint(r13, r1)
            long r0 = r2 + r20
            int r11 = r14 >>> 18
            r11 = r11 | 240(0xf0, float:3.36E-43)
            byte r11 = (byte) r11
            r7.A07(r2, r11)
            long r2 = r0 + r20
            int r11 = r14 >>> 12
            r11 = r11 & 63
            r13 = 128(0x80, float:1.794E-43)
            r11 = r11 | r13
            byte r11 = (byte) r11
            r7.A07(r0, r11)
            long r0 = r2 + r20
            int r11 = r14 >>> 6
            r11 = r11 & 63
            r11 = r11 | r13
            byte r11 = (byte) r11
            r7.A07(r2, r11)
            long r2 = r0 + r20
            r11 = r14 & 63
            r11 = r11 | r13
            byte r11 = (byte) r11
            r7.A07(r0, r11)
            r14 = r10
            goto L_0x0085
        L_0x0126:
            r14 = r10
        L_0x0127:
            int r0 = r14 + -1
            X.6zm r1 = new X.6zm
            r1.<init>(r0, r6)
            throw r1
        L_0x012f:
            if (r1 > r13) goto L_0x0147
            if (r13 > r10) goto L_0x0147
            int r0 = r14 + 1
            if (r0 == r6) goto L_0x0141
            char r0 = r9.charAt(r0)
            boolean r0 = java.lang.Character.isSurrogatePair(r13, r0)
            if (r0 != 0) goto L_0x0147
        L_0x0141:
            X.6zm r1 = new X.6zm
            r1.<init>(r14, r6)
            throw r1
        L_0x0147:
            r0 = 46
            java.lang.StringBuilder r0 = X.AnonymousClass6C8.A0g(r0, r12)
            r0.append(r13)
            java.lang.String r0 = X.AnonymousClass000.A0Z(r15, r0, r2)
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            r1.<init>(r0)
            throw r1
        L_0x015a:
            int r0 = r6 + -1
            char r2 = r9.charAt(r0)
            int r1 = r8.limit()
            r0 = 37
            java.lang.StringBuilder r0 = X.AnonymousClass6C8.A0g(r0, r12)
            r0.append(r2)
            java.lang.ArrayIndexOutOfBoundsException r1 = X.AnonymousClass6C7.A0T(r15, r0, r1)
            throw r1
        L_0x0172:
            int r4 = r9.length()
            int r3 = r8.position()
            r1 = 0
        L_0x017b:
            r5 = 128(0x80, float:1.794E-43)
            if (r1 >= r4) goto L_0x018e
            char r0 = r9.charAt(r1)     // Catch:{ IndexOutOfBoundsException -> 0x022f }
            if (r0 >= r5) goto L_0x018e
            int r2 = r3 + r1
            byte r0 = (byte) r0     // Catch:{ IndexOutOfBoundsException -> 0x022f }
            r8.put(r2, r0)     // Catch:{ IndexOutOfBoundsException -> 0x022f }
            int r1 = r1 + 1
            goto L_0x017b
        L_0x018e:
            if (r1 != r4) goto L_0x0196
            int r0 = r3 + r1
            r8.position(r0)     // Catch:{ IndexOutOfBoundsException -> 0x022f }
            return
        L_0x0196:
            int r3 = r3 + r1
        L_0x0197:
            if (r1 >= r4) goto L_0x022a
            char r6 = r9.charAt(r1)     // Catch:{ IndexOutOfBoundsException -> 0x022f }
            if (r6 < r5) goto L_0x0213
            r0 = 2048(0x800, float:2.87E-42)
            if (r6 >= r0) goto L_0x01b5
            int r2 = r3 + 1
            int r0 = r6 >>> 6
            r0 = r0 | 192(0xc0, float:2.69E-43)
            byte r0 = (byte) r0     // Catch:{ IndexOutOfBoundsException -> 0x022f }
            r8.put(r3, r0)     // Catch:{ IndexOutOfBoundsException -> 0x022e }
            r0 = r6 & 63
            r0 = r0 | r5
            byte r0 = (byte) r0     // Catch:{ IndexOutOfBoundsException -> 0x022e }
            r8.put(r2, r0)     // Catch:{ IndexOutOfBoundsException -> 0x022e }
            goto L_0x0218
        L_0x01b5:
            r0 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r0) goto L_0x01fb
            r0 = 57343(0xdfff, float:8.0355E-41)
            if (r0 < r6) goto L_0x01fb
            int r2 = r1 + 1
            if (r2 == r4) goto L_0x0224
            char r1 = r9.charAt(r2)     // Catch:{ IndexOutOfBoundsException -> 0x0222 }
            boolean r0 = java.lang.Character.isSurrogatePair(r6, r1)     // Catch:{ IndexOutOfBoundsException -> 0x0222 }
            if (r0 == 0) goto L_0x021f
            int r6 = java.lang.Character.toCodePoint(r6, r1)     // Catch:{ IndexOutOfBoundsException -> 0x0222 }
            int r1 = r3 + 1
            int r0 = r6 >>> 18
            r0 = r0 | 240(0xf0, float:3.36E-43)
            byte r0 = (byte) r0     // Catch:{ IndexOutOfBoundsException -> 0x0222 }
            r8.put(r3, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0221 }
            int r3 = r1 + 1
            int r0 = r6 >>> 12
            r0 = r0 & 63
            r0 = r0 | r5
            byte r0 = (byte) r0     // Catch:{ IndexOutOfBoundsException -> 0x0221 }
            r8.put(r1, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0222 }
            int r1 = r3 + 1
            int r0 = r6 >>> 6
            r0 = r0 & 63
            r0 = r0 | r5
            byte r0 = (byte) r0     // Catch:{ IndexOutOfBoundsException -> 0x0222 }
            r8.put(r3, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0221 }
            r0 = r6 & 63
            r0 = r0 | r5
            byte r0 = (byte) r0     // Catch:{ IndexOutOfBoundsException -> 0x0221 }
            r8.put(r1, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0221 }
            r3 = r1
            r1 = r2
            goto L_0x0219
        L_0x01fb:
            int r2 = r3 + 1
            int r0 = r6 >>> 12
            r0 = r0 | 224(0xe0, float:3.14E-43)
            byte r0 = (byte) r0     // Catch:{ IndexOutOfBoundsException -> 0x022e }
            r8.put(r3, r0)     // Catch:{ IndexOutOfBoundsException -> 0x022e }
            int r3 = r2 + 1
            int r0 = r6 >>> 6
            r0 = r0 & 63
            r0 = r0 | r5
            byte r0 = (byte) r0     // Catch:{ IndexOutOfBoundsException -> 0x022e }
            r8.put(r2, r0)     // Catch:{ IndexOutOfBoundsException -> 0x022f }
            r6 = r6 & 63
            r6 = r6 | r5
        L_0x0213:
            byte r0 = (byte) r6     // Catch:{ IndexOutOfBoundsException -> 0x022f }
            r8.put(r3, r0)     // Catch:{ IndexOutOfBoundsException -> 0x022f }
            goto L_0x0219
        L_0x0218:
            r3 = r2
        L_0x0219:
            int r1 = r1 + 1
            int r3 = r3 + 1
            goto L_0x0197
        L_0x021f:
            r1 = r2
            goto L_0x0224
        L_0x0221:
            r3 = r1
        L_0x0222:
            r1 = r2
            goto L_0x022f
        L_0x0224:
            X.6zm r0 = new X.6zm     // Catch:{ IndexOutOfBoundsException -> 0x022f }
            r0.<init>(r1, r4)     // Catch:{ IndexOutOfBoundsException -> 0x022f }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x022f }
        L_0x022a:
            r8.position(r3)     // Catch:{ IndexOutOfBoundsException -> 0x022f }
            goto L_0x024e
        L_0x022e:
            r3 = r2
        L_0x022f:
            int r2 = r8.position()
            int r0 = r8.position()
            int r3 = r3 - r0
            int r0 = r3 + 1
            int r0 = java.lang.Math.max(r1, r0)
            int r2 = r2 + r0
            char r0 = r9.charAt(r1)
            java.lang.StringBuilder r1 = X.AnonymousClass6C9.A0j(r0)
            java.lang.String r0 = " at index "
            java.lang.ArrayIndexOutOfBoundsException r0 = X.AnonymousClass6C7.A0T(r0, r1, r2)
            throw r0
        L_0x024e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161077ox.A01(java.lang.CharSequence, java.nio.ByteBuffer):void");
    }

    public static int A00(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new C143966zm(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw AnonymousClass6C7.A0V("UTF-8 length does not fit in int: ", AnonymousClass6CA.A0Y(54), ((long) i3) + 4294967296L);
    }
}
