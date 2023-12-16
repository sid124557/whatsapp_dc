package X;

import java.lang.reflect.Field;
import java.util.Set;

/* renamed from: X.34F  reason: invalid class name */
public class AnonymousClass34F {
    public static final Set A00 = C18320x8.A0u();

    public static void A01(AnonymousClass1VX r4) {
        if (r4.A0Y(C58422vE.A02, 3663)) {
            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                if (stackTraceElement != null) {
                    A00.add(stackTraceElement.getClassName());
                }
            }
        }
    }

    public static Object A00(Object obj, String str) {
        Class cls = obj.getClass();
        Class cls2 = cls;
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                declaredField.setAccessible(true);
                return declaredField.get(obj);
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Unable to find field ");
        A0o.append(str);
        throw new NoSuchFieldException(AnonymousClass000.A0P(cls2, " in ", A0o));
    }
}
