package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.3fY  reason: invalid class name and case insensitive filesystem */
public final class C73473fY extends CancellationException {
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public C73473fY() {
        super("Child of the scoped flow was cancelled");
    }
}
