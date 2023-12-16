package X;

import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: X.3Wh  reason: invalid class name and case insensitive filesystem */
public class C69253Wh implements C84104Ba {
    public final Handler A00;
    public final Executor A01;

    public static void A00(C69253Wh r2, Object obj, Object obj2, int i) {
        r2.A00.post(new C70123Zz(obj, i, obj2));
    }

    public static void A01(C69253Wh r0, Runnable runnable) {
        r0.A00.post(runnable);
    }

    public C69253Wh() {
        Handler A0A = AnonymousClass000.A0A();
        this.A00 = A0A;
        Objects.requireNonNull(A0A);
        this.A01 = new C86044Ip(A0A, 0);
    }

    public void BkS(Runnable runnable) {
        if (C615631i.A02()) {
            runnable.run();
        } else {
            A01(this, runnable);
        }
    }
}
