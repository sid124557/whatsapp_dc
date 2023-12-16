package com.facebook.android.exoplayer2.ext.opus;

import X.C159847mZ;

public final class OpusLibrary {
    public static native String opusGetVersion();

    public static native boolean opusIsSecureDecodeSupported();

    static {
        C159847mZ.A00("goog.exo.opus");
    }
}
