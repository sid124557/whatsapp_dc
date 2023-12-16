package X;

import android.os.SystemClock;
import com.facebook.android.exoplayer2.util.Util;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.80m  reason: invalid class name and case insensitive filesystem */
public class C1672880m implements C186328v7 {
    public int A00;
    public int A01;
    public int A02;
    public long A03 = -9223372036854775807L;
    public long A04;
    public long A05;
    public long A06 = -9223372036854775807L;
    public long A07 = -1;
    public long A08 = -1;
    public long A09 = -9223372036854775807L;
    public C151117Tm A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final int A0F;
    public final AnonymousClass7ZV A0G;
    public final AnonymousClass71C A0H;
    public final C157717il A0I;
    public final C146537Aq A0J;
    public final C161397pY A0K;
    public final AtomicBoolean A0L;
    public final AtomicBoolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public volatile long A0T = -9223372036854775807L;
    public volatile long A0U = -9223372036854775807L;

    public final void A02(boolean z) {
        this.A01 = 0;
        this.A0B = false;
        if (z) {
            AnonymousClass7ZV r1 = this.A0G;
            synchronized (r1) {
                r1.A02(0);
            }
        }
        this.A0T = -9223372036854775807L;
        this.A06 = -9223372036854775807L;
        A01();
    }

    public void BYk() {
        A02(false);
    }

    public void BZm() {
        A02(true);
    }

    public void Bcs() {
        A02(true);
    }

