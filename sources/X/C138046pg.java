package X;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Looper;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.6pg  reason: invalid class name and case insensitive filesystem */
public final class C138046pg extends AnonymousClass5ZQ {
    public int A00 = 0;
    public C159117l9 A01;
    public C55682qk A02;
    public C147237Di A03;
    public C183238pi A04;
    public boolean A05;
    public boolean A06 = false;
    public boolean A07 = false;
    public final Uri A08;
    public final C162997t6 A09;

    public void A04() {
        this.A07 = false;
        this.A09.A06();
    }

    public void A06() {
        this.A03 = null;
        this.A06 = false;
        this.A07 = false;
        this.A09.A08();
    }

    public void A08() {
        this.A07 = true;
        this.A09.A07();
    }

    public void A09() {
        this.A07 = false;
        this.A09.A0A();
        C183238pi r0 = this.A04;
        if (r0 != null) {
            r0.Bcl();
        }
    }

    public int A02() {
        return (int) this.A09.A02();
    }

    public int A03() {
        return this.A00;
    }

    public void A05() {
        this.A09.A0B(1.0f);
    }

    public void A07() {
        this.A09.A07();
    }

    public void A0A(int i) {
        C162997t6 r2 = this.A09;
        C146527Ap r1 = new C146527Ap();
        r1.A00 = i;
        r2.A0E(new AnonymousClass7RE(r1));
    }

    public void A0B(MediaPlayer.OnErrorListener onErrorListener) {
    }

    public void A0C(C147237Di r1) {
        this.A03 = r1;
    }

    public void A0D(C183238pi r1) {
        this.A04 = r1;
    }

    public boolean A0E() {
        return this.A06;
    }

    public boolean A0F() {
        C162997t6 r2 = this.A09;
        if (r2 == null) {
            return false;
        }
        if (this.A07 || r2.A0L()) {
            return true;
        }
        return false;
    }

    public boolean A0G(C55682qk r6, float f) {
        this.A02 = r6;
        try {
            C162997t6 r2 = this.A09;
            if (AnonymousClass002.A00(r2.A0L, f) >= 0.1f) {
                r2.A0J("setPlaybackSpeed", AnonymousClass4L0.A0U());
                AnonymousClass6C7.A10(r2.A0C, Float.valueOf(f), 26);
            }
            return true;
        } catch (IllegalArgumentException | IllegalStateException unused) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("currSpeed: ");
            A0o.append(-1.0f);
            A0o.append(" , newSpeed: ");
            A0o.append(f);
            r6.A0A("heroaudioplayer/setPlaybackSpeed failed", true, A0o.toString());
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("heroaudioplayer/setPlaybackSpeed failed, currSpeed: ");
            A0o2.append(-1.0f);
            A0o2.append(" , newSpeed: ");
            A0o2.append(f);
            Log.e(A0o2.toString());
            return false;
        }
    }

    public C138046pg(Context context, AnonymousClass1VX r12, AnonymousClass5NV r13, File file, int i) {
        C162997t6 r8;
        boolean z = false;
        Uri fromFile = Uri.fromFile(file);
        this.A08 = fromFile;
        this.A05 = false;
        this.A01 = C159117l9.A00(context, r13.A00(), C186628vg.A00, AnonymousClass001.A0t());
        boolean A1V = C18270x1.A1V(r13.A02);
        C159117l9 r4 = this.A01;
        if (A1V) {
            r8 = new C162997t6((Looper) r13.A00.getValue(), new AnonymousClass85A(this), r4, r13.A00());
        } else {
            r8 = new C162997t6(new AnonymousClass85A(this), r4, r13.A00());
        }
        this.A09 = r8;
        int i2 = 1;
        z = r12.A0X(6395) ? true : z;
        C162457s7.A0J(fromFile, 0);
        C151277Uc r0 = new C151277Uc(C141266vI.IN_PLAY, C166577yv.A00(fromFile, String.valueOf(C1459677z.A00.addAndGet(1)), "WA_Player_Origin", "WA_Player_SubOrigin", AnonymousClass001.A0t()), "WA_MEDIA", C141076uz.AUDIO_ONLY.mValue);
        r0.A0C = true;
        r0.A0A = z;
        r8.A0H(r0.A00());
        i2 = i == 0 ? 2 : i2;
        C162997t6 r3 = this.A09;
        Integer valueOf = Integer.valueOf(i2);
        r3.A0J("setAudioUsage: %d", valueOf);
        AnonymousClass6C7.A10(r3.A0C, valueOf, 23);
        AnonymousClass6C7.A10(this.A09.A0C, new AnonymousClass85G(this), 44);
    }
}
