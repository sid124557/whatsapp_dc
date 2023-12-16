package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.Timeline;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.87l  reason: invalid class name and case insensitive filesystem */
public final class C1689687l implements C187618xX, Handler.Callback, C177958gj, C177998gn, C178008go, C178228hC {
    public int A00;
    public int A01;
    public int A02 = 0;
    public long A03;
    public C143886zd A04;
    public AnonymousClass7X4 A05;
    public AnonymousClass7JV A06;
    public C160747oF A07;
    public C158027jJ A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I = false;
    public final long A0J;
    public final HandlerThread A0K;
    public final Looper A0L;
    public final C1692788r A0M;
    public final C177968gk A0N;
    public final C177978gl A0O;
    public final C177988gm A0P;
    public final C153717bp A0Q;
    public final C153507bR A0R;
    public final C153417bH A0S;
    public final C158647kK A0T;
    public final AnonymousClass7GA A0U;
    public final AnonymousClass7MD A0V;
    public final C178268hG A0W;
    public final C186668vk A0X;
    public final C178298hJ A0Y;
    public final ArrayList A0Z;
    public final C187588xU[] A0a;
    public final C184858sf[] A0b;

    public C1689687l(Looper looper, C177968gk r6, C177978gl r7, C177988gm r8, C158027jJ r9, C1685685x r10, AnonymousClass7GA r11, AnonymousClass7MD r12, C178268hG r13, C186668vk r14, C187588xU[] r15) {
        this.A0N = r6;
        this.A0a = r15;
        this.A0U = r11;
        this.A0V = r12;
        this.A0P = r8;
        this.A0W = r13;
        this.A08 = r9;
        this.A0O = r7;
        this.A0D = false;
        this.A0X = r14;
        this.A0J = ((C1685185s) r8).A02;
        C160747oF A002 = C160747oF.A00(r12);
        this.A07 = A002;
        this.A05 = new AnonymousClass7X4(A002);
        int length = r15.length;
        C184858sf[] r2 = new C184858sf[length];
        this.A0b = r2;
        for (int i = 0; i < length; i++) {
            AnonymousClass861 r0 = r15[i];
            r0.A00 = i;
            r2[i] = r0;
        }
        this.A0M = new C1692788r(this, r14);
        this.A0Z = AnonymousClass001.A0s();
        this.A0T = new C158647kK();
        this.A0S = new C153417bH();
        r11.A00 = this;
        r11.A01 = r13;
        this.A09 = true;
        Handler handler = new Handler(looper);
        this.A0Q = new C153717bp(handler, r10);
        this.A0R = new C153507bR(handler, this, r10);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.A0K = handlerThread;
        Looper A0S2 = AnonymousClass6C9.A0S(handlerThread);
        this.A0L = A0S2;
        this.A0Y = new C1692188l(new Handler(A0S2, this));
    }

