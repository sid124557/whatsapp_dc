package X;

/* renamed from: X.9U9  reason: invalid class name */
public class AnonymousClass9U9 {
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b0, code lost:
        android.util.Log.v("ExifUtil", "Orientation not found");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(byte[] r11) {
        /*
            r8 = 0
            if (r11 == 0) goto L_0x006a
            r9 = 0
        L_0x0004:
            int r0 = r9 + 3
            int r10 = r11.length
            r2 = 4
            r6 = 1
            r7 = 8
            r5 = 2
            if (r0 >= r10) goto L_0x00b0
            int r4 = r9 + 1
            byte r1 = r11[r9]
            r0 = 255(0xff, float:3.57E-43)
            r1 = r1 & r0
            if (r1 != r0) goto L_0x00b0
            byte r1 = r11[r4]
            r1 = r1 & r0
            if (r1 == r0) goto L_0x00ad
            int r4 = r4 + 1
            r0 = 216(0xd8, float:3.03E-43)
            if (r1 == r0) goto L_0x00ad
            if (r1 == r6) goto L_0x00ad
            r0 = 217(0xd9, float:3.04E-43)
            if (r1 == r0) goto L_0x00b0
            r0 = 218(0xda, float:3.05E-43)
            if (r1 == r0) goto L_0x00b0
            int r3 = A01(r11, r4, r5, r8)
            if (r3 < r5) goto L_0x00a8
            int r9 = r4 + r3
            if (r9 > r10) goto L_0x00a8
            r0 = 225(0xe1, float:3.15E-43)
            if (r1 != r0) goto L_0x0004
            if (r3 < r7) goto L_0x0004
            int r0 = r4 + 2
            int r1 = A01(r11, r0, r2, r8)
            r0 = 1165519206(0x45786966, float:3974.5874)
            if (r1 != r0) goto L_0x0004
            int r0 = r4 + 6
            int r0 = A01(r11, r0, r5, r8)
            if (r0 != 0) goto L_0x0004
            int r4 = r4 + 8
            int r3 = r3 + -8
            if (r3 <= r7) goto L_0x00b0
            int r1 = A01(r11, r4, r2, r8)
            r0 = 1229531648(0x49492a00, float:823968.0)
            if (r1 == r0) goto L_0x006d
            r0 = 1296891946(0x4d4d002a, float:2.14958752E8)
            if (r1 == r0) goto L_0x006c
            java.lang.String r1 = "ExifUtil"
            java.lang.String r0 = "Invalid byte order"
        L_0x0067:
            android.util.Log.e(r1, r0)
        L_0x006a:
            r0 = 0
            return r0
        L_0x006c:
            r6 = 0
        L_0x006d:
            int r0 = r4 + 4
            int r0 = A01(r11, r0, r2, r6)
            int r1 = r0 + 2
            r0 = 10
            if (r1 < r0) goto L_0x00a3
            if (r1 > r3) goto L_0x00a3
            int r4 = r4 + r1
            int r3 = r3 - r1
            int r0 = r4 + -2
            int r0 = A01(r11, r0, r5, r6)
        L_0x0083:
            int r2 = r0 + -1
            if (r0 <= 0) goto L_0x00b0
            r0 = 12
            if (r3 < r0) goto L_0x00b0
            int r1 = A01(r11, r4, r5, r6)
            r0 = 274(0x112, float:3.84E-43)
            if (r1 != r0) goto L_0x009d
            int r0 = r4 + 8
            int r0 = A01(r11, r0, r5, r6)
            switch(r0) {
                case 3: goto L_0x00b8;
                case 4: goto L_0x00b8;
                case 5: goto L_0x00bb;
                case 6: goto L_0x00be;
                case 7: goto L_0x00be;
                case 8: goto L_0x00bb;
                default: goto L_0x009c;
            }
        L_0x009c:
            goto L_0x006a
        L_0x009d:
            int r4 = r4 + 12
            int r3 = r3 + -12
            r0 = r2
            goto L_0x0083
        L_0x00a3:
            java.lang.String r1 = "ExifUtil"
            java.lang.String r0 = "Invalid offset"
            goto L_0x0067
        L_0x00a8:
            java.lang.String r1 = "ExifUtil"
            java.lang.String r0 = "Invalid length"
            goto L_0x0067
        L_0x00ad:
            r9 = r4
            goto L_0x0004
        L_0x00b0:
            java.lang.String r1 = "ExifUtil"
            java.lang.String r0 = "Orientation not found"
            android.util.Log.v(r1, r0)
            goto L_0x006a
        L_0x00b8:
            r0 = 180(0xb4, float:2.52E-43)
            return r0
        L_0x00bb:
            r0 = 270(0x10e, float:3.78E-43)
            return r0
        L_0x00be:
            r0 = 90
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9U9.A00(byte[]):int");
    }

    public static int A01(byte[] bArr, int i, int i2, boolean z) {
        int i3 = 1;
        if (z) {
            i += i2 - 1;
            i3 = -1;
        }
        byte b = 0;
        while (true) {
            int i4 = i2 - 1;
            if (i2 <= 0) {
                return b;
            }
            b = (bArr[i] & 255) | (b << 8);
            i += i3;
            i2 = i4;
        }
    }
}
