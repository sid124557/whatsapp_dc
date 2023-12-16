package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.8Ok  reason: invalid class name and case insensitive filesystem */
public class C173128Ok implements Executor {
    public final Handler A00;

    public final void execute(Runnable runnable) {
        this.A00.post(runnable);
    }

    public C173128Ok(Looper looper) {
        this.A00 = new C124816Dz(looper);
    }
}
