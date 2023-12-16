package X;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0K0  reason: invalid class name */
public class AnonymousClass0K0 {
    public static Method A00;
    public static Method A01;
    public static boolean A02;

    public static void A00(Canvas canvas, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (z) {
                canvas.enableZ();
            } else {
                canvas.disableZ();
            }
        } else if (i != 28) {
            if (!A02) {
                Class<Canvas> cls = Canvas.class;
                try {
                    Method declaredMethod = cls.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    A01 = declaredMethod;
                    declaredMethod.setAccessible(true);
                    Method declaredMethod2 = cls.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                    A00 = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                A02 = true;
            }
            if (z) {
                try {
                    Method method = A01;
                    if (method != null) {
                        method.invoke(canvas, new Object[0]);
                    }
                } catch (IllegalAccessException unused2) {
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e.getCause());
                }
            } else {
                Method method2 = A00;
                if (method2 != null) {
                    method2.invoke(canvas, new Object[0]);
                }
            }
        } else {
            throw AnonymousClass001.A0e("This method doesn't work on Pie!");
        }
    }
}
