package androidx.media;

import X.C04820Qu;

public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(C04820Qu r3) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        Object obj = audioAttributesCompat.A00;
        if (r3.A09(1)) {
            obj = r3.A03();
        }
        audioAttributesCompat.A00 = (AudioAttributesImpl) obj;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, C04820Qu r2) {
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.A00;
        r2.A05(1);
        r2.A08(audioAttributesImpl);
    }
}
