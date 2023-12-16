package X;

import android.media.AudioTrack;
import com.facebook.android.exoplayer2.audio.DefaultAudioSink;

/* renamed from: X.6DJ  reason: invalid class name */
public class AnonymousClass6DJ extends AudioTrack.StreamEventCallback {
    public final /* synthetic */ AnonymousClass7W3 A00;
    public final /* synthetic */ DefaultAudioSink A01;

    public AnonymousClass6DJ(AnonymousClass7W3 r1, DefaultAudioSink defaultAudioSink) {
        this.A00 = r1;
        this.A01 = defaultAudioSink;
    }

    public void onDataRequest(AudioTrack audioTrack, int i) {
        C159197lM.A02(AnonymousClass000.A1Y(audioTrack, this.A00.A02.A0B));
    }

    public void onTearDown(AudioTrack audioTrack) {
        C159197lM.A02(AnonymousClass000.A1Y(audioTrack, this.A00.A02.A0B));
    }
}
