package com.whatsapp.calling.audio;

import X.AnonymousClass5TU;
import X.C18260x0;
import android.os.Build;
import com.whatsapp.calling.screenshare.ScreenShareResourceManager;
import com.whatsapp.util.Log;

public final class VoipSystemAudioManager {
    public final AnonymousClass5TU screenShareLoggingHelper;
    public final ScreenShareResourceManager screenShareResourceManager;

    public final synchronized VoipSystemAudioDeviceFactory createSystemAudioDevice(int i) {
        if (Build.VERSION.SDK_INT < 23) {
            Log.w("createSystemAudioDevice: unsupported API level");
            return null;
        }
        Log.i("createSystemAudioDevice: creating system audio device");
        return new ScreenShareAudioCapturer(i, this.screenShareLoggingHelper, this.screenShareResourceManager);
    }

    public VoipSystemAudioManager(AnonymousClass5TU r1, ScreenShareResourceManager screenShareResourceManager2) {
        C18260x0.A0Q(r1, screenShareResourceManager2);
        this.screenShareLoggingHelper = r1;
        this.screenShareResourceManager = screenShareResourceManager2;
    }
}
