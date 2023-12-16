package X;

/* renamed from: X.7jN  reason: invalid class name and case insensitive filesystem */
public class C158067jN {
    public int A00;
    public final int A01;
    public final C162427s4 A02;

    public static boolean A00(double d) {
        double floor;
        if (d < 0.0d) {
            floor = Math.ceil(d);
        } else {
            floor = Math.floor(d);
        }
        return AnonymousClass000.A1T((floor > d ? 1 : (floor == d ? 0 : -1)));
    }

    public final Object A01(int i) {
        int i2 = this.A00;
        boolean z = true;
        if (AnonymousClass001.A1X(i2, -1)) {
            if (i >= i2) {
                z = false;
            }
            AnonymousClass73P.A00("invalid instr stack argument", z);
            return this.A02.A05[this.A01 + i];
        }
        throw AnonymousClass001.A0e("InstrStackArgs is not initialized");
    }

    public final void A02(Object obj) {
        int i = this.A00;
        if (AnonymousClass001.A1X(i, -1)) {
            C162427s4 r0 = this.A02;
            r0.A0P(i);
            r0.A0V(obj);
            this.A00 = -1;
            return;
        }
        throw AnonymousClass001.A0e("InstrStackArgs is not initialized");
    }

    public C158067jN(C162427s4 r3, int i) {
        int i2;
        this.A02 = r3;
        this.A00 = i;
        if (i > 0) {
            i2 = (r3.A01 - 1) - (i - 1);
        } else {
            i2 = -1;
        }
        this.A01 = i2;
    }
}
