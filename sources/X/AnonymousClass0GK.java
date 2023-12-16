package X;

import java.util.concurrent.Executor;

/* renamed from: X.0GK  reason: invalid class name */
public enum AnonymousClass0GK implements Executor {
    ;

    /* access modifiers changed from: public */
    AnonymousClass0GK() {
    }

    public String toString() {
        return "DirectExecutor";
    }

    public void execute(Runnable runnable) {
        runnable.run();
    }
}
