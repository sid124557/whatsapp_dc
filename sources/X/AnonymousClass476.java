package X;

/* renamed from: X.476  reason: invalid class name */
public final class AnonymousClass476 extends C830645z {
    public final ThreadLocal A00;
    public volatile boolean threadLocalIsSet;

    public final void A12(Object obj, C85494Gl r4) {
        this.threadLocalIsSet = true;
        this.A00.set(AnonymousClass3Z6.A02(r4, obj));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass476(X.C84814Du r3, X.C85494Gl r4) {
        /*
            r2 = this;
            X.3dn r1 = X.C72483dn.A00
            X.4Gk r0 = r4.get(r1)
            if (r0 != 0) goto L_0x0030
            X.4Gl r0 = r4.plus(r1)
        L_0x000c:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.A00 = r0
            X.4Gl r1 = r3.B5w()
            X.3dq r0 = X.AnonymousClass4GY.A00
            X.4Gk r0 = r1.get(r0)
            boolean r0 = r0 instanceof X.C73853gB
            if (r0 != 0) goto L_0x002f
            r0 = 0
            java.lang.Object r0 = X.AnonymousClass34N.A00(r0, r4)
            X.AnonymousClass34N.A01(r0, r4)
            r2.A12(r0, r4)
        L_0x002f:
            return
        L_0x0030:
            r0 = r4
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass476.<init>(X.4Du, X.4Gl):void");
    }

    public void A0y(Object obj) {
        if (this.threadLocalIsSet) {
            ThreadLocal threadLocal = this.A00;
            AnonymousClass3Z6 r0 = (AnonymousClass3Z6) threadLocal.get();
            if (r0 != null) {
                AnonymousClass34N.A01(r0.second, (C85494Gl) r0.first);
            }
            threadLocal.remove();
        }
        C84814Du r1 = this.A00;
        if (obj instanceof AnonymousClass333) {
            obj = AnonymousClass3Z0.A01(((AnonymousClass333) obj).A00);
        }
        C85494Gl B5w = r1.B5w();
        AnonymousClass476 r3 = null;
        Object A002 = AnonymousClass34N.A00(r3, B5w);
        if (A002 != AnonymousClass34N.A03) {
            r3 = AnonymousClass348.A02(A002, r1, B5w);
        }
        try {
            r1.BkD(obj);
        } finally {
            if (r3 == null || r3.A13()) {
                AnonymousClass34N.A01(A002, B5w);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r2.A00.get() != null) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A13() {
        /*
            r2 = this;
            boolean r0 = r2.threadLocalIsSet
            if (r0 == 0) goto L_0x000d
            java.lang.ThreadLocal r0 = r2.A00
            java.lang.Object r0 = r0.get()
            r1 = 1
            if (r0 == 0) goto L_0x000e
        L_0x000d:
            r1 = 0
        L_0x000e:
            java.lang.ThreadLocal r0 = r2.A00
            r0.remove()
            r0 = r1 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass476.A13():boolean");
    }
}
