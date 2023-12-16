package X;

/* renamed from: X.6k4  reason: invalid class name and case insensitive filesystem */
public final class C135066k4 extends C143956zl {
    public final Throwable cause;
    public final String message;

    public C135066k4(String str, Throwable th) {
        super(str, "CLIENT", th, 417);
        this.message = str;
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }

    public String getMessage() {
        return this.message;
    }

    public C135066k4() {
        this("Unknown error", (Throwable) null);
    }
}
