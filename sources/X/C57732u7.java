package X;

/* renamed from: X.2u7  reason: invalid class name and case insensitive filesystem */
public final class C57732u7 {
    public static final AnonymousClass4FH A01(C85494Gl r4, AnonymousClass4GR r5, AnonymousClass4C6 r6, AnonymousClass20D r7, C369720l r8, int i) {
        C85504Gn r2;
        int i2;
        if (i == -2) {
            if (r8 == C369720l.SUSPEND) {
                i2 = C58062ue.A00;
                r2 = new AnonymousClass8PR(i2);
            }
            r2 = new C175748Zo(r8, 1);
        } else if (i != -1) {
            if (i != 0) {
                i2 = Integer.MAX_VALUE;
                if (i != Integer.MAX_VALUE) {
                    if (r8 == C369720l.SUSPEND) {
                        r2 = new AnonymousClass8PR(i);
                    } else {
                        r2 = new C175748Zo(r8, i);
                    }
                }
                r2 = new AnonymousClass8PR(i2);
            } else {
                if (r8 == C369720l.SUSPEND) {
                    r2 = new AnonymousClass8PR(0);
                }
                r2 = new C175748Zo(r8, 1);
            }
        } else if (r8 == C369720l.SUSPEND) {
            r2 = new C175748Zo(C369720l.DROP_OLDEST, 1);
        } else {
            throw AnonymousClass001.A0c("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        AnonymousClass461 r0 = new AnonymousClass461(AnonymousClass348.A01(r4, r6), r2);
        r0.A10(r0, r5, r7);
        return r0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C84814Du r5, X.AnonymousClass4GP r6, X.AnonymousClass4Gm r7) {
        /*
            boolean r0 = r5 instanceof X.C74313gv
            if (r0 == 0) goto L_0x0022
            r4 = r5
            X.3gv r4 = (X.C74313gv) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0022
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r1 = r4.result
            X.218 r3 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 != r2) goto L_0x002c
            java.lang.Object r6 = r4.L$1
            X.4GP r6 = (X.AnonymousClass4GP) r6
            goto L_0x0028
        L_0x0022:
            X.3gv r4 = new X.3gv
            r4.<init>(r5)
            goto L_0x0012
        L_0x0028:
            X.C57682u2.A01(r1)     // Catch:{ all -> 0x005f }
            goto L_0x0059
        L_0x002c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x0031:
            X.C57682u2.A01(r1)
            X.4Gl r1 = r4.B5w()
            X.3dr r0 = X.C85474Gj.A00
            X.4Gk r0 = r1.get(r0)
            if (r0 != r7) goto L_0x0064
            r4.L$0 = r7     // Catch:{ all -> 0x005f }
            r4.L$1 = r6     // Catch:{ all -> 0x005f }
            r4.label = r2     // Catch:{ all -> 0x005f }
            X.46G r1 = X.C57702u4.A04(r4)     // Catch:{ all -> 0x005f }
            X.43U r0 = new X.43U     // Catch:{ all -> 0x005f }
            r0.<init>(r1)     // Catch:{ all -> 0x005f }
            r7.BGu(r0)     // Catch:{ all -> 0x005f }
            java.lang.Object r0 = r1.A06()     // Catch:{ all -> 0x005f }
            if (r0 != r3) goto L_0x0059
            return r3
        L_0x0059:
            r6.invoke()
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x005f:
            r0 = move-exception
            r6.invoke()
            throw r0
        L_0x0064:
            java.lang.String r0 = "awaitClose() can only be invoked from the producer context"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57732u7.A00(X.4Du, X.4GP, X.4Gm):java.lang.Object");
    }
}
