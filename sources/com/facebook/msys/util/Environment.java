package com.facebook.msys.util;

import X.C626936e;

public class Environment {
    public static native synchronized boolean setenvNative(String str, String str2, boolean z);

    public static boolean setenv(String str, String str2, boolean z) {
        C626936e.A06(str);
        C626936e.A06(str2);
        return setenvNative(str, str2, z);
    }

    public static boolean setenv(String str, String str2) {
        return setenv(str, str2, true);
    }
}
