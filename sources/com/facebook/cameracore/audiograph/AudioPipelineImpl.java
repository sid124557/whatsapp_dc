package com.facebook.cameracore.audiograph;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass9Z0;
import X.C162477s9;
import X.C192579Kq;
import X.C201969lA;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;

public class AudioPipelineImpl {
    public static final boolean IS_UNIT_TEST = "robolectric".equals(Build.FINGERPRINT);
    public static final C192579Kq sEmptyAudioPerfStatsProvider = new C192579Kq();
    public static final AnonymousClass9Z0 sEmptyStateCallback = new AnonymousClass9Z0();
    public volatile Handler mAudioPlayerThread;
    public volatile Handler mAudioRecorderThread;
    public volatile AudioTrack mAudioTrack;
    public HybridData mHybridData;
    public volatile C201969lA mStartInputCallback;
    public volatile Handler mStartInputHandler;
    public volatile C201969lA mStopInputCallback;
    public volatile Handler mStopInputHandler;

    private native int createFbaProcessingGraphInternal(int i, int i2, boolean z);

    private native int createManualProcessingGraphInternal(int i, int i2);

    private native HybridData initHybrid(int i, float f, int i2, boolean z);

    private native int startInputInternal();

    private native int stopInputInternal();

    public native AudioGraphClientProvider getAudioGraphClientProvider();

    public native String getDebugInfo();

    public native String getFBAProfileInfo(int i);

    public native boolean isSubgraphInserted();

    public native void onReceivedAudioMixingMode(int i);

    public native int pause();

    public native int processAndPullSpeaker(byte[] bArr, int i);

    public native int processAndPullSpeakerWithByteBuffer(ByteBuffer byteBuffer, int i);

    public native int processByteBuffer(ByteBuffer byteBuffer, int i);

    public native int processData(byte[] bArr, int i);

    public native int pullCaptureSinkQueue(ByteBuffer byteBuffer, int i);

    public native int resume();

    public native void updateOutputRouteState(int i);

    public void handleDebugEvent(String str) {
        throw AnonymousClass001.A0g("handleDebugEvent");
    }

    public boolean setAudioMixing(int i) {
        throw AnonymousClass001.A0g("setAudioMixing");
    }

    public int startPlatformOutput() {
        C162477s9.A06("AudioPipeline", "startPlatformOutput");
        throw AnonymousClass000.A0G("Bad audio format ", AnonymousClass001.A0o(), 0);
    }

    public int stopPlatformOutput() {
        C162477s9.A06("AudioPipeline", "stopPlatformOutput");
        if (this.mAudioPlayerThread != null) {
            throw AnonymousClass001.A0g("quitThread");
        }
        throw AnonymousClass001.A0g("monitor-enter");
    }

    public int startPlatformInput() {
        return 0;
    }

    public int stopPlatformInput() {
        return 0;
    }

    public void handleAudioCallback(byte[] bArr, long j, long j2) {
    }
}
