package X;

/* renamed from: X.911  reason: invalid class name */
public class AnonymousClass911 implements C182758ow {
    public Object A00;
    public final int A01;

    public AnonymousClass911(C112315jX r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public final void BUp(Object obj) {
        if (this.A01 != 0) {
            C112315jX r3 = (C112315jX) this.A00;
            AnonymousClass3ZH r5 = (AnonymousClass3ZH) obj;
            synchronized (C112315jX.class) {
                C150127Ph r1 = r3.A09;
                r1.A02 = 14;
                r1.A06 = r5;
                r3.A06();
            }
            return;
        }
        C112315jX r2 = (C112315jX) this.A00;
        C150127Ph r12 = r2.A09;
        r12.A02 = 13;
        r12.A05 = (C109065e1) obj;
        r2.A06();
    }
}
