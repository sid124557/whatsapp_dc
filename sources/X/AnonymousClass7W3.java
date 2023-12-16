package X;

import android.media.AudioTrack;
import android.os.Handler;
import com.facebook.android.exoplayer2.audio.DefaultAudioSink;
import java.util.Objects;

/* renamed from: X.7W3  reason: invalid class name */
public final class AnonymousClass7W3 {
    public final AudioTrack.StreamEventCallback A00;
    public final Handler A01 = new Handler();
    public final /* synthetic */ DefaultAudioSink A02;

    public AnonymousClass7W3(DefaultAudioSink defaultAudioSink) {
        this.A02 = defaultAudioSink;
        this.A00 = new AnonymousClass6DJ(this, defaultAudioSink);
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
