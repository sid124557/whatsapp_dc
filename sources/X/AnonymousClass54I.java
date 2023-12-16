package X;

import android.media.SoundPool;
import java.lang.ref.WeakReference;

/* renamed from: X.54I  reason: invalid class name */
public final class AnonymousClass54I extends C72173dI {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass54I(AnonymousClass4FS r2) {
        super(r2, true);
        C162457s7.A0J(r2, 1);
    }

    public final void A05(SoundPool soundPool, float f, float f2, int i) {
        C162457s7.A0J(soundPool, 0);
        execute(new C117315rj(soundPool, (WeakReference) null, f, f2, i));
    }
}
