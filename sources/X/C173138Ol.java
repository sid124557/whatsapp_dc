package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.8Ol  reason: invalid class name and case insensitive filesystem */
public final class C173138Ol implements Executor {
    public final Handler A00 = new C124786Dw(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.A00.post(runnable);
    }
}
