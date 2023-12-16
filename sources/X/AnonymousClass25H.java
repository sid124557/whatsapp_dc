package X;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Exchanger;

/* renamed from: X.25H  reason: invalid class name */
public final class AnonymousClass25H {
    public static Object A00(Handler handler, Object obj, Callable callable) {
        if (Thread.currentThread() == handler.getLooper().getThread()) {
            try {
                return callable.call();
            } catch (Exception e) {
                throw C18330xA.A09(e);
            }
        } else {
            Exchanger exchanger = new Exchanger();
            if (!handler.post(new C70183a5(exchanger, 40, callable))) {
                return obj;
            }
            try {
                return exchanger.exchange((Object) null);
            } catch (InterruptedException e2) {
                throw C18330xA.A09(e2);
            }
        }
    }
}
