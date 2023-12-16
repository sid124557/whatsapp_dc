package X;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import java.util.AbstractList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.7t5  reason: invalid class name and case insensitive filesystem */
public class C162987t5 implements Handler.Callback {
    public static int A1B;
    public static final AtomicBoolean A1C = C18280x3.A0l();
    public static final AtomicReference A1D = new AtomicReference();
    public float A00 = 1.0f;
    public float A01;
    public int A02 = 1;
    public int A03 = 10;
    public int A04 = 1;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public Context A0D;
    public Handler A0E;
    public HandlerThread A0F;
    public Surface A0G;
    public Surface A0H;
    public Surface A0I;
    public C149107Lb A0J;
    public C150237Pv A0K = null;
    public AnonymousClass0Xd A0L;
    public C142486xH A0M = C142486xH.PROGRESSIVE_DOWNLOAD;
    public C177918gf A0N;
    public C1444171m A0O;
    public AnonymousClass85F A0P;
    public C151857Wo A0Q;
    public C177928gg A0R;
    public Integer A0S = null;
    public String A0T = "";
    public String A0U;
    public Map A0V;
    public AtomicReference A0W;
    public boolean A0X = false;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b = false;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public final long A0k;
    public final Handler A0l;
    public final C150157Pl A0m;
    public final C146597Aw A0n;
    public final AnonymousClass85L A0o;
    public final AnonymousClass8LG A0p;
    public final Map A0q = AnonymousClass001.A0t();
    public final AtomicBoolean A0r;
    public final AtomicBoolean A0s;
    public final AtomicBoolean A0t;
    public final AtomicBoolean A0u;
    public final AtomicInteger A0v = new AtomicInteger();
    public final AtomicInteger A0w = new AtomicInteger(0);
    public final AtomicReference A0x;
    public volatile C166427yf A0y = C166427yf.A0D;
    public volatile C166537yr A0z = new C166537yr();
    public volatile C152777a6 A10;
    public volatile C158057jM A11 = new C158057jM();
    public volatile C161787qS A12;
    public volatile String A13;
    public volatile String A14;
    public volatile boolean A15;
    public volatile boolean A16;
    public volatile boolean A17;
    public volatile boolean A18;
    public volatile boolean A19;
    public volatile boolean A1A;

    public void A07() {
        A02(this, AnonymousClass000.A0b("Enabling Text Track: ", AnonymousClass001.A0o(), false), 0);
        A01(this.A0l, this, false, 34);
    }

