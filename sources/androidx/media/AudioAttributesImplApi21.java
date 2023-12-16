package androidx.media;

import X.AnonymousClass000;
import X.AnonymousClass001;
import android.media.AudioAttributes;

public class AudioAttributesImplApi21 implements AudioAttributesImpl {
    public int A00 = -1;
    public AudioAttributes A01;

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this.A01 = audioAttributes;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.A01.equals(((AudioAttributesImplApi21) obj).A01);
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AudioAttributesCompat: audioattributes=");
        return AnonymousClass000.A0R(this.A01, A0o);
    }

    public AudioAttributesImplApi21() {
    }
}
