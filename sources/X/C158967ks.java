package X;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import android.util.LruCache;
import android.view.Surface;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.7ks  reason: invalid class name and case insensitive filesystem */
public class C158967ks {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public Surface A04;
    public C152777a6 A05;
    public C159117l9 A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public volatile Surface A0A;
    public final /* synthetic */ C162997t6 A0B;

    public static void A00(C158967ks r1, C162997t6 r2, String str) {
        r2.A0J(str, new Object[0]);
        r1.A05();
    }

    public final void A07() {
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = null;
        C162997t6 r3 = this.A0B;
        r3.A0L = 1.0f;
        this.A02 = 0;
        this.A03 = 0;
        r3.A0Q = 0;
        r3.A0T = false;
        r3.A0A = false;
        r3.A08.set(new C166537yr());
        r3.A0J.set(C166427yf.A0D);
        List list = r3.A0H;
        synchronized (list) {
            list.clear();
            r3.A00 = -1;
        }
        this.A09 = false;
    }

    public C158967ks(C162997t6 r1) {
        this.A0B = r1;
    }

    public static /* synthetic */ void A01(C158967ks r6, C166537yr r7) {
        boolean z;
        C162997t6 r62 = r6.A0B;
        AtomicReference atomicReference = r62.A08;
        synchronized (atomicReference) {
            if (((C166537yr) atomicReference.get()).A0H <= r7.A0H) {
                atomicReference.set(r7);
                if (r7.A0D < r62.A0Q) {
                    z = true;
                } else if (r7.A0R) {
                    z = false;
                }
                r62.A0U = z;
            }
        }
    }

    public final C159117l9 A02() {
        C159117l9 r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw new RemoteException("No service api available");
    }

