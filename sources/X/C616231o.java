package X;

/* renamed from: X.31o  reason: invalid class name and case insensitive filesystem */
public final class C616231o {
    public static final Object A00(C84814Du r3, long j) {
        if (j > 0) {
            AnonymousClass46G A03 = C57702u4.A03(r3);
            if (j < Long.MAX_VALUE) {
                A02(A03.A01).Bkq(A03, j);
            }
            Object A06 = A03.A06();
            if (A06 == AnonymousClass218.COROUTINE_SUSPENDED) {
                return A06;
            }
        }
        return C59022wD.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r0 != 0) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r3 > 0) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.C84814Du r5, long r6) {
        /*
            r1 = 0
            long r3 = r6 ^ r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0030
            int r0 = (int) r3
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0030
            int r0 = (int) r6
            r3 = r0 & 1
            int r0 = (int) r1
            r0 = r0 & 1
            int r3 = r3 - r0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0019
            int r3 = -r3
        L_0x0019:
            if (r3 <= 0) goto L_0x0036
        L_0x001b:
            long r3 = X.AnonymousClass3ZP.A00(r6)
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0027
            r3 = 1
        L_0x0027:
            java.lang.Object r0 = A00(r5, r3)
            java.lang.Object r0 = X.AnonymousClass218.A00(r0)
            return r0
        L_0x0030:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0036
            if (r0 != 0) goto L_0x001b
        L_0x0036:
            r3 = 0
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C616231o.A01(X.4Du, long):java.lang.Object");
    }

    public static final C84824Dv A02(C85494Gl r1) {
        C84824Dv r12;
        C85484Gk r13 = r1.get(AnonymousClass4GY.A00);
        if (!(r13 instanceof C84824Dv) || (r12 = (C84824Dv) r13) == null) {
            return C39212Bc.A00;
        }
        return r12;
    }
}
