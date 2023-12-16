package X;

/* renamed from: X.0Pd  reason: invalid class name */
public class AnonymousClass0Pd {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r1 == r6.A01) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r3 = 1
            if (r5 == r6) goto L_0x002e
            r4 = 0
            if (r6 == 0) goto L_0x004a
            java.lang.Class r1 = r5.getClass()
            java.lang.Class r0 = r6.getClass()
            if (r1 != r0) goto L_0x004a
            X.0Pd r6 = (X.AnonymousClass0Pd) r6
            int r1 = r5.A00
            int r0 = r6.A00
            if (r1 != r0) goto L_0x004a
            r0 = 8
            if (r1 != r0) goto L_0x002f
            int r2 = r5.A01
            int r1 = r5.A02
            int r0 = X.AnonymousClass001.A0A(r2, r1)
            if (r0 != r3) goto L_0x002f
            int r0 = r6.A02
            if (r2 != r0) goto L_0x002f
            int r0 = r6.A01
            if (r1 != r0) goto L_0x002f
        L_0x002e:
            return r3
        L_0x002f:
            int r1 = r5.A01
            int r0 = r6.A01
            if (r1 != r0) goto L_0x004a
            int r1 = r5.A02
            int r0 = r6.A02
            if (r1 != r0) goto L_0x004a
            java.lang.Object r1 = r5.A03
            java.lang.Object r0 = r6.A03
            if (r1 == 0) goto L_0x0048
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x002e
            return r4
        L_0x0048:
            if (r0 == 0) goto L_0x002e
        L_0x004a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Pd.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return (((this.A00 * 31) + this.A02) * 31) + this.A01;
    }

    public AnonymousClass0Pd(Object obj, int i, int i2, int i3) {
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A03 = obj;
    }

    public String toString() {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass001.A1N(A0o, System.identityHashCode(this));
        A0o.append("[");
        int i = this.A00;
        if (i == 1) {
            str = "add";
        } else if (i == 2) {
            str = "rm";
        } else if (i == 4) {
            str = "up";
        } else if (i != 8) {
            str = "??";
        } else {
            str = "mv";
        }
        A0o.append(str);
        A0o.append(",s:");
        A0o.append(this.A02);
        A0o.append("c:");
        A0o.append(this.A01);
        A0o.append(",p:");
        return AnonymousClass000.A0S(this.A03, A0o);
    }
}
