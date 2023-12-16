package X;

import android.media.MediaPlayer;
import com.whatsapp.util.Log;
import com.whatsapp.util.OpusPlayer;
import java.io.File;
import java.io.IOException;

/* renamed from: X.6pe  reason: invalid class name and case insensitive filesystem */
public final class C138026pe extends AnonymousClass5ZQ {
    public C183238pi A00;
    public final OpusPlayer A01;

    public int A02() {
        try {
            return (int) this.A01.getCurrentPosition();
        } catch (IOException e) {
            Log.e((Throwable) e);
            return 0;
        }
    }

    public int A03() {
        try {
            return (int) this.A01.getLength();
        } catch (IOException e) {
            Log.e((Throwable) e);
            return 0;
        }
    }

    public void A04() {
        try {
            this.A01.pause();
        } catch (IOException e) {
            Log.e((Throwable) e);
        }
    }

    public void A05() {
        this.A01.prepare();
    }

    public void A06() {
        this.A01.close();
    }

    public void A07() {
        this.A01.resume();
    }

    public void A08() {
        this.A01.start();
    }

    public void A09() {
        try {
            this.A01.stop();
            C183238pi r0 = this.A00;
            if (r0 != null) {
                r0.Bcl();
            }
        } catch (IOException e) {
            Log.e((Throwable) e);
        }
    }

    public void A0A(int i) {
        this.A01.seek((long) i);
    }

    public void A0B(MediaPlayer.OnErrorListener onErrorListener) {
    }

    public void A0C(C147237Di r1) {
    }

    public void A0D(C183238pi r1) {
        this.A00 = r1;
    }

    public boolean A0F() {
        try {
            return this.A01.isPlaying();
        } catch (IOException e) {
            Log.e((Throwable) e);
            return false;
        }
    }

    public C138026pe(File file, int i) {
        this.A01 = new OpusPlayer(file.getAbsolutePath(), i);
    }

    public boolean A0G(C55682qk r2, float f) {
        return false;
    }
}
