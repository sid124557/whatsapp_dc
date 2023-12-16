package X;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7d9  reason: invalid class name and case insensitive filesystem */
public final class C154427d9 {
    public static List A00(AudioManager audioManager) {
        ArrayList A0s = AnonymousClass001.A0s();
        if (audioManager != null) {
            ArrayList A0s2 = AnonymousClass001.A0s();
            for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
                if (A01(audioDeviceInfo)) {
                    A0s.add(audioDeviceInfo);
                }
                C18270x1.A1K(A0s2, audioDeviceInfo.getType());
            }
            C18260x0.A1R(AnonymousClass001.A0o(), "BluetoothHeadsetDetector/getConnectedBluetoothHeadsets output device types: ", A0s2);
        }
        return A0s;
    }

    public static boolean A01(AudioDeviceInfo audioDeviceInfo) {
        int type = audioDeviceInfo.getType();
        if (type == 7 || type == 26) {
            return true;
        }
        return false;
    }
}
