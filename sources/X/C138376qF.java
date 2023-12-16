package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.view.View;

/* renamed from: X.6qF  reason: invalid class name and case insensitive filesystem */
public class C138376qF extends AnonymousClass5YG {
    public final C138346qC A00;

    public int A05() {
        return this.A00.getCurrentPosition();
    }

    public int A06() {
        return this.A00.getDuration();
    }

    public Bitmap A08() {
        return this.A00.getBitmap();
    }

    public View A09() {
        return this.A00;
    }

    public void A0C() {
        this.A00.pause();
    }

    public void A0F() {
        this.A00.start();
    }

    public void A0G() {
        C138346qC r1 = this.A00;
        MediaPlayer mediaPlayer = r1.A09;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            r1.A09.release();
            r1.A09 = null;
            r1.A0H = false;
            r1.A00 = 0;
            r1.A03 = 0;
        }
    }

    public void A0P(int i) {
        this.A00.seekTo(i);
    }

    public void A0Z(boolean z) {
        this.A00.setMute(z);
    }

    public boolean A0a() {
        return this.A00.isPlaying();
    }

    public boolean A0b() {
        return this.A00.A0H;
    }

    public boolean A0c() {
        return false;
    }

    public C138376qF(Context context, String str, boolean z) {
        C138406qI r2 = new C138406qI(context, this);
        this.A00 = r2;
        r2.A0B = str;
        r2.A07 = new C1894291g(this, 1);
        r2.A06 = new C1892790r(this, 1);
        r2.setLooping(z);
    }
}
