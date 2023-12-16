package X;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.LruCache;
import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.7l9  reason: invalid class name and case insensitive filesystem */
public class C159117l9 {
    public static C159117l9 A0Y;
    public Handler A00;
    public HandlerThread A01;
    public AnonymousClass71C A02;
    public AnonymousClass0Xd A03;
    public C146547Ar A04;
    public C1444571q A05;
    public C160737oE A06;
    public final Context A07;
    public final AnonymousClass71E A08;
    public final C155717fO A09;
    public final ServiceEventCallbackImpl A0A;
    public final AnonymousClass8LG A0B;
    public final C1445071v A0C;
    public final C150267Py A0D;
    public final C156817hG A0E;
    public final Object A0F = AnonymousClass002.A0D();
    public final Map A0G;
    public final AtomicBoolean A0H;
    public final AtomicBoolean A0I;
    public final AtomicBoolean A0J;
    public final AtomicBoolean A0K;
    public final AtomicBoolean A0L;
    public final AtomicReference A0M;
    public final AtomicReference A0N;
    public final AtomicReference A0O;
    public final AtomicReference A0P;
    public final AtomicReference A0Q;
    public final AtomicReference A0R;
    public final AtomicReference A0S;
    public final AtomicReference A0T;
    public volatile C150157Pl A0U;
    public volatile C151857Wo A0V;
    public volatile C186628vg A0W;
    public volatile boolean A0X;

