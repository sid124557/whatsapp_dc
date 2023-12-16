package X;

/* renamed from: X.8B0  reason: invalid class name */
public final class AnonymousClass8B0 implements C186138uo {
    public final C128856Xs A00;

    public final void BtJ(int i, double d) {
        C128856Xs r3 = this.A00;
        long doubleToRawLongBits = Double.doubleToRawLongBits(d);
        r3.A05((i << 3) | 1);
        r3.A0A(doubleToRawLongBits);
    }

    public final void BtK(int i, float f) {
        C128856Xs r2 = this.A00;
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        r2.A05((i << 3) | 5);
        r2.A06(floatToRawIntBits);
    }

    public final void BtR(C186268v1 r3, Object obj, int i) {
        C128856Xs r1 = this.A00;
        C187848xu r4 = (C187848xu) obj;
        AnonymousClass72Z.A07(r1, i);
        r1.A05(C128766Xj.A00(r3, r4));
        r3.BtS(r1.A01, r4);
    }

    public final void Bti(C186268v1 r4, Object obj, int i) {
        C128856Xs r2 = this.A00;
        int i2 = i << 3;
        r2.A05(i2 | 3);
        r4.BtS(r2.A01, obj);
        r2.A05(i2 | 4);
    }

    public AnonymousClass8B0(C128856Xs r1) {
        this.A00 = r1;
        r1.A01 = this;
    }
}
