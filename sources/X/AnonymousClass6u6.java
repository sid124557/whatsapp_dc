package X;

import java.io.IOException;

/* renamed from: X.6u6  reason: invalid class name */
public class AnonymousClass6u6 extends IOException {
    public Throwable cause;

    public Throwable getCause() {
        return this.cause;
    }

    public AnonymousClass6u6(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public AnonymousClass6u6(String str) {
        super(str);
    }
}
