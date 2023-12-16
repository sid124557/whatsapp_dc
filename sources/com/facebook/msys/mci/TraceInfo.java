package com.facebook.msys.mci;

import X.C626936e;
import com.facebook.simplejni.NativeHolder;

public class TraceInfo {
    public final NativeHolder mNativeHolder;

    public static native NativeHolder initNativeHolder(Integer num, String str);

    private native boolean nativeEquals(Object obj);

    public native String getTraceId();

    public native Integer getTraceType();

    public native int hashCode();

    public native String toString();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TraceInfo)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public TraceInfo(Integer num, String str) {
        C626936e.A06(num);
        C626936e.A06(str);
        this.mNativeHolder = initNativeHolder(num, str);
    }

    public TraceInfo(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
