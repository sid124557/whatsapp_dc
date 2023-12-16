package X;

/* renamed from: X.46H  reason: invalid class name */
public final class AnonymousClass46H extends C71783cf {
    public final Runnable A00;

    public void run() {
        this.A00.run();
    }

    public AnonymousClass46H(Runnable runnable, long j) {
        super(j);
        this.A00 = runnable;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(super.toString());
        return AnonymousClass000.A0R(this.A00, A0o);
    }
}
