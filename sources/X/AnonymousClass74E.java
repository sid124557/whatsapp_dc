package X;

/* renamed from: X.74E  reason: invalid class name */
public class AnonymousClass74E implements AnonymousClass65P {
    public Object A00;
    public final int A01;

    public AnonymousClass74E(C112315jX r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public final void Bfo() {
        int i = this.A01;
        C112315jX r3 = (C112315jX) this.A00;
        synchronized (C112315jX.class) {
            if (i != 0) {
                r3.A09.A02 = 16;
                r3.A06();
                return;
            }
            r3.A09.A02 = 12;
            r3.A06();
        }
    }
}