    public C159117l9(Context context, AnonymousClass8LG r26, C186628vg r27, HashMap hashMap) {
        C155857fd r0;
        String str;
        AtomicReference atomicReference = new AtomicReference((Object) null);
        this.A0N = atomicReference;
        this.A0Q = new AtomicReference((Object) null);
        this.A0S = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        this.A0T = atomicReference2;
        ServiceEventCallbackImpl serviceEventCallbackImpl = new ServiceEventCallbackImpl(atomicReference);
        this.A0A = serviceEventCallbackImpl;
        this.A09 = new C155717fO(serviceEventCallbackImpl);
        this.A08 = new AnonymousClass71E();
        this.A0C = new C1445071v();
        this.A0I = new AtomicBoolean(false);
        this.A0J = new AtomicBoolean(false);
        this.A0K = new AtomicBoolean(true);
        this.A0H = new AtomicBoolean(false);
        this.A0L = new AtomicBoolean(false);
        this.A0O = new AtomicReference(new C146537Aq());
        C142936y3 r1 = C142936y3.GREEN;
        this.A0R = new AtomicReference(r1);
        this.A0P = new AtomicReference(r1);
        this.A0M = new AtomicReference(r1);
        this.A0W = C186628vg.A00;
        C153827c5.A01("initHeroManager");
        try {
            atomicReference2.set((Object) null);
            this.A0G = hashMap;
            AnonymousClass8LG r3 = r26;
            this.A0B = r3;
            this.A07 = context;
            if (r3.enableCreateByteBufferFromABufferNullCheckHooks || r3.enableFillBufferHooks || r3.enableFreeNodeHooks || r3.enableOnMessageReceivedHooks || r3.enableSendCommandHooks || r3.enableOnOMXEmptyBufferDoneHooks || r3.enableFillFreeBufferCheckNodeHooks) {
                synchronized (AnonymousClass71G.class) {
                }
            }
            if (!r3.reportExceptionsAsSoftErrors || (str = r3.serviceInjectorClassName) == null) {
                C161157p6.A00 = r3.enableDebugLogs;
                C161157p6.A01 = r3.skipDebugLogs;
                AtomicReference atomicReference3 = this.A0Q;
                C1445071v r7 = this.A0C;
                atomicReference3.set(new C161397pY(r3, r7));
                if (r3.enableGlobalStallMonitor) {
                    synchronized (C155617fC.A02) {
                        try {
                            C155617fC.A01 = true;
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                }
                if (r3.enableGlobalNetworkMonitor) {
                    synchronized (C155857fd.class) {
                        r0 = C155857fd.A01;
                    }
                    synchronized (r0) {
                    }
                }
                if (r3.enableVodDrmPrefetch) {
                    C159977mn A002 = C159977mn.A00();
                    int i = r3.drmSessionStoreCapacity;
                    synchronized (A002) {
                        A002.A00 = new LruCache(i);
                    }
                }
                C146567At r14 = null;
                this.A02 = new AnonymousClass71C();
                synchronized (C160307nP.class) {
                    try {
                        C160307nP.A07 = new C160307nP(C186588vc.A00);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                AtomicReference atomicReference4 = this.A0S;
                C146587Av r11 = new C146587Av(atomicReference4);
                AnonymousClass71C r10 = this.A02;
                AnonymousClass71E r12 = this.A08;
                AtomicReference atomicReference5 = this.A0O;
                this.A0U = new C150157Pl(r10, r12, r11, r3, r7, atomicReference3, atomicReference5, new AtomicReference((Object) null));
                Context context2 = this.A07;
                this.A05 = new C1444571q();
                C150157Pl r13 = this.A0U;
                r13.getClass();
                this.A0V = new C151857Wo(r13, r3);
                if (this.A03 == null) {
                    Map map = this.A0G;
                    AnonymousClass0Xd r15 = new AnonymousClass0Xd(context2, A01(), new AnonymousClass859(this), (C161397pY) atomicReference3.get(), r3, map);
                    this.A03 = r15;
                    C146587Av r152 = new C146587Av(atomicReference4);
                    C161397pY r16 = (C161397pY) atomicReference3.get();
                    this.A06 = new C160737oE(context2, r12, r15, (r3.enablePrefetchCancelCallback || r3.isVideoQplPipelineEnabled) ? new C146567At(this) : r14, r152, r16, r3, r7, map, atomicReference5);
                    if (r3.enableWarmCodec) {
                        Looper A0S2 = AnonymousClass6C9.A0S(new HandlerThread("HeroWarmupThread"));
                        AnonymousClass8MF.A00(new Handler(A0S2), this, A0S2, 22);
                    }
                    if (r3.isEarlyPreallocateCodec && r3.earlyPreallocateCodecOnAppNotScrolling && !r3.enableAlwaysCallPreallocateCodec) {
                        this.A0I.compareAndSet(false, true);
                    }
                }
                this.A0W = r27;
                C156817hG r5 = new C156817hG(new C146577Au(this), r3, this.A0W);
                this.A0E = r5;
                if (r3.enableWarmupScheduler) {
                    C150267Py r4 = new C150267Py(A01(), AnonymousClass000.A0A(), r3, r5);
                    this.A0D = r4;
                    r4.A07.set(this);
                    if (!r4.A03.enableStopWarmupSchedulerEmpty && !r4.A08) {
                        C172668Mf.A00(r4.A02, r4, 20);
                        r4.A08 = true;
                    }
                } else {
                    this.A0D = null;
                }
                if (r3.usePrefetchFilter) {
                    this.A04 = new C146547Ar();
                }
                C153827c5.A00();
                return;
            }
            try {
                Class.forName(str).newInstance();
                throw AnonymousClass001.A0g("init");
            } catch (Exception e) {
                throw C18330xA.A09(e);
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        } catch (Throwable th4) {
            C153827c5.A00();
            throw th4;
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [int, boolean] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A08(android.os.ResultReceiver r5, long r6) {
        /*
            r4 = this;
            r3 = 1
            java.lang.Object[] r2 = new java.lang.Object[r3]
            boolean r1 = X.AnonymousClass6C9.A1S(r2, r6)
            java.lang.String r0 = "id [%d]: releaseSurface"
            X.7t5 r2 = X.C151857Wo.A01(r4, r0, r2, r6)
            if (r2 != 0) goto L_0x0010
            return r1
        L_0x0010:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = "Release surface"
            r2.A0K(r0, r1)
            android.os.Handler r1 = r2.A0l
            r0 = 7
            X.C162987t5.A01(r1, r2, r5, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159117l9.A08(android.os.ResultReceiver, long):boolean");
    }

    public static C159117l9 A00(Context context, AnonymousClass8LG r3, C186628vg r4, HashMap hashMap) {
        C159117l9 r0 = A0Y;
        if (r0 != null) {
            return r0;
        }
        synchronized (C159117l9.class) {
            C159117l9 r02 = A0Y;
            if (r02 != null) {
                return r02;
            }
            A0Y = new C159117l9(context, r3, r4, hashMap);
            C159597m9.A00 = false;
            return A0Y;
        }
    }

    public final Handler A01() {
        if (this.A0B.useMainThreadForHeroPlayer) {
            return AnonymousClass000.A0A();
        }
        if (this.A00 == null) {
            synchronized (this.A0F) {
                if (this.A00 == null) {
                    if (this.A01 == null) {
                        HandlerThread handlerThread = new HandlerThread("HeroManagerBackgroundHandlerThread", 10);
                        this.A01 = handlerThread;
                        handlerThread.start();
                    }
                    this.A00 = AnonymousClass6C9.A0R(this.A01);
                }
            }
        }
        return this.A00;
    }

    public void A02() {
        C151857Wo r0 = this.A0V;
        if (r0 != null) {
            r0.A00.evictAll();
        }
        if (this.A0B.shouldCleanupHeroManagerThread) {
            synchronized (this.A0F) {
                HandlerThread handlerThread = this.A01;
                if (handlerThread != null) {
                    this.A00 = null;
                    handlerThread.quit();
                    this.A01 = null;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        r1 = (X.C126456Ny) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(java.lang.String r16) {
        /*
            r15 = this;
            r2 = r16
            java.lang.Object[] r1 = X.AnonymousClass000.A1b(r2)
            java.lang.String r0 = "boostOngoingPrefetchPriorityForVideo %s"
            X.C159597m9.A02(r0, r1)
            X.7oE r1 = r15.A06
            X.7UA r0 = r1.A03
            X.7VX r3 = new X.7VX
            r3.<init>(r1, r2)
            java.util.LinkedList r2 = r0.A05
            monitor-enter(r2)
            java.util.HashSet r0 = r0.A04     // Catch:{ all -> 0x006a }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x006a }
        L_0x001d:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0068
            java.lang.Object r0 = r6.next()     // Catch:{ all -> 0x006a }
            X.7Xs r0 = (X.C152147Xs) r0     // Catch:{ all -> 0x006a }
            X.7bc r1 = r0.A00     // Catch:{ all -> 0x006a }
            boolean r0 = r3.equals(r1)     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x001d
            boolean r0 = r1 instanceof X.C126456Ny     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x001d
            X.6Ny r1 = (X.C126456Ny) r1     // Catch:{ all -> 0x006a }
            X.7yW r5 = r1.A01     // Catch:{ all -> 0x006a }
            if (r5 == 0) goto L_0x001d
            X.0Xd r4 = r1.A03     // Catch:{ all -> 0x006a }
            X.7yv r0 = r5.A0E     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x001d
            java.lang.String r9 = r0.A0H     // Catch:{ all -> 0x006a }
            if (r9 == 0) goto L_0x001d
            android.net.Uri r7 = r0.A05     // Catch:{ all -> 0x006a }
            if (r7 == 0) goto L_0x001d
            java.lang.String r8 = r5.A0F     // Catch:{ all -> 0x006a }
            X.8LG r1 = r4.A0D     // Catch:{ all -> 0x006a }
            X.8L1 r0 = r1.abrSetting     // Catch:{ all -> 0x006a }
            boolean r10 = r0.hashUrlForUnique     // Catch:{ all -> 0x006a }
            boolean r11 = r1.useShortKey     // Catch:{ all -> 0x006a }
            boolean r12 = r5.A0S     // Catch:{ all -> 0x006a }
            boolean r13 = r1.splitLastSegmentCachekey     // Catch:{ all -> 0x006a }
            boolean r14 = r1.skipThumbnailCacheKey     // Catch:{ all -> 0x006a }
            java.lang.String r0 = X.C161157p6.A00(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x006a }
            java.util.Map r1 = r4.A0E     // Catch:{ all -> 0x006a }
            monitor-enter(r1)     // Catch:{ all -> 0x006a }
            r1.get(r0)     // Catch:{ all -> 0x0065 }
            monitor-exit(r1)     // Catch:{ all -> 0x0065 }
            goto L_0x001d
        L_0x0065:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0065 }
            throw r0     // Catch:{ all -> 0x006a }
        L_0x0068:
            monitor-exit(r2)     // Catch:{ all -> 0x006a }
            return
        L_0x006a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x006a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159117l9.A04(java.lang.String):void");
    }

    public void A05(String str, boolean z) {
        C187438xD r0;
        String str2 = str;
        Object[] A1a = C18310x6.A1a(str2);
        AnonymousClass6C7.A1V(A1a, 1, z);
        C159597m9.A02("cancelPrefetchForVideo %s, %b", A1a);
        C146547Ar r1 = this.A04;
        if (r1 != null) {
            synchronized (r1) {
                r1.A00.remove(str2);
            }
        }
        C160737oE r6 = this.A06;
        AnonymousClass7VX r3 = new AnonymousClass7VX(r6, str2);
        AnonymousClass7UA r4 = r6.A03;
        boolean z2 = false;
        LinkedList A18 = AnonymousClass0x9.A18();
        LinkedList linkedList = r4.A05;
        synchronized (linkedList) {
            ListIterator listIterator = linkedList.listIterator();
            while (listIterator.hasNext()) {
                C152147Xs r02 = (C152147Xs) listIterator.next();
                r02.getClass();
                C153597bc r12 = r02.A00;
                if (r3.equals(r12)) {
                    if (r12 instanceof C126456Ny) {
                        ((C126456Ny) r12).A03();
                    }
                    A18.add(r12);
                    listIterator.remove();
                }
            }
        }
        int size = A18.size();
        C146567At r03 = r6.A06;
        if (r03 != null) {
            if (size > 0) {
                z2 = true;
            }
            r03.A00.A0A.AyO(new AnonymousClass6No(str2, z2));
        }
        if (z) {
            synchronized (linkedList) {
                Iterator it = r4.A04.iterator();
                while (it.hasNext()) {
                    C153597bc r5 = ((C152147Xs) it.next()).A00;
                    if (r3.equals(r5) && (r5 instanceof C126456Ny)) {
                        C126456Ny r52 = (C126456Ny) r5;
                        AnonymousClass0Xd r7 = r52.A03;
                        C166337yW r13 = r52.A01;
                        String str3 = r13.A0F;
                        C166577yv r04 = r13.A0E;
                        String str4 = r04.A0H;
                        Uri uri = r04.A05;
                        AnonymousClass8LG r8 = r7.A0D;
                        String A002 = C161157p6.A00(uri, str3, str4, r8.abrSetting.hashUrlForUnique, r8.useShortKey, r13.A0S, r8.splitLastSegmentCachekey, r8.skipThumbnailCacheKey);
                        Map map = r7.A0E;
                        synchronized (map) {
                            r0 = (C187438xD) map.get(A002);
                        }
                        if (r0 != null) {
                            r0.cancel();
                        }
                        r52.A03();
                    }
                }
            }
        }
        if (r6.A09.enableCancelFollowupPrefetch) {
            synchronized (linkedList) {
                Iterator it2 = r4.A04.iterator();
                while (it2.hasNext()) {
                    r3.equals(((C152147Xs) it2.next()).A00);
                }
            }
        }
    }

    public void A03(long j, boolean z) {
        Object[] A0L2 = AnonymousClass002.A0L();
        AnonymousClass000.A1Q(A0L2, 0, j);
        C159597m9.A02("id [%d]: release", A0L2);
        this.A0V.A03(j, z);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [boolean] */
    public boolean A06(long j, long j2) {
        Object[] A0M2 = AnonymousClass002.A0M();
        ? A1S = AnonymousClass6C9.A1S(A0M2, j);
        Object valueOf = Long.valueOf(j2);
        A0M2[1] = valueOf;
        C162987t5 A012 = C151857Wo.A01(this, "id [%d]: setRelativePosition %d", A0M2, j);
        if (A012 == null) {
            return A1S;
        }
        Object[] objArr = new Object[1];
        objArr[A1S] = valueOf;
        A012.A0K("Set relative position to %d", objArr);
        C162987t5.A01(A012.A0l, A012, valueOf, 16);
        return true;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [boolean] */
    public boolean A07(long j, long j2, long j3, boolean z) {
        Object[] A0M2 = AnonymousClass002.A0M();
        ? A1S = AnonymousClass6C9.A1S(A0M2, j);
        Object valueOf = Long.valueOf(j2);
        A0M2[1] = valueOf;
        C162987t5 A012 = C151857Wo.A01(this, "id [%d]: seekTo %d", A0M2, j);
        if (A012 == null) {
            return A1S;
        }
        Object[] objArr = new Object[1];
        objArr[A1S] = valueOf;
        A012.A0K("Seek to %d", objArr);
        Handler handler = A012.A0l;
        long[] jArr = new long[3];
        jArr[A1S] = j2;
        jArr[1] = j3;
        jArr[2] = C18290x4.A09(z ? 1 : 0);
        C162987t5.A01(handler, A012, jArr, 4);
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [int, boolean] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A09(android.view.Surface r5, long r6) {
        /*
            r4 = this;
            java.lang.Object[] r2 = X.AnonymousClass002.A0M()
            boolean r1 = X.AnonymousClass6C9.A1S(r2, r6)
            r3 = 1
            r2[r3] = r5
            java.lang.String r0 = "id [%d]: setSurface: %s"
            X.7t5 r2 = X.C151857Wo.A01(r4, r0, r2, r6)
            if (r2 != 0) goto L_0x0014
            return r1
        L_0x0014:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = "Set surface"
            r2.A0K(r0, r1)
            android.os.Handler r1 = r2.A0l
            r0 = 6
            X.C162987t5.A01(r1, r2, r5, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159117l9.A09(android.view.Surface, long):boolean");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [int, boolean] */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007c, code lost:
        r1 = (X.C126456Ny) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0A(java.lang.String r17, long r18, boolean r20) {
        /*
            r16 = this;
            java.lang.Object[] r6 = X.AnonymousClass002.A0M()
            r0 = r18
            boolean r5 = X.AnonymousClass6C9.A1S(r6, r0)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r20)
            r3 = 1
            r6[r3] = r7
            java.lang.String r2 = "id [%d]: pause, finishPlayback: %b"
            r4 = r16
            X.7t5 r6 = X.C151857Wo.A01(r4, r2, r6, r0)
            if (r6 != 0) goto L_0x001c
            return r5
        L_0x001c:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r5] = r7
            java.lang.String r0 = "Pause: finishPlayback=%b"
            r6.A0K(r0, r1)
            android.os.Handler r2 = r6.A0l
            java.lang.Object[] r1 = X.C18310x6.A1b(r7, r5)
            r1[r3] = r17
            r0 = 3
            X.C162987t5.A01(r2, r6, r1, r0)
            X.8LG r1 = r4.A0B
            boolean r0 = r1.enableDemoteOngoingPrefetchPriorityPause
            if (r0 != 0) goto L_0x003b
            boolean r0 = r1.enableCancelOngoingPrefetchPause
            if (r0 == 0) goto L_0x00bb
        L_0x003b:
            X.7a6 r0 = r6.A10
            if (r0 == 0) goto L_0x00bb
            X.7yv r0 = r0.A0F
            java.lang.String r2 = r0.A0H
            if (r2 == 0) goto L_0x00bb
            boolean r0 = r1.enableDemoteOngoingPrefetchPriorityPause
            if (r0 == 0) goto L_0x00b4
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r5] = r2
            java.lang.String r0 = "demoteOngoingPrefetchPriorityForVideo %s"
            X.C159597m9.A02(r0, r1)
            X.7oE r1 = r4.A06
            X.7UA r0 = r1.A03
            X.7VX r4 = new X.7VX
            r4.<init>(r1, r2)
            java.util.LinkedList r2 = r0.A05
            monitor-enter(r2)
            java.util.HashSet r0 = r0.A04     // Catch:{ all -> 0x00b1 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x00b1 }
        L_0x0064:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x00af
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x00b1 }
            X.7Xs r0 = (X.C152147Xs) r0     // Catch:{ all -> 0x00b1 }
            X.7bc r1 = r0.A00     // Catch:{ all -> 0x00b1 }
            boolean r0 = r4.equals(r1)     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x0064
            boolean r0 = r1 instanceof X.C126456Ny     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x0064
            X.6Ny r1 = (X.C126456Ny) r1     // Catch:{ all -> 0x00b1 }
            X.7yW r6 = r1.A01     // Catch:{ all -> 0x00b1 }
            if (r6 == 0) goto L_0x0064
            X.0Xd r5 = r1.A03     // Catch:{ all -> 0x00b1 }
            X.7yv r0 = r6.A0E     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x0064
            java.lang.String r10 = r0.A0H     // Catch:{ all -> 0x00b1 }
            if (r10 == 0) goto L_0x0064
            android.net.Uri r8 = r0.A05     // Catch:{ all -> 0x00b1 }
            if (r8 == 0) goto L_0x0064
            java.lang.String r9 = r6.A0F     // Catch:{ all -> 0x00b1 }
            X.8LG r1 = r5.A0D     // Catch:{ all -> 0x00b1 }
            X.8L1 r0 = r1.abrSetting     // Catch:{ all -> 0x00b1 }
            boolean r11 = r0.hashUrlForUnique     // Catch:{ all -> 0x00b1 }
            boolean r12 = r1.useShortKey     // Catch:{ all -> 0x00b1 }
            boolean r13 = r6.A0S     // Catch:{ all -> 0x00b1 }
            boolean r14 = r1.splitLastSegmentCachekey     // Catch:{ all -> 0x00b1 }
            boolean r15 = r1.skipThumbnailCacheKey     // Catch:{ all -> 0x00b1 }
            java.lang.String r0 = X.C161157p6.A00(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x00b1 }
            java.util.Map r1 = r5.A0E     // Catch:{ all -> 0x00b1 }
            monitor-enter(r1)     // Catch:{ all -> 0x00b1 }
            r1.get(r0)     // Catch:{ all -> 0x00ac }
            monitor-exit(r1)     // Catch:{ all -> 0x00ac }
            goto L_0x0064
        L_0x00ac:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00ac }
            throw r0     // Catch:{ all -> 0x00b1 }
        L_0x00af:
            monitor-exit(r2)     // Catch:{ all -> 0x00b1 }
            return r3
        L_0x00b1:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00b1 }
            throw r0
        L_0x00b4:
            boolean r0 = r1.enableCancelOngoingPrefetchPause
            if (r0 == 0) goto L_0x00bb
            r4.A05(r2, r3)
        L_0x00bb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159117l9.A0A(java.lang.String, long, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r0.enableMediaCodecReuseOptimizeLock == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void finalize() {
        /*
            r7 = this;
            java.lang.Object[] r1 = X.AnonymousClass4L0.A0U()
            java.lang.String r0 = "HeroService destroy"
            X.C159597m9.A02(r0, r1)
            X.7Wo r2 = r7.A0V
            X.7hG r3 = r7.A0E
            X.7Py r4 = r7.A0D
            X.8LG r0 = r7.A0B
            if (r0 == 0) goto L_0x0018
            boolean r0 = r0.enableMediaCodecReuseOptimizeLock
            r6 = 1
            if (r0 != 0) goto L_0x0019
        L_0x0018:
            r6 = 0
        L_0x0019:
            android.os.Handler r0 = r7.A01()
            r5 = 0
            X.3cR r1 = new X.3cR
            r1.<init>(r2, r3, r4, r5, r6)
            r0.post(r1)
            super.finalize()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159117l9.finalize():void");
    }
}
