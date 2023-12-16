package X;

/* renamed from: X.24Z  reason: invalid class name */
public class AnonymousClass24Z extends Exception implements C83914Ah {
    public final int errorCode;

    public AnonymousClass24Z(int i) {
        super("received error message");
        this.errorCode = i;
    }

    public int B9k() {
        return this.errorCode;
    }

    public String getMessage() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(super.getMessage());
        A0o.append(" (error_code=");
        A0o.append(this.errorCode);
        return AnonymousClass000.A0e(A0o);
    }
}
