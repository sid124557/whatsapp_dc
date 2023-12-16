package X;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.7t6  reason: invalid class name and case insensitive filesystem */
public class C162997t6 implements Handler.Callback {
    public static final String A0W = C162997t6.class.getSimpleName();
    public static final Set A0X = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    public static final AtomicInteger A0Y = new AtomicInteger();
    public static final AtomicLong A0Z = new AtomicLong(0);
    public long A00;
    public long A01;
    public C150847Sl A02;
    public C147727Fk A03;
    public C186528vV A04;
    public AnonymousClass8LG A05;
    public String A06;
    public List A07;
    public AtomicReference A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Handler A0C;
    public final C158967ks A0D;
    public final AnonymousClass85C A0E;
    public final Object A0F;
    public final Object A0G;
    public final List A0H;
    public final TreeMap A0I;
    public final AtomicReference A0J;
    public final long[] A0K;
    public volatile float A0L;
    public volatile float A0M;
    public volatile int A0N;
    public volatile long A0O;
    public volatile long A0P;
    public volatile long A0Q;
    public volatile long A0R;
    public volatile String A0S;
    public volatile boolean A0T;
    public volatile boolean A0U;
    public volatile boolean A0V;

    public void A06() {
        AnonymousClass6C8.A0z(this, "pause");
        AnonymousClass6C7.A10(this.A0C, (Object) null, 3);
        synchronized (this.A0G) {
        }
        this.A0A = false;
    }

    public void A07() {
        C152777a6 r0;
        A0J("play", new Object[0]);
        this.A0A = true;
        AnonymousClass8LG r1 = this.A05;
        if (r1.blockDRMPlaybackOnHDMI && r1.fixDRMPlaybackOnHDMI) {
            C158967ks r02 = this.A0D;
            if (r02 == null || (r0 = r02.A05) == null) {
                C161157p6.A01(A0W, "Couldn't find isProtectedContent status. Considering it as non-protected.", new Object[0]);
            } else {
                String str = r0.A0F.A0A;
                if (str != null && str.contains("ContentProtection")) {
                    AtomicReference atomicReference = C155847fc.A01;
                    if (atomicReference.get() == null) {
                        AnonymousClass0IR.A00((Object) null, new C155847fc(), atomicReference);
                    }
                    if (((C155847fc) atomicReference.get()).A00.get()) {
                        C161157p6.A01(A0W, "Pausing DRM playback because HDMI is connected.", new Object[0]);
                        A06();
                        return;
                    }
                }
            }
        }
        AnonymousClass6C7.A10(this.A0C, -1L, 2);
    }

    public void A0H(C152777a6 r13) {
        Boolean bool;
        String str;
        Uri uri;
        C166577yv r3 = r13.A0F;
        A0J("setVideoPlaybackParams: %s", r3);
        if (r3.A07 != C141696vz.DASH_LIVE || ((uri = r3.A05) != null && !TextUtils.isEmpty(uri.toString()))) {
            if (r3.A07 == C141696vz.PROGRESSIVE) {
                Uri uri2 = r3.A05;
                if (uri2 == null) {
                    bool = Boolean.FALSE;
                    str = "Progressive with null url";
                } else if (uri2.getPath() == null) {
                    bool = Boolean.FALSE;
                    str = "Progressive with null url path";
                } else if (r3.A05.getPath().endsWith(".mpd")) {
                    bool = Boolean.FALSE;
                    str = "Progressive with MPD";
                }
            }
            if (r3.A05 != null || !TextUtils.isEmpty(r3.A0A)) {
                bool = Boolean.TRUE;
                str = "";
            } else {
                bool = Boolean.FALSE;
                str = "VOD with null url and empty manifest";
            }
        } else {
            bool = Boolean.FALSE;
            str = "DashLive with null or empty url";
        }
        Pair A0C2 = AnonymousClass0x9.A0C(bool, str);
        if (!AnonymousClass001.A1Z(A0C2.first)) {
            IllegalArgumentException A0c = AnonymousClass001.A0c("Invalid video source");
            C142846xt r8 = C142846xt.A0B;
            C142876xw r7 = C142876xw.A0A;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Invalid video source: ");
            A0F(r7, r8, AnonymousClass000.A0X((String) A0C2.second, A0o), r13.A08, A0c);
            return;
        }
        A0J("dash manifest: %s", r3.A0A);
        AnonymousClass6C7.A10(this.A0C, r13, 1);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C162997t6(X.C186538vW r4, X.C159117l9 r5, X.AnonymousClass8LG r6) {
        /*
            r3 = this;
            boolean r0 = r6.useMainThreadForHeroPlayer
            if (r0 == 0) goto L_0x000c
            android.os.Looper r0 = android.os.Looper.getMainLooper()
        L_0x0008:
            r3.<init>(r0, r4, r5, r6)
            return
        L_0x000c:
            java.lang.String r2 = "HeroPlayerInternalThread"
            r1 = -2
            android.os.HandlerThread r0 = new android.os.HandlerThread
            r0.<init>(r2, r1)
            android.os.Looper r0 = X.AnonymousClass6C9.A0S(r0)
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162997t6.<init>(X.8vW, X.7l9, X.8LG):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0077, code lost:
        if (r0.isValid() == false) goto L_0x0079;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A00(X.C162997t6 r21, X.C166537yr r22, boolean r23) {
        /*
            r7 = r21
            X.7ks r8 = r7.A0D
            r6 = r22
            X.C158967ks.A01(r8, r6)
            long r3 = r6.A0F
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0066
            long r1 = r6.A0G
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0066
            long r11 = r6.A00()
            long r4 = r6.A0F
            long r2 = r6.A0G
            boolean r0 = r6.A0R
            r16 = r0 ^ 1
            boolean r10 = r6.A0O
            java.lang.String r1 = "onBufferingStopped, %dms"
            java.lang.Object[] r0 = X.AnonymousClass002.A0L()
            long r13 = r2 - r4
            X.C18280x3.A1S(r0, r13)
            r7.A0J(r1, r0)
            X.8LG r0 = r7.A05
            int r0 = r0.reportStallThresholdMs
            long r0 = (long) r0
            long r0 = r0 + r4
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 <= 0) goto L_0x005f
            java.util.List r9 = r7.A0H
            monitor-enter(r9)
            X.7JM r0 = new X.7JM     // Catch:{ all -> 0x005c }
            r20 = r2
            r22 = r10
            r18 = r4
            r17 = r0
            r17.<init>(r18, r20, r22)     // Catch:{ all -> 0x005c }
            r9.add(r0)     // Catch:{ all -> 0x005c }
            long r0 = r7.A00     // Catch:{ all -> 0x005c }
            r3 = -1
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x005a
            r7.A00 = r11     // Catch:{ all -> 0x005c }
        L_0x005a:
            monitor-exit(r9)     // Catch:{ all -> 0x005c }
            goto L_0x005f
        L_0x005c:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x005c }
            throw r0
        L_0x005f:
            X.85C r10 = r7.A0E
            r15 = r23
            r10.Bco(r11, r13, r15, r16)
        L_0x0066:
            boolean r0 = r7.A0B
            boolean r3 = r6.A0U
            if (r0 == r3) goto L_0x0088
            r7.A0B = r3
            android.view.Surface r0 = r8.A0A
            if (r0 == 0) goto L_0x0079
            boolean r0 = r0.isValid()
            r2 = 1
            if (r0 != 0) goto L_0x007a
        L_0x0079:
            r2 = 0
        L_0x007a:
            java.lang.Object[] r1 = X.AnonymousClass4L0.A0U()
            java.lang.String r0 = "onVisualPlayStateChanged"
            r7.A0J(r0, r1)
            X.85C r0 = r7.A0E
            r0.Bfb(r3, r2)
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162997t6.A00(X.7t6, X.7yr, boolean):void");
    }

    public int A01() {
        C162987t5 A002;
        C153737br r0;
        C158967ks r7 = this.A0D;
        try {
            C162997t6 r6 = r7.A0B;
            if (AnonymousClass000.A1S((r6.A0O > 0 ? 1 : (r6.A0O == 0 ? 0 : -1))) && (A002 = C151857Wo.A00(r7, r6)) != null) {
                C161787qS r02 = A002.A12;
                if (r02 == null || (r0 = r02.A01) == null) {
                    return 1;
                }
                return r0.A08.A00;
            }
        } catch (RemoteException e) {
            r7.A0B.A0I("Error occurs while getPlaybackState", e, new Object[0]);
        }
        return 0;
    }

    public long A02() {
        C152777a6 r0;
        if (!AnonymousClass000.A1S((this.A0O > 0 ? 1 : (this.A0O == 0 ? 0 : -1)))) {
            return 0;
        }
        C158967ks r5 = this.A0D;
        if (r5.A05 == null || !this.A0U || SystemClock.elapsedRealtime() - this.A0R > ((long) this.A05.returnRequestedSeekTimeTimeoutMs) || ((r0 = r5.A05) != null && r0.A00())) {
            return AnonymousClass6C8.A0W(this).A00() + A04();
        }
        return this.A0P;
    }

    public final long A04() {
        if (!AnonymousClass000.A1S((this.A0O > 0 ? 1 : (this.A0O == 0 ? 0 : -1)))) {
            return 0;
        }
        C166537yr A0W2 = AnonymousClass6C8.A0W(this);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!A0W2.A0R || A0W2.A0P) {
            return 0;
        }
        return (long) (A0W2.A00 * ((float) (elapsedRealtime - A0W2.A0H)));
    }

    public C147697Fh A05() {
        long j;
        int i;
        List<AnonymousClass7JM> list = this.A0H;
        synchronized (list) {
            j = 0;
            i = 0;
            for (AnonymousClass7JM r2 : list) {
                long j2 = r2.A00;
                long j3 = r2.A01;
                if (j2 <= j3 || j3 <= 0 || j2 <= 0) {
                    IllegalStateException A0e = AnonymousClass001.A0e("Start stall time is greater or equal to end stall time");
                    Object[] A0M2 = AnonymousClass002.A0M();
                    C18280x3.A1S(A0M2, j3);
                    AnonymousClass001.A1Q(A0M2, j2);
                    A0I("stallStartMs = %d, stallEndMs = %d", A0e, A0M2);
                } else {
                    j += j2 - j3;
                    i++;
                    C152777a6 r22 = this.A0D.A05;
                    if (r22 != null && r22.A00()) {
                        C161157p6.A03(this.A0I, this.A05.staleManifestThreshold, j3, j2);
                    }
                }
            }
            list.clear();
            this.A0I.clear();
            this.A00 = -1;
        }
        return new C147697Fh(i, j);
    }

    public void A09() {
        C162987t5 A002;
        C158967ks r6 = this.A0D;
        try {
            C162997t6 r5 = r6.A0B;
            if (AnonymousClass000.A1S((r5.A0O > 0 ? 1 : (r5.A0O == 0 ? 0 : -1))) && (A002 = C151857Wo.A00(r6, r5)) != null) {
                A002.A0G(A002.A0l.obtainMessage(48));
            }
        } catch (RemoteException e) {
            r6.A0B.A0I("Error occurs while seek to default position", e, AnonymousClass4L0.A0U());
        }
    }

    public void A0B(float f) {
        Float valueOf = Float.valueOf(f);
        A0J("setVolume %f, trigger: %s", valueOf, "unknown");
        AnonymousClass6C7.A10(this.A0C, AnonymousClass4L0.A0V(valueOf, "unknown", 2), 5);
    }

    public void A0C(int i, long j) {
        this.A0P = j;
        this.A0Q = A0Z.incrementAndGet();
        this.A0R = SystemClock.elapsedRealtime();
        Handler handler = this.A0C;
        Object[] A0M2 = AnonymousClass002.A0M();
        C18270x1.A1Q(A0M2, i);
        AnonymousClass000.A1Q(A0M2, 1, j);
        AnonymousClass6C7.A10(handler, A0M2, 46);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [boolean] */
    public void A0E(AnonymousClass7RE r8) {
        int i = r8.A00;
        Object[] objArr = new Object[2];
        ? A1Y = C18300x5.A1Y(objArr, i);
        objArr[1] = Boolean.valueOf(A1Y);
        A0J("seekTo: seekTimeMsWithPreview: %d, jumpSeek: %s", objArr);
        this.A0P = (long) i;
        this.A0Q = A0Z.incrementAndGet();
        this.A0R = SystemClock.elapsedRealtime();
        Handler handler = this.A0C;
        long[] jArr = new long[3];
        jArr[A1Y] = this.A0P;
        jArr[1] = this.A0Q;
        jArr[2] = 0;
        AnonymousClass6C7.A10(handler, jArr, 4);
    }

    public final void A0G(C166537yr r6) {
        if (!this.A05.enableClearStallOnBroadcastEnd) {
            return;
        }
        if (r6.A0F > 0 || r6.A0P) {
            r6.A0P = false;
            r6.A0F = -1;
            r6.A0G = -1;
        }
    }

    public final void A0I(String str, Throwable th, Object... objArr) {
        if (this.A09) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(hashCode());
            A0o.append(", playerId[");
            A0o.append(this.A0O);
            A0o.append("]: ");
            A0o.append(str);
            AnonymousClass6C9.A15(AnonymousClass000.A0a(", message = ", A0o, th), A0W, th, objArr);
        }
    }

    public final void A0J(String str, Object... objArr) {
        if (this.A09) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(hashCode());
            A0o.append(", playerId[");
            A0o.append(this.A0O);
            AnonymousClass6C8.A1B(AnonymousClass000.A0V("]: ", str, A0o), A0W, objArr);
        }
    }

