package X;

/* renamed from: X.6zA  reason: invalid class name and case insensitive filesystem */
public class C143596zA extends Exception {
    public Throwable _underlyingException;

    public static C143596zA A00(String str) {
        return new C143596zA(str, (Throwable) null);
    }

    public static C143596zA A01(String str, Throwable th) {
        return new C143596zA(str, th);
    }

    public Throwable getCause() {
        return this._underlyingException;
    }

    public C143596zA(String str, Throwable th) {
        super(str);
        this._underlyingException = th;
    }
}
