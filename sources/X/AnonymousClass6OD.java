package X;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.google.android.exoplayer2.Timeline;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* renamed from: X.6OD  reason: invalid class name */
public class AnonymousClass6OD extends C1685885z implements C187578xT {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public Surface A04;
    public SurfaceHolder A05;
    public TextureView A06;
    public C166527yp A07;
    public C166527yp A08;
    public C158427jx A09;
    public C150277Pz A0A;
    public C150277Pz A0B;
    public C151497Va A0C;
    public List A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H = false;
    public boolean A0I;
    public final Context A0J;
    public final C147797Ft A0K;
    public final AnonymousClass7ZX A0L;
    public final AnonymousClass6OC A0M;
    public final C1685785y A0N;
    public final C158607kG A0O;
    public final AnonymousClass7BC A0P;
    public final AnonymousClass7BD A0Q;
    public final C1685685x A0R;
    public final CopyOnWriteArraySet A0S;
    public final CopyOnWriteArraySet A0T;
    public final CopyOnWriteArraySet A0U;
    public final CopyOnWriteArraySet A0V;
    public final CopyOnWriteArraySet A0W;
    public final C187588xU[] A0X;

    public final void A06(int i, int i2, boolean z) {
        boolean z2;
        int i3 = 0;
        if (!z || i == -1) {
            z2 = false;
        } else {
            z2 = true;
            if (i != 1) {
                i3 = 1;
            }
        }
        this.A0M.A03(i3, i2, z2);
    }

    public AnonymousClass6OD(AnonymousClass7Q7 r20) {
        int generateAudioSessionId;
        int i;
        AnonymousClass7Q7 r2 = r20;
        Context context = r2.A0B;
        Context applicationContext = context.getApplicationContext();
        this.A0J = applicationContext;
        C1685685x r8 = r2.A04;
        this.A0R = r8;
        this.A09 = r2.A05;
        C1685785y r15 = new C1685785y(this);
        this.A0N = r15;
        this.A0W = new CopyOnWriteArraySet();
        this.A0S = new CopyOnWriteArraySet();
        this.A0V = new CopyOnWriteArraySet();
        this.A0U = new CopyOnWriteArraySet();
        this.A0T = new CopyOnWriteArraySet();
        Handler handler = new Handler(r2.A00);
        C187588xU[] B0y = r2.A0C.B0y(handler, r15, r15, r15, r15);
        this.A0X = B0y;
        this.A00 = 1.0f;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        if (audioManager == null) {
            generateAudioSessionId = -1;
        } else {
            generateAudioSessionId = audioManager.generateAudioSessionId();
        }
        this.A01 = generateAudioSessionId;
        this.A0D = Collections.emptyList();
        this.A0I = true;
        AnonymousClass7GA r10 = r2.A07;
        C178138h2 r9 = r2.A06;
        C177988gm r5 = r2.A02;
        C178268hG r11 = r2.A08;
        C158027jJ r7 = r2.A03;
        AnonymousClass6OC r22 = new AnonymousClass6OC(r2.A00, r2.A01, r5, this, r7, r8, r9, r10, r11, r2.A09, B0y);
        this.A0M = r22;
        r22.AwU(r15);
        this.A0K = new C147797Ft(context, handler, r15);
        this.A0L = new AnonymousClass7ZX(context, handler, r15);
        C158607kG r52 = new C158607kG(context, handler, r15);
        this.A0O = r52;
        if (2 - this.A09.A01 != 0) {
            i = 3;
        } else {
            i = 0;
        }
        r52.A03(i);
        this.A0P = new AnonymousClass7BC(context);
        this.A0Q = new AnonymousClass7BD(context);
        this.A0C = new C151497Va(r52.A01(), r52.A05.getStreamMaxVolume(r52.A00));
        A09(Integer.valueOf(this.A01), 1, 102);
        A09(Integer.valueOf(this.A01), 2, 102);
        A09(this.A09, 1, 3);
        A09(1, 2, 4);
        A09(Boolean.valueOf(this.A0H), 1, 101);
    }

