package X;

/* renamed from: X.6zB  reason: invalid class name and case insensitive filesystem */
public class C143606zB extends Exception {
    public Throwable cause;

    public Throwable getCause() {
        return this.cause;
    }

    public C143606zB(String str, Throwable th) {
        super(str);
        this.cause = th;
    }
}
