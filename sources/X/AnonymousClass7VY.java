package X;

/* renamed from: X.7VY  reason: invalid class name */
public class AnonymousClass7VY {
    public Throwable A00;
    public Throwable A01;

    public final void A00(Throwable th) {
        String str;
        Throwable th2 = this.A01;
        if (th2 == null) {
            th2 = th;
        }
        this.A01 = th2;
        if (this.A00 != null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(" Exception2: ");
            if (th.getMessage() != null) {
                str = th.getMessage();
            } else {
                str = "";
            }
            th = new Throwable(AnonymousClass000.A0X(str, A0o), new Throwable("exception1", this.A00));
        }
        this.A00 = th;
    }
}
