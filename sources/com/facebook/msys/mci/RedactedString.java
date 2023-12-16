package com.facebook.msys.mci;

import X.C626936e;
import com.facebook.simplejni.NativeHolder;

public class RedactedString {
    public NativeHolder mNativeHolder;

    private native boolean equalsNative(Object obj);

    public static native NativeHolder initNativeHolder(String str);

    public static native NativeHolder initNativeHolder(String str, int i);

    public native String getOriginalString();

    public native int hashCode();

    public native int leakAllowance();

    public native String toString();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof RedactedString)) {
            return false;
        }
        return equalsNative(obj);
    }

    public RedactedString(String str) {
        C626936e.A06(str);
        this.mNativeHolder = initNativeHolder(str);
    }

    public RedactedString(String str, int i) {
        C626936e.A06(str);
        this.mNativeHolder = initNativeHolder(str, i);
    }

    public RedactedString(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
