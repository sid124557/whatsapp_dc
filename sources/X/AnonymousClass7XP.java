package X;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.facebook.android.exoplayer2.util.Util;
import java.lang.reflect.Method;

/* renamed from: X.7XP  reason: invalid class name */
public final class AnonymousClass7XP {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public AudioTrack A0G;
    public C151247Tz A0H;
    public Method A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public final C1463479x A0M;
    public final long[] A0N;

    public final long A00() {
        AudioTrack audioTrack = this.A0G;
        audioTrack.getClass();
        long j = this.A0F;
        if (j != -9223372036854775807L) {
            return Math.min(this.A05, this.A0E + AnonymousClass6C7.A0H(AnonymousClass6C8.A0L() - j, (long) this.A02));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long A0M2 = AnonymousClass6C8.A0M(audioTrack.getPlaybackHeadPosition());
        if (this.A0L) {
            if (playState == 2 && A0M2 == 0) {
                this.A0B = this.A09;
            }
            A0M2 += this.A0B;
        }
        if (Util.A00 <= 29) {
            if (A0M2 == 0) {
                long j2 = this.A09;
                if (j2 > 0 && playState == 3) {
                    if (this.A06 == -9223372036854775807L) {
                        this.A06 = SystemClock.elapsedRealtime();
                    }
                    return j2;
                }
            }
            this.A06 = -9223372036854775807L;
        }
        if (this.A09 > A0M2) {
            this.A0C++;
        }
        this.A09 = A0M2;
        return A0M2 + (this.A0C << 32);
    }

    public AnonymousClass7XP(C1463479x r4) {
        this.A0M = r4;
        try {
            this.A0I = AudioTrack.class.getMethod("getLatency", (Class[]) null);
        } catch (NoSuchMethodException unused) {
        }
        this.A0N = new long[10];
    }

    public boolean A01(long j) {
        if (j > A00()) {
            return true;
        }
        if (!this.A0L) {
            return false;
        }
        AudioTrack audioTrack = this.A0G;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2 && A00() == 0) {
            return true;
        }
        return false;
    }
}
