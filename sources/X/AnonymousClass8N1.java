package X;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: X.8N1  reason: invalid class name */
public class AnonymousClass8N1 implements PrivilegedExceptionAction {
    public /* bridge */ /* synthetic */ Object run() {
        Class<Unsafe> cls = Unsafe.class;
        for (Field field : cls.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get((Object) null);
            if (cls.isInstance(obj)) {
                return cls.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }
}
