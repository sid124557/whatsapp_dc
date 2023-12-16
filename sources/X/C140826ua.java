package X;

import java.lang.reflect.Method;

/* renamed from: X.6ua  reason: invalid class name and case insensitive filesystem */
public class C140826ua extends ClassLoader {
    public static final String A00 = AnonymousClass7q2.class.getName();
    public static final Class[] A01;

    public Class A00(String str, byte[] bArr) {
        try {
            Method declaredMethod = ClassLoader.class.getDeclaredMethod("defineClass", A01);
            declaredMethod.setAccessible(true);
            ClassLoader parent = getParent();
            Object[] A0V = AnonymousClass4L0.A0V(str, bArr, 4);
            AnonymousClass000.A1N(A0V, 0);
            AnonymousClass000.A1O(A0V, bArr.length);
            return (Class) declaredMethod.invoke(parent, A0V);
        } catch (Exception unused) {
            return defineClass(str, bArr, 0, bArr.length);
        }
    }

    public synchronized Class loadClass(String str, boolean z) {
        Class cls;
        if (str.equals(A00)) {
            cls = AnonymousClass7q2.class;
        } else {
            cls = super.loadClass(str, z);
        }
        return cls;
    }

    static {
        Class cls = Integer.TYPE;
        A01 = new Class[]{String.class, byte[].class, cls, cls};
    }

    public C140826ua(ClassLoader classLoader) {
        super(classLoader);
    }
}
