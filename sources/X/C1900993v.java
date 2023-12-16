package X;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.os.SystemClock;

/* renamed from: X.93v  reason: invalid class name and case insensitive filesystem */
public class C1900993v extends AudioDeviceCallback {
    public final /* synthetic */ AnonymousClass9SC A00;

    public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            C162477s9.A04(C192569Kp.A00(audioDeviceInfo.getType()), "AudioPipelineController", "onAudioDevicesAdded %s");
            C194799Un r2 = this.A00.A09;
            r2.A01 = Integer.valueOf(audioDeviceInfo.getType());
            r2.A02 = true;
            r2.A00 = SystemClock.elapsedRealtime();
        }
    }

    public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            C162477s9.A04(C192569Kp.A00(audioDeviceInfo.getType()), "AudioPipelineController", "onAudioDevicesRemoved %s");
            C194799Un r2 = this.A00.A09;
            r2.A01 = Integer.valueOf(audioDeviceInfo.getType());
            r2.A02 = false;
            r2.A00 = SystemClock.elapsedRealtime();
        }
    }

    public C1900993v(AnonymousClass9SC r1) {
        this.A00 = r1;
    }
}
