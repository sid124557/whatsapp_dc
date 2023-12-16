package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.0fS  reason: invalid class name and case insensitive filesystem */
public class C08980fS implements C15340rB {
    public final Handler A00;

    public C08980fS() {
        Handler handler;
        Looper mainLooper = Looper.getMainLooper();
        if (Build.VERSION.SDK_INT >= 28) {
            handler = C02840Hu.A00(mainLooper);
        } else {
            try {
                handler = AnonymousClass001.A0O(mainLooper);
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException e) {
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(mainLooper);
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if ((cause instanceof RuntimeException) || (cause instanceof Error)) {
                    throw cause;
                }
                throw new RuntimeException(cause);
            }
        }
        this.A00 = handler;
    }
}
