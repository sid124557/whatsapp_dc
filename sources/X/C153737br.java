package X;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.android.exoplayer2.Timeline;
import com.facebook.android.exoplayer2.util.Util;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.7br  reason: invalid class name and case insensitive filesystem */
public final class C153737br {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public AnonymousClass6JW A07;
    public C160477nh A08;
    public C158167jX A09;
    public C185778uE A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final Handler A0H;
    public final Handler A0I;
    public final Looper A0J;
    public final AnonymousClass81Q A0K;
    public final C151817Wk A0L;
    public final C1672580j A0M;
    public final AnonymousClass7FC A0N;
    public final AnonymousClass7NU A0O;
    public final C186588vc A0P;
    public final C157987jF A0Q;
    public final CopyOnWriteArraySet A0R;
    public final C187398x9[] A0S;

    public C153737br(C186328v7 r32, AnonymousClass7FC r33, C177658gE r34, C186588vc r35, C187398x9[] r36, int i, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        Looper mainLooper;
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1J(A0o, "Init ", this);
        A0o.append(" [");
        A0o.append("ExoPlayerLib/2.8.1");
        A0o.append("] [");
        Log.i("ExoPlayerImpl", AnonymousClass000.A0W(Util.A02, A0o));
        C157987jF r1 = new C157987jF();
        this.A0Q = r1;
        try {
            this.A0B = z14;
            C187398x9[] r12 = r36;
            int length = r12.length;
            C159197lM.A02(AnonymousClass001.A1W(length));
            this.A0S = r12;
            AnonymousClass7FC r8 = r33;
            r8.getClass();
            this.A0N = r8;
            this.A0F = false;
            this.A04 = 0;
            this.A0R = new CopyOnWriteArraySet();
            AnonymousClass7NU r9 = new AnonymousClass7NU(AnonymousClass80f.A01, (Object) null, new C157937jA[length], new C187428xC[length]);
            this.A0O = r9;
            this.A0M = new C1672580j();
            this.A0L = new C151817Wk();
            this.A09 = C158167jX.A05;
            this.A0J = Looper.myLooper();
            if (Looper.myLooper() != null) {
                mainLooper = Looper.myLooper();
            } else {
                mainLooper = Looper.getMainLooper();
            }
            C124636Dh r4 = new C124636Dh(mainLooper, this);
            this.A0H = r4;
            C186588vc r11 = r35;
            this.A0P = r11;
            this.A08 = new C160477nh(Timeline.A00, C166607yy.A03, r9, 0);
            boolean z15 = this.A0F;
            boolean z16 = z3;
            boolean z17 = z2;
            boolean z18 = z;
            long j2 = j;
            int i2 = i;
            boolean z19 = z11;
            boolean z20 = z10;
            boolean z21 = z9;
            boolean z22 = z8;
            C177658gE r10 = r34;
            boolean z23 = z7;
            C186328v7 r6 = r32;
            boolean z24 = z6;
            boolean z25 = z15;
            AnonymousClass81Q r3 = new AnonymousClass81Q(r4, this, r6, C159967mm.A01, r8, r9, r10, r11, r12, this.A04, i2, j2, z25, z18, z17, z16, z4, z5, z24, z23, z22, z21, z20, z19, z12, z13);
            this.A0K = r3;
            this.A0I = AnonymousClass6C9.A0R(r3.A0W);
            r1.A01();
        } catch (Throwable th) {
            this.A0Q.A01();
            throw th;
        }
    }

    public void A08(long j) {
        this.A0E = true;
        this.A02++;
        this.A05 = j;
        C150717Rx.A00(this.A0K.A0j, new AnonymousClass7F1(this.A08.A04, Util.A04(j)), 17);
        Iterator it = this.A0R.iterator();
        while (it.hasNext()) {
            ((C151937Ww) it.next()).A00(1);
        }
    }

