package X;

import java.math.BigInteger;

/* renamed from: X.8QM  reason: invalid class name */
public class AnonymousClass8QM implements C834748n {
    public BigInteger A00;
    public BigInteger A01;
    public BigInteger A02;
    public AnonymousClass7W2 A03;

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass8QM)) {
            return false;
        }
        AnonymousClass8QM r4 = (AnonymousClass8QM) obj;
        if (!r4.A01.equals(this.A01) || !r4.A02.equals(this.A02) || !r4.A00.equals(this.A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass6CA.A05(this.A00, AnonymousClass6CA.A05(this.A02, this.A01.hashCode()));
    }

    public AnonymousClass8QM(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, AnonymousClass7W2 r4) {
        this.A00 = bigInteger3;
        this.A01 = bigInteger;
        this.A02 = bigInteger2;
        this.A03 = r4;
    }
}
