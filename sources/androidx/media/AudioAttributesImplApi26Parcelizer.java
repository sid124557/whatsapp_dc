package androidx.media;

import X.C04820Qu;
import android.media.AudioAttributes;

public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(C04820Qu r3) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.A01 = (AudioAttributes) r3.A01(audioAttributesImplApi26.A01, 1);
        audioAttributesImplApi26.A00 = r3.A00(audioAttributesImplApi26.A00, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, C04820Qu r3) {
        r3.A07(audioAttributesImplApi26.A01, 1);
        r3.A06(audioAttributesImplApi26.A00, 2);
    }
}
