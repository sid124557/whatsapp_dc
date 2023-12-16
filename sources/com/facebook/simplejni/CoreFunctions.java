package com.facebook.simplejni;

import X.C18300x5;

public class CoreFunctions {
    public static native void runWithClassLoader(long j, long j2);

    public static String getErrorDescription(Throwable th) {
        return C18300x5.A0W(th).toString();
    }
}