    public static Object A01(C153417bH r10, C158647kK r11, Timeline timeline, Timeline timeline2, Object obj, int i, boolean z) {
        Timeline timeline3 = timeline;
        int A042 = timeline.A04(obj);
        int A002 = timeline.A00();
        int i2 = -1;
        for (int i3 = 0; i3 < A002 && i2 == -1; i3++) {
            A042 = timeline3.A03(r10, r11, A042, i, z);
            if (A042 == -1) {
                return null;
            }
            i2 = timeline2.A04(timeline.A0C(A042));
        }
        if (i2 != -1) {
            return timeline2.A0C(i2);
        }
        return null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x015b, code lost:
        if (r3.A00 != r1) goto L_0x015d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01c1 A[Catch:{ all -> 0x01dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x01d2 A[Catch:{ all -> 0x01dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00f6 A[Catch:{ all -> 0x01dc }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.AnonymousClass7XC r8) {
        /*
            monitor-enter(r8)
            monitor-exit(r8)
            r2 = 1
            X.8lM r3 = r8.A07     // Catch:{ all -> 0x01dc }
            int r1 = r8.A00     // Catch:{ all -> 0x01dc }
            java.lang.Object r4 = r8.A02     // Catch:{ all -> 0x01dc }
            boolean r0 = r3 instanceof X.AnonymousClass6OE     // Catch:{ all -> 0x01dc }
            if (r0 != 0) goto L_0x0170
            boolean r0 = r3 instanceof X.AnonymousClass6OI     // Catch:{ all -> 0x01dc }
            if (r0 == 0) goto L_0x0055
            X.6OI r3 = (X.AnonymousClass6OI) r3     // Catch:{ all -> 0x01dc }
            r0 = 2
            if (r1 == r0) goto L_0x0045
            r0 = 3
            if (r1 == r0) goto L_0x003f
            r0 = 5
            if (r1 == r0) goto L_0x0039
            r0 = 101(0x65, float:1.42E-43)
            if (r1 == r0) goto L_0x0026
            r0 = 102(0x66, float:1.43E-43)
            if (r1 != r0) goto L_0x0170
            goto L_0x019b
        L_0x0026:
            X.8vH r3 = r3.A0I     // Catch:{ all -> 0x01dc }
            boolean r1 = X.AnonymousClass001.A1Z(r4)     // Catch:{ all -> 0x01dc }
            X.86A r3 = (X.AnonymousClass86A) r3     // Catch:{ all -> 0x01dc }
            X.7M3 r0 = r3.A04()     // Catch:{ all -> 0x01dc }
            X.7k2 r0 = r0.A02     // Catch:{ all -> 0x01dc }
            r3.A09(r0, r1)     // Catch:{ all -> 0x01dc }
            goto L_0x0170
        L_0x0039:
            X.7Uq r4 = (X.C151407Uq) r4     // Catch:{ all -> 0x01dc }
            X.8vH r1 = r3.A0I     // Catch:{ all -> 0x01dc }
            goto L_0x01b7
        L_0x003f:
            X.7jx r4 = (X.C158427jx) r4     // Catch:{ all -> 0x01dc }
            X.8vH r1 = r3.A0I     // Catch:{ all -> 0x01dc }
            goto L_0x01c8
        L_0x0045:
            X.8vH r3 = r3.A0I     // Catch:{ all -> 0x01dc }
            float r1 = X.AnonymousClass001.A05(r4)     // Catch:{ all -> 0x01dc }
            X.86A r3 = (X.AnonymousClass86A) r3     // Catch:{ all -> 0x01dc }
            float r0 = r3.A00     // Catch:{ all -> 0x01dc }
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0170
            goto L_0x015d
        L_0x0055:
            boolean r0 = r3 instanceof X.C126666Ov     // Catch:{ all -> 0x01dc }
            if (r0 == 0) goto L_0x0145
            X.6Ov r3 = (X.C126666Ov) r3     // Catch:{ all -> 0x01dc }
            if (r1 == r2) goto L_0x008d
            r0 = 4
            if (r1 == r0) goto L_0x007a
            r0 = 6
            if (r1 == r0) goto L_0x0170
            r0 = 102(0x66, float:1.43E-43)
            if (r1 != r0) goto L_0x0170
            int r1 = X.AnonymousClass001.A0K(r4)     // Catch:{ all -> 0x01dc }
            int r0 = r3.A0B     // Catch:{ all -> 0x01dc }
            if (r0 == r1) goto L_0x0170
            r3.A0B = r1     // Catch:{ all -> 0x01dc }
            boolean r0 = r3.A0T     // Catch:{ all -> 0x01dc }
            if (r0 == 0) goto L_0x0170
            r3.A0H()     // Catch:{ all -> 0x01dc }
            goto L_0x0170
        L_0x007a:
            int r1 = X.AnonymousClass001.A0K(r4)     // Catch:{ all -> 0x01dc }
            r3.A0A = r1     // Catch:{ all -> 0x01dc }
            X.8qo r0 = r3.A0O     // Catch:{ all -> 0x01dc }
            if (r0 == 0) goto L_0x0170
            X.87P r0 = (X.AnonymousClass87P) r0     // Catch:{ all -> 0x01dc }
            android.media.MediaCodec r0 = r0.A00     // Catch:{ all -> 0x01dc }
            r0.setVideoScalingMode(r1)     // Catch:{ all -> 0x01dc }
            goto L_0x0170
        L_0x008d:
            android.view.Surface r4 = (android.view.Surface) r4     // Catch:{ all -> 0x01dc }
            if (r4 != 0) goto L_0x00ab
            android.view.Surface r0 = r3.A0J     // Catch:{ all -> 0x01dc }
            if (r0 == 0) goto L_0x0097
            r4 = r0
            goto L_0x00ab
        L_0x0097:
            X.7o8 r5 = r3.A0P     // Catch:{ all -> 0x01dc }
            if (r5 == 0) goto L_0x00ab
            boolean r0 = r3.A0h(r5)     // Catch:{ all -> 0x01dc }
            if (r0 == 0) goto L_0x00ab
            android.content.Context r1 = r3.A0W     // Catch:{ all -> 0x01dc }
            boolean r0 = r5.A06     // Catch:{ all -> 0x01dc }
            X.6EU r4 = X.AnonymousClass6EU.A00(r1, r0)     // Catch:{ all -> 0x01dc }
            r3.A0J = r4     // Catch:{ all -> 0x01dc }
        L_0x00ab:
            android.view.Surface r0 = r3.A0K     // Catch:{ all -> 0x01dc }
            if (r0 == r4) goto L_0x012c
            r3.A0K = r4     // Catch:{ all -> 0x01dc }
            X.7kL r7 = r3.A0X     // Catch:{ all -> 0x01dc }
            r6 = r4
            boolean r0 = r4 instanceof X.AnonymousClass6EU     // Catch:{ all -> 0x01dc }
            if (r0 == 0) goto L_0x00b9
            r6 = 0
        L_0x00b9:
            android.view.Surface r5 = r7.A0B     // Catch:{ all -> 0x01dc }
            if (r5 == r6) goto L_0x00d6
            int r1 = X.C162387ry.A01     // Catch:{ all -> 0x01dc }
            r0 = 30
            if (r1 < r0) goto L_0x00d1
            if (r5 == 0) goto L_0x00d1
            float r0 = r7.A03     // Catch:{ all -> 0x01dc }
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00d1
            r7.A03 = r1     // Catch:{ all -> 0x01dc }
            X.C158657kL.A00(r5, r1)     // Catch:{ all -> 0x01dc }
        L_0x00d1:
            r7.A0B = r6     // Catch:{ all -> 0x01dc }
            r7.A03(r2)     // Catch:{ all -> 0x01dc }
        L_0x00d6:
            r0 = 0
            r3.A0P = r0     // Catch:{ all -> 0x01dc }
            int r6 = r3.A01     // Catch:{ all -> 0x01dc }
            X.8qo r5 = r3.A0O     // Catch:{ all -> 0x01dc }
            if (r5 == 0) goto L_0x00e8
            int r1 = X.C162387ry.A01     // Catch:{ all -> 0x01dc }
            r0 = 23
            if (r1 < r0) goto L_0x00fd
            if (r4 == 0) goto L_0x00fd
            goto L_0x00eb
        L_0x00e8:
            if (r4 == 0) goto L_0x011d
            goto L_0x00f2
        L_0x00eb:
            boolean r0 = r3.A0O     // Catch:{ all -> 0x01dc }
            if (r0 != 0) goto L_0x00fd
            X.C126666Ov.A03(r4, r5)     // Catch:{ all -> 0x01dc }
        L_0x00f2:
            android.view.Surface r0 = r3.A0J     // Catch:{ all -> 0x01dc }
            if (r4 == r0) goto L_0x011d
            r3.A0e()     // Catch:{ all -> 0x01dc }
            r3.A0b()     // Catch:{ all -> 0x01dc }
            goto L_0x0104
        L_0x00fd:
            r3.A0H()     // Catch:{ all -> 0x01dc }
            r3.A0O()     // Catch:{ all -> 0x01dc }
            goto L_0x00e8
        L_0x0104:
            r0 = 2
            if (r6 != r0) goto L_0x0170
            long r4 = r3.A0V     // Catch:{ all -> 0x01dc }
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0117
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01dc }
            long r0 = r0 + r4
        L_0x0114:
            r3.A0F = r0     // Catch:{ all -> 0x01dc }
            goto L_0x0170
        L_0x0117:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0114
        L_0x011d:
            r1 = -1
            r3.A09 = r1     // Catch:{ all -> 0x01dc }
            r3.A07 = r1     // Catch:{ all -> 0x01dc }
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.A01 = r0     // Catch:{ all -> 0x01dc }
            r3.A08 = r1     // Catch:{ all -> 0x01dc }
            r3.A0b()     // Catch:{ all -> 0x01dc }
            goto L_0x0170
        L_0x012c:
            if (r4 == 0) goto L_0x0170
            android.view.Surface r0 = r3.A0J     // Catch:{ all -> 0x01dc }
            if (r4 == r0) goto L_0x0170
            r3.A0e()     // Catch:{ all -> 0x01dc }
            boolean r0 = r3.A0P     // Catch:{ all -> 0x01dc }
            if (r0 == 0) goto L_0x0170
            X.7GH r4 = r3.A0Y     // Catch:{ all -> 0x01dc }
            android.view.Surface r3 = r3.A0K     // Catch:{ all -> 0x01dc }
            android.os.Handler r1 = r4.A00     // Catch:{ all -> 0x01dc }
            r0 = 34
            X.AnonymousClass8MF.A00(r1, r4, r3, r0)     // Catch:{ all -> 0x01dc }
            goto L_0x0170
        L_0x0145:
            boolean r0 = r3 instanceof X.C126676Ow     // Catch:{ all -> 0x01dc }
            if (r0 == 0) goto L_0x0170
            X.6Ow r3 = (X.C126676Ow) r3     // Catch:{ all -> 0x01dc }
            r0 = 2
            if (r1 == r0) goto L_0x014f
            goto L_0x0167
        L_0x014f:
            X.8vH r3 = r3.A0A     // Catch:{ all -> 0x01dc }
            float r1 = X.AnonymousClass001.A05(r4)     // Catch:{ all -> 0x01dc }
            X.86A r3 = (X.AnonymousClass86A) r3     // Catch:{ all -> 0x01dc }
            float r0 = r3.A00     // Catch:{ all -> 0x01dc }
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0170
        L_0x015d:
            r3.A00 = r1     // Catch:{ all -> 0x01dc }
            android.media.AudioTrack r0 = r3.A0C     // Catch:{ all -> 0x01dc }
            if (r0 == 0) goto L_0x0170
            r0.setVolume(r1)     // Catch:{ all -> 0x01dc }
            goto L_0x0170
        L_0x0167:
            r0 = 3
            if (r1 == r0) goto L_0x01c4
            r0 = 5
            if (r1 == r0) goto L_0x01b3
            switch(r1) {
                case 101: goto L_0x0174;
                case 102: goto L_0x0186;
                default: goto L_0x0170;
            }     // Catch:{ all -> 0x01dc }
        L_0x0170:
            r8.A01(r2)
            return
        L_0x0174:
            X.8vH r3 = r3.A0A     // Catch:{ all -> 0x01dc }
            boolean r1 = X.AnonymousClass001.A1Z(r4)     // Catch:{ all -> 0x01dc }
            X.86A r3 = (X.AnonymousClass86A) r3     // Catch:{ all -> 0x01dc }
            X.7M3 r0 = r3.A04()     // Catch:{ all -> 0x01dc }
            X.7k2 r0 = r0.A02     // Catch:{ all -> 0x01dc }
            r3.A09(r0, r1)     // Catch:{ all -> 0x01dc }
            goto L_0x0170
        L_0x0186:
            X.8vH r3 = r3.A0A     // Catch:{ all -> 0x01dc }
            int r1 = X.AnonymousClass001.A0K(r4)     // Catch:{ all -> 0x01dc }
            X.86A r3 = (X.AnonymousClass86A) r3     // Catch:{ all -> 0x01dc }
            int r0 = r3.A01     // Catch:{ all -> 0x01dc }
            if (r0 == r1) goto L_0x0170
            r3.A01 = r1     // Catch:{ all -> 0x01dc }
            boolean r0 = X.AnonymousClass000.A1S(r1)     // Catch:{ all -> 0x01dc }
            r3.A0P = r0     // Catch:{ all -> 0x01dc }
            goto L_0x01af
        L_0x019b:
            X.8vH r3 = r3.A0I     // Catch:{ all -> 0x01dc }
            int r1 = X.AnonymousClass001.A0K(r4)     // Catch:{ all -> 0x01dc }
            X.86A r3 = (X.AnonymousClass86A) r3     // Catch:{ all -> 0x01dc }
            int r0 = r3.A01     // Catch:{ all -> 0x01dc }
            if (r0 == r1) goto L_0x0170
            r3.A01 = r1     // Catch:{ all -> 0x01dc }
            boolean r0 = X.AnonymousClass000.A1S(r1)     // Catch:{ all -> 0x01dc }
            r3.A0P = r0     // Catch:{ all -> 0x01dc }
        L_0x01af:
            r3.flush()     // Catch:{ all -> 0x01dc }
            goto L_0x0170
        L_0x01b3:
            X.7Uq r4 = (X.C151407Uq) r4     // Catch:{ all -> 0x01dc }
            X.8vH r1 = r3.A0A     // Catch:{ all -> 0x01dc }
        L_0x01b7:
            X.86A r1 = (X.AnonymousClass86A) r1     // Catch:{ all -> 0x01dc }
            X.7Uq r0 = r1.A0G     // Catch:{ all -> 0x01dc }
            boolean r0 = r0.equals(r4)     // Catch:{ all -> 0x01dc }
            if (r0 != 0) goto L_0x0170
            r1.A0G = r4     // Catch:{ all -> 0x01dc }
            goto L_0x0170
        L_0x01c4:
            X.7jx r4 = (X.C158427jx) r4     // Catch:{ all -> 0x01dc }
            X.8vH r1 = r3.A0A     // Catch:{ all -> 0x01dc }
        L_0x01c8:
            X.86A r1 = (X.AnonymousClass86A) r1     // Catch:{ all -> 0x01dc }
            X.7jx r0 = r1.A0E     // Catch:{ all -> 0x01dc }
            boolean r0 = r0.equals(r4)     // Catch:{ all -> 0x01dc }
            if (r0 != 0) goto L_0x0170
            r1.A0E = r4     // Catch:{ all -> 0x01dc }
            boolean r0 = r1.A0W     // Catch:{ all -> 0x01dc }
            if (r0 != 0) goto L_0x0170
            r1.flush()     // Catch:{ all -> 0x01dc }
            goto L_0x0170
        L_0x01dc:
            r0 = move-exception
            r8.A01(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1689687l.A02(X.7XC):void");
    }

    public static final void A03(C187588xU r2, long j) {
        ((AnonymousClass861) r2).A06 = true;
        if (r2 instanceof AnonymousClass6OH) {
            AnonymousClass6OH r22 = (AnonymousClass6OH) r2;
            C161487pm.A04(r22.A06);
            r22.A02 = j;
        }
    }

    public final Pair A08(Timeline timeline) {
        Timeline timeline2 = timeline;
        if (AnonymousClass000.A1T(timeline.A01())) {
            return Pair.create(C160747oF.A0I, 0L);
        }
        int A052 = timeline.A05(this.A0I);
        C158647kK r8 = this.A0T;
        C153417bH r7 = this.A0S;
        Pair A072 = timeline2.A07(r7, r8, A052, -9223372036854775807L);
        AnonymousClass6PS A053 = this.A0Q.A05(timeline, A072.first, 0);
        long A0R2 = AnonymousClass6C8.A0R(A072);
        if (AnonymousClass001.A1X(A053.A00, -1)) {
            timeline.A0A(r7, A053.A04);
            A0R2 = 0;
        }
        return Pair.create(A053, Long.valueOf(A0R2));
    }

    public final void A0D() {
        this.A0B = false;
        C1692788r r1 = this.A0M;
        r1.A03 = true;
        C1692888s r2 = r1.A05;
        if (!r2.A03) {
            r2.A00 = SystemClock.elapsedRealtime();
            r2.A03 = true;
        }
        for (C187588xU r12 : this.A0a) {
            if (AnonymousClass000.A1S(((AnonymousClass861) r12).A01)) {
                AnonymousClass861 r13 = (AnonymousClass861) r12;
                C161487pm.A04(AnonymousClass001.A1T(r13.A01));
                r13.A01 = 2;
                r13.A07();
            }
        }
    }

    public final void A0L(C187588xU r5) {
        AnonymousClass861 r3 = (AnonymousClass861) r5;
        if (AnonymousClass000.A1S(r3.A01)) {
            C1692788r r1 = this.A0M;
            if (r5 == r1.A00) {
                r1.A01 = null;
                r1.A00 = null;
                r1.A02 = true;
            }
            if (r3.A01 == 2) {
                r3.A01 = 1;
                r3.A08();
            }
            C161487pm.A04(AnonymousClass001.A1T(r3.A01));
            C147807Fu r12 = r3.A0A;
            r12.A01 = null;
            r12.A00 = null;
            r3.A01 = 0;
            r3.A05 = null;
            r3.A08 = null;
            r3.A06 = false;
            r3.A0B();
            this.A00--;
        }
    }

    public final void A0R(boolean z) {
        AnonymousClass6PS r4 = this.A0Q.A05.A02.A04;
        long A072 = A07(r4, this.A07.A0G, true, false);
        if (A072 != this.A07.A0G) {
            this.A07 = A09(r4, A072, this.A07.A02);
            if (z) {
                this.A05.A01(4);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r4.A0A == false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0S(boolean r5, boolean r6) {
        /*
            r4 = this;
            r3 = 0
            r2 = 1
            if (r5 != 0) goto L_0x0009
            boolean r1 = r4.A0A
            r0 = 0
            if (r1 != 0) goto L_0x000a
        L_0x0009:
            r0 = 1
        L_0x000a:
            r4.A0T(r0, r3, r2, r3)
            X.7X4 r0 = r4.A05
            r0.A00(r6)
            X.8gm r1 = r4.A0P
            X.85s r1 = (X.C1685185s) r1
            r0 = 13107200(0xc80000, float:1.8367099E-38)
            r1.A00 = r0
            r1.A01 = r3
            X.88T r1 = r1.A07
            monitor-enter(r1)
            r1.A00(r3)     // Catch:{ all -> 0x0027 }
            monitor-exit(r1)
            r4.A0H(r2)
            return
        L_0x0027:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1689687l.A0S(boolean, boolean):void");
    }

    public static Pair A00(AnonymousClass7JV r13, C153417bH r14, C158647kK r15, Timeline timeline, int i, boolean z) {
        Timeline timeline2 = r13.A02;
        Timeline timeline3 = timeline;
        if (AnonymousClass000.A1T(timeline3.A01())) {
            return null;
        }
        if (AnonymousClass000.A1T(timeline2.A01())) {
            timeline2 = timeline3;
        }
        try {
            int i2 = r13.A00;
            long j = r13.A01;
            C153417bH r4 = r14;
            C158647kK r5 = r15;
            C153417bH r9 = r14;
            C158647kK r10 = r15;
            Pair A072 = timeline2.A07(r9, r10, i2, j);
            if (timeline3.equals(timeline2)) {
                return A072;
            }
            if (timeline3.A04(A072.first) != -1) {
                timeline2.A0A(r14, A072.first);
                if (!AnonymousClass6C8.A0X(r15, timeline2, r14.A00).A0C) {
                    return A072;
                }
                return timeline3.A07(r9, r10, C153417bH.A00(r14, timeline3, A072.first), j);
            }
            Object A012 = A01(r4, r5, timeline2, timeline3, A072.first, i, z);
            if (A012 != null) {
                return timeline3.A07(r14, r15, C153417bH.A00(r14, timeline3, A012), -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    public static boolean A04(C160747oF r4, C153417bH r5, C158647kK r6) {
        AnonymousClass6PS r3 = r4.A07;
        Timeline timeline = r4.A05;
        if (AnonymousClass001.A1X(r3.A00, -1) || AnonymousClass000.A1T(timeline.A01()) || AnonymousClass6C8.A0X(r6, timeline, C153417bH.A00(r5, timeline, r3.A04)).A0C) {
            return true;
        }
        return false;
    }

    public final long A05() {
        long j = this.A07.A0F;
        C153327b3 r0 = this.A0Q.A04;
        if (r0 == null) {
            return 0;
        }
        return Math.max(0, j - (this.A03 - r0.A00));
    }

    public final long A06(Timeline timeline, Object obj, long j) {
        long elapsedRealtime;
        C153417bH r6 = this.A0S;
        int A002 = C153417bH.A00(r6, timeline, obj);
        C158647kK r3 = this.A0T;
        timeline.A0B(r3, A002, 0);
        long j2 = r3.A05;
        if (j2 != -9223372036854775807L) {
            boolean z = r3.A0B;
            C151387Uo r1 = r3.A06;
            C161487pm.A04(AnonymousClass000.A1U(z ? 1 : 0, AnonymousClass000.A1W(r1) ? 1 : 0));
            if (r1 != null && r3.A0A) {
                long j3 = r3.A03;
                if (j3 == -9223372036854775807L) {
                    elapsedRealtime = System.currentTimeMillis();
                } else {
                    elapsedRealtime = j3 + SystemClock.elapsedRealtime();
                }
                return C161207pD.A00(elapsedRealtime - j2) - (j + r6.A02);
            }
        }
        return -9223372036854775807L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r12.equals(r6.A07.A07) == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C160747oF A09(X.AnonymousClass6PS r23, long r24, long r26) {
        /*
            r22 = this;
            r6 = r22
            boolean r0 = r6.A09
            r12 = r23
            r16 = r24
            if (r0 != 0) goto L_0x001d
            X.7oF r0 = r6.A07
            long r1 = r0.A0G
            int r0 = (r24 > r1 ? 1 : (r24 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001d
            X.7oF r0 = r6.A07
            X.6PS r0 = r0.A07
            boolean r1 = r12.equals(r0)
            r0 = 0
            if (r1 != 0) goto L_0x001e
        L_0x001d:
            r0 = 1
        L_0x001e:
            r6.A09 = r0
            r6.A0C()
            X.7oF r1 = r6.A07
            X.7yb r13 = r1.A08
            X.7MD r14 = r1.A09
            java.util.List r15 = r1.A0A
            X.7bR r0 = r6.A0R
            boolean r0 = r0.A02
            r2 = r26
            if (r0 == 0) goto L_0x008b
            X.7bp r0 = r6.A0Q
            X.7b3 r7 = r0.A05
            if (r7 != 0) goto L_0x006a
            X.7yb r13 = X.C166387yb.A03
            X.7MD r14 = r6.A0V
        L_0x003d:
            X.8xZ[] r10 = r14.A03
            X.6aO r9 = new X.6aO
            r9.<init>()
            int r8 = r10.length
            r5 = 0
            r4 = 0
            r11 = 0
        L_0x0048:
            if (r4 >= r8) goto L_0x006f
            r0 = r10[r4]
            if (r0 == 0) goto L_0x0062
            X.88R r0 = (X.AnonymousClass88R) r0
            X.7yp[] r0 = r0.A04
            r0 = r0[r5]
            X.7ys r0 = r0.A0L
            if (r0 != 0) goto L_0x0065
            X.8x6[] r1 = new X.C187368x6[r5]
            X.7ys r0 = new X.7ys
            r0.<init>((X.C187368x6[]) r1)
            r9.add((java.lang.Object) r0)
        L_0x0062:
            int r4 = r4 + 1
            goto L_0x0048
        L_0x0065:
            r9.add((java.lang.Object) r0)
            r11 = 1
            goto L_0x0062
        L_0x006a:
            X.7yb r13 = r7.A03
            X.7MD r14 = r7.A04
            goto L_0x003d
        L_0x006f:
            if (r11 == 0) goto L_0x0086
            X.6aY r15 = r9.build()
        L_0x0075:
            if (r7 == 0) goto L_0x009b
            X.7aa r5 = r7.A02
            long r0 = r5.A02
            int r4 = (r0 > r26 ? 1 : (r0 == r26 ? 0 : -1))
            if (r4 == 0) goto L_0x009b
            X.7aa r0 = r5.A00(r2)
            r7.A02 = r0
            goto L_0x009b
        L_0x0086:
            X.6aY r15 = X.C129586aY.of()
            goto L_0x0075
        L_0x008b:
            X.6PS r0 = r1.A07
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x009b
            X.7yb r13 = X.C166387yb.A03
            X.7MD r14 = r6.A0V
            X.6aY r15 = X.C129586aY.of()
        L_0x009b:
            X.7oF r11 = r6.A07
            long r20 = r6.A05()
            r18 = r2
            X.7oF r0 = r11.A07(r12, r13, r14, r15, r16, r18, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1689687l.A09(X.6PS, long, long):X.7oF");
    }

    public final void A0B() {
        AnonymousClass7X4 r4 = this.A05;
        C160747oF r2 = this.A07;
        boolean A1W = r4.A04 | C18300x5.A1W(r4.A03, r2);
        r4.A04 = A1W;
        r4.A03 = r2;
        if (A1W) {
            AnonymousClass6OC r3 = ((C1684985q) this.A0N).A00;
            C178298hJ r22 = r3.A0J;
            ((C1692188l) r22).A00.post(new AnonymousClass8MF(r3, 24, r4));
            this.A05 = new AnonymousClass7X4(this.A07);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r2.A0D == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C() {
        /*
            r2 = this;
            X.7bp r0 = r2.A0Q
            X.7b3 r0 = r0.A05
            if (r0 == 0) goto L_0x0011
            X.7aa r0 = r0.A02
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0011
            boolean r1 = r2.A0D
            r0 = 1
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            r2.A0E = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1689687l.A0C():void");
    }

    public final void A0E() {
        C1692788r r1 = this.A0M;
        r1.A03 = false;
        C1692888s r2 = r1.A05;
        if (r2.A03) {
            r2.A00(r2.BBa());
            r2.A03 = false;
        }
        for (C187588xU r22 : this.A0a) {
            if (AnonymousClass000.A1S(((AnonymousClass861) r22).A01)) {
                AnonymousClass861 r23 = (AnonymousClass861) r22;
                if (r23.A01 == 2) {
                    r23.A01 = 1;
                    r23.A08();
                }
            }
        }
    }

    public final void A0F() {
        boolean z;
        C153327b3 r1 = this.A0Q.A04;
        if (this.A0H || (r1 != null && r1.A09.BHy())) {
            z = true;
        } else {
            z = false;
        }
        C160747oF r9 = this.A07;
        if (z != r9.A0B) {
            Timeline timeline = r9.A05;
            AnonymousClass6PS r37 = r9.A07;
            long j = r9.A02;
            int i = r9.A00;
            C143886zd r18 = r9.A03;
            C166387yb r20 = r9.A08;
            AnonymousClass7MD r17 = r9.A09;
            List list = r9.A0A;
            boolean z2 = r9.A0D;
            int i2 = r9.A01;
            C158477k2 r13 = r9.A04;
            long j2 = r9.A0F;
            AnonymousClass7MD r21 = r17;
            List list2 = list;
            int i3 = i2;
            long j3 = j;
            long j4 = j2;
            C143886zd r15 = r18;
            C158477k2 r16 = r13;
            Timeline timeline2 = timeline;
            AnonymousClass6PS r182 = r37;
            this.A07 = new C160747oF(r15, r16, timeline2, r182, r9.A06, r20, r21, list2, i, i3, j3, j4, r9.A0H, r9.A0G, z, z2, r9.A0C, r9.A0E);
        }
    }

    public final void A0G() {
        long j;
        C153717bp r6 = this.A0Q;
        C153327b3 r5 = r6.A05;
        if (r5 != null) {
            if (r5.A07) {
                j = r5.A09.BiL();
            } else {
                j = -9223372036854775807L;
            }
            if (j != -9223372036854775807L) {
                A0J(j);
                if (j != this.A07.A0G) {
                    C160747oF r0 = this.A07;
                    this.A07 = A09(r0.A07, j, r0.A02);
                    this.A05.A01(4);
                }
            } else {
                C1692788r r7 = this.A0M;
                boolean A1W = C18300x5.A1W(r5, r6.A06);
                C187588xU r02 = r7.A00;
                if (r02 == null || r02.BHW() || (!r7.A00.BIe() && (A1W || r7.A00.BFS()))) {
                    r7.A02 = true;
                    if (r7.A03) {
                        C1692888s r2 = r7.A05;
                        if (!r2.A03) {
                            r2.A00 = SystemClock.elapsedRealtime();
                            r2.A03 = true;
                        }
                    }
                } else {
                    C184928sm r9 = r7.A01;
                    r9.getClass();
                    long BBa = r9.BBa();
                    if (r7.A02) {
                        C1692888s r8 = r7.A05;
                        if (BBa >= r8.BBa()) {
                            r7.A02 = false;
                            if (r7.A03 && !r8.A03) {
                                r8.A00 = SystemClock.elapsedRealtime();
                                r8.A03 = true;
                            }
                        } else if (r8.A03) {
                            r8.A00(r8.BBa());
                            r8.A03 = false;
                        }
                    }
                    C1692888s r1 = r7.A05;
                    r1.A00(BBa);
                    C158477k2 BBR = r9.BBR();
                    if (!BBR.equals(r1.A02)) {
                        r1.Bmy(BBR);
                        C18290x4.A1C(((C1692188l) ((C1689687l) r7.A04).A0Y).A00, BBR, 16);
                    }
                }
                long BBa2 = r7.BBa();
                this.A03 = BBa2;
                long j2 = BBa2 - r5.A00;
                ArrayList arrayList = this.A0Z;
                if (!arrayList.isEmpty()) {
                    C160747oF r82 = this.A07;
                    AnonymousClass6PS r72 = r82.A07;
                    if (!AnonymousClass001.A1X(r72.A00, -1)) {
                        if (this.A09) {
                            this.A09 = false;
                        }
                        r82.A05.A04(r72.A04);
                        int min = Math.min(this.A01, arrayList.size());
                        if (min > 0) {
                            arrayList.get(min - 1);
                        }
                        if (min < arrayList.size()) {
                            arrayList.get(min);
                        }
                        this.A01 = min;
                    }
                }
                this.A07.A0G = j2;
            }
            C153327b3 r03 = r6.A04;
            this.A07.A0F = r03.A00();
            this.A07.A0H = A05();
            C160747oF r22 = this.A07;
            if (r22.A0D && r22.A00 == 3 && A0Y(r22.A05, r22.A07)) {
                C160747oF r52 = this.A07;
                if (r52.A04.A01 == 1.0f) {
                    A06(r52.A05, r52.A07.A04, r52.A0G);
                    A05();
                    C1692788r r23 = this.A0M;
                    if (r23.BBR().A01 != 1.0f) {
                        r23.Bmy(new C158477k2(1.0f, this.A07.A04.A00));
                        A0K(this.A07.A04, r23.BBR().A01, false, false);
                    }
                }
            }
        }
    }

    public final void A0H(int i) {
        C160747oF r1 = this.A07;
        if (r1.A00 != i) {
            this.A07 = r1.A01(i);
        }
    }

    public final void A0I(int i, int i2, boolean z, boolean z2) {
        AnonymousClass7X4 r1 = this.A05;
        r1.A00(z2 ? 1 : 0);
        r1.A04 = true;
        r1.A05 = true;
        r1.A02 = i2;
        C160747oF A022 = this.A07.A02(i, z);
        this.A07 = A022;
        this.A0B = false;
        if (!A0X()) {
            A0E();
            A0G();
            return;
        }
        int i3 = A022.A00;
        if (i3 == 3) {
            A0D();
        } else if (i3 != 2) {
            return;
        }
        C1692188l.A00(this.A0Y, 2);
    }

    public final void A0J(long j) {
        C153327b3 r0 = this.A0Q.A05;
        if (r0 != null) {
            j += r0.A00;
        }
        this.A03 = j;
        this.A0M.A05.A00(j);
        for (C187588xU r3 : this.A0a) {
            if (AnonymousClass000.A1S(((AnonymousClass861) r3).A01)) {
                long j2 = this.A03;
                AnonymousClass861 r32 = (AnonymousClass861) r3;
                r32.A06 = false;
                r32.A02 = j2;
                r32.A0C(j2, false);
            }
        }
    }

    public final void A0K(C158477k2 r6, float f, boolean z, boolean z2) {
        if (z) {
            if (z2) {
                this.A05.A00(1);
            }
            this.A07 = this.A07.A04(r6);
        }
        float f2 = r6.A01;
        for (C153327b3 r2 = this.A0Q.A05; r2 != null; r2 = r2.A01) {
            for (int i = 0; i < r2.A04.A03.length; i++) {
            }
        }
        for (C187588xU r0 : this.A0a) {
            if (r0 != null) {
                r0.Bmz(f, f2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0288, code lost:
        if (r1 == false) goto L_0x028a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02d7, code lost:
        if ((!r9.A08(r7)) != false) goto L_0x028a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02fd, code lost:
        if (r18 != r1.A02) goto L_0x02ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0052, code lost:
        if (r15 != r2.A07.A0G) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0M(com.google.android.exoplayer2.Timeline r37) {
        /*
            r36 = this;
            r2 = r36
            X.7oF r7 = r2.A07
            X.7JV r12 = r2.A06
            X.7bp r9 = r2.A0Q
            int r14 = r2.A02
            boolean r11 = r2.A0I
            X.7kK r13 = r2.A0T
            X.7bH r6 = r2.A0S
            r3 = r37
            int r0 = r3.A01()
            boolean r22 = X.AnonymousClass000.A1T(r0)
            if (r22 == 0) goto L_0x005f
            X.6PS r12 = X.C160747oF.A0I
            r13 = 0
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r17 = 0
            r18 = 1
            X.7OQ r11 = new X.7OQ
            r19 = r17
            r11.<init>(r12, r13, r15, r17, r18, r19)
        L_0x0030:
            X.6PS r0 = r11.A02
            r26 = r0
            long r0 = r11.A01
            r18 = r0
            boolean r4 = r11.A04
            long r15 = r11.A00
            X.7oF r0 = r2.A07
            X.6PS r1 = r0.A07
            r0 = r26
            boolean r0 = r1.equals(r0)
            r5 = 1
            r8 = 0
            if (r0 == 0) goto L_0x0054
            X.7oF r0 = r2.A07
            long r0 = r0.A0G
            int r6 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            r21 = 0
            if (r6 == 0) goto L_0x0056
        L_0x0054:
            r21 = 1
        L_0x0056:
            r20 = 0
            r28 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0197
        L_0x005f:
            X.6PS r10 = r7.A07
            java.lang.Object r8 = r10.A04
            r15 = r8
            boolean r16 = A04(r7, r6, r13)
            if (r16 == 0) goto L_0x0193
            long r0 = r7.A02
        L_0x006c:
            r30 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r12 == 0) goto L_0x00fe
            r18 = 1
            r5 = -1
            r23 = r12
            r24 = r6
            r25 = r13
            r26 = r3
            r27 = r14
            r28 = r11
            android.util.Pair r4 = A00(r23, r24, r25, r26, r27, r28)
            if (r4 != 0) goto L_0x0170
            int r4 = r3.A05(r11)
            r20 = 0
            r18 = 0
            r19 = 1
        L_0x0092:
            if (r4 == r5) goto L_0x00fb
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r26 = r3
            r27 = r6
            r28 = r13
            r29 = r4
            android.util.Pair r0 = r26.A07(r27, r28, r29, r30)
            java.lang.Object r8 = r0.first
            long r0 = X.AnonymousClass6C8.A0R(r0)
        L_0x00ab:
            X.6PS r4 = r9.A05(r3, r8, r0)
            int r11 = r4.A02
            if (r11 == r5) goto L_0x00bb
            int r11 = r10.A02
            if (r11 == r5) goto L_0x00f9
            int r5 = r4.A00
            if (r5 < r11) goto L_0x00f9
        L_0x00bb:
            r11 = 1
        L_0x00bc:
            boolean r5 = r15.equals(r8)
            if (r5 == 0) goto L_0x00d6
            int r5 = r10.A00
            r8 = -1
            boolean r5 = X.AnonymousClass001.A1X(r5, r8)
            if (r5 != 0) goto L_0x00d6
            int r5 = r4.A00
            boolean r5 = X.AnonymousClass001.A1X(r5, r8)
            if (r5 != 0) goto L_0x00d6
            if (r11 == 0) goto L_0x00d6
            r4 = r10
        L_0x00d6:
            int r8 = r4.A00
            r5 = -1
            boolean r5 = X.AnonymousClass001.A1X(r8, r5)
            if (r5 == 0) goto L_0x00e7
            boolean r0 = r4.equals(r10)
            if (r0 == 0) goto L_0x00f1
            long r0 = r7.A0G
        L_0x00e7:
            X.7OQ r11 = new X.7OQ
            r12 = r11
            r13 = r4
            r14 = r0
            r12.<init>(r13, r14, r16, r18, r19, r20)
            goto L_0x0030
        L_0x00f1:
            java.lang.Object r0 = r4.A04
            r3.A0A(r6, r0)
            r0 = 0
            goto L_0x00e7
        L_0x00f9:
            r11 = 0
            goto L_0x00bc
        L_0x00fb:
            r16 = r0
            goto L_0x00ab
        L_0x00fe:
            r5 = -1
            com.google.android.exoplayer2.Timeline r12 = r7.A05
            int r4 = r12.A01()
            boolean r4 = X.AnonymousClass000.A1T(r4)
            if (r4 == 0) goto L_0x0114
            int r4 = r3.A05(r11)
        L_0x010f:
            r18 = 0
            r20 = 0
            goto L_0x0185
        L_0x0114:
            int r4 = r3.A04(r8)
            if (r4 != r5) goto L_0x0141
            r23 = r6
            r24 = r13
            r25 = r12
            r26 = r3
            r27 = r8
            r28 = r14
            r29 = r11
            java.lang.Object r4 = A01(r23, r24, r25, r26, r27, r28, r29)
            if (r4 != 0) goto L_0x013a
            int r4 = r3.A05(r11)
            r19 = 1
        L_0x0134:
            r18 = 0
            r20 = 0
            goto L_0x0092
        L_0x013a:
            int r4 = X.C153417bH.A00(r6, r3, r4)
            r19 = 0
            goto L_0x0134
        L_0x0141:
            if (r16 == 0) goto L_0x014c
            int r4 = (r0 > r30 ? 1 : (r0 == r30 ? 0 : -1))
            if (r4 != 0) goto L_0x014e
            int r4 = X.C153417bH.A00(r6, r3, r8)
            goto L_0x010f
        L_0x014c:
            r4 = -1
            goto L_0x010f
        L_0x014e:
            r12.A0A(r6, r8)
            long r11 = r6.A02
            long r0 = r0 + r11
            int r19 = X.C153417bH.A00(r6, r3, r8)
            r16 = r3
            r17 = r6
            r18 = r13
            r20 = r0
            android.util.Pair r0 = r16.A07(r17, r18, r19, r20)
            java.lang.Object r8 = r0.first
            long r0 = X.AnonymousClass6C8.A0R(r0)
            r4 = -1
            r18 = 0
            r20 = 1
            goto L_0x0185
        L_0x0170:
            long r11 = r12.A01
            int r14 = (r11 > r30 ? 1 : (r11 == r30 ? 0 : -1))
            if (r14 != 0) goto L_0x0189
            java.lang.Object r4 = r4.first
            int r4 = X.C153417bH.A00(r6, r3, r4)
            r20 = 0
        L_0x017e:
            int r12 = r7.A00
            r11 = 4
            if (r12 == r11) goto L_0x0185
            r18 = 0
        L_0x0185:
            r19 = 0
            goto L_0x0092
        L_0x0189:
            java.lang.Object r8 = r4.first
            long r0 = X.AnonymousClass6C8.A0R(r4)
            r20 = 1
            r4 = -1
            goto L_0x017e
        L_0x0193:
            long r0 = r7.A0G
            goto L_0x006c
        L_0x0197:
            boolean r0 = r11.A03     // Catch:{ all -> 0x02dd }
            if (r0 == 0) goto L_0x01a8
            X.7oF r0 = r2.A07     // Catch:{ all -> 0x02dd }
            int r0 = r0.A00     // Catch:{ all -> 0x02dd }
            if (r0 == r5) goto L_0x01a5
            r0 = 4
            r2.A0H(r0)     // Catch:{ all -> 0x02dd }
        L_0x01a5:
            r2.A0T(r8, r8, r8, r5)     // Catch:{ all -> 0x02dd }
        L_0x01a8:
            if (r21 != 0) goto L_0x0256
            long r0 = r2.A03     // Catch:{ all -> 0x02dd }
            r23 = r0
            X.7b3 r10 = r9.A06     // Catch:{ all -> 0x02dd }
            if (r10 != 0) goto L_0x01b5
            r4 = 0
            goto L_0x01ef
        L_0x01b5:
            long r4 = r10.A00     // Catch:{ all -> 0x02dd }
            boolean r0 = r10.A07     // Catch:{ all -> 0x02dd }
            if (r0 == 0) goto L_0x01ef
            r7 = 0
        L_0x01bc:
            X.8xU[] r6 = r2.A0a     // Catch:{ all -> 0x02dd }
            int r0 = r6.length     // Catch:{ all -> 0x02dd }
            if (r7 >= r0) goto L_0x01ef
            r0 = r6[r7]     // Catch:{ all -> 0x02dd }
            X.861 r0 = (X.AnonymousClass861) r0     // Catch:{ all -> 0x02dd }
            int r0 = r0.A01     // Catch:{ all -> 0x02dd }
            boolean r0 = X.AnonymousClass000.A1S(r0)     // Catch:{ all -> 0x02dd }
            if (r0 == 0) goto L_0x01ea
            r0 = r6[r7]     // Catch:{ all -> 0x02dd }
            X.861 r0 = (X.AnonymousClass861) r0     // Catch:{ all -> 0x02dd }
            X.8tU r1 = r0.A05     // Catch:{ all -> 0x02dd }
            X.8tU[] r0 = r10.A0D     // Catch:{ all -> 0x02dd }
            r0 = r0[r7]     // Catch:{ all -> 0x02dd }
            if (r1 != r0) goto L_0x01ea
            r0 = r6[r7]     // Catch:{ all -> 0x02dd }
            X.861 r0 = (X.AnonymousClass861) r0     // Catch:{ all -> 0x02dd }
            long r0 = r0.A02     // Catch:{ all -> 0x02dd }
            r12 = -9223372036854775808
            int r6 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r6 != 0) goto L_0x01e6
            goto L_0x01ed
        L_0x01e6:
            long r4 = java.lang.Math.max(r0, r4)     // Catch:{ all -> 0x02dd }
        L_0x01ea:
            int r7 = r7 + 1
            goto L_0x01bc
        L_0x01ed:
            r4 = -9223372036854775808
        L_0x01ef:
            X.7b3 r10 = r9.A05     // Catch:{ all -> 0x02dd }
            r7 = 0
        L_0x01f2:
            if (r10 == 0) goto L_0x028a
            X.7aa r6 = r10.A02     // Catch:{ all -> 0x02dd }
            if (r7 != 0) goto L_0x020d
            X.7aa r12 = r9.A02(r6, r3)     // Catch:{ all -> 0x02dd }
        L_0x01fc:
            long r0 = r6.A02     // Catch:{ all -> 0x02dd }
            X.7aa r0 = r12.A00(r0)     // Catch:{ all -> 0x02dd }
            r10.A02 = r0     // Catch:{ all -> 0x02dd }
            long r6 = r6.A00     // Catch:{ all -> 0x02dd }
            long r0 = r12.A00     // Catch:{ all -> 0x02dd }
            int r12 = (r6 > r28 ? 1 : (r6 == r28 ? 0 : -1))
            if (r12 == 0) goto L_0x0236
            goto L_0x0228
        L_0x020d:
            r0 = r23
            X.7aa r12 = r9.A01(r7, r3, r0)     // Catch:{ all -> 0x02dd }
            if (r12 == 0) goto L_0x02d1
            long r13 = r6.A03     // Catch:{ all -> 0x02dd }
            long r0 = r12.A03     // Catch:{ all -> 0x02dd }
            int r17 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r17 != 0) goto L_0x02d1
            X.6PS r1 = r6.A04     // Catch:{ all -> 0x02dd }
            X.6PS r0 = r12.A04     // Catch:{ all -> 0x02dd }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x02dd }
            if (r0 == 0) goto L_0x02d1
            goto L_0x01fc
        L_0x0228:
            int r12 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r12 == 0) goto L_0x0236
            int r6 = (r0 > r28 ? 1 : (r0 == r28 ? 0 : -1))
            if (r6 != 0) goto L_0x023b
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x023e
        L_0x0236:
            X.7b3 r0 = r10.A01     // Catch:{ all -> 0x02dd }
            r7 = r10
            r10 = r0
            goto L_0x01f2
        L_0x023b:
            long r6 = r10.A00     // Catch:{ all -> 0x02dd }
            long r0 = r0 + r6
        L_0x023e:
            X.7b3 r6 = r9.A06     // Catch:{ all -> 0x02dd }
            if (r10 != r6) goto L_0x024e
            r12 = -9223372036854775808
            int r6 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r6 == 0) goto L_0x024c
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 < 0) goto L_0x024e
        L_0x024c:
            r1 = 1
            goto L_0x024f
        L_0x024e:
            r1 = 0
        L_0x024f:
            boolean r0 = r9.A08(r10)     // Catch:{ all -> 0x02dd }
            if (r0 != 0) goto L_0x02d9
            goto L_0x0288
        L_0x0256:
            if (r22 != 0) goto L_0x028a
            X.7b3 r5 = r9.A05     // Catch:{ all -> 0x02dd }
        L_0x025a:
            if (r5 == 0) goto L_0x0273
            X.7aa r0 = r5.A02     // Catch:{ all -> 0x02dd }
            X.6PS r1 = r0.A04     // Catch:{ all -> 0x02dd }
            r0 = r26
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x02dd }
            if (r0 == 0) goto L_0x0270
            X.7aa r0 = r5.A02     // Catch:{ all -> 0x02dd }
            X.7aa r0 = r9.A02(r0, r3)     // Catch:{ all -> 0x02dd }
            r5.A02 = r0     // Catch:{ all -> 0x02dd }
        L_0x0270:
            X.7b3 r5 = r5.A01     // Catch:{ all -> 0x02dd }
            goto L_0x025a
        L_0x0273:
            X.7b3 r1 = r9.A05     // Catch:{ all -> 0x02dd }
            X.7b3 r0 = r9.A06     // Catch:{ all -> 0x02dd }
            boolean r34 = X.C18300x5.A1W(r1, r0)
            r30 = r2
            r31 = r26
            r32 = r15
            r35 = r4
            long r15 = r30.A07(r31, r32, r34, r35)     // Catch:{ all -> 0x02dd }
            goto L_0x028a
        L_0x0288:
            if (r1 != 0) goto L_0x02d9
        L_0x028a:
            X.7oF r0 = r2.A07
            com.google.android.exoplayer2.Timeline r4 = r0.A05
            X.6PS r1 = r0.A07
            boolean r0 = r11.A05
            if (r0 == 0) goto L_0x0296
            r28 = r15
        L_0x0296:
            r23 = r2
            r24 = r3
            r25 = r4
            r27 = r1
            r23.A0O(r24, r25, r26, r27, r28)
            if (r21 != 0) goto L_0x02ab
            X.7oF r1 = r2.A07
            long r4 = r1.A02
            int r0 = (r18 > r4 ? 1 : (r18 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x02b7
        L_0x02ab:
            r9 = r2
            r10 = r26
            r11 = r15
            r13 = r18
            X.7oF r1 = r9.A09(r10, r11, r13)
            r2.A07 = r1
        L_0x02b7:
            r2.A0C()
            com.google.android.exoplayer2.Timeline r0 = r1.A05
            r2.A0N(r3, r0)
            X.7oF r0 = r2.A07
            X.7oF r0 = r0.A05(r3)
            r2.A07 = r0
            if (r22 != 0) goto L_0x02cd
            r0 = r20
            r2.A06 = r0
        L_0x02cd:
            r2.A0Q(r8)
            return
        L_0x02d1:
            boolean r0 = r9.A08(r7)     // Catch:{ all -> 0x02dd }
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x028a
        L_0x02d9:
            r2.A0R(r8)     // Catch:{ all -> 0x02dd }
            goto L_0x028a
        L_0x02dd:
            r6 = move-exception
            X.7oF r0 = r2.A07
            com.google.android.exoplayer2.Timeline r4 = r0.A05
            X.6PS r1 = r0.A07
            boolean r0 = r11.A05
            if (r0 == 0) goto L_0x02ea
            r28 = r15
        L_0x02ea:
            r23 = r2
            r24 = r3
            r25 = r4
            r27 = r1
            r23.A0O(r24, r25, r26, r27, r28)
            if (r21 != 0) goto L_0x02ff
            X.7oF r1 = r2.A07
            long r4 = r1.A02
            int r0 = (r18 > r4 ? 1 : (r18 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x030b
        L_0x02ff:
            r9 = r2
            r10 = r26
            r11 = r15
            r13 = r18
            X.7oF r1 = r9.A09(r10, r11, r13)
            r2.A07 = r1
        L_0x030b:
            r2.A0C()
            com.google.android.exoplayer2.Timeline r0 = r1.A05
            r2.A0N(r3, r0)
            X.7oF r0 = r2.A07
            X.7oF r0 = r0.A05(r3)
            r2.A07 = r0
            if (r22 != 0) goto L_0x0321
            r0 = r20
            r2.A06 = r0
        L_0x0321:
            r2.A0Q(r8)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1689687l.A0M(com.google.android.exoplayer2.Timeline):void");
    }

    public final void A0P(AnonymousClass7MD r9) {
        C177988gm r4 = this.A0P;
        C187588xU[] r6 = this.A0a;
        C187638xZ[] r7 = r9.A03;
        C1685185s r42 = (C1685185s) r4;
        int i = 0;
        for (int i2 = 0; i2 < r6.length; i2++) {
            if (r7[i2] != null) {
                int i3 = ((AnonymousClass861) r6[i2]).A09;
                int i4 = 13107200;
                if (i3 != 1) {
                    i4 = 131072000;
                    if (i3 != 2) {
                        if (i3 == 3 || i3 == 5 || i3 == 6) {
                            i4 = AnonymousClass35S.A0F;
                        } else {
                            throw AnonymousClass6CA.A0N();
                        }
                    }
                }
                i += i4;
            }
        }
        int max = Math.max(13107200, i);
        r42.A00 = max;
        r42.A07.A00(max);
    }

    public final void A0Q(boolean z) {
        AnonymousClass6PS r1;
        long A002;
        C153327b3 r4 = this.A0Q.A04;
        if (r4 == null) {
            r1 = this.A07.A07;
        } else {
            r1 = r4.A02.A04;
        }
        boolean z2 = !this.A07.A06.equals(r1);
        if (z2) {
            this.A07 = this.A07.A06(r1);
        }
        C160747oF r2 = this.A07;
        if (r4 == null) {
            A002 = r2.A0G;
        } else {
            A002 = r4.A00();
        }
        r2.A0F = A002;
        this.A07.A0H = A05();
        if ((z2 || z) && r4 != null && r4.A07) {
            A0P(r4.A04);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0116  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0T(boolean r38, boolean r39, boolean r40, boolean r41) {
        /*
            r37 = this;
            r7 = r37
            X.8hJ r0 = r7.A0Y
            X.88l r0 = (X.C1692188l) r0
            r1 = 2
            android.os.Handler r0 = r0.A00
            r0.removeMessages(r1)
            r4 = 0
            r7.A0B = r4
            X.88r r0 = r7.A0M
            r0.A03 = r4
            X.88s r2 = r0.A05
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x0022
            long r0 = r2.BBa()
            r2.A00(r0)
            r2.A03 = r4
        L_0x0022:
            r0 = 0
            r7.A03 = r0
            X.8xU[] r6 = r7.A0a
            int r5 = r6.length
            r2 = 0
        L_0x002a:
            java.lang.String r3 = "ExoPlayerImplInternal"
            if (r2 >= r5) goto L_0x003d
            r0 = r6[r2]
            r7.A0L(r0)     // Catch:{ 6zd | RuntimeException -> 0x0034 }
            goto L_0x003a
        L_0x0034:
            r1 = move-exception
            java.lang.String r0 = "Disable failed."
            X.C159307lc.A02(r3, r0, r1)
        L_0x003a:
            int r2 = r2 + 1
            goto L_0x002a
        L_0x003d:
            if (r38 == 0) goto L_0x0051
            r2 = 0
        L_0x0040:
            if (r2 >= r5) goto L_0x0051
            r0 = r6[r2]
            r0.reset()     // Catch:{ RuntimeException -> 0x0048 }
            goto L_0x004e
        L_0x0048:
            r1 = move-exception
            java.lang.String r0 = "Reset failed."
            X.C159307lc.A02(r3, r0, r1)
        L_0x004e:
            int r2 = r2 + 1
            goto L_0x0040
        L_0x0051:
            r7.A00 = r4
            X.7oF r0 = r7.A07
            X.6PS r9 = r0.A07
            long r2 = r0.A0G
            X.7oF r5 = r7.A07
            X.7bH r1 = r7.A0S
            X.7kK r0 = r7.A0T
            boolean r1 = A04(r5, r1, r0)
            X.7oF r0 = r7.A07
            if (r1 == 0) goto L_0x0123
            long r0 = r0.A02
        L_0x0069:
            r10 = 0
            if (r39 == 0) goto L_0x0120
            r7.A06 = r10
            X.7oF r0 = r7.A07
            com.google.android.exoplayer2.Timeline r0 = r0.A05
            android.util.Pair r0 = r7.A08(r0)
            java.lang.Object r9 = r0.first
            X.6PS r9 = (X.AnonymousClass6PS) r9
            long r2 = X.AnonymousClass6C8.A0R(r0)
            X.7oF r0 = r7.A07
            X.6PS r0 = r0.A07
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x011b
            r6 = 1
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x008e:
            X.7bp r5 = r7.A0Q
            r5.A06()
            r7.A0H = r4
            X.7oF r4 = r7.A07
            com.google.android.exoplayer2.Timeline r5 = r4.A05
            r36 = r5
            int r5 = r4.A00
            r18 = r5
            if (r41 == 0) goto L_0x0116
            r16 = r10
        L_0x00a3:
            r12 = 0
            if (r6 == 0) goto L_0x010f
            X.7yb r11 = X.C166387yb.A03
            X.7MD r8 = r7.A0V
            X.6aY r6 = X.C129586aY.of()
        L_0x00ae:
            boolean r15 = r4.A0D
            int r14 = r4.A01
            X.7k2 r13 = r4.A04
            r28 = 0
            boolean r5 = r7.A0C
            X.7oF r4 = new X.7oF
            r30 = r2
            r35 = r12
            r17 = r9
            r26 = r2
            r32 = r12
            r33 = r15
            r34 = r5
            r22 = r18
            r23 = r14
            r24 = r0
            r18 = r9
            r19 = r11
            r20 = r8
            r21 = r6
            r14 = r16
            r15 = r13
            r16 = r36
            r13 = r4
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r28, r30, r32, r33, r34, r35)
            r7.A07 = r4
            if (r40 == 0) goto L_0x0131
            X.7bR r6 = r7.A0R
            java.util.HashMap r5 = r6.A06
            java.util.Iterator r4 = X.C18290x4.A10(r5)
        L_0x00eb:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0127
            java.lang.Object r3 = r4.next()
            X.7JW r3 = (X.AnonymousClass7JW) r3
            X.8vI r1 = r3.A01     // Catch:{ RuntimeException -> 0x00ff }
            X.8lW r0 = r3.A00     // Catch:{ RuntimeException -> 0x00ff }
            r1.Biy(r0)     // Catch:{ RuntimeException -> 0x00ff }
            goto L_0x0107
        L_0x00ff:
            r2 = move-exception
            java.lang.String r1 = "MediaSourceList"
            java.lang.String r0 = "Failed to release child source."
            X.C159307lc.A02(r1, r0, r2)
        L_0x0107:
            X.8vI r1 = r3.A01
            X.4F1 r0 = r3.A02
            r1.BjA(r0)
            goto L_0x00eb
        L_0x010f:
            X.7yb r11 = r4.A08
            X.7MD r8 = r4.A09
            java.util.List r6 = r4.A0A
            goto L_0x00ae
        L_0x0116:
            X.6zd r5 = r4.A03
            r16 = r5
            goto L_0x00a3
        L_0x011b:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0120:
            r6 = 0
            goto L_0x008e
        L_0x0123:
            long r0 = r0.A0G
            goto L_0x0069
        L_0x0127:
            r5.clear()
            java.util.Set r0 = r6.A0A
            r0.clear()
            r6.A02 = r12
        L_0x0131:
            r7.A04 = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1689687l.A0T(boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006e, code lost:
        if (r10.A07.A00 != 3) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0075, code lost:
        if (r18 == false) goto L_0x0077;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0112 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0U(boolean[] r28) {
        /*
            r27 = this;
            r10 = r27
            X.7bp r9 = r10.A0Q
            X.7b3 r15 = r9.A06
            X.7MD r13 = r15.A04
            r8 = 0
            r1 = 0
        L_0x000a:
            X.8xU[] r7 = r10.A0a
            int r6 = r7.length
            if (r1 >= r6) goto L_0x001d
            X.7jC[] r0 = r13.A02
            r0 = r0[r1]
            if (r0 != 0) goto L_0x001a
            r0 = r7[r1]
            r0.reset()
        L_0x001a:
            int r1 = r1 + 1
            goto L_0x000a
        L_0x001d:
            if (r8 >= r6) goto L_0x0130
            X.7jC[] r0 = r13.A02
            r0 = r0[r8]
            if (r0 == 0) goto L_0x0112
            boolean r4 = r28[r8]
            r5 = r7[r8]
            r0 = r5
            X.861 r0 = (X.AnonymousClass861) r0
            int r0 = r0.A01
            boolean r0 = X.AnonymousClass000.A1S(r0)
            if (r0 != 0) goto L_0x0112
            X.7b3 r11 = r9.A06
            X.7b3 r0 = r9.A05
            boolean r20 = X.AnonymousClass000.A1Y(r11, r0)
            X.7MD r1 = r11.A04
            X.7jC[] r0 = r1.A02
            r19 = r0[r8]
            X.8xZ[] r0 = r1.A03
            r3 = r0[r8]
            r2 = 0
            if (r3 == 0) goto L_0x005f
            r0 = r3
            X.88R r0 = (X.AnonymousClass88R) r0
            int[] r0 = r0.A03
            int r1 = r0.length
        L_0x004f:
            X.7yp[] r12 = new X.C166527yp[r1]
        L_0x0051:
            if (r2 >= r1) goto L_0x0061
            r0 = r3
            X.88R r0 = (X.AnonymousClass88R) r0
            X.7yp[] r0 = r0.A04
            r0 = r0[r2]
            r12[r2] = r0
            int r2 = r2 + 1
            goto L_0x0051
        L_0x005f:
            r1 = 0
            goto L_0x004f
        L_0x0061:
            boolean r0 = r10.A0X()
            if (r0 == 0) goto L_0x0070
            X.7oF r0 = r10.A07
            int r1 = r0.A00
            r0 = 3
            r18 = 1
            if (r1 == r0) goto L_0x0072
        L_0x0070:
            r18 = 0
        L_0x0072:
            if (r4 != 0) goto L_0x0077
            r4 = 1
            if (r18 != 0) goto L_0x0078
        L_0x0077:
            r4 = 0
        L_0x0078:
            int r0 = r10.A00
            int r0 = r0 + 1
            r10.A00 = r0
            X.8tU[] r0 = r11.A0D
            r17 = r0[r8]
            long r0 = r10.A03
            r25 = r0
            X.7aa r0 = r11.A02
            long r2 = r0.A03
            long r0 = r11.A00
            long r2 = r2 + r0
            r11 = r5
            X.861 r11 = (X.AnonymousClass861) r11
            int r14 = r11.A01
            r16 = 1
            boolean r14 = X.AnonymousClass000.A1T(r14)
            X.C161487pm.A04(r14)
            r14 = r19
            r11.A04 = r14
            r14 = r16
            r11.A01 = r14
            r14 = r20
            r11.A0D(r4, r14)
            boolean r14 = r11.A06
            r14 = r14 ^ 1
            X.C161487pm.A04(r14)
            r14 = r17
            r11.A05 = r14
            r11.A02 = r0
            r11.A08 = r12
            r11.A03 = r0
            r19 = r11
            r20 = r12
            r21 = r2
            r23 = r0
            r19.A09(r20, r21, r23)
            r0 = r25
            r11.A0C(r0, r4)
            X.860 r1 = new X.860
            r1.<init>(r10)
            boolean r0 = r5 instanceof X.AnonymousClass6OE
            if (r0 != 0) goto L_0x00e5
            boolean r0 = r5 instanceof X.AnonymousClass6OI
            if (r0 != 0) goto L_0x00e5
            boolean r0 = r5 instanceof X.C126666Ov
            if (r0 != 0) goto L_0x00e5
            boolean r0 = r5 instanceof X.C126676Ow
            if (r0 == 0) goto L_0x00e5
            r0 = r5
            X.6Ow r0 = (X.C126676Ow) r0
            X.8gp r1 = (X.C178018gp) r1
            r0.A03 = r1
        L_0x00e5:
            X.88r r2 = r10.A0M
            boolean r0 = r5 instanceof X.AnonymousClass6OI
            if (r0 == 0) goto L_0x0116
            r1 = r5
            X.6OI r1 = (X.AnonymousClass6OI) r1
        L_0x00ee:
            if (r1 == 0) goto L_0x0101
            X.8sm r0 = r2.A01
            if (r1 == r0) goto L_0x0101
            if (r0 != 0) goto L_0x011e
            r2.A01 = r1
            r2.A00 = r5
            X.88s r0 = r2.A05
            X.7k2 r0 = r0.A02
            r1.Bmy(r0)
        L_0x0101:
            if (r18 == 0) goto L_0x0112
            int r0 = r11.A01
            boolean r0 = X.AnonymousClass6C9.A1M(r0)
            X.C161487pm.A04(r0)
            r0 = 2
            r11.A01 = r0
            r11.A07()
        L_0x0112:
            int r8 = r8 + 1
            goto L_0x001d
        L_0x0116:
            boolean r0 = r5 instanceof X.C126676Ow
            if (r0 == 0) goto L_0x0101
            r1 = r5
            X.6Ow r1 = (X.C126676Ow) r1
            goto L_0x00ee
        L_0x011e:
            java.lang.String r0 = "Multiple renderer media clocks enabled."
            java.lang.IllegalStateException r3 = X.AnonymousClass001.A0e(r0)
            r4 = 2
            r1 = 0
            r5 = -1
            r6 = 4
            r7 = 0
            X.6zd r0 = new X.6zd
            r2 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            throw r0
        L_0x0130:
            r0 = 1
            r15.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1689687l.A0U(boolean[]):void");
    }

    public final boolean A0V() {
        C153327b3 r1 = this.A0Q.A04;
        if (r1 == null || (r1.A07 && r1.A09.BA0() == Long.MIN_VALUE)) {
            return false;
        }
        return true;
    }

    public final boolean A0W() {
        C153327b3 r1 = this.A0Q.A05;
        long j = r1.A02.A00;
        if (!r1.A07) {
            return false;
        }
        if (j == -9223372036854775807L || this.A07.A0G < j || !A0X()) {
            return true;
        }
        return false;
    }

    public final boolean A0X() {
        C160747oF r1 = this.A07;
        if (!r1.A0D || r1.A01 != 0) {
            return false;
        }
        return true;
    }

    public final boolean A0Y(Timeline timeline, AnonymousClass6PS r8) {
        if (AnonymousClass001.A1X(r8.A00, -1) || AnonymousClass000.A1T(timeline.A01())) {
            return false;
        }
        int A002 = C153417bH.A00(this.A0S, timeline, r8.A04);
        C158647kK r3 = this.A0T;
        timeline.A0B(r3, A002, 0);
        boolean z = r3.A0B;
        C151387Uo r1 = r3.A06;
        C161487pm.A04(AnonymousClass000.A1U(z ? 1 : 0, AnonymousClass000.A1W(r1) ? 1 : 0));
        if (r1 == null || !r3.A0A || r3.A05 == -9223372036854775807L) {
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ void BQ8(C185348tV r3) {
        C18290x4.A1C(((C1692188l) this.A0Y).A00, r3, 9);
    }

    public void BYn(C187628xY r3) {
        C18290x4.A1C(((C1692188l) this.A0Y).A00, r3, 8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.lang.IllegalStateException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v137, resolved type: X.6zd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v140, resolved type: java.lang.IllegalStateException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v141, resolved type: java.lang.IllegalStateException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v142, resolved type: java.lang.IllegalStateException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v143, resolved type: java.lang.IllegalStateException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v144, resolved type: java.lang.IllegalStateException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v145, resolved type: java.lang.IllegalStateException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v146, resolved type: java.lang.NullPointerException} */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0649 A[Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }] */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x0656 A[Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }] */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x0669 A[Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }] */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x06df A[Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }] */
    /* JADX WARNING: Removed duplicated region for block: B:519:0x09bf A[Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }] */
    /* JADX WARNING: Removed duplicated region for block: B:526:0x09e2 A[Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }] */
    /* JADX WARNING: Removed duplicated region for block: B:528:0x09eb A[Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }] */
    /* JADX WARNING: Removed duplicated region for block: B:529:0x09ee A[Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }] */
    /* JADX WARNING: Removed duplicated region for block: B:532:0x09f9 A[Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }] */
    /* JADX WARNING: Removed duplicated region for block: B:666:0x07ec A[SYNTHETIC] */
    public boolean handleMessage(android.os.Message r43) {
        /*
            r42 = this;
            r0 = r42
            java.lang.String r16 = "Playback error"
            java.lang.String r17 = "ExoPlayerImplInternal"
            r2 = 0
            r1 = 1
            r5 = r43
            int r3 = r5.what     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            switch(r3) {
                case 0: goto L_0x0b71;
                case 1: goto L_0x0421;
                case 2: goto L_0x055f;
                case 3: goto L_0x02cd;
                case 4: goto L_0x02b9;
                case 5: goto L_0x02b1;
                case 6: goto L_0x02ac;
                case 7: goto L_0x0533;
                case 8: goto L_0x0220;
                case 9: goto L_0x0207;
                case 10: goto L_0x0439;
                case 11: goto L_0x01ed;
                case 12: goto L_0x01d6;
                case 13: goto L_0x019b;
                case 14: goto L_0x0170;
                case 15: goto L_0x013b;
                case 16: goto L_0x0130;
                case 17: goto L_0x00f4;
                case 18: goto L_0x00d1;
                case 19: goto L_0x0010;
                case 20: goto L_0x00a3;
                case 21: goto L_0x001d;
                case 22: goto L_0x042e;
                case 23: goto L_0x008a;
                case 24: goto L_0x0063;
                case 25: goto L_0x0047;
                default: goto L_0x000f;
            }     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
        L_0x000f:
            return r2
        L_0x0010:
            X.7X4 r3 = r0.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3.A00(r1)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            java.lang.String r3 = "fromIndex"
            java.lang.NullPointerException r5 = X.AnonymousClass001.A0g(r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x0b65
        L_0x001d:
            java.lang.Object r6 = r5.obj     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.8ul r6 = (X.C186108ul) r6     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7X4 r3 = r0.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3.A00(r1)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7bR r5 = r0.A0R     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            java.util.List r3 = r5.A08     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r4 = r3.size()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r3 = r6.getLength()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == r4) goto L_0x003c
            X.8ul r3 = r6.Ayx()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.8ul r6 = r3.Ayz(r2, r4)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
        L_0x003c:
            r5.A00 = r6     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            com.google.android.exoplayer2.Timeline r3 = r5.A00()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r0.A0M(r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x0bc7
        L_0x0047:
            java.lang.Object r5 = r5.obj     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.6zd r5 = (X.C143886zd) r5     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r3 = r5.isRecoverable     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x0054
            int r4 = r5.type     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = 1
            if (r4 == r1) goto L_0x0055
        L_0x0054:
            r3 = 0
        L_0x0055:
            X.C161487pm.A03(r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r0.A0R(r1)     // Catch:{ Exception -> 0x005d }
            goto L_0x0bc7
        L_0x005d:
            r3 = move-exception
            r5.addSuppressed(r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x0b65
        L_0x0063:
            int r3 = r5.arg1     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r6 = X.AnonymousClass000.A1U(r3, r1)
            boolean r3 = r0.A0C     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r6 == r3) goto L_0x0bc7
            r0.A0C = r6     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7oF r5 = r0.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r4 = r5.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r6 != 0) goto L_0x0082
            r3 = 4
            if (r4 == r3) goto L_0x0082
            if (r4 == r1) goto L_0x0082
            X.8hJ r4 = r0.A0Y     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = 2
            X.C1692188l.A00(r4, r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x0bc7
        L_0x0082:
            X.7oF r3 = r5.A08(r6)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r0.A07 = r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x0bc7
        L_0x008a:
            int r3 = r5.arg1     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r3 = X.AnonymousClass000.A1S(r3)
            r0.A0D = r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r0.A0C()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r3 = r0.A0E     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x0bc7
            X.7bp r3 = r0.A0Q     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7b3 r4 = r3.A06     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7b3 r3 = r3.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r4 == r3) goto L_0x0bc7
            goto L_0x01ff
        L_0x00a3:
            int r8 = r5.arg1     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r7 = r5.arg2     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            java.lang.Object r6 = r5.obj     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.8ul r6 = (X.C186108ul) r6     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7X4 r3 = r0.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3.A00(r1)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7bR r5 = r0.A0R     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r8 < 0) goto L_0x00bf
            if (r8 > r7) goto L_0x00bf
            java.util.List r3 = r5.A08     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r4 = r3.size()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = 1
            if (r7 <= r4) goto L_0x00c0
        L_0x00bf:
            r3 = 0
        L_0x00c0:
            X.C161487pm.A03(r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r5.A00 = r6     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r5.A03(r8, r7)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            com.google.android.exoplayer2.Timeline r3 = r5.A00()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r0.A0M(r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x0bc7
        L_0x00d1:
            java.lang.Object r7 = r5.obj     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7M2 r7 = (X.AnonymousClass7M2) r7     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r6 = r5.arg1     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7X4 r3 = r0.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3.A00(r1)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7bR r5 = r0.A0R     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = -1
            if (r6 != r3) goto L_0x00e7
            java.util.List r3 = r5.A08     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r6 = r3.size()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
        L_0x00e7:
            java.util.List r4 = r7.A03     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.8ul r3 = r7.A02     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            com.google.android.exoplayer2.Timeline r3 = r5.A01(r3, r4, r6)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r0.A0M(r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x0bc7
        L_0x00f4:
            java.lang.Object r8 = r5.obj     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7M2 r8 = (X.AnonymousClass7M2) r8     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7X4 r3 = r0.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3.A00(r1)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r7 = r8.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = -1
            if (r7 == r3) goto L_0x0114
            java.util.List r4 = r8.A03     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.8ul r3 = r8.A02     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.6OB r6 = new X.6OB     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r6.<init>(r3, r4)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r3 = r8.A01     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7JV r5 = new X.7JV     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r5.<init>(r6, r7, r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r0.A06 = r5     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
        L_0x0114:
            X.7bR r7 = r0.A0R     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            java.util.List r6 = r8.A03     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.8ul r5 = r8.A02     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            java.util.List r4 = r7.A08     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r3 = r4.size()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r7.A03(r2, r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r3 = r4.size()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            com.google.android.exoplayer2.Timeline r3 = r7.A01(r5, r6, r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r0.A0M(r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x0bc7
        L_0x0130:
            java.lang.Object r4 = r5.obj     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7k2 r4 = (X.C158477k2) r4     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            float r3 = r4.A01     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r0.A0K(r4, r3, r1, r2)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x0bc7
        L_0x013b:
            java.lang.Object r6 = r5.obj     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7XC r6 = (X.AnonymousClass7XC) r6     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            android.os.Looper r5 = r6.A01     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            java.lang.Thread r3 = r5.getThread()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r3 = r3.isAlive()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 != 0) goto L_0x0157
            java.lang.String r4 = "TAG"
            java.lang.String r3 = "Trying to send message on a dead thread."
            android.util.Log.w(r4, r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r6.A01(r2)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x0bc7
        L_0x0157:
            r4 = 0
            android.os.Handler r3 = new android.os.Handler     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3.<init>(r5, r4)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.88l r5 = new X.88l     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r5.<init>(r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = 25
            X.8MF r4 = new X.8MF     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r4.<init>(r0, r3, r6)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            android.os.Handler r3 = r5.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3.post(r4)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x0bc7
        L_0x0170:
            java.lang.Object r5 = r5.obj     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7XC r5 = (X.AnonymousClass7XC) r5     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            android.os.Looper r4 = r5.A01     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            android.os.Looper r3 = r0.A0L     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r4 != r3) goto L_0x018e
            A02(r5)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7oF r3 = r0.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r5 = r3.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = 3
            r4 = 2
            if (r5 == r3) goto L_0x0187
            if (r5 != r4) goto L_0x0bc7
        L_0x0187:
            X.8hJ r3 = r0.A0Y     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.C1692188l.A00(r3, r4)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x0bc7
        L_0x018e:
            X.8hJ r3 = r0.A0Y     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r4 = 15
            X.88l r3 = (X.C1692188l) r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            android.os.Handler r3 = r3.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.C18290x4.A1C(r3, r5, r4)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x0bc7
        L_0x019b:
            int r3 = r5.arg1     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r4 = X.AnonymousClass000.A1S(r3)
            java.lang.Object r8 = r5.obj     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            java.util.concurrent.atomic.AtomicBoolean r8 = (java.util.concurrent.atomic.AtomicBoolean) r8     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r3 = r0.A0A     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == r4) goto L_0x01c6
            r0.A0A = r4     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r4 != 0) goto L_0x01c6
            X.8xU[] r7 = r0.A0a     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r6 = r7.length     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r5 = 0
        L_0x01b1:
            if (r5 >= r6) goto L_0x01c6
            r4 = r7[r5]     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = r4
            X.861 r3 = (X.AnonymousClass861) r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r3 = r3.A01     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r3 = X.AnonymousClass000.A1S(r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 != 0) goto L_0x01c3
            r4.reset()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
        L_0x01c3:
            int r5 = r5 + 1
            goto L_0x01b1
        L_0x01c6:
            if (r8 == 0) goto L_0x0bc7
            monitor-enter(r0)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r8.set(r1)     // Catch:{ all -> 0x01d2 }
            r0.notifyAll()     // Catch:{ all -> 0x01d2 }
            monitor-exit(r0)     // Catch:{ all -> 0x01d2 }
            goto L_0x0bc7
        L_0x01d2:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01d2 }
            goto L_0x0b65
        L_0x01d6:
            int r3 = r5.arg1     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r5 = X.AnonymousClass000.A1S(r3)
            r0.A0I = r5     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7bp r4 = r0.A0Q     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7oF r3 = r0.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            com.google.android.exoplayer2.Timeline r3 = r3.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r4.A08 = r5     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r3 = r4.A09(r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 != 0) goto L_0x0202
            goto L_0x01ff
        L_0x01ed:
            int r5 = r5.arg1     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r0.A02 = r5     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7bp r4 = r0.A0Q     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7oF r3 = r0.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            com.google.android.exoplayer2.Timeline r3 = r3.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r4.A01 = r5     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r3 = r4.A09(r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 != 0) goto L_0x0202
        L_0x01ff:
            r0.A0R(r1)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
        L_0x0202:
            r0.A0Q(r2)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x0bc7
        L_0x0207:
            java.lang.Object r5 = r5.obj     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.8xY r5 = (X.C187628xY) r5     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7bp r3 = r0.A0Q     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7b3 r4 = r3.A04     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r4 == 0) goto L_0x0bc7
            X.8xY r3 = r4.A09     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 != r5) goto L_0x0bc7
            X.7b3 r3 = r4.A01     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r3 = X.AnonymousClass000.A1X(r3)
            X.C161487pm.A04(r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x02a7
        L_0x0220:
            java.lang.Object r4 = r5.obj     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.8xY r4 = (X.C187628xY) r4     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7bp r10 = r0.A0Q     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7b3 r9 = r10.A04     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r9 == 0) goto L_0x0bc7
            X.8xY r3 = r9.A09     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 != r4) goto L_0x0bc7
            X.88r r3 = r0.A0M     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3.BBR()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r9.A07 = r1     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.8xY r3 = r9.A09     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7yb r3 = r3.BDt()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r9.A03 = r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7MD r19 = r9.A02()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7aa r3 = r9.A02     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r5 = r3.A03     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r3 = r3.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r7 == 0) goto L_0x025a
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 < 0) goto L_0x025a
            r5 = 1
            long r5 = X.AnonymousClass6C8.A0Q(r3, r5)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
        L_0x025a:
            X.8sf[] r3 = r9.A0C     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r3 = r3.length     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean[] r3 = new boolean[r3]     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r18 = r9
            r20 = r3
            r21 = r5
            r23 = r2
            long r5 = r18.A01(r19, r20, r21, r23)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r7 = r9.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7aa r11 = r9.A02     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r3 = r11.A03     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r3 = r3 - r5
            long r7 = r7 + r3
            r9.A00 = r7     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7aa r3 = r11.A01(r5)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r9.A02 = r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7MD r3 = r9.A04     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r0.A0P(r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7b3 r3 = r10.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r9 != r3) goto L_0x02a7
            X.7aa r3 = r9.A02     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r3 = r3.A03     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r0.A0J(r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.8xU[] r3 = r0.A0a     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r3 = r3.length     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean[] r3 = new boolean[r3]     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r0.A0U(r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7oF r4 = r0.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.6PS r7 = r4.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7aa r3 = r9.A02     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r5 = r3.A03     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r3 = r4.A02     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r8 = r0
            r9 = r7
            r10 = r5
            r12 = r3
            X.7oF r3 = r8.A09(r9, r10, r12)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r0.A07 = r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
        L_0x02a7:
            r0.A0A()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x0bc7
        L_0x02ac:
            r0.A0S(r2, r1)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x0bc7
        L_0x02b1:
            java.lang.Object r3 = r5.obj     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7jJ r3 = (X.C158027jJ) r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r0.A08 = r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x0bc7
        L_0x02b9:
            java.lang.Object r4 = r5.obj     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7k2 r4 = (X.C158477k2) r4     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.88r r3 = r0.A0M     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3.Bmy(r4)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7k2 r4 = r3.BBR()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            float r3 = r4.A01     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r0.A0K(r4, r3, r1, r1)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x0bc7
        L_0x02cd:
            java.lang.Object r11 = r5.obj     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7JV r11 = (X.AnonymousClass7JV) r11     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7X4 r3 = r0.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r18 = 1
            r3.A00(r1)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7oF r3 = r0.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            com.google.android.exoplayer2.Timeline r6 = r3.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r5 = r0.A02     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r4 = r0.A0I     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7kK r3 = r0.A0T     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7bH r12 = r0.A0S     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r15 = 1
            r7 = r6
            r8 = r5
            r9 = r4
            r4 = r11
            r5 = r12
            r6 = r3
            android.util.Pair r10 = A00(r4, r5, r6, r7, r8, r9)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r10 != 0) goto L_0x031c
            X.7oF r3 = r0.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            com.google.android.exoplayer2.Timeline r3 = r3.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            android.util.Pair r3 = r0.A08(r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            java.lang.Object r7 = r3.first     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.6PS r7 = (X.AnonymousClass6PS) r7     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            java.lang.Object r3 = r3.second     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r3 = X.C18320x8.A05(r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7oF r5 = r0.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            com.google.android.exoplayer2.Timeline r5 = r5.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r5 = r5.A01()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r5 = X.AnonymousClass000.A1T(r5)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r15 = r5 ^ 1
            r24 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0356
        L_0x031c:
            java.lang.Object r9 = r10.first     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            java.lang.Object r3 = r10.second     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r3 = X.C18320x8.A05(r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r5 = r11.A01     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r7 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r7 != 0) goto L_0x0330
            r24 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0332
        L_0x0330:
            r24 = r3
        L_0x0332:
            X.7bp r8 = r0.A0Q     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7oF r7 = r0.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            com.google.android.exoplayer2.Timeline r7 = r7.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.6PS r7 = r8.A05(r7, r9, r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r9 = r7.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r8 = -1
            boolean r8 = X.AnonymousClass001.A1X(r9, r8)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r8 == 0) goto L_0x0351
            X.7oF r3 = r0.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            com.google.android.exoplayer2.Timeline r4 = r3.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            java.lang.Object r3 = r7.A04     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r4.A0A(r12, r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = 0
            goto L_0x0356
        L_0x0351:
            int r8 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r8 == 0) goto L_0x0356
            r15 = 0
        L_0x0356:
            r8 = 2
            X.7oF r9 = r0.A07     // Catch:{ all -> 0x040a }
            com.google.android.exoplayer2.Timeline r5 = r9.A05     // Catch:{ all -> 0x040a }
            int r5 = r5.A01()     // Catch:{ all -> 0x040a }
            boolean r5 = X.AnonymousClass000.A1T(r5)     // Catch:{ all -> 0x040a }
            if (r5 == 0) goto L_0x0368
            r0.A06 = r11     // Catch:{ all -> 0x040a }
            goto L_0x0375
        L_0x0368:
            r6 = 4
            if (r10 != 0) goto L_0x0377
            int r5 = r9.A00     // Catch:{ all -> 0x040a }
            if (r5 == r1) goto L_0x0372
            r0.A0H(r6)     // Catch:{ all -> 0x040a }
        L_0x0372:
            r0.A0T(r2, r1, r2, r1)     // Catch:{ all -> 0x040a }
        L_0x0375:
            r5 = r3
            goto L_0x03f1
        L_0x0377:
            X.6PS r5 = r9.A07     // Catch:{ all -> 0x040a }
            boolean r5 = r7.equals(r5)     // Catch:{ all -> 0x040a }
            if (r5 == 0) goto L_0x03b7
            X.7bp r5 = r0.A0Q     // Catch:{ all -> 0x040a }
            X.7b3 r6 = r5.A05     // Catch:{ all -> 0x040a }
            if (r6 == 0) goto L_0x0390
            boolean r5 = r6.A07     // Catch:{ all -> 0x040a }
            if (r5 == 0) goto L_0x0390
            r9 = 0
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x0390
            goto L_0x0393
        L_0x0390:
            r28 = r3
            goto L_0x039b
        L_0x0393:
            X.8xY r6 = r6.A09     // Catch:{ all -> 0x040a }
            X.7jJ r5 = r0.A08     // Catch:{ all -> 0x040a }
            long r28 = r6.B4G(r5, r3)     // Catch:{ all -> 0x040a }
        L_0x039b:
            long r11 = X.C161207pD.A01(r28)     // Catch:{ all -> 0x040a }
            X.7oF r5 = r0.A07     // Catch:{ all -> 0x040a }
            long r5 = r5.A0G     // Catch:{ all -> 0x040a }
            long r9 = X.C161207pD.A01(r5)     // Catch:{ all -> 0x040a }
            int r5 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x03b9
            X.7oF r9 = r0.A07     // Catch:{ all -> 0x040a }
            int r6 = r9.A00     // Catch:{ all -> 0x040a }
            if (r6 == r8) goto L_0x03b4
            r5 = 3
            if (r6 != r5) goto L_0x03b9
        L_0x03b4:
            long r5 = r9.A0G     // Catch:{ all -> 0x040a }
            goto L_0x03f1
        L_0x03b7:
            r28 = r3
        L_0x03b9:
            X.7oF r5 = r0.A07     // Catch:{ all -> 0x040a }
            int r6 = r5.A00     // Catch:{ all -> 0x040a }
            r5 = 4
            boolean r31 = X.AnonymousClass000.A1U(r6, r5)
            X.7bp r5 = r0.A0Q     // Catch:{ all -> 0x040a }
            X.7b3 r6 = r5.A05     // Catch:{ all -> 0x040a }
            X.7b3 r5 = r5.A06     // Catch:{ all -> 0x040a }
            boolean r30 = X.C18300x5.A1W(r6, r5)
            r26 = r0
            r27 = r7
            long r5 = r26.A07(r27, r28, r30, r31)     // Catch:{ all -> 0x040a }
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x03da
            r18 = 0
        L_0x03da:
            r18 = r18 | r15
            X.7oF r3 = r0.A07     // Catch:{ all -> 0x0405 }
            com.google.android.exoplayer2.Timeline r4 = r3.A05     // Catch:{ all -> 0x0405 }
            X.6PS r3 = r3.A07     // Catch:{ all -> 0x0405 }
            r21 = r4
            r19 = r0
            r20 = r4
            r22 = r7
            r23 = r3
            r19.A0O(r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0405 }
            r15 = r18
        L_0x03f1:
            r9 = r0
            r10 = r7
            r11 = r5
            r13 = r24
            X.7oF r3 = r9.A09(r10, r11, r13)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r0.A07 = r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r15 == 0) goto L_0x0bc7
            X.7X4 r3 = r0.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3.A01(r8)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x0bc7
        L_0x0405:
            r9 = move-exception
            r15 = r18
            r3 = r5
            goto L_0x040b
        L_0x040a:
            r9 = move-exception
        L_0x040b:
            r18 = r0
            r19 = r7
            r20 = r3
            r22 = r24
            X.7oF r3 = r18.A09(r19, r20, r22)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r0.A07 = r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r15 == 0) goto L_0x0420
            X.7X4 r3 = r0.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3.A01(r8)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
        L_0x0420:
            throw r9     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
        L_0x0421:
            int r3 = r5.arg1     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r4 = X.AnonymousClass000.A1S(r3)
            int r3 = r5.arg2     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r0.A0I(r3, r1, r4, r1)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x0bc7
        L_0x042e:
            X.7bR r3 = r0.A0R     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            com.google.android.exoplayer2.Timeline r3 = r3.A00()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r0.A0M(r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x0bc7
        L_0x0439:
            X.88r r3 = r0.A0M     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3.BBR()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7bp r7 = r0.A0Q     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7b3 r11 = r7.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7b3 r12 = r7.A06     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r14 = 1
        L_0x0445:
            if (r11 == 0) goto L_0x0bc7
            boolean r3 = r11.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x0bc7
            X.7MD r10 = r11.A02()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7MD r9 = r11.A04     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.8xZ[] r8 = r9.A03     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r3 = r8.length     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.8xZ[] r6 = r10.A03     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r5 = r6.length     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 != r5) goto L_0x047d
            r4 = 0
        L_0x045a:
            if (r4 >= r5) goto L_0x0477
            X.7jC[] r3 = r10.A02     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r13 = r3[r4]     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7jC[] r3 = r9.A02     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = r3[r4]     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r3 = X.C162387ry.A0D(r13, r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x047d
            r13 = r6[r4]     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = r8[r4]     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r3 = X.C162387ry.A0D(r13, r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x047d
            int r4 = r4 + 1
            goto L_0x045a
        L_0x0477:
            if (r11 != r12) goto L_0x047a
            r14 = 0
        L_0x047a:
            X.7b3 r11 = r11.A01     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x0445
        L_0x047d:
            r12 = 0
            r9 = 4
            if (r14 == 0) goto L_0x04f4
            X.7b3 r11 = r7.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r23 = r7.A08(r11)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.8xU[] r8 = r0.A0a     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r7 = r8.length     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean[] r13 = new boolean[r7]     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7oF r3 = r0.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r3 = r3.A0G     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r21 = r3
            r18 = r11
            r19 = r10
            r20 = r13
            long r3 = r18.A01(r19, r20, r21, r23)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7oF r5 = r0.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.6PS r10 = r5.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r5 = r5.A02     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r18 = r0
            r19 = r10
            r20 = r3
            r22 = r5
            X.7oF r6 = r18.A09(r19, r20, r22)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r0.A07 = r6     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r5 = r6.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r5 == r9) goto L_0x04c2
            long r5 = r6.A0G     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 == 0) goto L_0x04c2
            X.7X4 r5 = r0.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r5.A01(r9)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r0.A0J(r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
        L_0x04c2:
            boolean[] r6 = new boolean[r7]     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
        L_0x04c4:
            if (r12 >= r7) goto L_0x0519
            r10 = r8[r12]     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = r10
            X.861 r3 = (X.AnonymousClass861) r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r3 = r3.A01     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r5 = X.AnonymousClass000.A1S(r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r6[r12] = r5     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.8tU[] r3 = r11.A0D     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r4 = r3[r12]     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r5 == 0) goto L_0x04f1
            r5 = r10
            X.861 r5 = (X.AnonymousClass861) r5     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.8tU r3 = r5.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r4 == r3) goto L_0x04e4
            r0.A0L(r10)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x04f1
        L_0x04e4:
            boolean r3 = r13[r12]     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x04f1
            long r3 = r0.A03     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r5.A06 = r2     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r5.A02 = r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r5.A0C(r3, r2)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
        L_0x04f1:
            int r12 = r12 + 1
            goto L_0x04c4
        L_0x04f4:
            r7.A08(r11)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r3 = r11.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x051c
            X.7aa r3 = r11.A02     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r5 = r3.A03     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r3 = r0.A03     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r7 = r11.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r3 = r3 - r7
            long r21 = java.lang.Math.max(r5, r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.8sf[] r3 = r11.A0C     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r3 = r3.length     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean[] r3 = new boolean[r3]     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r18 = r11
            r19 = r10
            r20 = r3
            r23 = r2
            r18.A01(r19, r20, r21, r23)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x051c
        L_0x0519:
            r0.A0U(r6)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
        L_0x051c:
            r0.A0Q(r1)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7oF r3 = r0.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r3 = r3.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == r9) goto L_0x0bc7
            r0.A0A()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r0.A0G()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.8hJ r4 = r0.A0Y     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = 2
            X.C1692188l.A00(r4, r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x0bc7
        L_0x0533:
            r0.A0T(r1, r2, r1, r2)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.8gm r4 = r0.A0P     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.85s r4 = (X.C1685185s) r4     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = 13107200(0xc80000, float:1.8367099E-38)
            r4.A00 = r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r4.A01 = r2     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.88T r3 = r4.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            monitor-enter(r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3.A00(r2)     // Catch:{ all -> 0x055b }
            monitor-exit(r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r0.A0H(r1)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            android.os.HandlerThread r3 = r0.A0K     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3.quit()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            monitor-enter(r0)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r0.A0F = r1     // Catch:{ all -> 0x0557 }
            r0.notifyAll()     // Catch:{ all -> 0x0557 }
            monitor-exit(r0)     // Catch:{ all -> 0x0557 }
            return r1
        L_0x0557:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0557 }
            goto L_0x0b65
        L_0x055b:
            r5 = move-exception
            monitor-exit(r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x0b65
        L_0x055f:
            long r11 = android.os.SystemClock.uptimeMillis()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7oF r3 = r0.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            com.google.android.exoplayer2.Timeline r3 = r3.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r3 = r3.A01()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r3 = X.AnonymousClass000.A1T(r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 != 0) goto L_0x086b
            X.7bR r7 = r0.A0R     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r3 = r7.A02     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x086b
            X.7bp r9 = r0.A0Q     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7b3 r6 = r9.A04     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r6 == 0) goto L_0x05b5
            X.7b3 r3 = r6.A01     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r3 = X.AnonymousClass000.A1X(r3)
            X.C161487pm.A04(r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7aa r3 = r6.A02     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r3 = r3.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 != 0) goto L_0x0645
            boolean r3 = r6.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x0645
            boolean r3 = r6.A06     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x05a0
            X.8xY r3 = r6.A09     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r13 = r3.B4y()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r4 = -9223372036854775808
            int r3 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0645
        L_0x05a0:
            X.7b3 r6 = r9.A04     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7aa r3 = r6.A02     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r3 = r3.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 == 0) goto L_0x0645
            int r4 = r9.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = 100
            if (r4 >= r3) goto L_0x0645
        L_0x05b5:
            long r3 = r0.A03     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7oF r13 = r0.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r6 != 0) goto L_0x05d2
            com.google.android.exoplayer2.Timeline r10 = r13.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.6PS r8 = r13.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r5 = r13.A02     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r3 = r13.A0G     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r18 = r9
            r19 = r10
            r20 = r8
            r21 = r5
            r23 = r3
            X.7aa r13 = r18.A03(r19, r20, r21, r23)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x05d8
        L_0x05d2:
            com.google.android.exoplayer2.Timeline r5 = r13.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7aa r13 = r9.A01(r6, r5, r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
        L_0x05d8:
            if (r13 == 0) goto L_0x0645
            X.8sf[] r3 = r0.A0b     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r24 = r3
            X.7GA r15 = r0.A0U     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.8gm r3 = r0.A0P     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.85s r3 = (X.C1685185s) r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.88T r14 = r3.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7MD r10 = r0.A0V     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7b3 r3 = r9.A04     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 != 0) goto L_0x0675
            X.6PS r3 = r13.A04     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r4 = r3.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = -1
            boolean r3 = X.AnonymousClass001.A1X(r4, r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x0672
            long r5 = r13.A02     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r3 == 0) goto L_0x0672
        L_0x0602:
            X.7b3 r8 = new X.7b3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r19 = r13
            r20 = r7
            r21 = r15
            r22 = r10
            r23 = r14
            r25 = r5
            r18 = r8
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7b3 r4 = r9.A04     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r4 == 0) goto L_0x066d
            X.7b3 r3 = r4.A01     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r8 == r3) goto L_0x061f
            r4.A01 = r8     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
        L_0x061f:
            r3 = 0
            r9.A07 = r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r9.A04 = r8     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r3 = r9.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r3 = r3 + 1
            r9.A00 = r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r9.A07()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.8xY r5 = r8.A09     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r3 = r13.A03     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r5.BhI(r0, r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7b3 r3 = r9.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 != r8) goto L_0x0642
            X.7aa r3 = r8.A02     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r3 = r3.A03     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r5 = r8.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r3 = r3 + r5
            r0.A0J(r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
        L_0x0642:
            r0.A0Q(r2)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
        L_0x0645:
            boolean r3 = r0.A0H     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x0669
            boolean r3 = r0.A0V()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r0.A0H = r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r0.A0F()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
        L_0x0652:
            X.7b3 r8 = r9.A06     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r8 == 0) goto L_0x06c9
            X.7b3 r15 = r8.A01     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = 0
            if (r15 == 0) goto L_0x0683
            boolean r3 = r0.A0E     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 != 0) goto L_0x0683
            boolean r3 = r8.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x06c9
            goto L_0x0680
        L_0x0669:
            r0.A0A()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x0652
        L_0x066d:
            r9.A05 = r8     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r9.A06 = r8     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x061f
        L_0x0672:
            r5 = 0
            goto L_0x0602
        L_0x0675:
            long r5 = r3.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7aa r3 = r3.A02     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r3 = r3.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r5 = r5 + r3
            long r3 = r13.A03     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r5 = r5 - r3
            goto L_0x0602
        L_0x0680:
            r4 = 0
            goto L_0x0754
        L_0x0683:
            X.7aa r13 = r8.A02     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r3 = r13.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 != 0) goto L_0x068d
            boolean r3 = r0.A0E     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x06c9
        L_0x068d:
            X.8xU[] r4 = r0.A0a     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r3 = r4.length     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r10 >= r3) goto L_0x06c9
            r7 = r4[r10]     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.8tU[] r3 = r8.A0D     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r4 = r3[r10]     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r4 == 0) goto L_0x06c0
            r3 = r7
            X.861 r3 = (X.AnonymousClass861) r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.8tU r3 = r3.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 != r4) goto L_0x06c0
            boolean r3 = r7.BFS()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x06c0
            long r5 = r13.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r3 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r3 == 0) goto L_0x06b4
            r14 = -9223372036854775808
            int r3 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r3 == 0) goto L_0x06b4
            goto L_0x06ba
        L_0x06b4:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x06bd
        L_0x06ba:
            long r3 = r8.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r3 = r3 + r5
        L_0x06bd:
            A03(r7, r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
        L_0x06c0:
            int r10 = r10 + 1
            goto L_0x068d
        L_0x06c3:
            boolean r3 = r6.BFS()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 != 0) goto L_0x0752
        L_0x06c9:
            X.7b3 r15 = r9.A06     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r15 == 0) goto L_0x07f5
            X.7b3 r3 = r9.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == r15) goto L_0x07f5
            boolean r3 = r15.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 != 0) goto L_0x07f5
            X.7MD r14 = r15.A04     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r13 = 0
            r18 = 0
        L_0x06da:
            X.8xU[] r3 = r0.A0a     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r4 = r3.length     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r13 >= r4) goto L_0x07ec
            r4 = r3[r13]     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = r4
            X.861 r3 = (X.AnonymousClass861) r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r3 = r3.A01     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r3 = X.AnonymousClass000.A1S(r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x0701
            r10 = r4
            X.861 r10 = (X.AnonymousClass861) r10     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.8tU r5 = r10.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.8tU[] r6 = r15.A0D     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = r6[r13]     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r5 = X.C18300x5.A1W(r5, r3)
            X.7jC[] r3 = r14.A02     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = r3[r13]     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x0704
            if (r5 != 0) goto L_0x0704
        L_0x0701:
            int r13 = r13 + 1
            goto L_0x06da
        L_0x0704:
            boolean r3 = r10.A06     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 != 0) goto L_0x0745
            X.8xZ[] r3 = r14.A03     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r7 = r3[r13]     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r5 = 0
            if (r7 == 0) goto L_0x0718
            r3 = r7
            X.88R r3 = (X.AnonymousClass88R) r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int[] r3 = r3.A03     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r4 = r3.length     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
        L_0x0715:
            X.7yp[] r8 = new X.C166527yp[r4]     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x071a
        L_0x0718:
            r4 = 0
            goto L_0x0715
        L_0x071a:
            if (r5 >= r4) goto L_0x0728
            r3 = r7
            X.88R r3 = (X.AnonymousClass88R) r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7yp[] r3 = r3.A04     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = r3[r5]     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r8[r5] = r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r5 = r5 + 1
            goto L_0x071a
        L_0x0728:
            r7 = r6[r13]     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7aa r3 = r15.A02     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r5 = r3.A03     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r3 = r15.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r5 = r5 + r3
            r10.A05 = r7     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r10.A02 = r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r10.A08 = r8     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r10.A03 = r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r20 = r8
            r21 = r5
            r23 = r3
            r19 = r10
            r19.A09(r20, r21, r23)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x0701
        L_0x0745:
            boolean r3 = r4.BHW()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x074f
            r0.A0L(r4)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x0701
        L_0x074f:
            r18 = 1
            goto L_0x0701
        L_0x0752:
            int r4 = r4 + 1
        L_0x0754:
            X.8xU[] r7 = r0.A0a     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r10 = r7.length     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r4 >= r10) goto L_0x076a
            r6 = r7[r4]     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.8tU[] r3 = r8.A0D     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r5 = r3[r4]     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = r6
            X.861 r3 = (X.AnonymousClass861) r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.8tU r3 = r3.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 != r5) goto L_0x06c9
            if (r5 == 0) goto L_0x0752
            goto L_0x06c3
        L_0x076a:
            boolean r3 = r15.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 != 0) goto L_0x077d
            long r13 = r0.A03     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7aa r3 = r15.A02     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r3 = r3.A03     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r5 = r15.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r3 = r3 + r5
            int r5 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x077d
            goto L_0x06c9
        L_0x077d:
            X.7MD r3 = r8.A04     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r20 = r3
            r9.A06 = r15     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r9.A07()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7b3 r8 = r9.A06     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7MD r14 = r8.A04     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r3 = r8.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x07b1
            X.8xY r3 = r8.A09     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r4 = r3.BiL()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r3 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r3 == 0) goto L_0x07b1
            X.7aa r3 = r8.A02     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r3 = r3.A03     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r5 = r8.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r3 = r3 + r5
            r8 = 0
        L_0x07a0:
            if (r8 >= r10) goto L_0x06c9
            r6 = r7[r8]     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r5 = r6
            X.861 r5 = (X.AnonymousClass861) r5     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.8tU r5 = r5.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r5 == 0) goto L_0x07ae
            A03(r6, r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
        L_0x07ae:
            int r8 = r8 + 1
            goto L_0x07a0
        L_0x07b1:
            r13 = 0
        L_0x07b2:
            if (r13 >= r10) goto L_0x06c9
            r3 = r20
            X.7jC[] r4 = r3.A02     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = r4[r13]     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r15 = X.AnonymousClass000.A1W(r3)
            X.7jC[] r5 = r14.A02     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = r5[r13]     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r6 = X.AnonymousClass000.A1W(r3)
            if (r15 == 0) goto L_0x07e9
            r3 = r7[r13]     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.861 r3 = (X.AnonymousClass861) r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r3 = r3.A06     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 != 0) goto L_0x07e9
            r4 = r4[r13]     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = r5[r13]     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r6 == 0) goto L_0x07dd
            boolean r3 = r3.equals(r4)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x07dd
            goto L_0x07e9
        L_0x07dd:
            r15 = r7[r13]     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7aa r3 = r8.A02     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r5 = r3.A03     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r3 = r8.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r5 = r5 + r3
            A03(r15, r5)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
        L_0x07e9:
            int r13 = r13 + 1
            goto L_0x07b2
        L_0x07ec:
            r3 = r18 ^ 1
            if (r3 == 0) goto L_0x07f5
            boolean[] r3 = new boolean[r4]     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r0.A0U(r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
        L_0x07f5:
            r13 = 0
        L_0x07f6:
            boolean r3 = r0.A0X()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x086b
            boolean r3 = r0.A0E     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 != 0) goto L_0x086b
            X.7b3 r3 = r9.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x086b
            X.7b3 r10 = r3.A01     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r10 == 0) goto L_0x086b
            long r7 = r0.A03     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7aa r3 = r10.A02     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r5 = r3.A03     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r3 = r10.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r5 = r5 + r3
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x086b
            boolean r3 = r10.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x086b
            if (r13 == 0) goto L_0x081e
            r0.A0B()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
        L_0x081e:
            X.7b3 r7 = r9.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7b3 r8 = r9.A00()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7aa r3 = r8.A02     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.6PS r10 = r3.A04     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r5 = r3.A03     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r3 = r3.A02     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r18 = r0
            r19 = r10
            r20 = r5
            r22 = r3
            X.7oF r3 = r18.A09(r19, r20, r22)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r0.A07 = r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7aa r3 = r7.A02     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r3 = r3.A06     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r4 = 3
            if (r3 == 0) goto L_0x0842
            r4 = 0
        L_0x0842:
            X.7X4 r3 = r0.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3.A01(r4)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7oF r3 = r0.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            com.google.android.exoplayer2.Timeline r5 = r3.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7aa r3 = r8.A02     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.6PS r4 = r3.A04     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7aa r3 = r7.A02     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.6PS r3 = r3.A04     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r23 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r20 = r5
            r19 = r5
            r21 = r4
            r22 = r3
            r18.A0O(r19, r20, r21, r22, r23)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r0.A0C()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r0.A0G()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r13 = 1
            goto L_0x07f6
        L_0x086b:
            X.7oF r3 = r0.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r4 = r3.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r4 == r1) goto L_0x0b66
            r3 = 4
            if (r4 == r3) goto L_0x0b66
            X.7bp r10 = r0.A0Q     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7b3 r9 = r10.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r9 != 0) goto L_0x088c
            r5 = 10
            X.8hJ r3 = r0.A0Y     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.88l r3 = (X.C1692188l) r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r4 = 2
            android.os.Handler r3 = r3.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3.removeMessages(r4)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r11 = r11 + r5
            r3.sendEmptyMessageAtTime(r4, r11)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x0bc7
        L_0x088c:
            java.lang.String r3 = "doSomeWork"
            android.os.Trace.beginSection(r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r0.A0G()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r5 = r9.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = 1000(0x3e8, double:4.94E-321)
            if (r5 == 0) goto L_0x0904
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r5 = r5 * r3
            X.8xY r13 = r9.A09     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7oF r3 = r0.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r3 = r3.A0G     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r7 = r0.A0J     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r3 = r3 - r7
            r7 = 0
            r13.B1k(r3, r2)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r14 = 1
            r21 = 1
        L_0x08af:
            X.8xU[] r4 = r0.A0a     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r3 = r4.length     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r7 >= r3) goto L_0x090c
            r13 = r4[r7]     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = r13
            X.861 r3 = (X.AnonymousClass861) r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r3 = r3.A01     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r3 = X.AnonymousClass000.A1S(r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x0901
            long r3 = r0.A03     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r13.BjR(r3, r5)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r14 == 0) goto L_0x08cf
            boolean r3 = r13.BHW()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r14 = 1
            if (r3 != 0) goto L_0x08d0
        L_0x08cf:
            r14 = 0
        L_0x08d0:
            X.8tU[] r3 = r9.A0D     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r4 = r3[r7]     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r8 = r13
            X.861 r8 = (X.AnonymousClass861) r8     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.8tU r3 = r8.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r4 != r3) goto L_0x08ee
            boolean r3 = r13.BFS()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 != 0) goto L_0x08ee
            boolean r3 = r13.BIe()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 != 0) goto L_0x08ee
            boolean r4 = r13.BHW()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = 0
            if (r4 == 0) goto L_0x08ef
        L_0x08ee:
            r3 = 1
        L_0x08ef:
            if (r21 == 0) goto L_0x08f5
            r21 = 1
            if (r3 != 0) goto L_0x0901
        L_0x08f5:
            r21 = 0
            if (r3 != 0) goto L_0x0901
            X.8tU r3 = r8.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3.getClass()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3.BL1()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
        L_0x0901:
            int r7 = r7 + 1
            goto L_0x08af
        L_0x0904:
            X.8xY r3 = r9.A09     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3.BL2()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r14 = 1
            r21 = 1
        L_0x090c:
            X.7aa r3 = r9.A02     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r5 = r3.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r14 == 0) goto L_0x0937
            boolean r3 = r9.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x0937
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0927
            X.7oF r3 = r0.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r3 = r3.A0G     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 > 0) goto L_0x0937
        L_0x0927:
            r5 = 1
            boolean r3 = r0.A0E     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x0938
            r0.A0E = r2     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7oF r3 = r0.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r4 = r3.A01     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = 5
            r0.A0I(r4, r3, r2, r2)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x0938
        L_0x0937:
            r5 = 0
        L_0x0938:
            r13 = 3
            if (r5 == 0) goto L_0x0947
            X.7aa r3 = r9.A02     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r3 = r3.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x0947
            r3 = 4
            r0.A0H(r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x0a53
        L_0x0947:
            X.7oF r5 = r0.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r4 = r5.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r20 = 2
            r3 = r20
            if (r4 != r3) goto L_0x0a19
            int r3 = r0.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 != 0) goto L_0x0973
            boolean r3 = r0.A0W()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x0a19
        L_0x095b:
            r0.A0H(r13)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = 0
            r0.A04 = r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r3 = r0.A0X()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x096a
            r0.A0D()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
        L_0x096a:
            X.7oF r3 = r0.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r4 = r3.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = 2
            if (r4 != r3) goto L_0x0aa2
            goto L_0x0a58
        L_0x0973:
            if (r21 == 0) goto L_0x0a19
            boolean r3 = r5.A0B     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x095b
            com.google.android.exoplayer2.Timeline r4 = r5.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7b3 r3 = r10.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7aa r3 = r3.A02     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.6PS r3 = r3.A04     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r3 = r0.A0Y(r4, r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x09ab
            X.8gl r3 = r0.A0O     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.85r r3 = (X.C1685085r) r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r5 = r3.A01     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
        L_0x098d:
            X.7b3 r7 = r10.A04     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r3 = r7.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x09b1
            boolean r3 = r7.A06     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x09a3
            X.8xY r3 = r7.A09     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r18 = r3.B4y()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r14 = -9223372036854775808
            int r3 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r3 != 0) goto L_0x09b1
        L_0x09a3:
            X.7aa r3 = r7.A02     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r3 = r3.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r8 = 1
            if (r3 != 0) goto L_0x09b2
            goto L_0x09b1
        L_0x09ab:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x098d
        L_0x09b1:
            r8 = 0
        L_0x09b2:
            X.7aa r3 = r7.A02     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.6PS r3 = r3.A04     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r4 = r3.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = -1
            boolean r3 = X.AnonymousClass001.A1X(r4, r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x09c4
            boolean r4 = r7.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = 1
            if (r4 == 0) goto L_0x09c5
        L_0x09c4:
            r3 = 0
        L_0x09c5:
            if (r8 != 0) goto L_0x095b
            if (r3 != 0) goto L_0x095b
            X.8gm r10 = r0.A0P     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r7 = r0.A05()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.88r r3 = r0.A0M     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7k2 r3 = r3.BBR()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            float r14 = r3.A01     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r3 = r0.A0B     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r15 = r3
            X.85s r10 = (X.C1685185s) r10     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x09e9
            double r3 = (double) r7     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            double r7 = (double) r14     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            double r3 = r3 / r7
            long r7 = java.lang.Math.round(r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
        L_0x09e9:
            if (r15 == 0) goto L_0x09ee
            long r3 = r10.A03     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x09f0
        L_0x09ee:
            long r3 = r10.A04     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
        L_0x09f0:
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r14 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r14 == 0) goto L_0x0a00
            r14 = 2
            long r5 = r5 / r14
            long r3 = java.lang.Math.min(r5, r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
        L_0x0a00:
            r14 = 0
            int r5 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r5 <= 0) goto L_0x095b
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x095b
            X.88T r6 = r10.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            monitor-enter(r6)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r4 = r6.A00     // Catch:{ all -> 0x0b63 }
            int r3 = r6.A04     // Catch:{ all -> 0x0b63 }
            int r4 = r4 * r3
            monitor-exit(r6)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r3 = r10.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r4 < r3) goto L_0x0a19
            goto L_0x095b
        L_0x0a19:
            X.7oF r3 = r0.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r3 = r3.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 != r13) goto L_0x096a
            int r3 = r0.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 != 0) goto L_0x0a2b
            boolean r3 = r0.A0W()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x0a2d
            goto L_0x096a
        L_0x0a2b:
            if (r21 != 0) goto L_0x096a
        L_0x0a2d:
            boolean r3 = r0.A0X()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r0.A0B = r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = r20
            r0.A0H(r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r3 = r0.A0B     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x0a53
            X.8gl r10 = r0.A0O     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.85r r10 = (X.C1685085r) r10     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r5 = r10.A01     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x0a53
            r7 = 500000(0x7a120, double:2.47033E-318)
            long r5 = r5 + r7
            r10.A01 = r5     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r10.A03 = r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
        L_0x0a53:
            r0.A0E()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x096a
        L_0x0a58:
            r5 = 0
        L_0x0a59:
            X.8xU[] r6 = r0.A0a     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r3 = r6.length     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r5 >= r3) goto L_0x0a85
            r3 = r6[r5]     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.861 r3 = (X.AnonymousClass861) r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r3 = r3.A01     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r3 = X.AnonymousClass000.A1S(r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x0a82
            r3 = r6[r5]     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.861 r3 = (X.AnonymousClass861) r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.8tU r4 = r3.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.8tU[] r3 = r9.A0D     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = r3[r5]     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r4 != r3) goto L_0x0a82
            r3 = r6[r5]     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.861 r3 = (X.AnonymousClass861) r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.8tU r3 = r3.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3.getClass()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3.BL1()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
        L_0x0a82:
            int r5 = r5 + 1
            goto L_0x0a59
        L_0x0a85:
            X.7oF r4 = r0.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r3 = r4.A0B     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 != 0) goto L_0x0aa2
            long r3 = r4.A0H     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r6 = 500000(0x7a120, double:2.47033E-318)
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x0aa2
            boolean r3 = r0.A0V()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x0aa2
            java.lang.String r3 = "Playback stuck buffering and not loading"
            java.lang.IllegalStateException r5 = X.AnonymousClass001.A0e(r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x0b65
        L_0x0aa2:
            boolean r5 = r0.A0C     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7oF r4 = r0.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r3 = r4.A0C     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r5 == r3) goto L_0x0ab0
            X.7oF r4 = r4.A08(r5)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r0.A07 = r4     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
        L_0x0ab0:
            boolean r3 = r0.A0X()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x0aba
            int r3 = r4.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == r13) goto L_0x0ae3
        L_0x0aba:
            int r4 = r4.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = 2
            if (r4 == r3) goto L_0x0ae3
            int r3 = r0.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x0ad7
            r3 = 4
            if (r4 == r3) goto L_0x0ad7
            r5 = 1000(0x3e8, double:4.94E-321)
            X.8hJ r3 = r0.A0Y     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.88l r3 = (X.C1692188l) r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r4 = 2
            android.os.Handler r3 = r3.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3.removeMessages(r4)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r11 = r11 + r5
            r3.sendEmptyMessageAtTime(r4, r11)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x0ae1
        L_0x0ad7:
            X.8hJ r3 = r0.A0Y     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.88l r3 = (X.C1692188l) r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r4 = 2
            android.os.Handler r3 = r3.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3.removeMessages(r4)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
        L_0x0ae1:
            r12 = 0
            goto L_0x0b00
        L_0x0ae3:
            boolean r3 = r0.A0C     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x0aed
            boolean r3 = r0.A0G     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == 0) goto L_0x0aed
            r3 = 0
            goto L_0x0afe
        L_0x0aed:
            r5 = 10
            X.8hJ r3 = r0.A0Y     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.88l r3 = (X.C1692188l) r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r4 = 2
            android.os.Handler r3 = r3.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3.removeMessages(r4)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r11 = r11 + r5
            r3.sendEmptyMessageAtTime(r4, r11)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = 1
        L_0x0afe:
            r12 = r3 ^ 1
        L_0x0b00:
            X.7oF r11 = r0.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r3 = r11.A0E     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r3 == r12) goto L_0x0b5d
            com.google.android.exoplayer2.Timeline r3 = r11.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r21 = r3
            X.6PS r3 = r11.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r22 = r3
            long r9 = r11.A02     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r3 = r11.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r27 = r3
            X.6zd r3 = r11.A03     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r41 = r3
            boolean r3 = r11.A0B     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r37 = r3
            X.7yb r3 = r11.A08     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r24 = r3
            X.7MD r3 = r11.A09     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r25 = r3
            java.util.List r3 = r11.A0A     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r20 = r3
            X.6PS r3 = r11.A06     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r19 = r3
            boolean r3 = r11.A0D     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r18 = r3
            int r14 = r11.A01     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7k2 r13 = r11.A04     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r7 = r11.A0F     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r5 = r11.A0H     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            long r3 = r11.A0G     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r15 = r11.A0C     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7oF r11 = new X.7oF     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r23 = r19
            r26 = r20
            r28 = r14
            r29 = r9
            r31 = r7
            r33 = r5
            r35 = r3
            r38 = r18
            r39 = r15
            r40 = r12
            r18 = r11
            r19 = r41
            r20 = r13
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r33, r35, r37, r38, r39, r40)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r0.A07 = r11     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
        L_0x0b5d:
            r0.A0G = r2     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            android.os.Trace.endSection()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x0bc7
        L_0x0b63:
            r5 = move-exception
            monitor-exit(r6)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
        L_0x0b65:
            throw r5     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
        L_0x0b66:
            X.8hJ r3 = r0.A0Y     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.88l r3 = (X.C1692188l) r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r4 = 2
            android.os.Handler r3 = r3.A00     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3.removeMessages(r4)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            goto L_0x0bc7
        L_0x0b71:
            X.7X4 r3 = r0.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3.A00(r1)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r0.A0T(r2, r2, r2, r1)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.8gm r4 = r0.A0P     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.85s r4 = (X.C1685185s) r4     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = 13107200(0xc80000, float:1.8367099E-38)
            r4.A00 = r3     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r6 = 0
            r4.A01 = r2     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7oF r3 = r0.A07     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            com.google.android.exoplayer2.Timeline r3 = r3.A05     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r3 = r3.A01()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r4 = X.AnonymousClass000.A1T(r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = 2
            if (r4 == 0) goto L_0x0b94
            r3 = 4
        L_0x0b94:
            r0.A0H(r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.7bR r5 = r0.A0R     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.8hG r4 = r0.A0W     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.88U r4 = (X.AnonymousClass88U) r4     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            boolean r3 = r5.A02     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = r3 ^ 1
            X.C161487pm.A04(r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r5.A01 = r4     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
        L_0x0ba6:
            java.util.List r4 = r5.A08     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r3 = r4.size()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            if (r6 >= r3) goto L_0x0bbf
            java.lang.Object r4 = r4.get(r6)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.85u r4 = (X.C1685385u) r4     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r5.A05(r4)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            java.util.Set r3 = r5.A0A     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3.add(r4)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            int r6 = r6 + 1
            goto L_0x0ba6
        L_0x0bbf:
            r5.A02 = r1     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            X.8hJ r4 = r0.A0Y     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            r3 = 2
            X.C1692188l.A00(r4, r3)     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
        L_0x0bc7:
            r0.A0B()     // Catch:{ 6zd -> 0x0bed, IOException -> 0x0c3a, RuntimeException -> 0x0bcb }
            return r1
        L_0x0bcb:
            r8 = move-exception
            r9 = 2
            r6 = 0
            r10 = -1
            r11 = 4
            X.6zd r5 = new X.6zd
            r7 = r6
            r12 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r4 = r17
            r3 = r16
            X.C159307lc.A02(r4, r3, r5)
            r0.A0S(r1, r2)
            X.7oF r2 = r0.A07
            X.7oF r2 = r2.A03(r5)
            r0.A07 = r2
            r0.A0B()
            return r1
        L_0x0bed:
            r5 = move-exception
            int r3 = r5.type
            if (r3 != r1) goto L_0x0c00
            X.7bp r3 = r0.A0Q
            X.7b3 r3 = r3.A06
            if (r3 == 0) goto L_0x0c00
            X.7aa r3 = r3.A02
            X.6PS r3 = r3.A04
            X.6zd r5 = r5.A00(r3)
        L_0x0c00:
            boolean r3 = r5.isRecoverable
            if (r3 == 0) goto L_0x0c25
            X.6zd r3 = r0.A04
            if (r3 != 0) goto L_0x0c25
            java.lang.String r3 = "Recoverable playback error"
            r2 = r17
            X.C159307lc.A01(r3, r2, r5)
            r0.A04 = r5
            X.8hJ r2 = r0.A0Y
            r3 = 25
            X.88l r2 = (X.C1692188l) r2
            android.os.Handler r2 = r2.A00
            android.os.Message r3 = r2.obtainMessage(r3, r5)
            android.os.Handler r2 = r3.getTarget()
            r2.sendMessageAtFrontOfQueue(r3)
            goto L_0x0c66
        L_0x0c25:
            X.6zd r3 = r0.A04
            if (r3 == 0) goto L_0x0c2f
            r5.addSuppressed(r3)
            r3 = 0
            r0.A04 = r3
        L_0x0c2f:
            r4 = r17
            r3 = r16
            X.C159307lc.A02(r4, r3, r5)
            r0.A0S(r1, r2)
            goto L_0x0c5e
        L_0x0c3a:
            r8 = move-exception
            r6 = 0
            r10 = -1
            r11 = 4
            X.6zd r5 = new X.6zd
            r12 = r2
            r7 = r6
            r9 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            X.7bp r3 = r0.A0Q
            X.7b3 r3 = r3.A05
            if (r3 == 0) goto L_0x0c54
            X.7aa r3 = r3.A02
            X.6PS r3 = r3.A04
            X.6zd r5 = r5.A00(r3)
        L_0x0c54:
            r4 = r17
            r3 = r16
            X.C159307lc.A02(r4, r3, r5)
            r0.A0S(r2, r2)
        L_0x0c5e:
            X.7oF r2 = r0.A07
            X.7oF r2 = r2.A03(r5)
            r0.A07 = r2
        L_0x0c66:
            r0.A0B()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1689687l.handleMessage(android.os.Message):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if ((r12 + r6.A00) < 0) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A07(X.AnonymousClass6PS r11, long r12, boolean r14, boolean r15) {
        /*
            r10 = this;
            r10.A0E()
            r5 = 0
            r10.A0B = r5
            r4 = 2
            if (r15 != 0) goto L_0x0010
            X.7oF r0 = r10.A07
            int r1 = r0.A00
            r0 = 3
            if (r1 != r0) goto L_0x0013
        L_0x0010:
            r10.A0H(r4)
        L_0x0013:
            X.7bp r7 = r10.A0Q
            X.7b3 r6 = r7.A05
            r1 = r6
        L_0x0018:
            if (r6 == 0) goto L_0x0027
            X.7aa r0 = r6.A02
            X.6PS r0 = r0.A04
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0027
            X.7b3 r6 = r6.A01
            goto L_0x0018
        L_0x0027:
            r2 = 0
            if (r14 != 0) goto L_0x0037
            if (r1 != r6) goto L_0x0037
            if (r6 == 0) goto L_0x004f
            long r0 = r6.A00
            long r8 = r12 + r0
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0060
        L_0x0037:
            X.8xU[] r9 = r10.A0a
            int r8 = r9.length
            r1 = 0
        L_0x003b:
            if (r1 >= r8) goto L_0x0045
            r0 = r9[r1]
            r10.A0L(r0)
            int r1 = r1 + 1
            goto L_0x003b
        L_0x0045:
            if (r6 == 0) goto L_0x004f
        L_0x0047:
            X.7b3 r0 = r7.A05
            if (r0 == r6) goto L_0x0056
            r7.A00()
            goto L_0x0047
        L_0x004f:
            r7.A06()
            r10.A0J(r12)
            goto L_0x0075
        L_0x0056:
            r7.A08(r6)
            r6.A00 = r2
            boolean[] r0 = new boolean[r8]
            r10.A0U(r0)
        L_0x0060:
            r7.A08(r6)
            boolean r1 = r6.A07
            X.7aa r0 = r6.A02
            if (r1 != 0) goto L_0x007e
            X.7aa r0 = r0.A01(r12)
            r6.A02 = r0
        L_0x006f:
            r10.A0J(r12)
            r10.A0A()
        L_0x0075:
            r10.A0Q(r5)
            X.8hJ r0 = r10.A0Y
            X.C1692188l.A00(r0, r4)
            return r12
        L_0x007e:
            long r0 = r0.A00
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x0094
            int r7 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r7 < 0) goto L_0x0094
            r7 = 1
            long r0 = r0 - r7
            long r12 = java.lang.Math.max(r2, r0)
        L_0x0094:
            boolean r0 = r6.A06
            if (r0 == 0) goto L_0x006f
            X.8xY r6 = r6.A09
            long r12 = r6.Bl5(r12)
            long r2 = r10.A0J
            long r0 = r12 - r2
            r6.B1k(r0, r5)
            goto L_0x006f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1689687l.A07(X.6PS, long, boolean, boolean):long");
    }

    public final void A0A() {
        long BA0;
        long max;
        int i;
        boolean z;
        if (!A0V()) {
            z = false;
        } else {
            C153717bp r2 = this.A0Q;
            C153327b3 r1 = r2.A04;
            if (!r1.A07) {
                BA0 = 0;
            } else {
                BA0 = r1.A09.BA0();
            }
            C153327b3 r0 = r2.A04;
            if (r0 == null) {
                max = 0;
            } else {
                max = Math.max(0, BA0 - (this.A03 - r0.A00));
            }
            C177988gm r4 = this.A0P;
            float f = this.A0M.BBR().A01;
            C1685185s r42 = (C1685185s) r4;
            AnonymousClass88T r3 = r42.A07;
            synchronized (r3) {
                i = r3.A00 * r3.A04;
            }
            boolean z2 = true;
            boolean A1U = C18280x3.A1U(i, r42.A00);
            long j = r42.A06;
            if (f > 1.0f) {
                if (f != 1.0f) {
                    j = Math.round(((double) j) * ((double) f));
                }
                j = Math.min(j, r42.A05);
            }
            if (max < Math.max(j, 500000)) {
                if (A1U) {
                    z2 = false;
                }
                r42.A01 = z2;
                if (!z2 && max < 500000) {
                    Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                }
            } else if (max >= r42.A05 || A1U) {
                r42.A01 = false;
            }
            z = r42.A01;
        }
        this.A0H = z;
        if (z) {
            C153327b3 r43 = this.A0Q.A04;
            long j2 = this.A03;
            C161487pm.A04(AnonymousClass000.A1X(r43.A01));
            r43.A09.Azd(j2 - r43.A00);
        }
        A0F();
    }

    public final void A0N(Timeline timeline, Timeline timeline2) {
        if (!AnonymousClass000.A1T(timeline.A01()) || !AnonymousClass000.A1T(timeline2.A01())) {
            ArrayList arrayList = this.A0Z;
            int A0M2 = C86664Kz.A0M(arrayList);
            if (A0M2 >= 0) {
                arrayList.get(A0M2);
                throw AnonymousClass001.A0g("resolvedPeriodUid");
            } else {
                Collections.sort(arrayList);
            }
        }
    }

    public final void A0O(Timeline timeline, Timeline timeline2, AnonymousClass6PS r10, AnonymousClass6PS r11, long j) {
        Object obj;
        if (AnonymousClass000.A1T(timeline.A01()) || !A0Y(timeline, r10)) {
            C1692788r r3 = this.A0M;
            float f = r3.BBR().A01;
            C158477k2 r1 = this.A07.A04;
            if (f != r1.A01) {
                r3.Bmy(r1);
                return;
            }
            return;
        }
        Object obj2 = r10.A04;
        C153417bH r5 = this.A0S;
        int A002 = C153417bH.A00(r5, timeline, obj2);
        C158647kK r4 = this.A0T;
        timeline.A0B(r4, A002, 0);
        C1685085r r32 = (C1685085r) this.A0O;
        long j2 = -9223372036854775807L;
        r32.A05 = -9223372036854775807L;
        r32.A06 = -9223372036854775807L;
        r32.A04 = -9223372036854775807L;
        if (j != -9223372036854775807L) {
            j2 = A06(timeline, obj2, j);
        } else {
            Object obj3 = r4.A09;
            if (!AnonymousClass000.A1T(timeline2.A01())) {
                obj = AnonymousClass6C8.A0X(r4, timeline2, C153417bH.A00(r5, timeline2, r11.A04)).A09;
            } else {
                obj = null;
            }
            if (C162387ry.A0D(obj, obj3)) {
                return;
            }
        }
        r32.A09 = j2;
    }
}
