package X;

import java.security.AccessController;

/* renamed from: X.75w  reason: invalid class name and case insensitive filesystem */
public class C1454375w {
    public static Class A00(String str, Class cls) {
        try {
            ClassLoader classLoader = cls.getClassLoader();
            if (classLoader != null) {
                return classLoader.loadClass(str);
            }
            return (Class) AccessController.doPrivileged(new C1897992r(str, 0));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
