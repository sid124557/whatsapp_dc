package X;

/* renamed from: X.6zx  reason: invalid class name and case insensitive filesystem */
public class C144066zx extends IllegalStateException {
    public Throwable cause;

    public Throwable getCause() {
        return this.cause;
    }

    public C144066zx(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public C144066zx(String str) {
        super(str);
    }
}
