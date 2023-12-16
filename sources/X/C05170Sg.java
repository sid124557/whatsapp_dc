package X;

import android.content.res.Resources;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0Sg  reason: invalid class name and case insensitive filesystem */
public class C05170Sg {
    public static Method A00;
    public static boolean A01;
    public static final Object A02 = AnonymousClass002.A0D();

    public static void A00(Resources.Theme theme) {
        synchronized (A02) {
            if (!A01) {
                try {
                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                    A00 = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                }
                A01 = true;
            }
            Method method = A00;
            if (method != null) {
                try {
                    method.invoke(theme, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException e2) {
                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                    A00 = null;
                }
            }
        }
    }
}
