package X;

import java.io.IOException;

/* renamed from: X.1zv  reason: invalid class name and case insensitive filesystem */
public class C36811zv extends IOException implements C83914Ah {
    public final int errorCode;

    public C36811zv(String str, Throwable th, int i) {
        super(str, th);
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

    public C36811zv(int i, String str) {
        super(str);
        this.errorCode = i;
    }

    public C36811zv(Throwable th) {
        super(th);
        this.errorCode = 200;
    }

    public C36811zv() {
        this.errorCode = 605;
    }
}
