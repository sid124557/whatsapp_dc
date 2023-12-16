package X;

/* renamed from: X.6zC  reason: invalid class name and case insensitive filesystem */
public class C143616zC extends Exception {
    public C141916wL errorType;
    public String message;

    public C143616zC(C141916wL r1, String str) {
        super(str);
        this.message = str;
        this.errorType = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Error type: ");
        A0o.append(this.errorType);
        A0o.append(". ");
        return AnonymousClass000.A0X(this.message, A0o);
    }
}
