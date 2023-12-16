package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.8Oj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C173118Oj implements Executor {
    public final /* synthetic */ Handler A00;

    public final void execute(Runnable runnable) {
        this.A00.post(runnable);
    }

    public /* synthetic */ C173118Oj(Handler handler) {
        this.A00 = handler;
    }
}