    public final void A04() {
        String str;
        HandlerThread handlerThread;
        C162987t5 A022;
        C162997t6 r5 = this.A0B;
        C147727Fk r1 = r5.A03;
        C159117l9 r7 = r1.A00;
        if (r7 == null) {
            r7 = r1.A01.A00;
            r1.A00 = r7;
        }
        this.A06 = r7;
        if (this.A05 != null) {
            try {
                long j = r5.A0O;
                C152777a6 r10 = this.A05;
                C186528vV r13 = r5.A04;
                boolean z = this.A09;
                C151857Wo r8 = r7.A0V;
                Context context = r7.A07;
                Handler A012 = r7.A01();
                AtomicReference atomicReference = r7.A0N;
                AnonymousClass0Xd r21 = r7.A03;
                Map map = r7.A0G;
                AtomicBoolean atomicBoolean = r7.A0J;
                synchronized (r8) {
                    if (r10 == null) {
                        str = null;
                    } else {
                        str = r10.A0F.A0H;
                    }
                    Object[] A0M = AnonymousClass002.A0M();
                    AnonymousClass000.A1Q(A0M, 0, j);
                    A0M[1] = str;
                    C159597m9.A02("id [%d]: verifyOrCreatePlayer, videoId: %s", A0M);
                    C162987t5 A023 = r8.A02(j);
                    if (j > 0) {
                        if (A023 == null || (A022 = r8.A02(j)) == null || A022.A12 == null) {
                            r8.A03(j, true);
                        } else {
                            A023.A0K("leaveWarmUpIfNeed", new Object[0]);
                            if (A023.A0u.get()) {
                                C162987t5.A01(A023.A0l, A023, r13, 19);
                            }
                            if (r8.A03.enableBackgroundServicePlayerReuse && z) {
                                AnonymousClass85L r72 = A023.A0o;
                                r72.BbN(r72.A00.A0k);
                                r72.A01 = r13;
                            }
                        }
                    }
                    AnonymousClass8LG r73 = r8.A03;
                    long addAndGet = r8.A04.addAndGet(1);
                    Long valueOf = Long.valueOf(addAndGet);
                    C159597m9.A02("id [%d]: Create player", valueOf);
                    LruCache lruCache = r8.A00;
                    Iterator A0q = AnonymousClass000.A0q(lruCache.snapshot());
                    while (A0q.hasNext()) {
                        Map.Entry A0w = AnonymousClass001.A0w(A0q);
                        if (((C162987t5) A0w.getValue()).A18) {
                            lruCache.get(A0w.getKey());
                        }
                    }
                    C159597m9.A02("id [%d]: refreshed LRUCached for playing players", valueOf);
                    if (!r73.useMainThreadForHeroPlayer) {
                        C159597m9.A02("id [%d]: creating handlerThread", valueOf);
                        if (r73.useHandlerThreadPool) {
                            AnonymousClass78N.A00 = r73.handlerThreadPoolSize;
                            ConcurrentLinkedQueue concurrentLinkedQueue = AnonymousClass78N.A01;
                            if (concurrentLinkedQueue.size() < AnonymousClass78N.A00) {
                                StringBuilder A0o = AnonymousClass001.A0o();
                                C18260x0.A19("HeroHandlerThreadPool-", A0o, concurrentLinkedQueue);
                                handlerThread = new HandlerThread(A0o.toString());
                                handlerThread.start();
                                handlerThread.getLooper();
                            } else {
                                handlerThread = (HandlerThread) concurrentLinkedQueue.remove();
                            }
                            concurrentLinkedQueue.add(handlerThread);
                            StringBuilder A0o2 = AnonymousClass001.A0o();
                            A0o2.append("using handler thread ");
                            A0o2.append(handlerThread.getName());
                            A0o2.append(", ti ");
                            A0o2.append(handlerThread.getId());
                            C161157p6.A01("HeroHandlerThreadPool", AnonymousClass000.A0P(concurrentLinkedQueue, ", pool ", A0o2), new Object[0]);
                        } else {
                            handlerThread = new HandlerThread("HeroServicePlayer");
                            handlerThread.start();
                        }
                        C159597m9.A02("id [%d]: created handlerThread", valueOf);
                    } else {
                        handlerThread = null;
                    }
                    C162987t5 r17 = new C162987t5(context, A012, handlerThread, r21, r10, r13, r8.A02, r8, map, atomicBoolean, atomicReference, addAndGet);
                    C159597m9.A02("id [%d]: created HeroServicePlayer", valueOf);
                    j = r17.A0k;
                    Long valueOf2 = Long.valueOf(j);
                    lruCache.put(valueOf2, r17);
                    if (r73.enableBackgroundServicePlayerReuse) {
                        r8.A01.put(valueOf2, 1);
                    }
                }
                if (j != r5.A0O) {
                    this.A04 = null;
                }
                r5.A0O = j;
                long[] jArr = r5.A0K;
                jArr[1] = jArr[0];
                jArr[0] = r5.A0O;
                this.A09 = false;
            } catch (IllegalStateException | NullPointerException e) {
                String str2 = "Error occurs while creating player";
                try {
                    if (r5.A05.enableLogExceptionMessageOnError) {
                        StringBuilder A0o3 = AnonymousClass001.A0o();
                        C18270x1.A1H(A0o3, "Error occurs while creating player with exception ", e);
                        str2 = A0o3.toString();
                    }
                    C162997t6 r74 = r5;
                    r74.A0F(C142876xw.A06, C142846xt.A0C, str2, this.A05.A08, e);
                    r5.A0O = 0;
                    throw new RemoteException(AnonymousClass000.A0a("Failed ensure service player, ", AnonymousClass001.A0o(), e));
                } catch (Throwable th) {
                    this.A09 = false;
                    throw th;
                }
            }
        }
    }

    public final void A05() {
        C162997t6 r5 = this.A0B;
        r5.A0Q = 0;
        long[] jArr = r5.A0K;
        jArr[1] = 0;
        jArr[0] = 0;
        if (AnonymousClass000.A1S((r5.A0O > 0 ? 1 : (r5.A0O == 0 ? 0 : -1)))) {
            r5.A0O = 0;
            this.A04 = null;
        }
    }

