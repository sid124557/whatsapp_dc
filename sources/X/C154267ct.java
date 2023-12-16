package X;

import android.media.AudioFormat;
import android.media.AudioPlaybackCaptureConfiguration;
import android.media.AudioRecord;
import android.media.projection.MediaProjection;

/* renamed from: X.7ct  reason: invalid class name and case insensitive filesystem */
public final class C154267ct {
    public static final AudioRecord A00(MediaProjection mediaProjection, int i, int i2) {
        AudioPlaybackCaptureConfiguration build = new AudioPlaybackCaptureConfiguration.Builder(mediaProjection).addMatchingUsage(14).addMatchingUsage(1).addMatchingUsage(0).build();
        C162457s7.A0D(build);
        AudioRecord build2 = new AudioRecord.Builder().setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(i).setChannelMask(16).build()).setAudioPlaybackCaptureConfig(build).setBufferSizeInBytes(i2).build();
        C162457s7.A0D(build2);
        return build2;
    }
}