    public final void A09() {
        this.A10 = null;
        this.A0Z = false;
        this.A0M = C142486xH.PROGRESSIVE_DOWNLOAD;
        this.A0c = false;
        this.A0b = false;
        this.A18 = false;
        this.A0f = false;
        this.A0h = false;
        this.A01 = 0.0f;
        this.A00 = 1.0f;
        this.A02 = 1;
        this.A0g = false;
        this.A04 = 1;
        this.A03 = 10;
        this.A08 = -1;
        this.A0Y = false;
        this.A16 = false;
        this.A0A = 0;
        this.A0z = new C166537yr();
        this.A0y = C166427yf.A0D;
        C161787qS r3 = this.A12;
        r3.A0U.clear();
        r3.A01.A0R.clear();
        this.A0i = false;
        this.A0r.set(true);
        this.A0a = false;
        this.A09 = -1;
        this.A0K = null;
        this.A0T = "";
        this.A0U = null;
        this.A12.A04 = null;
        if (this.A0p.improveLooping) {
            this.A12.A01.A06(0);
        }
    }

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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void A0D(int r38, long r39, boolean r41, boolean r42) {
        /*
            r37 = this;
            r0 = 4
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r24 = r41
            java.lang.Boolean r22 = java.lang.Boolean.valueOf(r24)
            r6 = 0
            r1[r6] = r22
            r12 = r38
            java.lang.Integer r21 = java.lang.Integer.valueOf(r12)
            r11 = 1
            r1[r11] = r21
            r5 = r37
            boolean r0 = r5.A18
            X.AnonymousClass001.A1S(r1, r0)
            boolean r0 = r5.A0c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r23 = 3
            r1[r23] = r0
            java.lang.String r0 = "onPlayerStateChanged start: play=%b, state=%d, startedPlaying=%b, isPrepared=%b"
            r5.A0K(r0, r1)
            boolean r0 = r5.A19
            if (r0 == 0) goto L_0x0038
            if (r12 != r11) goto L_0x0038
            r5.A19 = r6
            X.85L r0 = r5.A0o
            r0.Bcs()
        L_0x0038:
            X.7a6 r0 = r5.A10
            if (r0 != 0) goto L_0x0042
            java.lang.String r0 = "onPlayerStateChanged, play request not set yet, skip the state change"
            A02(r5, r0, r6)
            return
        L_0x0042:
            java.lang.String r26 = r5.A06()
            boolean r0 = android.text.TextUtils.isEmpty(r26)
            java.lang.String r25 = ""
            r36 = r25
            if (r0 == 0) goto L_0x0052
            r26 = r25
        L_0x0052:
            X.8LG r15 = r5.A0p
            boolean r0 = r15.enableSecondaryChannelLoggingForLite
            if (r0 == 0) goto L_0x0071
            java.lang.String r0 = r5.A06()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x03bf
            r2 = r25
        L_0x0064:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0071
            X.85L r1 = r5.A0o
            r0 = r26
            r1.BRs(r0, r2)
        L_0x0071:
            r0 = r23
            if (r12 != r0) goto L_0x0078
            r0 = 1
            if (r41 != 0) goto L_0x0079
        L_0x0078:
            r0 = 0
        L_0x0079:
            r5.A0f = r0
            r2 = 0
            r9 = 0
            r0 = r39
            if (r41 != 0) goto L_0x03b4
            boolean r4 = r5.A18
            if (r4 == 0) goto L_0x031e
            r5.A18 = r6
            X.7yr r4 = r5.A03(r0, r11)
            r5.A0M(r11)
            X.85L r14 = r5.A0o
            long r7 = r5.A07
            java.lang.String r13 = r5.A0T
            java.lang.String r10 = r5.A0U
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x031a
            java.lang.String r11 = r5.A0U
        L_0x009f:
            X.7a6 r10 = r5.A10
            java.lang.String r10 = r10.A08
            r33 = r42
            r28 = r13
            r29 = r11
            r30 = r10
            r31 = r7
            r26 = r14
            r27 = r4
            r26.BXk(r27, r28, r29, r30, r31, r33)
            r5.A07 = r2
            r2 = r25
            r5.A0T = r2
            r5.A0U = r9
        L_0x00bc:
            r7 = 1
            if (r12 == r7) goto L_0x0312
            r2 = 2
            if (r12 == r2) goto L_0x0291
            r2 = r23
            if (r12 == r2) goto L_0x0158
            r2 = 4
            if (r12 != r2) goto L_0x0610
            boolean r3 = r5.A18
            boolean r2 = r5.A0h
            if (r2 != 0) goto L_0x00d1
            r5.A18 = r6
        L_0x00d1:
            X.7yr r4 = r5.A03(r0, r7)
            if (r3 == 0) goto L_0x00e0
            X.85L r3 = r5.A0o
            X.7a6 r2 = r5.A10
            java.lang.String r2 = r2.A08
            r3.BPY(r4, r2, r6)
        L_0x00e0:
            boolean r2 = r5.A0h
            if (r2 == 0) goto L_0x00ef
            boolean r2 = r15.improveLooping
            if (r2 != 0) goto L_0x00ef
            X.7qS r7 = r5.A12
            r2 = 0
            r7.A07(r2, r6)
        L_0x00ef:
            r5.A0U = r9
        L_0x00f1:
            int r2 = r15.checkPlayerStateMinIntervalMs
            r5.A03 = r2
            if (r4 != 0) goto L_0x014b
            r5.A0E(r0)
        L_0x00fa:
            r5.A04 = r12
            r0 = r24
            r5.A0g = r0
            X.7Lb r0 = r5.A0J
            if (r0 == 0) goto L_0x0122
            r0 = 1
            if (r12 == r0) goto L_0x010e
            r0 = 2
            if (r12 == r0) goto L_0x0144
            r0 = r23
            if (r12 == r0) goto L_0x0144
        L_0x010e:
            r2 = 0
        L_0x010f:
            X.7Lb r0 = r5.A0J
            if (r0 == 0) goto L_0x0122
            r0.A02 = r2
            android.os.PowerManager$WakeLock r1 = r0.A00
            if (r1 == 0) goto L_0x0122
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0140
            if (r2 == 0) goto L_0x0140
            r1.acquire()
        L_0x0122:
            r0 = 4
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r1 = r22
            r0 = r21
            X.AnonymousClass000.A16(r1, r0, r2)
            boolean r0 = r5.A18
            X.AnonymousClass001.A1S(r2, r0)
            boolean r1 = r5.A0c
            r0 = r23
            X.AnonymousClass6C7.A1V(r2, r0, r1)
            java.lang.String r1 = "onPlayerStateChanged end: play=%b, state=%d, startedPlaying=%b, isPrepared=%b"
            java.lang.String r0 = "HeroService"
            X.C159597m9.A00(r5, r0, r1, r2)
            return
        L_0x0140:
            r1.release()
            goto L_0x0122
        L_0x0144:
            X.7qS r0 = r5.A12
            X.7br r0 = r0.A01
            boolean r2 = r0.A0F
            goto L_0x010f
        L_0x014b:
            r5.A0z = r4
            android.os.Handler r3 = r5.A0l
            int r0 = r5.A03
            long r0 = (long) r0
            r2 = 10
            r3.sendEmptyMessageDelayed(r2, r0)
            goto L_0x00fa
        L_0x0158:
            java.lang.String r2 = "Player is ready"
            A02(r5, r2, r6)
            boolean r2 = r15.clearBufferingWhenInWarmup
            if (r2 == 0) goto L_0x016d
            java.util.concurrent.atomic.AtomicBoolean r2 = r5.A0u
            boolean r2 = r2.get()
            if (r2 == 0) goto L_0x016d
            r2 = -1
            r5.A08 = r2
        L_0x016d:
            X.7qS r2 = r5.A12
            X.8x9[] r2 = r2.A0I
            r7 = 0
            if (r2 == 0) goto L_0x0181
            r2 = r2[r6]
            X.80p r2 = (X.C1673180p) r2
            int r3 = r2.A01
            r2 = 1
            if (r3 == r2) goto L_0x0180
            r2 = 2
            if (r3 != r2) goto L_0x0181
        L_0x0180:
            r7 = 1
        L_0x0181:
            boolean r2 = r5.A0c
            if (r2 != 0) goto L_0x01a1
            android.view.Surface r2 = r5.A0G
            if (r2 != 0) goto L_0x0193
            java.util.concurrent.atomic.AtomicBoolean r2 = r5.A0u
            boolean r2 = r2.get()
            if (r2 == 0) goto L_0x0193
            if (r7 != 0) goto L_0x01a1
        L_0x0193:
            r2 = 1
            r5.A0c = r2
            X.7yr r4 = r5.A03(r0, r6)
            X.85L r3 = r5.A0o
            r2 = r36
            r3.BYm(r4, r2)
        L_0x01a1:
            if (r41 == 0) goto L_0x0277
            boolean r2 = r5.A18
            if (r2 != 0) goto L_0x0277
            r10 = 1
            r5.A18 = r10
            X.7yr r4 = r5.A03(r0, r10)
            X.7qS r2 = r5.A12
            X.7br r2 = r2.A01
            X.7nh r2 = r2.A08
            X.6xQ r2 = r2.A07
            java.lang.String r11 = r2.value
            X.6xQ r2 = X.C142576xQ.BUFFER_BELOW_THRESHOLD
            java.lang.String r2 = r2.value
            boolean r3 = r11.equals(r2)
            java.lang.String r2 = ":"
            if (r3 == 0) goto L_0x01d5
            java.lang.StringBuilder r7 = X.C18330xA.A0A(r11)
            r7.append(r2)
            X.8L8 r3 = r5.A04()
            int r3 = r3.minBufferMs
            java.lang.String r11 = X.AnonymousClass000.A0h(r7, r3)
        L_0x01d5:
            X.7qS r3 = r5.A12
            X.7br r3 = r3.A01
            X.7nh r3 = r3.A08
            boolean r7 = r3.A09
            r8 = 2
            if (r7 == 0) goto L_0x0201
            java.lang.StringBuilder r3 = X.C18330xA.A0A(r11)
            r3.append(r2)
            java.lang.String r2 = "audio_stall"
            java.lang.String r11 = X.AnonymousClass000.A0X(r2, r3)
            java.lang.Object[] r3 = new java.lang.Object[r8]
            X.AnonymousClass6C7.A1V(r3, r6, r7)
            java.lang.String r2 = r5.A06()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r3[r10] = r2
            java.lang.String r2 = "handleStartedPlaying isAudioStall: %s %s"
            r5.A0K(r2, r3)
        L_0x0201:
            java.lang.String r7 = r5.A0U
            if (r7 == 0) goto L_0x0228
            int r2 = r11.length()
            if (r2 <= 0) goto L_0x0275
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0l(r11)
            java.lang.String r2 = "; "
            java.lang.String r11 = X.AnonymousClass000.A0V(r2, r7, r3)
        L_0x0215:
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r2[r6] = r7
            java.lang.String r3 = r5.A06()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2[r10] = r3
            java.lang.String r3 = "handleStartedPlaying: %s %s"
            r5.A0K(r3, r2)
        L_0x0228:
            X.85L r10 = r5.A0o
            long r7 = r4.A0H
            long r2 = r5.A0B
            long r7 = r7 - r2
            java.lang.String r13 = r5.A0T
            java.lang.String r3 = r5.A0U
            X.7a6 r2 = r5.A10
            if (r2 == 0) goto L_0x0272
            X.7a6 r2 = r5.A10
            java.lang.String r2 = r2.A08
        L_0x023b:
            r35 = r6
            r27 = r11
            r28 = r9
            r29 = r13
            r30 = r3
            r31 = r2
            r32 = r7
            r34 = r6
            r25 = r10
            r26 = r4
            r25.BcI(r26, r27, r28, r29, r30, r31, r32, r34, r35)
            r5.A0b = r6
            r2 = r36
            r5.A0T = r2
            r5.A0U = r9
            A1B = r6
            android.view.Surface r3 = r5.A0G
            if (r3 == 0) goto L_0x026a
            android.view.Surface r2 = r5.A0I
            if (r2 != r3) goto L_0x026a
            boolean r2 = r2.isValid()
            if (r2 != 0) goto L_0x00f1
        L_0x026a:
            long r2 = android.os.SystemClock.elapsedRealtime()
            r5.A0C = r2
            goto L_0x00f1
        L_0x0272:
            r2 = r36
            goto L_0x023b
        L_0x0275:
            r11 = r7
            goto L_0x0215
        L_0x0277:
            if (r4 != 0) goto L_0x00f1
            r2 = 1
            X.7yr r4 = r5.A03(r0, r2)
            android.view.Surface r3 = r5.A0I
            android.view.Surface r2 = r5.A0G
            boolean r3 = X.C18300x5.A1W(r3, r2)
            X.85L r2 = r5.A0o
            r2.BNo(r4, r3)
            X.7fC r2 = X.C155617fC.A02
            monitor-enter(r2)
            monitor-exit(r2)
            goto L_0x00f1
        L_0x0291:
            boolean r2 = r5.A18
            if (r2 != 0) goto L_0x0299
            boolean r2 = r15.includeAllBufferingEvents
            if (r2 == 0) goto L_0x02da
        L_0x0299:
            r5.A08 = r0
            X.7qS r2 = r5.A12
            X.7br r2 = r2.A01
            X.7nh r2 = r2.A08
            boolean r2 = r2.A09
            r5.A0Y = r2
            X.7yr r4 = r5.A03(r0, r6)
            android.view.Surface r3 = r5.A0I
            android.view.Surface r2 = r5.A0G
            boolean r7 = X.C18300x5.A1W(r3, r2)
            X.85L r3 = r5.A0o
            X.7yf r2 = r5.A0y
            r3.BNn(r4, r2, r7)
            X.7fC r8 = X.C155617fC.A02
            monitor-enter(r8)
            boolean r2 = X.C155617fC.A01     // Catch:{ all -> 0x061a }
            if (r2 == 0) goto L_0x02d9
            java.util.Deque r7 = X.C155617fC.A04     // Catch:{ all -> 0x061a }
            monitor-enter(r8)     // Catch:{ all -> 0x061a }
            int r3 = r7.size()     // Catch:{ all -> 0x0617 }
            r2 = 20
            if (r3 < r2) goto L_0x02cd
            r7.poll()     // Catch:{ all -> 0x0617 }
        L_0x02cd:
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0617 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0617 }
            r7.offer(r2)     // Catch:{ all -> 0x0617 }
            monitor-exit(r8)     // Catch:{ all -> 0x061a }
        L_0x02d9:
            monitor-exit(r8)
        L_0x02da:
            boolean r2 = r5.A0i
            if (r2 == 0) goto L_0x02ed
            if (r41 != 0) goto L_0x02ed
            java.lang.String r2 = "Sending delayed play now due to seek"
            A02(r5, r2, r6)
            X.7qS r3 = r5.A12
            r2 = 1
            r3.A0A(r2)
            r5.A0i = r6
        L_0x02ed:
            boolean r2 = r15.setPlayWhenReadyOnRetry
            if (r2 == 0) goto L_0x00f1
            X.6xH r3 = r5.A0M
            X.6xH r2 = X.C142486xH.DASH_LIVE
            if (r3 != r2) goto L_0x00f1
            if (r41 == 0) goto L_0x00f1
            boolean r2 = r5.A18
            if (r2 != 0) goto L_0x00f1
            boolean r2 = r5.A0c
            if (r2 == 0) goto L_0x00f1
            java.lang.String r2 = r5.A0U
            if (r2 == 0) goto L_0x00f1
            java.lang.String r2 = "Sending play for retry after error"
            A02(r5, r2, r6)
            X.7qS r3 = r5.A12
            r2 = 1
            r3.A0A(r2)
            goto L_0x00f1
        L_0x0312:
            boolean r2 = r15.setPlayWhenReadyOnError
            if (r2 != 0) goto L_0x00f1
            r5.A18 = r6
            goto L_0x00f1
        L_0x031a:
            r11 = r25
            goto L_0x009f
        L_0x031e:
            boolean r2 = r5.A0g
            if (r2 == 0) goto L_0x03b4
            r2 = 4
            if (r12 == r2) goto L_0x03b4
            boolean r2 = r5.A0b
            if (r2 != 0) goto L_0x03b4
            X.7yr r4 = r5.A03(r0, r11)
            X.7qS r2 = r5.A12
            X.7br r2 = r2.A01
            X.7nh r2 = r2.A08
            boolean r14 = r2.A09
            boolean r2 = r5.A0a
            if (r2 != 0) goto L_0x037d
            boolean r2 = r15.enableRetryErrorLoggingInCancel
            if (r2 == 0) goto L_0x037a
            java.lang.String r2 = r5.A0T
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x037a
            java.lang.String r30 = "cancel with error thrown"
        L_0x0347:
            X.85L r13 = r5.A0o
            java.lang.String r11 = r5.A0T
            java.lang.String r2 = r5.A0U
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0377
            java.lang.String r10 = r5.A0U
        L_0x0355:
            long r7 = r4.A0H
            long r2 = r5.A0B
            long r7 = r7 - r2
            X.7a6 r2 = r5.A10
            java.lang.String r2 = r2.A08
            r28 = r11
            r29 = r10
            r31 = r2
            r32 = r7
            r34 = r14
            r26 = r13
            r27 = r4
            r26.BOU(r27, r28, r29, r30, r31, r32, r34)
            r2 = r25
            r5.A0T = r2
        L_0x0373:
            r5.A0U = r9
            goto L_0x00bc
        L_0x0377:
            r10 = r25
            goto L_0x0355
        L_0x037a:
            r30 = r25
            goto L_0x0347
        L_0x037d:
            X.85L r3 = r5.A0o
            X.6xQ r2 = X.C142576xQ.FORCE_END
            java.lang.String r8 = r2.value
            r32 = -1
            java.lang.String r7 = r5.A0T
            java.lang.String r2 = r5.A0U
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0393
            java.lang.String r2 = r5.A0U
            r25 = r2
        L_0x0393:
            X.7a6 r2 = r5.A10
            java.lang.String r2 = r2.A08
            r35 = r6
            r27 = r8
            r28 = r9
            r29 = r7
            r30 = r25
            r31 = r2
            r34 = r6
            r25 = r3
            r26 = r4
            r25.BcI(r26, r27, r28, r29, r30, r31, r32, r34, r35)
            X.7a6 r2 = r5.A10
            java.lang.String r2 = r2.A08
            r3.BPY(r4, r2, r11)
            goto L_0x0373
        L_0x03b4:
            boolean r2 = r5.A0g
            if (r2 != 0) goto L_0x03bc
            if (r41 == 0) goto L_0x03bc
            r5.A0B = r0
        L_0x03bc:
            r4 = r9
            goto L_0x00bc
        L_0x03bf:
            X.7qS r10 = r5.A12
            boolean r0 = r10.A0Z
            r2 = r25
            if (r0 == 0) goto L_0x0064
            X.0Su r0 = r10.A08
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            java.util.concurrent.BlockingDeque r0 = r0.A00
            r0.drainTo(r8)
            java.lang.StringBuilder r20 = X.AnonymousClass001.A0o()
            r7 = 0
        L_0x03d7:
            int r0 = r8.size()
            if (r7 >= r0) goto L_0x05d3
            int r1 = r8.size()
            int r1 = r1 - r7
            r0 = 2000(0x7d0, float:2.803E-42)
            int r3 = java.lang.Math.min(r1, r0)
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x05d3
            if (r7 < 0) goto L_0x05d3
            int r0 = r8.size()
            if (r7 >= r0) goto L_0x05d3
            if (r3 <= 0) goto L_0x05d3
            int r19 = r7 + r3
            int r1 = r8.size()
            r0 = r19
            if (r0 > r1) goto L_0x05d3
            java.util.HashMap r14 = X.AnonymousClass001.A0t()
            X.0MG r4 = A00(r8, r7)
            r0 = r23
            java.lang.String[] r2 = new java.lang.String[r0]
            long r0 = r4.A03
            java.lang.String r0 = java.lang.Long.toString(r0)
            r2[r6] = r0
            long r0 = r4.A01
            java.lang.String r0 = java.lang.Long.toString(r0)
            r2[r11] = r0
            long r0 = r4.A02
            java.lang.String r1 = java.lang.Long.toString(r0)
            r0 = 2
            java.util.List r1 = X.AnonymousClass0x9.A1A(r1, r2, r0)
            java.lang.String r0 = "f0"
            r14.put(r0, r1)
            java.lang.String r1 = "version"
            java.lang.Integer r18 = java.lang.Integer.valueOf(r11)
            r0 = r18
            r14.put(r1, r0)
            if (r3 <= r11) goto L_0x05ae
            r4 = r19
        L_0x043d:
            int r4 = r4 + -1
            if (r4 <= r7) goto L_0x04b2
            X.0MG r13 = A00(r8, r4)
            X.0MG r0 = A00(r8, r4)
            long r0 = r0.A03
            int r9 = r4 + -1
            X.0MG r2 = A00(r8, r9)
            long r2 = r2.A03
            long r0 = r0 - r2
            r13.A03 = r0
            X.0MG r13 = A00(r8, r4)
            X.0MG r0 = A00(r8, r4)
            long r0 = r0.A01
            X.0MG r2 = A00(r8, r9)
            long r2 = r2.A01
            long r0 = r0 - r2
            r13.A01 = r0
            X.0MG r13 = A00(r8, r4)
            X.0MG r0 = A00(r8, r4)
            long r0 = r0.A02
            X.0MG r2 = A00(r8, r9)
            long r2 = r2.A02
            long r0 = r0 - r2
            r13.A02 = r0
            X.0MG r13 = A00(r8, r4)
            X.0MG r0 = A00(r8, r9)
            long r0 = r0.A00
            r16 = -1
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x04a4
            r2 = 0
        L_0x048e:
            r13.A00 = r2
            X.0MG r9 = A00(r8, r4)
            X.0MG r0 = A00(r8, r4)
            long r2 = r0.A02
            X.0MG r0 = A00(r8, r4)
            long r0 = r0.A01
            long r2 = r2 - r0
            r9.A02 = r2
            goto L_0x043d
        L_0x04a4:
            X.0MG r0 = A00(r8, r4)
            long r2 = r0.A00
            X.0MG r0 = A00(r8, r9)
            long r0 = r0.A00
            long r2 = r2 - r0
            goto L_0x048e
        L_0x04b2:
            java.util.HashMap r9 = X.AnonymousClass001.A0t()
            int r3 = r7 + 1
            r2 = r3
            r4 = r3
        L_0x04ba:
            r0 = r19
            if (r4 >= r0) goto L_0x0505
            X.0MG r0 = A00(r8, r4)
            long r0 = r0.A03
            r27 = r0
            X.0MG r0 = A00(r8, r4)
            long r0 = r0.A01
            r16 = r0
            java.lang.Long r1 = java.lang.Long.valueOf(r27)
            boolean r0 = r9.containsKey(r1)
            if (r0 == 0) goto L_0x0502
            int r0 = X.AnonymousClass6C8.A0D(r1, r9)
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x04e2:
            r9.put(r1, r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r16)
            boolean r0 = r9.containsKey(r1)
            if (r0 == 0) goto L_0x04ff
            int r0 = X.AnonymousClass6C8.A0D(r1, r9)
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x04f9:
            r9.put(r1, r0)
            int r4 = r4 + 1
            goto L_0x04ba
        L_0x04ff:
            r0 = r18
            goto L_0x04f9
        L_0x0502:
            r0 = r18
            goto L_0x04e2
        L_0x0505:
            java.util.Iterator r9 = X.AnonymousClass001.A0u(r9)
            r16 = 3333(0xd05, double:1.6467E-320)
            r4 = 0
        L_0x050c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0526
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r9)
            int r1 = X.AnonymousClass0x2.A08(r0)
            if (r4 >= r1) goto L_0x050c
            java.lang.Object r0 = r0.getKey()
            long r16 = X.C18310x6.A0B(r0)
            r4 = r1
            goto L_0x050c
        L_0x0526:
            r0 = r19
            if (r3 >= r0) goto L_0x0549
            X.0MG r4 = A00(r8, r3)
            X.0MG r0 = A00(r8, r3)
            long r0 = r0.A03
            long r0 = r0 - r16
            r4.A03 = r0
            X.0MG r4 = A00(r8, r3)
            X.0MG r0 = A00(r8, r3)
            long r0 = r0.A01
            long r0 = r0 - r16
            r4.A01 = r0
            int r3 = r3 + 1
            goto L_0x0526
        L_0x0549:
            java.lang.Long r1 = java.lang.Long.valueOf(r16)
            java.lang.String r0 = "baseDelta"
            r14.put(r0, r1)
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            r13 = 0
        L_0x055b:
            r0 = r19
            if (r2 >= r0) goto L_0x0593
            X.0MG r0 = A00(r8, r2)
            long r0 = r0.A03
            X.AnonymousClass0x2.A1Q(r3, r0)
            X.0MG r0 = A00(r8, r2)
            long r0 = r0.A01
            X.AnonymousClass0x2.A1Q(r3, r0)
            X.0MG r0 = A00(r8, r2)
            long r0 = r0.A02
            X.AnonymousClass0x2.A1Q(r3, r0)
            X.0MG r0 = A00(r8, r2)
            long r0 = r0.A00
            X.AnonymousClass0x2.A1Q(r4, r0)
            X.0MG r0 = A00(r8, r2)
            long r0 = r0.A00
            r16 = 0
            int r9 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r9 == 0) goto L_0x0590
            r13 = 1
        L_0x0590:
            int r2 = r2 + 1
            goto L_0x055b
        L_0x0593:
            java.lang.String r1 = "fn"
            java.lang.String r0 = X.C05300Su.A00(r3)
            r14.put(r1, r0)
            java.lang.String r1 = "fAudio"
            java.lang.String r0 = X.C05300Su.A00(r4)
            r14.put(r1, r0)
            java.lang.String r1 = "isSoundOn"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)
            r14.put(r1, r0)
        L_0x05ae:
            java.lang.String r2 = X.C18280x3.A0d(r14)
            int r1 = r2.length()
            r0 = 900000(0xdbba0, float:1.261169E-39)
            if (r1 <= r0) goto L_0x05bd
            java.lang.String r2 = "{\"err\":\"SIZE_EXCEED_MAX_CAP\"}"
        L_0x05bd:
            int r0 = r20.length()
            if (r0 == 0) goto L_0x05ca
            java.lang.String r1 = "|"
            r0 = r20
            r0.append(r1)
        L_0x05ca:
            r0 = r20
            r0.append(r2)
            int r7 = r7 + 2000
            goto L_0x03d7
        L_0x05d3:
            java.lang.String r2 = r20.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0608
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0608
            java.lang.String r0 = r10.A0G
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x05fc
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r10.A0G
            r1.append(r0)
            java.lang.String r0 = "|"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            r10.A0G = r0
        L_0x05fc:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r10.A0G
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r2, r1)
            r10.A0G = r0
        L_0x0608:
            java.lang.String r2 = r10.A0G
            r0 = r25
            r10.A0G = r0
            goto L_0x0064
        L_0x0610:
            java.lang.String r0 = "Invalid playbackState"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x0617:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x061a }
            throw r0     // Catch:{ all -> 0x061a }
        L_0x061a:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162987t5.A0D(int, long, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
        if (r1 > r0) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E(long r12) {
        /*
            r11 = this;
            r0 = 0
            X.7yr r7 = r11.A03(r12, r0)
            X.7yr r8 = r11.A0z
            X.8LG r6 = r11.A0p
            int r0 = r6.needUpdatePlayerStateThresholdMs
            long r2 = (long) r0
            int r0 = r6.needUpdateStateByPositionOffsetThresholdMs
            long r9 = (long) r0
            long r4 = r7.A0H
            long r0 = r8.A0H
            long r4 = r4 - r0
            boolean r1 = r7.A0R
            boolean r0 = r8.A0R
            if (r1 != r0) goto L_0x00b0
            boolean r1 = r7.A0U
            boolean r0 = r8.A0U
            if (r1 != r0) goto L_0x00b0
            boolean r1 = r7.A0P
            boolean r0 = r8.A0P
            if (r1 != r0) goto L_0x00b0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b0
            float r1 = r7.A00
            float r0 = r8.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00b0
            long r2 = r7.A08
            long r0 = r8.A08
            long r2 = r2 - r0
            long r1 = X.AnonymousClass6C9.A0N(r2, r4)
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x00b0
            long r2 = r7.A0E
            long r0 = r8.A0E
            long r2 = r2 - r0
            long r1 = X.AnonymousClass6C9.A0N(r2, r4)
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x00b0
            int r1 = r11.A03
            int r0 = r6.checkPlayerStateIntervalIncreaseMs
            int r1 = r1 + r0
            r11.A03 = r1
            int r0 = r6.checkPlayerStateMaxIntervalMs
            if (r1 <= r0) goto L_0x0059
        L_0x0057:
            r11.A03 = r0
        L_0x0059:
            X.7a6 r0 = r11.A10
            if (r0 == 0) goto L_0x0087
            X.7a6 r0 = r11.A10
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0087
            boolean r0 = r6.enableLiveBroadcastErrorUI
            if (r0 == 0) goto L_0x0087
            X.7yf r0 = r11.A0y
            int r1 = r0.A00
            int r0 = r6.staleManifestThresholdToShowInterruptUI
            r3 = 1
            r2 = 0
            boolean r1 = X.C18280x3.A1U(r1, r0)
            boolean r0 = r11.A0d
            if (r0 != 0) goto L_0x00a1
            if (r1 == 0) goto L_0x0087
            int r1 = r11.A04
            r0 = 2
            if (r1 != r0) goto L_0x0087
            X.85L r0 = r11.A0o
            r0.BVD(r3)
            r11.A0d = r3
        L_0x0087:
            X.7a6 r1 = r11.A10
            android.os.Handler r3 = r11.A0l
            r2 = 10
            r3.removeMessages(r2)
            boolean r0 = r11.A18
            if (r0 == 0) goto L_0x00a0
            if (r1 == 0) goto L_0x00ba
            boolean r0 = r1.A09
            if (r0 == 0) goto L_0x00ba
            int r1 = android.os.Build.VERSION.SDK_INT
            int r0 = r6.sdkVersionToBypassHeroStateRefresh
            if (r1 > r0) goto L_0x00ba
        L_0x00a0:
            return
        L_0x00a1:
            if (r1 == 0) goto L_0x00a8
            int r1 = r11.A04
            r0 = 3
            if (r1 != r0) goto L_0x0087
        L_0x00a8:
            X.85L r0 = r11.A0o
            r0.BVD(r2)
            r11.A0d = r2
            goto L_0x0087
        L_0x00b0:
            X.85L r0 = r11.A0o
            r0.BYO(r7)
            r11.A0z = r7
            int r0 = r6.checkPlayerStateMinIntervalMs
            goto L_0x0057
        L_0x00ba:
            int r0 = r11.A03
            long r0 = (long) r0
            r3.sendEmptyMessageDelayed(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162987t5.A0E(long):void");
    }

    public void A0F(long j, boolean z) {
        A0K("Play", new Object[0]);
        this.A0r.set(false);
        this.A0s.compareAndSet(false, z);
        Handler handler = this.A0l;
        Object[] A0L2 = AnonymousClass002.A0L();
        AnonymousClass000.A1Q(A0L2, 0, j);
        A01(handler, this, A0L2, 2);
    }

    public final void A0N(boolean z) {
        A0K("enableVideoTrackInternal", new Object[0]);
        if (this.A12.A02(0) == -1 && z) {
            C159597m9.A00(this, "HeroService", "Enable video track", new Object[0]);
            this.A12.A05(0, 0);
        } else if (this.A12.A02(0) != -1 && !z) {
            C159597m9.A00(this, "HeroService", "Disable video track", new Object[0]);
            this.A12.A05(0, -1);
        }
    }

    public final void A0O(boolean z) {
        A0K("resetInternal", new Object[0]);
        if (this.A17) {
            this.A0o.Bfh("EXOPLAYER2_UNEXPECTED", "RESET_INTERNAL_REQUESTED_AFTER_RELEASED", "resetInternal requested after released");
        }
        A0Q(false, (String) null);
        AnonymousClass8LG r1 = this.A0p;
        if (!r1.enablePauseNow) {
            A0D(this.A04, SystemClock.elapsedRealtime(), false, false);
        }
        Surface surface = this.A0H;
        if (r1.releaseSurfaceInServicePlayerReset) {
            this.A0I = null;
            this.A0G = null;
            this.A0H = null;
            this.A0C = -1;
            this.A07 = -1;
            A0H((Surface) null, true);
        }
        this.A0H = surface;
        this.A12.A01.A0B(true);
        AnonymousClass81Q r3 = this.A12.A01.A0K;
        if (r3.A0q) {
            r3.A0k.A01(0);
        }
        r3.A0i.A01(0);
        A09();
        this.A12.A08(this.A0P);
        if (z) {
            this.A0l.removeMessages(9);
        }
    }

    public final void A0P(boolean z) {
        C153737br r0;
        A0K("retryInternal", new Object[0]);
        if (!(!z || (r0 = this.A12.A01) == null || r0.A08.A00 == 1)) {
            A02(this, "Stopping non idle exoplayer", 0);
            this.A12.A01.A0B(false);
        }
        C153737br r3 = this.A12.A01;
        C185778uE r2 = r3.A0A;
        if (r2 != null && r3.A08.A00 == 1) {
            r3.A0A(r2, false, false);
        }
    }

    public static void A02(C162987t5 r1, String str, int i) {
        r1.A0K(str, new Object[i]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (r0.A18 == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0111, code lost:
        if (r5.A09(r2.A0M, r2.A00(), 0).A0A == false) goto L_0x0113;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C166537yr A03(long r59, boolean r61) {
        /*
            r58 = this;
            r7 = 0
            r2 = -1
            r6 = 0
            r0 = r58
            r26 = r59
            if (r61 == 0) goto L_0x013e
            long r4 = r0.A08
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x013e
            boolean r11 = r0.A0Y
            r0.A08 = r2
            r0.A0Y = r6
            r44 = r26
        L_0x0019:
            long r2 = r0.A09
            int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r1 > 0) goto L_0x0029
            X.7qS r1 = r0.A12
            X.7br r1 = r1.A01
            long r1 = r1.A01()
            r0.A09 = r1
        L_0x0029:
            X.7qS r1 = r0.A12
            X.7jX r10 = r1.A03
            X.7qS r1 = r0.A12
            X.7br r1 = r1.A01
            boolean r1 = r1.A0F
            if (r1 == 0) goto L_0x003b
            boolean r1 = r0.A18
            r52 = 1
            if (r1 != 0) goto L_0x003d
        L_0x003b:
            r52 = 0
        L_0x003d:
            boolean r1 = r0.A0f
            r17 = r1
            long r1 = r0.A08
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            boolean r54 = X.AnonymousClass001.A1W(r3)
            long r1 = r0.A09
            r20 = r1
            X.7qS r1 = r0.A12
            long r32 = r1.A03()
            X.7qS r1 = r0.A12
            X.7br r1 = r1.A01
            X.81Q r6 = r1.A0K
            boolean r1 = r6.A0q
            r2 = 1000(0x3e8, double:4.94E-321)
            if (r1 == 0) goto L_0x0136
            X.821 r1 = r6.A0k
            long r34 = r1.BBa()
        L_0x0065:
            long r34 = r34 / r2
            X.7qS r2 = r0.A12
            X.8LG r1 = r2.A0R
            boolean r1 = r1.isExo2UseAbsolutePosition
            if (r1 == 0) goto L_0x0120
            X.7br r1 = r2.A01
            X.7nh r1 = r1.A08
            long r1 = r1.A0C
            long r2 = com.facebook.android.exoplayer2.util.Util.A05(r1)
        L_0x0079:
            X.7qS r1 = r0.A12
            X.7br r1 = r1.A01
            X.7nh r1 = r1.A08
            long r6 = r1.A0B
            long r38 = com.facebook.android.exoplayer2.util.Util.A05(r6)
            X.7qS r1 = r0.A12
            X.8v7 r1 = r1.A02
            if (r1 == 0) goto L_0x011d
            X.7ZV r1 = r1.B4U()
            if (r1 == 0) goto L_0x011d
            int r1 = r1.A00()
        L_0x0095:
            long r14 = (long) r1
            X.6xH r1 = r0.A0M
            java.lang.String r16 = r1.toString()
            r18 = 0
            long r12 = r0.A0A
            r48 = -1
            X.7Pv r1 = r0.A0K
            if (r1 == 0) goto L_0x0119
            int r6 = r1.A03
            int r7 = r1.A0A
            int r6 = r6 + r7
            int r9 = r1.A07
            int r8 = r1.A00
        L_0x00af:
            float r10 = r10.A01
            X.7qS r1 = r0.A12
            X.7br r1 = r1.A01
            int r25 = r1.A00()
            X.7qS r1 = r0.A12
            if (r1 == 0) goto L_0x0117
            X.7a5 r1 = r1.A05
            if (r1 == 0) goto L_0x0117
            boolean r7 = r1.A0D
        L_0x00c3:
            r30 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            X.7yr r1 = new X.7yr
            r22 = r18
            r24 = r18
            r57 = r18
            r19 = r18
            r28 = r20
            r36 = r2
            r40 = r14
            r42 = r4
            r46 = r12
            r50 = r48
            r53 = r17
            r55 = r11
            r56 = r7
            r15 = r1
            r17 = r10
            r20 = r6
            r21 = r9
            r23 = r8
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r30, r32, r34, r36, r38, r40, r42, r44, r46, r48, r50, r52, r53, r54, r55, r56, r57)
            X.7qS r0 = r0.A12
            X.7br r2 = r0.A01
            X.7nh r0 = r2.A08
            com.facebook.android.exoplayer2.Timeline r5 = r0.A03
            int r0 = r5.A01()
            boolean r0 = X.AnonymousClass000.A1T(r0)
            if (r0 != 0) goto L_0x0113
            int r4 = r2.A00()
            X.80j r0 = r2.A0M
            r2 = 0
            X.80j r0 = r5.A09(r0, r4, r2)
            boolean r2 = r0.A0A
            r0 = 1
            if (r2 != 0) goto L_0x0114
        L_0x0113:
            r0 = 0
        L_0x0114:
            r1.A0T = r0
            return r1
        L_0x0117:
            r7 = 0
            goto L_0x00c3
        L_0x0119:
            r6 = 0
            r9 = 0
            r8 = 0
            goto L_0x00af
        L_0x011d:
            r1 = 0
            goto L_0x0095
        L_0x0120:
            X.7br r3 = r2.A01
            boolean r1 = r3.A0C()
            if (r1 == 0) goto L_0x012c
            long r2 = r3.A06
            goto L_0x0079
        L_0x012c:
            X.7nh r1 = r3.A08
            long r1 = r1.A0C
            long r2 = r3.A02(r1)
            goto L_0x0079
        L_0x0136:
            X.820 r1 = r6.A0i
            long r34 = r1.BBa()
            goto L_0x0065
        L_0x013e:
            r4 = -1
            r44 = -1
            r11 = 0
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162987t5.A03(long, boolean):X.7yr");
    }

    public final AnonymousClass8L8 A04() {
        C161397pY r4;
        int A012;
        int i;
        AnonymousClass8LG r2 = this.A0p;
        if (r2.useNetworkAwareSettingsForUnstallBuffer && (r4 = (C161397pY) this.A0x.get()) != null) {
            if (this.A10 != null && this.A10.A00()) {
                A012 = r4.A01(4);
                i = 5;
            } else if (this.A10 == null || !"fb_stories".equalsIgnoreCase(this.A10.A0F.A0B) || r2.disableStoriesCustomizedUnstallBuffer) {
                A012 = r4.A01(2);
                i = 3;
            } else {
                A012 = r4.A01(6);
                i = 7;
            }
            AnonymousClass8L8 r1 = new AnonymousClass8L8(A012, r4.A01(i));
            if (r1.minBufferMs > 0 && r1.minRebufferMs > 0) {
                return r1;
            }
        }
        if (this.A10 != null && this.A10.A00()) {
            AnonymousClass8L8 r12 = r2.unstallBufferSettingLive;
            if (r12.minBufferMs > 0 && r12.minRebufferMs > 0) {
                return r12;
            }
        }
        return r2.unstallBufferSetting;
    }

    public final String A05() {
        if (this.A10 == null || this.A10.A0F.A05 == null) {
            return "";
        }
        return this.A10.A0F.A05.toString();
    }

    public final String A06() {
        C152777a6 r0 = this.A10;
        if (r0 != null) {
            return r0.A0F.A0H;
        }
        return null;
    }

    public final void A08() {
        if (this.A0Z && this.A16) {
            A02(this, "Call ExoPlayer.prepare()", 0);
            C161787qS r0 = this.A12;
            boolean z = this.A0j;
            C185778uE r2 = r0.A04;
            if (r2 != null) {
                r0.A01.A0A(r2, z, true);
            }
            if (this.A0j) {
                this.A0j = false;
            }
            AnonymousClass8LG r5 = this.A0p;
            if (r5.forceStereoToMonoConversion) {
                A0K("convertStereoToMono", new Object[0]);
                A01(this.A0l, this, true, 32);
            }
            if (r5.enableWifiLockManager) {
                throw AnonymousClass001.A0g("isOnWifi");
            }
            C152777a6 r3 = this.A10;
            Set set = r5.wakelockOriginLists;
            if (!set.isEmpty() && r3 != null && (set.contains("all_origin") || set.contains(r3.A0F.A0C))) {
                A0L(true);
            }
            this.A16 = false;
        }
    }

    public final void A0G(Message message) {
        if (!this.A17) {
            this.A0l.sendMessage(message);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        X.C18300x5.A11();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0H(android.view.Surface r4, boolean r5) {
        /*
            r3 = this;
            X.7qS r0 = r3.A12
            X.7br r2 = r0.A01
            X.8x9[] r1 = r0.A0I
            r0 = 0
            r0 = r1[r0]
            X.7af r2 = r2.A04(r0)
            r0 = 1
            r2.A01(r0)
            r2.A02(r4)
            r2.A00()
            if (r5 == 0) goto L_0x0040
            monitor-enter(r2)     // Catch:{ InterruptedException -> 0x003d }
            boolean r0 = r2.A07     // Catch:{ all -> 0x003a }
            X.C159197lM.A02(r0)     // Catch:{ all -> 0x003a }
            android.os.Looper r0 = r2.A03     // Catch:{ all -> 0x003a }
            java.lang.Thread r1 = r0.getThread()     // Catch:{ all -> 0x003a }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x003a }
            boolean r0 = X.C18300x5.A1W(r1, r0)
            X.C159197lM.A02(r0)     // Catch:{ all -> 0x003a }
        L_0x0030:
            boolean r0 = r2.A06     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x0038
            r2.wait()     // Catch:{ all -> 0x003a }
            goto L_0x0030
        L_0x0038:
            monitor-exit(r2)     // Catch:{ InterruptedException -> 0x003d }
            goto L_0x0040
        L_0x003a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ InterruptedException -> 0x003d }
            throw r0     // Catch:{ InterruptedException -> 0x003d }
        L_0x003d:
            X.C18300x5.A11()
        L_0x0040:
            r3.A0G = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162987t5.A0H(android.view.Surface, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0063, code lost:
        r1 = X.C18320x8.A0s("Proxy-Status", r1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0I(X.C143946zk r19, X.C142846xt r20) {
        /*
            r18 = this;
            r7 = r20
            X.6xw r6 = X.C142876xw.A07
            r11 = r19
            java.lang.String r10 = r11.getMessage()
            java.lang.Throwable r0 = r11.getCause()
            boolean r0 = r0 instanceof java.io.IOException
            r12 = 0
            r9 = 1
            java.lang.String r3 = ""
            r17 = r3
            r5 = r18
            if (r0 == 0) goto L_0x0240
            java.lang.Throwable r2 = r11.getCause()
            boolean r0 = r2 instanceof X.C140626uD
            if (r0 == 0) goto L_0x0026
            X.6xt r7 = X.C142846xt.A01
            X.6xw r6 = X.C142876xw.A01
        L_0x0026:
            boolean r0 = r2 instanceof X.AnonymousClass6KQ
            if (r0 != 0) goto L_0x0036
            java.lang.Throwable r0 = r2.getCause()
            boolean r0 = r0 instanceof X.AnonymousClass6KQ
            if (r0 == 0) goto L_0x0077
            java.lang.Throwable r2 = r2.getCause()
        L_0x0036:
            X.6KQ r2 = (X.AnonymousClass6KQ) r2
            if (r2 == 0) goto L_0x0077
            int r1 = r2.responseCode
            r0 = 200(0xc8, float:2.8E-43)
            r3 = 417(0x1a1, float:5.84E-43)
            if (r1 == r0) goto L_0x0219
            r0 = 302(0x12e, float:4.23E-43)
            if (r1 == r0) goto L_0x0215
            r0 = 410(0x19a, float:5.75E-43)
            if (r1 == r0) goto L_0x0211
            if (r1 == r3) goto L_0x0219
            r0 = 429(0x1ad, float:6.01E-43)
            if (r1 == r0) goto L_0x020d
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 == r0) goto L_0x0209
            r0 = 403(0x193, float:5.65E-43)
            if (r1 == r0) goto L_0x0205
            r0 = 404(0x194, float:5.66E-43)
            if (r1 == r0) goto L_0x0201
            switch(r1) {
                case 502: goto L_0x01f5;
                case 503: goto L_0x01f9;
                case 504: goto L_0x01fd;
                default: goto L_0x005f;
            }
        L_0x005f:
            java.util.Map r1 = r2.headerFields
            if (r1 == 0) goto L_0x01f2
            java.lang.String r0 = "Proxy-Status"
            java.util.List r1 = X.C18320x8.A0s(r0, r1)
            if (r1 == 0) goto L_0x01f2
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x01f2
            java.lang.Object r3 = X.C18290x4.A0k(r1)
            java.lang.String r3 = (java.lang.String) r3
        L_0x0077:
            r2 = 5
            r16 = 0
            if (r10 == 0) goto L_0x01c2
            java.lang.String r0 = "TigonError"
            boolean r0 = r10.contains(r0)
            if (r0 == 0) goto L_0x01c2
            X.6xt r7 = X.C142846xt.A0A
            java.lang.String r0 = "TigonLigerErrorDomain"
            boolean r0 = r10.contains(r0)
            if (r0 == 0) goto L_0x01aa
            X.6xw r6 = X.C142876xw.A0P
        L_0x0090:
            X.6xt r0 = X.C142846xt.A02
            if (r7 != r0) goto L_0x00a1
            r13 = r11
            java.lang.String r10 = r11.getMessage()
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L_0x010f
            java.lang.String r10 = "Decoder init failed"
        L_0x00a1:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r8 = 2
            if (r0 == 0) goto L_0x00c6
            java.lang.Throwable r0 = r11.getCause()
            if (r0 == 0) goto L_0x010a
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.String r0 = X.C18310x6.A0n(r11)
            r1[r16] = r0
            java.lang.Throwable r0 = r11.getCause()
            java.lang.String r0 = X.C18310x6.A0n(r0)
            r1[r9] = r0
            java.lang.String r0 = "%s. Cause: %s"
            java.lang.String r10 = java.lang.String.format(r0, r1)
        L_0x00c6:
            X.6xw r0 = X.C142876xw.A09
            if (r6 != r0) goto L_0x02b5
            java.lang.Throwable r15 = r11.getCause()
            r13 = 1
        L_0x00cf:
            if (r15 == 0) goto L_0x02b5
            java.lang.Throwable r0 = r15.getCause()
            if (r0 == 0) goto L_0x02b5
            java.lang.Throwable r0 = r15.getCause()
            java.lang.String r14 = X.C18310x6.A0n(r0)
            boolean r0 = r10.contains(r14)
            if (r0 != 0) goto L_0x0101
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r16] = r10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r4[r9] = r1
            r4[r8] = r14
            r0 = 3
            r4[r0] = r1
            java.lang.String r1 = X.AnonymousClass6CA.A0U(r15)
            r0 = 4
            r4[r0] = r1
            java.lang.String r0 = "%s [Cause%d: %s; Message%d: %s]"
            java.lang.String r10 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe((java.lang.String) r0, (java.lang.Object[]) r4)
        L_0x0101:
            java.lang.Throwable r15 = r15.getCause()
            int r13 = r13 + 1
            if (r13 >= r2) goto L_0x02b5
            goto L_0x00cf
        L_0x010a:
            java.lang.String r10 = X.C18310x6.A0n(r11)
            goto L_0x00c6
        L_0x010f:
            java.lang.String r0 = ","
            java.lang.String[] r0 = r10.split(r0)
            r1 = r0[r16]
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x011e
            r10 = r1
        L_0x011e:
            java.lang.Throwable r0 = r11.getCause()
            java.lang.String r8 = "%s. Cause: %s"
            r1 = 2
            if (r0 == 0) goto L_0x01a1
            java.lang.String r0 = X.AnonymousClass6CA.A0U(r11)
            if (r0 == 0) goto L_0x01a1
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r4[r16] = r10
            java.lang.String r0 = X.AnonymousClass6CA.A0U(r11)
        L_0x0135:
            r4[r9] = r0
            java.lang.String r10 = java.lang.String.format(r8, r4)
            X.8LG r0 = r5.A0p
            boolean r0 = r0.enableAdditionalDecoderInitFailureMessage
            if (r0 == 0) goto L_0x016d
            java.lang.Throwable r0 = r11.getCause()
            if (r0 == 0) goto L_0x019c
            java.lang.Throwable r0 = r11.getCause()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            if (r0 == 0) goto L_0x019c
            java.lang.Throwable r0 = r11.getCause()
            java.lang.String r8 = android.util.Log.getStackTraceString(r0)
        L_0x0159:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x016d
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0l(r10)
            java.lang.String r0 = ". Stack Track: "
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r4)
            java.lang.String r10 = X.AnonymousClass000.A0T(r0, r8)
        L_0x016d:
            java.lang.Throwable r0 = r13.getCause()
            boolean r0 = r0 instanceof X.C143826zX
            if (r0 == 0) goto L_0x0195
            java.lang.Throwable r0 = r13.getCause()
            X.6zX r0 = (X.C143826zX) r0
            java.lang.String r0 = r0.diagnosticInfo
            if (r0 == 0) goto L_0x0195
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r16] = r10
            java.lang.Throwable r0 = r13.getCause()
            X.6zX r0 = (X.C143826zX) r0
            java.lang.String r0 = r0.diagnosticInfo
            r1[r9] = r0
            java.lang.String r0 = "%s. DiagnosticInfo: %s"
            java.lang.String r10 = java.lang.String.format(r12, r0, r1)
            goto L_0x00a1
        L_0x0195:
            java.lang.Throwable r13 = r13.getCause()
            if (r13 == 0) goto L_0x00a1
            goto L_0x016d
        L_0x019c:
            java.lang.String r8 = android.util.Log.getStackTraceString(r11)
            goto L_0x0159
        L_0x01a1:
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r4[r16] = r10
            java.lang.Throwable r0 = r11.getCause()
            goto L_0x0135
        L_0x01aa:
            java.lang.String r0 = "TigonIdleTimeoutDomain"
            boolean r0 = r10.contains(r0)
            if (r0 == 0) goto L_0x01b6
            X.6xw r6 = X.C142876xw.A0O
            goto L_0x0090
        L_0x01b6:
            java.lang.String r0 = "TigonConnectionTimeoutDomain"
            boolean r0 = r10.contains(r0)
            if (r0 == 0) goto L_0x0090
            X.6xw r6 = X.C142876xw.A0N
            goto L_0x0090
        L_0x01c2:
            X.6xw r8 = X.C142876xw.A05
            if (r6 != r8) goto L_0x01ca
            X.6xt r7 = X.C142846xt.A02
            goto L_0x0090
        L_0x01ca:
            X.6xw r0 = X.C142876xw.A08
            if (r6 != r0) goto L_0x01d2
            X.6xt r7 = X.C142846xt.A09
            goto L_0x0090
        L_0x01d2:
            r4 = r11
            r1 = 0
        L_0x01d4:
            java.lang.Throwable r0 = r4.getCause()
            if (r0 == 0) goto L_0x0090
            java.lang.Throwable r0 = r4.getCause()
            boolean r0 = r0 instanceof X.C143826zX
            if (r0 == 0) goto L_0x01e7
            X.6xt r7 = X.C142846xt.A02
            r6 = r8
            goto L_0x0090
        L_0x01e7:
            java.lang.Throwable r4 = r4.getCause()
            int r1 = r1 + 1
            if (r1 >= r2) goto L_0x0090
            if (r4 == 0) goto L_0x0090
            goto L_0x01d4
        L_0x01f2:
            r3 = 0
            goto L_0x0077
        L_0x01f5:
            X.6xw r6 = X.C142876xw.A0K
            goto L_0x005f
        L_0x01f9:
            X.6xw r6 = X.C142876xw.A0L
            goto L_0x005f
        L_0x01fd:
            X.6xw r6 = X.C142876xw.A0M
            goto L_0x005f
        L_0x0201:
            X.6xw r6 = X.C142876xw.A0F
            goto L_0x005f
        L_0x0205:
            X.6xw r6 = X.C142876xw.A0E
            goto L_0x005f
        L_0x0209:
            X.6xw r6 = X.C142876xw.A0J
            goto L_0x005f
        L_0x020d:
            X.6xw r6 = X.C142876xw.A0I
            goto L_0x005f
        L_0x0211:
            X.6xw r6 = X.C142876xw.A0G
            goto L_0x005f
        L_0x0215:
            X.6xw r6 = X.C142876xw.A0D
            goto L_0x005f
        L_0x0219:
            r5.A0b = r9
            java.util.Map r1 = r2.headerFields
            java.lang.String r0 = "x-fb-video-replica"
            java.util.List r1 = X.C18320x8.A0s(r0, r1)
            if (r1 == 0) goto L_0x0239
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0239
            java.lang.Object r10 = X.C18290x4.A0k(r1)
            java.lang.String r10 = (java.lang.String) r10
        L_0x0231:
            int r0 = r2.responseCode
            if (r0 != r3) goto L_0x023c
            X.6xw r6 = X.C142876xw.A0H
            goto L_0x005f
        L_0x0239:
            java.lang.String r10 = "invalid-replica-number"
            goto L_0x0231
        L_0x023c:
            X.6xw r6 = X.C142876xw.A08
            goto L_0x005f
        L_0x0240:
            java.lang.String r0 = r11.getMessage()
            java.lang.String r1 = "Decoder init failed"
            if (r0 == 0) goto L_0x0256
            java.lang.String r0 = r11.getMessage()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0256
        L_0x0252:
            X.6xw r6 = X.C142876xw.A05
            goto L_0x0077
        L_0x0256:
            java.lang.Throwable r0 = r11.getCause()
            if (r0 == 0) goto L_0x0277
            java.lang.String r0 = X.AnonymousClass6CA.A0U(r11)
            if (r0 == 0) goto L_0x0277
            java.lang.String r0 = X.AnonymousClass6CA.A0U(r11)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0277
            java.lang.String r0 = X.AnonymousClass6CA.A0U(r11)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0277
            goto L_0x0252
        L_0x0277:
            java.lang.Throwable r0 = r11.getCause()
            boolean r0 = r0 instanceof X.C143556z5
            if (r0 == 0) goto L_0x0283
            X.6xw r6 = X.C142876xw.A02
            goto L_0x0077
        L_0x0283:
            java.lang.Throwable r0 = r11.getCause()
            boolean r1 = r0 instanceof java.lang.IllegalStateException
            java.lang.Throwable r0 = r11.getCause()
            if (r1 == 0) goto L_0x02a9
            java.lang.String r0 = r0.getMessage()
            if (r0 == 0) goto L_0x02a5
            java.lang.String r1 = X.AnonymousClass6CA.A0U(r11)
            java.lang.String r0 = "Media source is null"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x02a5
            X.6xw r6 = X.C142876xw.A0B
            goto L_0x0077
        L_0x02a5:
            X.6xw r6 = X.C142876xw.A09
            goto L_0x0077
        L_0x02a9:
            boolean r0 = r0 instanceof X.C144056zw
            if (r0 == 0) goto L_0x02b1
            X.6xw r6 = X.C142876xw.A0R
            goto L_0x0077
        L_0x02b1:
            X.6xw r6 = X.C142876xw.A0C
            goto L_0x0077
        L_0x02b5:
            boolean r0 = r11 instanceof X.AnonymousClass6JW
            if (r0 == 0) goto L_0x031f
            r4 = r11
            X.6JW r4 = (X.AnonymousClass6JW) r4
            int r0 = r4.type
            if (r0 != r9) goto L_0x031f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r10)
            java.lang.String r0 = ". Renderer index="
            r1.append(r0)
            int r10 = r4.rendererIndex
            r1.append(r10)
            java.lang.String r0 = ", type="
            r1.append(r0)
            X.7qS r0 = r5.A12
            if (r0 == 0) goto L_0x03e5
            X.8x9[] r0 = r0.A0I
            if (r0 != 0) goto L_0x03d5
            java.lang.String r0 = "?"
        L_0x02dd:
            r1.append(r0)
            java.lang.String r0 = ", format="
            r1.append(r0)
            X.7z1 r0 = r4.rendererFormat
            r1.append(r0)
            java.lang.String r0 = ", rendererSupport="
            r1.append(r0)
            int r0 = r4.rendererFormatSupport
            java.lang.String r0 = com.facebook.android.exoplayer2.util.Util.A08(r0)
            java.lang.String r10 = X.AnonymousClass000.A0X(r0, r1)
            int r0 = r4.type
            boolean r0 = X.AnonymousClass6C9.A1M(r0)
            X.C159197lM.A02(r0)
            java.lang.Throwable r1 = r4.getCause()
            r1.getClass()
            java.lang.Exception r1 = (java.lang.Exception) r1
            boolean r0 = r1 instanceof X.C143826zX
            if (r0 == 0) goto L_0x03c4
            X.6zX r1 = (X.C143826zX) r1
            X.7nt r0 = r1.codecInfo
            if (r0 != 0) goto L_0x03c0
            java.lang.Throwable r0 = r1.getCause()
            boolean r0 = r0 instanceof X.C143126yN
            if (r0 == 0) goto L_0x03b4
            java.lang.String r12 = "error querying decoder"
        L_0x031f:
            X.8LG r4 = r5.A0p
            boolean r0 = r4.enableUnexpectedExoExceptionLogging
            if (r0 == 0) goto L_0x0343
            X.6xw r0 = X.C142876xw.A0C
            if (r6 != r0) goto L_0x0343
            X.6xt r0 = X.C142846xt.A07
            if (r7 != r0) goto L_0x0343
            java.lang.String r11 = android.util.Log.getStackTraceString(r11)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "message: "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = " stacktrace: "
            java.lang.String r10 = X.AnonymousClass000.A0V(r0, r11, r1)
        L_0x0343:
            X.7n4 r11 = new X.7n4
            r11.<init>(r6, r7, r10, r3)
            if (r12 == 0) goto L_0x034c
            r11.A00 = r12
        L_0x034c:
            java.lang.String r3 = r11.A03
            r5.A0T = r3
            android.os.Handler r10 = r5.A0l
            java.lang.Object[] r7 = new java.lang.Object[r2]
            X.6xt r6 = r11.A02
            java.lang.String r0 = r6.value
            r7[r16] = r0
            X.6xw r0 = r11.A01
            java.lang.String r2 = r0.name()
            r7[r9] = r2
            r7[r8] = r3
            java.lang.String r1 = r11.A04
            if (r1 != 0) goto L_0x036a
            r1 = r17
        L_0x036a:
            r0 = 3
            r7[r0] = r1
            java.lang.String r0 = r11.A00
            if (r0 == 0) goto L_0x0373
            r17 = r0
        L_0x0373:
            r0 = 4
            r7[r0] = r17
            r0 = 12
            A01(r10, r5, r7, r0)
            boolean r0 = r4.reportExceptionsAsSoftErrors
            if (r0 == 0) goto L_0x03b3
            java.util.Set r1 = r4.softErrorErrorDomainBlacklist
            java.lang.String r0 = r6.name()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x03b3
            java.util.Set r0 = r4.softErrorErrorCodeBlacklist
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x03b3
            if (r3 == 0) goto L_0x03b3
            java.util.Set r0 = r4.softErrorErrorMessageBlacklist
            java.util.Iterator r2 = r0.iterator()
        L_0x039b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x03b3
            java.lang.String r1 = X.AnonymousClass001.A0m(r2)
            if (r1 == 0) goto L_0x039b
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x039b
            boolean r0 = r3.contains(r1)
            if (r0 == 0) goto L_0x039b
        L_0x03b3:
            return
        L_0x03b4:
            boolean r0 = r1.secureDecoderRequired
            if (r0 == 0) goto L_0x03bc
            java.lang.String r12 = "error no secure decoder"
            goto L_0x031f
        L_0x03bc:
            java.lang.String r12 = "no secure decoder"
            goto L_0x031f
        L_0x03c0:
            java.lang.String r12 = "error instantiating decoder"
            goto L_0x031f
        L_0x03c4:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "exoplayer_error_type_"
            r1.append(r0)
            int r0 = r4.type
            java.lang.String r12 = X.AnonymousClass000.A0h(r1, r0)
            goto L_0x031f
        L_0x03d5:
            r0 = r0[r10]
            X.80p r0 = (X.C1673180p) r0
            int r0 = r0.A0B
            if (r0 == r9) goto L_0x03e1
            java.lang.String r0 = "video"
            goto L_0x02dd
        L_0x03e1:
            java.lang.String r0 = "audio"
            goto L_0x02dd
        L_0x03e5:
            r0 = r17
            goto L_0x02dd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162987t5.A0I(X.6zk, X.6xt):void");
    }

    public final void A0J(String str) {
        String str2 = this.A0U;
        if (str2 != null) {
            str = AnonymousClass000.A0V("; ", str, AnonymousClass000.A0l(str2));
        }
        this.A0U = str;
    }

    public final void A0K(String str, Object... objArr) {
        C159597m9.A00(this, "HeroServicePlayer", str, objArr);
    }

    public void A0L(boolean z) {
        C149107Lb r3 = this.A0J;
        if (r3 == null) {
            r3 = new C149107Lb(this.A0D);
            this.A0J = r3;
        }
        if (z && r3.A00 == null) {
            PowerManager powerManager = r3.A03;
            if (powerManager == null) {
                Log.w("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            }
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
            r3.A00 = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        }
        r3.A01 = z;
        PowerManager.WakeLock wakeLock = r3.A00;
        if (wakeLock == null) {
            return;
        }
        if (!z || !r3.A02) {
            wakeLock.release();
        } else {
            wakeLock.acquire();
        }
    }

    public final void A0M(boolean z) {
        long j = this.A0C;
        if (j != -1 && z) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - j;
            this.A07 = elapsedRealtime;
            Object[] A0L2 = AnonymousClass002.A0L();
            AnonymousClass000.A1Q(A0L2, 0, elapsedRealtime);
            C159597m9.A00(this, "HeroService", "blackscreen detected for %d ms", A0L2);
            this.A0C = -1;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v59, resolved type: X.8kg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v104, resolved type: X.81k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: X.81k} */
    /* JADX WARNING: type inference failed for: r5v60 */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03f6, code lost:
        if (r7 != 3) goto L_0x03f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x05dd, code lost:
        if (r6 == X.C142846xt.A01) goto L_0x05df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x069f, code lost:
        if (r10.enableKillVideoProcessForAudioTrackInitFailed == false) goto L_0x06a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x06a1, code lost:
        r7 = r0.A0p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x06a5, code lost:
        if (r7.disableAudioRendererOnAudioTrackInitFailed == false) goto L_0x085a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x06a9, code lost:
        if (r0.A10 == null) goto L_0x085a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x06b3, code lost:
        if (r0.A10.A0F.A07 == X.C141696vz.A03) goto L_0x06bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x06bd, code lost:
        if (r0.A10.A0F.A07 != X.C141696vz.A04) goto L_0x085a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x06bf, code lost:
        r3 = A1B + 1;
        A1B = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x06c7, code lost:
        if (r3 < r7.audioTrackInitFailedFallbackApplyThreshold) goto L_0x085a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x06c9, code lost:
        A0J("disableAudioTrack");
        r7 = r0.A0o;
        r7.BST(r6.value, r4.name(), r15, r25, A05(), "disableAudioTrack", r0.A10.A08);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x06f0, code lost:
        if (r0.A12.A02(1) == -1) goto L_0x06fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x06f2, code lost:
        A0K("disable AudioTrack", new java.lang.Object[0]);
        r0.A12.A05(1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x06fe, code lost:
        r0.A0X = true;
        A0P(true);
        r7.Bfh(r6.name(), "AUDIO_TRACK_INIT_FAILED_VIDEO_ONLY_FALLBACK", r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x072b, code lost:
        if (r10.enableKillVideoProcessForIllegalStateException != false) goto L_0x072d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0776, code lost:
        if ((r19 - r16) >= r10.killVideoProcessOnExoPlaybackExceptionRetryTimeMs) goto L_0x0778;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x07be, code lost:
        if (r4 != r23) goto L_0x07c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x07c0, code lost:
        r7 = r0.A0p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x07c4, code lost:
        if (r7.enableCheckAudioError == false) goto L_0x085a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x07c6, code lost:
        if (r4 != r14) goto L_0x085a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x07ca, code lost:
        if (r6 != X.C142846xt.A05) goto L_0x085a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x07cc, code lost:
        if (r15 == null) goto L_0x085a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x07d4, code lost:
        if (r15.contains("Audio") == false) goto L_0x085a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x085c, code lost:
        if (r7.setPlayWhenReadyOnError == false) goto L_0x086b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0864, code lost:
        if (r0.A12.A01.A0F == false) goto L_0x086b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0866, code lost:
        r0.A12.A0A(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x086b, code lost:
        r3 = r0.A0o;
        r5 = r6.name();
        r6 = r4.name();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0877, code lost:
        if (r0.A10 == null) goto L_0x0888;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0879, code lost:
        r0 = r0.A10.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x087d, code lost:
        r3.BSJ(r5, r6, r15, r25, r0, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0887, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0888, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0898, code lost:
        r0 = r0.A01.A04(r0.A0I[1]);
        r0.A01(r3);
        r0.A02(r4);
        r0.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x08ab, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0a22, code lost:
        if (r10.equals(r0.A0y) != false) goto L_0x0d0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0a24, code lost:
        r0.A0y = r10;
        r0.A0o.BVE(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x0a2b, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x0b46, code lost:
        A0K(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x0b49, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x0b54, code lost:
        if (r5.equals(r0.A11) != false) goto L_0x0d0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x0b56, code lost:
        r0.A11 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x0b58, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x0d06, code lost:
        A0E(android.os.SystemClock.elapsedRealtime());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x0d0d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:520:0x0d43, code lost:
        r0.A07(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x0d46, code lost:
        return true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x069b  */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x0725  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0747  */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x076a  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x076f  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x0789  */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x0829  */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x0856  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r62) {
        /*
            r61 = this;
            r7 = r62
            int r2 = r7.what
            r6 = 4
            r5 = 3
            r3 = 2
            r1 = 1
            r4 = 0
            r0 = r61
            switch(r2) {
                case 1: goto L_0x000f;
                case 2: goto L_0x03a1;
                case 3: goto L_0x0410;
                case 4: goto L_0x0423;
                case 5: goto L_0x045b;
                case 6: goto L_0x0465;
                case 7: goto L_0x047a;
                case 8: goto L_0x034a;
                case 9: goto L_0x049e;
                case 10: goto L_0x0d06;
                case 11: goto L_0x04c3;
                case 12: goto L_0x04c7;
                case 13: goto L_0x088b;
                case 14: goto L_0x0892;
                case 15: goto L_0x08ac;
                case 16: goto L_0x0cda;
                case 17: goto L_0x08f5;
                case 18: goto L_0x096d;
                case 19: goto L_0x0992;
                case 20: goto L_0x000e;
                case 21: goto L_0x09d0;
                case 22: goto L_0x0a08;
                case 23: goto L_0x0a0e;
                case 24: goto L_0x0a18;
                case 25: goto L_0x0d0d;
                case 26: goto L_0x0a2c;
                case 27: goto L_0x0a55;
                case 28: goto L_0x0a5f;
                case 29: goto L_0x0a63;
                case 30: goto L_0x0d0d;
                case 31: goto L_0x0d0d;
                case 32: goto L_0x0a6d;
                case 33: goto L_0x0a99;
                case 34: goto L_0x0afd;
                case 35: goto L_0x0b3d;
                case 36: goto L_0x0b42;
                case 37: goto L_0x0b4a;
                case 38: goto L_0x0b59;
                case 39: goto L_0x000e;
                case 40: goto L_0x0c23;
                case 41: goto L_0x0c30;
                case 42: goto L_0x0c3d;
                case 43: goto L_0x0c97;
                case 44: goto L_0x000e;
                case 45: goto L_0x0cc0;
                case 46: goto L_0x0cca;
                case 47: goto L_0x0d0e;
                case 48: goto L_0x0d1f;
                case 49: goto L_0x0d2f;
                case 50: goto L_0x0d47;
                case 51: goto L_0x0d4f;
                default: goto L_0x000e;
            }
        L_0x000e:
            return r4
        L_0x000f:
            java.lang.Object r2 = r7.obj
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r7 = r2[r4]
            X.7a6 r7 = (X.C152777a6) r7
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r2 = "prepareInternal"
            r0.A0K(r2, r5)
            r7.getClass()
            X.7yv r2 = r7.A0F
            X.7a6 r5 = r0.A10
            if (r5 == 0) goto L_0x005d
            X.7a6 r5 = r0.A10
            X.7yv r5 = r5.A0F
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L_0x005d
            X.7a6 r2 = r0.A10
            if (r2 == 0) goto L_0x0043
            X.7a6 r2 = r0.A10
            X.6vI r3 = r2.A06
            X.6vI r2 = r7.A06
            if (r3 == r2) goto L_0x0043
            X.7a6 r3 = r0.A10
            X.6vI r2 = r7.A06
            r3.A06 = r2
        L_0x0043:
            X.7a6 r2 = r0.A10
            if (r2 == 0) goto L_0x0057
            X.7a6 r2 = r0.A10
            java.lang.String r2 = r2.A08
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0057
            X.7a6 r3 = r0.A10
            java.lang.String r2 = r7.A08
            r3.A08 = r2
        L_0x0057:
            java.lang.String r2 = "skip prepareInternal due to same request"
            A02(r0, r2, r4)
            return r1
        L_0x005d:
            r0.A10 = r7
            X.7qS r5 = r0.A12
            X.7br r5 = r5.A01
            if (r5 == 0) goto L_0x0077
            X.7nh r5 = r5.A08
            int r5 = r5.A00
            if (r5 == r1) goto L_0x0077
            java.lang.String r5 = "Stopping non idle exoplayer"
            A02(r0, r5, r4)
            X.7qS r5 = r0.A12
            X.7br r5 = r5.A01
            r5.A0B(r1)
        L_0x0077:
            java.util.concurrent.atomic.AtomicBoolean r5 = r0.A0t
            boolean r5 = r5.get()
            if (r5 == 0) goto L_0x00be
            r8 = 19
            monitor-enter(r0)
            java.lang.String r5 = "downgradePlaybackPriority"
            A02(r0, r5, r4)     // Catch:{ all -> 0x00b5 }
            java.lang.Integer r5 = r0.A0S     // Catch:{ all -> 0x00b5 }
            if (r5 != 0) goto L_0x00b8
            X.7qS r5 = r0.A12     // Catch:{ all -> 0x00b5 }
            if (r5 == 0) goto L_0x00b8
            X.7qS r5 = r0.A12     // Catch:{ all -> 0x00b5 }
            X.7br r5 = r5.A01     // Catch:{ all -> 0x00b5 }
            X.81Q r5 = r5.A0K     // Catch:{ all -> 0x00b5 }
            android.os.HandlerThread r5 = r5.A0W     // Catch:{ all -> 0x00b5 }
            if (r5 == 0) goto L_0x00b8
            int r5 = r5.getThreadId()     // Catch:{ all -> 0x00b5 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x00b5 }
            if (r5 == 0) goto L_0x00b8
            int r6 = r5.intValue()     // Catch:{ Exception | IllegalArgumentException -> 0x00b8 }
            int r5 = android.os.Process.getThreadPriority(r6)     // Catch:{ Exception | IllegalArgumentException -> 0x00b8 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception | IllegalArgumentException -> 0x00b8 }
            r0.A0S = r5     // Catch:{ Exception | IllegalArgumentException -> 0x00b8 }
            android.os.Process.setThreadPriority(r6, r8)     // Catch:{ Exception | IllegalArgumentException -> 0x00b8 }
            goto L_0x00b8
        L_0x00b5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00b8:
            monitor-exit(r0)
            java.util.concurrent.atomic.AtomicInteger r5 = r0.A0v
            r5.set(r8)
        L_0x00be:
            X.8L8 r8 = r0.A04()
            X.7qS r5 = r0.A12
            if (r5 == 0) goto L_0x00dc
            int r6 = r8.minBufferMs
            int r9 = r8.minRebufferMs
            X.8v7 r8 = r5.A02
            boolean r5 = r8 instanceof X.C1672880m
            if (r5 == 0) goto L_0x00dc
            X.80m r8 = (X.C1672880m) r8
            int r5 = r6 * 1000
            long r5 = (long) r5
            r8.A05 = r5
            int r5 = r9 * 1000
            long r5 = (long) r5
            r8.A04 = r5
        L_0x00dc:
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.String r5 = "buildMediaSource"
            r0.A0K(r5, r6)
            r0.A16 = r1
            X.7qS r8 = r0.A12
            long r5 = r0.A0k
            r24 = r5
            X.7S2 r9 = new X.7S2
            r9.<init>(r7, r0)
            X.7a6 r5 = r8.A0B
            boolean r5 = r7.equals(r5)
            if (r5 != 0) goto L_0x0127
            r5 = 0
            r8.A05 = r5
            java.lang.String r5 = r2.A0A     // Catch:{ 6yQ | IOException -> 0x0108 }
            if (r5 == 0) goto L_0x0127
            X.8LG r5 = r8.A0R     // Catch:{ 6yQ | IOException -> 0x0108 }
            X.7a5 r5 = X.C161427pc.A00(r7, r5)     // Catch:{ 6yQ | IOException -> 0x0108 }
            r8.A05 = r5     // Catch:{ 6yQ | IOException -> 0x0108 }
            goto L_0x0127
        L_0x0108:
            r14 = move-exception
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r13 = r8.A0C
            java.lang.String r12 = r2.A0H
            java.lang.String r11 = "MANIFEST"
            java.lang.String r10 = "MANIFEST_PARSE_ERROR"
            java.lang.String r5 = "Exception: "
            java.lang.StringBuilder r6 = X.C18330xA.A0A(r5)
            java.lang.String r5 = r14.getMessage()
            java.lang.String r6 = X.AnonymousClass000.A0X(r5, r6)
            X.6Nr r5 = new X.6Nr
            r5.<init>(r12, r11, r10, r6)
            r13.AyO(r5)
        L_0x0127:
            X.8LG r10 = r8.A0R
            boolean r5 = r10.playerRespawnExo2
            if (r5 != 0) goto L_0x0131
            boolean r5 = r10.isExo2Vp9Enabled
            if (r5 == 0) goto L_0x0152
        L_0x0131:
            X.7a6 r5 = r8.A0B
            if (r5 == 0) goto L_0x0152
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L_0x0152
            X.7br r5 = r8.A01
            if (r5 == 0) goto L_0x014f
            r5.A05()
            r8.A04()
            X.7pc r6 = r8.A0E
            X.7a5 r5 = r8.A05
            X.8x9[] r5 = r6.A07(r5, r7)
            r8.A0I = r5
        L_0x014f:
            r8.A09(r7, r1)
        L_0x0152:
            boolean r5 = r10.checkLiveSourceUri
            if (r5 == 0) goto L_0x01b1
            boolean r5 = r7.A00()
            if (r5 == 0) goto L_0x01b1
            android.net.Uri r5 = r2.A05
            if (r5 != 0) goto L_0x01b1
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r3 = "Media source is null, Null source video Uri for live video Manifest: "
            r5.append(r3)
            java.lang.String r2 = r2.A0A
            java.lang.IllegalStateException r6 = X.AnonymousClass000.A0I(r2, r5)
        L_0x016f:
            X.7t5 r5 = r9.A01
            java.lang.Object[] r3 = X.AnonymousClass002.A0L()
            java.lang.String r2 = r6.getMessage()
            r3[r4] = r2
            java.lang.String r2 = "prepareMediaSource onError: %s"
            r5.A0K(r2, r3)
            boolean r2 = r6 instanceof X.AnonymousClass6JW
            if (r2 == 0) goto L_0x0198
            X.6zk r6 = (X.C143946zk) r6
        L_0x0186:
            X.6xt r2 = X.C142846xt.A0D
            r5.A0I(r6, r2)
        L_0x018b:
            r2 = -1
            r0.A08 = r2
            r0.A0Y = r4
            X.8LG r2 = r0.A0p
            int r2 = r2.checkPlayerStateMinIntervalMs
            r0.A03 = r2
            return r1
        L_0x0198:
            boolean r2 = r6 instanceof java.io.IOException
            if (r2 == 0) goto L_0x01a3
            r2 = 2000(0x7d0, float:2.803E-42)
            X.6JW r6 = X.AnonymousClass6JW.A00(r6, r4, r2)
            goto L_0x0186
        L_0x01a3:
            boolean r2 = r6 instanceof java.lang.RuntimeException
            if (r2 == 0) goto L_0x01af
            r3 = 2
            r2 = 1000(0x3e8, float:1.401E-42)
            X.6JW r6 = X.AnonymousClass6JW.A00(r6, r3, r2)
            goto L_0x0186
        L_0x01af:
            r6 = 0
            goto L_0x0186
        L_0x01b1:
            X.7iq r5 = r8.A0F
            X.7pc r10 = r8.A0E
            X.81X r6 = r8.A0Q
            r23 = r6
            r10.A06(r2)
            android.net.Uri r6 = r2.A05
            r13 = 0
            if (r6 != 0) goto L_0x01ce
            X.6vz r10 = r2.A07
            X.6vz r6 = X.C141696vz.BYTEARRAY
            if (r10 == r6) goto L_0x01ce
        L_0x01c7:
            java.lang.String r2 = "Media source is null"
            java.lang.IllegalStateException r6 = X.AnonymousClass001.A0e(r2)
            goto L_0x016f
        L_0x01ce:
            java.lang.String r10 = "HeroExo2VodInitHelper"
            java.lang.String r6 = "creating Progressive MediaSource"
            android.util.Log.d(r10, r6)
            X.8LG r12 = r5.A0B
            boolean r6 = r12.enableMP3Extractor
            if (r6 == 0) goto L_0x020e
            android.net.Uri r6 = r2.A05
            if (r6 == 0) goto L_0x0201
            java.lang.String r6 = r6.getLastPathSegment()
            if (r6 == 0) goto L_0x0201
            android.net.Uri r6 = r2.A05
            java.lang.String r10 = r6.getLastPathSegment()
            java.lang.String r6 = ".mp3"
            boolean r6 = r10.endsWith(r6)
            if (r6 == 0) goto L_0x0201
        L_0x01f3:
            X.91d r11 = new X.91d
            r11.<init>(r7, r5, r4)
        L_0x01f8:
            X.6vz r10 = r2.A07
            X.6vz r6 = X.C141696vz.BYTEARRAY
            if (r10 != r6) goto L_0x0239
            byte[] r10 = r2.A0S
            goto L_0x0214
        L_0x0201:
            java.lang.String r10 = r2.A0G
            if (r10 == 0) goto L_0x020e
            java.lang.String r6 = "undefined"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L_0x020e
            goto L_0x01f3
        L_0x020e:
            X.91d r11 = new X.91d
            r11.<init>(r7, r5, r1)
            goto L_0x01f8
        L_0x0214:
            java.lang.String r15 = "bytes:///video"
            X.8SN r14 = new X.8SN     // Catch:{ MalformedURLException -> 0x0344, URISyntaxException -> 0x033e }
            r14.<init>(r10)     // Catch:{ MalformedURLException -> 0x0344, URISyntaxException -> 0x033e }
            java.net.URL r6 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0344, URISyntaxException -> 0x033e }
            r6.<init>(r13, r15, r14)     // Catch:{ MalformedURLException -> 0x0344, URISyntaxException -> 0x033e }
            java.net.URI r6 = r6.toURI()     // Catch:{ MalformedURLException -> 0x0344, URISyntaxException -> 0x033e }
            java.lang.String r6 = r6.toString()     // Catch:{ MalformedURLException -> 0x0344, URISyntaxException -> 0x033e }
            android.net.Uri r6 = X.C624635d.A01(r6)     // Catch:{ MalformedURLException -> 0x0344, URISyntaxException -> 0x033e }
            r2.A05 = r6
            X.6KL r6 = new X.6KL
            r6.<init>(r10)
            X.81j r15 = new X.81j
            r15.<init>(r6)
            goto L_0x0254
        L_0x0239:
            X.7Oy r14 = r5.A0A
            X.6xv r16 = X.C142866xv.A05
            java.util.concurrent.atomic.AtomicBoolean r10 = r5.A0G
            java.util.concurrent.atomic.AtomicBoolean r6 = r5.A0F
            X.8kg r15 = r7.A03
            if (r15 != 0) goto L_0x0254
            X.81k r15 = new X.81k
            r17 = r7
            r18 = r14
            r19 = r10
            r20 = r6
            r21 = r24
            r15.<init>(r16, r17, r18, r19, r20, r21)
        L_0x0254:
            android.net.Uri r6 = r2.A05
            if (r6 == 0) goto L_0x01c7
            X.6K0 r10 = new X.6K0
            r10.<init>(r6, r11, r15)
            boolean r6 = r12.enableHeroPlayerMaxLoopCount
            if (r6 == 0) goto L_0x026d
            boolean r6 = r7.A0A
            if (r6 == 0) goto L_0x026d
            int r11 = r7.A00
            X.6K1 r6 = new X.6K1
            r6.<init>(r10, r11)
            r10 = r6
        L_0x026d:
            android.net.Uri r11 = r2.A04
            if (r11 == 0) goto L_0x02bf
            java.lang.String r15 = "0"
            java.lang.String r6 = "application/x-subrip"
            X.7it r14 = new X.7it
            r14.<init>()
            r14.A0P = r15
            r14.A0R = r6
            r14.A0F = r3
            r14.A0Q = r13
            X.7z1 r6 = new X.7z1
            r6.<init>(r14)
            X.7Oy r15 = r5.A0A
            X.6xv r16 = X.C142866xv.A02
            java.util.concurrent.atomic.AtomicBoolean r13 = r5.A0G
            java.util.concurrent.atomic.AtomicBoolean r14 = r5.A0F
            X.8kg r5 = r7.A03
            if (r5 != 0) goto L_0x02a3
            X.81k r5 = new X.81k
            r17 = r7
            r18 = r15
            r19 = r13
            r20 = r14
            r21 = r24
            r15 = r5
            r15.<init>(r16, r17, r18, r19, r20, r21)
        L_0x02a3:
            boolean r12 = r12.subtitleDurationToMaxValue
            if (r12 == 0) goto L_0x033a
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x02ac:
            X.6Jz r12 = new X.6Jz
            r13 = r11
            r14 = r6
            r15 = r5
            r12.<init>(r13, r14, r15, r16)
            X.8uE[] r3 = new X.C185778uE[r3]
            r3[r4] = r10
            r3[r1] = r12
            X.6K2 r10 = new X.6K2
            r10.<init>(r3)
        L_0x02bf:
            boolean r2 = r2.A0R
            if (r2 == 0) goto L_0x02d8
            X.8uE[] r6 = new X.C185778uE[r1]
            r6[r4] = r10
            java.util.Random r5 = new java.util.Random
            r5.<init>()
            int[] r3 = new int[r4]
            X.81e r2 = new X.81e
            r2.<init>(r5, r3)
            X.6K3 r10 = new X.6K3
            r10.<init>(r2, r6)
        L_0x02d8:
            X.6xH r2 = X.C142486xH.PROGRESSIVE_DOWNLOAD
            X.7Fm r6 = new X.7Fm
            r6.<init>(r10, r2)
            r2 = r23
            r2.A00 = r7
            X.8uE r11 = r6.A00
            android.os.Handler r10 = r8.A0K
            r2 = r11
            X.81W r2 = (X.AnonymousClass81W) r2
            X.7oH r3 = r2.A03
            boolean r2 = X.AnonymousClass000.A1W(r10)
            X.C159197lM.A01(r2)
            java.util.concurrent.CopyOnWriteArrayList r5 = r3.A02
            X.7F9 r3 = new X.7F9
            r2 = r23
            r3.<init>(r10, r2)
            r5.add(r3)
            r8.A04 = r11
            r8.A0B = r7
            X.7a5 r2 = r8.A05
            X.C153957cL.A03(r2)
            X.6xH r5 = r6.A01
            X.7t5 r7 = r9.A01
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r2 = "prepareMediaSource onCompleted"
            r7.A0K(r2, r3)
            X.7a6 r2 = r9.A00
            X.3cN r6 = new X.3cN
            r6.<init>(r5, r2, r7)
            android.os.Looper r5 = android.os.Looper.myLooper()
            android.os.Handler r3 = r7.A0l
            android.os.Looper r2 = r3.getLooper()
            if (r5 == r2) goto L_0x0336
            r3.post(r6)
        L_0x0329:
            boolean r2 = r8.A0Z
            if (r2 == 0) goto L_0x018b
            X.0Su r2 = new X.0Su
            r2.<init>()
            r8.A08 = r2
            goto L_0x018b
        L_0x0336:
            r6.run()
            goto L_0x0329
        L_0x033a:
            r16 = -2
            goto L_0x02ac
        L_0x033e:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C18330xA.A09(r0)
            throw r0
        L_0x0344:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C18330xA.A09(r0)
            throw r0
        L_0x034a:
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r2 = "releaseInternal"
            r0.A0K(r2, r3)
            boolean r2 = r0.A17
            if (r2 != 0) goto L_0x0d06
            boolean r2 = r0.A18
            if (r2 == 0) goto L_0x0363
            X.8LG r2 = r0.A0p
            boolean r2 = r2.pausePlayingVideoWhenRelease
            if (r2 == 0) goto L_0x0363
            r2 = 0
            r0.A0Q(r4, r2)
        L_0x0363:
            X.7qS r3 = r0.A12
            java.util.List r2 = r3.A0U
            r2.clear()
            X.7br r2 = r3.A01
            r2.A05()
            android.os.HandlerThread r3 = r0.A0F
            if (r3 == 0) goto L_0x037c
            X.8LG r2 = r0.A0p
            boolean r2 = r2.quitHandlerSafely
            if (r2 == 0) goto L_0x039d
            r3.quitSafely()
        L_0x037c:
            r0.A17 = r1
            r0.A09()
            r2 = 0
            r0.A0I = r2
            r0.A0G = r2
            r0.A0H = r2
            r2 = -1
            r0.A0C = r2
            r0.A07 = r2
            X.7Lb r2 = r0.A0J
            if (r2 == 0) goto L_0x0d06
            r2.A02 = r4
            android.os.PowerManager$WakeLock r2 = r2.A00
            if (r2 == 0) goto L_0x0d06
            r2.release()
            goto L_0x0d06
        L_0x039d:
            r3.quit()
            goto L_0x037c
        L_0x03a1:
            java.lang.Object r2 = r7.obj
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r2 = r2[r4]
            long r5 = X.C18310x6.A0B(r2)
            X.7qS r8 = r0.A12
            java.lang.Object[] r3 = new java.lang.Object[r1]
            X.AnonymousClass000.A1Q(r3, r4, r5)
            java.lang.String r2 = "playInternal: %d"
            r0.A0K(r2, r3)
            boolean r2 = r0.A0X
            if (r2 == 0) goto L_0x03d0
            X.7qS r2 = r0.A12
            int r3 = r2.A02(r1)
            r2 = -1
            if (r3 != r2) goto L_0x03ce
            java.lang.String r2 = "enable AudioTrack"
            A02(r0, r2, r4)
            X.7qS r2 = r0.A12
            r2.A05(r1, r4)
        L_0x03ce:
            r0.A0X = r4
        L_0x03d0:
            boolean r2 = r0.A0e
            if (r2 == 0) goto L_0x03d9
            r0.A0N(r1)
            r0.A0e = r4
        L_0x03d9:
            r0.A08()
            r9 = 0
            int r2 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r2 < 0) goto L_0x0407
            long r9 = r8.A03()
            int r2 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0407
            X.7qS r2 = r0.A12
            X.7br r2 = r2.A01
            if (r2 == 0) goto L_0x03f8
            X.7nh r2 = r2.A08
            int r7 = r2.A00
            r3 = 3
            r2 = 1
            if (r7 == r3) goto L_0x03f9
        L_0x03f8:
            r2 = 0
        L_0x03f9:
            r0.A0i = r2
            r8.A06(r5)
            boolean r2 = r0.A0i
            if (r2 == 0) goto L_0x0407
            java.lang.String r2 = "Delay sending play due to seek"
            A02(r0, r2, r4)
        L_0x0407:
            boolean r2 = r0.A0i
            if (r2 != 0) goto L_0x0d06
            r8.A0A(r1)
            goto L_0x0d06
        L_0x0410:
            java.lang.Object r5 = r7.obj
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            r2 = r5[r4]
            boolean r3 = X.AnonymousClass001.A1Z(r2)
            r2 = r5[r1]
            java.lang.String r2 = (java.lang.String) r2
            r0.A0Q(r3, r2)
            goto L_0x0d06
        L_0x0423:
            java.lang.Object r2 = r7.obj
            long[] r2 = (long[]) r2
            r5 = r2[r4]
            r7 = r2[r1]
            r11 = 1
            r9 = r2[r3]
            int r2 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0434
            r4 = 1
        L_0x0434:
            java.lang.Object[] r3 = X.AnonymousClass4L0.A0U()
            java.lang.String r2 = "seekToInternal"
            r0.A0K(r2, r3)
            boolean r3 = r0.A0g
            X.7qS r2 = r0.A12
            if (r3 == 0) goto L_0x0457
            r2.A07(r5, r4)
        L_0x0446:
            r0.A0A = r7
            X.85L r4 = r0.A0o
            long r2 = android.os.SystemClock.elapsedRealtime()
            X.7yr r2 = r0.A03(r2, r1)
            r4.Bb6(r2, r5)
            goto L_0x0d06
        L_0x0457:
            r2.A06(r5)
            goto L_0x0446
        L_0x045b:
            java.lang.Object r2 = r7.obj
            float r2 = X.AnonymousClass001.A05(r2)
            r0.A0B(r2)
            return r1
        L_0x0465:
            java.lang.Object r5 = r7.obj
            android.view.Surface r5 = (android.view.Surface) r5
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r2 = "setSurfaceInternal"
            r0.A0K(r2, r3)
            r0.A0H = r5
            X.8LG r2 = r0.A0p
            boolean r2 = r2.useBlockingSetSurfaceExo2
            r0.A0H(r5, r2)
            return r1
        L_0x047a:
            java.lang.Object r5 = r7.obj
            android.os.ResultReceiver r5 = (android.os.ResultReceiver) r5
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r2 = "releaseSurfaceInternal"
            r0.A0K(r2, r3)
            r4 = 0
            r0.A0I = r4     // Catch:{ all -> 0x0499 }
            r0.A0G = r4     // Catch:{ all -> 0x0499 }
            r0.A0H = r4     // Catch:{ all -> 0x0499 }
            r2 = -1
            r0.A0C = r2     // Catch:{ all -> 0x0499 }
            r0.A07 = r2     // Catch:{ all -> 0x0499 }
            r0.A0H(r4, r1)     // Catch:{ all -> 0x0499 }
            r5.send(r1, r4)
            return r1
        L_0x0499:
            r0 = move-exception
            r5.send(r1, r4)
            throw r0
        L_0x049e:
            java.lang.Object r6 = r7.obj
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            r2 = r6[r4]
            int r2 = X.AnonymousClass001.A0K(r2)
            boolean r10 = X.AnonymousClass000.A1U(r2, r1)
            r2 = r6[r1]
            int r7 = X.AnonymousClass001.A0K(r2)
            r2 = r6[r3]
            long r8 = X.C18310x6.A0B(r2)
            r2 = r6[r5]
            boolean r11 = X.AnonymousClass001.A1Z(r2)
            r6 = r0
            r6.A0D(r7, r8, r10, r11)
            return r1
        L_0x04c3:
            r0.A0O(r1)
            return r1
        L_0x04c7:
            java.lang.Object r8 = r7.obj
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            r7 = r8[r4]
            java.lang.String r7 = (java.lang.String) r7
            r4 = r8[r1]
            java.lang.String r4 = (java.lang.String) r4
            r15 = r8[r3]
            java.lang.String r15 = (java.lang.String) r15
            r25 = r8[r5]
            r2 = r25
            java.lang.String r2 = (java.lang.String) r2
            r25 = r2
            r24 = r8[r6]
            r2 = r24
            java.lang.String r2 = (java.lang.String) r2
            r24 = r2
            X.6xt r6 = X.C142846xt.A00(r7)
            X.6xw r4 = X.C142876xw.A00(r4)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            X.AnonymousClass001.A1I(r6, r4, r5)
            java.lang.String r2 = r0.A06()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r5[r3] = r2
            java.lang.String r2 = "onPlayerError: %s, %s, %s"
            r0.A0K(r2, r5)
            X.6xw r23 = X.C142876xw.A02
            r5 = 0
            r2 = r23
            if (r4 != r2) goto L_0x05cf
            X.8LG r7 = r0.A0p
            boolean r2 = r7.enableEvictPlayerOnAudioTrackInitFailed
            if (r2 == 0) goto L_0x05cf
            int r3 = r0.A06
            int r2 = r7.maxRetryCountByEvictPlayerOnAudioTrackInitFailed
            if (r3 >= r2) goto L_0x05cf
            java.lang.String r2 = "evictPlayer"
            r0.A0J(r2)
            X.85L r7 = r0.A0o
            java.lang.String r3 = r6.value
            java.lang.String r9 = "AUDIO_TRACK_INIT_FAILED"
            java.lang.String r12 = r0.A05()
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "evictPlayer:"
            r8.append(r2)
            int r2 = r0.A06
            java.lang.String r13 = X.AnonymousClass000.A0h(r8, r2)
            X.7a6 r2 = r0.A10
            if (r2 == 0) goto L_0x0556
            X.7a6 r2 = r0.A10
            java.lang.String r2 = r2.A08
        L_0x053c:
            r8 = r3
            r10 = r15
            r11 = r25
            r14 = r2
            r7.BST(r8, r9, r10, r11, r12, r13, r14)
            int r2 = r0.A06
            int r2 = r2 + 1
            r0.A06 = r2
            java.util.concurrent.atomic.AtomicInteger r19 = com.facebook.android.exoplayer2.audio.DefaultAudioSink.A0h
            int r9 = r19.get()
            X.7Wo r12 = r0.A0Q
            long r2 = r0.A0k
            monitor-enter(r12)
            goto L_0x0559
        L_0x0556:
            java.lang.String r2 = ""
            goto L_0x053c
        L_0x0559:
            android.util.LruCache r13 = r12.A00     // Catch:{ all -> 0x05cb }
            java.util.Map r8 = r13.snapshot()     // Catch:{ all -> 0x05cb }
            java.util.Iterator r18 = X.AnonymousClass000.A0q(r8)     // Catch:{ all -> 0x05cb }
        L_0x0563:
            boolean r8 = r18.hasNext()     // Catch:{ all -> 0x05cb }
            if (r8 == 0) goto L_0x05ce
            java.util.Map$Entry r10 = X.AnonymousClass001.A0w(r18)     // Catch:{ all -> 0x05cb }
            if (r10 == 0) goto L_0x0563
            java.lang.Object r8 = r10.getValue()     // Catch:{ all -> 0x05cb }
            if (r8 == 0) goto L_0x0563
            java.lang.Object r14 = r10.getValue()     // Catch:{ all -> 0x05cb }
            X.7t5 r14 = (X.C162987t5) r14     // Catch:{ all -> 0x05cb }
            java.lang.Object r11 = r10.getKey()     // Catch:{ all -> 0x05cb }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x05cb }
            long r16 = r11.longValue()     // Catch:{ all -> 0x05cb }
            int r8 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r8 == 0) goto L_0x05ce
            X.7qS r8 = r14.A12     // Catch:{ all -> 0x05cb }
            X.8x9[] r8 = r8.A0I     // Catch:{ all -> 0x05cb }
            if (r8 == 0) goto L_0x0563
            r8 = r8[r1]     // Catch:{ all -> 0x05cb }
            X.80p r8 = (X.C1673180p) r8     // Catch:{ all -> 0x05cb }
            int r10 = r8.A01     // Catch:{ all -> 0x05cb }
            if (r10 == r1) goto L_0x059a
            r8 = 2
            if (r10 != r8) goto L_0x0563
        L_0x059a:
            boolean r8 = r14.A18     // Catch:{ all -> 0x05cb }
            if (r8 != 0) goto L_0x0563
            java.lang.String r10 = "id [%d]: Evict player, id=%d"
            java.lang.Object[] r8 = X.AnonymousClass002.A0M()     // Catch:{ all -> 0x05cb }
            X.AnonymousClass000.A1Q(r8, r5, r2)     // Catch:{ all -> 0x05cb }
            r8[r1] = r11     // Catch:{ all -> 0x05cb }
            X.C159597m9.A02(r10, r8)     // Catch:{ all -> 0x05cb }
            r13.remove(r11)     // Catch:{ all -> 0x05cb }
            monitor-exit(r12)
            r10 = 0
            int r2 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x05cf
            r8 = 0
        L_0x05b7:
            r2 = 50
            java.lang.Thread.sleep(r2)     // Catch:{ InterruptedException -> 0x05bc }
        L_0x05bc:
            int r2 = r19.get()
            if (r2 < r9) goto L_0x068e
            if (r2 > r9) goto L_0x05cf
            int r8 = r8 + 1
            r2 = 20
            if (r8 >= r2) goto L_0x05cf
            goto L_0x05b7
        L_0x05cb:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        L_0x05ce:
            monitor-exit(r12)
        L_0x05cf:
            X.6xw r14 = X.C142876xw.A09
            if (r4 != r14) goto L_0x05d7
            X.6xt r2 = X.C142846xt.A05
            if (r6 == r2) goto L_0x05df
        L_0x05d7:
            X.6xw r2 = X.C142876xw.A01
            if (r4 != r2) goto L_0x0697
            X.6xt r2 = X.C142846xt.A01
            if (r6 != r2) goto L_0x07c0
        L_0x05df:
            X.7a6 r2 = r0.A10
            if (r2 == 0) goto L_0x0697
            X.7a6 r2 = r0.A10
            X.7yv r2 = r2.A0F
            X.6vz r3 = r2.A07
            X.6vz r2 = X.C141696vz.DASH_VOD
            if (r3 == r2) goto L_0x05f7
            X.7a6 r2 = r0.A10
            X.7yv r2 = r2.A0F
            X.6vz r3 = r2.A07
            X.6vz r2 = X.C141696vz.PROGRESSIVE
            if (r3 != r2) goto L_0x0697
        L_0x05f7:
            X.8LG r7 = r0.A0p
            boolean r2 = r7.enableEvictCacheOnExoplayerErrors
            if (r2 == 0) goto L_0x0697
            int r3 = r0.A05
            int r2 = r7.maxRetryCountByEvictCacheOnExoplayerErrors
            if (r3 >= r2) goto L_0x0697
            java.lang.String r2 = "evictCache"
            r0.A0J(r2)
            X.85L r7 = r0.A0o
            java.lang.String r8 = r6.value
            java.lang.String r9 = r4.name()
            java.lang.String r12 = r0.A05()
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "evictCache:"
            r3.append(r2)
            int r2 = r0.A05
            java.lang.String r13 = X.AnonymousClass000.A0h(r3, r2)
            X.7a6 r2 = r0.A10
            java.lang.String r2 = r2.A08
            r10 = r15
            r11 = r25
            r14 = r2
            r7.BST(r8, r9, r10, r11, r12, r13, r14)
            int r2 = r0.A05
            int r2 = r2 + 1
            r0.A05 = r2
            X.0Xd r9 = r0.A0L
            java.lang.String[] r3 = new java.lang.String[r1]
            java.lang.String r2 = r0.A06()
            java.util.List r3 = X.AnonymousClass0x9.A1A(r2, r3, r5)
            X.8xH r12 = r9.A08()
            if (r12 == 0) goto L_0x068e
            r12.B52()
            java.util.Set r2 = r12.B8z()
            java.util.HashSet r10 = X.AnonymousClass0x9.A15(r3)
            java.util.Iterator r11 = r2.iterator()
        L_0x0655:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x068b
            java.lang.String r3 = X.AnonymousClass001.A0m(r11)
            java.lang.String r2 = X.AnonymousClass0JJ.A00(r3)
            boolean r2 = r10.contains(r2)
            if (r2 == 0) goto L_0x0655
            X.8xH r8 = r9.A08()
            if (r8 == 0) goto L_0x0655
            java.util.NavigableSet r2 = r8.B55(r3)
            if (r2 == 0) goto L_0x0655
            java.util.Iterator r5 = r2.iterator()
        L_0x0679:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0655
            java.lang.Object r3 = r5.next()
            X.8Li r3 = (X.C172488Li) r3
            java.lang.String r2 = "api_eviction"
            r8.BjP(r3, r2)
            goto L_0x0679
        L_0x068b:
            r12.B52()
        L_0x068e:
            r0.A0P(r1)
            float r2 = r0.A01
            r0.A0B(r2)
            goto L_0x070c
        L_0x0697:
            r2 = r23
            if (r4 != r2) goto L_0x0725
            X.8LG r10 = r0.A0p
            boolean r2 = r10.enableKillVideoProcessForAudioTrackInitFailed
            if (r2 != 0) goto L_0x072d
        L_0x06a1:
            X.8LG r7 = r0.A0p
            boolean r2 = r7.disableAudioRendererOnAudioTrackInitFailed
            if (r2 == 0) goto L_0x085a
            X.7a6 r2 = r0.A10
            if (r2 == 0) goto L_0x085a
            X.7a6 r2 = r0.A10
            X.7yv r2 = r2.A0F
            X.6vz r3 = r2.A07
            X.6vz r2 = X.C141696vz.DASH_VOD
            if (r3 == r2) goto L_0x06bf
            X.7a6 r2 = r0.A10
            X.7yv r2 = r2.A0F
            X.6vz r3 = r2.A07
            X.6vz r2 = X.C141696vz.PROGRESSIVE
            if (r3 != r2) goto L_0x085a
        L_0x06bf:
            int r2 = A1B
            int r3 = r2 + 1
            A1B = r3
            int r2 = r7.audioTrackInitFailedFallbackApplyThreshold
            if (r3 < r2) goto L_0x085a
            java.lang.String r8 = "disableAudioTrack"
            r0.A0J(r8)
            X.85L r7 = r0.A0o
            java.lang.String r3 = r6.value
            java.lang.String r14 = r4.name()
            java.lang.String r17 = r0.A05()
            X.7a6 r2 = r0.A10
            java.lang.String r2 = r2.A08
            r12 = r7
            r13 = r3
            r16 = r25
            r18 = r8
            r19 = r2
            r12.BST(r13, r14, r15, r16, r17, r18, r19)
            X.7qS r2 = r0.A12
            int r2 = r2.A02(r1)
            r8 = -1
            if (r2 == r8) goto L_0x06fe
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.lang.String r2 = "disable AudioTrack"
            r0.A0K(r2, r3)
            X.7qS r2 = r0.A12
            r2.A05(r1, r8)
        L_0x06fe:
            r0.A0X = r1
            r0.A0P(r1)
            java.lang.String r3 = r6.name()
            java.lang.String r2 = "AUDIO_TRACK_INIT_FAILED_VIDEO_ONLY_FALLBACK"
            r7.Bfh(r3, r2, r15)
        L_0x070c:
            java.lang.String r5 = r6.name()
            java.lang.String r3 = r4.name()
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0l(r15)
            X.AnonymousClass001.A1M(r2)
            java.lang.String r0 = r0.A0U
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r2)
            r7.Bfh(r5, r3, r0)
            return r1
        L_0x0725:
            if (r4 != r14) goto L_0x07bc
            X.8LG r10 = r0.A0p
            boolean r2 = r10.enableKillVideoProcessForIllegalStateException
            if (r2 == 0) goto L_0x07c0
        L_0x072d:
            android.content.Context r2 = r0.A0D
            android.content.Context r2 = r2.getApplicationContext()
            android.content.SharedPreferences r9 = android.preference.PreferenceManager.getDefaultSharedPreferences(r2)
            java.lang.String r3 = ""
            java.lang.String r22 = "KillVideoPidOnExoException_VideoId"
            r2 = r22
            java.lang.String r11 = r9.getString(r2, r3)
            java.lang.String r2 = r0.A06()
            if (r2 == 0) goto L_0x0856
            java.lang.String r8 = r0.A06()
        L_0x074b:
            java.lang.String r21 = "KillVideoPidOnExoException_KillTime"
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r21
            long r16 = r9.getLong(r7, r2)
            long r19 = java.lang.System.currentTimeMillis()
            java.lang.String r18 = "KillVideoPidOnExoException_RetryCount"
            r7 = r18
            int r7 = r9.getInt(r7, r5)
            boolean r11 = r8.equals(r11)
            if (r11 != 0) goto L_0x076b
            r7 = 0
        L_0x076b:
            int r11 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r11 == 0) goto L_0x0778
            long r12 = r19 - r16
            long r2 = r10.killVideoProcessOnExoPlaybackExceptionRetryTimeMs
            int r11 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            r13 = 0
            if (r11 < 0) goto L_0x0779
        L_0x0778:
            r13 = 1
        L_0x0779:
            r2 = 6
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r5] = r8
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.lang.String r2 = "Retrieve service player current position"
            r0.A0K(r2, r3)
            X.7qS r2 = r0.A12
            if (r2 != 0) goto L_0x0829
            r2 = 0
        L_0x078b:
            X.AnonymousClass000.A1Q(r12, r1, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r11 = 2
            r12[r11] = r2
            int r2 = r10.killVideoProcessOnExoPlaybackExceptionMaximumRetryCount
            X.AnonymousClass000.A1O(r12, r2)
            r2 = 4
            X.AnonymousClass6C7.A1V(r12, r2, r13)
            long r2 = r10.killVideoProcessOnExoPlaybackExceptionRetryTimeMs
            r16 = r2
            java.lang.Long r3 = java.lang.Long.valueOf(r16)
            r2 = 5
            r12[r2] = r3
            java.lang.String r2 = "maybeRetryByRebirth: [vid=%s; currentPosition=%dMs; retryCount=%d(max=%d); coolingDownCompleted=%b(max=%d)]"
            java.lang.String r12 = java.lang.String.format(r2, r12)
            if (r7 != 0) goto L_0x07d8
            if (r13 != 0) goto L_0x07de
        L_0x07b3:
            java.lang.Object[] r3 = X.AnonymousClass4L0.A0V(r12, r4, r11)
            java.lang.String r2 = "%s, errorCode=%s, skip"
            r0.A0K(r2, r3)
        L_0x07bc:
            r2 = r23
            if (r4 == r2) goto L_0x06a1
        L_0x07c0:
            X.8LG r7 = r0.A0p
            boolean r2 = r7.enableCheckAudioError
            if (r2 == 0) goto L_0x085a
            if (r4 != r14) goto L_0x085a
            X.6xt r2 = X.C142846xt.A05
            if (r6 != r2) goto L_0x085a
            if (r15 == 0) goto L_0x085a
            java.lang.String r2 = "Audio"
            boolean r2 = r15.contains(r2)
            if (r2 == 0) goto L_0x085a
            goto L_0x06a1
        L_0x07d8:
            if (r7 <= 0) goto L_0x07b3
            int r2 = r10.killVideoProcessOnExoPlaybackExceptionMaximumRetryCount
            if (r7 >= r2) goto L_0x07b3
        L_0x07de:
            java.lang.String r2 = "restartVps"
            r0.A0J(r2)
            java.lang.Object[] r3 = X.AnonymousClass4L0.A0V(r12, r4, r11)
            java.lang.String r2 = "%s, errorCode=%s, kill"
            r0.A0K(r2, r3)
            X.85L r2 = r0.A0o
            r16 = r2
            java.lang.String r13 = r6.name()
            java.lang.String r10 = r4.name()
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0l(r15)
            java.lang.String r2 = ". "
            java.lang.String r3 = X.AnonymousClass000.A0V(r2, r12, r3)
            r2 = r16
            r2.Bfh(r13, r10, r3)
            android.content.SharedPreferences$Editor r9 = r9.edit()
            r2 = r22
            r9.putString(r2, r8)
            r8 = r21
            r2 = r19
            r9.putLong(r8, r2)
            int r3 = r7 + 1
            r2 = r18
            r9.putInt(r2, r3)
            r9.commit()
            int r2 = android.os.Process.myPid()
            android.os.Process.killProcess(r2)
            goto L_0x07b3
        L_0x0829:
            X.6xH r3 = r0.A0M
            X.6xH r2 = X.C142486xH.DASH_LIVE
            boolean r3 = X.AnonymousClass000.A1Y(r3, r2)
            X.7qS r2 = r0.A12
            if (r3 == 0) goto L_0x0850
            X.7br r2 = r2.A01
            X.81Q r3 = r2.A0K
            boolean r2 = r3.A0q
            r16 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x0849
            X.821 r2 = r3.A0k
            long r2 = r2.BBa()
        L_0x0845:
            long r2 = r2 / r16
            goto L_0x078b
        L_0x0849:
            X.820 r2 = r3.A0i
            long r2 = r2.BBa()
            goto L_0x0845
        L_0x0850:
            long r2 = r2.A03()
            goto L_0x078b
        L_0x0856:
            java.lang.String r8 = "null"
            goto L_0x074b
        L_0x085a:
            boolean r2 = r7.setPlayWhenReadyOnError
            if (r2 == 0) goto L_0x086b
            X.7qS r2 = r0.A12
            X.7br r2 = r2.A01
            boolean r2 = r2.A0F
            if (r2 == 0) goto L_0x086b
            X.7qS r2 = r0.A12
            r2.A0A(r5)
        L_0x086b:
            X.85L r3 = r0.A0o
            java.lang.String r5 = r6.name()
            java.lang.String r6 = r4.name()
            X.7a6 r2 = r0.A10
            if (r2 == 0) goto L_0x0888
            X.7a6 r0 = r0.A10
            java.lang.String r0 = r0.A08
        L_0x087d:
            r4 = r3
            r7 = r15
            r8 = r25
            r9 = r0
            r10 = r24
            r4.BSJ(r5, r6, r7, r8, r9, r10)
            return r1
        L_0x0888:
            java.lang.String r0 = ""
            goto L_0x087d
        L_0x088b:
            java.lang.Object r4 = r7.obj
            X.7qS r0 = r0.A12
            r3 = 10001(0x2711, float:1.4014E-41)
            goto L_0x0898
        L_0x0892:
            java.lang.Object r4 = r7.obj
            X.7qS r0 = r0.A12
            r3 = 10002(0x2712, float:1.4016E-41)
        L_0x0898:
            X.7br r2 = r0.A01
            X.8x9[] r0 = r0.A0I
            r0 = r0[r1]
            X.7af r0 = r2.A04(r0)
            r0.A01(r3)
            r0.A02(r4)
            r0.A00()
            return r1
        L_0x08ac:
            java.lang.Object r3 = r7.obj
            long[] r3 = (long[]) r3
            X.7yf r10 = r0.A0y
            r5 = r3[r1]
            int r2 = (int) r5
            r37 = r2
            r22 = r3[r4]
            long r24 = android.os.SystemClock.elapsedRealtime()
            long r2 = r10.A03
            r35 = r2
            long r14 = r10.A07
            long r12 = r10.A06
            long r8 = r10.A08
            long r6 = r10.A01
            boolean r2 = r10.A0B
            r16 = r2
            long r4 = r10.A04
            long r2 = r10.A05
            boolean r11 = r10.A0C
            java.lang.String r10 = r10.A0A
            r34 = r10
            X.7yf r10 = new X.7yf
            r26 = r6
            r28 = r4
            r30 = r2
            r32 = r16
            r33 = r11
            r16 = r14
            r18 = r12
            r20 = r8
            r11 = r10
            r12 = r34
            r13 = r37
            r14 = r35
            r11.<init>(r12, r13, r14, r16, r18, r20, r22, r24, r26, r28, r30, r32, r33)
            goto L_0x0a1c
        L_0x08f5:
            java.lang.Object r2 = r7.obj
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            X.7yf r7 = r0.A0y
            r4 = r2[r4]
            long r10 = X.C18310x6.A0B(r4)
            r3 = r2[r3]
            long r12 = X.C18310x6.A0B(r3)
            r3 = r2[r5]
            long r14 = X.C18310x6.A0B(r3)
            r3 = r2[r1]
            long r16 = X.C18310x6.A0B(r3)
            long r20 = android.os.SystemClock.elapsedRealtime()
            r3 = r2[r6]
            long r22 = X.C18310x6.A0B(r3)
            r3 = 5
            r3 = r2[r3]
            boolean r28 = X.AnonymousClass001.A1Z(r3)
            r3 = 6
            r3 = r2[r3]
            long r24 = X.C18310x6.A0B(r3)
            r3 = 7
            r3 = r2[r3]
            long r26 = X.C18310x6.A0B(r3)
            r3 = 8
            r3 = r2[r3]
            boolean r29 = X.AnonymousClass001.A1Z(r3)
            r3 = 10
            r8 = r2[r3]
            java.lang.String r8 = (java.lang.String) r8
            int r9 = r7.A00
            long r3 = r7.A02
            X.7yf r7 = new X.7yf
            r18 = r3
            r7.<init>(r8, r9, r10, r12, r14, r16, r18, r20, r22, r24, r26, r28, r29)
            X.7yf r3 = r0.A0y
            boolean r3 = r7.equals(r3)
            if (r3 != 0) goto L_0x095a
            r0.A0y = r7
            X.85L r3 = r0.A0o
            r3.BVE(r7)
        L_0x095a:
            X.7jM r5 = r0.A11
            r3 = 9
            r4 = r2[r3]
            java.util.List r4 = (java.util.List) r4
            java.lang.String r3 = r5.A00
            boolean r2 = r5.A02
            X.7jM r5 = new X.7jM
            r5.<init>(r3, r4, r2)
            goto L_0x0b4e
        L_0x096d:
            java.lang.Object r2 = r7.obj
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r6 = r2.booleanValue()
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r3 = 0
            r5[r4] = r2
            java.lang.String r2 = "setLoopingInternal %b"
            r0.A0K(r2, r5)
            r0.A0h = r6
            X.8LG r2 = r0.A0p
            boolean r2 = r2.improveLooping
            if (r2 == 0) goto L_0x0d0d
            X.7qS r0 = r0.A12
            if (r6 == 0) goto L_0x098c
            r3 = 2
        L_0x098c:
            X.7br r0 = r0.A01
            r0.A06(r3)
            return r1
        L_0x0992:
            java.lang.Object r7 = r7.obj
            X.8vV r7 = (X.C186528vV) r7
            java.lang.Object[] r3 = new java.lang.Object[r1]
            android.view.Surface r2 = r0.A0H
            r3[r4] = r2
            java.lang.String r2 = "leaveWarmUpInternal, surface: %s"
            r0.A0K(r2, r3)
            X.85L r6 = r0.A0o
            X.8vV r5 = r6.A01
            boolean r2 = r5 instanceof X.C126436Nw
            if (r2 == 0) goto L_0x0d0d
            X.6Nw r5 = (X.C126436Nw) r5
            X.7t5 r2 = r6.A00
            long r2 = r2.A0k
            r6.BbN(r2)
            r6.A01 = r7
            r5.A00 = r6
        L_0x09b6:
            java.util.Queue r3 = r5.A01
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x09ca
            java.lang.Object r2 = r3.poll()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L_0x09b6
            r2.run()
            goto L_0x09b6
        L_0x09ca:
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0u
            r0.set(r4)
            return r1
        L_0x09d0:
            java.lang.Object r5 = r7.obj
            java.util.List r5 = (java.util.List) r5
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r2 = "onTimestampGapsChanged"
            r0.A0K(r2, r3)
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            java.util.Iterator r7 = r5.iterator()
        L_0x09e3:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0a02
            java.lang.Object r3 = r7.next()
            android.util.Pair r3 = (android.util.Pair) r3
            java.lang.Object r2 = r3.first
            long r5 = X.C18310x6.A0B(r2)
            long r3 = X.AnonymousClass6C8.A0R(r3)
            X.7xl r2 = new X.7xl
            r2.<init>(r5, r3)
            r8.add(r2)
            goto L_0x09e3
        L_0x0a02:
            X.85L r0 = r0.A0o
            r0.BeA(r8)
            return r1
        L_0x0a08:
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r2 = "liveLatencyMode"
            goto L_0x0b46
        L_0x0a0e:
            java.lang.Object r2 = r7.obj
            int r2 = X.AnonymousClass001.A0K(r2)
            r0.A0C(r2)
            return r1
        L_0x0a18:
            java.lang.Object r10 = r7.obj
            X.7yf r10 = (X.C166427yf) r10
        L_0x0a1c:
            X.7yf r2 = r0.A0y
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x0d0d
            r0.A0y = r10
            X.85L r0 = r0.A0o
            r0.BVE(r10)
            return r1
        L_0x0a2c:
            java.lang.Object r2 = r7.obj
            long r6 = X.C18310x6.A0B(r2)
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r2 = "preSeekToInternal"
            r0.A0K(r2, r3)
            X.7qS r0 = r0.A12
            X.7br r0 = r0.A01
            r4 = -1
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            X.81Q r0 = r0.A0K
            if (r2 == 0) goto L_0x0a49
            long r4 = com.facebook.android.exoplayer2.util.Util.A04(r6)
        L_0x0a49:
            X.7nD r3 = r0.A0j
            r2 = 16
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            X.C150717Rx.A00(r3, r0, r2)
            return r1
        L_0x0a55:
            java.lang.Object r2 = r7.obj
            float r2 = X.AnonymousClass001.A05(r2)
            r0.A0A(r2)
            return r1
        L_0x0a5f:
            r0.A0P(r4)
            return r1
        L_0x0a63:
            java.lang.Object r2 = r7.obj
            boolean r2 = X.AnonymousClass001.A1Z(r2)
            r0.A0N(r2)
            return r1
        L_0x0a6d:
            java.lang.Object r2 = r7.obj
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r7 = r2.booleanValue()
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r3[r4] = r2
            java.lang.String r2 = "convert Stereo to Mono: %s"
            r0.A0K(r2, r3)
            X.7qS r5 = r0.A12
            X.7jX r0 = r5.A03
            float r4 = r0.A01
            float r3 = r0.A00
            boolean r0 = r0.A04
            X.7jX r2 = new X.7jX
            r2.<init>(r4, r3, r0, r7)
            X.7br r0 = r5.A01
            X.81Q r0 = r0.A0K
            X.7nD r0 = r0.A0j
            X.C150717Rx.A00(r0, r2, r6)
            r5.A03 = r2
            return r1
        L_0x0a99:
            java.lang.Object r7 = r7.obj
            X.7jM r7 = (X.C158057jM) r7
            if (r7 == 0) goto L_0x0d0d
            java.lang.String r2 = r7.A00
            if (r2 != 0) goto L_0x0ac4
            boolean r2 = r7.A02
            if (r2 == 0) goto L_0x0ac4
            X.7jM r2 = r0.A11
            java.util.List r2 = r2.A01
            java.util.HashSet r5 = X.AnonymousClass0x9.A15(r2)
            int r2 = r5.size()
            if (r2 != r1) goto L_0x0ac4
            java.util.Iterator r2 = r5.iterator()
            java.lang.String r5 = X.AnonymousClass001.A0m(r2)
            java.util.List r2 = r7.A01
            X.7jM r7 = new X.7jM
            r7.<init>(r5, r2, r1)
        L_0x0ac4:
            X.7qS r6 = r0.A12
            X.6KH r0 = r6.A06
            java.util.concurrent.atomic.AtomicReference r0 = r0.A02
            java.lang.Object r0 = r0.get()
            X.6KG r0 = (X.AnonymousClass6KG) r0
            X.6KF r5 = new X.6KF
            r5.<init>(r0)
            int r2 = r6.A02(r3)
            boolean r0 = r7.A02
            if (r0 == 0) goto L_0x0af7
            r0 = -1
            if (r2 != r0) goto L_0x0d0d
            r5.A00(r3, r4)
            java.lang.String r2 = r7.A00
            if (r2 != 0) goto L_0x0aef
            r5.A0O = r1
        L_0x0ae9:
            X.6KH r0 = r6.A06
            r0.A03(r5)
            return r1
        L_0x0aef:
            java.lang.String[] r0 = new java.lang.String[r1]
            r0[r4] = r2
            r5.A01(r0)
            goto L_0x0ae9
        L_0x0af7:
            if (r2 != 0) goto L_0x0d0d
            r5.A00(r3, r1)
            goto L_0x0ae9
        L_0x0afd:
            java.lang.Object r2 = r7.obj
            boolean r7 = X.AnonymousClass001.A1Z(r2)
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r2 = "enableVideoTrackInternal"
            r0.A0K(r2, r5)
            X.7qS r2 = r0.A12
            int r2 = r2.A02(r3)
            r6 = -1
            if (r2 != r6) goto L_0x0b24
            if (r7 == 0) goto L_0x0b24
            java.lang.String r6 = "Enable Text track"
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r2 = "HeroService"
            X.C159597m9.A00(r0, r2, r6, r5)
            X.7qS r0 = r0.A12
            r0.A05(r3, r4)
            return r1
        L_0x0b24:
            X.7qS r2 = r0.A12
            int r2 = r2.A02(r3)
            if (r2 == r6) goto L_0x0d0d
            if (r7 != 0) goto L_0x0d0d
            java.lang.String r5 = "Disable Text track"
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r2 = "HeroService"
            X.C159597m9.A00(r0, r2, r5, r4)
            X.7qS r0 = r0.A12
            r0.A05(r3, r6)
            return r1
        L_0x0b3d:
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r2 = "onBeforeRenderInternal"
            goto L_0x0b46
        L_0x0b42:
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r2 = "onRenderInternal"
        L_0x0b46:
            r0.A0K(r2, r3)
            return r1
        L_0x0b4a:
            java.lang.Object r5 = r7.obj
            X.7jM r5 = (X.C158057jM) r5
        L_0x0b4e:
            X.7jM r2 = r0.A11
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x0d0d
            r0.A11 = r5
            return r1
        L_0x0b59:
            java.lang.Object r3 = r7.obj
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r2 = r3[r4]
            int r6 = X.AnonymousClass001.A0K(r2)
            r2 = r3[r1]
            long r3 = X.C18310x6.A0B(r2)
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "onPositionDiscontinuity "
            java.lang.String r5 = X.AnonymousClass000.A0Y(r2, r5, r6)
            java.lang.Object[] r2 = X.AnonymousClass4L0.A0U()
            r0.A0K(r5, r2)
            X.8LG r2 = r0.A0p
            boolean r2 = r2.improveLooping
            if (r2 == 0) goto L_0x0d0d
            if (r6 != 0) goto L_0x0d0d
            X.7yr r2 = r0.A0z
            int r5 = r2.A0W
            X.7qS r2 = r0.A12
            X.7br r2 = r2.A01
            int r2 = r2.A00()
            if (r5 != r2) goto L_0x0d0d
            X.7yr r12 = r0.A03(r3, r1)
            long r15 = r12.A0H
            boolean r2 = r12.A0R
            r49 = r2
            boolean r2 = r12.A0U
            r50 = r2
            r11 = 0
            long r13 = r12.A0X
            long r6 = r12.A09
            r33 = 0
            long r4 = r12.A0I
            java.lang.String r10 = r12.A0N
            java.lang.String r9 = ""
            if (r10 != 0) goto L_0x0bae
            r10 = r9
        L_0x0bae:
            int r2 = r12.A05
            r60 = r2
            int r2 = r12.A04
            r59 = r2
            long r2 = r12.A0D
            int r8 = r12.A03
            r58 = r8
            int r8 = r12.A06
            r57 = r8
            int r8 = r12.A01
            r56 = r8
            int r8 = r12.A02
            r55 = r8
            float r8 = r12.A00
            r20 = r8
            int r8 = r12.A07
            r21 = r8
            boolean r8 = r12.A0O
            r19 = r8
            int r8 = r12.A0W
            r18 = r8
            boolean r8 = r12.A0Q
            r17 = r8
            boolean r12 = r12.A0V
            X.7yr r8 = new X.7yr
            r29 = r13
            r31 = r13
            r39 = r33
            r41 = r33
            r45 = r33
            r47 = r33
            r22 = r18
            r23 = r15
            r25 = r13
            r27 = r6
            r35 = r33
            r37 = r4
            r43 = r2
            r51 = r11
            r52 = r19
            r53 = r17
            r54 = r12
            r12 = r8
            r13 = r10
            r14 = r20
            r15 = r60
            r16 = r59
            r17 = r58
            r18 = r57
            r19 = r56
            r20 = r55
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r50, r51, r52, r53, r54)
            X.85L r3 = r0.A0o
            X.7a6 r2 = r0.A10
            if (r2 == 0) goto L_0x0c1f
            X.7a6 r0 = r0.A10
            java.lang.String r9 = r0.A08
        L_0x0c1f:
            r3.BPY(r8, r9, r11)
            return r1
        L_0x0c23:
            X.8LG r0 = r0.A0p
            boolean r0 = r0.enableWifiLockManager
            if (r0 == 0) goto L_0x0d0d
            java.lang.String r0 = "isOnWifi"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0c30:
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r2 = "stopInternal"
            r0.A0K(r2, r3)
            r0.A19 = r1
            r0.A0O(r4)
            return r1
        L_0x0c3d:
            java.lang.Object r2 = r7.obj
            boolean r7 = X.AnonymousClass001.A1Z(r2)
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r2 = "moveToWarmupInternal"
            r0.A0K(r2, r3)
            r2 = 0
            r0.A0Q(r4, r2)
            X.8LG r2 = r0.A0p
            boolean r2 = r2.enablePauseNow
            if (r2 != 0) goto L_0x0c61
            int r2 = r0.A04
            long r10 = android.os.SystemClock.elapsedRealtime()
            r13 = r4
            r8 = r0
            r9 = r2
            r12 = r4
            r8.A0D(r9, r10, r12, r13)
        L_0x0c61:
            android.os.Handler r3 = r0.A0l
            r2 = 9
            r3.removeMessages(r2)
            X.85L r6 = r0.A0o
            X.6Nw r5 = new X.6Nw
            r5.<init>()
            X.7t5 r2 = r6.A00
            long r2 = r2.A0k
            r6.BbN(r2)
            r6.A01 = r5
            java.util.concurrent.atomic.AtomicBoolean r2 = r0.A0u
            r2.set(r1)
            r0.A0c = r4
            if (r7 == 0) goto L_0x0c89
            X.7qS r0 = r0.A12
            r2 = 0
            r0.A07(r2, r4)
            return r1
        L_0x0c89:
            int r2 = r0.A04
            long r7 = android.os.SystemClock.elapsedRealtime()
            r10 = r4
            r5 = r0
            r6 = r2
            r9 = r4
            r5.A0D(r6, r7, r9, r10)
            return r1
        L_0x0c97:
            java.lang.Object r2 = r7.obj
            boolean r5 = X.AnonymousClass001.A1Z(r2)
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r2 = "enableSRInternal"
            r0.A0K(r2, r3)
            X.7qS r0 = r0.A12
            X.7br r2 = r0.A01
            X.8x9[] r0 = r0.A0I
            r0 = r0[r4]
            X.7af r2 = r2.A04(r0)
            r0 = 10001(0x2711, float:1.4014E-41)
            r2.A01(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r2.A02(r0)
            r2.A00()
            return r1
        L_0x0cc0:
            java.lang.Object r2 = r7.obj
            X.8ub r2 = (X.C186008ub) r2
            X.7qS r0 = r0.A12
            r0.A08(r2)
            return r1
        L_0x0cca:
            java.lang.Object r3 = r7.obj
            X.7qS r0 = r0.A12
            java.util.List r2 = r0.A0U
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0d0d
            r2.remove(r3)
            return r1
        L_0x0cda:
            java.lang.Object r2 = r7.obj
            long r5 = X.C18310x6.A0B(r2)
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r2 = "setRelativePositionInternal"
            r0.A0K(r2, r3)
            X.6xH r3 = r0.A0M
            X.6xH r2 = X.C142486xH.DASH_LIVE
            if (r3 != r2) goto L_0x0d06
            X.7qS r2 = r0.A12
            X.7br r2 = r2.A01
            X.81Q r9 = r2.A0K
            boolean r2 = r9.A0q
            r7 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x0d00
            X.821 r4 = r9.A0k
            long r2 = r5 * r7
            r4.A01(r2)
        L_0x0d00:
            X.820 r2 = r9.A0i
            long r5 = r5 * r7
            r2.A01(r5)
        L_0x0d06:
            long r2 = android.os.SystemClock.elapsedRealtime()
            r0.A0E(r2)
        L_0x0d0d:
            return r1
        L_0x0d0e:
            X.7qS r0 = r0.A12
            X.7br r4 = r0.A01
            int r0 = r4.A00()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4.A07(r0, r2)
            return r1
        L_0x0d1f:
            java.lang.Object r2 = r7.obj
            int r4 = X.AnonymousClass001.A0K(r2)
            X.7qS r0 = r0.A12
            X.7br r0 = r0.A01
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0d43
        L_0x0d2f:
            java.lang.Object r3 = r7.obj
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r2 = r3[r4]
            int r4 = X.AnonymousClass001.A0K(r2)
            r2 = r3[r1]
            long r2 = X.C18310x6.A0B(r2)
            X.7qS r0 = r0.A12
            X.7br r0 = r0.A01
        L_0x0d43:
            r0.A07(r4, r2)
            return r1
        L_0x0d47:
            X.7qS r0 = r0.A12
            X.7br r0 = r0.A01
            r0.A0B(r4)
            return r1
        L_0x0d4f:
            r2 = -1
            r0.A09 = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162987t5.handleMessage(android.os.Message):boolean");
    }

    public C162987t5(Context context, Handler handler, HandlerThread handlerThread, AnonymousClass0Xd r11, C152777a6 r12, C186528vV r13, C150157Pl r14, C151857Wo r15, Map map, AtomicBoolean atomicBoolean, AtomicReference atomicReference, long j) {
        Looper mainLooper;
        AtomicBoolean atomicBoolean2 = new AtomicBoolean();
        this.A0u = atomicBoolean2;
        this.A0r = new AtomicBoolean(true);
        this.A0s = new AtomicBoolean(false);
        this.A0C = -1;
        this.A07 = -1;
        this.A0Z = false;
        this.A0a = false;
        this.A06 = 0;
        this.A05 = 0;
        this.A09 = -1;
        this.A0U = null;
        this.A19 = false;
        this.A0e = false;
        this.A0N = null;
        this.A0R = null;
        this.A0n = new C146597Aw(this);
        this.A0k = j;
        this.A0o = new AnonymousClass85L(r13, this);
        if (r13 instanceof C126436Nw) {
            atomicBoolean2.set(true);
        }
        this.A0m = r14;
        this.A0p = r14.A05;
        this.A0x = r14.A08;
        this.A08 = -1;
        this.A0Y = false;
        this.A0D = context;
        this.A0E = handler;
        this.A0W = atomicReference;
        this.A0Q = r15;
        this.A0L = r11;
        this.A0V = map;
        this.A0F = handlerThread;
        if (handlerThread != null) {
            mainLooper = handlerThread.getLooper();
        } else {
            mainLooper = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(mainLooper, this);
        this.A0l = handler2;
        new C1444371o();
        this.A0t = atomicBoolean;
        AnonymousClass8MF.A00(handler2, this, r12, 23);
    }

    public static AnonymousClass0MG A00(AbstractList abstractList, int i) {
        return (AnonymousClass0MG) abstractList.get(i);
    }

    public static void A01(Handler handler, C162987t5 r1, Object obj, int i) {
        r1.A0G(handler.obtainMessage(i, obj));
    }

    public final void A0A(float f) {
        Object[] A0L2 = AnonymousClass002.A0L();
        AnonymousClass000.A1L(A0L2, (int) (100.0f * f));
        A0K("setPlaybackSpeedInternal to: %d (x100)", A0L2);
        this.A00 = f;
        C161787qS r4 = this.A12;
        C158167jX r0 = r4.A03;
        C158167jX r2 = new C158167jX(f, r0.A00, r0.A04, r0.A03);
        C150717Rx.A00(r4.A01.A0K.A0j, r2, 4);
        r4.A03 = r2;
        A0E(SystemClock.elapsedRealtime());
    }

    public final void A0B(float f) {
        Object[] A0L2 = AnonymousClass002.A0L();
        AnonymousClass000.A1L(A0L2, (int) (100.0f * f));
        A0K("setVolumeInternal to: %d (x100)", A0L2);
        this.A01 = f;
        C161787qS r0 = this.A12;
        C153097af A042 = r0.A01.A04(r0.A0I[1]);
        A042.A01(2);
        A042.A02(Float.valueOf(f));
        A042.A00();
    }

    public final void A0C(int i) {
        Object[] A0L2 = AnonymousClass002.A0L();
        C18270x1.A1Q(A0L2, i);
        A0K("setAudioUsageInternal: %d", A0L2);
        this.A02 = i;
        C161787qS r0 = this.A12;
        AnonymousClass80g r2 = new AnonymousClass80g(i);
        C153097af A042 = r0.A01.A04(r0.A0I[1]);
        A042.A01(3);
        A042.A02(r2);
        A042.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008d, code lost:
        if (r0.A0F.A01() == false) goto L_0x008f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0Q(boolean r13, java.lang.String r14) {
        /*
            r12 = this;
            java.lang.Object[] r1 = X.AnonymousClass002.A0L()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)
            r10 = 0
            r1[r10] = r0
            java.lang.String r0 = "pauseInternal %b"
            r6 = r12
            r12.A0K(r0, r1)
            r12.A0i = r10
            r12.A0a = r13
            X.7qS r0 = r12.A12
            r0.A0A(r10)
            X.8LG r5 = r12.A0p
            boolean r0 = r5.enableVodPausedLoading
            if (r0 == 0) goto L_0x005f
            X.6xH r1 = r12.A0M
            X.6xH r0 = X.C142486xH.DASH_LIVE
            if (r1 == r0) goto L_0x005f
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x005f
            java.util.Set r1 = r5.pausedLoadingTriggerTypes
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x005f
            boolean r0 = r1.contains(r14)
            if (r0 == 0) goto L_0x005f
            X.7a6 r0 = r12.A10
            if (r0 == 0) goto L_0x005f
            X.7a6 r0 = r12.A10
            X.7yv r0 = r0.A0F
            java.lang.String r1 = r0.A0B
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x005f
            java.lang.String r0 = r5.playerOriginPausedLoadingBlackList
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x005f
            X.7qS r4 = r12.A12
            int r0 = r5.maxBufferToDownloadInPausedLoadingMs
            long r2 = (long) r0
            int r0 = r5.maxTimeAllowedSpentInPausedLoadingMs
            long r0 = (long) r0
            X.8v7 r4 = r4.A02
            r4.Bmr(r2, r0)
        L_0x005f:
            boolean r0 = r5.enablePauseNow
            if (r0 == 0) goto L_0x006d
            int r7 = r12.A04
            long r8 = android.os.SystemClock.elapsedRealtime()
            r11 = r10
            r6.A0D(r7, r8, r10, r11)
        L_0x006d:
            if (r14 == 0) goto L_0x009b
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x009b
            java.lang.String r0 = "short_form_video_invisible"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x009b
            boolean r0 = r5.disableVideoTrackForInVisibleVDD
            if (r0 == 0) goto L_0x009b
            X.7a6 r0 = r12.A10
            r2 = 1
            if (r0 == 0) goto L_0x008f
            X.7yv r0 = r0.A0F
            boolean r0 = r0.A01()
            r1 = 1
            if (r0 != 0) goto L_0x0090
        L_0x008f:
            r1 = 0
        L_0x0090:
            boolean r0 = r5.shouldDisableAV1VideoTrackOnlyforVDD
            if (r0 == 0) goto L_0x0096
            if (r1 == 0) goto L_0x009b
        L_0x0096:
            r12.A0N(r10)
            r12.A0e = r2
        L_0x009b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162987t5.A0Q(boolean, java.lang.String):void");
    }
}