    public final long A00() {
        C161397pY r2;
        long j = this.A0T;
        long j2 = this.A0U;
        if (j == -9223372036854775807L) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = this.A06;
            if (j3 == -9223372036854775807L) {
                this.A06 = elapsedRealtime;
            } else if (elapsedRealtime - j3 > j2) {
                this.A0T = -9223372036854775807L;
                this.A06 = -9223372036854775807L;
            }
        }
        long j4 = this.A0T;
        if (j4 != -9223372036854775807L) {
            return Util.A04(j4);
        }
        if (!this.A0D || (r2 = this.A0K) == null) {
            return this.A04;
        }
        int i = 3;
        if (this.A0C) {
            i = 7;
        }
        return (long) (r2.A01(i) * 1000);
    }

    public final void A01() {
        this.A08 = -1;
        this.A07 = -1;
        this.A09 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
    }

    public AnonymousClass7ZV B4U() {
        return this.A0G;
    }

    public long B4a() {
        return 0;
    }

    public void BeT(C166607yy r6, C187398x9[] r7, C187428xC[] r8) {
        int i;
        int i2 = this.A0F;
        if (i2 == -1) {
            i2 = 0;
            for (int i3 = 0; i3 < r7.length; i3++) {
                if (r8[i3] != null) {
                    int i4 = r7[i3].A0B;
                    if (!this.A0E) {
                        i = 3538944;
                        if (i4 != 1) {
                            i = 13107200;
                        }
                    } else if (i4 != 1) {
                        i = this.A02;
                    } else {
                        i = this.A00;
                    }
                    i2 += i;
                }
            }
        }
        this.A01 = i2;
        this.A0G.A02(i2);
    }

    public boolean BkE() {
        return false;
    }

    public void Bmr(long j, long j2) {
        this.A07 = j;
        this.A08 = j2;
        if (j == -1 || j2 == -1) {
            A01();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0163, code lost:
        if ((com.facebook.android.exoplayer2.util.Util.A05(r26) - r7) < r3) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x017d, code lost:
        if ((r3 - r1) < r7) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0092, code lost:
        if (r2 > 0) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Bo6(float r25, long r26, long r28, boolean r30) {
        /*
            r24 = this;
            java.lang.String r0 = "shouldContinueLoading"
            X.C153827c5.A01(r0)     // Catch:{ all -> 0x0189 }
            r1 = 1
            r6 = r24
            java.util.concurrent.atomic.AtomicBoolean r8 = r6.A0M     // Catch:{ all -> 0x0189 }
            if (r8 == 0) goto L_0x0013
            boolean r0 = r8.get()     // Catch:{ all -> 0x0189 }
            if (r0 == 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            r5 = 0
            if (r1 != 0) goto L_0x002d
            long r1 = r6.A07     // Catch:{ all -> 0x0189 }
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0026
            long r1 = r6.A08     // Catch:{ all -> 0x0189 }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0026
            goto L_0x002d
        L_0x0026:
            boolean r0 = r6.A0R     // Catch:{ all -> 0x0189 }
            if (r0 == 0) goto L_0x002d
            if (r30 != 0) goto L_0x002d
            r5 = 1
        L_0x002d:
            r7 = 0
            if (r5 == 0) goto L_0x0047
            boolean r0 = r6.A0Q     // Catch:{ all -> 0x0189 }
            if (r0 == 0) goto L_0x0043
            X.6xI r9 = X.C142496xI.PAUSED     // Catch:{ all -> 0x0189 }
            r10 = -1
            X.7Tm r8 = new X.7Tm     // Catch:{ all -> 0x0189 }
            r14 = r10
            r16 = r10
            r12 = r10
            r8.<init>(r9, r10, r12, r14, r16)     // Catch:{ all -> 0x0189 }
            r6.A0A = r8     // Catch:{ all -> 0x0189 }
        L_0x0043:
            X.C153827c5.A00()
            return r7
        L_0x0047:
            X.7ZV r11 = r6.A0G     // Catch:{ all -> 0x0189 }
            int r1 = r11.A00()     // Catch:{ all -> 0x0189 }
            int r0 = r6.A01     // Catch:{ all -> 0x0189 }
            boolean r14 = X.C18280x3.A1U(r1, r0)
            X.7il r9 = r6.A0I     // Catch:{ all -> 0x0189 }
            r12 = 0
            java.util.concurrent.atomic.AtomicBoolean r3 = r9.A08     // Catch:{ all -> 0x0189 }
            boolean r0 = r3.get()     // Catch:{ all -> 0x0189 }
            r4 = r28
            if (r0 == 0) goto L_0x0098
            long r0 = r9.A02     // Catch:{ all -> 0x0189 }
        L_0x0063:
            boolean r2 = r3.get()     // Catch:{ all -> 0x0189 }
            if (r2 == 0) goto L_0x0074
            long r2 = r9.A02     // Catch:{ all -> 0x0189 }
        L_0x006b:
            boolean r4 = r6.A0O     // Catch:{ all -> 0x0189 }
            if (r4 == 0) goto L_0x00ca
            boolean r4 = r6.A0N     // Catch:{ all -> 0x0189 }
            if (r4 == 0) goto L_0x00b5
            goto L_0x00ac
        L_0x0074:
            if (r30 != 0) goto L_0x007d
            long r2 = r9.A03     // Catch:{ all -> 0x0189 }
            int r10 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x007d
            goto L_0x006b
        L_0x007d:
            X.8L5 r2 = r9.A06     // Catch:{ all -> 0x0189 }
            if (r2 == 0) goto L_0x0095
            int r10 = r2.cellHighWaterMarkDeltaMs     // Catch:{ all -> 0x0189 }
            long r2 = r9.A00(r4)     // Catch:{ all -> 0x0189 }
            int r4 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r4 == 0) goto L_0x0095
            long r4 = X.C18290x4.A0A(r10)
            long r2 = r2 + r4
            int r4 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r4 <= 0) goto L_0x0095
            goto L_0x006b
        L_0x0095:
            long r2 = r9.A00     // Catch:{ all -> 0x0189 }
            goto L_0x006b
        L_0x0098:
            if (r30 != 0) goto L_0x00a1
            long r0 = r9.A03     // Catch:{ all -> 0x0189 }
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x00a1
            goto L_0x0063
        L_0x00a1:
            long r0 = r9.A00(r4)     // Catch:{ all -> 0x0189 }
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 > 0) goto L_0x0063
            long r0 = r9.A01     // Catch:{ all -> 0x0189 }
            goto L_0x0063
        L_0x00ac:
            if (r8 == 0) goto L_0x00b5
            boolean r4 = r8.get()     // Catch:{ all -> 0x0189 }
            if (r4 == 0) goto L_0x00b5
            goto L_0x00ca
        L_0x00b5:
            long r9 = r2 - r0
            long r4 = r6.A00()     // Catch:{ all -> 0x0189 }
            long r0 = java.lang.Math.max(r4, r0)     // Catch:{ all -> 0x0189 }
            boolean r4 = r6.A0S     // Catch:{ all -> 0x0189 }
            if (r4 == 0) goto L_0x00c8
            long r2 = java.lang.Math.max(r0, r2)     // Catch:{ all -> 0x0189 }
            goto L_0x00ca
        L_0x00c8:
            long r2 = r0 + r9
        L_0x00ca:
            r4 = 1065353216(0x3f800000, float:1.0)
            r9 = r25
            int r4 = (r25 > r4 ? 1 : (r25 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x00e3
            r4 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r25 > r4 ? 1 : (r25 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x00df
            double r4 = (double) r0     // Catch:{ all -> 0x0189 }
            double r0 = (double) r9     // Catch:{ all -> 0x0189 }
            double r4 = r4 * r0
            long r0 = java.lang.Math.round(r4)     // Catch:{ all -> 0x0189 }
        L_0x00df:
            long r0 = java.lang.Math.min(r0, r2)     // Catch:{ all -> 0x0189 }
        L_0x00e3:
            X.6xI r15 = X.C142496xI.UNKNOWN     // Catch:{ all -> 0x0189 }
            int r4 = (r26 > r0 ? 1 : (r26 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x00f5
            boolean r4 = r6.A0P     // Catch:{ all -> 0x0189 }
            if (r4 != 0) goto L_0x00ef
            if (r14 != 0) goto L_0x00f0
        L_0x00ef:
            r7 = 1
        L_0x00f0:
            r6.A0B = r7     // Catch:{ all -> 0x0189 }
            if (r7 != 0) goto L_0x0109
            goto L_0x0107
        L_0x00f5:
            int r4 = (r26 > r2 ? 1 : (r26 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0102
            if (r14 != 0) goto L_0x0102
            boolean r7 = r6.A0B     // Catch:{ all -> 0x0189 }
            if (r7 != 0) goto L_0x0109
            X.6xI r15 = X.C142496xI.BUFFER_DRAINING_ABOVE_LOW_WATERMARK     // Catch:{ all -> 0x0189 }
            goto L_0x0109
        L_0x0102:
            X.6xI r15 = X.C142496xI.ABOVE_HIGH_WATERMARK     // Catch:{ all -> 0x0189 }
            r6.A0B = r7     // Catch:{ all -> 0x0189 }
            goto L_0x0109
        L_0x0107:
            X.6xI r15 = X.C142496xI.TARGET_BUFFER_SIZE_REACHED     // Catch:{ all -> 0x0189 }
        L_0x0109:
            boolean r4 = r6.A0Q     // Catch:{ all -> 0x0189 }
            if (r4 == 0) goto L_0x0126
            if (r7 != 0) goto L_0x0126
            int r4 = r6.A01     // Catch:{ all -> 0x0189 }
            long r9 = (long) r4     // Catch:{ all -> 0x0189 }
            int r4 = r11.A00()     // Catch:{ all -> 0x0189 }
            long r4 = (long) r4     // Catch:{ all -> 0x0189 }
            X.7Tm r14 = new X.7Tm     // Catch:{ all -> 0x0189 }
            r16 = r9
            r18 = r4
            r20 = r0
            r22 = r2
            r14.<init>(r15, r16, r18, r20, r22)     // Catch:{ all -> 0x0189 }
            r6.A0A = r14     // Catch:{ all -> 0x0189 }
        L_0x0126:
            long r1 = r6.A07     // Catch:{ all -> 0x0189 }
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x013e
            long r1 = r6.A08     // Catch:{ all -> 0x0189 }
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x013e
            boolean r0 = r6.A0B     // Catch:{ all -> 0x0189 }
            if (r0 == 0) goto L_0x013e
            if (r8 == 0) goto L_0x0141
            boolean r0 = r8.get()     // Catch:{ all -> 0x0189 }
            if (r0 == 0) goto L_0x0141
        L_0x013e:
            boolean r9 = r6.A0B     // Catch:{ all -> 0x0189 }
            goto L_0x0185
        L_0x0141:
            if (r30 != 0) goto L_0x013e
            long r3 = r6.A07     // Catch:{ all -> 0x0189 }
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 0
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0165
            long r7 = r6.A03     // Catch:{ all -> 0x0189 }
            int r0 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x015b
            long r7 = com.facebook.android.exoplayer2.util.Util.A05(r26)     // Catch:{ all -> 0x0189 }
            r6.A03 = r7     // Catch:{ all -> 0x0189 }
        L_0x015b:
            long r1 = com.facebook.android.exoplayer2.util.Util.A05(r26)     // Catch:{ all -> 0x0189 }
            long r1 = r1 - r7
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r5 = 0
            if (r0 >= 0) goto L_0x0166
        L_0x0165:
            r5 = 1
        L_0x0166:
            long r7 = r6.A08     // Catch:{ all -> 0x0189 }
            int r0 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x017f
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0189 }
            long r1 = r6.A09     // Catch:{ all -> 0x0189 }
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0179
            r6.A09 = r3     // Catch:{ all -> 0x0189 }
            r1 = r3
        L_0x0179:
            long r3 = r3 - r1
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            r0 = 0
            if (r1 >= 0) goto L_0x0180
        L_0x017f:
            r0 = 1
        L_0x0180:
            if (r5 == 0) goto L_0x0185
            if (r0 == 0) goto L_0x0185
            r9 = 1
        L_0x0185:
            X.C153827c5.A00()
            return r9
        L_0x0189:
            r0 = move-exception
            X.C153827c5.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1672880m.Bo6(float, long, long, boolean):boolean");
    }

    public boolean BoZ(float f, long j, boolean z, boolean z2) {
        long j2;
        long j3;
        C161397pY r2;
        if (f != 1.0f) {
            j = Math.round(((double) j) / ((double) f));
        }
        if (!z) {
            if (!this.A0D || (r2 = this.A0K) == null) {
                j2 = this.A05;
            } else {
                int i = 2;
                if (this.A0C) {
                    i = 6;
                }
                j2 = (long) (r2.A01(i) * 1000);
            }
            j3 = (long) (((float) j2) * 1.0f);
        } else if (z2) {
            j3 = (long) (this.A0K.A01(9) * 1000);
        } else {
            j3 = A00();
        }
        if (j3 > 0 && j < j3 && (this.A0P || this.A0G.A00() < this.A01)) {
            return false;
        }
        this.A0T = -9223372036854775807L;
        this.A06 = -9223372036854775807L;
        A01();
        return true;
    }

    public C1672880m(AnonymousClass7ZV r6, AnonymousClass71C r7, C157717il r8, C146537Aq r9, C161397pY r10, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        boolean A1U = C18280x3.A1U(i, 0);
        String A0V = AnonymousClass000.A0V(" cannot be less than ", "0", AnonymousClass000.A0l("mBufferForPlaybackMs"));
        if (A1U) {
            boolean A1U2 = C18280x3.A1U(i2, 0);
            String A0V2 = AnonymousClass000.A0V(" cannot be less than ", "0", AnonymousClass000.A0l("mBufferForPlaybackAfterRebufferMs"));
            if (A1U2) {
                this.A0G = r6;
                this.A05 = ((long) i) * 1000;
                this.A04 = ((long) i2) * 1000;
                this.A0K = r10;
                this.A0F = i3;
                this.A02 = i4;
                this.A00 = i5;
                this.A0E = z;
                this.A0P = z2;
                this.A0R = z3;
                this.A0I = r8;
                this.A0H = r7;
                this.A0J = r9;
                this.A0M = atomicBoolean;
                this.A0L = atomicBoolean2;
                this.A0C = z4;
                this.A0D = z5;
                this.A0Q = z6;
                this.A0O = z7;
                this.A0S = z8;
                this.A0N = z9;
                return;
            }
            throw AnonymousClass6C7.A0U(A0V2);
        }
        throw AnonymousClass6C7.A0U(A0V);
    }
}
