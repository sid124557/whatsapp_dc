package X;

import android.media.AudioTrack;

/* renamed from: X.8Ro  reason: invalid class name and case insensitive filesystem */
public class C173758Ro extends Thread {
    public final /* synthetic */ AudioTrack A00;
    public final /* synthetic */ AnonymousClass86A A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C173758Ro(AudioTrack audioTrack, AnonymousClass86A r3) {
        super("ExoPlayer:AudioTrackReleaseThread");
        this.A01 = r3;
        this.A00 = audioTrack;
    }

    public void run() {
        try {
            AudioTrack audioTrack = this.A00;
            audioTrack.flush();
            audioTrack.release();
        } finally {
            this.A01.A0Z.open();
        }
    }
}
