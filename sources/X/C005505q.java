package X;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.05q  reason: invalid class name and case insensitive filesystem */
public class C005505q extends C005605r {
    public Method A06(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public Typeface A05(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.A00, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.A05.invoke((Object) null, new Object[]{newInstance, "sans-serif", -1, -1});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
