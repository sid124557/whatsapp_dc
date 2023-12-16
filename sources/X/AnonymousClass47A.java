package X;

/* renamed from: X.47A  reason: invalid class name */
public final class AnonymousClass47A extends C71253bo {
    public final Runnable A00;

    public void run() {
        this.A00.run();
    }

    public AnonymousClass47A(Runnable runnable, AnonymousClass2J8 r2, long j) {
        super(r2, j);
        this.A00 = runnable;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Task[");
        Runnable runnable = this.A00;
        AnonymousClass000.A1A(runnable, A0o);
        C18270x1.A18(runnable, A0o, '@');
        A0o.append(", ");
        A0o.append(this.A00);
        A0o.append(", ");
        A0o.append(this.A01);
        return AnonymousClass0x2.A0f(A0o);
    }
}
