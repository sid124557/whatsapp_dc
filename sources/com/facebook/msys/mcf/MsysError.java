package com.facebook.msys.mcf;

import com.facebook.simplejni.NativeHolder;
import java.util.Map;

public class MsysError extends Throwable {
    public final NativeHolder mNativeHolder;

    public static native String getDescriptionKey();

    public static native String getLocalizedDescriptionKey();

    public static native String getLocalizedFailureReasonKey();

    public static native String getUnderlyingErrorKey();

    public static native NativeHolder initNativeHolder(String str, int i, Map map);

    private native boolean nativeEquals(MsysError msysError);

    public native Throwable getCause();

    public native int getCode();

    public native String getDomain();

    public native String getFailureReason();

    public native String getLocalizedMessage();

    public native String getMessage();

    public native Map getUserInfo();

    public native int hashCode();

    public native String toString();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MsysError)) {
            return false;
        }
        return nativeEquals((MsysError) obj);
    }

    public MsysError(String str, int i, Map map) {
        this(initNativeHolder(str, i, map));
    }

    public MsysError(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
