package com.facebook.animated.webp;

import X.AnonymousClass7OK;
import X.AnonymousClass7Z5;
import X.C141216vD;
import X.C141386vU;
import X.C154677dZ;
import X.C186338v8;
import java.nio.ByteBuffer;

public class WebPImage implements C186338v8 {
    public long mNativeContext;

    public static native WebPImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    public static native WebPImage nativeCreateFromNativeMemory(long j, int i);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    /* access modifiers changed from: private */
    /* renamed from: nativeGetFrame */
    public native WebPFrame getFrame(int i);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    public boolean doesRenderSupportScaling() {
        return true;
    }

    public WebPImage(long j) {
        this.mNativeContext = j;
    }

    public static WebPImage createFromByteArray(byte[] bArr, AnonymousClass7Z5 r2) {
        C154677dZ.A00();
        bArr.getClass();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        allocateDirect.rewind();
        return nativeCreateFromDirectByteBuffer(allocateDirect);
    }

    public void dispose() {
        nativeDispose();
    }

    public void finalize() {
        nativeFinalize();
    }

    public int getDuration() {
        return nativeGetDuration();
    }

    public int getFrameCount() {
        return nativeGetFrameCount();
    }

    public int[] getFrameDurations() {
        return nativeGetFrameDurations();
    }

    public AnonymousClass7OK getFrameInfo(int i) {
        C141216vD r3;
        C141386vU r4;
        WebPFrame nativeGetFrame = getFrame(i);
        try {
            int xOffset = nativeGetFrame.getXOffset();
            int yOffset = nativeGetFrame.getYOffset();
            int width = nativeGetFrame.getWidth();
            int height = nativeGetFrame.getHeight();
            if (nativeGetFrame.isBlendWithPreviousFrame()) {
                r3 = C141216vD.BLEND_WITH_PREVIOUS;
            } else {
                r3 = C141216vD.NO_BLEND;
            }
            if (nativeGetFrame.shouldDisposeToBackgroundColor()) {
                r4 = C141386vU.DISPOSE_TO_BACKGROUND;
            } else {
                r4 = C141386vU.DISPOSE_DO_NOT;
            }
            return new AnonymousClass7OK(r3, r4, xOffset, yOffset, width, height);
        } finally {
            nativeGetFrame.dispose();
        }
    }

    public int getHeight() {
        return nativeGetHeight();
    }

    public int getLoopCount() {
        return nativeGetLoopCount();
    }

    public int getSizeInBytes() {
        return nativeGetSizeInBytes();
    }

    public int getWidth() {
        return nativeGetWidth();
    }

    public WebPImage() {
    }

    public WebPFrame getFrame(int i) {
        return getFrame(i);
    }
}
