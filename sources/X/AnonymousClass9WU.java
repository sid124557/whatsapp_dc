package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.9WU  reason: invalid class name */
public class AnonymousClass9WU {
    public static final Handler A00 = AnonymousClass000.A0A();

    public static void A00(Runnable runnable) {
        if (A02()) {
            runnable.run();
        } else {
            A00.post(runnable);
        }
    }

    public static void A01(String str) {
        if (A02()) {
            StringBuilder A0l = AnonymousClass000.A0l(str);
            A0l.append(" Current thread: ");
            throw new IllegalThreadStateException(AnonymousClass000.A0X(Thread.currentThread().getName(), A0l));
        }
    }

    public static boolean A02() {
        return AnonymousClass000.A1Y(Looper.getMainLooper().getThread(), Thread.currentThread());
    }
}
