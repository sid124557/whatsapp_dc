package X;

import android.os.Trace;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.7f1  reason: invalid class name and case insensitive filesystem */
public final class C155507f1 {
    public static final long A00;
    public static final Method A01;
    public static final Method A02;
    public static volatile boolean A03;

    static {
        boolean z = true;
        Class<Trace> cls = Trace.class;
        try {
            Class<?> cls2 = Long.TYPE;
            Method A0r = AnonymousClass001.A0r(cls, cls2, "isTagEnabled", new Class[1], 0);
            Method A0r2 = AnonymousClass001.A0r(cls, Boolean.TYPE, "setAppTracingAllowed", new Class[1], 0);
            Field field = cls.getField("TRACE_TAG_APP");
            if (field.getType() == cls2) {
                AnonymousClass7J1 r1 = new AnonymousClass7J1(A0r, A0r2, field.getLong((Object) null));
                A01 = r1.A01;
                A02 = r1.A02;
                A00 = r1.A00;
                A03 = z;
            }
        } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException unused) {
        }
        z = false;
        A03 = z;
    }

    public static Object A00(Method method, Object... objArr) {
        try {
            return method.invoke((Object) null, objArr);
        } catch (IllegalAccessException unused) {
            A03 = false;
            return null;
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (!(targetException instanceof RuntimeException) && !(targetException instanceof Error)) {
                return null;
            }
            throw targetException;
        }
    }
}
