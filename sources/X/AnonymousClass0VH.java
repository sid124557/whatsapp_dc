package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.0VH  reason: invalid class name */
public final class AnonymousClass0VH {
    public static final Handler A00 = AnonymousClass000.A0A();

    public static void A00() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw AnonymousClass001.A0e("Not running on main thread when it is required to");
        }
    }

    public static void A01(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            A00.post(runnable);
        }
    }
}
