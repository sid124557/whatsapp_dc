package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.Constructor;

/* renamed from: X.7et  reason: invalid class name and case insensitive filesystem */
public final class C155447et {
    public static final C831446h A00;
    public static volatile Choreographer choreographer;

    static {
        Object obj;
        Object obj2 = null;
        try {
            obj = new C831346g(A00(Looper.getMainLooper()), false);
        } catch (Throwable th) {
            obj = new AnonymousClass3Z0(th);
        }
        if (!(obj instanceof AnonymousClass3Z0)) {
            obj2 = obj;
        }
        A00 = (C831446h) obj2;
    }

    public static final Handler A00(Looper looper) {
        Object newInstance;
        if (Build.VERSION.SDK_INT >= 28) {
            newInstance = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object) null, new Object[]{looper});
            C162457s7.A0K(newInstance, "null cannot be cast to non-null type android.os.Handler");
        } else {
            Class cls = Handler.class;
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE});
                Object[] A0V = AnonymousClass4L0.A0V(looper, (Object) null, 3);
                A0V[2] = Boolean.TRUE;
                newInstance = declaredConstructor.newInstance(A0V);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        return (Handler) newInstance;
    }
}
