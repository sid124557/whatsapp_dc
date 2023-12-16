package android.support.v4.media;

import X.C04820Qu;
import androidx.media.AudioAttributesCompat;

public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(C04820Qu r0) {
        return androidx.media.AudioAttributesCompatParcelizer.read(r0);
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, C04820Qu r1) {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat, r1);
    }
}
