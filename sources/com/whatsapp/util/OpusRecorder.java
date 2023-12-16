package com.whatsapp.util;

import java.io.Closeable;

public class OpusRecorder implements Closeable {
    public long nativeHandle;

    private native void allocateNative(String str, int i);

    private native void freeNative();

    public native long getPageNumber();

    public native boolean isRecording();

    public native void pause();

    public native void prepare();

    public native void setInitialVariablesForResume(long j, long j2);

    public native void start();

    public native void stop();

    public OpusRecorder(String str, int i) {
        allocateNative(str, i);
    }

    public void finalize() {
        super.finalize();
        if (this.nativeHandle != 0) {
            Log.d("OpusRecorder not closed before finalize");
            freeNative();
        }
    }

    public void close() {
        freeNative();
    }
}
