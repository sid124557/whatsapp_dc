package X;

/* renamed from: X.0Av  reason: invalid class name and case insensitive filesystem */
public final class C01440Av extends C03080It {
    public final Throwable A00;

    public C01440Av(Throwable th) {
        this.A00 = th;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("FAILURE (");
        A0o.append(this.A00.getMessage());
        return AnonymousClass000.A0e(A0o);
    }
}
