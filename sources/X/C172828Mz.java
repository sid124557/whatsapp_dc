package X;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: X.8Mz  reason: invalid class name and case insensitive filesystem */
public final class C172828Mz implements PrivilegedExceptionAction {
    public final /* synthetic */ Object run() {
        Class<Unsafe> cls = Unsafe.class;
        for (Field field : cls.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get((Object) null);
            if (cls.isInstance(obj)) {
                return cls.cast(obj);
            }
        }
        return null;
    }
}
