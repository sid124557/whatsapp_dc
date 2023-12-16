package X;

import android.util.Log;
import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.80n  reason: invalid class name and case insensitive filesystem */
public class C1672980n implements C186328v7 {
    public int A00;
    public boolean A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final AnonymousClass7ZV A08;

    public C1672980n(AnonymousClass7ZV r6, int i, int i2, int i3, int i4, int i5) {
        A00(i3, 0, "bufferForPlaybackMs", "0");
        A00(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        A00(i, i3, "minBufferMs", "bufferForPlaybackMs");
        A00(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        A00(i2, i, "maxBufferMs", "minBufferMs");
        A00(0, 0, "backBufferDurationMs", "0");
        this.A08 = r6;
        this.A07 = Util.A04((long) i);
        this.A06 = Util.A04((long) i2);
        this.A05 = Util.A04((long) i3);
        this.A04 = Util.A04((long) i4);
        this.A02 = i5;
        this.A00 = i5 == -1 ? 13107200 : i5;
        this.A03 = Util.A04((long) 0);
    }

    public void BYk() {
        A01(false);
    }

    public void BZm() {
        A01(true);
    }

    public void Bcs() {
        A01(true);
    }

    public final void A01(boolean z) {
        int i = this.A02;
        if (i == -1) {
            i = 13107200;
        }
        this.A00 = i;
        this.A01 = false;
        if (z) {
            AnonymousClass7ZV r1 = this.A08;
            synchronized (r1) {
                r1.A02(0);
            }
        }
    }

    public AnonymousClass7ZV B4U() {
        return this.A08;
    }

    public long B4a() {
        return this.A03;
    }

    public void BeT(C166607yy r6, C187398x9[] r7, C187428xC[] r8) {
        int i = this.A02;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < r7.length; i3++) {
                if (r8[i3] != null) {
                    int i4 = 13107200;
                    if (r7[i3].A0B != 1) {
                        i4 = 131072000;
                    }
                    i2 += i4;
                }
            }
            i = Math.max(13107200, i2);
        }
        this.A00 = i;
        this.A08.A02(i);
    }

    public boolean BkE() {
        return false;
    }

    public boolean Bo6(float f, long j, long j2, boolean z) {
        boolean z2 = true;
        boolean A1U = C18280x3.A1U(this.A08.A00(), this.A00);
        long j3 = this.A07;
        if (f > 1.0f) {
            if (f != 1.0f) {
                j3 = Math.round(((double) j3) * ((double) f));
            }
            j3 = Math.min(j3, this.A06);
        }
        if (j < Math.max(j3, 500000)) {
            if (A1U) {
                z2 = false;
            }
            this.A01 = z2;
            if (!z2 && j < 500000) {
                Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j >= this.A06 || A1U) {
            this.A01 = false;
        }
        return this.A01;
    }

    public boolean BoZ(float f, long j, boolean z, boolean z2) {
        long j2;
        if (f != 1.0f) {
            j = Math.round(((double) j) / ((double) f));
        }
        if (z) {
            j2 = this.A04;
        } else {
            j2 = this.A05;
        }
        if (j2 <= 0 || j >= j2 || this.A08.A00() >= this.A00) {
            return true;
        }
        return false;
    }

    public static void A00(int i, int i2, String str, String str2) {
        boolean A1U = C18280x3.A1U(i, i2);
        String A0V = AnonymousClass000.A0V(" cannot be less than ", str2, AnonymousClass000.A0l(str));
        if (!A1U) {
            throw AnonymousClass6C7.A0U(A0V);
        }
    }

    public void Bmr(long j, long j2) {
    }

    public C1672980n() {
        this(new AnonymousClass7ZV(65536), 50000, 50000, 2500, 5000, -1);
    }
}
