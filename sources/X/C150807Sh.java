package X;

/* renamed from: X.7Sh  reason: invalid class name and case insensitive filesystem */
public class C150807Sh {
    public final double A00;
    public final double A01;
    public final long A02;

    public C150807Sh(double d, double d2, long j) {
        this.A01 = d;
        this.A00 = d2;
        this.A02 = j;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("FrameRateData{small=");
        A0o.append(this.A01);
        A0o.append(", large=");
        A0o.append(this.A00);
        A0o.append(", timeSpent=");
        A0o.append(this.A02);
        return AnonymousClass000.A0d(A0o);
    }
}