    public void A0A(C185778uE r10, boolean z, boolean z2) {
        this.A07 = null;
        this.A0A = r10;
        C160477nh A032 = A03(2, z, z2);
        this.A0D = true;
        this.A02++;
        C160207nD r2 = this.A0K.A0j;
        C150717Rx A002 = C160207nD.A00();
        A002.A00 = r2.A00.obtainMessage(0, z ? 1 : 0, z2 ? 1 : 0, r10);
        A002.A01 = r2;
        A002.A01();
        A09(A032, 5, 1, false, false);
    }

    public void A0B(boolean z) {
        if (z) {
            this.A07 = null;
            this.A0A = null;
        }
        C160477nh A032 = A03(1, z, z);
        this.A02++;
        C160207nD r3 = this.A0K.A0j;
        C150717Rx A002 = C160207nD.A00();
        A002.A00 = r3.A00.obtainMessage(6, z ? 1 : 0, 0);
        A002.A01 = r3;
        A002.A01();
        A09(A032, 5, 1, false, false);
    }

    public long A01() {
        C160477nh r1 = this.A08;
        Timeline timeline = r1.A03;
        if (AnonymousClass000.A1T(timeline.A01())) {
            return -9223372036854775807L;
        }
        if (!A0C()) {
            AnonymousClass7Z2 r2 = r1.A04;
            if (r2.A00 != -1) {
                timeline.A08(this.A0L, r2.A02, false);
                return -9223372036854775807L;
            }
        }
        return Util.A05(timeline.A09(this.A0M, A00(), 0).A03);
    }

    public final C160477nh A03(int i, boolean z, boolean z2) {
        int i2;
        long A022;
        long A052;
        Timeline timeline;
        Object obj;
        C166607yy r3;
        AnonymousClass7NU r4;
        if (z) {
            this.A01 = 0;
            this.A00 = 0;
            A052 = 0;
            this.A06 = 0;
        } else {
            this.A01 = A00();
            boolean A0C2 = A0C();
            if (A0C2) {
                i2 = this.A00;
            } else {
                i2 = this.A08.A04.A02;
            }
            this.A00 = i2;
            if (A0C2) {
                A022 = this.A06;
            } else {
                A022 = A02(this.A08.A0D);
            }
            this.A06 = A022;
            if (A0C()) {
                A052 = this.A05;
            } else {
                A052 = Util.A05(this.A08.A0D);
            }
        }
        this.A05 = A052;
        if (z2) {
            timeline = Timeline.A00;
            obj = null;
        } else {
            C160477nh r0 = this.A08;
            timeline = r0.A03;
            obj = r0.A08;
        }
        C160477nh r02 = this.A08;
        AnonymousClass7Z2 r2 = r02.A04;
        long j = r02.A02;
        long j2 = r02.A01;
        if (z2) {
            r3 = C166607yy.A03;
            r4 = this.A0O;
        } else {
            r3 = r02.A05;
            r4 = r02.A06;
        }
        return new C160477nh(timeline, r2, r3, r4, C142576xQ.UNKNOWN, obj, i, j, j2, false, false);
    }

