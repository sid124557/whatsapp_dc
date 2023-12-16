package X;

import android.media.AudioAttributes;

/* renamed from: X.0WR  reason: invalid class name */
public class AnonymousClass0WR {
    public static AudioAttributes.Builder A00() {
        return new AudioAttributes.Builder();
    }

    public static AudioAttributes.Builder A01(AudioAttributes.Builder builder, int i) {
        return builder.setContentType(i);
    }

    public static AudioAttributes.Builder A02(AudioAttributes.Builder builder, int i) {
        return builder.setUsage(i);
    }

    public static AudioAttributes A03(AudioAttributes.Builder builder) {
        return builder.build();
    }
}
