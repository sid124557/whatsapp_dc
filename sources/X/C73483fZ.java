package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.3fZ  reason: invalid class name and case insensitive filesystem */
public final class C73483fZ extends CancellationException {
    public final transient C85474Gj A00;

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C73483fZ)) {
            return false;
        }
        C73483fZ r3 = (C73483fZ) obj;
        if (!C162457s7.A0P(r3.getMessage(), getMessage()) || !C162457s7.A0P(r3.A00, this.A00) || !C162457s7.A0P(r3.getCause(), getCause())) {
            return false;
        }
        return true;
    }

    public C73483fZ(String str, Throwable th, C85474Gj r3) {
        super(str);
        this.A00 = r3;
        if (th != null) {
            initCause(th);
        }
    }

    public int hashCode() {
        String message = getMessage();
        C162457s7.A0H(message);
        return AnonymousClass000.A08(this.A00, C18310x6.A09(message)) + C18280x3.A04(getCause());
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(super.toString());
        A0o.append("; job=");
        return AnonymousClass000.A0R(this.A00, A0o);
    }
}
