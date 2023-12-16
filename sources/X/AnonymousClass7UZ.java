package X;

/* renamed from: X.7UZ  reason: invalid class name */
public final class AnonymousClass7UZ {
    public float A00 = -3.4028235E38f;
    public float A01 = -3.4028235E38f;
    public float A02 = 1.0f;
    public int A03 = 0;
    public int A04 = 1;
    public int A05 = Integer.MIN_VALUE;
    public int A06 = 2;
    public int A07 = Integer.MIN_VALUE;
    public long A08 = 0;
    public long A09 = 0;
    public CharSequence A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        if (r1 == 5) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0058, code lost:
        if (r2 > 1.0f) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x007e, code lost:
        if (r1 == 0) goto L_0x005a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C157757ip A00() {
        /*
            r7 = this;
            float r3 = r7.A01
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0015
            int r1 = r7.A06
            r0 = 4
            if (r1 == r0) goto L_0x0089
            r0 = 5
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r1 == r0) goto L_0x0015
            r3 = 1056964608(0x3f000000, float:0.5)
        L_0x0015:
            int r6 = r7.A05
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 != r0) goto L_0x002b
            int r1 = r7.A06
            r0 = 1
            if (r1 == r0) goto L_0x0087
            r0 = 3
            if (r1 == r0) goto L_0x002a
            r0 = 4
            if (r1 == r0) goto L_0x0087
            r0 = 5
            r6 = 1
            if (r1 != r0) goto L_0x002b
        L_0x002a:
            r6 = 2
        L_0x002b:
            X.7ip r4 = new X.7ip
            r4.<init>()
            int r1 = r7.A06
            r0 = 1
            if (r1 == r0) goto L_0x0084
            r0 = 2
            if (r1 == r0) goto L_0x0081
            r0 = 3
            if (r1 == r0) goto L_0x003e
            r0 = 4
            if (r1 == r0) goto L_0x0084
        L_0x003e:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_OPPOSITE
        L_0x0040:
            r4.A0D = r0
            float r2 = r7.A00
            int r1 = r7.A04
            r5 = 1065353216(0x3f800000, float:1.0)
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x007b
            if (r1 != 0) goto L_0x005c
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x005a
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x005c
        L_0x005a:
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x005c:
            r4.A01 = r2
            r4.A07 = r1
            int r0 = r7.A03
            r4.A06 = r0
            r4.A02 = r3
            r4.A08 = r6
            float r2 = r7.A02
            if (r6 == 0) goto L_0x008b
            r0 = 1
            if (r6 == r0) goto L_0x008e
            r0 = 2
            if (r6 == r0) goto L_0x0097
            java.lang.String r0 = java.lang.String.valueOf(r6)
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x007b:
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            if (r1 != 0) goto L_0x005c
            goto L_0x005a
        L_0x0081:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x0040
        L_0x0084:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L_0x0040
        L_0x0087:
            r6 = 0
            goto L_0x002b
        L_0x0089:
            r3 = 0
            goto L_0x0015
        L_0x008b:
            float r5 = r5 - r3
        L_0x008c:
            r3 = r5
            goto L_0x0097
        L_0x008e:
            r0 = 1056964608(0x3f000000, float:0.5)
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00a8
            float r3 = r3 * r1
        L_0x0097:
            float r0 = java.lang.Math.min(r2, r3)
            r4.A04 = r0
            int r0 = r7.A07
            r4.A0A = r0
            java.lang.CharSequence r0 = r7.A0A
            if (r0 == 0) goto L_0x00a7
            r4.A0E = r0
        L_0x00a7:
            return r4
        L_0x00a8:
            float r5 = r5 - r3
            float r5 = r5 * r1
            goto L_0x008c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7UZ.A00():X.7ip");
    }
}
