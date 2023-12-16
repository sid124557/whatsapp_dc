package X;

/* renamed from: X.87t  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1690487t implements C180718lW {
    public final /* synthetic */ AnonymousClass6PJ A00;
    public final /* synthetic */ Object A01;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: X.6PM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.6PO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: X.6PM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: X.6PM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: X.6PM} */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00dc, code lost:
        if (r13 != 0) goto L_0x00de;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bbq(com.google.android.exoplayer2.Timeline r16, X.C186428vI r17) {
        /*
            r15 = this;
            X.6PJ r4 = r15.A00
            java.lang.Object r5 = r15.A01
            boolean r0 = r4 instanceof X.AnonymousClass6PO
            r9 = r16
            if (r0 == 0) goto L_0x005f
            X.6PO r4 = (X.AnonymousClass6PO) r4
            java.lang.Number r5 = (java.lang.Number) r5
            X.6tv r0 = r4.A01
            if (r0 != 0) goto L_0x0054
            int r6 = r4.A00
            r1 = -1
            r3 = 0
            int r0 = r9.A00()
            if (r6 != r1) goto L_0x0055
            r4.A00 = r0
            r6 = r0
        L_0x001f:
            long[][] r0 = r4.A02
            int r0 = r0.length
            if (r0 != 0) goto L_0x003a
            com.google.android.exoplayer2.Timeline[] r0 = r4.A07
            int r2 = r0.length
            int[] r1 = X.C86664Kz.A1Z()
            r0 = 1
            r1[r0] = r2
            r1[r3] = r6
            java.lang.Class r0 = java.lang.Long.TYPE
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            long[][] r0 = (long[][]) r0
            r4.A02 = r0
        L_0x003a:
            java.util.ArrayList r2 = r4.A05
            r0 = r17
            r2.remove(r0)
            com.google.android.exoplayer2.Timeline[] r1 = r4.A07
            int r0 = r5.intValue()
            r1[r0] = r16
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0054
            r0 = r1[r3]
        L_0x0051:
            r4.A01(r0)
        L_0x0054:
            return
        L_0x0055:
            if (r0 == r6) goto L_0x001f
            X.6tv r0 = new X.6tv
            r0.<init>()
            r4.A01 = r0
            return
        L_0x005f:
            boolean r0 = r4 instanceof X.AnonymousClass6PN
            if (r0 == 0) goto L_0x0122
            X.6PN r4 = (X.AnonymousClass6PN) r4
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x0095
            X.6PR r0 = r4.A01
            java.lang.Object r2 = r0.A01
            java.lang.Object r1 = r0.A00
            X.6PR r0 = new X.6PR
            r0.<init>(r9, r2, r1)
            r4.A01 = r0
            X.87q r0 = r4.A00
            if (r0 == 0) goto L_0x007f
            long r0 = r0.A00
            r4.A05(r0)
        L_0x007f:
            r1 = 0
        L_0x0080:
            r0 = 1
            r4.A02 = r0
            r4.A04 = r0
            X.6PR r0 = r4.A01
            r4.A01(r0)
            if (r1 == 0) goto L_0x0054
            X.87q r0 = r4.A00
            r0.getClass()
            r0.A00(r1)
            return
        L_0x0095:
            int r0 = r9.A01()
            boolean r0 = X.AnonymousClass000.A1T(r0)
            if (r0 == 0) goto L_0x00b6
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x00b1
            X.6PR r0 = r4.A01
            java.lang.Object r2 = r0.A01
            java.lang.Object r1 = r0.A00
        L_0x00a9:
            X.6PR r0 = new X.6PR
            r0.<init>(r9, r2, r1)
            r4.A01 = r0
            goto L_0x007f
        L_0x00b1:
            java.lang.Object r2 = X.C158647kK.A0F
            java.lang.Object r1 = X.AnonymousClass6PR.A02
            goto L_0x00a9
        L_0x00b6:
            X.7kK r11 = r4.A06
            r2 = 0
            r0 = 0
            r9.A0B(r11, r2, r0)
            java.lang.Object r5 = r11.A09
            X.87q r6 = r4.A00
            if (r6 == 0) goto L_0x011f
            long r2 = r6.A04
            X.6PR r8 = r4.A01
            X.6PS r6 = r6.A05
            java.lang.Object r7 = r6.A04
            X.7bH r6 = r4.A05
            r8.A0A(r6, r7)
            long r13 = r6.A02
            long r13 = r13 + r2
            X.6PR r3 = r4.A01
            r2 = 0
            r3.A0B(r11, r2, r0)
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x011f
        L_0x00de:
            X.7bH r10 = r4.A05
            r12 = 0
            android.util.Pair r0 = r9.A07(r10, r11, r12, r13)
            java.lang.Object r3 = r0.first
            long r1 = X.AnonymousClass6C8.A0R(r0)
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x00f5
            X.6PR r0 = r4.A01
            java.lang.Object r5 = r0.A01
            java.lang.Object r3 = r0.A00
        L_0x00f5:
            X.6PR r0 = new X.6PR
            r0.<init>(r9, r5, r3)
            r4.A01 = r0
            X.87q r0 = r4.A00
            if (r0 == 0) goto L_0x007f
            r4.A05(r1)
            X.6PS r2 = r0.A05
            java.lang.Object r1 = r2.A04
            X.6PR r0 = r4.A01
            java.lang.Object r0 = r0.A00
            if (r0 == 0) goto L_0x0119
            java.lang.Object r0 = X.AnonymousClass6PR.A02
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0119
            X.6PR r0 = r4.A01
            java.lang.Object r1 = r0.A00
        L_0x0119:
            X.6PS r1 = r2.A00(r1)
            goto L_0x0080
        L_0x011f:
            r13 = 0
            goto L_0x00de
        L_0x0122:
            boolean r0 = r4 instanceof X.AnonymousClass6PM
            if (r0 == 0) goto L_0x013d
            X.6PM r4 = (X.AnonymousClass6PM) r4
            int r1 = r4.A00
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r0) goto L_0x0136
            X.6OA r0 = new X.6OA
            r0.<init>(r9, r1)
            goto L_0x0051
        L_0x0136:
            X.6PP r0 = new X.6PP
            r0.<init>(r9)
            goto L_0x0051
        L_0x013d:
            r4.A01(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1690487t.Bbq(com.google.android.exoplayer2.Timeline, X.8vI):void");
    }

    public /* synthetic */ C1690487t(AnonymousClass6PJ r1, Object obj) {
        this.A00 = r1;
        this.A01 = obj;
    }
}