    public C153097af A04(C180168kb r8) {
        IllegalStateException A0O2;
        if (this.A0B) {
            C157987jF r2 = this.A0Q;
            synchronized (r2) {
                boolean z = false;
                while (!r2.A00) {
                    try {
                        r2.wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
                if (z) {
                    C18300x5.A11();
                }
            }
            Thread currentThread = Thread.currentThread();
            Looper looper = this.A0J;
            if (currentThread != looper.getThread()) {
                Object[] A0M2 = AnonymousClass002.A0M();
                A0M2[0] = currentThread.getName();
                A0M2[1] = looper.getThread().getName();
                String format = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", A0M2);
                if (this.A0C) {
                    A0O2 = null;
                } else {
                    A0O2 = AnonymousClass6CA.A0O();
                }
                Log.w("ExoPlayerImpl", format, A0O2);
                this.A0C = true;
            }
        }
        int A002 = A00();
        AnonymousClass81Q r22 = this.A0K;
        Timeline timeline = this.A08.A03;
        if (A002 == -1) {
            A002 = 0;
        }
        return new C153097af(r22.A0W.getLooper(), r22, r8, timeline, this.A0P, A002);
    }

    public void A06(int i) {
        if (this.A04 != i) {
            this.A04 = i;
            C160207nD r4 = this.A0K.A0j;
            C150717Rx A002 = C160207nD.A00();
            A002.A00 = r4.A00.obtainMessage(12, i, 0);
            A002.A01 = r4;
            A002.A01();
            Iterator it = this.A0R.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        if (r3.A04.A00 == -1) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(int r19, long r20) {
        /*
            r18 = this;
            r5 = r18
            X.7nh r3 = r5.A08
            com.facebook.android.exoplayer2.Timeline r10 = r3.A03
            r13 = r19
            r0 = r20
            if (r19 < 0) goto L_0x00b2
            int r2 = r10.A01()
            boolean r9 = X.AnonymousClass000.A1T(r2)
            if (r9 != 0) goto L_0x001c
            int r2 = r10.A01()
            if (r13 >= r2) goto L_0x00b2
        L_0x001c:
            r4 = 1
            r5.A0E = r4
            int r2 = r5.A02
            int r2 = r2 + 1
            r5.A02 = r2
            boolean r2 = r5.A0C()
            if (r2 != 0) goto L_0x0033
            X.7Z2 r2 = r3.A04
            int r6 = r2.A00
            r3 = -1
            r2 = 1
            if (r6 != r3) goto L_0x0034
        L_0x0033:
            r2 = 0
        L_0x0034:
            r8 = 0
            if (r2 == 0) goto L_0x004b
            java.lang.String r1 = "ExoPlayerImpl"
            java.lang.String r0 = "seekTo ignored because an ad is playing"
            android.util.Log.w(r1, r0)
            android.os.Handler r2 = r5.A0H
            r1 = -1
            X.7nh r0 = r5.A08
            android.os.Message r0 = r2.obtainMessage(r8, r4, r1, r0)
            r0.sendToTarget()
        L_0x004a:
            return
        L_0x004b:
            r5.A01 = r13
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r20 > r6 ? 1 : (r20 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x0087
            if (r2 != 0) goto L_0x0085
            r2 = 0
        L_0x005a:
            r5.A06 = r2
            r5.A00 = r8
        L_0x005e:
            X.81Q r2 = r5.A0K
            long r0 = com.facebook.android.exoplayer2.util.Util.A04(r0)
            X.7nD r3 = r2.A0j
            X.7Iq r2 = new X.7Iq
            r2.<init>(r10, r13, r0)
            r0 = 3
            X.C150717Rx.A00(r3, r2, r0)
            java.util.concurrent.CopyOnWriteArraySet r0 = r5.A0R
            java.util.Iterator r1 = r0.iterator()
        L_0x0075:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004a
            java.lang.Object r0 = r1.next()
            X.7Ww r0 = (X.C151937Ww) r0
            r0.A00(r4)
            goto L_0x0075
        L_0x0085:
            r2 = r0
            goto L_0x005a
        L_0x0087:
            if (r2 != 0) goto L_0x00ad
            X.80j r6 = r5.A0M
            r2 = 0
            X.80j r2 = r10.A09(r6, r13, r2)
            long r14 = r2.A02
        L_0x0093:
            X.80j r12 = r5.A0M
            X.7Wk r11 = r5.A0L
            r16 = 0
            android.util.Pair r6 = r10.A07(r11, r12, r13, r14, r16)
            r6.getClass()
            long r2 = com.facebook.android.exoplayer2.util.Util.A05(r14)
            r5.A06 = r2
            int r2 = X.C18280x3.A03(r6)
            r5.A00 = r2
            goto L_0x005e
        L_0x00ad:
            long r14 = com.facebook.android.exoplayer2.util.Util.A04(r0)
            goto L_0x0093
        L_0x00b2:
            X.6zu r2 = new X.6zu
            r2.<init>(r10, r13, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153737br.A07(int, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008c, code lost:
        if ("waslive_quickdashv2".equals(((X.C152767a5) r9).A08) == false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r4.A08 != r3.A08) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00da, code lost:
        r2 = (X.C150777Se) r1.get(0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(X.C160477nh r30, int r31, int r32, boolean r33, boolean r34) {
        /*
            r29 = this;
            r5 = r29
            X.7nh r4 = r5.A08
            com.facebook.android.exoplayer2.Timeline r1 = r4.A03
            r3 = r30
            com.facebook.android.exoplayer2.Timeline r0 = r3.A03
            r21 = 0
            if (r1 != r0) goto L_0x0015
            java.lang.Object r1 = r4.A08
            java.lang.Object r0 = r3.A08
            r2 = 0
            if (r1 == r0) goto L_0x0016
        L_0x0015:
            r2 = 1
        L_0x0016:
            int r1 = r4.A00
            int r0 = r3.A00
            boolean r20 = X.AnonymousClass001.A1X(r1, r0)
            boolean r1 = r4.A0A
            boolean r0 = r3.A0A
            boolean r19 = X.AnonymousClass001.A1X(r1, r0)
            X.7NU r1 = r4.A06
            X.7NU r0 = r3.A06
            if (r1 == r0) goto L_0x002e
            r21 = 1
        L_0x002e:
            r5.A08 = r3
            r22 = r32
            if (r2 != 0) goto L_0x0036
            if (r32 != 0) goto L_0x022f
        L_0x0036:
            java.util.concurrent.CopyOnWriteArraySet r0 = r5.A0R
            java.util.Iterator r18 = r0.iterator()
        L_0x003c:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x022f
            java.lang.Object r7 = r18.next()
            X.7Ww r7 = (X.C151937Ww) r7
            X.7nh r0 = r5.A08
            com.facebook.android.exoplayer2.Timeline r3 = r0.A03
            java.lang.Object r9 = r0.A08
            X.7qS r4 = r7.A05
            boolean r0 = r9 instanceof X.C152767a5
            if (r0 == 0) goto L_0x003c
            int r0 = r3.A01()
            boolean r0 = X.AnonymousClass000.A1T(r0)
            if (r0 != 0) goto L_0x003c
            java.util.List r0 = r4.A0U
            java.util.Iterator r2 = r0.iterator()
        L_0x0064:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0076
            java.lang.Object r1 = r2.next()
            X.8ub r1 = (X.C186008ub) r1
            r0 = r22
            r1.Be4(r3, r9, r0)
            goto L_0x0064
        L_0x0076:
            X.8LG r0 = r4.A0R
            r23 = r0
            boolean r0 = r0.enableQuickDashPlayback
            r8 = 1
            r6 = 0
            if (r0 == 0) goto L_0x008e
            r0 = r9
            X.7a5 r0 = (X.C152767a5) r0
            java.lang.String r1 = r0.A08
            java.lang.String r0 = "waslive_quickdashv2"
            boolean r0 = r0.equals(r1)
            r1 = 1
            if (r0 != 0) goto L_0x008f
        L_0x008e:
            r1 = 0
        L_0x008f:
            X.7a6 r0 = r4.A0B
            if (r0 == 0) goto L_0x003c
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x009c
            if (r1 != 0) goto L_0x009c
            goto L_0x003c
        L_0x009c:
            X.80j r2 = r7.A04
            r0 = 0
            r3.A09(r2, r6, r0)
            r10 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2.A03
            long r0 = r0 + r2
            long r0 = r0 / r10
            long r2 = r7.A01
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 == 0) goto L_0x013d
            r7.A01 = r0
            X.7Aw r2 = r4.A0O
            X.7t5 r4 = r2.A00
            android.os.Handler r11 = r4.A0l
            r2 = 2
            long[] r2 = new long[r2]
            r2[r6] = r0
            r0 = 0
            r2[r8] = r0
            r0 = 15
            X.C162987t5.A01(r11, r4, r2, r0)
            r7.A00 = r6
        L_0x00c7:
            X.7a5 r9 = (X.C152767a5) r9
            r7.A02 = r9
            if (r9 == 0) goto L_0x003c
            boolean r0 = r9.A0C
            r12 = 0
            if (r0 == 0) goto L_0x015f
            java.util.List r1 = r9.A0A
            int r0 = r1.size()
            if (r0 < r8) goto L_0x015f
            java.lang.Object r2 = r1.get(r6)
            X.7Se r2 = (X.C150777Se) r2
            r0 = 2
            int r1 = r2.A01(r0)
            r0 = -1
            if (r1 == r0) goto L_0x015f
            X.7PZ r0 = X.C150777Se.A00(r2, r1)
            java.util.List r1 = r0.A05
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x015f
            java.lang.Object r1 = r1.get(r6)
            X.7aP r1 = (X.C152937aP) r1
            long r13 = r9.A04
            boolean r0 = r1 instanceof X.AnonymousClass6K7
            if (r0 != 0) goto L_0x015f
            X.6K8 r1 = (X.AnonymousClass6K8) r1
            X.6KB r0 = r1.A00
            java.util.ArrayList r12 = X.AnonymousClass001.A0s()
            java.util.List r0 = r0.A04
            java.util.Iterator r17 = r0.iterator()
            r15 = r13
        L_0x010f:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0158
            java.lang.Object r9 = r17.next()
            X.7U0 r9 = (X.AnonymousClass7U0) r9
            long r2 = r9.A04
            int r0 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0134
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0134
            java.lang.Long r1 = java.lang.Long.valueOf(r15)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r1, r0)
            r12.add(r0)
        L_0x0134:
            long r0 = r9.A03
            int r9 = r9.A02
            long r9 = (long) r9
            long r0 = r0 * r9
            long r15 = r2 + r0
            goto L_0x010f
        L_0x013d:
            int r2 = r7.A00
            int r3 = r2 + 1
            r7.A00 = r3
            X.7Aw r2 = r4.A0O
            X.7t5 r4 = r2.A00
            android.os.Handler r11 = r4.A0l
            r2 = 2
            long[] r2 = new long[r2]
            r2[r6] = r0
            long r0 = (long) r3
            r2[r8] = r0
            r0 = 15
            X.C162987t5.A01(r11, r4, r2, r0)
            goto L_0x00c7
        L_0x0158:
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x015f
            r12 = 0
        L_0x015f:
            java.util.List r0 = r7.A03
            if (r0 != 0) goto L_0x01ea
            if (r12 != 0) goto L_0x01f6
        L_0x0165:
            r7.A03 = r12
            X.7a5 r0 = r7.A02
            long[] r2 = X.C153957cL.A03(r0)
            X.7a5 r0 = r7.A02
            java.lang.String r1 = X.C161787qS.A00(r0)
            java.util.LinkedList r17 = X.AnonymousClass0x9.A18()
            if (r1 == 0) goto L_0x0186
            java.lang.String r0 = "default"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0186
            r0 = r17
            r0.add(r1)
        L_0x0186:
            X.7a5 r9 = r7.A02
            long r0 = r9.A02
            r27 = r0
            long r14 = r9.A04
            long r0 = r9.A00
            r25 = r0
            long r12 = r9.A03
            boolean r0 = r9.A0G
            r24 = r0
            r6 = r2[r6]
            r2 = r2[r8]
            boolean r0 = r9.A0B
            r23 = r0
            java.lang.String r0 = r9.A09
            r16 = r0
            r0 = 11
            java.lang.Object[] r9 = new java.lang.Object[r0]
            r10 = 0
            r0 = r27
            X.AnonymousClass000.A1Q(r9, r10, r0)
            X.AnonymousClass000.A1Q(r9, r8, r14)
            r8 = 2
            r0 = r25
            X.AnonymousClass000.A1Q(r9, r8, r0)
            r0 = 3
            X.AnonymousClass000.A1Q(r9, r0, r12)
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = 4
            r9[r0] = r1
            r1 = 5
            r0 = r24
            X.AnonymousClass6C7.A1V(r9, r1, r0)
            r0 = 6
            X.AnonymousClass000.A1Q(r9, r0, r6)
            r0 = 7
            X.AnonymousClass000.A1Q(r9, r0, r2)
            r1 = 8
            r0 = r23
            X.AnonymousClass6C7.A1V(r9, r1, r0)
            r0 = 9
            r9[r0] = r17
            r0 = 10
            r9[r0] = r16
            r0 = 17
            X.C162987t5.A01(r11, r4, r9, r0)
            goto L_0x003c
        L_0x01ea:
            if (r12 == 0) goto L_0x0165
            int r1 = r0.size()
            int r0 = r12.size()
            if (r1 == r0) goto L_0x0165
        L_0x01f6:
            int r1 = r12.size()
            r0 = r23
            int r0 = r0.maxNumGapsToNotify
            if (r1 <= r0) goto L_0x0228
            int r2 = r12.size()
            X.7a6 r0 = r4.A10
            if (r0 != 0) goto L_0x0221
            r0 = 0
        L_0x0209:
            java.lang.Object[] r1 = X.C18310x6.A1b(r0, r6)
            X.AnonymousClass000.A1P(r1, r2, r8)
            java.lang.String r0 = "Too many gaps received for videoId %s. NumGaps: %d"
            java.lang.String r3 = java.lang.String.format(r0, r1)
            X.85L r2 = r4.A0o
            java.lang.String r1 = "MANIFEST"
            java.lang.String r0 = "MANIFEST_GAPS_RECEIVED_MORE_THAN_EXPECTED"
            r2.Bfh(r1, r0, r3)
            goto L_0x0165
        L_0x0221:
            X.7a6 r0 = r4.A10
            X.7yv r0 = r0.A0F
            java.lang.String r0 = r0.A0H
            goto L_0x0209
        L_0x0228:
            r0 = 21
            X.C162987t5.A01(r11, r4, r12, r0)
            goto L_0x0165
        L_0x022f:
            if (r33 == 0) goto L_0x0249
            java.util.concurrent.CopyOnWriteArraySet r0 = r5.A0R
            java.util.Iterator r1 = r0.iterator()
        L_0x0237:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0249
            java.lang.Object r0 = r1.next()
            X.7Ww r0 = (X.C151937Ww) r0
            r2 = r31
            r0.A00(r2)
            goto L_0x0237
        L_0x0249:
            if (r21 == 0) goto L_0x02d8
            X.7FC r1 = r5.A0N
            X.7nh r0 = r5.A08
            X.7NU r0 = r0.A06
            java.lang.Object r0 = r0.A02
            X.6KH r1 = (X.AnonymousClass6KH) r1
            X.7U9 r0 = (X.AnonymousClass7U9) r0
            r1.A00 = r0
            java.util.concurrent.CopyOnWriteArraySet r0 = r5.A0R
            java.util.Iterator r10 = r0.iterator()
        L_0x025f:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x02d8
            java.lang.Object r1 = r10.next()
            X.7Ww r1 = (X.C151937Ww) r1
            X.7nh r0 = r5.A08
            X.7yy r4 = r0.A05
            X.7NU r0 = r0.A06
            X.8xC[] r0 = r0.A04
            X.7VV r3 = new X.7VV
            r3.<init>(r0)
            X.7qS r7 = r1.A05
            X.6KH r0 = r7.A06
            if (r0 == 0) goto L_0x02c2
            X.7U9 r9 = r0.A00
            if (r9 == 0) goto L_0x02c2
            r0 = 2
            int r0 = r9.A00(r0)
            java.lang.String r6 = ""
            r8 = 1
            if (r0 != r8) goto L_0x02a4
            java.util.List r0 = r7.A0U
            java.util.Iterator r2 = r0.iterator()
        L_0x0292:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02a4
            java.lang.Object r1 = r2.next()
            X.8ub r1 = (X.C186008ub) r1
            X.6xt r0 = X.C142846xt.A04
            r1.Bfi(r0, r6)
            goto L_0x0292
        L_0x02a4:
            int r0 = r9.A00(r8)
            if (r0 != r8) goto L_0x02c2
            java.util.List r0 = r7.A0U
            java.util.Iterator r2 = r0.iterator()
        L_0x02b0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02c2
            java.lang.Object r1 = r2.next()
            X.8ub r1 = (X.C186008ub) r1
            X.6xt r0 = X.C142846xt.A03
            r1.Bfi(r0, r6)
            goto L_0x02b0
        L_0x02c2:
            java.util.List r0 = r7.A0U
            java.util.Iterator r1 = r0.iterator()
        L_0x02c8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x025f
            java.lang.Object r0 = r1.next()
            X.8ub r0 = (X.C186008ub) r0
            r0.BeR(r4, r3)
            goto L_0x02c8
        L_0x02d8:
            if (r19 == 0) goto L_0x02ea
            java.util.concurrent.CopyOnWriteArraySet r0 = r5.A0R
            java.util.Iterator r1 = r0.iterator()
        L_0x02e0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02ea
            r1.next()
            goto L_0x02e0
        L_0x02ea:
            if (r20 == 0) goto L_0x0308
            java.util.concurrent.CopyOnWriteArraySet r0 = r5.A0R
            java.util.Iterator r3 = r0.iterator()
        L_0x02f2:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0308
            java.lang.Object r2 = r3.next()
            X.7Ww r2 = (X.C151937Ww) r2
            boolean r1 = r5.A0G
            X.7nh r0 = r5.A08
            int r0 = r0.A00
            r2.A01(r1, r0)
            goto L_0x02f2
        L_0x0308:
            if (r34 == 0) goto L_0x031a
            java.util.concurrent.CopyOnWriteArraySet r0 = r5.A0R
            java.util.Iterator r1 = r0.iterator()
        L_0x0310:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x031a
            r1.next()
            goto L_0x0310
        L_0x031a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153737br.A09(X.7nh, int, int, boolean, boolean):void");
    }

    public final boolean A0C() {
        if (AnonymousClass000.A1T(this.A08.A03.A01()) || this.A02 > 0) {
            return true;
        }
        return false;
    }

    public int A00() {
        if (A0C()) {
            return this.A01;
        }
        C160477nh r0 = this.A08;
        return r0.A03.A08(this.A0L, r0.A04.A02, false).A00;
    }

    public final long A02(long j) {
        long A052 = Util.A05(j);
        C160477nh r3 = this.A08;
        AnonymousClass7Z2 r2 = r3.A04;
        if (r2.A00 != -1) {
            return A052;
        }
        Timeline timeline = r3.A03;
        int i = r2.A02;
        C151817Wk r1 = this.A0L;
        timeline.A08(r1, i, false);
        return A052 + Util.A05(r1.A02);
    }

    public void A05() {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1J(A0o, "Release ", this);
        A0o.append(" [");
        A0o.append("ExoPlayerLib/2.8.1");
        A0o.append("] [");
        A0o.append(Util.A02);
        A0o.append("] [");
        synchronized (C159847mZ.class) {
            str = C159847mZ.A00;
        }
        Log.i("ExoPlayerImpl", AnonymousClass000.A0W(str, A0o));
        this.A0A = null;
        AnonymousClass81Q r2 = this.A0K;
        synchronized (r2) {
            if (!r2.A0O) {
                r2.A0j.A00.sendEmptyMessage(7);
                boolean z = false;
                while (!r2.A0O) {
                    try {
                        r2.wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
                if (z) {
                    C18300x5.A11();
                }
            }
        }
        this.A0H.removeCallbacksAndMessages((Object) null);
        this.A08 = A03(1, false, false);
    }
}
