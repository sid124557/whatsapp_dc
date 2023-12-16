package X;

/* renamed from: X.6Jj  reason: invalid class name and case insensitive filesystem */
public final class C125786Jj extends C1673580t {
    public static final int A00 = Float.floatToIntBits(Float.NaN);

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r2 == 805306368) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bi4(java.nio.ByteBuffer r6) {
        /*
            r5 = this;
            X.7kA r0 = r5.A00
            int r2 = r0.A02
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            if (r2 == r0) goto L_0x000d
            r1 = 805306368(0x30000000, float:4.656613E-10)
            r0 = 0
            if (r2 != r1) goto L_0x000e
        L_0x000d:
            r0 = 1
        L_0x000e:
            X.C159197lM.A02(r0)
            r0 = 805306368(0x30000000, float:4.656613E-10)
            boolean r1 = X.AnonymousClass000.A1U(r2, r0)
            int r4 = r6.position()
            int r3 = r6.limit()
            int r0 = r3 - r4
            if (r1 != 0) goto L_0x0027
            int r0 = r0 / 3
            int r0 = r0 * 4
        L_0x0027:
            java.nio.ByteBuffer r2 = r5.A00(r0)
            if (r1 == 0) goto L_0x005a
        L_0x002d:
            if (r4 >= r3) goto L_0x0080
            int r1 = X.AnonymousClass6CA.A08(r6, r4)
            int r0 = r4 + 1
            int r0 = X.AnonymousClass6CA.A08(r6, r0)
            int r0 = r0 << 8
            r1 = r1 | r0
            int r0 = r4 + 2
            int r0 = X.AnonymousClass6CA.A08(r6, r0)
            int r0 = r0 << 16
            r1 = r1 | r0
            int r0 = r4 + 3
            int r1 = X.AnonymousClass6C7.A08(r6, r0, r1)
            int r0 = A00
            if (r1 != r0) goto L_0x0054
            r0 = 0
            int r1 = java.lang.Float.floatToIntBits(r0)
        L_0x0054:
            r2.putInt(r1)
            int r4 = r4 + 4
            goto L_0x002d
        L_0x005a:
            if (r4 >= r3) goto L_0x0080
            int r0 = X.AnonymousClass6CA.A08(r6, r4)
            int r1 = r0 << 8
            int r0 = r4 + 1
            int r0 = X.AnonymousClass6CA.A08(r6, r0)
            int r0 = r0 << 16
            r1 = r1 | r0
            int r0 = r4 + 2
            int r1 = X.AnonymousClass6C7.A08(r6, r0, r1)
            int r0 = A00
            if (r1 != r0) goto L_0x007a
            r0 = 0
            int r1 = java.lang.Float.floatToIntBits(r0)
        L_0x007a:
            r2.putInt(r1)
            int r4 = r4 + 3
            goto L_0x005a
        L_0x0080:
            int r0 = r6.limit()
            r6.position(r0)
            r2.flip()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C125786Jj.Bi4(java.nio.ByteBuffer):void");
    }
}
