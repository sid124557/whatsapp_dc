package X;

/* renamed from: X.8Cy  reason: invalid class name and case insensitive filesystem */
public class C170378Cy implements C183998r0 {
    public AnonymousClass84O A00;
    public final C157157hp A01;
    public final String A02;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r7.A0N().equals(r5) == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass84O Ax6(X.AnonymousClass84O r7) {
        /*
            r6 = this;
            java.lang.String r5 = r6.A02
            java.lang.String r0 = r7.A0N()
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = r7.A0N()
            boolean r1 = r0.equals(r5)
            r0 = 1
            if (r1 != 0) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            java.lang.String r4 = "Multiple components with the same id found during reflow"
            if (r0 == 0) goto L_0x001e
            X.84O r0 = r6.A00
            if (r0 != 0) goto L_0x0058
            r6.A00 = r7
        L_0x001e:
            java.util.LinkedList r0 = r7.A06
            if (r0 == 0) goto L_0x0057
            java.util.Iterator r3 = r0.iterator()
        L_0x0026:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0057
            java.lang.Object r1 = r3.next()
            X.7MQ r1 = (X.AnonymousClass7MQ) r1
            java.lang.String r0 = r1.A03
            if (r0 == 0) goto L_0x0042
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0042
            X.84O r0 = r6.A00
            if (r0 != 0) goto L_0x0052
            r6.A00 = r7
        L_0x0042:
            X.84O r0 = r6.A00
            if (r0 == 0) goto L_0x0026
            X.48t r2 = r1.A01
            if (r2 == 0) goto L_0x0026
            X.7hp r1 = r6.A01
            X.7jD r0 = X.C157967jD.A01
            r1.A02(r0, r2)
            goto L_0x0026
        L_0x0052:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r4)
            throw r0
        L_0x0057:
            return r7
        L_0x0058:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170378Cy.Ax6(X.84O):X.84O");
    }

    public void Bf1(AnonymousClass84O r2) {
        if (this.A00 == r2) {
            this.A00 = null;
        }
    }

    public C170378Cy(C157157hp r1, String str) {
        this.A02 = str;
        this.A01 = r1;
    }
}
