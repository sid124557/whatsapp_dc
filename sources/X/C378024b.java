package X;

/* renamed from: X.24b  reason: invalid class name and case insensitive filesystem */
public class C378024b extends IllegalStateException {
    public Throwable cause;

    public C378024b(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
