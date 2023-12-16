package X;

/* renamed from: X.8Zo  reason: invalid class name and case insensitive filesystem */
public class C175748Zo extends AnonymousClass8PR {
    public final C369720l A00;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
        return new X.C831746k(A06());
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0M(java.lang.Object r18) {
        /*
            r17 = this;
            r9 = r17
            X.20l r1 = r9.A00
            X.20l r0 = X.C369720l.DROP_LATEST
            r10 = r18
            if (r1 != r0) goto L_0x0019
            java.lang.Object r1 = super.BrD(r10)
            boolean r0 = r1 instanceof X.C44012Ui
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0018
            boolean r0 = r1 instanceof X.C831746k
            if (r0 == 0) goto L_0x00a1
        L_0x0018:
            return r1
        L_0x0019:
            X.2XH r11 = X.C1462879o.A03
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.AnonymousClass8PR.A09
            java.lang.Object r4 = r0.get(r9)
            X.8Zq r4 = (X.C175768Zq) r4
        L_0x0023:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X.AnonymousClass8PR.A04
            long r0 = r0.getAndIncrement(r9)
            r2 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r14 = r0 & r2
            r2 = 0
            boolean r16 = r9.A0I(r0, r2)
            int r7 = X.C1462879o.A01
            long r0 = (long) r7
            long r2 = r14 / r0
            long r5 = r14 % r0
            int r13 = (int) r5
            long r5 = r4.A00
            int r8 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r8 == 0) goto L_0x0055
            X.8Zq r12 = r9.A09(r4, r2)
            if (r12 != 0) goto L_0x0056
            if (r16 == 0) goto L_0x0023
        L_0x004b:
            java.lang.Throwable r0 = r9.A06()
            X.46k r1 = new X.46k
            r1.<init>(r0)
            return r1
        L_0x0055:
            r12 = r4
        L_0x0056:
            int r3 = r9.A02(r10, r11, r12, r13, r14, r16)
            if (r3 == 0) goto L_0x009e
            r2 = 1
            if (r3 == r2) goto L_0x00a1
            r2 = 2
            if (r3 == r2) goto L_0x007b
            r0 = 3
            if (r3 == r0) goto L_0x0081
            r0 = 4
            if (r3 == r0) goto L_0x006d
            r12.A01()
            r4 = r12
            goto L_0x0023
        L_0x006d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X.AnonymousClass8PR.A03
            long r1 = r0.get(r9)
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x004b
            r12.A01()
            goto L_0x004b
        L_0x007b:
            if (r16 == 0) goto L_0x0088
            r12.A04()
            goto L_0x004b
        L_0x0081:
            java.lang.String r0 = "unexpected"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0088:
            boolean r2 = r11 instanceof X.C183558qE
            if (r2 == 0) goto L_0x0095
            X.8qE r11 = (X.C183558qE) r11
            if (r11 == 0) goto L_0x0095
            int r2 = r13 + r7
            r11.BGt(r12, r2)
        L_0x0095:
            long r2 = r12.A00
            long r2 = r2 * r0
            long r0 = (long) r13
            long r2 = r2 + r0
            r9.A0B(r2)
            goto L_0x00a1
        L_0x009e:
            r12.A01()
        L_0x00a1:
            X.2wD r1 = X.C59022wD.A00
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175748Zo.A0M(java.lang.Object):java.lang.Object");
    }

    public C175748Zo(C369720l r3, int i) {
        super(i);
        this.A00 = r3;
        if (r3 == C369720l.SUSPEND) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("This implementation does not support suspension for senders, use ");
            C18260x0.A0N(AnonymousClass8PR.class, A0o);
            throw AnonymousClass000.A0F(" instead", A0o);
        } else if (i < 1) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("Buffered channel capacity must be at least 1, but ");
            A0o2.append(i);
            throw AnonymousClass000.A0F(" was specified", A0o2);
        }
    }

    public Object BrD(Object obj) {
        return A0M(obj);
    }
}
