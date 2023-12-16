package X;

import android.media.AudioManager;
import android.os.Handler;

/* renamed from: X.7su  reason: invalid class name and case insensitive filesystem */
public class C162877su implements AudioManager.OnAudioFocusChangeListener {
    public final Handler A00;
    public final /* synthetic */ AnonymousClass7ZX A01;

    public C162877su(Handler handler, AnonymousClass7ZX r2) {
        this.A01 = r2;
        this.A00 = handler;
    }

    public void onAudioFocusChange(int i) {
        this.A00.post(new C117705sM((Object) this, i, 1));
    }
}
