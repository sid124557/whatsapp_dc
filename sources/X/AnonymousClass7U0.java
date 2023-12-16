package X;

/* renamed from: X.7U0  reason: invalid class name */
public class AnonymousClass7U0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final boolean A05;

    public AnonymousClass7U0(int i, int i2, int i3, long j, long j2, boolean z) {
        this.A04 = j;
        this.A03 = j2;
        this.A02 = i;
        this.A01 = i2;
        this.A05 = z;
        this.A00 = i3;
    }

    public String toString() {
        Object[] A0M = AnonymousClass002.A0M();
        C18280x3.A1S(A0M, this.A04);
        AnonymousClass001.A1Q(A0M, this.A03);
        String format = String.format("<S t=\"%d\" d=\"%d\"/>", A0M);
        if (this.A05) {
            return AnonymousClass000.A0X(" (p) ", AnonymousClass000.A0l(format));
        }
        return format;
    }
}
