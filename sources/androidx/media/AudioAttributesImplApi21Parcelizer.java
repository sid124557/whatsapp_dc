package androidx.media;

import X.C04820Qu;
import android.media.AudioAttributes;

public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(C04820Qu r3) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.A01 = (AudioAttributes) r3.A01(audioAttributesImplApi21.A01, 1);
        audioAttributesImplApi21.A00 = r3.A00(audioAttributesImplApi21.A00, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, C04820Qu r3) {
        r3.A07(audioAttributesImplApi21.A01, 1);
        r3.A06(audioAttributesImplApi21.A00, 2);
    }
}
