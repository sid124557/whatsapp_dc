package X;

import android.media.AudioTrack;
import android.os.Handler;
import java.util.Objects;

/* renamed from: X.7WA  reason: invalid class name */
public final class AnonymousClass7WA {
    public final AudioTrack.StreamEventCallback A00;
    public final Handler A01 = new Handler();
    public final /* synthetic */ AnonymousClass86A A02;

    public AnonymousClass7WA(AnonymousClass86A r2) {
        this.A02 = r2;
        this.A00 = new AnonymousClass6DK(this, r2);
    }

    public void A00(AudioTrack audioTrack) {
        Handler handler = this.A01;
        Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new C86044Ip(handler, 0), this.A00);
    }

    public void A01(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.A00);
        this.A01.removeCallbacksAndMessages((Object) null);
    }
}
