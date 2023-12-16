package X;

/* renamed from: X.0NB  reason: invalid class name */
public class AnonymousClass0NB {
    public final long A00;
    public final long A01;

    public AnonymousClass0NB(long j, long j2) {
        if (j2 == 0) {
            this.A01 = 0;
            this.A00 = 1;
            return;
        }
        this.A01 = j;
        this.A00 = j2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A01);
        A0o.append("/");
        return AnonymousClass001.A0k(A0o, this.A00);
    }
}
