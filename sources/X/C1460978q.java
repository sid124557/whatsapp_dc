package X;

import java.lang.reflect.Method;

/* renamed from: X.78q  reason: invalid class name and case insensitive filesystem */
public final class C1460978q {
    public static final Method A00;
    public static final Method A01;

    static {
        Method method;
        Method method2;
        Class cls;
        Class<Throwable> cls2 = Throwable.class;
        Method[] methods = cls2.getMethods();
        C162457s7.A0H(methods);
        int length = methods.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            method = null;
            if (i2 >= length) {
                method2 = null;
                break;
            }
            method2 = methods[i2];
            if (C162457s7.A0P(method2.getName(), "addSuppressed")) {
                Class[] parameterTypes = method2.getParameterTypes();
                C162457s7.A0D(parameterTypes);
                if (parameterTypes.length == 1) {
                    cls = parameterTypes[0];
                } else {
                    cls = null;
                }
                if (C162457s7.A0P(cls, cls2)) {
                    break;
                }
            }
            i2++;
        }
        A00 = method2;
        while (true) {
            if (i >= length) {
                break;
            }
            Method method3 = methods[i];
            if (C162457s7.A0P(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
            i++;
        }
        A01 = method;
    }
}
