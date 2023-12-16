package X;

/* renamed from: X.90P  reason: invalid class name */
public class AnonymousClass90P implements C185058sz {
    public Object A00;
    public final int A01;

    public AnonymousClass90P(C106735a4 r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public int B9O() {
        int i = this.A01;
        C106735a4 r0 = (C106735a4) this.A00;
        if (i == 0) {
            return r0.A0J;
        }
        AnonymousClass5YG r02 = r0.A07.A01;
        if (r02 == null) {
            return 0;
        }
        return r02.A06();
    }

    public AnonymousClass107 BCx() {
        int i = this.A01;
        C106735a4 r0 = (C106735a4) this.A00;
        if (i != 0) {
            return r0.A0u;
        }
        return r0.A0s;
    }

    public int getValue() {
        if (this.A01 != 0) {
            AnonymousClass5YG r0 = ((C106735a4) this.A00).A07.A01;
            if (r0 == null) {
                return 0;
            }
            return r0.A05();
        }
        C106735a4 r3 = (C106735a4) this.A00;
        long j = r3.A01;
        int i = (j > -1 ? 1 : (j == -1 ? 0 : -1));
        int i2 = r3.A00;
        if (i != 0) {
            return (int) ((((long) i2) + System.currentTimeMillis()) - j);
        }
        return i2;
    }
}
