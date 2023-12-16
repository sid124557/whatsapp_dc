package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.8Ty  reason: invalid class name and case insensitive filesystem */
public final class C174358Ty extends CancellationException {
    public final transient AnonymousClass4C9 A00;

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public C174358Ty(AnonymousClass4C9 r2) {
        super("Flow was aborted, no more elements needed");
        this.A00 = r2;
    }
}
