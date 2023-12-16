package X;

/* renamed from: X.8J8  reason: invalid class name */
public class AnonymousClass8J8 implements C185118t7 {
    public final int A00;
    public final int A01;
    public final String A02;
    public final boolean A03;

    public boolean B2b(C185118t7 r4) {
        if (!(r4 instanceof AnonymousClass8J8)) {
            return false;
        }
        AnonymousClass8J8 r42 = (AnonymousClass8J8) r4;
        if (C107575bX.A0G(this.A02, r42.A02) && this.A03 == r42.A03 && this.A01 == r42.A01 && this.A00 == r42.A00) {
            return true;
        }
        return false;
    }

    public long BCM() {
        return -1;
    }

    public int BEN() {
        return 0;
    }

    public AnonymousClass8J8(int i, int i2, String str, boolean z) {
        this.A02 = str;
        this.A03 = z;
        this.A00 = i;
        this.A01 = i2;
    }
}
