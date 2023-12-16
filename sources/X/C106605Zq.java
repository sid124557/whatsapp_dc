package X;

import android.graphics.Paint;
import android.os.Build;
import com.whatsapp.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.5Zq  reason: invalid class name and case insensitive filesystem */
public class C106605Zq {
    public static final Method A00;
    public static final Method A01;

    static {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("getMethod", new Class[]{String.class, Class[].class});
            if (declaredMethod != null) {
                Class<Paint> cls = Paint.class;
                Class<Method> cls2 = Method.class;
                A00 = (Method) A02(cls2, cls, declaredMethod, "getUnderlinePosition", null);
                A01 = (Method) A02(cls2, cls, declaredMethod, "getUnderlineThickness", null);
            }
        } catch (NoSuchMethodException | SecurityException e) {
            Log.e("paintcompat/no method getMethod", e);
        }
    }

    public static float A00(Paint paint) {
        if (Build.VERSION.SDK_INT >= 29) {
            return paint.getUnderlinePosition();
        }
        Method method = A00;
        if (method != null) {
            Number number = (Number) A02(Float.class, paint, method, AnonymousClass4L0.A0U());
            if (number != null) {
                return number.floatValue();
            }
        }
        return paint.getTextSize() / 12.0f;
    }

    public static float A01(Paint paint) {
        if (Build.VERSION.SDK_INT >= 29) {
            return paint.getUnderlineThickness();
        }
        Method method = A01;
        if (method != null) {
            Number number = (Number) A02(Float.class, paint, method, AnonymousClass4L0.A0U());
            if (number != null) {
                return number.floatValue();
            }
        }
        return paint.getTextSize() / 18.0f;
    }

    public static Object A02(Class cls, Object obj, Method method, Object... objArr) {
        try {
            return cls.cast(method.invoke(obj, objArr));
        } catch (ClassCastException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            Log.e("paintcompat/invoke exception", e);
            return null;
        }
    }
}
