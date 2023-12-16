package X;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.0nX  reason: invalid class name and case insensitive filesystem */
public class C13660nX implements Executor {
    public final Handler A00;

    public void execute(Runnable runnable) {
        Handler handler = this.A00;
        runnable.getClass();
        if (!handler.post(runnable)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(handler);
            throw new RejectedExecutionException(AnonymousClass000.A0X(" is shutting down", A0o));
        }
    }

    public C13660nX(Handler handler) {
        handler.getClass();
        this.A00 = handler;
    }
}
