package X;

import android.media.AudioManager;

/* renamed from: X.91A  reason: invalid class name */
public class AnonymousClass91A implements AudioManager.OnAudioFocusChangeListener {
    public final int A00;

    public AnonymousClass91A(int i) {
        this.A00 = i;
    }

    public final void onAudioFocusChange(int i) {
        if (this.A00 == 0) {
            C18260x0.A0y("voip audio focus changed: ", AnonymousClass001.A0o(), i);
        }
    }
}
