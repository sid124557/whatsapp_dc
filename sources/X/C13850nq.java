package X;

/* renamed from: X.0nq  reason: invalid class name and case insensitive filesystem */
public final class C13850nq extends RuntimeException {
    public final C02350Fv callbackName;
    public final Throwable cause;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13850nq(C02350Fv r2, Throwable th) {
        super(th);
        C162457s7.A0J(r2, 1);
        this.callbackName = r2;
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
