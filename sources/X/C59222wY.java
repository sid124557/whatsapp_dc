package X;

/* renamed from: X.2wY  reason: invalid class name and case insensitive filesystem */
public final class C59222wY {
    public static final byte[] A01 = {-93, -81, -63, 35, -110, -88, -95, -40, 126, -124, -80, -80, -126, 122, -47, -94};
    public static final byte[] A02 = {-93, -81, -63, 35, -110, -88, -95, -40, 126, -124, -80, -80};
    public static final byte[] A03 = {-36, -126, -121, -22, -55, 119, -71, -37, 120, 47, -71, 121, -26, -22, 100, -81, 45, 103, -67, 15, -67, -88, -22, 15, 114, -5, 81, -103, 113, -84, 12, -105};
    public static final byte[] A04 = {-7, 71, 124, 78, 52, -54, 47, 3, 87, 98, -48, 115, -53, 25, -3, 62, -105, 76, -20, 126, -91, -4, 49, -11, -64, -104, 62, 25, -14, 43, -99, -124};
    public static final byte[] A05 = {-64, -64, -84, 13, -27};
    public Boolean A00;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        if (java.util.Arrays.equals(A01, r5) != false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(java.lang.String r11, byte[] r12) {
        /*
            r10 = this;
            java.lang.Boolean r0 = r10.A00
            r9 = 0
            if (r0 != 0) goto L_0x0092
            if (r12 == 0) goto L_0x0096
            r8 = 1
            if (r11 == 0) goto L_0x004e
            byte[] r1 = X.AnonymousClass0x2.A1a(r11)
            int r0 = r1.length
            byte[] r7 = java.util.Arrays.copyOf(r1, r0)
            X.C162457s7.A0D(r7)
            int r6 = r7.length
            byte[] r5 = new byte[r6]
            r4 = 0
            r0 = 0
        L_0x001b:
            if (r4 >= r6) goto L_0x002f
            byte r3 = r7[r4]
            byte[] r2 = A05
            int r1 = r0 + 1
            byte r0 = r2[r0]
            r0 = r0 ^ r3
            byte r0 = (byte) r0
            r5[r4] = r0
            int r0 = r2.length
            int r0 = r1 % r0
            int r4 = r4 + 1
            goto L_0x001b
        L_0x002f:
            byte[] r0 = A02
            boolean r0 = java.util.Arrays.equals(r0, r5)
            if (r0 != 0) goto L_0x0040
            byte[] r0 = A01
            boolean r1 = java.util.Arrays.equals(r0, r5)
            r0 = 1
            if (r1 == 0) goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r10.A00 = r0
            boolean r0 = X.AnonymousClass0x9.A1Q(r0)
            if (r0 == 0) goto L_0x004e
            return r8
        L_0x004e:
            java.security.MessageDigest r0 = X.AnonymousClass0x7.A0t()
            byte[] r1 = r0.digest(r12)
            X.C162457s7.A0D(r1)
            int r0 = r1.length
            byte[] r7 = java.util.Arrays.copyOf(r1, r0)
            X.C162457s7.A0D(r7)
            int r6 = r7.length
            byte[] r5 = new byte[r6]
            r4 = 0
            r0 = 0
        L_0x0066:
            if (r4 >= r6) goto L_0x007a
            byte r3 = r7[r4]
            byte[] r2 = A05
            int r1 = r0 + 1
            byte r0 = r2[r0]
            r0 = r0 ^ r3
            byte r0 = (byte) r0
            r5[r4] = r0
            int r0 = r2.length
            int r0 = r1 % r0
            int r4 = r4 + 1
            goto L_0x0066
        L_0x007a:
            byte[] r0 = A03
            boolean r0 = java.util.Arrays.equals(r0, r5)
            if (r0 != 0) goto L_0x0097
            byte[] r0 = A04
            boolean r0 = java.util.Arrays.equals(r0, r5)
            if (r0 != 0) goto L_0x0097
        L_0x008a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r10.A00 = r0
            if (r0 == 0) goto L_0x0096
        L_0x0092:
            boolean r9 = r0.booleanValue()
        L_0x0096:
            return r9
        L_0x0097:
            r8 = 0
            goto L_0x008a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59222wY.A00(java.lang.String, byte[]):boolean");
    }
}
