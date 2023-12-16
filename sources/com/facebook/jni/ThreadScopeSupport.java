package com.facebook.jni;

import X.C159587m8;

public class ThreadScopeSupport {
    public static native void runStdFunctionImpl(long j);

    static {
        C159587m8.A01("fbjni");
    }

    public static void runStdFunction(long j) {
        runStdFunctionImpl(j);
    }
}
