package com.facebook.msys.mci;

import X.AnonymousClass0RZ;

public class JsonSerialization {
    public static boolean sInitialized;

    public static native void nativeInitialize();

    public static synchronized boolean initialize() {
        synchronized (JsonSerialization.class) {
            AnonymousClass0RZ.A01("JsonSerialization.initialize");
            try {
                if (sInitialized) {
                    return false;
                }
                nativeInitialize();
                sInitialized = true;
                AnonymousClass0RZ.A00();
                return true;
            } finally {
                AnonymousClass0RZ.A00();
            }
        }
    }

    public static boolean isMCPEnabledForJsonSerialization() {
        return false;
    }
}