    public boolean A0L() {
        if (this.A0A) {
            return true;
        }
        if (AnonymousClass000.A1S((this.A0O > 0 ? 1 : (this.A0O == 0 ? 0 : -1))) && AnonymousClass6C8.A0W(this).A0R) {
            return true;
        }
        if (!AnonymousClass000.A1S((this.A0O > 0 ? 1 : (this.A0O == 0 ? 0 : -1))) || !AnonymousClass6C8.A0W(this).A0P) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02a8, code lost:
        if (r6 != null) goto L_0x02aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x0ac6, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x0ac7, code lost:
        r6.A0B.A0I("Error occurs while stop player", r4, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:609:0x0cac, code lost:
        if (r11 != null) goto L_0x0cae;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r24) {
        /*
            r23 = this;
            r1 = r24
            int r3 = r1.what
            r2 = 2
            r0 = 1
            r8 = 0
            r7 = r23
            switch(r3) {
                case 1: goto L_0x000d;
                case 2: goto L_0x0086;
                case 3: goto L_0x0102;
                case 4: goto L_0x0144;
                case 5: goto L_0x019c;
                case 6: goto L_0x020a;
                case 7: goto L_0x0261;
                case 8: goto L_0x02bc;
                case 9: goto L_0x033b;
                case 10: goto L_0x0370;
                case 11: goto L_0x03fa;
                case 12: goto L_0x0404;
                case 13: goto L_0x040f;
                case 14: goto L_0x044b;
                case 15: goto L_0x0456;
                case 16: goto L_0x0490;
                case 17: goto L_0x04ca;
                case 18: goto L_0x057b;
                case 19: goto L_0x05b1;
                case 20: goto L_0x000c;
                case 21: goto L_0x0602;
                case 22: goto L_0x066e;
                case 23: goto L_0x06cd;
                case 24: goto L_0x0738;
                case 25: goto L_0x0769;
                case 26: goto L_0x07c2;
                case 27: goto L_0x082a;
                case 28: goto L_0x0837;
                case 29: goto L_0x087a;
                case 30: goto L_0x08c5;
                case 31: goto L_0x090c;
                case 32: goto L_0x0953;
                case 33: goto L_0x095a;
                case 34: goto L_0x099c;
                case 35: goto L_0x09f1;
                case 36: goto L_0x0a3c;
                case 37: goto L_0x0a87;
                case 38: goto L_0x0c72;
                case 39: goto L_0x0ad6;
                case 40: goto L_0x0b21;
                case 41: goto L_0x000c;
                case 42: goto L_0x000c;
                case 43: goto L_0x000c;
                case 44: goto L_0x0b61;
                case 45: goto L_0x0b87;
                case 46: goto L_0x0bad;
                case 47: goto L_0x0beb;
                case 48: goto L_0x0c15;
                case 49: goto L_0x0c22;
                case 50: goto L_0x0c4a;
                default: goto L_0x000c;
            }
        L_0x000c:
            return r8
        L_0x000d:
            X.7ks r3 = r7.A0D
            java.lang.Object r9 = r1.obj
            X.7a6 r9 = (X.C152777a6) r9
            X.7t6 r4 = r3.A0B
            java.lang.Object[] r2 = new java.lang.Object[r2]
            X.7yv r6 = r9.A0F
            X.6vz r1 = r6.A07
            X.AnonymousClass0x7.A1E(r1, r2, r8)
            android.net.Uri r1 = r6.A05
            r2[r0] = r1
            java.lang.String r1 = "prepareInternal, playRequest: %s, url: %s"
            r4.A0J(r1, r2)
            X.7a6 r5 = r3.A05
            if (r5 == 0) goto L_0x0048
            java.lang.String r2 = "WA_BOT"
            java.lang.String r1 = r5.A07
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0048
            X.7yv r1 = r5.A0F
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x0048
            java.lang.String r1 = "prepareInternal, unchanged video source, skip preparing"
            X.AnonymousClass6C8.A0z(r4, r1)
        L_0x0042:
            X.7Sl r2 = r7.A02
            java.lang.String r1 = "prepare"
            goto L_0x0c9c
        L_0x0048:
            r3.A07()
            r3.A05 = r9
            r3.A07 = r0
            X.8LG r1 = r4.A05
            boolean r5 = r1.enableFixForOnPreparingCallback
            if (r5 == 0) goto L_0x0066
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r1 = "onPreparing"
            r4.A0J(r1, r2)
            java.util.concurrent.atomic.AtomicInteger r1 = A0Y
            r1.incrementAndGet()
            X.85C r1 = r4.A0E
            r1.BYo()
        L_0x0066:
            r3.A03()     // Catch:{ RemoteException -> 0x006a }
            goto L_0x0072
        L_0x006a:
            r3 = move-exception
            java.lang.String r2 = "Error occurs while ensureAndRecoverServicePlayer in prepare"
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r4.A0I(r2, r3, r1)
        L_0x0072:
            if (r5 != 0) goto L_0x0042
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r1 = "onPreparing"
            r4.A0J(r1, r2)
            java.util.concurrent.atomic.AtomicInteger r1 = A0Y
            r1.incrementAndGet()
            X.85C r1 = r4.A0E
            r1.BYo()
            goto L_0x0042
        L_0x0086:
            X.7ks r11 = r7.A0D
            java.lang.Object r1 = r1.obj
            long r3 = X.C18310x6.A0B(r1)
            boolean r1 = r11.A07
            if (r1 == 0) goto L_0x00a0
            r11.A03()     // Catch:{ RemoteException -> 0x0096 }
            goto L_0x00a0
        L_0x0096:
            r6 = move-exception
            X.7t6 r5 = r11.A0B
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r1 = "Error occurs while ensureAndRecoverServicePlayer in play"
            r5.A0I(r1, r6, r2)
        L_0x00a0:
            X.7t6 r5 = r11.A0B
            X.85C r1 = r5.A0E
            r1.BfP()
            r11.A08 = r0
            long r1 = r5.A0O     // Catch:{ RemoteException -> 0x00f4 }
            r9 = 0
            int r6 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1S(r6)     // Catch:{ RemoteException -> 0x00f4 }
            if (r1 != 0) goto L_0x00be
            java.lang.String r1 = "Before play(), service player was evicted. Recover now"
            X.AnonymousClass6C8.A0z(r5, r1)     // Catch:{ RemoteException -> 0x00f4 }
        L_0x00ba:
            r11.A03()     // Catch:{ RemoteException -> 0x00f4 }
            goto L_0x00fc
        L_0x00be:
            X.7l9 r6 = r11.A02()     // Catch:{ RemoteException -> 0x00f4 }
            long r1 = r5.A0O     // Catch:{ RemoteException -> 0x00f4 }
            java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x00f4 }
            X.AnonymousClass000.A1Q(r10, r8, r1)     // Catch:{ RemoteException -> 0x00f4 }
            java.lang.String r9 = "id [%d]: play"
            X.7t5 r2 = X.C151857Wo.A01(r6, r9, r10, r1)     // Catch:{ RemoteException -> 0x00f4 }
            if (r2 != 0) goto L_0x00d7
            java.lang.String r1 = "When play(), service player is noticed to be evicted earlier. Recover now"
            X.C158967ks.A00(r11, r5, r1)     // Catch:{ RemoteException -> 0x00f4 }
            goto L_0x00ba
        L_0x00d7:
            java.util.concurrent.atomic.AtomicBoolean r1 = r6.A0K     // Catch:{ RemoteException -> 0x00f4 }
            boolean r1 = r1.compareAndSet(r0, r8)     // Catch:{ RemoteException -> 0x00f4 }
            r2.A0F(r3, r1)     // Catch:{ RemoteException -> 0x00f4 }
            X.8LG r1 = r6.A0B     // Catch:{ RemoteException -> 0x00f4 }
            boolean r1 = r1.enableBoostOngoingPrefetchPriorityPlay     // Catch:{ RemoteException -> 0x00f4 }
            if (r1 == 0) goto L_0x00fc
            X.7a6 r1 = r2.A10     // Catch:{ RemoteException -> 0x00f4 }
            if (r1 == 0) goto L_0x00fc
            X.7yv r1 = r1.A0F     // Catch:{ RemoteException -> 0x00f4 }
            java.lang.String r1 = r1.A0H     // Catch:{ RemoteException -> 0x00f4 }
            if (r1 == 0) goto L_0x00fc
            r6.A04(r1)     // Catch:{ RemoteException -> 0x00f4 }
            goto L_0x00fc
        L_0x00f4:
            r3 = move-exception
            java.lang.String r2 = "Error occurs while sending play request"
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r5.A0I(r2, r3, r1)
        L_0x00fc:
            X.7Sl r2 = r7.A02
            java.lang.String r1 = "play"
            goto L_0x0c9c
        L_0x0102:
            X.7ks r5 = r7.A0D
            java.lang.Object r6 = r1.obj
            java.lang.String r6 = (java.lang.String) r6
            r5.A08 = r8
            X.7t6 r4 = r5.A0B     // Catch:{ RemoteException -> 0x0134 }
            long r2 = r4.A0O     // Catch:{ RemoteException -> 0x0134 }
            r9 = 0
            int r1 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1S(r1)     // Catch:{ RemoteException -> 0x0134 }
            if (r1 != 0) goto L_0x011e
            java.lang.String r1 = "Before pause(), service player was evicted. Lazy recover at next play()"
            X.AnonymousClass6C8.A0z(r4, r1)     // Catch:{ RemoteException -> 0x0134 }
            goto L_0x013e
        L_0x011e:
            X.7l9 r3 = r5.A02()     // Catch:{ RemoteException -> 0x0134 }
            long r1 = r4.A0O     // Catch:{ RemoteException -> 0x0134 }
            if (r6 != 0) goto L_0x0128
            java.lang.String r6 = ""
        L_0x0128:
            boolean r1 = r3.A0A(r6, r1, r8)     // Catch:{ RemoteException -> 0x0134 }
            if (r1 != 0) goto L_0x013e
            java.lang.String r1 = "When pause(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            X.C158967ks.A00(r5, r4, r1)     // Catch:{ RemoteException -> 0x0134 }
            goto L_0x013e
        L_0x0134:
            r4 = move-exception
            X.7t6 r3 = r5.A0B
            java.lang.String r2 = "Error occurs while pausing the video"
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r3.A0I(r2, r4, r1)
        L_0x013e:
            X.7Sl r2 = r7.A02
            java.lang.String r1 = "pause"
            goto L_0x0c9c
        L_0x0144:
            java.lang.Object r1 = r1.obj
            long[] r1 = (long[]) r1
            X.7ks r6 = r7.A0D
            r3 = r1[r8]
            int r9 = (int) r3
            r15 = r1[r0]
            r4 = 1
            r2 = r1[r2]
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0158
            r8 = 1
        L_0x0158:
            r6.A01 = r9
            r9 = 0
            X.7t6 r5 = r6.A0B     // Catch:{ RemoteException -> 0x0188 }
            long r3 = r5.A0O     // Catch:{ RemoteException -> 0x0188 }
            r1 = 0
            int r10 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r3 = X.AnonymousClass000.A1S(r10)     // Catch:{ RemoteException -> 0x0188 }
            if (r3 != 0) goto L_0x0171
            java.lang.String r3 = "Before seekTo(), service player was evicted. Lazy recover at next play()"
            X.AnonymousClass6C8.A0z(r5, r3)     // Catch:{ RemoteException -> 0x0188 }
            r5.A0Q = r1     // Catch:{ RemoteException -> 0x0188 }
            goto L_0x0196
        L_0x0171:
            X.7l9 r10 = r6.A02()     // Catch:{ RemoteException -> 0x0188 }
            long r11 = r5.A0O     // Catch:{ RemoteException -> 0x0188 }
            int r1 = r6.A01     // Catch:{ RemoteException -> 0x0188 }
            long r13 = (long) r1     // Catch:{ RemoteException -> 0x0188 }
            r17 = r8
            boolean r1 = r10.A07(r11, r13, r15, r17)     // Catch:{ RemoteException -> 0x0188 }
            if (r1 != 0) goto L_0x0196
            java.lang.String r1 = "When seekTo(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            X.C158967ks.A00(r6, r5, r1)     // Catch:{ RemoteException -> 0x0188 }
            goto L_0x0196
        L_0x0188:
            r4 = move-exception
            X.7t6 r3 = r6.A0B
            r1 = 0
            r3.A0Q = r1
            java.lang.String r2 = "Error occurs while seeking the video"
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r3.A0I(r2, r4, r1)
        L_0x0196:
            X.7Sl r2 = r7.A02
            java.lang.String r1 = "seek"
            goto L_0x0c9c
        L_0x019c:
            java.lang.Object r1 = r1.obj
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            X.7ks r9 = r7.A0D
            r1 = r1[r8]
            float r6 = X.AnonymousClass001.A05(r1)
            r4 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            int r1 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r1 < 0) goto L_0x01b3
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x01ba
        L_0x01b3:
            X.7t6 r2 = r9.A0B
            java.lang.String r1 = "Trying to set volume with invalid value"
            X.AnonymousClass6C8.A0z(r2, r1)
        L_0x01ba:
            X.7t6 r5 = r9.A0B
            float r1 = X.AnonymousClass001.A01(r4, r6, r3)
            r5.A0M = r1
            long r2 = r5.A0O     // Catch:{ RemoteException -> 0x0201 }
            r6 = 0
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1S(r1)     // Catch:{ RemoteException -> 0x0201 }
            if (r1 != 0) goto L_0x01d4
            java.lang.String r1 = "Before setVolume(), service player was evicted. Lazy recover at next play()"
            X.AnonymousClass6C8.A0z(r5, r1)     // Catch:{ RemoteException -> 0x0201 }
            return r0
        L_0x01d4:
            X.7l9 r7 = r9.A02()     // Catch:{ RemoteException -> 0x0201 }
            long r2 = r5.A0O     // Catch:{ RemoteException -> 0x0201 }
            float r6 = r5.A0M     // Catch:{ RemoteException -> 0x0201 }
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0201 }
            X.AnonymousClass000.A1Q(r4, r8, r2)     // Catch:{ RemoteException -> 0x0201 }
            java.lang.String r1 = "id [%d]: setVolume"
            X.7t5 r4 = X.C151857Wo.A01(r7, r1, r4, r2)     // Catch:{ RemoteException -> 0x0201 }
            if (r4 != 0) goto L_0x01ef
            java.lang.String r1 = "When setVolume(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            X.C158967ks.A00(r9, r5, r1)     // Catch:{ RemoteException -> 0x0201 }
            return r0
        L_0x01ef:
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ RemoteException -> 0x0201 }
            java.lang.String r1 = "Set volume"
            r4.A0K(r1, r2)     // Catch:{ RemoteException -> 0x0201 }
            android.os.Handler r3 = r4.A0l     // Catch:{ RemoteException -> 0x0201 }
            r2 = 5
            java.lang.Float r1 = java.lang.Float.valueOf(r6)     // Catch:{ RemoteException -> 0x0201 }
            X.C162987t5.A01(r3, r4, r1, r2)     // Catch:{ RemoteException -> 0x0201 }
            return r0
        L_0x0201:
            r3 = move-exception
            java.lang.String r2 = "Error occurs while setting volume"
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r5.A0I(r2, r3, r1)
            return r0
        L_0x020a:
            X.7ks r5 = r7.A0D
            java.lang.Object r4 = r1.obj
            android.view.Surface r4 = (android.view.Surface) r4
            r5.A0A = r4
            if (r4 == 0) goto L_0x0229
            android.view.Surface r1 = r5.A04
            if (r4 != r1) goto L_0x0229
            X.7t6 r3 = r5.A0B
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r2[r8] = r4
            java.lang.String r1 = "surface already sent, skipping send again: %s"
            r3.A0J(r1, r2)
        L_0x0223:
            X.7Sl r2 = r7.A02
            java.lang.String r1 = "setSurface"
            goto L_0x0c9c
        L_0x0229:
            X.7t6 r6 = r5.A0B     // Catch:{ RemoteException -> 0x0256 }
            long r2 = r6.A0O     // Catch:{ RemoteException -> 0x0256 }
            r9 = 0
            int r1 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1S(r1)     // Catch:{ RemoteException -> 0x0256 }
            if (r1 != 0) goto L_0x023d
            java.lang.String r1 = "Before setSurface(), service player was evicted. Lazy recover at next play()"
            X.AnonymousClass6C8.A0z(r6, r1)     // Catch:{ RemoteException -> 0x0256 }
            goto L_0x0223
        L_0x023d:
            X.7l9 r4 = r5.A02()     // Catch:{ RemoteException -> 0x0256 }
            long r2 = r6.A0O     // Catch:{ RemoteException -> 0x0256 }
            android.view.Surface r1 = r5.A0A     // Catch:{ RemoteException -> 0x0256 }
            boolean r1 = r4.A09(r1, r2)     // Catch:{ RemoteException -> 0x0256 }
            if (r1 != 0) goto L_0x0251
            java.lang.String r1 = "When setSurface(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            X.C158967ks.A00(r5, r6, r1)     // Catch:{ RemoteException -> 0x0256 }
            goto L_0x0223
        L_0x0251:
            android.view.Surface r1 = r5.A0A     // Catch:{ RemoteException -> 0x0256 }
            r5.A04 = r1     // Catch:{ RemoteException -> 0x0256 }
            goto L_0x0223
        L_0x0256:
            r4 = move-exception
            X.7t6 r3 = r5.A0B
            java.lang.String r2 = "Error occurs while setting surface"
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r3.A0I(r2, r4, r1)
            goto L_0x0223
        L_0x0261:
            java.lang.Object r6 = r1.obj
            android.os.ResultReceiver r6 = (android.os.ResultReceiver) r6
            X.7ks r9 = r7.A0D
            r5 = 0
            r9.A0A = r5     // Catch:{ RemoteException -> 0x029b }
            X.7t6 r4 = r9.A0B     // Catch:{ RemoteException -> 0x029b }
            long r1 = r4.A0O     // Catch:{ RemoteException -> 0x029b }
            r10 = 0
            int r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1S(r3)     // Catch:{ RemoteException -> 0x029b }
            if (r1 != 0) goto L_0x027e
            java.lang.String r1 = "Before releaseSurface(), service player was evicted. Lazy recover at next play()"
            X.AnonymousClass6C8.A0z(r4, r1)     // Catch:{ RemoteException -> 0x029b }
            goto L_0x02a8
        L_0x027e:
            X.7l9 r3 = r9.A02()     // Catch:{ RemoteException -> 0x029b }
            long r1 = r4.A0O     // Catch:{ RemoteException -> 0x029b }
            boolean r1 = r3.A08(r6, r1)     // Catch:{ RemoteException -> 0x029b }
            if (r1 == 0) goto L_0x0295
            java.lang.String r1 = "Surface release request already sent, let it complete"
            X.AnonymousClass6C8.A0z(r4, r1)     // Catch:{ RemoteException -> 0x029b }
            r9.A04 = r5     // Catch:{ RemoteException -> 0x0292, all -> 0x02ba }
            goto L_0x02ad
        L_0x0292:
            r4 = move-exception
            r6 = r5
            goto L_0x029c
        L_0x0295:
            java.lang.String r1 = "When releaseSurface(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            X.C158967ks.A00(r9, r4, r1)     // Catch:{ RemoteException -> 0x029b }
            goto L_0x02a8
        L_0x029b:
            r4 = move-exception
        L_0x029c:
            X.7t6 r3 = r9.A0B     // Catch:{ all -> 0x02b3 }
            java.lang.String r2 = "Error occurs while releasing surface"
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x02b3 }
            r3.A0I(r2, r4, r1)     // Catch:{ all -> 0x02b3 }
            if (r6 == 0) goto L_0x02ad
            goto L_0x02aa
        L_0x02a8:
            if (r6 == 0) goto L_0x02ad
        L_0x02aa:
            r6.send(r0, r5)
        L_0x02ad:
            X.7Sl r2 = r7.A02
            java.lang.String r1 = "releaseSurface"
            goto L_0x0c9c
        L_0x02b3:
            r2 = move-exception
            if (r6 == 0) goto L_0x02bb
            r6.send(r0, r5)
            throw r2
        L_0x02ba:
            r2 = move-exception
        L_0x02bb:
            throw r2
        L_0x02bc:
            X.7ks r6 = r7.A0D
            X.7t6 r4 = r6.A0B     // Catch:{ RemoteException -> 0x02dc }
            long r1 = r4.A0O     // Catch:{ RemoteException -> 0x02dc }
            r9 = 0
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1S(r3)     // Catch:{ RemoteException -> 0x02dc }
            if (r1 != 0) goto L_0x02d2
            java.lang.String r1 = "Before release(), service player was evicted. Skip releasing"
            X.AnonymousClass6C8.A0z(r4, r1)     // Catch:{ RemoteException -> 0x02dc }
            goto L_0x02e6
        L_0x02d2:
            X.7l9 r3 = r6.A02()     // Catch:{ RemoteException -> 0x02dc }
            long r1 = r4.A0O     // Catch:{ RemoteException -> 0x02dc }
            r3.A03(r1, r8)     // Catch:{ RemoteException -> 0x02dc }
            goto L_0x02e6
        L_0x02dc:
            r3 = move-exception
            X.7t6 r4 = r6.A0B     // Catch:{ all -> 0x0325 }
            java.lang.String r2 = "Error occurs while release player"
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x0325 }
            r4.A0I(r2, r3, r1)     // Catch:{ all -> 0x0325 }
        L_0x02e6:
            r6.A08 = r8
            r6.A07()
            r1 = 0
            r4.A0M = r1
            r2 = 0
            r4.A0O = r2
            long[] r1 = r4.A0K
            r1[r0] = r2
            r1[r8] = r2
            android.os.Handler r3 = r4.A0C
            android.os.Looper r1 = r3.getLooper()
            java.lang.Thread r1 = r1.getThread()
            java.lang.String r2 = "HeroPlayerInternalThread"
            java.lang.String r1 = r1.getName()
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x031b
            X.8LG r1 = r4.A05
            boolean r2 = r1.quitHandlerSafely
            android.os.Looper r1 = r3.getLooper()
            if (r2 == 0) goto L_0x0321
            r1.quitSafely()
        L_0x031b:
            X.7Sl r2 = r7.A02
            java.lang.String r1 = "release"
            goto L_0x0c9c
        L_0x0321:
            r1.quit()
            goto L_0x031b
        L_0x0325:
            r5 = move-exception
            r6.A08 = r8
            r6.A07()
            X.7t6 r4 = r6.A0B
            r1 = 0
            r4.A0M = r1
            r2 = 0
            r4.A0O = r2
            long[] r1 = r4.A0K
            r1[r0] = r2
            r1[r8] = r2
            throw r5
        L_0x033b:
            X.7ks r5 = r7.A0D
            java.lang.Object r1 = r1.obj
            boolean r2 = X.AnonymousClass001.A1Z(r1)
            X.7t6 r3 = r5.A0B     // Catch:{ RemoteException -> 0x0360 }
            X.8LG r1 = r3.A05     // Catch:{ RemoteException -> 0x0360 }
            boolean r1 = r1.disableRecoverInBackground     // Catch:{ RemoteException -> 0x0360 }
            if (r1 == 0) goto L_0x0350
            if (r2 == 0) goto L_0x0350
            r5.A07 = r0     // Catch:{ RemoteException -> 0x0360 }
            goto L_0x0353
        L_0x0350:
            r5.A03()     // Catch:{ RemoteException -> 0x0360 }
        L_0x0353:
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ RemoteException -> 0x0360 }
            java.lang.String r1 = "onVideoServiceConnected"
            r3.A0J(r1, r2)     // Catch:{ RemoteException -> 0x0360 }
            X.85C r1 = r3.A0E     // Catch:{ RemoteException -> 0x0360 }
            r1.BfQ()     // Catch:{ RemoteException -> 0x0360 }
            goto L_0x036a
        L_0x0360:
            r4 = move-exception
            X.7t6 r3 = r5.A0B
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r1 = "Error occurs in handleServiceConnected"
            r3.A0I(r1, r4, r2)
        L_0x036a:
            X.7Sl r2 = r7.A02
            java.lang.String r1 = "connected"
            goto L_0x0c9c
        L_0x0370:
            X.7ks r5 = r7.A0D
            r1 = 0
            r5.A06 = r1
            r5.A04 = r1
            X.7t6 r10 = r5.A0B
            long r2 = r10.A0O
            r8 = 0
            int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1S(r1)
            if (r1 != 0) goto L_0x03ca
            r3 = 0
        L_0x0387:
            r5.A02 = r3
            X.7a6 r1 = r5.A05
            if (r1 == 0) goto L_0x03c7
            boolean r1 = r1.A00()
            if (r1 == 0) goto L_0x03c7
            long r1 = r10.A02()
        L_0x0397:
            r5.A03 = r1
            X.7yr r11 = X.AnonymousClass6C8.A0W(r10)
            long r8 = android.os.SystemClock.elapsedRealtime()
            long r5 = r11.A08
            boolean r1 = r11.A0R
            if (r1 == 0) goto L_0x03c4
            boolean r1 = r11.A0P
            if (r1 != 0) goto L_0x03c4
            float r12 = r11.A00
            long r3 = r11.A0H
            long r1 = r8 - r3
            float r3 = (float) r1
            float r12 = r12 * r3
            long r1 = (long) r12
        L_0x03b4:
            long r5 = r5 + r1
            r11.A08 = r5
            long r3 = r11.A0E
            long r3 = r3 + r1
            r11.A0E = r3
            r11.A0P = r0
            r11.A0H = r8
            java.lang.Object r1 = r10.A0F
            monitor-enter(r1)
            goto L_0x03ed
        L_0x03c4:
            r1 = 0
            goto L_0x03b4
        L_0x03c7:
            r1 = 0
            goto L_0x0397
        L_0x03ca:
            boolean r1 = r10.A0U
            if (r1 == 0) goto L_0x03e1
            long r8 = android.os.SystemClock.elapsedRealtime()
            long r1 = r10.A0R
            long r8 = r8 - r1
            X.8LG r1 = r10.A05
            int r1 = r1.returnRequestedSeekTimeTimeoutMs
            long r2 = (long) r1
            int r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x03e1
            long r3 = r10.A0P
            goto L_0x0387
        L_0x03e1:
            X.7yr r1 = X.AnonymousClass6C8.A0W(r10)
            long r3 = r1.A08
            long r1 = r10.A04()
            long r3 = r3 + r1
            goto L_0x0387
        L_0x03ed:
            r1.notifyAll()     // Catch:{ all -> 0x03f7 }
            monitor-exit(r1)     // Catch:{ all -> 0x03f7 }
            X.7Sl r2 = r7.A02
            java.lang.String r1 = "disconnected"
            goto L_0x0c9c
        L_0x03f7:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x03f7 }
            throw r2
        L_0x03fa:
            X.7ks r2 = r7.A0D
            java.lang.Object r1 = r1.obj
            X.7yr r1 = (X.C166537yr) r1
            X.C158967ks.A01(r2, r1)
            return r0
        L_0x0404:
            X.7ks r1 = r7.A0D
            r1.A05()
            X.7Sl r2 = r7.A02
            java.lang.String r1 = "servicePlayerRelease"
            goto L_0x0c9c
        L_0x040f:
            X.7ks r6 = r7.A0D
            java.lang.Object r7 = r1.obj
            X.7t6 r11 = r6.A0B     // Catch:{ RemoteException -> 0x0444 }
            long r3 = r11.A0O     // Catch:{ RemoteException -> 0x0444 }
            r9 = 0
            int r1 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1S(r1)     // Catch:{ RemoteException -> 0x0444 }
            if (r1 != 0) goto L_0x0427
            java.lang.String r1 = "Before setCustomQuality(), service player was evicted. Skip setting custom quality"
            X.AnonymousClass6C8.A0z(r11, r1)     // Catch:{ RemoteException -> 0x0444 }
            return r0
        L_0x0427:
            X.7l9 r5 = r6.A02()     // Catch:{ RemoteException -> 0x0444 }
            long r3 = r11.A0O     // Catch:{ RemoteException -> 0x0444 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ RemoteException -> 0x0444 }
            X.AnonymousClass000.A1Q(r2, r8, r3)     // Catch:{ RemoteException -> 0x0444 }
            r2[r0] = r7     // Catch:{ RemoteException -> 0x0444 }
            java.lang.String r1 = "id [%d]: setCustomQuality: %s"
            X.7t5 r3 = X.C151857Wo.A01(r5, r1, r2, r3)     // Catch:{ RemoteException -> 0x0444 }
            if (r3 == 0) goto L_0x0c9f
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x0444 }
            r1 = 25
            X.C162987t5.A01(r2, r3, r7, r1)     // Catch:{ RemoteException -> 0x0444 }
            return r0
        L_0x0444:
            r4 = move-exception
            X.7t6 r3 = r6.A0B
            java.lang.String r2 = "Error occurs while setting custom quality"
            goto L_0x0d3f
        L_0x044b:
            X.7ks r1 = r7.A0D
            r1.A06()
            X.7Sl r2 = r7.A02
            java.lang.String r1 = "reset"
            goto L_0x0c9c
        L_0x0456:
            X.7ks r6 = r7.A0D
            java.lang.Object r7 = r1.obj
            X.7t6 r9 = r6.A0B     // Catch:{ RemoteException -> 0x0489 }
            long r2 = r9.A0O     // Catch:{ RemoteException -> 0x0489 }
            r4 = 0
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1S(r1)     // Catch:{ RemoteException -> 0x0489 }
            if (r1 != 0) goto L_0x046e
            java.lang.String r1 = "Before setDeviceOrientationFrame(), service player was evicted. Skip setting device orientation frame"
            X.AnonymousClass6C8.A0z(r9, r1)     // Catch:{ RemoteException -> 0x0489 }
            return r0
        L_0x046e:
            X.7l9 r5 = r6.A02()     // Catch:{ RemoteException -> 0x0489 }
            long r3 = r9.A0O     // Catch:{ RemoteException -> 0x0489 }
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0489 }
            X.AnonymousClass000.A1Q(r2, r8, r3)     // Catch:{ RemoteException -> 0x0489 }
            java.lang.String r1 = "id [%d]: setDeviceOrientationFrame"
            X.7t5 r3 = X.C151857Wo.A01(r5, r1, r2, r3)     // Catch:{ RemoteException -> 0x0489 }
            if (r3 == 0) goto L_0x0c9f
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x0489 }
            r1 = 13
            X.C162987t5.A01(r2, r3, r7, r1)     // Catch:{ RemoteException -> 0x0489 }
            return r0
        L_0x0489:
            r4 = move-exception
            X.7t6 r3 = r6.A0B
            java.lang.String r2 = "Error occurs while setting device orientation frame"
            goto L_0x0d3f
        L_0x0490:
            X.7ks r6 = r7.A0D
            java.lang.Object r7 = r1.obj
            X.7t6 r9 = r6.A0B     // Catch:{ RemoteException -> 0x04c3 }
            long r2 = r9.A0O     // Catch:{ RemoteException -> 0x04c3 }
            r4 = 0
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1S(r1)     // Catch:{ RemoteException -> 0x04c3 }
            if (r1 != 0) goto L_0x04a8
            java.lang.String r1 = "Before setSpatialAudioFocus(), service player was evicted. Skip setting spatial audio focus"
            X.AnonymousClass6C8.A0z(r9, r1)     // Catch:{ RemoteException -> 0x04c3 }
            return r0
        L_0x04a8:
            X.7l9 r5 = r6.A02()     // Catch:{ RemoteException -> 0x04c3 }
            long r3 = r9.A0O     // Catch:{ RemoteException -> 0x04c3 }
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x04c3 }
            X.AnonymousClass000.A1Q(r2, r8, r3)     // Catch:{ RemoteException -> 0x04c3 }
            java.lang.String r1 = "id [%d]: setSpatialAudioFocus"
            X.7t5 r3 = X.C151857Wo.A01(r5, r1, r2, r3)     // Catch:{ RemoteException -> 0x04c3 }
            if (r3 == 0) goto L_0x0c9f
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x04c3 }
            r1 = 14
            X.C162987t5.A01(r2, r3, r7, r1)     // Catch:{ RemoteException -> 0x04c3 }
            return r0
        L_0x04c3:
            r4 = move-exception
            X.7t6 r3 = r6.A0B
            java.lang.String r2 = "Error occurs while setting spatial audio focus"
            goto L_0x0d3f
        L_0x04ca:
            java.lang.Object r6 = r1.obj
            java.lang.String[] r6 = (java.lang.String[]) r6
            X.7ks r5 = r7.A0D
            r8 = r6[r8]
            r7 = r6[r0]
            r4 = r6[r2]
            r1 = 3
            r3 = r6[r1]
            r1 = 4
            r14 = r6[r1]
            X.7a6 r1 = r5.A05
            if (r1 == 0) goto L_0x0550
            boolean r6 = r1.A00()
            if (r6 == 0) goto L_0x0550
            X.6xH r17 = X.C142486xH.DASH_LIVE
            X.7yv r3 = r1.A0F
            X.6vz r3 = r3.A07
            int r4 = r3.ordinal()
            if (r4 == r0) goto L_0x04fc
            r3 = 0
            if (r4 == r3) goto L_0x051b
            r3 = 3
            if (r4 == r3) goto L_0x0518
            if (r4 != r2) goto L_0x04fc
            X.6xH r17 = X.C142486xH.PROGRESSIVE_DOWNLOAD
        L_0x04fc:
            X.7t6 r2 = r5.A0B
            java.lang.String r3 = "force live video to complete upon 410 dismiss error"
            r14 = 0
            X.AnonymousClass6C8.A0z(r2, r3)
            boolean r3 = r5.A08
            if (r3 == 0) goto L_0x0c9f
            X.7Fh r16 = r2.A05()
            X.7yr r6 = X.AnonymousClass6C8.A0W(r2)
            if (r6 != 0) goto L_0x051e
            java.lang.String r1 = "Force Video To End terminated early"
            X.AnonymousClass6C8.A0z(r2, r1)
            return r0
        L_0x0518:
            X.6xH r17 = X.C142486xH.HLS
            goto L_0x04fc
        L_0x051b:
            X.6xH r17 = X.C142486xH.DASH
            goto L_0x04fc
        L_0x051e:
            r2.A0G(r6)
            boolean r3 = r6.A0R
            if (r3 != 0) goto L_0x053a
            X.85C r4 = r2.A0E
            X.7yf r5 = X.AnonymousClass6CA.A0L(r2)
            X.6xQ r3 = X.C142576xQ.UNKNOWN
            java.lang.String r7 = r3.value
            r8 = 0
            r12 = -1
            java.lang.String r11 = r1.A08
            r10 = r8
            r9 = r8
            r15 = r14
            r4.BfT(r5, r6, r7, r8, r9, r10, r11, r12, r14, r15)
        L_0x053a:
            X.85C r15 = r2.A0E
            X.7yf r18 = X.AnonymousClass6CA.A0L(r2)
            boolean r2 = r2.A0T
            java.lang.String r1 = r1.A08
            r19 = r6
            r20 = r1
            r21 = r14
            r22 = r2
            r15.BfG(r16, r17, r18, r19, r20, r21, r22)
            return r0
        L_0x0550:
            X.7t6 r2 = r5.A0B
            X.8LG r1 = r2.A05
            boolean r1 = r1.logStallOnPauseOnError
            if (r1 == 0) goto L_0x0579
            X.7Fh r10 = r2.A05()
        L_0x055c:
            X.85C r9 = r2.A0E
            X.7yr r13 = X.AnonymousClass6C8.A0W(r2)
            X.7yf r12 = X.AnonymousClass6CA.A0L(r2)
            X.6xt r2 = X.C142846xt.valueOf(r8)
            X.6xw r1 = X.C142876xw.valueOf(r7)
            X.7n4 r11 = new X.7n4
            r11.<init>(r1, r2, r4, r3)
            java.lang.String r15 = ""
            r9.BYD(r10, r11, r12, r13, r14, r15)
            return r0
        L_0x0579:
            r10 = 0
            goto L_0x055c
        L_0x057b:
            X.7ks r7 = r7.A0D
            int r1 = r1.arg1
            r7.A00 = r1
            X.7t6 r6 = r7.A0B     // Catch:{ RemoteException -> 0x05aa }
            long r2 = r6.A0O     // Catch:{ RemoteException -> 0x05aa }
            r4 = 0
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1S(r1)     // Catch:{ RemoteException -> 0x05aa }
            if (r1 != 0) goto L_0x0595
            java.lang.String r1 = "Before setRelativePosition(), service player was evicted. Lazy recover at next play()"
            X.AnonymousClass6C8.A0z(r6, r1)     // Catch:{ RemoteException -> 0x05aa }
            return r0
        L_0x0595:
            X.7l9 r5 = r7.A02()     // Catch:{ RemoteException -> 0x05aa }
            long r3 = r6.A0O     // Catch:{ RemoteException -> 0x05aa }
            int r1 = r7.A00     // Catch:{ RemoteException -> 0x05aa }
            long r1 = (long) r1     // Catch:{ RemoteException -> 0x05aa }
            boolean r1 = r5.A06(r3, r1)     // Catch:{ RemoteException -> 0x05aa }
            if (r1 != 0) goto L_0x0c9f
            java.lang.String r1 = "When setRelativePosition(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            X.C158967ks.A00(r7, r6, r1)     // Catch:{ RemoteException -> 0x05aa }
            return r0
        L_0x05aa:
            r4 = move-exception
            X.7t6 r3 = r7.A0B
            java.lang.String r2 = "Error occurs while setting relative position of the video"
            goto L_0x0d3f
        L_0x05b1:
            X.7ks r9 = r7.A0D
            java.lang.Object r1 = r1.obj
            boolean r5 = X.AnonymousClass001.A1Z(r1)
            X.7t6 r6 = r9.A0B
            r6.A0T = r5
            long r3 = r6.A0O     // Catch:{ RemoteException -> 0x05fd }
            r10 = 0
            int r1 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1S(r1)     // Catch:{ RemoteException -> 0x05fd }
            if (r1 != 0) goto L_0x05cf
            java.lang.String r1 = "Before setLooping(), service player was evicted. Lazy recover at next play()"
            X.AnonymousClass6C8.A0z(r6, r1)     // Catch:{ RemoteException -> 0x05fd }
            return r0
        L_0x05cf:
            X.7l9 r7 = r9.A02()     // Catch:{ RemoteException -> 0x05fd }
            long r3 = r6.A0O     // Catch:{ RemoteException -> 0x05fd }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ RemoteException -> 0x05fd }
            X.AnonymousClass000.A1Q(r2, r8, r3)     // Catch:{ RemoteException -> 0x05fd }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ RemoteException -> 0x05fd }
            r2[r0] = r5     // Catch:{ RemoteException -> 0x05fd }
            java.lang.String r1 = "id [%d]: setLooping %s"
            X.7t5 r3 = X.C151857Wo.A01(r7, r1, r2, r3)     // Catch:{ RemoteException -> 0x05fd }
            if (r3 != 0) goto L_0x05ee
            java.lang.String r1 = "When setLooping(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            X.C158967ks.A00(r9, r6, r1)     // Catch:{ RemoteException -> 0x05fd }
            return r0
        L_0x05ee:
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ RemoteException -> 0x05fd }
            java.lang.String r1 = "Set Looping"
            r3.A0K(r1, r2)     // Catch:{ RemoteException -> 0x05fd }
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x05fd }
            r1 = 18
            X.C162987t5.A01(r2, r3, r5, r1)     // Catch:{ RemoteException -> 0x05fd }
            return r0
        L_0x05fd:
            r3 = move-exception
            java.lang.String r2 = "Error occurs while setting looping"
            goto L_0x09eb
        L_0x0602:
            X.7ks r4 = r7.A0D
            java.lang.Object r7 = r1.obj
            X.7JN r7 = (X.AnonymousClass7JN) r7
            X.7t6 r9 = r4.A0B
            java.lang.Object[] r5 = new java.lang.Object[r2]
            long r2 = r7.A01
            X.AnonymousClass000.A1Q(r5, r8, r2)
            X.7Fi r1 = r7.A00
            if (r1 == 0) goto L_0x0637
            android.view.Surface r1 = r1.A01
        L_0x0617:
            r5[r0] = r1
            java.lang.String r1 = "switchToWarmupPlayer: player id: %d, surface: %s"
            r9.A0J(r1, r5)
            X.7a6 r6 = r4.A05
            if (r6 == 0) goto L_0x0639
            java.lang.String r5 = r7.A02
            X.8LG r1 = r9.A05
            java.lang.String r1 = X.C156817hG.A00(r6, r1)
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x0639
            java.lang.String r0 = "switchToWarmupPlayer is called after setVideoPlaybackParams"
            java.lang.IllegalStateException r2 = X.AnonymousClass001.A0e(r0)
            throw r2
        L_0x0637:
            r1 = 0
            goto L_0x0617
        L_0x0639:
            long r5 = r9.A0O     // Catch:{ RemoteException -> 0x064f }
            r10 = 0
            int r1 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1S(r1)     // Catch:{ RemoteException -> 0x064f }
            if (r1 == 0) goto L_0x0657
            X.7l9 r1 = r4.A02()     // Catch:{ RemoteException -> 0x064f }
            long r5 = r9.A0O     // Catch:{ RemoteException -> 0x064f }
            r1.A03(r5, r0)     // Catch:{ RemoteException -> 0x064f }
            goto L_0x0657
        L_0x064f:
            r6 = move-exception
            java.lang.String r5 = "Error occurs while release player"
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r9.A0I(r5, r6, r1)
        L_0x0657:
            r9.A0O = r2
            long[] r3 = r9.A0K
            r1 = r3[r8]
            r3[r0] = r1
            long r1 = r9.A0O
            r3[r8] = r1
            X.7Fi r1 = r7.A00
            if (r1 == 0) goto L_0x0c9f
            android.view.Surface r1 = r1.A01
            r4.A0A = r1
            r4.A04 = r1
            return r0
        L_0x066e:
            X.7ks r4 = r7.A0D
            java.lang.Object r1 = r1.obj
            boolean r10 = X.AnonymousClass001.A1Z(r1)
            X.7t6 r6 = r4.A0B
            r5 = 1
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r3[r8] = r9
            java.lang.String r1 = "liveLatencyMode: %d"
            r6.A0J(r1, r3)
            X.7l9 r7 = r4.A02()     // Catch:{ RemoteException -> 0x06c8 }
            long r3 = r6.A0O     // Catch:{ RemoteException -> 0x06c8 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ RemoteException -> 0x06c8 }
            X.AnonymousClass000.A1Q(r2, r8, r3)     // Catch:{ RemoteException -> 0x06c8 }
            r2[r0] = r9     // Catch:{ RemoteException -> 0x06c8 }
            java.lang.String r1 = "id [%d]: liveLatencyMode %d"
            X.7t5 r4 = X.C151857Wo.A01(r7, r1, r2, r3)     // Catch:{ RemoteException -> 0x06c8 }
            if (r4 != 0) goto L_0x06a6
            java.lang.String r2 = "Fail to setLiveLatencyMode to : %d"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x06c8 }
            if (r10 != 0) goto L_0x06a2
            r5 = 0
        L_0x06a2:
            X.AnonymousClass000.A1P(r1, r5, r8)     // Catch:{ RemoteException -> 0x06c8 }
            goto L_0x06c4
        L_0x06a6:
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x06c8 }
            r2[r8] = r9     // Catch:{ RemoteException -> 0x06c8 }
            java.lang.String r1 = "Set rewindableVideoMode: %d"
            r4.A0K(r1, r2)     // Catch:{ RemoteException -> 0x06c8 }
            android.os.Handler r3 = r4.A0l     // Catch:{ RemoteException -> 0x06c8 }
            r2 = 22
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)     // Catch:{ RemoteException -> 0x06c8 }
            X.C162987t5.A01(r3, r4, r1, r2)     // Catch:{ RemoteException -> 0x06c8 }
            java.lang.String r2 = "setLiveLatencyMode successfully to : %d"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x06c8 }
            if (r10 != 0) goto L_0x06c1
            r5 = 0
        L_0x06c1:
            X.AnonymousClass000.A1P(r1, r5, r8)     // Catch:{ RemoteException -> 0x06c8 }
        L_0x06c4:
            r6.A0J(r2, r1)     // Catch:{ RemoteException -> 0x06c8 }
            return r0
        L_0x06c8:
            r3 = move-exception
            java.lang.String r2 = "Error occurs while setting liveLatencyMode the video"
            goto L_0x09eb
        L_0x06cd:
            X.7ks r5 = r7.A0D
            java.lang.Object r7 = r1.obj
            java.lang.Number r7 = (java.lang.Number) r7
            int r9 = r7.intValue()
            X.7t6 r6 = r5.A0B
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r3[r8] = r7
            java.lang.String r1 = "setAudioUsage: %d"
            r6.A0J(r1, r3)
            long r3 = r6.A0O     // Catch:{ RemoteException -> 0x0733 }
            r10 = 0
            int r1 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1S(r1)     // Catch:{ RemoteException -> 0x0733 }
            if (r1 != 0) goto L_0x06f6
            java.lang.String r2 = "player must be valid before updating the audioUsage"
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ RemoteException -> 0x0733 }
        L_0x06f2:
            r6.A0J(r2, r1)     // Catch:{ RemoteException -> 0x0733 }
            goto L_0x0732
        L_0x06f6:
            X.7l9 r10 = r5.A02()     // Catch:{ RemoteException -> 0x0733 }
            long r3 = r6.A0O     // Catch:{ RemoteException -> 0x0733 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ RemoteException -> 0x0733 }
            X.AnonymousClass000.A1Q(r5, r8, r3)     // Catch:{ RemoteException -> 0x0733 }
            r5[r0] = r7     // Catch:{ RemoteException -> 0x0733 }
            java.lang.String r1 = "id [%d]: setAudioUsage %d"
            X.7t5 r4 = X.C151857Wo.A01(r10, r1, r5, r3)     // Catch:{ RemoteException -> 0x0733 }
            if (r4 != 0) goto L_0x0712
            java.lang.String r2 = "failed to setAudioUsage to : %d"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0733 }
        L_0x070f:
            r1[r8] = r7     // Catch:{ RemoteException -> 0x0733 }
            goto L_0x06f2
        L_0x0712:
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0733 }
            r3[r8] = r7     // Catch:{ RemoteException -> 0x0733 }
            java.lang.String r1 = "Set audioUsage: %d"
            r4.A0K(r1, r3)     // Catch:{ RemoteException -> 0x0733 }
            r1 = 1
            if (r9 == 0) goto L_0x0722
            r1 = 2
            if (r9 == r2) goto L_0x0722
            r1 = 0
        L_0x0722:
            android.os.Handler r3 = r4.A0l     // Catch:{ RemoteException -> 0x0733 }
            r2 = 23
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ RemoteException -> 0x0733 }
            X.C162987t5.A01(r3, r4, r1, r2)     // Catch:{ RemoteException -> 0x0733 }
            java.lang.String r2 = "setAudioUsage successfully to : %d"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0733 }
            goto L_0x070f
        L_0x0732:
            return r0
        L_0x0733:
            r3 = move-exception
            java.lang.String r2 = "error occurred while setting audio usage"
            goto L_0x09eb
        L_0x0738:
            X.7ks r7 = r7.A0D
            X.7t6 r6 = r7.A0B
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r1 = "Force Video To End triggered"
            r6.A0J(r1, r2)
            long r4 = r6.A0O     // Catch:{ RemoteException -> 0x07bd }
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1S(r1)     // Catch:{ RemoteException -> 0x07bd }
            if (r1 != 0) goto L_0x0755
            java.lang.String r1 = "Before pause(), service player was evicted. Lazy recover at next play()"
            X.AnonymousClass6C8.A0z(r6, r1)     // Catch:{ RemoteException -> 0x07bd }
            return r0
        L_0x0755:
            X.7l9 r4 = r7.A02()     // Catch:{ RemoteException -> 0x07bd }
            long r2 = r6.A0O     // Catch:{ RemoteException -> 0x07bd }
            java.lang.String r1 = ""
            boolean r1 = r4.A0A(r1, r2, r0)     // Catch:{ RemoteException -> 0x07bd }
            if (r1 != 0) goto L_0x0c9f
            java.lang.String r1 = "When pause(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            X.C158967ks.A00(r7, r6, r1)     // Catch:{ RemoteException -> 0x07bd }
            return r0
        L_0x0769:
            X.7ks r11 = r7.A0D
            java.lang.Object r1 = r1.obj
            int r5 = X.AnonymousClass001.A0K(r1)
            X.7t6 r6 = r11.A0B
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.String r1 = "Pre Seek To"
            r6.A0J(r1, r3)
            long r3 = r6.A0O     // Catch:{ RemoteException -> 0x07bd }
            r9 = 0
            int r1 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1S(r1)     // Catch:{ RemoteException -> 0x07bd }
            if (r1 != 0) goto L_0x078c
            java.lang.String r1 = "Before preSeekTo(), service player was evicted. Lazy recover at next play()"
            X.AnonymousClass6C8.A0z(r6, r1)     // Catch:{ RemoteException -> 0x07bd }
            return r0
        L_0x078c:
            X.7l9 r7 = r11.A02()     // Catch:{ RemoteException -> 0x07bd }
            long r3 = r6.A0O     // Catch:{ RemoteException -> 0x07bd }
            long r9 = (long) r5     // Catch:{ RemoteException -> 0x07bd }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ RemoteException -> 0x07bd }
            X.AnonymousClass000.A1Q(r2, r8, r3)     // Catch:{ RemoteException -> 0x07bd }
            java.lang.Long r5 = java.lang.Long.valueOf(r9)     // Catch:{ RemoteException -> 0x07bd }
            r2[r0] = r5     // Catch:{ RemoteException -> 0x07bd }
            java.lang.String r1 = "id [%d]: preSeekTo %d"
            X.7t5 r3 = X.C151857Wo.A01(r7, r1, r2, r3)     // Catch:{ RemoteException -> 0x07bd }
            if (r3 != 0) goto L_0x07ac
            java.lang.String r1 = "When preSeekTo(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            X.C158967ks.A00(r11, r6, r1)     // Catch:{ RemoteException -> 0x07bd }
            return r0
        L_0x07ac:
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x07bd }
            r2[r8] = r5     // Catch:{ RemoteException -> 0x07bd }
            java.lang.String r1 = "preSeekTo %d"
            r3.A0K(r1, r2)     // Catch:{ RemoteException -> 0x07bd }
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x07bd }
            r1 = 26
            X.C162987t5.A01(r2, r3, r5, r1)     // Catch:{ RemoteException -> 0x07bd }
            return r0
        L_0x07bd:
            r3 = move-exception
            java.lang.String r2 = "Error occurs while pausing the video"
            goto L_0x09eb
        L_0x07c2:
            X.7ks r9 = r7.A0D
            java.lang.Object r1 = r1.obj
            float r5 = X.AnonymousClass001.A05(r1)
            r4 = 1082130432(0x40800000, float:4.0)
            r3 = 1048576000(0x3e800000, float:0.25)
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 < 0) goto L_0x07d6
            int r1 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x07dd
        L_0x07d6:
            X.7t6 r2 = r9.A0B
            java.lang.String r1 = "Trying to set playback speed with invalid value"
            X.AnonymousClass6C8.A0z(r2, r1)
        L_0x07dd:
            X.7t6 r6 = r9.A0B
            float r1 = X.AnonymousClass001.A01(r4, r5, r3)
            r6.A0L = r1
            long r2 = r6.A0O     // Catch:{ RemoteException -> 0x0825 }
            r4 = 0
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1S(r1)     // Catch:{ RemoteException -> 0x0825 }
            if (r1 != 0) goto L_0x07f7
            java.lang.String r1 = "Before setPlaybackSpeed(), service player was evicted. Lazy recover at next play()"
            X.AnonymousClass6C8.A0z(r6, r1)     // Catch:{ RemoteException -> 0x0825 }
            return r0
        L_0x07f7:
            X.7l9 r7 = r9.A02()     // Catch:{ RemoteException -> 0x0825 }
            long r2 = r6.A0O     // Catch:{ RemoteException -> 0x0825 }
            float r5 = r6.A0L     // Catch:{ RemoteException -> 0x0825 }
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0825 }
            X.AnonymousClass000.A1Q(r4, r8, r2)     // Catch:{ RemoteException -> 0x0825 }
            java.lang.String r1 = "id [%d]: setPlaybackSpeed"
            X.7t5 r4 = X.C151857Wo.A01(r7, r1, r4, r2)     // Catch:{ RemoteException -> 0x0825 }
            if (r4 != 0) goto L_0x0812
            java.lang.String r1 = "When setPlaybackSpeed(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            X.C158967ks.A00(r9, r6, r1)     // Catch:{ RemoteException -> 0x0825 }
            return r0
        L_0x0812:
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ RemoteException -> 0x0825 }
            java.lang.String r1 = "Set playback speed"
            r4.A0K(r1, r2)     // Catch:{ RemoteException -> 0x0825 }
            android.os.Handler r3 = r4.A0l     // Catch:{ RemoteException -> 0x0825 }
            r2 = 27
            java.lang.Float r1 = java.lang.Float.valueOf(r5)     // Catch:{ RemoteException -> 0x0825 }
            X.C162987t5.A01(r3, r4, r1, r2)     // Catch:{ RemoteException -> 0x0825 }
            return r0
        L_0x0825:
            r3 = move-exception
            java.lang.String r2 = "Error occurs while setting playback speed"
            goto L_0x09eb
        L_0x082a:
            X.7ks r3 = r7.A0D
            java.lang.Object r2 = r1.obj
            java.lang.String r2 = (java.lang.String) r2
            X.7a6 r1 = r3.A05
            if (r1 == 0) goto L_0x0c9f
            r1.A07 = r2
            return r0
        L_0x0837:
            X.7ks r6 = r7.A0D
            X.7t6 r7 = r6.A0B     // Catch:{ RemoteException -> 0x0873 }
            long r4 = r7.A0O     // Catch:{ RemoteException -> 0x0873 }
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1S(r1)     // Catch:{ RemoteException -> 0x0873 }
            if (r1 != 0) goto L_0x084d
            java.lang.String r1 = "Before retry(), service player was evicted. Lazy recover at next play()"
            X.AnonymousClass6C8.A0z(r7, r1)     // Catch:{ RemoteException -> 0x0873 }
            return r0
        L_0x084d:
            X.7l9 r5 = r6.A02()     // Catch:{ RemoteException -> 0x0873 }
            long r3 = r7.A0O     // Catch:{ RemoteException -> 0x0873 }
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0873 }
            X.AnonymousClass000.A1Q(r2, r8, r3)     // Catch:{ RemoteException -> 0x0873 }
            java.lang.String r1 = "id [%d]: retry playback"
            X.7t5 r3 = X.C151857Wo.A01(r5, r1, r2, r3)     // Catch:{ RemoteException -> 0x0873 }
            if (r3 == 0) goto L_0x0c9f
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ RemoteException -> 0x0873 }
            java.lang.String r1 = "retry"
            r3.A0K(r1, r2)     // Catch:{ RemoteException -> 0x0873 }
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x0873 }
            r1 = 28
            android.os.Message r1 = r2.obtainMessage(r1)     // Catch:{ RemoteException -> 0x0873 }
            r3.A0G(r1)     // Catch:{ RemoteException -> 0x0873 }
            return r0
        L_0x0873:
            r4 = move-exception
            X.7t6 r3 = r6.A0B
            java.lang.String r2 = "Error occurs while retrying the same video playback"
            goto L_0x0d3f
        L_0x087a:
            X.7ks r7 = r7.A0D
            java.lang.Object r1 = r1.obj
            boolean r10 = X.AnonymousClass001.A1Z(r1)
            X.7t6 r9 = r7.A0B     // Catch:{ RemoteException -> 0x08be }
            long r3 = r9.A0O     // Catch:{ RemoteException -> 0x08be }
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1S(r1)     // Catch:{ RemoteException -> 0x08be }
            if (r1 != 0) goto L_0x0896
            java.lang.String r1 = "Before enableVideoTrack(), service player was evicted. Skip it"
            X.AnonymousClass6C8.A0z(r9, r1)     // Catch:{ RemoteException -> 0x08be }
            return r0
        L_0x0896:
            X.7l9 r6 = r7.A02()     // Catch:{ RemoteException -> 0x08be }
            long r3 = r9.A0O     // Catch:{ RemoteException -> 0x08be }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ RemoteException -> 0x08be }
            X.AnonymousClass000.A1Q(r2, r8, r3)     // Catch:{ RemoteException -> 0x08be }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r10)     // Catch:{ RemoteException -> 0x08be }
            r2[r0] = r5     // Catch:{ RemoteException -> 0x08be }
            java.lang.String r1 = "id [%d]: enable video track %b"
            X.7t5 r3 = X.C151857Wo.A01(r6, r1, r2, r3)     // Catch:{ RemoteException -> 0x08be }
            if (r3 == 0) goto L_0x0c9f
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ RemoteException -> 0x08be }
            java.lang.String r1 = "Enable Video Track"
            r3.A0K(r1, r2)     // Catch:{ RemoteException -> 0x08be }
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x08be }
            r1 = 29
            X.C162987t5.A01(r2, r3, r5, r1)     // Catch:{ RemoteException -> 0x08be }
            return r0
        L_0x08be:
            r4 = move-exception
            X.7t6 r3 = r7.A0B
            java.lang.String r2 = "Error occurs while set video track visibilty"
            goto L_0x0d3f
        L_0x08c5:
            X.7ks r4 = r7.A0D
            java.lang.Object r5 = r1.obj
            X.7t6 r6 = r4.A0B
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r3[r8] = r5
            java.lang.String r1 = "should enable live low latency optimization: %s"
            r6.A0J(r1, r3)
            X.7l9 r7 = r4.A02()     // Catch:{ RemoteException -> 0x0907 }
            long r3 = r6.A0O     // Catch:{ RemoteException -> 0x0907 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ RemoteException -> 0x0907 }
            X.AnonymousClass000.A1Q(r2, r8, r3)     // Catch:{ RemoteException -> 0x0907 }
            r2[r0] = r5     // Catch:{ RemoteException -> 0x0907 }
            java.lang.String r1 = "id [%d]: setFullScreen %s"
            X.7t5 r3 = X.C151857Wo.A01(r7, r1, r2, r3)     // Catch:{ RemoteException -> 0x0907 }
            if (r3 != 0) goto L_0x08f3
            java.lang.String r2 = "Fail to enable live low latency optimization to : %s"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0907 }
        L_0x08ed:
            r1[r8] = r5     // Catch:{ RemoteException -> 0x0907 }
            r6.A0J(r2, r1)     // Catch:{ RemoteException -> 0x0907 }
            goto L_0x0906
        L_0x08f3:
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ RemoteException -> 0x0907 }
            java.lang.String r1 = "Enable live low latency optimization"
            r3.A0K(r1, r2)     // Catch:{ RemoteException -> 0x0907 }
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x0907 }
            r1 = 30
            X.C162987t5.A01(r2, r3, r5, r1)     // Catch:{ RemoteException -> 0x0907 }
            java.lang.String r2 = "enable live low latency optimization successfully to : %s"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0907 }
            goto L_0x08ed
        L_0x0906:
            return r0
        L_0x0907:
            r3 = move-exception
            java.lang.String r2 = "Error occurs while enabling live low latency optimization"
            goto L_0x09eb
        L_0x090c:
            X.7ks r4 = r7.A0D
            java.lang.Object r5 = r1.obj
            X.7t6 r6 = r4.A0B
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r3[r8] = r5
            java.lang.String r1 = "streamLatencyMode: %d"
            r6.A0J(r1, r3)
            X.7l9 r7 = r4.A02()     // Catch:{ RemoteException -> 0x094e }
            long r3 = r6.A0O     // Catch:{ RemoteException -> 0x094e }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ RemoteException -> 0x094e }
            X.AnonymousClass000.A1Q(r2, r8, r3)     // Catch:{ RemoteException -> 0x094e }
            r2[r0] = r5     // Catch:{ RemoteException -> 0x094e }
            java.lang.String r1 = "id [%d]: streamLatencyMode %d"
            X.7t5 r3 = X.C151857Wo.A01(r7, r1, r2, r3)     // Catch:{ RemoteException -> 0x094e }
            if (r3 != 0) goto L_0x093a
            java.lang.String r2 = "Fail to streamLatencyMode to : %d"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x094e }
        L_0x0934:
            r1[r8] = r5     // Catch:{ RemoteException -> 0x094e }
            r6.A0J(r2, r1)     // Catch:{ RemoteException -> 0x094e }
            goto L_0x094d
        L_0x093a:
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ RemoteException -> 0x094e }
            java.lang.String r1 = "Enable stream latency toggle"
            r3.A0K(r1, r2)     // Catch:{ RemoteException -> 0x094e }
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x094e }
            r1 = 31
            X.C162987t5.A01(r2, r3, r5, r1)     // Catch:{ RemoteException -> 0x094e }
            java.lang.String r2 = "streamLatencyMode successfully to : %d"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x094e }
            goto L_0x0934
        L_0x094d:
            return r0
        L_0x094e:
            r3 = move-exception
            java.lang.String r2 = "Error occurs while setting streamLatencyMode the video"
            goto L_0x09eb
        L_0x0953:
            X.7ks r1 = r7.A0D
            r1.A09 = r0
            r1.A07 = r0
            return r0
        L_0x095a:
            X.7ks r4 = r7.A0D
            java.lang.Object r9 = r1.obj
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r7 = r9.booleanValue()
            X.7t6 r6 = r4.A0B
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r3[r8] = r9
            java.lang.String r1 = "enableWakeLock: %s"
            r6.A0J(r1, r3)
            X.7l9 r5 = r4.A02()     // Catch:{ RemoteException -> 0x0998 }
            long r3 = r6.A0O     // Catch:{ RemoteException -> 0x0998 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ RemoteException -> 0x0998 }
            X.AnonymousClass000.A1Q(r2, r8, r3)     // Catch:{ RemoteException -> 0x0998 }
            X.AnonymousClass000.A1P(r2, r7, r0)     // Catch:{ RemoteException -> 0x0998 }
            java.lang.String r1 = "id [%d]: enableWakeLock %d"
            X.7t5 r1 = X.C151857Wo.A01(r5, r1, r2, r3)     // Catch:{ RemoteException -> 0x0998 }
            if (r1 != 0) goto L_0x098f
            java.lang.String r2 = "Fail to enableWakeLock to : %s"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0998 }
        L_0x0989:
            r1[r8] = r9     // Catch:{ RemoteException -> 0x0998 }
            r6.A0J(r2, r1)     // Catch:{ RemoteException -> 0x0998 }
            goto L_0x0997
        L_0x098f:
            r1.A0L(r7)     // Catch:{ RemoteException -> 0x0998 }
            java.lang.String r2 = "enableWakeLock successfully to : %s"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0998 }
            goto L_0x0989
        L_0x0997:
            return r0
        L_0x0998:
            r3 = move-exception
            java.lang.String r2 = "Error occurs while setting enableWakeLock to the video"
            goto L_0x09eb
        L_0x099c:
            X.7ks r4 = r7.A0D
            java.lang.Object r5 = r1.obj
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r9 = r5.booleanValue()
            X.7t6 r6 = r4.A0B
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r3[r8] = r5
            java.lang.String r1 = "convert stereo to mono: %s"
            r6.A0J(r1, r3)
            X.7l9 r7 = r4.A02()     // Catch:{ RemoteException -> 0x09e8 }
            long r3 = r6.A0O     // Catch:{ RemoteException -> 0x09e8 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ RemoteException -> 0x09e8 }
            X.AnonymousClass000.A1Q(r2, r8, r3)     // Catch:{ RemoteException -> 0x09e8 }
            r2[r0] = r5     // Catch:{ RemoteException -> 0x09e8 }
            java.lang.String r1 = "id [%d]: convertStereoToMono %s"
            X.7t5 r4 = X.C151857Wo.A01(r7, r1, r2, r3)     // Catch:{ RemoteException -> 0x09e8 }
            if (r4 != 0) goto L_0x09d0
            java.lang.String r2 = "Fail to convertStereoToMono to : %s"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x09e8 }
        L_0x09ca:
            r1[r8] = r5     // Catch:{ RemoteException -> 0x09e8 }
            r6.A0J(r2, r1)     // Catch:{ RemoteException -> 0x09e8 }
            goto L_0x09e7
        L_0x09d0:
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ RemoteException -> 0x09e8 }
            java.lang.String r1 = "convertStereoToMono"
            r4.A0K(r1, r2)     // Catch:{ RemoteException -> 0x09e8 }
            android.os.Handler r3 = r4.A0l     // Catch:{ RemoteException -> 0x09e8 }
            r2 = 32
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)     // Catch:{ RemoteException -> 0x09e8 }
            X.C162987t5.A01(r3, r4, r1, r2)     // Catch:{ RemoteException -> 0x09e8 }
            java.lang.String r2 = "convert Stereo to Mono successfully to : %s"
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x09e8 }
            goto L_0x09ca
        L_0x09e7:
            return r0
        L_0x09e8:
            r3 = move-exception
            java.lang.String r2 = "Error occurs while setting shouldConvertStereoToMono to the video"
        L_0x09eb:
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r6.A0I(r2, r3, r1)
            return r0
        L_0x09f1:
            X.7ks r7 = r7.A0D
            java.lang.Object r1 = r1.obj
            long r10 = X.C18310x6.A0B(r1)
            X.7t6 r9 = r7.A0B     // Catch:{ RemoteException -> 0x0a35 }
            long r3 = r9.A0O     // Catch:{ RemoteException -> 0x0a35 }
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1S(r1)     // Catch:{ RemoteException -> 0x0a35 }
            if (r1 != 0) goto L_0x0a0d
            java.lang.String r1 = "Before onBeforeRender(), service player was evicted. Skip it"
            X.AnonymousClass6C8.A0z(r9, r1)     // Catch:{ RemoteException -> 0x0a35 }
            return r0
        L_0x0a0d:
            X.7l9 r6 = r7.A02()     // Catch:{ RemoteException -> 0x0a35 }
            long r3 = r9.A0O     // Catch:{ RemoteException -> 0x0a35 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ RemoteException -> 0x0a35 }
            X.AnonymousClass000.A1Q(r2, r8, r3)     // Catch:{ RemoteException -> 0x0a35 }
            java.lang.Long r5 = java.lang.Long.valueOf(r10)     // Catch:{ RemoteException -> 0x0a35 }
            r2[r0] = r5     // Catch:{ RemoteException -> 0x0a35 }
            java.lang.String r1 = "id [%d]: onBeforeRender %d"
            X.7t5 r3 = X.C151857Wo.A01(r6, r1, r2, r3)     // Catch:{ RemoteException -> 0x0a35 }
            if (r3 == 0) goto L_0x0c9f
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ RemoteException -> 0x0a35 }
            java.lang.String r1 = "onBeforeRender"
            r3.A0K(r1, r2)     // Catch:{ RemoteException -> 0x0a35 }
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x0a35 }
            r1 = 35
            X.C162987t5.A01(r2, r3, r5, r1)     // Catch:{ RemoteException -> 0x0a35 }
            return r0
        L_0x0a35:
            r4 = move-exception
            X.7t6 r3 = r7.A0B
            java.lang.String r2 = "Error occurs while set onBeforeRender"
            goto L_0x0d3f
        L_0x0a3c:
            X.7ks r7 = r7.A0D
            java.lang.Object r1 = r1.obj
            boolean r10 = X.AnonymousClass001.A1Z(r1)
            X.7t6 r9 = r7.A0B     // Catch:{ RemoteException -> 0x0a80 }
            long r3 = r9.A0O     // Catch:{ RemoteException -> 0x0a80 }
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1S(r1)     // Catch:{ RemoteException -> 0x0a80 }
            if (r1 != 0) goto L_0x0a58
            java.lang.String r1 = "Before onRender(), service player was evicted. Skip it"
            X.AnonymousClass6C8.A0z(r9, r1)     // Catch:{ RemoteException -> 0x0a80 }
            return r0
        L_0x0a58:
            X.7l9 r6 = r7.A02()     // Catch:{ RemoteException -> 0x0a80 }
            long r3 = r9.A0O     // Catch:{ RemoteException -> 0x0a80 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ RemoteException -> 0x0a80 }
            X.AnonymousClass000.A1Q(r2, r8, r3)     // Catch:{ RemoteException -> 0x0a80 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r10)     // Catch:{ RemoteException -> 0x0a80 }
            r2[r0] = r5     // Catch:{ RemoteException -> 0x0a80 }
            java.lang.String r1 = "id [%d]: onRender %b"
            X.7t5 r3 = X.C151857Wo.A01(r6, r1, r2, r3)     // Catch:{ RemoteException -> 0x0a80 }
            if (r3 == 0) goto L_0x0c9f
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ RemoteException -> 0x0a80 }
            java.lang.String r1 = "onRender"
            r3.A0K(r1, r2)     // Catch:{ RemoteException -> 0x0a80 }
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x0a80 }
            r1 = 36
            X.C162987t5.A01(r2, r3, r5, r1)     // Catch:{ RemoteException -> 0x0a80 }
            return r0
        L_0x0a80:
            r4 = move-exception
            X.7t6 r3 = r7.A0B
            java.lang.String r2 = "Error occurs while set onRender "
            goto L_0x0d3f
        L_0x0a87:
            X.7ks r6 = r7.A0D
            X.7t6 r9 = r6.A0B     // Catch:{ RemoteException -> 0x0ac6 }
            long r2 = r9.A0O     // Catch:{ RemoteException -> 0x0ac6 }
            r4 = 0
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1S(r1)     // Catch:{ RemoteException -> 0x0ac6 }
            if (r1 != 0) goto L_0x0a9d
            java.lang.String r1 = "Before stop(), service player was evicted. Skip it"
            X.AnonymousClass6C8.A0z(r9, r1)     // Catch:{ RemoteException -> 0x0ac6 }
            goto L_0x0ad0
        L_0x0a9d:
            X.7l9 r5 = r6.A02()     // Catch:{ RemoteException -> 0x0ac6 }
            long r2 = r9.A0O     // Catch:{ RemoteException -> 0x0ac6 }
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0ac6 }
            X.AnonymousClass000.A1Q(r4, r8, r2)     // Catch:{ RemoteException -> 0x0ac6 }
            java.lang.String r1 = "id [%d]: stop"
            X.7t5 r3 = X.C151857Wo.A01(r5, r1, r4, r2)     // Catch:{ RemoteException -> 0x0ac6 }
            if (r3 == 0) goto L_0x0ad0
            monitor-enter(r3)     // Catch:{ RemoteException -> 0x0ac6 }
            java.lang.String r1 = "Stop player"
            X.C162987t5.A02(r3, r1, r8)     // Catch:{ all -> 0x0ac3 }
            android.os.Handler r2 = r3.A0l     // Catch:{ all -> 0x0ac3 }
            r1 = 41
            android.os.Message r1 = r2.obtainMessage(r1)     // Catch:{ all -> 0x0ac3 }
            r3.A0G(r1)     // Catch:{ all -> 0x0ac3 }
            monitor-exit(r3)     // Catch:{ RemoteException -> 0x0ac6 }
            goto L_0x0ad0
        L_0x0ac3:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ RemoteException -> 0x0ac6 }
            throw r1     // Catch:{ RemoteException -> 0x0ac6 }
        L_0x0ac6:
            r4 = move-exception
            X.7t6 r3 = r6.A0B
            java.lang.String r2 = "Error occurs while stop player"
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r3.A0I(r2, r4, r1)
        L_0x0ad0:
            X.7Sl r2 = r7.A02
            java.lang.String r1 = "stop"
            goto L_0x0c9c
        L_0x0ad6:
            X.7ks r5 = r7.A0D
            java.lang.Object r1 = r1.obj
            boolean r7 = X.AnonymousClass001.A1Z(r1)
            X.7t6 r11 = r5.A0B     // Catch:{ RemoteException -> 0x0d34 }
            long r3 = r11.A0O     // Catch:{ RemoteException -> 0x0d34 }
            r9 = 0
            int r1 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1S(r1)     // Catch:{ RemoteException -> 0x0d34 }
            if (r1 != 0) goto L_0x0af2
            java.lang.String r1 = "Before enableSR(), service player was evicted. Skip it"
            X.AnonymousClass6C8.A0z(r11, r1)     // Catch:{ RemoteException -> 0x0d34 }
            return r0
        L_0x0af2:
            X.7l9 r6 = r5.A02()     // Catch:{ RemoteException -> 0x0d34 }
            long r3 = r11.A0O     // Catch:{ RemoteException -> 0x0d34 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ RemoteException -> 0x0d34 }
            X.AnonymousClass000.A1Q(r2, r8, r3)     // Catch:{ RemoteException -> 0x0d34 }
            X.AnonymousClass000.A1P(r2, r7, r0)     // Catch:{ RemoteException -> 0x0d34 }
            java.lang.String r1 = "id [%d]: enableSR %d"
            X.7t5 r4 = X.C151857Wo.A01(r6, r1, r2, r3)     // Catch:{ RemoteException -> 0x0d34 }
            if (r4 == 0) goto L_0x0c9f
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ RemoteException -> 0x0d34 }
            java.lang.String r1 = "Enabling SR: "
            java.lang.String r1 = X.AnonymousClass000.A0b(r1, r2, r7)     // Catch:{ RemoteException -> 0x0d34 }
            X.C162987t5.A02(r4, r1, r8)     // Catch:{ RemoteException -> 0x0d34 }
            android.os.Handler r3 = r4.A0l     // Catch:{ RemoteException -> 0x0d34 }
            r2 = 43
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)     // Catch:{ RemoteException -> 0x0d34 }
            X.C162987t5.A01(r3, r4, r1, r2)     // Catch:{ RemoteException -> 0x0d34 }
            return r0
        L_0x0b21:
            java.lang.Object r1 = r1.obj
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            X.7ks r6 = r7.A0D
            r1 = r1[r0]
            boolean r11 = X.AnonymousClass001.A1Z(r1)
            X.7t6 r7 = r6.A0B     // Catch:{ RemoteException -> 0x0b5a }
            long r3 = r7.A0O     // Catch:{ RemoteException -> 0x0b5a }
            r9 = 0
            int r1 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1S(r1)     // Catch:{ RemoteException -> 0x0b5a }
            if (r1 != 0) goto L_0x0b41
            java.lang.String r1 = "Before reconfigureVrPlayer, service player was evicted. Skip it"
            X.AnonymousClass6C8.A0z(r7, r1)     // Catch:{ RemoteException -> 0x0b5a }
            return r0
        L_0x0b41:
            X.7l9 r5 = r6.A02()     // Catch:{ RemoteException -> 0x0b5a }
            long r3 = r7.A0O     // Catch:{ RemoteException -> 0x0b5a }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ RemoteException -> 0x0b5a }
            X.AnonymousClass000.A1Q(r2, r8, r3)     // Catch:{ RemoteException -> 0x0b5a }
            X.AnonymousClass000.A1P(r2, r11, r0)     // Catch:{ RemoteException -> 0x0b5a }
            java.lang.String r1 = "id [%d]: reconfigureVrPlayer %d"
            X.C159597m9.A02(r1, r2)     // Catch:{ RemoteException -> 0x0b5a }
            X.7Wo r1 = r5.A0V     // Catch:{ RemoteException -> 0x0b5a }
            r1.A02(r3)     // Catch:{ RemoteException -> 0x0b5a }
            return r0
        L_0x0b5a:
            r4 = move-exception
            X.7t6 r3 = r6.A0B
            java.lang.String r2 = "Error occurs while reconfigureVrPlayer "
            goto L_0x0d3f
        L_0x0b61:
            java.lang.Object r9 = r1.obj
            X.7ks r7 = r7.A0D
            X.7t6 r6 = r7.A0B     // Catch:{ RemoteException -> 0x0d3a }
            long r4 = r6.A0O     // Catch:{ RemoteException -> 0x0d3a }
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1S(r1)     // Catch:{ RemoteException -> 0x0d3a }
            if (r1 != 0) goto L_0x0b79
            java.lang.String r1 = "Before addExoPlayerListener, service player was evicted. Skip it"
            X.AnonymousClass6C8.A0z(r6, r1)     // Catch:{ RemoteException -> 0x0d3a }
            return r0
        L_0x0b79:
            X.7t5 r3 = X.C151857Wo.A00(r7, r6)     // Catch:{ RemoteException -> 0x0d3a }
            if (r3 == 0) goto L_0x0c9f
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x0d3a }
            r1 = 45
            X.C162987t5.A01(r2, r3, r9, r1)     // Catch:{ RemoteException -> 0x0d3a }
            return r0
        L_0x0b87:
            java.lang.Object r9 = r1.obj
            X.7ks r7 = r7.A0D
            X.7t6 r6 = r7.A0B     // Catch:{ RemoteException -> 0x0d3a }
            long r4 = r6.A0O     // Catch:{ RemoteException -> 0x0d3a }
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1S(r1)     // Catch:{ RemoteException -> 0x0d3a }
            if (r1 != 0) goto L_0x0b9f
            java.lang.String r1 = "Before addExoPlayerListener, service player was evicted. Skip it"
            X.AnonymousClass6C8.A0z(r6, r1)     // Catch:{ RemoteException -> 0x0d3a }
            return r0
        L_0x0b9f:
            X.7t5 r3 = X.C151857Wo.A00(r7, r6)     // Catch:{ RemoteException -> 0x0d3a }
            if (r3 == 0) goto L_0x0c9f
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x0d3a }
            r1 = 46
            X.C162987t5.A01(r2, r3, r9, r1)     // Catch:{ RemoteException -> 0x0d3a }
            return r0
        L_0x0bad:
            java.lang.Object r3 = r1.obj
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            X.7ks r7 = r7.A0D
            r1 = r3[r8]
            int r11 = X.AnonymousClass001.A0K(r1)
            r1 = r3[r0]
            long r3 = X.C18310x6.A0B(r1)
            X.7t6 r12 = r7.A0B     // Catch:{ RemoteException -> 0x0be3 }
            long r5 = r12.A0O     // Catch:{ RemoteException -> 0x0be3 }
            r9 = 0
            int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1S(r1)     // Catch:{ RemoteException -> 0x0be3 }
            if (r1 == 0) goto L_0x0c9f
            X.7t5 r6 = X.C151857Wo.A00(r7, r12)     // Catch:{ RemoteException -> 0x0be3 }
            if (r6 == 0) goto L_0x0c9f
            android.os.Handler r5 = r6.A0l     // Catch:{ RemoteException -> 0x0be3 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ RemoteException -> 0x0be3 }
            X.AnonymousClass000.A1P(r2, r11, r8)     // Catch:{ RemoteException -> 0x0be3 }
            X.AnonymousClass000.A1Q(r2, r0, r3)     // Catch:{ RemoteException -> 0x0be3 }
            r1 = 49
            X.C162987t5.A01(r5, r6, r2, r1)     // Catch:{ RemoteException -> 0x0be3 }
            return r0
        L_0x0be3:
            r4 = move-exception
            X.7t6 r3 = r7.A0B
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r1 = "Error occurs while seek to default position"
            goto L_0x0c11
        L_0x0beb:
            X.7ks r9 = r7.A0D
            java.lang.Object r1 = r1.obj
            boolean r7 = X.AnonymousClass001.A1Z(r1)
            X.7t6 r6 = r9.A0B     // Catch:{ RemoteException -> 0x0c0a }
            long r4 = r6.A0O     // Catch:{ RemoteException -> 0x0c0a }
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1S(r1)     // Catch:{ RemoteException -> 0x0c0a }
            if (r1 == 0) goto L_0x0c9f
            X.7t5 r1 = X.C151857Wo.A00(r9, r6)     // Catch:{ RemoteException -> 0x0c0a }
            if (r1 == 0) goto L_0x0c9f
            r1.A0j = r7     // Catch:{ RemoteException -> 0x0c0a }
            return r0
        L_0x0c0a:
            r4 = move-exception
            X.7t6 r3 = r9.A0B
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r1 = "Error occurs while apply shouldresetposition"
        L_0x0c11:
            r3.A0I(r1, r4, r2)
            return r0
        L_0x0c15:
            X.7ks r1 = r7.A0D
            r1.A04()     // Catch:{ RemoteException -> 0x0c1b }
            goto L_0x0c21
        L_0x0c1b:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C18330xA.A09(r0)
            throw r0
        L_0x0c21:
            return r0
        L_0x0c22:
            X.7ks r5 = r7.A0D
            X.7t6 r4 = r5.A0B     // Catch:{ RemoteException -> 0x0d34 }
            long r6 = r4.A0O     // Catch:{ RemoteException -> 0x0d34 }
            r2 = 0
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1S(r1)     // Catch:{ RemoteException -> 0x0d34 }
            if (r1 != 0) goto L_0x0c38
            java.lang.String r1 = "Before stopExo(), service player was evicted. Skip it"
            X.AnonymousClass6C8.A0z(r4, r1)     // Catch:{ RemoteException -> 0x0d34 }
            return r0
        L_0x0c38:
            X.7t5 r3 = X.C151857Wo.A00(r5, r4)     // Catch:{ RemoteException -> 0x0d34 }
            if (r3 == 0) goto L_0x0c9f
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x0d34 }
            r1 = 50
            android.os.Message r1 = r2.obtainMessage(r1)     // Catch:{ RemoteException -> 0x0d34 }
            r3.A0G(r1)     // Catch:{ RemoteException -> 0x0d34 }
            return r0
        L_0x0c4a:
            X.7ks r5 = r7.A0D
            X.7t6 r4 = r5.A0B     // Catch:{ RemoteException -> 0x0d34 }
            long r6 = r4.A0O     // Catch:{ RemoteException -> 0x0d34 }
            r2 = 0
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1S(r1)     // Catch:{ RemoteException -> 0x0d34 }
            if (r1 != 0) goto L_0x0c60
            java.lang.String r1 = "Before resetforreuse(), service player was evicted. Skip it"
            X.AnonymousClass6C8.A0z(r4, r1)     // Catch:{ RemoteException -> 0x0d34 }
            return r0
        L_0x0c60:
            X.7t5 r3 = X.C151857Wo.A00(r5, r4)     // Catch:{ RemoteException -> 0x0d34 }
            if (r3 == 0) goto L_0x0c9f
            android.os.Handler r2 = r3.A0l     // Catch:{ RemoteException -> 0x0d34 }
            r1 = 51
            android.os.Message r1 = r2.obtainMessage(r1)     // Catch:{ RemoteException -> 0x0d34 }
            r3.A0G(r1)     // Catch:{ RemoteException -> 0x0d34 }
            return r0
        L_0x0c72:
            java.lang.Object r2 = r1.obj
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            X.7ks r9 = r7.A0D
            r1 = r2[r8]
            boolean r14 = X.AnonymousClass001.A1Z(r1)
            r1 = r2[r0]
            android.graphics.SurfaceTexture r1 = (android.graphics.SurfaceTexture) r1
            X.7t6 r6 = r9.A0B
            long r4 = r6.A0O
            r2 = 0
            int r10 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            boolean r4 = X.AnonymousClass000.A1S(r10)
            if (r4 != 0) goto L_0x0ca0
            java.lang.String r1 = "Before pause(), service player was evicted. Lazy recover at next play()"
            X.AnonymousClass6C8.A0z(r6, r1)
        L_0x0c95:
            r9.A06()
        L_0x0c98:
            X.7Sl r2 = r7.A02
            java.lang.String r1 = "pauseAndMoveToWarmupPool"
        L_0x0c9c:
            r2.A00(r1)
        L_0x0c9f:
            return r0
        L_0x0ca0:
            X.7Fk r5 = r6.A03
            X.7l9 r11 = r5.A00
            if (r11 != 0) goto L_0x0cae
            X.7Ao r4 = r5.A01
            X.7l9 r11 = r4.A00
            r5.A00 = r11
            if (r11 == 0) goto L_0x0d26
        L_0x0cae:
            long r4 = r6.A0O
            java.lang.Object[] r12 = new java.lang.Object[r0]
            X.AnonymousClass000.A1Q(r12, r8, r4)
            java.lang.String r10 = "id [%d]: pauseAndMoveToWarmup"
            X.7t5 r13 = X.C151857Wo.A01(r11, r10, r12, r4)
            if (r13 == 0) goto L_0x0d2d
            X.7a6 r10 = r13.A10
            android.view.Surface r12 = r13.A0H
            if (r10 == 0) goto L_0x0d2d
            if (r12 == 0) goto L_0x0d2d
            java.lang.Object[] r5 = new java.lang.Object[r8]
            java.lang.String r4 = "moveToWarmup"
            r13.A0K(r4, r5)
            android.os.Handler r8 = r13.A0l
            r5 = 42
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r14)
            X.C162987t5.A01(r8, r13, r4, r5)
            X.7hG r14 = r11.A0E
            long r4 = r13.A0k
            X.8LG r11 = r14.A04
            java.lang.String r13 = X.C156817hG.A00(r10, r11)
            X.7JN r8 = new X.7JN
            r8.<init>(r13, r4)
            X.7Fi r4 = new X.7Fi
            r4.<init>(r1, r12)
            r8.A00 = r4
            android.util.LruCache r13 = r14.A01
            int r4 = r13.size()
            int r1 = r13.maxSize()
            if (r4 != r1) goto L_0x0d1f
            java.util.Map r1 = r13.snapshot()
            java.util.Iterator r4 = X.AnonymousClass000.A0q(r1)
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0d1f
            java.util.Map$Entry r12 = X.AnonymousClass001.A0w(r4)
            java.lang.Object r1 = r12.getKey()
            r13.remove(r1)
            android.util.LruCache r5 = r14.A02
            java.lang.Object r4 = r12.getKey()
            java.lang.Object r1 = r12.getValue()
            r5.put(r4, r1)
        L_0x0d1f:
            java.lang.String r1 = X.C156817hG.A00(r10, r11)
            r13.put(r1, r8)
        L_0x0d26:
            r9.A07()
            r6.A0O = r2
            goto L_0x0c98
        L_0x0d2d:
            java.lang.String r1 = "When pause(), service player is noticed to be evicted earlier. Lazy recover at next play()"
            X.C158967ks.A00(r9, r6, r1)
            goto L_0x0c95
        L_0x0d34:
            r4 = move-exception
            X.7t6 r3 = r5.A0B
            java.lang.String r2 = "Error occurs while set enableSR "
            goto L_0x0d3f
        L_0x0d3a:
            r4 = move-exception
            X.7t6 r3 = r7.A0B
            java.lang.String r2 = "Error occurs while addExoplayerListener"
        L_0x0d3f:
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r3.A0I(r2, r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162997t6.handleMessage(android.os.Message):boolean");
    }

    public long A03() {
        long j = AnonymousClass6C8.A0W(this).A0X;
        if (j < 0) {
            return -1;
        }
        return j;
    }

    public void A08() {
        A0J("release", AnonymousClass4L0.A0U());
        Handler handler = this.A0C;
        handler.sendMessage(handler.obtainMessage(8));
    }

    public void A0A() {
        A0J("stop", AnonymousClass4L0.A0U());
        Handler handler = this.A0C;
        handler.sendMessage(handler.obtainMessage(37));
    }

    public void A0D(Surface surface) {
        Object[] A0L2 = AnonymousClass002.A0L();
        AnonymousClass000.A1P(A0L2, AnonymousClass000.A07(surface), 0);
        A0J("setSurface %x", A0L2);
        AnonymousClass6C7.A10(this.A0C, surface, 6);
        A0X.add(surface);
    }

    public final void A0F(C142876xw r8, C142846xt r9, String str, String str2, Throwable th) {
        C147697Fh r1;
        A0I(str, th, AnonymousClass4L0.A0U());
        if (this.A05.logStallOnPauseOnError) {
            r1 = A05();
        } else {
            r1 = null;
        }
        AnonymousClass85C r0 = this.A0E;
        C166537yr A0W2 = AnonymousClass6C8.A0W(this);
        r0.BYD(r1, new C160117n4(r8, r9, str, ""), AnonymousClass6CA.A0L(this), A0W2, str2, "");
    }

    public void A0K(boolean z) {
        Object[] A0L2 = AnonymousClass002.A0L();
        Boolean valueOf = Boolean.valueOf(z);
        A0L2[0] = valueOf;
        A0J("setLooping: %s", A0L2);
        AnonymousClass6C7.A10(this.A0C, valueOf, 19);
    }

    public C162997t6(Looper looper, C186538vW r8, C159117l9 r9, AnonymousClass8LG r10) {
        Handler handler = new Handler(looper);
        this.A0D = new C158967ks(this);
        this.A0F = AnonymousClass002.A0D();
        this.A0K = new long[]{0, 0};
        this.A08 = new AtomicReference(new C166537yr());
        this.A0J = new AtomicReference(C166427yf.A0D);
        this.A0H = AnonymousClass0x9.A18();
        this.A0I = new TreeMap();
        this.A06 = "";
        this.A01 = -1;
        this.A09 = false;
        this.A0O = 0;
        this.A0L = 1.0f;
        this.A00 = -1;
        this.A07 = AnonymousClass001.A0s();
        this.A0G = AnonymousClass002.A0D();
        this.A0A = false;
        AnonymousClass6C8.A0z(this, "Create HeroPlayer");
        this.A0C = new Handler(looper, this);
        this.A0E = new AnonymousClass85C(handler, r8);
        this.A03 = new C147727Fk(new C146517Ao(r9));
        this.A05 = r10;
        this.A09 |= r10.enableDebugLogs;
        this.A04 = new AnonymousClass85K(this);
        this.A02 = new C150847Sl(r10.enablePlayerActionStateLoggingInFlytrap);
        this.A0D.A06 = r9;
    }
}
