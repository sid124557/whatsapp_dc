package X;

/* renamed from: X.6zT  reason: invalid class name and case insensitive filesystem */
public class C143786zT extends Exception {
    public final C160427nc mParsedUri;

    public C143786zT(C160427nc r1, String str, Throwable th) {
        super(str, th);
        this.mParsedUri = r1;
    }

    public C143786zT(C160427nc r2) {
        super("Empty uriString");
        this.mParsedUri = r2;
    }
}
