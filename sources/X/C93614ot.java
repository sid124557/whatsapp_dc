package X;

/* renamed from: X.4ot  reason: invalid class name and case insensitive filesystem */
public final class C93614ot extends C113225l5 {
    public final C56612sH A00;
    public final C56982ss A01;

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008c, code lost:
        if (r2 != null) goto L_0x008e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x008f A[EDGE_INSN: B:54:0x008f->B:32:0x008f ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BoM(java.util.Collection r8) {
        /*
            r7 = this;
            r4 = 0
            X.C162457s7.A0J(r8, r4)
            X.34x r0 = X.C86654Ky.A0b(r8)
            X.2z0 r0 = r0.A1J
            X.4uZ r1 = r0.A00
            boolean r0 = r1 instanceof X.C95804uY
            if (r0 == 0) goto L_0x00b5
            X.2ss r0 = r7.A01
            X.31A r1 = r0.A0A(r1, r4)
            boolean r0 = r1 instanceof X.AnonymousClass1RL
            if (r0 == 0) goto L_0x008e
            X.1RL r1 = (X.AnonymousClass1RL) r1
            r6 = 1
            if (r1 == 0) goto L_0x008e
            boolean r0 = r1.A0K()
            if (r0 != r6) goto L_0x008e
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r8.iterator()
        L_0x002d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0047
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.34x r0 = (X.C624134x) r0
            X.C162457s7.A0J(r0, r4)
            boolean r0 = X.C627636p.A0Y(r0)
            if (r0 == 0) goto L_0x002d
            r3.add(r1)
            goto L_0x002d
        L_0x0047:
            int r5 = r3.size()
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r8.iterator()
        L_0x0053:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x006b
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.34x r0 = (X.C624134x) r0
            X.C162457s7.A0J(r0, r4)
            int r0 = r0.A0D
            if (r0 != 0) goto L_0x0053
            r3.add(r1)
            goto L_0x0053
        L_0x006b:
            int r0 = r3.size()
            if (r5 > 0) goto L_0x00ad
            if (r0 > 0) goto L_0x00ad
            java.util.Iterator r3 = r8.iterator()
        L_0x0077:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x008f
            java.lang.Object r2 = r3.next()
            r1 = r2
            X.34x r1 = (X.C624134x) r1
            boolean r0 = r1.A1N
            if (r0 != 0) goto L_0x008c
            boolean r0 = r1 instanceof X.C30951nU
            if (r0 == 0) goto L_0x0077
        L_0x008c:
            if (r2 == 0) goto L_0x008f
        L_0x008e:
            return r4
        L_0x008f:
            X.2sH r3 = r7.A00
            java.util.Iterator r2 = r8.iterator()
        L_0x0095:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00b5
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.34x r0 = (X.C624134x) r0
            boolean r0 = X.C106855aH.A03(r3, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0095
            if (r1 == 0) goto L_0x00b5
            return r4
        L_0x00ad:
            int r0 = r8.size()
            if (r5 == r0) goto L_0x00b4
            r6 = 0
        L_0x00b4:
            return r6
        L_0x00b5:
            boolean r0 = super.BoM(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93614ot.BoM(java.util.Collection):boolean");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93614ot(C56612sH r1, C56982ss r2, C47052cd r3) {
        super(r3);
        C18260x0.A0V(r3, r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
