package X;

import android.os.SystemClock;
import android.util.Log;
import com.facebook.android.exoplayer2.audio.DefaultAudioSink;

/* renamed from: X.80p  reason: invalid class name and case insensitive filesystem */
public abstract class C1673180p implements C187398x9, C184688sM {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C157937jA A04;
    public C159967mm A05;
    public C185238tJ A06;
    public C142576xQ A07 = C142576xQ.UNKNOWN;
    public boolean A08;
    public boolean A09;
    public C166637z1[] A0A;
    public final int A0B;
    public final C1463279v A0C;

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass6JW A07(X.C166637z1 r10, java.lang.Throwable r11, int r12) {
        /*
            r9 = this;
            r1 = 0
            r2 = r10
            if (r10 == 0) goto L_0x0018
            boolean r0 = r9.A09
            if (r0 != 0) goto L_0x0018
            r0 = 1
            r9.A09 = r0
            int r0 = r9.BqN(r10)     // Catch:{ 6JW -> 0x0016, all -> 0x0012 }
            r8 = r0 & 7
            goto L_0x001a
        L_0x0012:
            r0 = move-exception
            r9.A09 = r1
            throw r0
        L_0x0016:
            r9.A09 = r1
        L_0x0018:
            r8 = 4
            goto L_0x001c
        L_0x001a:
            r9.A09 = r1
        L_0x001c:
            java.lang.String r3 = r9.getName()
            int r7 = r9.A00
            r5 = 1
            if (r10 != 0) goto L_0x0026
            r8 = 4
        L_0x0026:
            X.6JW r1 = new X.6JW
            r4 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1673180p.A07(X.7z1, java.lang.Throwable, int):X.6JW");
    }

    public abstract void A0B();

    public abstract void A0C(long j, boolean z);

    public abstract void A0D(boolean z, boolean z2);

    public final int A06(C1463279v r9, AnonymousClass6Jl r10, int i) {
        C185238tJ r0 = this.A06;
        r0.getClass();
        int BiJ = r0.BiJ(r9, r10, i);
        if (BiJ == -4) {
            if ((r10.A00 & 4) == 4) {
                this.A02 = Long.MIN_VALUE;
                if (!this.A08) {
                    return -3;
                }
                return -4;
            }
            long j = r10.A00 + this.A03;
            r10.A00 = j;
            this.A02 = Math.max(this.A02, j);
        } else if (BiJ == -5) {
            C166637z1 r7 = r9.A00;
            r7.getClass();
            long j2 = r7.A0J;
            if (j2 != Long.MAX_VALUE) {
                C157797it r1 = new C157797it(r7);
                r1.A0I = j2 + this.A03;
                r9.A00 = new C166637z1(r1);
                return BiJ;
            }
        }
        return BiJ;
    }

    public void A08() {
        DefaultAudioSink defaultAudioSink;
        if (this instanceof AnonymousClass6JR) {
            defaultAudioSink = ((AnonymousClass6JR) this).A0J;
        } else if (this instanceof C125856Jt) {
            C125856Jt r2 = (C125856Jt) this;
            r2.A07 = 0;
            r2.A08 = 0;
            r2.A09 = 0;
            r2.A0H = SystemClock.elapsedRealtime();
            r2.A0M = AnonymousClass6C8.A0L();
            return;
        } else {
            defaultAudioSink = ((C125866Ju) this).A0F;
        }
        defaultAudioSink.A0P = true;
        if (defaultAudioSink.A0B != null) {
            C151247Tz r1 = defaultAudioSink.A0W.A0H;
            r1.getClass();
            r1.A00(0);
            defaultAudioSink.A0B.play();
        }
    }

    public void A09() {
        DefaultAudioSink defaultAudioSink;
        if (this instanceof AnonymousClass6JR) {
            AnonymousClass6JR r0 = (AnonymousClass6JR) this;
            r0.A0H();
            defaultAudioSink = r0.A0J;
        } else if (this instanceof C125856Jt) {
            C125856Jt r2 = (C125856Jt) this;
            r2.A0K = -9223372036854775807L;
            r2.A0P();
            return;
        } else {
            C125866Ju r02 = (C125866Ju) this;
            r02.A0O();
            defaultAudioSink = r02.A0F;
        }
        defaultAudioSink.A0P = false;
        if (defaultAudioSink.A0B != null) {
            AnonymousClass7XP r6 = defaultAudioSink.A0W;
            r6.A0D = 0;
            r6.A03 = 0;
            r6.A01 = 0;
            r6.A08 = 0;
            if (r6.A0F == -9223372036854775807L) {
                C151247Tz r03 = r6.A0H;
                r03.getClass();
                r03.A00(0);
                defaultAudioSink.A0B.pause();
            }
        }
    }

    public void A0A(long j) {
        if (this instanceof C125856Jt) {
            C125856Jt r4 = (C125856Jt) this;
            if (r4.A0O == -9223372036854775807L) {
                r4.A0O = j;
                return;
            }
            int i = r4.A0A;
            long[] jArr = r4.A0l;
            if (i == jArr.length) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Too many stream changes, so dropping offset: ");
                Log.w("MediaCodecVideoRenderer", AnonymousClass001.A0k(A0o, jArr[i - 1]));
            } else {
                r4.A0A = i + 1;
            }
            int i2 = r4.A0A - 1;
            jArr[i2] = j;
            r4.A0m[i2] = r4.A0L;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005d, code lost:
        if (r4.BIe() == false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a2, code lost:
        if (r10 != null) goto L_0x0078;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0124  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BF2(int r9, java.lang.Object r10) {
        /*
            r8 = this;
            boolean r0 = r8 instanceof X.AnonymousClass6JR
            if (r0 == 0) goto L_0x0033
            r1 = r8
            X.6JR r1 = (X.AnonymousClass6JR) r1
            r0 = 2
            if (r9 == r0) goto L_0x0025
            r0 = 3
            if (r9 == r0) goto L_0x001f
            r0 = 6
            if (r9 != r0) goto L_0x001e
            X.7Ui r10 = (X.C151337Ui) r10
            com.facebook.android.exoplayer2.audio.DefaultAudioSink r1 = r1.A0J
        L_0x0014:
            X.7Ui r0 = r1.A0F
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x001e
            r1.A0F = r10
        L_0x001e:
            return
        L_0x001f:
            X.80g r10 = (X.AnonymousClass80g) r10
            com.facebook.android.exoplayer2.audio.DefaultAudioSink r1 = r1.A0J
            goto L_0x0104
        L_0x0025:
            com.facebook.android.exoplayer2.audio.DefaultAudioSink r2 = r1.A0J
            float r1 = X.AnonymousClass001.A05(r10)
            float r0 = r2.A00
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x001e
            goto L_0x011e
        L_0x0033:
            boolean r0 = r8 instanceof X.C125856Jt
            if (r0 == 0) goto L_0x00ee
            r4 = r8
            X.6Jt r4 = (X.C125856Jt) r4
            r7 = 1
            if (r9 != r7) goto L_0x00d5
            android.view.Surface r10 = (android.view.Surface) r10
            if (r10 != 0) goto L_0x0046
            android.view.Surface r0 = r4.A0Q
            if (r0 == 0) goto L_0x00a5
            r10 = r0
        L_0x0046:
            android.view.Surface r0 = r4.A0R
            if (r0 == r10) goto L_0x00ba
            r4.A0R = r10
            long r0 = android.os.SystemClock.elapsedRealtime()
            r4.A0N = r0
            int r6 = r4.A01
            boolean r0 = r4.A0b
            if (r0 == 0) goto L_0x005f
            boolean r0 = r4.BIe()
            r5 = 1
            if (r0 != 0) goto L_0x0060
        L_0x005f:
            r5 = 0
        L_0x0060:
            r3 = 2
            if (r6 == r7) goto L_0x0065
            if (r6 != r3) goto L_0x00a2
        L_0x0065:
            X.8vT r2 = r4.A0E
            int r1 = com.facebook.android.exoplayer2.util.Util.A00
            r0 = 23
            if (r1 < r0) goto L_0x009c
            if (r2 == 0) goto L_0x009c
            if (r10 == 0) goto L_0x009c
            boolean r0 = r4.A0Y
            if (r0 != 0) goto L_0x009c
            X.C125856Jt.A04(r10, r2)
        L_0x0078:
            android.view.Surface r0 = r4.A0Q
            if (r10 == r0) goto L_0x0128
            r4.A0Q()
            r4.A0O()
            if (r6 == r3) goto L_0x0086
            if (r5 == 0) goto L_0x001e
        L_0x0086:
            long r5 = r4.A0g
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0096
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 + r5
        L_0x0093:
            r4.A0K = r0
            return
        L_0x0096:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0093
        L_0x009c:
            r4.A0G()
            r4.A0I()
        L_0x00a2:
            if (r10 == 0) goto L_0x0128
            goto L_0x0078
        L_0x00a5:
            X.7nt r2 = r4.A0F
            if (r2 == 0) goto L_0x0046
            boolean r0 = r4.A0S(r2)
            if (r0 == 0) goto L_0x0046
            android.content.Context r1 = r4.A0h
            boolean r0 = r2.A07
            X.6EV r10 = X.AnonymousClass6EV.A01(r1, r0)
            r4.A0Q = r10
            goto L_0x0046
        L_0x00ba:
            if (r10 == 0) goto L_0x001e
            android.view.Surface r0 = r4.A0Q
            if (r10 == r0) goto L_0x001e
            r4.A0Q()
            boolean r0 = r4.A0c
            if (r0 == 0) goto L_0x001e
            X.7FE r3 = r4.A0j
            android.view.Surface r2 = r4.A0R
            android.os.Handler r1 = r3.A00
            if (r1 == 0) goto L_0x001e
            r0 = 11
            X.AnonymousClass8MF.A00(r1, r3, r2, r0)
            return
        L_0x00d5:
            r0 = 4
            if (r9 != r0) goto L_0x00e6
            int r1 = X.AnonymousClass001.A0K(r10)
            r4.A0F = r1
            X.8vT r0 = r4.A0E
            if (r0 == 0) goto L_0x001e
            r0.Bnn(r1)
            return
        L_0x00e6:
            r0 = 7
            if (r9 != r0) goto L_0x001e
            X.7Ax r10 = (X.C146607Ax) r10
            r4.A0U = r10
            return
        L_0x00ee:
            r1 = r8
            X.6Ju r1 = (X.C125866Ju) r1
            r0 = 2
            if (r9 == r0) goto L_0x0112
            r0 = 3
            if (r9 == r0) goto L_0x0100
            r0 = 6
            if (r9 != r0) goto L_0x001e
            X.7Ui r10 = (X.C151337Ui) r10
            com.facebook.android.exoplayer2.audio.DefaultAudioSink r1 = r1.A0F
            goto L_0x0014
        L_0x0100:
            X.80g r10 = (X.AnonymousClass80g) r10
            com.facebook.android.exoplayer2.audio.DefaultAudioSink r1 = r1.A0F
        L_0x0104:
            X.80g r0 = r1.A0D
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x001e
            r1.A0D = r10
            r1.A04()
            return
        L_0x0112:
            com.facebook.android.exoplayer2.audio.DefaultAudioSink r2 = r1.A0F
            float r1 = X.AnonymousClass001.A05(r10)
            float r0 = r2.A00
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x001e
        L_0x011e:
            r2.A00 = r1
            android.media.AudioTrack r0 = r2.A0B
            if (r0 == 0) goto L_0x001e
            r0.setVolume(r1)
            return
        L_0x0128:
            r1 = -1
            r4.A0E = r1
            r4.A0C = r1
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.A02 = r0
            r4.A0D = r1
            r4.A0O()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1673180p.BF2(int, java.lang.Object):void");
    }

    public final boolean BFS() {
        return AnonymousClass000.A1T((this.A02 > Long.MIN_VALUE ? 1 : (this.A02 == Long.MIN_VALUE ? 0 : -1)));
    }

    public C1673180p(int i) {
        this.A0B = i;
        this.A0C = new C1463279v();
        this.A02 = Long.MIN_VALUE;
    }
}
