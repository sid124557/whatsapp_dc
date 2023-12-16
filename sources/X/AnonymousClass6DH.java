package X;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* renamed from: X.6DH  reason: invalid class name */
public class AnonymousClass6DH extends AudioDeviceCallback {
    public final /* synthetic */ C132726fr A00;

    public AnonymousClass6DH(C132726fr r1) {
        this.A00 = r1;
    }

    public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.A00.A00();
    }

    public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.A00.A00();
    }
}
