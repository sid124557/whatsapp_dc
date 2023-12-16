package X;

/* renamed from: X.8JA  reason: invalid class name */
public class AnonymousClass8JA implements C185118t7 {
    public final int A00;
    public final int A01;
    public final long A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public boolean B2b(C185118t7 r4) {
        if (r4 instanceof AnonymousClass8JA) {
            AnonymousClass8JA r42 = (AnonymousClass8JA) r4;
            if (C107575bX.A0G(this.A03, r42.A03) && this.A00 == r42.A00 && this.A01 == r42.A01 && this.A05 == r42.A05 && this.A04 == r42.A04) {
                return true;
            }
            return false;
        }
        return false;
    }

    public long BCM() {
        return this.A02;
    }

    public int BEN() {
        return 1;
    }

    public AnonymousClass8JA(String str, int i, int i2, long j, boolean z, boolean z2) {
        this.A02 = j;
        this.A03 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A05 = z;
        this.A04 = z2;
    }
}
