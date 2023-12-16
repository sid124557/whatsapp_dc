package X;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* renamed from: X.7XR  reason: invalid class name */
public final class AnonymousClass7XR {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
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
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public AudioTrack A0L;
    public AnonymousClass7U3 A0M;
    public Method A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final C178038gr A0T;
    public final long[] A0U;

    public final long A00() {
        AudioTrack audioTrack = this.A0L;
        audioTrack.getClass();
        long j = this.A0K;
        if (j != -9223372036854775807L) {
            return Math.min(this.A06, this.A0J + AnonymousClass6C7.A0H(AnonymousClass6C8.A0L() - j, (long) this.A03));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long A0M2 = AnonymousClass6C8.A0M(audioTrack.getPlaybackHeadPosition());
        if (this.A0R) {
            if (playState == 2 && A0M2 == 0) {
                this.A0E = this.A0B;
            }
            A0M2 += this.A0E;
        }
        if (C162387ry.A01 <= 29) {
            if (A0M2 == 0) {
                long j2 = this.A0B;
                if (j2 > 0 && playState == 3) {
                    if (this.A07 == -9223372036854775807L) {
                        this.A07 = SystemClock.elapsedRealtime();
                    }
                    return j2;
                }
            }
            this.A07 = -9223372036854775807L;
        }
        if (this.A0B > A0M2) {
            this.A0H++;
        }
        this.A0B = A0M2;
        return A0M2 + (this.A0H << 32);
    }

    public AnonymousClass7XR(C178038gr r4) {
        this.A0T = r4;
        try {
            this.A0N = AudioTrack.class.getMethod("getLatency", (Class[]) null);
        } catch (NoSuchMethodException unused) {
        }
        this.A0U = new long[10];
    }

    public boolean A01(long j) {
        if (j > A00()) {
            return true;
        }
        if (!this.A0R) {
            return false;
        }
        AudioTrack audioTrack = this.A0L;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2 && A00() == 0) {
            return true;
        }
        return false;
    }
}
