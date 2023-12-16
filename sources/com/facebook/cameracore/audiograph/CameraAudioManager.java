package com.facebook.cameracore.audiograph;

import X.C162477s9;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;

public class CameraAudioManager {
    public HybridData mHybridData;

    private native HybridData initHybrid(float f);

    public native AudioGraphClientProvider getAudioGraphClientProvider();

    public native int getNumSamples();

    public native float getSampleRate();

    public native boolean getSpeakers();

    public native int getState();

    public native String getStateStr(int i);

    public native void setSpeakers(boolean z);

    public native int setState(int i);

    public native int setStateSync(int i);

    static {
        SoLoader.A06("audiograph-native");
    }

    public void onAudioData(byte[] bArr, long j) {
        C162477s9.A06("CameraAudioManager", "onAudioData");
    }
}
