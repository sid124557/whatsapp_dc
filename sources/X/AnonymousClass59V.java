package X;

import java.util.concurrent.Executor;

/* renamed from: X.59V  reason: invalid class name */
public enum AnonymousClass59V implements Executor {
    ;

    /* access modifiers changed from: public */
    AnonymousClass59V() {
    }

    public String toString() {
        return "MoreExecutors.directExecutor()";
    }

    public void execute(Runnable runnable) {
        runnable.run();
    }
}
