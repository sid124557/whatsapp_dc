package X;

/* renamed from: X.07h  reason: invalid class name and case insensitive filesystem */
public class C009407h extends AnonymousClass0OK {
    public AnonymousClass0T0 A00;
    public boolean A01;
    public boolean A02 = false;

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00bd, code lost:
        if (r4 != 0) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00f3, code lost:
        if (r0 != null) goto L_0x00f5;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x00de */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00de A[SYNTHETIC, Splitter:B:63:0x00de] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0T0 A02(android.content.Context r10) {
        /*
            r9 = this;
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x0007
            X.0T0 r5 = r9.A00
            return r5
        L_0x0007:
            X.0QW r0 = r9.A01
            X.0eF r7 = r0.A04
            X.0GJ r1 = r0.A01
            X.0GJ r0 = X.AnonymousClass0GJ.VISIBLE
            r2 = 1
            boolean r1 = X.AnonymousClass000.A1Y(r1, r0)
            boolean r3 = r9.A01
            X.0Mp r0 = r7.A0D
            if (r0 != 0) goto L_0x0113
            r6 = 0
        L_0x001b:
            if (r3 == 0) goto L_0x0102
            if (r1 == 0) goto L_0x00fc
            if (r0 == 0) goto L_0x0110
            int r4 = r0.A04
        L_0x0023:
            r3 = 0
            if (r0 == 0) goto L_0x003e
            X.0Mp r0 = r7.A0M()
            r0.A01 = r3
            X.0Mp r0 = r7.A0M()
            r0.A02 = r3
            X.0Mp r0 = r7.A0M()
            r0.A04 = r3
            X.0Mp r0 = r7.A0M()
            r0.A05 = r3
        L_0x003e:
            android.view.ViewGroup r0 = r7.A0C
            r5 = 0
            if (r0 == 0) goto L_0x0051
            r8 = 2131434739(0x7f0b1cf3, float:1.84913E38)
            java.lang.Object r0 = r0.getTag(r8)
            if (r0 == 0) goto L_0x0051
            android.view.ViewGroup r0 = r7.A0C
            r0.setTag(r8, r5)
        L_0x0051:
            android.view.ViewGroup r0 = r7.A0C
            if (r0 == 0) goto L_0x0060
            android.animation.LayoutTransition r0 = r0.getLayoutTransition()
            if (r0 == 0) goto L_0x0060
        L_0x005b:
            r9.A00 = r5
            r9.A02 = r2
            return r5
        L_0x0060:
            android.view.animation.Animation r0 = r7.A0L(r6, r4, r1)
            if (r0 != 0) goto L_0x00f5
            if (r4 != 0) goto L_0x007f
            if (r6 == 0) goto L_0x005b
            r0 = 4097(0x1001, float:5.741E-42)
            if (r6 == r0) goto L_0x00c9
            r0 = 8194(0x2002, float:1.1482E-41)
            if (r6 == r0) goto L_0x00c0
            r0 = 8197(0x2005, float:1.1486E-41)
            if (r6 == r0) goto L_0x0099
            r0 = 4099(0x1003, float:5.744E-42)
            if (r6 == r0) goto L_0x0090
            r0 = 4100(0x1004, float:5.745E-42)
            if (r6 == r0) goto L_0x00a2
            r4 = -1
        L_0x007f:
            android.content.res.Resources r0 = r10.getResources()
            java.lang.String r1 = r0.getResourceTypeName(r4)
            java.lang.String r0 = "anim"
            boolean r3 = r0.equals(r1)
            if (r3 == 0) goto L_0x00de
            goto L_0x00d2
        L_0x0090:
            r4 = 2130837510(0x7f020006, float:1.7279976E38)
            if (r1 == 0) goto L_0x007f
            r4 = 2130837509(0x7f020005, float:1.7279974E38)
            goto L_0x007f
        L_0x0099:
            r0 = 16842939(0x10100bb, float:2.3694082E-38)
            if (r1 == 0) goto L_0x00aa
            r0 = 16842938(0x10100ba, float:2.369408E-38)
            goto L_0x00aa
        L_0x00a2:
            r0 = 16842937(0x10100b9, float:2.3694076E-38)
            if (r1 == 0) goto L_0x00aa
            r0 = 16842936(0x10100b8, float:2.3694074E-38)
        L_0x00aa:
            int[] r1 = new int[r2]
            r1[r3] = r0
            r0 = 16973825(0x1030001, float:2.4060903E-38)
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r0, r1)
            r0 = -1
            int r4 = r1.getResourceId(r3, r0)
            r1.recycle()
            if (r4 == 0) goto L_0x005b
            goto L_0x007f
        L_0x00c0:
            r4 = 2130837508(0x7f020004, float:1.7279972E38)
            if (r1 == 0) goto L_0x007f
            r4 = 2130837507(0x7f020003, float:1.727997E38)
            goto L_0x007f
        L_0x00c9:
            r4 = 2130837512(0x7f020008, float:1.727998E38)
            if (r1 == 0) goto L_0x007f
            r4 = 2130837511(0x7f020007, float:1.7279978E38)
            goto L_0x007f
        L_0x00d2:
            android.view.animation.Animation r0 = android.view.animation.AnimationUtils.loadAnimation(r10, r4)     // Catch:{ NotFoundException -> 0x0117, RuntimeException -> 0x00de }
            if (r0 == 0) goto L_0x005b
            X.0T0 r1 = new X.0T0     // Catch:{ NotFoundException -> 0x0117, RuntimeException -> 0x00de }
            r1.<init>((android.view.animation.Animation) r0)     // Catch:{ NotFoundException -> 0x0117, RuntimeException -> 0x00de }
            goto L_0x00e9
        L_0x00de:
            android.animation.Animator r0 = android.animation.AnimatorInflater.loadAnimator(r10, r4)     // Catch:{ RuntimeException -> 0x00ec }
            if (r0 == 0) goto L_0x005b
            X.0T0 r1 = new X.0T0     // Catch:{ RuntimeException -> 0x00ec }
            r1.<init>((android.animation.Animator) r0)     // Catch:{ RuntimeException -> 0x00ec }
        L_0x00e9:
            r5 = r1
            goto L_0x005b
        L_0x00ec:
            r0 = move-exception
            if (r3 != 0) goto L_0x0119
            android.view.animation.Animation r0 = android.view.animation.AnimationUtils.loadAnimation(r10, r4)
            if (r0 == 0) goto L_0x005b
        L_0x00f5:
            X.0T0 r5 = new X.0T0
            r5.<init>((android.view.animation.Animation) r0)
            goto L_0x005b
        L_0x00fc:
            if (r0 == 0) goto L_0x0110
            int r4 = r0.A05
            goto L_0x0023
        L_0x0102:
            if (r1 == 0) goto L_0x010a
            if (r0 == 0) goto L_0x0110
            int r4 = r0.A01
            goto L_0x0023
        L_0x010a:
            if (r0 == 0) goto L_0x0110
            int r4 = r0.A02
            goto L_0x0023
        L_0x0110:
            r4 = 0
            goto L_0x0023
        L_0x0113:
            int r6 = r0.A03
            goto L_0x001b
        L_0x0117:
            r0 = move-exception
            throw r0
        L_0x0119:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C009407h.A02(android.content.Context):X.0T0");
    }

    public C009407h(AnonymousClass0QU r2, AnonymousClass0QW r3, boolean z) {
        super(r2, r3);
        this.A01 = z;
    }
}
