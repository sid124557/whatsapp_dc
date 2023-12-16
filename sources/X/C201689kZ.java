package X;

/* renamed from: X.9kZ  reason: invalid class name and case insensitive filesystem */
public class C201689kZ extends RuntimeException {
    public final int mCameraError;

    public C201689kZ(int i, String str) {
        super(str);
        this.mCameraError = i;
    }

    public String getMessage() {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        int i = this.mCameraError;
        if (i == 1) {
            str = "unknown";
        } else if (i == 2) {
            str = "evicted";
        } else if (i != 100) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("other(");
            A0o2.append(i);
            str = AnonymousClass000.A0X(")", A0o2);
        } else {
            str = "server_died";
        }
        A0o.append(str);
        A0o.append(": ");
        return AnonymousClass000.A0X(super.getMessage(), A0o);
    }
}
