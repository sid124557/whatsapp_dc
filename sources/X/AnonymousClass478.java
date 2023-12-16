package X;

/* renamed from: X.478  reason: invalid class name */
public final class AnonymousClass478 extends C830645z implements Runnable {
    public final long A00;

    public void run() {
        long j = this.A00;
        C616231o.A02(B5w());
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Timed out waiting for ");
        A0o.append(j);
        A0b(new C73463fX(AnonymousClass000.A0X(" ms", A0o), this));
    }

    public AnonymousClass478(C84814Du r2, long j) {
        super(r2, r2.B5w());
        this.A00 = j;
    }

    public String A0L() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(super.A0L());
        A0o.append("(timeMillis=");
        return C18270x1.A0U(A0o, this.A00);
    }
}
