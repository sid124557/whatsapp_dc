package X;

/* renamed from: X.5SI  reason: invalid class name */
public class AnonymousClass5SI {
    public final int A00;
    public final int A01;
    public final long A02;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass5SI)) {
            return false;
        }
        AnonymousClass5SI r7 = (AnonymousClass5SI) obj;
        return this.A00 == r7.A00 && this.A01 == r7.A01 && this.A02 == r7.A02;
    }

    public AnonymousClass5SI(int i, long j, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        AnonymousClass000.A1L(A1X, this.A00);
        AnonymousClass000.A1M(A1X, this.A01);
        return C18310x6.A08(Long.valueOf(this.A02), A1X, 2);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("FutureStageTiming{stage=");
        A0o.append(this.A00);
        A0o.append(", type=");
        A0o.append(this.A01);
        A0o.append(", timeInMillis=");
        A0o.append(this.A02);
        return AnonymousClass000.A0d(A0o);
    }
}
