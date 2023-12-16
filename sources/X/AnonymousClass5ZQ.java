package X;

import android.media.MediaPlayer;
import android.os.Build;
import android.os.Looper;
import java.io.File;

/* renamed from: X.5ZQ  reason: invalid class name */
public abstract class AnonymousClass5ZQ {
    public static AnonymousClass5ZQ A00(C54292oU r7, AnonymousClass1VX r8, AnonymousClass5NV r9, File file, int i) {
        boolean z;
        AnonymousClass1VX r3 = r8;
        if (r8 != null) {
            z = A01(r8);
        } else {
            z = false;
        }
        File file2 = file;
        int i2 = i;
        if (r7 == null || !z || !file.getAbsolutePath().endsWith(".opus")) {
            if (!file.getAbsolutePath().endsWith(".opus")) {
                C988853p r2 = new C988853p((Looper) null, i);
                r2.A01.setDataSource(file.getAbsolutePath());
                return r2;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("AudioPlayer/create exoplayer enabled:");
            A0o.append(z);
            A0o.append(" Build.MANUFACTURER:");
            A0o.append(Build.MANUFACTURER);
            A0o.append(" Build.DEVICE:");
            A0o.append(Build.DEVICE);
            A0o.append(" SDK_INT:");
            C18270x1.A1F(A0o, Build.VERSION.SDK_INT);
            return new C138026pe(file, i);
        } else if (r8.A0X(5138)) {
            return new C138046pg(r7.A00, r3, r9, file2, i2);
        } else {
            return new C138036pf(r7.A00, r8, file, i);
        }
    }

    public int A02() {
        return ((C988853p) this).A01.getCurrentPosition();
    }

    public int A03() {
        return ((C988853p) this).A01.getDuration();
    }

    public void A04() {
        ((C988853p) this).A01.pause();
    }

    public void A05() {
        ((C988853p) this).A01.prepare();
    }

    public void A06() {
        C988853p r1 = (C988853p) this;
        r1.A02.postDelayed(new C117095rN(r1, 24), 100);
    }

    public void A07() {
        ((C988853p) this).A01.start();
    }

    public void A08() {
        ((C988853p) this).A01.start();
    }

    public void A09() {
        C988853p r1 = (C988853p) this;
        r1.A01.stop();
        C183238pi r0 = r1.A00;
        if (r0 != null) {
            r0.Bcl();
        }
    }

    public void A0A(int i) {
        ((C988853p) this).A01.seekTo(i);
    }

    public void A0B(MediaPlayer.OnErrorListener onErrorListener) {
        ((C988853p) this).A01.setOnErrorListener(onErrorListener);
    }

    public void A0D(C183238pi r2) {
        ((C988853p) this).A00 = r2;
    }

    public boolean A0F() {
        return ((C988853p) this).A01.isPlaying();
    }

    public abstract boolean A0G(C55682qk r1, float f);

    public static boolean A01(AnonymousClass1VX r3) {
        if (!r3.A0X(751) || C107535bT.A0C(r3.A0Q(2917)) || (r3.A0X(5138) && C107535bT.A0D(r3.A0Q(5589)))) {
            return false;
        }
        return true;
    }

    public boolean A0E() {
        return false;
    }

    public void A0C(C147237Di r1) {
    }
}
