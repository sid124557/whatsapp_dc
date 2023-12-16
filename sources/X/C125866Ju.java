package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.media.MediaFormat;
import android.os.Handler;
import com.facebook.android.exoplayer2.audio.DefaultAudioSink;
import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.6Ju  reason: invalid class name and case insensitive filesystem */
public class C125866Ju extends AnonymousClass6JQ implements C184788sW {
    public int A00;
    public int A01 = 0;
    public int A02 = 0;
    public int A03;
    public long A04;
    public long A05 = 0;
    public AudioManager A06;
    public MediaFormat A07;
    public C166637z1 A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final Context A0D;
    public final C150677Rt A0E;
    public final DefaultAudioSink A0F;
    public final boolean A0G;
    public final boolean A0H;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C125866Ju(android.content.Context r13, android.os.Handler r14, X.C185208tG r15, X.C187008wI r16, X.C147717Fj r17, X.AnonymousClass7QT r18, X.AnonymousClass81X r19, X.C187048wM[] r20, boolean r21, boolean r22) {
        /*
            r12 = this;
            com.facebook.android.exoplayer2.audio.DefaultAudioSink r2 = new com.facebook.android.exoplayer2.audio.DefaultAudioSink
            r0 = r20
            r2.<init>(r0)
            r8 = 1
            r9 = 0
            r3 = r12
            r11 = r9
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r10 = r9
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r12.A01 = r9
            r12.A02 = r9
            r0 = 0
            r12.A05 = r0
            android.content.Context r0 = r13.getApplicationContext()
            r12.A0D = r0
            r12.A0F = r2
            r0 = r21
            r12.A0G = r0
            r0 = r22
            r12.A0H = r0
            X.7Rt r0 = new X.7Rt
            r1 = r19
            r0.<init>(r14, r1)
            r12.A0E = r0
            X.80u r0 = new X.80u
            r0.<init>(r12)
            r2.A0E = r0
            boolean r0 = r7.A0A
            r2.A0N = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C125866Ju.<init>(android.content.Context, android.os.Handler, X.8tG, X.8wI, X.7Fj, X.7QT, X.81X, X.8wM[], boolean, boolean):void");
    }

    public void A0B() {
        try {
            this.A0F.A04();
            super.A0B();
            synchronized (this.A0B) {
            }
            this.A0E.A00(this.A0B);
        } catch (Throwable th) {
            synchronized (this.A0B) {
                this.A0E.A00(this.A0B);
                throw th;
            }
        }
    }

    public final int A0N(C166637z1 r4, C160577nt r5) {
        PackageManager packageManager;
        int i = Util.A00;
        if (i >= 24 || !"OMX.google.raw.decoder".equals(r5.A02) || (i == 23 && (packageManager = this.A0D.getPackageManager()) != null && packageManager.hasSystemFeature("android.software.leanback"))) {
            return r4.A0A;
        }
        return -1;
    }

    public final void A0O() {
        long A012 = this.A0F.A01(BHW());
        if (A012 != Long.MIN_VALUE) {
            if (!this.A0A) {
                A012 = Math.max(this.A04, A012);
            }
            this.A04 = A012;
            this.A0A = false;
        }
    }

    public boolean A0P(int i, String str) {
        if ("audio/eac3-joc".equals(str)) {
            if (this.A0F.A0F(-1, 18)) {
                return true;
            }
            str = "audio/eac3";
        }
        int A002 = C162097rD.A00(str);
        if (!this.A0F.A0F(i, A002) || A002 == 0) {
            return false;
        }
        return true;
    }

    public C158167jX BBQ() {
        return this.A0F.A03().A02;
    }

    public long BBa() {
        if (this.A01 == 2) {
            A0O();
        }
        return this.A04;
    }

    public boolean BIe() {
        if (this.A0F.A0D() || super.BIe()) {
            return true;
        }
        return false;
    }

    public C158167jX Bmx(C158167jX r2) {
        this.A0F.A0B(r2);
        return r2;
    }

    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    public void A0C(long j, boolean z) {
        super.A0C(j, z);
        this.A0F.A04();
        this.A04 = j;
        this.A09 = true;
        this.A0A = true;
    }

    public void A0D(boolean z, boolean z2) {
        super.A0D(z, z2);
        C150677Rt r3 = this.A0E;
        C150237Pv r2 = this.A0B;
        Handler handler = r3.A00;
        if (handler != null) {
            AnonymousClass8MF.A00(handler, r3, r2, 1);
        }
        C157937jA r0 = this.A04;
        r0.getClass();
        if (r0.A00 != 0) {
            throw AnonymousClass6CA.A0O();
        }
    }

    public void A0L(C166637z1 r4) {
        super.A0L(r4);
        this.A08 = r4;
        C150677Rt r2 = this.A0E;
        Handler handler = r2.A00;
        if (handler != null) {
            AnonymousClass8MF.A00(handler, r2, r4, 2);
        }
    }
}
