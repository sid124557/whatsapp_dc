package X;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi21;

/* renamed from: X.0eP  reason: invalid class name and case insensitive filesystem */
public class C08410eP implements C16650tk {
    public final AudioAttributes.Builder A00 = new AudioAttributes.Builder();

    public C08410eP A00(int i) {
        this.A00.setUsage(1);
        return this;
    }

    public /* bridge */ /* synthetic */ C16650tk Bni(int i) {
        A00(1);
        return this;
    }

    public AudioAttributesImpl AyA() {
        return new AudioAttributesImplApi21(this.A00.build());
    }
}
