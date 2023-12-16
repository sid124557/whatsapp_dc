package X;

import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: X.2XX  reason: invalid class name */
public class AnonymousClass2XX {
    public final Handler A00;
    public final Executor A01;

    public AnonymousClass2XX() {
        Handler A0A = AnonymousClass000.A0A();
        this.A00 = A0A;
        Objects.requireNonNull(A0A);
        this.A01 = new C86044Ip(A0A, 0);
    }

    public void A00(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.A00.post(runnable);
        }
    }
}
