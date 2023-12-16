package X;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* renamed from: X.6DI  reason: invalid class name */
public class AnonymousClass6DI extends AudioDeviceCallback {
    public final /* synthetic */ AnonymousClass4LZ A00;

    public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        for (AudioDeviceInfo A01 : audioDeviceInfoArr) {
            if (C154427d9.A01(A01)) {
                this.A00.A03(2);
                return;
            }
        }
    }

    public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        for (AudioDeviceInfo A01 : audioDeviceInfoArr) {
            if (C154427d9.A01(A01)) {
                this.A00.A03(0);
                return;
            }
        }
    }

    public AnonymousClass6DI(AnonymousClass4LZ r1) {
        this.A00 = r1;
    }
}
