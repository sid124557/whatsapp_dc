package X;

import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.Timeline;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.6OC  reason: invalid class name */
public final class AnonymousClass6OC extends C1685885z implements C187578xT {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public C160747oF A05;
    public C158027jJ A06;
    public C186108ul A07;
    public boolean A08;
    public final Looper A09;
    public final C177968gk A0A;
    public final C1689687l A0B;
    public final C153417bH A0C;
    public final C1685685x A0D;
    public final C178138h2 A0E;
    public final AnonymousClass7GA A0F;
    public final AnonymousClass7MD A0G;
    public final C178268hG A0H;
    public final C186668vk A0I;
    public final C178298hJ A0J;
    public final C152647Zr A0K;
    public final List A0L;
    public final boolean A0M = true;
    public final C187588xU[] A0N;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x00c5, code lost:
        if (r8.A06.A03.isEmpty() != false) goto L_0x00c7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6OC(android.os.Looper r25, X.C177978gl r26, X.C177988gm r27, X.C186498vS r28, X.C158027jJ r29, X.C1685685x r30, X.C178138h2 r31, X.AnonymousClass7GA r32, X.C178268hG r33, X.C186668vk r34, X.C187588xU[] r35) {
        /*
            r24 = this;
            r2 = 1
            r12 = 0
            r3 = r24
            r3.<init>()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Init "
            X.AnonymousClass000.A1J(r1, r0, r3)
            java.lang.String r0 = " ["
            r1.append(r0)
            java.lang.String r0 = "ExoPlayerLib/2.13.3"
            r1.append(r0)
            java.lang.String r0 = "] ["
            r1.append(r0)
            java.lang.String r0 = X.C162387ry.A03
            java.lang.String r1 = X.AnonymousClass000.A0W(r0, r1)
            java.lang.String r0 = "ExoPlayerImpl"
            android.util.Log.i(r0, r1)
            r4 = r35
            int r11 = r4.length
            boolean r0 = X.AnonymousClass001.A1W(r11)
            X.C161487pm.A04(r0)
            r3.A0N = r4
            r7 = r32
            r3.A0F = r7
            r0 = r31
            r3.A0E = r0
            r6 = r33
            r3.A0H = r6
            r8 = r30
            r3.A0D = r8
            r3.A0M = r2
            r9 = r29
            r3.A06 = r9
            r13 = r25
            r3.A09 = r13
            r5 = r34
            r3.A0I = r5
            r0 = 4
            X.73z r10 = new X.73z
            r10.<init>(r0)
            X.88p r1 = new X.88p
            r2 = r28
            r1.<init>(r2)
            java.util.concurrent.CopyOnWriteArraySet r19 = new java.util.concurrent.CopyOnWriteArraySet
            r19.<init>()
            X.7Zr r0 = new X.7Zr
            r14 = r0
            r15 = r13
            r16 = r5
            r17 = r1
            r18 = r10
            r14.<init>(r15, r16, r17, r18, r19)
            r3.A0K = r0
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r3.A0L = r0
            java.util.Random r10 = new java.util.Random
            r10.<init>()
            int[] r1 = new int[r12]
            X.889 r0 = new X.889
            r0.<init>(r10, r1)
            r3.A07 = r0
            X.7jC[] r1 = new X.C157957jC[r11]
            X.8xZ[] r0 = new X.C187638xZ[r11]
            r11 = 0
            X.7MD r10 = new X.7MD
            r10.<init>(r11, r1, r0)
            r3.A0G = r10
            X.7bH r0 = new X.7bH
            r0.<init>()
            r3.A0C = r0
            r0 = -1
            r3.A00 = r0
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r13, r11)
            X.88l r0 = new X.88l
            r0.<init>(r1)
            r3.A0J = r0
            X.85q r14 = new X.85q
            r14.<init>(r3)
            r3.A0A = r14
            X.7oF r0 = X.C160747oF.A00(r10)
            r3.A05 = r0
            X.8vS r0 = r8.A00
            if (r0 == 0) goto L_0x00c7
            X.7jZ r0 = r8.A06
            X.6aY r0 = r0.A03
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x00c8
        L_0x00c7:
            r0 = 1
        L_0x00c8:
            X.C161487pm.A04(r0)
            r8.A00 = r2
            X.7Zr r0 = r8.A01
            X.88q r12 = new X.88q
            r12.<init>(r2, r8)
            java.util.concurrent.CopyOnWriteArraySet r11 = r0.A07
            X.8vk r2 = r0.A01
            X.8mZ r1 = r0.A04
            X.7Zr r0 = new X.7Zr
            r15 = r0
            r16 = r13
            r17 = r2
            r18 = r12
            r19 = r1
            r20 = r11
            r15.<init>(r16, r17, r18, r19, r20)
            r8.A01 = r0
            r3.AwU(r8)
            android.os.Handler r2 = new android.os.Handler
            r2.<init>(r13)
            r0 = r6
            X.88U r0 = (X.AnonymousClass88U) r0
            X.7RK r0 = r0.A09
            r0.A00(r8)
            java.util.concurrent.CopyOnWriteArrayList r1 = r0.A00
            X.7Jj r0 = new X.7Jj
            r0.<init>(r2, r8)
            r1.add(r0)
            X.87l r12 = new X.87l
            r15 = r26
            r16 = r27
            r23 = r4
            r21 = r6
            r22 = r5
            r19 = r7
            r20 = r10
            r18 = r8
            r17 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r3.A0B = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6OC.<init>(android.os.Looper, X.8gl, X.8gm, X.8vS, X.7jJ, X.85x, X.8h2, X.7GA, X.8hG, X.8vk, X.8xU[]):void");
    }

    public final Pair A01(Timeline timeline, int i, long j) {
        Timeline timeline2 = timeline;
        int i2 = i;
        if (AnonymousClass000.A1T(timeline.A01())) {
            this.A00 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.A04 = j;
            return null;
        }
        if (i == -1 || i >= timeline.A01()) {
            i2 = timeline.A05(false);
            timeline.A0B(this.A00, i2, 0);
            j = 0;
        }
        return timeline2.A07(this.A0C, this.A00, i2, C161207pD.A00(j));
    }

    public void A03(int i, int i2, boolean z) {
        C160747oF r1 = this.A05;
        if (r1.A0D != z || r1.A01 != i) {
            this.A02++;
            C160747oF A022 = r1.A02(i, z);
            ((C1692188l) this.A0B.A0Y).A00.obtainMessage(1, z ? 1 : 0, i).sendToTarget();
            A05(A022, 4, 0, i2, false, false);
        }
    }

    public void Bl1(int i, long j) {
        C160747oF r1 = this.A05;
        Timeline timeline = r1.A05;
        if (i < 0 || (!AnonymousClass000.A1T(timeline.A01()) && i >= timeline.A01())) {
            throw new C144046zv(timeline, i, j);
        }
        int i2 = 1;
        this.A02++;
        if (BIQ()) {
            Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            AnonymousClass7X4 r4 = new AnonymousClass7X4(this.A05);
            r4.A00(1);
            AnonymousClass6OC r3 = ((C1684985q) this.A0A).A00;
            ((C1692188l) r3.A0J).A00.post(new AnonymousClass8MF(r3, 24, r4));
            return;
        }
        if (r1.A00 != 1) {
            i2 = 2;
        }
        C160747oF A022 = A02(A01(timeline, i, j), r1.A01(i2), timeline);
        C1689687l r2 = this.A0B;
        long A002 = C161207pD.A00(j);
        C18290x4.A1C(((C1692188l) r2.A0Y).A00, new AnonymousClass7JV(timeline, i, A002), 3);
        A05(A022, 1, 0, 1, true, true);
    }

    public void Bmw(boolean z) {
        A03(0, 1, z);
    }

    public final int A00() {
        C160747oF r1 = this.A05;
        Timeline timeline = r1.A05;
        if (AnonymousClass000.A1T(timeline.A01())) {
            return this.A00;
        }
        return C153417bH.A00(this.A0C, timeline, r1.A07.A04);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r24 != null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C160747oF A02(android.util.Pair r24, X.C160747oF r25, com.google.android.exoplayer2.Timeline r26) {
        /*
            r23 = this;
            r5 = r26
            int r0 = r5.A01()
            boolean r1 = X.AnonymousClass000.A1T(r0)
            r3 = r24
            if (r1 != 0) goto L_0x0011
            r0 = 0
            if (r24 == 0) goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            X.C161487pm.A03(r0)
            r0 = r25
            com.google.android.exoplayer2.Timeline r10 = r0.A05
            X.7oF r12 = r0.A05(r5)
            r2 = r23
            if (r1 == 0) goto L_0x0042
            X.6PS r13 = X.C160747oF.A0I
            long r0 = r2.A04
            long r17 = X.C161207pD.A00(r0)
            r21 = 0
            X.7yb r14 = X.C166387yb.A03
            X.7MD r15 = r2.A0G
            X.6aY r16 = X.C129586aY.of()
            r19 = r17
            X.7oF r0 = r12.A07(r13, r14, r15, r16, r17, r19, r21)
            X.7oF r2 = r0.A06(r13)
            long r0 = r2.A0G
            r2.A0F = r0
            return r2
        L_0x0042:
            X.6PS r6 = r12.A07
            java.lang.Object r9 = r6.A04
            java.lang.Object r0 = r3.first
            boolean r0 = r9.equals(r0)
            r11 = r0 ^ 1
            if (r11 == 0) goto L_0x00f3
            java.lang.Object r0 = r3.first
            X.6PS r13 = new X.6PS
            r13.<init>((java.lang.Object) r0)
        L_0x0057:
            long r0 = X.AnonymousClass6C8.A0R(r3)
            long r3 = r2.B5u()
            long r7 = X.C161207pD.A00(r3)
            int r3 = r10.A01()
            boolean r3 = X.AnonymousClass000.A1T(r3)
            if (r3 != 0) goto L_0x0076
            X.7bH r3 = r2.A0C
            X.7bH r3 = r10.A0A(r3, r9)
            long r3 = r3.A02
            long r7 = r7 - r3
        L_0x0076:
            if (r11 != 0) goto L_0x00d1
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x00d1
            if (r3 != 0) goto L_0x00f6
            X.6PS r0 = r12.A06
            java.lang.Object r0 = r0.A04
            int r1 = r5.A04(r0)
            r0 = -1
            if (r1 == r0) goto L_0x009a
            X.7bH r3 = r2.A0C
            r0 = 0
            X.7bH r0 = r5.A09(r3, r1, r0)
            int r1 = r0.A00
            java.lang.Object r0 = r13.A04
            int r0 = X.C153417bH.A00(r3, r5, r0)
            if (r1 == r0) goto L_0x00cd
        L_0x009a:
            java.lang.Object r0 = r13.A04
            X.7bH r2 = r2.A0C
            r5.A0A(r2, r0)
            int r1 = r13.A00
            r0 = -1
            boolean r0 = X.AnonymousClass001.A1X(r1, r0)
            if (r0 == 0) goto L_0x00ce
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00af:
            long r2 = r12.A0G
            long r6 = r12.A0G
            long r4 = r12.A0G
            long r21 = r0 - r4
            X.7yb r14 = r12.A08
            X.7MD r15 = r12.A09
            java.util.List r4 = r12.A0A
        L_0x00bd:
            r16 = r4
            r17 = r2
            r19 = r6
            X.7oF r2 = r12.A07(r13, r14, r15, r16, r17, r19, r21)
            X.7oF r12 = r2.A06(r13)
            r12.A0F = r0
        L_0x00cd:
            return r12
        L_0x00ce:
            long r0 = r2.A01
            goto L_0x00af
        L_0x00d1:
            int r4 = r13.A00
            r3 = -1
            boolean r3 = X.AnonymousClass001.A1X(r4, r3)
            r3 = r3 ^ 1
            X.C161487pm.A04(r3)
            if (r11 == 0) goto L_0x00ec
            X.7yb r14 = X.C166387yb.A03
            X.7MD r15 = r2.A0G
            X.6aY r4 = X.C129586aY.of()
        L_0x00e7:
            r21 = 0
            r6 = r0
            r2 = r0
            goto L_0x00bd
        L_0x00ec:
            X.7yb r14 = r12.A08
            X.7MD r15 = r12.A09
            java.util.List r4 = r12.A0A
            goto L_0x00e7
        L_0x00f3:
            r13 = r6
            goto L_0x0057
        L_0x00f6:
            int r3 = r13.A00
            r2 = -1
            boolean r2 = X.AnonymousClass001.A1X(r3, r2)
            r2 = r2 ^ 1
            X.C161487pm.A04(r2)
            long r4 = r12.A0H
            long r2 = r0 - r7
            long r16 = X.AnonymousClass6C8.A0Q(r4, r2)
            long r3 = r12.A0F
            X.6PS r2 = r12.A06
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x0116
            long r3 = r0 + r16
        L_0x0116:
            X.7yb r6 = r12.A08
            X.7MD r5 = r12.A09
            java.util.List r2 = r12.A0A
            r14 = r0
            r7 = r12
            r8 = r13
            r9 = r6
            r10 = r5
            r11 = r2
            r12 = r0
            X.7oF r12 = r7.A07(r8, r9, r10, r11, r12, r14, r16)
            r12.A0F = r3
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6OC.A02(android.util.Pair, X.7oF, com.google.android.exoplayer2.Timeline):X.7oF");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r10 > r1.size()) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.C143886zd r24, boolean r25) {
        /*
            r23 = this;
            r7 = r23
            if (r25 == 0) goto L_0x0037
            java.util.List r1 = r7.A0L
            int r10 = r1.size()
            r9 = 0
            r14 = 1
            if (r10 < r9) goto L_0x0015
            int r2 = r1.size()
            r0 = 1
            if (r10 <= r2) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            X.C161487pm.A03(r0)
            int r13 = r7.B6d()
            X.7oF r0 = r7.A05
            com.google.android.exoplayer2.Timeline r0 = r0.A05
            r22 = r0
            int r8 = r1.size()
            int r0 = r7.A02
            int r0 = r0 + 1
            r7.A02 = r0
            int r0 = r10 + -1
        L_0x002f:
            if (r0 < r9) goto L_0x0048
            r1.remove(r0)
            int r0 = r0 + -1
            goto L_0x002f
        L_0x0037:
            X.7oF r1 = r7.A05
            X.6PS r0 = r1.A07
            X.7oF r2 = r1.A06(r0)
            long r0 = r2.A0G
            r2.A0F = r0
            r0 = 0
            r2.A0H = r0
            goto L_0x00b1
        L_0x0048:
            X.8ul r0 = r7.A07
            X.8ul r0 = r0.Az1(r9, r10)
            r7.A07 = r0
            X.6OB r6 = new X.6OB
            r6.<init>(r0, r1)
            X.7oF r5 = r7.A05
            long r3 = r7.B5u()
            int r0 = r22.A01()
            boolean r2 = X.AnonymousClass000.A1T(r0)
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12 = -1
            if (r2 != 0) goto L_0x0126
            int r2 = r6.A01()
            boolean r2 = X.AnonymousClass000.A1T(r2)
            if (r2 == 0) goto L_0x00df
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x007a:
            android.util.Pair r15 = r7.A01(r6, r12, r3)
        L_0x007e:
            X.7oF r3 = r7.A02(r15, r5, r6)
            int r0 = r3.A00
            r1 = 4
            if (r0 == r14) goto L_0x0099
            if (r0 == r1) goto L_0x0099
            if (r9 >= r10) goto L_0x0099
            if (r10 != r8) goto L_0x0099
            com.google.android.exoplayer2.Timeline r0 = r3.A05
            int r0 = r0.A01()
            if (r13 < r0) goto L_0x0099
            X.7oF r3 = r3.A01(r1)
        L_0x0099:
            X.87l r0 = r7.A0B
            X.8ul r2 = r7.A07
            X.8hJ r0 = r0.A0Y
            r1 = 20
            X.88l r0 = (X.C1692188l) r0
            android.os.Handler r0 = r0.A00
            android.os.Message r0 = r0.obtainMessage(r1, r9, r10, r2)
            r0.sendToTarget()
            r0 = 0
            X.7oF r2 = r3.A03(r0)
        L_0x00b1:
            r3 = 1
            X.7oF r2 = r2.A01(r3)
            r0 = r24
            if (r24 == 0) goto L_0x00be
            X.7oF r2 = r2.A03(r0)
        L_0x00be:
            int r0 = r7.A02
            int r0 = r0 + 1
            r7.A02 = r0
            X.87l r0 = r7.A0B
            X.8hJ r0 = r0.A0Y
            r1 = 6
            X.88l r0 = (X.C1692188l) r0
            android.os.Handler r0 = r0.A00
            android.os.Message r0 = r0.obtainMessage(r1)
            r0.sendToTarget()
            r9 = 0
            r8 = 4
            r12 = r9
            r6 = r7
            r7 = r2
            r10 = r3
            r11 = r9
            r6.A05(r7, r8, r9, r10, r11, r12)
            return
        L_0x00df:
            int r18 = r7.B6d()
            X.7kK r2 = r7.A00
            X.7bH r11 = r7.A0C
            long r19 = X.C161207pD.A00(r3)
            r15 = r22
            r16 = r11
            r17 = r2
            android.util.Pair r15 = r15.A07(r16, r17, r18, r19)
            java.lang.Object r4 = r15.first
            int r3 = r6.A04(r4)
            if (r3 != r12) goto L_0x007e
            r21 = r9
            r20 = r9
            r19 = r4
            r18 = r6
            r17 = r22
            r16 = r2
            r15 = r11
            java.lang.Object r3 = X.C1689687l.A01(r15, r16, r17, r18, r19, r20, r21)
            if (r3 == 0) goto L_0x0120
            r6.A0A(r11, r3)
            int r3 = r11.A00
            r0 = 0
            r6.A0B(r2, r3, r0)
            android.util.Pair r15 = r7.A01(r6, r3, r0)
            goto L_0x007e
        L_0x0120:
            android.util.Pair r15 = r7.A01(r6, r12, r0)
            goto L_0x007e
        L_0x0126:
            int r12 = r7.A00()
            goto L_0x007a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6OC.A04(X.6zd, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x012b, code lost:
        if (r5 != 0) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0133, code lost:
        if (r4 != 0) goto L_0x0135;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.C160747oF r18, int r19, int r20, int r21, boolean r22, boolean r23) {
        /*
            r17 = this;
            r11 = r17
            X.7oF r10 = r11.A05
            r13 = r18
            r11.A05 = r13
            com.google.android.exoplayer2.Timeline r9 = r10.A05
            com.google.android.exoplayer2.Timeline r8 = r13.A05
            boolean r0 = r9.equals(r8)
            r7 = 1
            r16 = r0 ^ 1
            int r0 = r8.A01()
            boolean r6 = X.AnonymousClass000.A1T(r0)
            java.lang.Integer r14 = X.AnonymousClass0x7.A0f()
            r12 = r19
            if (r6 == 0) goto L_0x0192
            int r0 = r9.A01()
            boolean r0 = X.AnonymousClass000.A1T(r0)
            if (r0 == 0) goto L_0x0192
        L_0x002d:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            android.util.Pair r1 = X.AnonymousClass0x9.A0C(r0, r14)
        L_0x0033:
            java.lang.Object r0 = r1.first
            boolean r3 = X.AnonymousClass001.A1Z(r0)
            int r4 = X.C18290x4.A03(r1)
            boolean r0 = r9.equals(r8)
            if (r0 != 0) goto L_0x0051
            X.7Zr r2 = r11.A0K
            r0 = 2
            X.91o r1 = new X.91o
            r5 = r20
            r1.<init>(r13, r5, r0)
            r0 = 0
            r2.A02(r1, r0)
        L_0x0051:
            if (r22 == 0) goto L_0x005f
            X.7Zr r2 = r11.A0K
            X.88m r1 = new X.88m
            r1.<init>(r12)
            r0 = 12
            r2.A02(r1, r0)
        L_0x005f:
            if (r3 == 0) goto L_0x0080
            if (r6 != 0) goto L_0x018f
            X.6PS r0 = r13.A07
            java.lang.Object r1 = r0.A04
            X.7bH r0 = r11.A0C
            int r1 = X.C153417bH.A00(r0, r8, r1)
            X.7kK r0 = r11.A00
            X.7kK r0 = X.AnonymousClass6C8.A0X(r0, r8, r1)
            X.7Wq r3 = r0.A07
        L_0x0075:
            X.7Zr r2 = r11.A0K
            r1 = 0
            X.91o r0 = new X.91o
            r0.<init>(r3, r4, r1)
            r2.A02(r0, r7)
        L_0x0080:
            X.6zd r1 = r10.A03
            X.6zd r0 = r13.A03
            if (r1 == r0) goto L_0x0094
            if (r0 == 0) goto L_0x0094
            X.7Zr r2 = r11.A0K
            r0 = 0
            X.91n r1 = X.C1894991n.A00(r13, r0)
            r0 = 11
            r2.A02(r1, r0)
        L_0x0094:
            X.7MD r0 = r10.A09
            X.7MD r2 = r13.A09
            if (r0 == r2) goto L_0x00b7
            X.7GA r1 = r11.A0F
            java.lang.Object r0 = r2.A01
            X.6Pk r1 = (X.C126816Pk) r1
            X.7UF r0 = (X.AnonymousClass7UF) r0
            r1.A00 = r0
            X.8xZ[] r0 = r2.A03
            X.7Ve r3 = new X.7Ve
            r3.<init>(r0)
            X.7Zr r2 = r11.A0K
            r0 = 0
            X.91q r1 = new X.91q
            r1.<init>(r3, r0, r13)
            r0 = 2
            r2.A02(r1, r0)
        L_0x00b7:
            java.util.List r1 = r10.A0A
            java.util.List r0 = r13.A0A
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00cb
            X.7Zr r2 = r11.A0K
            X.91n r1 = X.C1894991n.A00(r13, r7)
            r0 = 3
            r2.A02(r1, r0)
        L_0x00cb:
            boolean r1 = r10.A0B
            boolean r0 = r13.A0B
            if (r1 == r0) goto L_0x00dc
            X.7Zr r2 = r11.A0K
            r0 = 2
            X.91n r1 = X.C1894991n.A00(r13, r0)
            r0 = 4
            r2.A02(r1, r0)
        L_0x00dc:
            int r9 = r10.A00
            int r8 = r13.A00
            r2 = -1
            if (r9 != r8) goto L_0x00e9
            boolean r1 = r10.A0D
            boolean r0 = r13.A0D
            if (r1 == r0) goto L_0x00f3
        L_0x00e9:
            X.7Zr r1 = r11.A0K
            r0 = 3
            X.91n r0 = X.C1894991n.A00(r13, r0)
            r1.A02(r0, r2)
        L_0x00f3:
            if (r9 == r8) goto L_0x0100
            X.7Zr r3 = r11.A0K
            r0 = 4
            X.91n r1 = X.C1894991n.A00(r13, r0)
            r0 = 5
            r3.A02(r1, r0)
        L_0x0100:
            boolean r7 = r10.A0D
            boolean r6 = r13.A0D
            if (r7 == r6) goto L_0x0114
            X.7Zr r3 = r11.A0K
            r0 = 1
            X.91o r1 = new X.91o
            r4 = r21
            r1.<init>(r13, r4, r0)
            r0 = 6
            r3.A02(r1, r0)
        L_0x0114:
            int r5 = r10.A01
            int r4 = r13.A01
            if (r5 == r4) goto L_0x0125
            X.7Zr r3 = r11.A0K
            r0 = 5
            X.91n r1 = X.C1894991n.A00(r13, r0)
            r0 = 7
            r3.A02(r1, r0)
        L_0x0125:
            r0 = 3
            if (r9 != r0) goto L_0x012d
            if (r7 == 0) goto L_0x012d
            r1 = 1
            if (r5 == 0) goto L_0x012e
        L_0x012d:
            r1 = 0
        L_0x012e:
            if (r8 != r0) goto L_0x0135
            if (r6 == 0) goto L_0x0135
            r0 = 1
            if (r4 == 0) goto L_0x0136
        L_0x0135:
            r0 = 0
        L_0x0136:
            if (r1 == r0) goto L_0x0144
            X.7Zr r3 = r11.A0K
            r0 = 6
            X.91n r1 = X.C1894991n.A00(r13, r0)
            r0 = 8
            r3.A02(r1, r0)
        L_0x0144:
            X.7k2 r1 = r10.A04
            X.7k2 r0 = r13.A04
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x015a
            X.7Zr r3 = r11.A0K
            r0 = 7
            X.91n r1 = X.C1894991n.A00(r13, r0)
            r0 = 13
            r3.A02(r1, r0)
        L_0x015a:
            if (r23 == 0) goto L_0x0167
            X.7Zr r3 = r11.A0K
            r1 = 1
            X.91r r0 = new X.91r
            r0.<init>(r1)
            r3.A02(r0, r2)
        L_0x0167:
            boolean r1 = r10.A0C
            boolean r0 = r13.A0C
            if (r1 == r0) goto L_0x0178
            X.7Zr r1 = r11.A0K
            r0 = 8
            X.91n r0 = X.C1894991n.A00(r13, r0)
            r1.A02(r0, r2)
        L_0x0178:
            boolean r1 = r10.A0E
            boolean r0 = r13.A0E
            if (r1 == r0) goto L_0x0189
            X.7Zr r1 = r11.A0K
            r0 = 9
            X.91n r0 = X.C1894991n.A00(r13, r0)
            r1.A02(r0, r2)
        L_0x0189:
            X.7Zr r0 = r11.A0K
            r0.A00()
            return
        L_0x018f:
            r3 = 0
            goto L_0x0075
        L_0x0192:
            int r0 = r9.A01()
            boolean r0 = X.AnonymousClass000.A1T(r0)
            r15 = 3
            if (r6 != r0) goto L_0x01cc
            X.6PS r0 = r10.A07
            java.lang.Object r1 = r0.A04
            X.7bH r0 = r11.A0C
            int r1 = X.C153417bH.A00(r0, r9, r1)
            X.7kK r5 = r11.A00
            r2 = 0
            X.7kK r1 = r9.A0B(r5, r1, r2)
            java.lang.Object r4 = r1.A09
            X.6PS r1 = r13.A07
            java.lang.Object r1 = r1.A04
            int r0 = X.C153417bH.A00(r0, r8, r1)
            X.7kK r0 = r8.A0B(r5, r0, r2)
            java.lang.Object r0 = r0.A09
            int r2 = r5.A00
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x01e3
            if (r22 == 0) goto L_0x01dc
            if (r19 != 0) goto L_0x01d8
            r15 = 1
        L_0x01cc:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
        L_0x01d2:
            android.util.Pair r1 = X.AnonymousClass0x9.A0C(r1, r0)
            goto L_0x0033
        L_0x01d8:
            if (r12 != r7) goto L_0x01dc
            r15 = 2
            goto L_0x01cc
        L_0x01dc:
            if (r16 != 0) goto L_0x01cc
            java.lang.IllegalStateException r0 = X.AnonymousClass6CA.A0O()
            throw r0
        L_0x01e3:
            if (r22 == 0) goto L_0x002d
            if (r19 != 0) goto L_0x002d
            int r0 = r8.A04(r1)
            if (r0 != r2) goto L_0x002d
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Integer r0 = X.C18290x4.A0Z()
            goto L_0x01d2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6OC.A05(X.7oF, int, int, int, boolean, boolean):void");
    }

    public void AwU(C186488vR r4) {
        C152647Zr r1 = this.A0K;
        if (!r1.A00) {
            r4.getClass();
            r1.A07.add(new C151717Wa(r1.A04, r4));
        }
    }

    public int B6V() {
        C160747oF r2 = this.A05;
        Timeline timeline = r2.A05;
        if (AnonymousClass000.A1T(timeline.A01())) {
            return 0;
        }
        return timeline.A04(r2.A07.A04);
    }

    public long B6W() {
        C160747oF r2 = this.A05;
        if (AnonymousClass000.A1T(r2.A05.A01())) {
            return this.A04;
        }
        AnonymousClass6PS r5 = r2.A07;
        boolean A1X = AnonymousClass001.A1X(r5.A00, -1);
        long A012 = C161207pD.A01(r2.A0G);
        if (A1X) {
            return A012;
        }
        Timeline timeline = this.A05.A05;
        Object obj = r5.A04;
        C153417bH r0 = this.A0C;
        timeline.A0A(r0, obj);
        return A012 + C161207pD.A01(r0.A02);
    }

    public Timeline B6b() {
        return this.A05.A05;
    }

    public boolean BBP() {
        return this.A05.A0D;
    }

    public int BBS() {
        return this.A05.A00;
    }

    public long BDn() {
        return C161207pD.A01(this.A05.A0H);
    }

    public boolean BIQ() {
        return AnonymousClass001.A1X(this.A05.A07.A00, -1);
    }

    public void BjC(C186488vR r8) {
        C152647Zr r6 = this.A0K;
        CopyOnWriteArraySet copyOnWriteArraySet = r6.A07;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            C151717Wa r3 = (C151717Wa) it.next();
            Object obj = r3.A03;
            if (obj.equals(r8)) {
                C180798le r1 = r6.A03;
                r3.A02 = true;
                if (r3.A01) {
                    r1.BGo(r3.A00, obj);
                }
                copyOnWriteArraySet.remove(r3);
            }
        }
    }

    public long B4x() {
        long j;
        if (BIQ()) {
            C160747oF r0 = this.A05;
            if (!r0.A06.equals(r0.A07)) {
                return B7A();
            }
            j = this.A05.A0F;
        } else {
            C160747oF r6 = this.A05;
            Timeline timeline = r6.A05;
            if (AnonymousClass000.A1T(timeline.A01())) {
                return this.A04;
            }
            if (r6.A06.A03 != r6.A07.A03) {
                j = AnonymousClass6C8.A0X(this.A00, timeline, B6d()).A02;
            } else {
                long j2 = r6.A0F;
                C160747oF r7 = this.A05;
                AnonymousClass6PS r62 = r7.A06;
                if (AnonymousClass001.A1X(r62.A00, -1)) {
                    C153417bH A0A2 = r7.A05.A0A(this.A0C, r62.A04);
                    r7 = this.A05;
                    r62 = r7.A06;
                    j2 = A0A2.A03.A01[r62.A00];
                    if (j2 == Long.MIN_VALUE) {
                        j2 = A0A2.A01;
                    }
                }
                long A012 = C161207pD.A01(j2);
                Timeline timeline2 = r7.A05;
                Object obj = r62.A04;
                C153417bH r02 = this.A0C;
                timeline2.A0A(r02, obj);
                return A012 + C161207pD.A01(r02.A02);
            }
        }
        return C161207pD.A01(j);
    }

    public long B5u() {
        if (!BIQ()) {
            return B6W();
        }
        C160747oF r0 = this.A05;
        Timeline timeline = r0.A05;
        Object obj = r0.A07.A04;
        C153417bH r6 = this.A0C;
        timeline.A0A(r6, obj);
        C160747oF r3 = this.A05;
        long j = r3.A02;
        if (j != -9223372036854775807L) {
            return C161207pD.A01(r6.A02) + C161207pD.A01(j);
        }
        r3.A05.A0B(this.A00, B6d(), 0);
        return 0;
    }

    public int B6L() {
        if (BIQ()) {
            return this.A05.A07.A00;
        }
        return -1;
    }

    public int B6M() {
        if (BIQ()) {
            return this.A05.A07.A01;
        }
        return -1;
    }

    public int B6d() {
        int A002 = A00();
        if (A002 == -1) {
            return 0;
        }
        return A002;
    }

    public long B7A() {
        long j;
        if (BIQ()) {
            C160747oF r1 = this.A05;
            AnonymousClass6PS r0 = r1.A07;
            r1.A05.A0A(this.A0C, r0.A04);
            j = -9223372036854775807L;
        } else {
            Timeline timeline = this.A05.A05;
            if (AnonymousClass000.A1T(timeline.A01())) {
                return -9223372036854775807L;
            }
            j = AnonymousClass6C8.A0X(this.A00, timeline, B6d()).A02;
        }
        return C161207pD.A01(j);
    }
}
