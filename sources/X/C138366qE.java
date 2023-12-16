package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.whatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.6qE  reason: invalid class name and case insensitive filesystem */
public class C138366qE extends AnonymousClass5YG {
    public final VideoSurfaceView A00;

    public int A05() {
        return this.A00.getCurrentPosition();
    }

    public int A06() {
        return this.A00.getDuration();
    }

    public Bitmap A08() {
        return null;
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
        this.A00.A00();
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
        return C86624Kv.A1W(this.A00.getCurrentPosition(), 50);
    }

    public boolean A0c() {
        return false;
    }

    public C138366qE(Context context, String str, boolean z) {
        C138396qH r2 = new C138396qH(context, this);
        this.A00 = r2;
        r2.setVideoPath(str);
        r2.A0A = new C1894291g(this, 0);
        r2.A09 = new C1892790r(this, 0);
        r2.setLooping(z);
    }
}
