package X;

/* renamed from: X.9Qv  reason: invalid class name and case insensitive filesystem */
public class C193939Qv {
    public final long A00;
    public final long A01;

    public C193939Qv(long j, long j2) {
        if (j2 == 0) {
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
        A0o.append(this.A00);
        return A0o.toString();
    }
}
