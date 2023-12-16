package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.7mf  reason: invalid class name and case insensitive filesystem */
public final class C159907mf {
    public static final Method A00;
    public static final Method A01;
    public static final Method A02;
    public static final Method A03;
    public static volatile boolean A04;

    static {
        boolean z;
        Class<String> cls = String.class;
        try {
            Class<?> cls2 = Class.forName("android.os.SystemProperties");
            Method A0r = AnonymousClass001.A0r(cls2, cls, "get", new Class[1], 0);
            Class[] clsArr = new Class[2];
            clsArr[0] = cls;
            Method A0r2 = AnonymousClass001.A0r(cls2, Long.TYPE, "getLong", clsArr, 1);
            Class[] clsArr2 = new Class[2];
            clsArr2[0] = cls;
            C149197Lk r1 = new C149197Lk(AnonymousClass001.A0r(cls2, Runnable.class, "addChangeCallback", new Class[1], 0), A0r, A0r2, AnonymousClass001.A0r(cls2, cls, "set", clsArr2, 1));
            A00 = r1.A00;
            A01 = r1.A01;
            A02 = r1.A02;
            A03 = r1.A03;
            z = true;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            z = false;
        }
        A04 = z;
    }

    public static long A00(String str) {
        if (A04) {
            Method method = A02;
            Object[] A1a = C18310x6.A1a(str);
            AnonymousClass000.A1Q(A1a, 1, 0);
            Object obj = null;
            if (method != null) {
                try {
                    obj = method.invoke((Object) null, A1a);
                } catch (IllegalAccessException unused) {
                    A04 = false;
                } catch (InvocationTargetException unused2) {
                }
            }
            Number number = (Number) obj;
            if (number != null) {
                return number.longValue();
            }
        }
        return 0;
    }

    public static String A01(String str) {
        if (A04) {
            Method method = A01;
            Object[] A0L = AnonymousClass002.A0L();
            A0L[0] = str;
            Object obj = null;
            if (method != null) {
                try {
                    obj = method.invoke((Object) null, A0L);
                } catch (IllegalAccessException unused) {
                    A04 = false;
                } catch (InvocationTargetException unused2) {
                }
            }
            String str2 = (String) obj;
            if (str2 != null) {
                return str2;
            }
        }
        return "";
    }
}
