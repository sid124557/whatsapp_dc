package X;

/* renamed from: X.24I  reason: invalid class name */
public class AnonymousClass24I extends Exception {
    public final String message;

    public AnonymousClass24I() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Package ");
        A0o.append("com.facebook.stella");
        this.message = AnonymousClass000.A0X(" not authorized", A0o);
    }

    public String getMessage() {
        return this.message;
    }
}
