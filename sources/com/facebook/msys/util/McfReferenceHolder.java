package com.facebook.msys.util;

import X.C180418l0;

public final class McfReferenceHolder implements C180418l0 {
    public long nativeReference = 0;

    private void setNativeReference(long j) {
        this.nativeReference = j;
    }

    public long getNativeReference() {
        return this.nativeReference;
    }
}
