package X;

/* renamed from: X.31p  reason: invalid class name and case insensitive filesystem */
public final class C616331p {
    public static final Object A00(C84814Du r3, AnonymousClass4GR r4, long j) {
        if (j > 0) {
            return A02(r4, new AnonymousClass478(r3, j));
        }
        throw new C73463fX("Timed out immediately", (C85474Gj) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.C84814Du r8, X.AnonymousClass4GR r9, long r10) {
        /*
            boolean r0 = r8 instanceof X.C74503hE
            if (r0 == 0) goto L_0x0023
            r7 = r8
            X.3hE r7 = (X.C74503hE) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0023
            int r2 = r2 - r1
            r7.label = r2
        L_0x0012:
            java.lang.Object r1 = r7.result
            X.218 r6 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r7.label
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 != r4) goto L_0x002d
            java.lang.Object r3 = r7.L$1
            X.3Yy r3 = (X.C69903Yy) r3
            goto L_0x0029
        L_0x0023:
            X.3hE r7 = new X.3hE
            r7.<init>(r8)
            goto L_0x0012
        L_0x0029:
            X.C57682u2.A01(r1)     // Catch:{ 3fX -> 0x0057 }
            return r1
        L_0x002d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x0032:
            X.C57682u2.A01(r1)
            r1 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x005f
            X.3Yy r3 = new X.3Yy
            r3.<init>()
            r7.L$0 = r9     // Catch:{ 3fX -> 0x0057 }
            r7.L$1 = r3     // Catch:{ 3fX -> 0x0057 }
            r7.J$0 = r10     // Catch:{ 3fX -> 0x0057 }
            r7.label = r4     // Catch:{ 3fX -> 0x0057 }
            X.478 r0 = new X.478     // Catch:{ 3fX -> 0x0057 }
            r0.<init>(r7, r10)     // Catch:{ 3fX -> 0x0057 }
            r3.element = r0     // Catch:{ 3fX -> 0x0057 }
            java.lang.Object r1 = A02(r9, r0)     // Catch:{ 3fX -> 0x0057 }
            if (r1 != r6) goto L_0x0056
            return r6
        L_0x0056:
            return r1
        L_0x0057:
            r2 = move-exception
            X.4Gj r1 = r2.A00
            java.lang.Object r0 = r3.element
            if (r1 == r0) goto L_0x005f
            throw r2
        L_0x005f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C616331p.A01(X.4Du, X.4GR, long):java.lang.Object");
    }

    public static final Object A02(AnonymousClass4GR r5, AnonymousClass478 r6) {
        Object obj;
        Object A0D;
        r6.BGv(new AnonymousClass46W(C616231o.A02(r6.A00.B5w()).BGx(r6, r6.B5w(), r6.A00)));
        boolean z = false;
        try {
            AnonymousClass360.A03(r5, 2);
            obj = r5.invoke(r6, r6);
        } catch (Throwable th) {
            obj = new AnonymousClass333(th);
        }
        AnonymousClass218 r2 = AnonymousClass218.COROUTINE_SUSPENDED;
        if (obj == r2 || (A0D = r6.A0D(obj)) == AnonymousClass36I.A04) {
            return r2;
        }
        if (!(A0D instanceof AnonymousClass333)) {
            return AnonymousClass36I.A01(A0D);
        }
        Throwable th2 = ((AnonymousClass333) A0D).A00;
        if (!(th2 instanceof C73463fX) || ((C73463fX) th2).A00 != r6) {
            z = true;
        }
        if (z) {
            throw th2;
        } else if (!(obj instanceof AnonymousClass333)) {
            return obj;
        } else {
            throw ((AnonymousClass333) obj).A00;
        }
    }
}
