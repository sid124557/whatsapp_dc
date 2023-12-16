package com.facebook.soloader;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass6CA;
import X.C18260x0;
import dalvik.system.BaseDexClassLoader;

public class SysUtil$Api14Utils {
    public static String A00() {
        ClassLoader classLoader = SoLoader.class.getClassLoader();
        if (classLoader == null || (classLoader instanceof BaseDexClassLoader)) {
            try {
                return (String) AnonymousClass000.A0K(BaseDexClassLoader.class, (BaseDexClassLoader) classLoader, "getLdLibraryPath");
            } catch (Exception e) {
                throw AnonymousClass6CA.A0Q("Cannot call getLdLibraryPath", e);
            }
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            C18260x0.A1T(A0o, "ClassLoader ", classLoader);
            throw AnonymousClass000.A0I(" should be of type BaseDexClassLoader", A0o);
        }
    }
}
