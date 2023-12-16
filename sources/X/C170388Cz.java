package X;

/* renamed from: X.8Cz  reason: invalid class name and case insensitive filesystem */
public class C170388Cz implements C183998r0 {
    public AnonymousClass84O A00;
    public final C157157hp A01;
    public final String A02;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r5.A0N().equals(r3) == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass84O Ax6(X.AnonymousClass84O r5) {
        /*
            r4 = this;
            java.lang.String r3 = r4.A02
            java.lang.String r0 = r5.A0N()
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = r5.A0N()
            boolean r1 = r0.equals(r3)
            r0 = 1
            if (r1 != 0) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            java.lang.String r2 = "Multiple components with the same id found during reflow"
            if (r0 == 0) goto L_0x001e
            X.84O r0 = r4.A00
            if (r0 != 0) goto L_0x005d
            r4.A00 = r5
        L_0x001e:
            java.util.LinkedList r0 = r5.A06
            if (r0 == 0) goto L_0x0042
            java.util.Iterator r1 = r0.iterator()
        L_0x0026:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0042
            java.lang.Object r0 = r1.next()
            X.7MQ r0 = (X.AnonymousClass7MQ) r0
            java.lang.String r0 = r0.A03
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0026
            X.84O r0 = r4.A00
            if (r0 != 0) goto L_0x0058
            r4.A00 = r5
        L_0x0042:
            X.84O r0 = r4.A00
            if (r0 == 0) goto L_0x0057
            r0 = 134(0x86, float:1.88E-43)
            X.48t r2 = r5.A0L(r0)
            if (r2 == 0) goto L_0x0057
            X.7jD r1 = X.C152057Xj.A02(r5)
            X.7hp r0 = r4.A01
            r0.A02(r1, r2)
        L_0x0057:
            return r5
        L_0x0058:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r2)
            throw r0
        L_0x005d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170388Cz.Ax6(X.84O):X.84O");
    }

    public void Bf1(AnonymousClass84O r2) {
        if (this.A00 == r2) {
            this.A00 = null;
        }
    }

    public C170388Cz(C157157hp r1, String str) {
        this.A02 = str;
        this.A01 = r1;
    }
}
