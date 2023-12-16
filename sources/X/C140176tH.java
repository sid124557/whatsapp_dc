package X;

import dalvik.system.PathClassLoader;

/* renamed from: X.6tH  reason: invalid class name and case insensitive filesystem */
public final class C140176tH extends PathClassLoader {
    public final Class loadClass(String str, boolean z) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z);
    }

    public C140176tH(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }
}
