package X;

import java.io.IOException;

/* renamed from: X.1zu  reason: invalid class name and case insensitive filesystem */
public class C36801zu extends IOException implements C83914Ah {
    public final int errorCode = 201;

    public C36801zu(String str) {
        super(str);
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
