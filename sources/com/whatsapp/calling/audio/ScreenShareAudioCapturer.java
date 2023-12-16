package com.whatsapp.calling.audio;

import X.AnonymousClass001;
import X.AnonymousClass5TU;
import X.AnonymousClass743;
import X.C149717Np;
import X.C152317Yk;
import X.C162457s7;
import X.C170948Fd;
import X.C18260x0;
import X.C626936e;
import android.media.AudioRecord;
import com.whatsapp.calling.screenshare.ScreenShareResourceManager;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

public final class ScreenShareAudioCapturer implements VoipSystemAudioDeviceFactory {
    public static final AnonymousClass743 Companion = new AnonymousClass743();
    @Deprecated
    public static final int STATE_DISABLED = 0;
    @Deprecated
    public static final int STATE_ENABLED = 1;
    @Deprecated
    public static final int STATE_NOT_SET = -1;
    public C149717Np audioRecorder;
    public final int audioSampleRate;
    public final C170948Fd mediaProjectionListener;
    public AtomicInteger mediaProjectionState = new AtomicInteger(-1);
    public final AnonymousClass5TU screenShareLoggingHelper;
    public final ScreenShareResourceManager screenShareResourceManager;

    public int read(short[] sArr, int i, int i2) {
        AnonymousClass5TU r2;
        int i3;
        C162457s7.A0J(sArr, 0);
        if (this.mediaProjectionState.get() != 1) {
            stopCapture();
            Log.e("ScreenShareAudioCapturer mediaprojection state not enabled");
            AnonymousClass5TU r22 = this.screenShareLoggingHelper;
            r22.A01 |= 1;
            r22.A03 = 1;
        } else {
            try {
                C149717Np r4 = this.audioRecorder;
                if (r4 != null) {
                    AudioRecord audioRecord = r4.A00;
                    if (audioRecord == null) {
                        C626936e.A0D(false, "captureAudio() audio record not initialized");
                        r2 = r4.A04;
                        i3 = 32;
                    } else {
                        int read = audioRecord.read(sArr, i, i2);
                        if (read >= 0) {
                            return new C152317Yk(sArr, r4.A01, read).A00;
                        }
                        C18260x0.A0x("captureAudio() No audio frame data available with read error:", AnonymousClass001.A0o(), read);
                        r2 = r4.A04;
                        i3 = 64;
                    }
                    r2.A01 |= i3;
                    r2.A03 = i3;
                    return -1;
                }
            } catch (IllegalStateException e) {
                Log.e("ScreenShareAudioCapturer read in invalid state exception", e);
                AnonymousClass5TU r23 = this.screenShareLoggingHelper;
                r23.A01 |= 8;
                r23.A03 = 8;
                return -1;
            }
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c A[Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x00a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c A[Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x00a6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean startCapture() {
        /*
            r7 = this;
            int r0 = r7.audioSampleRate
            r4 = 0
            if (r0 != 0) goto L_0x001a
            r7.stopCapture()
            X.5TU r2 = r7.screenShareLoggingHelper
            r1 = 32
            int r0 = r2.A01
            r0 = r0 | 32
            r2.A01 = r0
            r2.A03 = r1
            java.lang.String r0 = "audioSampleRate must be set to enable ScreenShareAudioCapturer"
            X.C626936e.A0D(r4, r0)
            return r4
        L_0x001a:
            com.whatsapp.calling.screenshare.ScreenShareResourceManager r0 = r7.screenShareResourceManager     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x00a6 }
            android.media.projection.MediaProjection r6 = r0.getMediaProjectionHandle()     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x00a6 }
            if (r6 == 0) goto L_0x00b8
            java.util.concurrent.atomic.AtomicInteger r1 = r7.mediaProjectionState     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x00a6 }
            r0 = -1
            r3 = 1
            r1.compareAndSet(r0, r3)     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x00a6 }
            int r2 = r7.audioSampleRate     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x00a6 }
            X.5TU r1 = r7.screenShareLoggingHelper     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x00a6 }
            X.7ct r0 = new X.7ct     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x00a6 }
            r0.<init>()     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x00a6 }
            X.7Np r5 = new X.7Np     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x00a6 }
            r5.<init>(r6, r0, r1, r2)     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x00a6 }
            r7.audioRecorder = r5     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x00a6 }
            android.media.AudioRecord r0 = r5.A00     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x00a6 }
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = "initAudioRecord() audio record already initialized"
        L_0x003f:
            X.C626936e.A0D(r4, r0)     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x00a6 }
        L_0x0042:
            android.media.AudioRecord r0 = r5.A00     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x00a6 }
            if (r0 == 0) goto L_0x005c
            int r0 = r0.getState()     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x00a6 }
            if (r0 != 0) goto L_0x005c
            java.lang.String r0 = "AudioRecorder Failed to create AudioRecord"
        L_0x004e:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x00a6 }
            X.5TU r1 = r5.A04     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x00a6 }
            int r0 = r1.A01     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x00a6 }
            r0 = r0 | 1
            r1.A01 = r0     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x00a6 }
            r1.A03 = r3     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x00a6 }
            goto L_0x00b8
        L_0x005c:
            android.media.AudioRecord r0 = r5.A00     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x00a6 }
            if (r0 == 0) goto L_0x0063
            r0.startRecording()     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x00a6 }
        L_0x0063:
            android.media.AudioRecord r0 = r5.A00     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x00a6 }
            if (r0 == 0) goto L_0x0074
            int r1 = r0.getRecordingState()     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x00a6 }
            r0 = 3
            if (r1 != r0) goto L_0x0074
            java.lang.String r0 = "ScreenShareAudioCapturer startCapture started successfully"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x00a6 }
            goto L_0x0095
        L_0x0074:
            java.lang.String r0 = "AudioRecorder Failed to start recording"
            goto L_0x004e
        L_0x0077:
            int r2 = r5.A01     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x00a6 }
            if (r2 != 0) goto L_0x007e
            java.lang.String r0 = "initAudioRecord() audio sample rate is zero"
            goto L_0x003f
        L_0x007e:
            r1 = 16
            r0 = 2
            int r0 = android.media.AudioRecord.getMinBufferSize(r2, r1, r0)     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x00a6 }
            int r1 = r0 * 2
            if (r1 > 0) goto L_0x008c
            java.lang.String r0 = "initAudioRecord() minBufferSize invalid"
            goto L_0x003f
        L_0x008c:
            android.media.projection.MediaProjection r0 = r5.A02     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x00a6 }
            android.media.AudioRecord r0 = X.C154267ct.A00(r0, r2, r1)     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x00a6 }
            r5.A00 = r0     // Catch:{ IllegalStateException -> 0x0096, IllegalArgumentException -> 0x00a6 }
            goto L_0x0042
        L_0x0095:
            return r3
        L_0x0096:
            r3 = move-exception
            X.5TU r2 = r7.screenShareLoggingHelper
            r1 = 8
            int r0 = r2.A01
            r0 = r0 | 8
            r2.A01 = r0
            r2.A03 = r1
            java.lang.String r0 = "ScreenShareAudioCapturer exception during startCapture"
            goto L_0x00b4
        L_0x00a6:
            r3 = move-exception
            X.5TU r2 = r7.screenShareLoggingHelper
            r1 = 256(0x100, float:3.59E-43)
            int r0 = r2.A01
            r0 = r0 | r1
            r2.A01 = r0
            r2.A03 = r1
            java.lang.String r0 = "ScreenShareAudioCapturer illegal argument for AudioRecord"
        L_0x00b4:
            com.whatsapp.util.Log.e(r0, r3)
            goto L_0x00bd
        L_0x00b8:
            java.lang.String r0 = "ScreenShareAudioCapturer Unable to startCapture"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00bd:
            r7.stopCapture()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.audio.ScreenShareAudioCapturer.startCapture():boolean");
    }

    public boolean stopCapture() {
        try {
            C149717Np r1 = this.audioRecorder;
            if (r1 != null) {
                AudioRecord audioRecord = r1.A00;
                if (audioRecord != null) {
                    audioRecord.stop();
                }
                AudioRecord audioRecord2 = r1.A00;
                if (audioRecord2 != null) {
                    audioRecord2.release();
                }
                r1.A00 = null;
            }
        } catch (IllegalStateException e) {
            Log.e("ScreenShareAudioCapturer exception during stopCapture", e);
        }
        this.audioRecorder = null;
        this.screenShareResourceManager.unregisterListener(this.mediaProjectionListener);
        this.mediaProjectionState.set(-1);
        return true;
    }

    public ScreenShareAudioCapturer(int i, AnonymousClass5TU r4, ScreenShareResourceManager screenShareResourceManager2) {
        C18260x0.A0S(r4, screenShareResourceManager2);
        this.audioSampleRate = i;
        this.screenShareLoggingHelper = r4;
        this.screenShareResourceManager = screenShareResourceManager2;
        C170948Fd r0 = new C170948Fd(this);
        this.mediaProjectionListener = r0;
        screenShareResourceManager2.registerListener(r0);
    }
}
