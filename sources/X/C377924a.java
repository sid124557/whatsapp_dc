package X;

/* renamed from: X.24a  reason: invalid class name and case insensitive filesystem */
public class C377924a extends IllegalStateException {
    public Throwable cause;

    public C377924a(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
