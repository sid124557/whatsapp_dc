package X;

import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0Jx  reason: invalid class name and case insensitive filesystem */
public final class C03380Jx {
    public static long A00;
    public static Method A01;

    public static boolean A00() {
        try {
            if (A01 == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            Method method = A01;
            if (method == null) {
                Class<Trace> cls = Trace.class;
                A00 = cls.getField("TRACE_TAG_APP").getLong((Object) null);
                method = AnonymousClass001.A0r(cls, Long.TYPE, "isTagEnabled", new Class[1], 0);
                A01 = method;
            }
            Object[] objArr = new Object[1];
            AnonymousClass000.A1Q(objArr, 0, A00);
            return AnonymousClass000.A1Z((Object) null, method, objArr);
        } catch (Exception e) {
            if (e instanceof InvocationTargetException) {
                Throwable cause = e.getCause();
                if (cause instanceof RuntimeException) {
                    throw cause;
                }
                throw new RuntimeException(cause);
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Unable to call ");
            A0o.append("isTagEnabled");
            Log.v("Trace", AnonymousClass000.A0X(" via reflection", A0o), e);
            return false;
        }
    }
}
