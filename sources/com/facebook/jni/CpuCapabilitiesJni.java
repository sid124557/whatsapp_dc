package com.facebook.jni;

import X.C159587m8;

public class CpuCapabilitiesJni {
    public static native boolean nativeDeviceSupportsNeon();

    public static native boolean nativeDeviceSupportsVFPFP16();

    public static native boolean nativeDeviceSupportsX86();

    static {
        C159587m8.A01("fb");
    }
}