    public final void A02() {
        TextureView textureView = this.A06;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.A0N) {
                Log.w("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.A06.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            }
            this.A06 = null;
        }
        SurfaceHolder surfaceHolder = this.A05;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.A0N);
            this.A05 = null;
        }
    }

    public final void A05(int i, int i2) {
        if (i != this.A03 || i2 != this.A02) {
            this.A03 = i;
            this.A02 = i2;
            C1685685x r3 = this.A0R;
            AnonymousClass7XD A002 = C158187jZ.A00(r3);
            r3.A03(A002, C1894991n.A00(A002, 15), 1029);
            Iterator it = this.A0W.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b2, code lost:
        if (r7 >= r12.A01) goto L_0x00b4;
     */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(X.C186428vI r20, boolean r21) {
        /*
            r19 = this;
            r1 = r19
            r1.A03()
            java.util.List r12 = java.util.Collections.singletonList(r20)
            r7 = -1
            if (r21 == 0) goto L_0x000d
            r7 = 0
        L_0x000d:
            r1.A03()
            X.6OC r3 = r1.A0M
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r16 = r3.A00()
            long r14 = r3.B6W()
            int r0 = r3.A02
            r6 = 1
            int r0 = r0 + 1
            r3.A02 = r0
            java.util.List r10 = r3.A0L
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x0045
            int r8 = r10.size()
            r2 = 0
            int r0 = r8 + -1
        L_0x0035:
            if (r0 < r2) goto L_0x003d
            r10.remove(r0)
            int r0 = r0 + -1
            goto L_0x0035
        L_0x003d:
            X.8ul r0 = r3.A07
            X.8ul r0 = r0.Az1(r2, r8)
            r3.A07 = r0
        L_0x0045:
            r2 = 0
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            r13 = 0
        L_0x004b:
            int r0 = r12.size()
            if (r13 >= r0) goto L_0x0072
            java.lang.Object r11 = r12.get(r13)
            X.8vI r11 = (X.C186428vI) r11
            boolean r9 = r3.A0M
            X.85u r0 = new X.85u
            r0.<init>(r11, r9)
            r8.add(r0)
            java.lang.Object r11 = r0.A03
            X.6PN r0 = r0.A02
            X.6PR r9 = r0.A01
            X.85t r0 = new X.85t
            r0.<init>(r9, r11)
            r10.add(r13, r0)
            int r13 = r13 + 1
            goto L_0x004b
        L_0x0072:
            X.8ul r9 = r3.A07
            int r0 = r8.size()
            X.8ul r0 = r9.Ayz(r2, r0)
            r3.A07 = r0
            X.6OB r12 = new X.6OB
            r12.<init>(r0, r10)
            int r0 = r12.A01()
            boolean r13 = X.AnonymousClass000.A1T(r0)
            if (r13 != 0) goto L_0x0097
            int r0 = r12.A01
            if (r7 < r0) goto L_0x0097
            X.6zv r0 = new X.6zv
            r0.<init>(r12, r7, r4)
            throw r0
        L_0x0097:
            r11 = -1
            if (r7 != r11) goto L_0x009d
            r7 = r16
            r4 = r14
        L_0x009d:
            X.7oF r9 = r3.A05
            android.util.Pair r0 = r3.A01(r12, r7, r4)
            X.7oF r10 = r3.A02(r0, r9, r12)
            int r9 = r10.A00
            if (r7 == r11) goto L_0x00b5
            if (r9 == r6) goto L_0x00b5
            if (r13 != 0) goto L_0x00b4
            int r0 = r12.A01
            r9 = 2
            if (r7 < r0) goto L_0x00b5
        L_0x00b4:
            r9 = 4
        L_0x00b5:
            X.7oF r9 = r10.A01(r9)
            X.87l r0 = r3.A0B
            long r14 = X.C161207pD.A00(r4)
            X.8ul r11 = r3.A07
            X.8hJ r4 = r0.A0Y
            X.7M2 r10 = new X.7M2
            r12 = r8
            r13 = r7
            r10.<init>(r11, r12, r13, r14)
            r0 = 17
            X.88l r4 = (X.C1692188l) r4
            android.os.Handler r5 = r4.A00
            X.C18290x4.A1C(r5, r10, r0)
            r10 = 4
            r15 = 1
            r14 = r2
            r11 = r2
            r12 = r6
            r13 = r2
            r8 = r3
            r8.A05(r9, r10, r11, r12, r13, r14)
            r1.A03()
            boolean r7 = r1.BBP()
            X.7ZX r0 = r1.A0L
            r4 = -1
            r0.A00()
            if (r7 == 0) goto L_0x00ed
            r4 = 1
        L_0x00ed:
            r0 = 1
            if (r7 == 0) goto L_0x00f3
            if (r4 == r6) goto L_0x00f3
            r0 = 2
        L_0x00f3:
            r1.A06(r4, r0, r7)
            X.7oF r1 = r3.A05
            int r0 = r1.A00
            if (r0 != r6) goto L_0x012b
            r0 = 0
            X.7oF r4 = r1.A03(r0)
            com.google.android.exoplayer2.Timeline r0 = r4.A05
            int r0 = r0.A01()
            boolean r1 = X.AnonymousClass000.A1T(r0)
            r0 = 2
            if (r1 == 0) goto L_0x010f
            r0 = 4
        L_0x010f:
            X.7oF r13 = r4.A01(r0)
            int r0 = r3.A02
            int r0 = r0 + 1
            r3.A02 = r0
            android.os.Message r0 = r5.obtainMessage(r2)
            r0.sendToTarget()
            r14 = 4
            r18 = r2
            r12 = r3
            r16 = r6
            r17 = r2
            r12.A05(r13, r14, r15, r16, r17, r18)
        L_0x012b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6OD.A08(X.8vI, boolean):void");
    }

    public final void A09(Object obj, int i, int i2) {
        for (C187588xU r7 : this.A0X) {
            if (((AnonymousClass861) r7).A09 == i) {
                AnonymousClass6OC r4 = this.A0M;
                C1689687l r6 = r4.A0B;
                Timeline timeline = r4.A05.A05;
                r4.A00();
                AnonymousClass7XC r42 = new AnonymousClass7XC(r6.A0L, r6, r7, timeline, r4.A0I);
                boolean z = !r42.A05;
                C161487pm.A04(z);
                r42.A00 = i2;
                C161487pm.A04(z);
                r42.A02 = obj;
                r42.A00();
            }
        }
    }

    public void BjC(C186488vR r2) {
        this.A0M.BjC(r2);
    }

    public static /* synthetic */ void A00(AnonymousClass6OD r2) {
        int BBS = r2.BBS();
        if (BBS == 1) {
            return;
        }
        if (BBS == 2 || BBS == 3) {
            r2.A03();
            r2.A03();
            r2.A03();
        } else if (BBS != 4) {
            throw AnonymousClass6CA.A0O();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void A01() {
        /*
            r13 = this;
            r13.A03()
            r4 = 0
            r5 = 0
            X.7kG r3 = r13.A0O
            X.6Ca r1 = r3.A02
            if (r1 == 0) goto L_0x001b
            android.content.Context r0 = r3.A04     // Catch:{ RuntimeException -> 0x0011 }
            r0.unregisterReceiver(r1)     // Catch:{ RuntimeException -> 0x0011 }
            goto L_0x0019
        L_0x0011:
            r2 = move-exception
            java.lang.String r1 = "StreamVolumeManager"
            java.lang.String r0 = "Error unregistering stream volume receiver"
            X.C159307lc.A01(r0, r1, r2)
        L_0x0019:
            r3.A02 = r4
        L_0x001b:
            X.7ZX r0 = r13.A0L
            r0.A02 = r4
            r0.A00()
            X.6OC r3 = r13.A0M
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Release "
            X.AnonymousClass000.A1J(r2, r0, r3)
            java.lang.String r0 = " ["
            r2.append(r0)
            java.lang.String r0 = "ExoPlayerLib/2.13.3"
            r2.append(r0)
            java.lang.String r1 = "] ["
            r2.append(r1)
            java.lang.String r0 = X.C162387ry.A03
            r2.append(r0)
            r2.append(r1)
            java.lang.Class<X.7ed> r1 = X.C155297ed.class
            monitor-enter(r1)
            java.lang.String r0 = X.C155297ed.A00     // Catch:{ all -> 0x0129 }
            monitor-exit(r1)
            java.lang.String r1 = X.AnonymousClass000.A0W(r0, r2)
            java.lang.String r0 = "ExoPlayerImpl"
            android.util.Log.i(r0, r1)
            X.87l r8 = r3.A0B
            monitor-enter(r8)
            boolean r0 = r8.A0F     // Catch:{ all -> 0x0126 }
            if (r0 != 0) goto L_0x009f
            android.os.HandlerThread r0 = r8.A0K     // Catch:{ all -> 0x0126 }
            boolean r0 = r0.isAlive()     // Catch:{ all -> 0x0126 }
            if (r0 == 0) goto L_0x009f
            X.8hJ r1 = r8.A0Y     // Catch:{ all -> 0x0126 }
            r0 = 7
            X.C1692188l.A00(r1, r0)     // Catch:{ all -> 0x0126 }
            r0 = 5
            X.75z r10 = new X.75z     // Catch:{ all -> 0x0126 }
            r10.<init>(r8, r0)     // Catch:{ all -> 0x0126 }
            r0 = 500(0x1f4, double:2.47E-321)
            monitor-enter(r8)     // Catch:{ all -> 0x0126 }
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x009c }
            long r11 = r11 + r0
            r9 = 0
        L_0x0077:
            java.lang.Object r2 = r10.get()     // Catch:{ all -> 0x009c }
            boolean r2 = X.AnonymousClass001.A1Z(r2)     // Catch:{ all -> 0x009c }
            if (r2 != 0) goto L_0x0093
            r6 = 0
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x0093
            r8.wait(r0)     // Catch:{ InterruptedException -> 0x008b }
            goto L_0x008c
        L_0x008b:
            r9 = 1
        L_0x008c:
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x009c }
            long r0 = r11 - r6
            goto L_0x0077
        L_0x0093:
            if (r9 == 0) goto L_0x0098
            X.C18300x5.A11()     // Catch:{ all -> 0x009c }
        L_0x0098:
            monitor-exit(r8)     // Catch:{ all -> 0x0126 }
            boolean r0 = r8.A0F     // Catch:{ all -> 0x0126 }
            goto L_0x00a1
        L_0x009c:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0126 }
            throw r0     // Catch:{ all -> 0x0126 }
        L_0x009f:
            monitor-exit(r8)
            goto L_0x00b3
        L_0x00a1:
            monitor-exit(r8)
            if (r0 != 0) goto L_0x00b3
            X.7Zr r2 = r3.A0K
            X.91r r1 = new X.91r
            r1.<init>(r5)
            r0 = 11
            r2.A02(r1, r0)
            r2.A00()
        L_0x00b3:
            X.7Zr r0 = r3.A0K
            r0.A01()
            X.8hJ r0 = r3.A0J
            X.88l r0 = (X.C1692188l) r0
            android.os.Handler r0 = r0.A00
            r0.removeCallbacksAndMessages(r4)
            X.85x r1 = r3.A0D
            if (r1 == 0) goto L_0x00ce
            X.8hG r0 = r3.A0H
            X.88U r0 = (X.AnonymousClass88U) r0
            X.7RK r0 = r0.A09
            r0.A00(r1)
        L_0x00ce:
            X.7oF r1 = r3.A05
            r0 = 1
            X.7oF r1 = r1.A01(r0)
            r3.A05 = r1
            X.6PS r0 = r1.A07
            X.7oF r2 = r1.A06(r0)
            r3.A05 = r2
            long r0 = r2.A0G
            r2.A0F = r0
            X.7oF r2 = r3.A05
            r0 = 0
            r2.A0H = r0
            X.85x r1 = r13.A0R
            X.7XD r2 = X.C158187jZ.A01(r1)
            android.util.SparseArray r0 = r1.A03
            r3 = 1036(0x40c, float:1.452E-42)
            r0.put(r3, r2)
            X.7Zr r1 = r1.A01
            r0 = 19
            X.91n r2 = X.C1894991n.A00(r2, r0)
            X.8hJ r0 = r1.A02
            r1 = 1
            X.88l r0 = (X.C1692188l) r0
            android.os.Handler r0 = r0.A00
            android.os.Message r0 = r0.obtainMessage(r1, r3, r5, r2)
            r0.sendToTarget()
            r13.A02()
            android.view.Surface r1 = r13.A04
            if (r1 == 0) goto L_0x011c
            boolean r0 = r13.A0F
            if (r0 == 0) goto L_0x011a
            r1.release()
        L_0x011a:
            r13.A04 = r4
        L_0x011c:
            java.util.List r0 = java.util.Collections.emptyList()
            r13.A0D = r0
            r0 = 1
            r13.A0G = r0
            return
        L_0x0126:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x0129:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6OD.A01():void");
    }

    public final void A03() {
        IllegalStateException A0O2;
        if (Looper.myLooper() == this.A0M.A09) {
            return;
        }
        if (!this.A0I) {
            if (this.A0E) {
                A0O2 = null;
            } else {
                A0O2 = AnonymousClass6CA.A0O();
            }
            C159307lc.A01("Player is accessed on the wrong thread. See https://exoplayer.dev/issues/player-accessed-on-wrong-thread", "SimpleExoPlayer", A0O2);
            this.A0E = true;
            return;
        }
        throw AnonymousClass001.A0e("Player is accessed on the wrong thread. See https://exoplayer.dev/issues/player-accessed-on-wrong-thread");
    }

    public void A04(float f) {
        A03();
        float A012 = AnonymousClass001.A01(f, 1.0f, 0.0f);
        if (this.A00 != A012) {
            this.A00 = A012;
            A09(Float.valueOf(A012 * this.A0L.A00), 1, 2);
            C1685685x r3 = this.A0R;
            AnonymousClass7XD A002 = C158187jZ.A00(r3);
            r3.A03(A002, C1894991n.A00(A002, 21), 1019);
            Iterator it = this.A0S.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass001.A0g("onVolumeChanged");
            }
        }
    }

    public final void A07(Surface surface, boolean z) {
        Surface surface2;
        ArrayList A0s = AnonymousClass001.A0s();
        C187588xU[] r7 = this.A0X;
        int length = r7.length;
        int i = 0;
        while (true) {
            surface2 = surface;
            if (i >= length) {
                break;
            }
            C187588xU r15 = r7[i];
            if (((AnonymousClass861) r15).A09 == 2) {
                AnonymousClass6OC r8 = this.A0M;
                C1689687l r14 = r8.A0B;
                Timeline timeline = r8.A05.A05;
                r8.A00();
                AnonymousClass7XC r12 = new AnonymousClass7XC(r14.A0L, r14, r15, timeline, r8.A0I);
                boolean z2 = !r12.A05;
                C161487pm.A04(z2);
                r12.A00 = 1;
                C161487pm.A04(z2);
                r12.A02 = surface2;
                r12.A00();
                A0s.add(r12);
            }
            i++;
        }
        Surface surface3 = this.A04;
        if (!(surface3 == null || surface3 == surface2)) {
            try {
                Iterator it = A0s.iterator();
                while (it.hasNext()) {
                    AnonymousClass7XC r72 = (AnonymousClass7XC) it.next();
                    long j = 2000;
                    synchronized (r72) {
                        C161487pm.A04(r72.A05);
                        C161487pm.A04(C18300x5.A1W(r72.A01.getThread(), Thread.currentThread()));
                        long elapsedRealtime = SystemClock.elapsedRealtime() + 2000;
                        while (!r72.A04) {
                            if (j > 0) {
                                r72.wait(j);
                                j = elapsedRealtime - SystemClock.elapsedRealtime();
                            } else {
                                throw new TimeoutException("Message delivery timed out.");
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                C18300x5.A11();
            } catch (TimeoutException unused2) {
                this.A0M.A04(new C143886zd((C166527yp) null, (String) null, new C143446yt(3), 1, -1, 4, false), false);
            }
            if (this.A0F) {
                this.A04.release();
            }
        }
        this.A04 = surface2;
        this.A0F = z;
    }

    public void A0A(boolean z) {
        A03();
        AnonymousClass7ZX r0 = this.A0L;
        A03();
        AnonymousClass6OC r1 = this.A0M;
        r0.A00();
        r1.A04((C143886zd) null, z);
        this.A0D = Collections.emptyList();
    }

    public void AwU(C186488vR r2) {
        r2.getClass();
        this.A0M.AwU(r2);
    }

    public long B4x() {
        A03();
        return this.A0M.B4x();
    }

    public long B5u() {
        A03();
        return this.A0M.B5u();
    }

    public int B6L() {
        A03();
        return this.A0M.B6L();
    }

    public int B6M() {
        A03();
        return this.A0M.B6M();
    }

    public int B6V() {
        A03();
        return this.A0M.B6V();
    }

    public long B6W() {
        A03();
        return this.A0M.B6W();
    }

    public Timeline B6b() {
        A03();
        return this.A0M.A05.A05;
    }

    public int B6d() {
        A03();
        return this.A0M.B6d();
    }

    public long B7A() {
        A03();
        return this.A0M.B7A();
    }

    public boolean BBP() {
        A03();
        return this.A0M.A05.A0D;
    }

    public int BBS() {
        A03();
        return this.A0M.A05.A00;
    }

    public long BDn() {
        A03();
        return this.A0M.BDn();
    }

    public boolean BIQ() {
        A03();
        return this.A0M.BIQ();
    }

    public void Bl1(int i, long j) {
        A03();
        C1685685x r3 = this.A0R;
        if (!r3.A02) {
            AnonymousClass7XD A012 = C158187jZ.A01(r3);
            r3.A02 = true;
            r3.A03(A012, C1894991n.A00(A012, 22), -1);
        }
        this.A0M.Bl1(i, j);
    }

    public void Bmw(boolean z) {
        A03();
        AnonymousClass7ZX r0 = this.A0L;
        A03();
        int i = -1;
        r0.A00();
        if (z) {
            i = 1;
        }
        int i2 = 1;
        if (z && i != 1) {
            i2 = 2;
        }
        A06(i, i2, z);
    }
}