    public final void A06() {
        C162997t6 r4 = this.A0B;
        synchronized (r4.A0G) {
        }
        try {
            if (!AnonymousClass000.A1S((r4.A0O > 0 ? 1 : (r4.A0O == 0 ? 0 : -1)))) {
                AnonymousClass6C8.A0z(r4, "Before reset(), service player was evicted. Lazy recover at next play()");
            } else {
                C159117l9 A022 = A02();
                long j = r4.A0O;
                Object[] A0L = AnonymousClass002.A0L();
                AnonymousClass000.A1Q(A0L, 0, j);
                C162987t5 A012 = C151857Wo.A01(A022, "id [%d]: reset", A0L, j);
                if (A012 == null) {
                    A00(this, r4, "When reset(), service player is noticed to be evicted earlier. Lazy recover at next play()");
                } else {
                    A012.A0K("Reset", new Object[0]);
                    A012.A0G(A012.A0l.obtainMessage(11));
                }
            }
        } catch (RemoteException e) {
            r4.A0I("Error occurs while pausing the video", e, new Object[0]);
        } catch (Throwable th) {
            A07();
            throw th;
        }
        A07();
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [int, boolean] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03() {
        /*
            r13 = this;
            r13.A04()
            android.view.Surface r0 = r13.A0A
            if (r0 == 0) goto L_0x001f
            android.view.Surface r1 = r13.A0A
            android.view.Surface r0 = r13.A04
            if (r1 == r0) goto L_0x001f
            X.7l9 r3 = r13.A06
            X.7t6 r0 = r13.A0B
            long r1 = r0.A0O
            android.view.Surface r0 = r13.A0A
            boolean r0 = r3.A09(r0, r1)
            if (r0 == 0) goto L_0x001f
            android.view.Surface r0 = r13.A0A
            r13.A04 = r0
        L_0x001f:
            X.7a6 r5 = r13.A05
            if (r5 == 0) goto L_0x00db
            long r3 = r13.A02
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0122
            boolean r2 = r5.A00()
            if (r2 == 0) goto L_0x00fb
            X.7l9 r6 = r13.A06
            X.7t6 r2 = r13.A0B
            long r4 = r2.A0O
            long r2 = r13.A03
            r6.A06(r4, r2)
        L_0x003c:
            r13.A02 = r0
            r13.A03 = r0
        L_0x0040:
            X.7l9 r3 = r13.A06
            X.7t6 r2 = r13.A0B
            long r0 = r2.A0O
            X.7a6 r11 = r13.A05
            boolean r9 = r13.A08
            float r12 = r2.A0M
            boolean r10 = r2.A0T
            java.lang.Object[] r5 = X.AnonymousClass0x9.A1X()
            boolean r4 = X.AnonymousClass6C9.A1S(r5, r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r9)
            r7 = 1
            r5[r7] = r2
            X.7yv r6 = r11.A0F
            r2 = 2
            r5[r2] = r6
            java.lang.String r2 = "id [%d]: prepareAndMayPlay, shouldPlay=%b, videoSource=%s"
            X.7t5 r5 = X.C151857Wo.A01(r3, r2, r5, r0)
            if (r5 == 0) goto L_0x00db
            if (r9 == 0) goto L_0x00f8
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.A0K
            boolean r2 = r0.compareAndSet(r7, r4)
        L_0x0072:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = "Set volume"
            r5.A0K(r0, r1)
            android.os.Handler r8 = r5.A0l
            r1 = 5
            java.lang.Float r0 = java.lang.Float.valueOf(r12)
            X.C162987t5.A01(r8, r5, r0, r1)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r1[r4] = r6
            java.lang.String r0 = "Prepare: %s"
            r5.A0K(r0, r1)
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.A0r
            r0.set(r7)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r4] = r11
            X.C162987t5.A01(r8, r5, r0, r7)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = "Set Looping"
            r5.A0K(r0, r1)
            r1 = 18
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            X.C162987t5.A01(r8, r5, r0, r1)
            if (r9 == 0) goto L_0x00df
            r0 = -1
            r5.A0F(r0, r2)
        L_0x00af:
            java.lang.String r2 = r6.A0H
            if (r2 == 0) goto L_0x00db
            X.8LG r1 = r3.A0B
            boolean r0 = r1.enableCancelPrefetchInQueuePrepare
            if (r0 == 0) goto L_0x00bc
            r3.A05(r2, r4)
        L_0x00bc:
            boolean r0 = r1.enableBoostOngoingPrefetchPriorityPrepare
            if (r0 == 0) goto L_0x00c3
            r3.A04(r2)
        L_0x00c3:
            boolean r0 = r1.enableMemoryAwareBufferSizeUsingRed
            if (r0 != 0) goto L_0x00cb
            boolean r0 = r1.enableMemoryAwareBufferSizeUsingYellow
            if (r0 == 0) goto L_0x00db
        L_0x00cb:
            X.7Pl r0 = r3.A0U
            if (r0 == 0) goto L_0x00db
            X.7Pl r1 = r3.A0U
            java.util.concurrent.atomic.AtomicReference r0 = r3.A0P
            r1.A00 = r0
            X.7Pl r1 = r3.A0U
            java.util.concurrent.atomic.AtomicReference r0 = r3.A0R
            r1.A01 = r0
        L_0x00db:
            r0 = 0
            r13.A07 = r0
            return
        L_0x00df:
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            r2[r4] = r1
            java.lang.String r0 = "Pause: finishPlayback=%b"
            r5.A0K(r0, r2)
            java.lang.Object[] r1 = X.C18310x6.A1b(r1, r4)
            r0 = 0
            r1[r7] = r0
            r0 = 3
            X.C162987t5.A01(r8, r5, r1, r0)
            goto L_0x00af
        L_0x00f8:
            r2 = 0
            goto L_0x0072
        L_0x00fb:
            java.util.concurrent.atomic.AtomicLong r2 = X.C162997t6.A0Z
            long r10 = r2.incrementAndGet()
            X.7l9 r5 = r13.A06
            X.7t6 r4 = r13.A0B
            long r6 = r4.A0O
            long r8 = r13.A02
            r12 = 0
            boolean r2 = r5.A07(r6, r8, r10, r12)
            if (r2 == 0) goto L_0x011e
            long r2 = r13.A02
            r4.A0P = r2
            r4.A0Q = r10
            long r2 = android.os.SystemClock.elapsedRealtime()
            r4.A0R = r2
            goto L_0x003c
        L_0x011e:
            r4.A0Q = r0
            goto L_0x003c
        L_0x0122:
            int r2 = r13.A01
            if (r2 <= 0) goto L_0x0149
            java.util.concurrent.atomic.AtomicLong r2 = X.C162997t6.A0Z
            long r9 = r2.incrementAndGet()
            X.7l9 r4 = r13.A06
            X.7t6 r2 = r13.A0B
            long r5 = r2.A0O
            int r3 = r13.A01
            long r7 = (long) r3
            r11 = 0
            boolean r3 = r4.A07(r5, r7, r9, r11)
            if (r3 == 0) goto L_0x015b
            int r0 = r13.A01
            long r0 = (long) r0
            r2.A0P = r0
            r2.A0Q = r9
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.A0R = r0
        L_0x0149:
            int r0 = r13.A00
            if (r0 <= 0) goto L_0x0040
            X.7l9 r4 = r13.A06
            X.7t6 r0 = r13.A0B
            long r2 = r0.A0O
            int r0 = r13.A00
            long r0 = (long) r0
            r4.A06(r2, r0)
            goto L_0x0040
        L_0x015b:
            r2.A0Q = r0
            goto L_0x0149
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C158967ks.A03():void");
    }
}
