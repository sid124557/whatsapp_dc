package X;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import com.facebook.debug.tracer.Tracer;
import com.facebook.exoplayer.monitor.VpsEventCallback;
import java.io.File;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0Xd  reason: invalid class name */
public class AnonymousClass0Xd {
    public static final String A0G;
    public int A00;
    public C187468xG A01;
    public AnonymousClass0MW A02;
    public C10030h9 A03;
    public C10040hA A04;
    public C09860gs A05;
    public AnonymousClass0N5 A06;
    public C126346Nm A07;
    public boolean A08 = false;
    public final Context A09;
    public final Handler A0A;
    public final C16820u1 A0B;
    public final C161397pY A0C;
    public final AnonymousClass8LG A0D;
    public final Map A0E;
    public final Map A0F;

    public synchronized C187478xH A08() {
        C187478xH r0;
        AnonymousClass8LG r1 = this.A0D;
        if (r1.enableVideoHybridCache) {
            if (this.A03 == null) {
                A0B();
            }
            r0 = this.A03;
        } else if (r1.enableVideoMemoryCache) {
            if (this.A04 == null) {
                A0B();
            }
            r0 = this.A04;
        } else {
            if (this.A07 == null) {
                A0B();
            }
            r0 = this.A07;
        }
        return r0;
    }

    public boolean A0E(Uri uri, String str, long j, boolean z, boolean z2) {
        C09860gs r0;
        C187478xH A082 = A08();
        AnonymousClass8LG r1 = this.A0D;
        String str2 = str;
        if (r1.enableCacheLookUp && r1.usePerVideoLookupToCheckCache && (r0 = this.A05) != null) {
            r0.A00(str2);
        }
        if (A082 == null) {
            return false;
        }
        String A002 = C161157p6.A00(uri, (String) null, str2, z, r1.useShortKey, z2, r1.splitLastSegmentCachekey, r1.skipThumbnailCacheKey);
        long j2 = j;
        if (r1.useIsCachedSkipInit) {
            return A082.BH9(A002, 0, j2);
        }
        return A082.BH8(A002, 0, j2);
    }

    public static AnonymousClass0N5 A01() {
        return new AnonymousClass0N5(C186588vc.A00);
    }

    public final long A04() {
        return this.A0D.cache.timeToLiveEvictionIntervalForegroundMs;
    }

    public final AnonymousClass0LZ A06(VpsEventCallback vpsEventCallback) {
        if (!this.A0D.enableExcessiveNumUriRedirectLogging) {
            return null;
        }
        return new AnonymousClass0LZ(vpsEventCallback, this);
    }

    public final C09890gv A07(C187448xE r24, C1677182f r25, C142866xv r26, C160777oI r27, AtomicBoolean atomicBoolean, boolean z, boolean z2) {
        int i;
        long j;
        C160777oI r9 = r27;
        String A052 = r9.A05();
        if (A052 == null || A052.equals("") || A052.equals("0")) {
            Log.e(A0G, String.format("Invalid videoId is %s", AnonymousClass000.A1b(A052)));
        }
        Map map = this.A0F;
        if (map.containsKey("prefetch.block_on_same_cache_key_timeout_ms")) {
            i = A00("prefetch.block_on_same_cache_key_timeout_ms", map);
        } else {
            i = 8000;
        }
        if (map.containsKey("prefetch.prefetch_max_cache_file_size")) {
            j = Long.parseLong((String) map.get("prefetch.prefetch_max_cache_file_size"));
        } else {
            j = 102400;
        }
        AnonymousClass8LG r10 = this.A0D;
        boolean z3 = r10.reduceMemoryDataSinkMemorySpike;
        boolean z4 = r10.abrSetting.hashUrlForUnique;
        return new C09890gv(r24, r25, this, r26, r9, r10, atomicBoolean, i, j, r10.minCacheFileSizeForDynamicChunkingInBytes, z, z3, z4, z2, r10.enableDynamicPrefetchCacheFileSize, r10.enableDynamicPrefetchCacheFileSizePrefetchOnly);
    }

    public void A09() {
        if (this.A02 == null) {
            A0C();
        }
        File A0B2 = AnonymousClass002.A0B(AnonymousClass000.A0T(this.A02.A01, "/ExoPlayerCacheDir/videocache"));
        if (!A0B2.exists()) {
            A0B2.mkdirs();
        }
    }

    public final void A0B() {
        Tracer.A01("CacheManager.initCache");
        try {
            if (this.A02 == null) {
                A0C();
            }
            AnonymousClass8LG r12 = this.A0D;
            if (r12.enableVideoMemoryCache) {
                this.A04 = new C10040hA(r12.videoMemoryCacheSizeKb);
            } else {
                A09();
                File A0B2 = AnonymousClass002.A0B(AnonymousClass000.A0T(this.A02.A01, "/ExoPlayerCacheDir/videocache"));
                C187468xG r32 = this.A01;
                Handler handler = this.A0A;
                AnonymousClass8Kz r1 = r12.cache;
                boolean z = r1.skipCacheBeforeInited;
                boolean z2 = r1.skipEscapeCacheKey;
                boolean z3 = r1.skipRegex;
                boolean z4 = r1.cacheFileSizeCall;
                boolean z5 = r1.fixReadWriteBlock;
                boolean z6 = r1.enableShardCachedFiles;
                int i = r1.numSubDirectory;
                long j = r1.skipDeadSpanLockThresholdMs;
                boolean z7 = r1.useSimpleCacheLoadV2;
                Handler handler2 = handler;
                C187468xG r17 = r32;
                this.A07 = new C126346Nm(handler2, r17, A0B2, i, j, r1.minCacheFileSizeInBytes, z, r1.bypassUpgrade, z2, z3, z4, z5, z6, z7);
                AnonymousClass8Kz r13 = r12.cache;
                if (r13.enableCacheInstrumentation || r13.enableOnlyCacheEvictionInstrumentation || r13.enableUtilisationInstrumentation) {
                    A0D();
                }
                if (r12.enableCacheLookUp) {
                    C09860gs r14 = new C09860gs();
                    this.A05 = r14;
                    this.A07.AwN(r14);
                }
                Map map = this.A0F;
                boolean z8 = false;
                if (map.containsKey("dummy_default_setting") && A00("dummy_default_setting", map) != 0) {
                    z8 = true;
                }
                if (!z8) {
                    this.A0B.B2p(new C126386Nr("", "CACHE", "USE_DEFAULT_CACHE_SETTING", "using default exp settings"));
                }
                if (!r12.dummyDefaultSetting) {
                    this.A0B.B2p(new C126386Nr("", "CACHE", "USE_DEFAULT_CACHE_SETTING", "using default exp settings"));
                }
                if (r12.cache.timeToLiveMs > 0) {
                    handler.postDelayed(new C11280jO(this), 3000);
                }
                if (r12.enableVideoHybridCache) {
                    C10040hA r2 = new C10040hA(r12.videoMemoryCacheSizeKb);
                    this.A04 = r2;
                    this.A03 = new C10030h9(r2, this.A07);
                }
            }
            C161157p6.A01(A0G, "CacheInitialized", new Object[0]);
            Tracer.A00();
        } catch (Throwable th) {
            Tracer.A00();
            throw th;
        }
    }

    public final void A0C() {
        C187468xG r2;
        AnonymousClass8LG r22 = this.A0D;
        AnonymousClass8Kz r1 = r22.cache;
        String str = r1.cacheDirectory;
        if (str == null) {
            str = this.A09.getFilesDir().toString();
        }
        AnonymousClass0MW r3 = new AnonymousClass0MW(str, r1.cacheSizeInBytes, r1.useFbLruCacheEvictor, r1.usePerVideoLruProtectPrefetchCacheEvictor, r1.usePerVideoLruCache);
        this.A02 = r3;
        int i = r3.A00;
        this.A00 = i;
        if (r3.A04) {
            AnonymousClass8Kz r0 = r22.cache;
            int i2 = r0.perVideoLRUMinOffset;
            double d = r0.perVideoLRUMaxPercent;
            int i3 = r0.protectPrefetchCacheMinOffset;
            r2 = new C13480nF(d, r0.protectPrefetchCacheMaxPercent, i2, i3, (long) i, r0.perVideoLruProtectPrefetchCacheConcurrentFix);
        } else if (r3.A03) {
            AnonymousClass8Kz r02 = r22.cache;
            int i4 = r02.perVideoLRUMinOffset;
            r2 = new C13470nE(r02.perVideoLRUMaxPercent, i4, (long) i);
        } else {
            r2 = new AnonymousClass8NT((long) i);
        }
        this.A01 = r2;
        if (this.A02.A02) {
            this.A01 = new C09850gr(r2, this, this.A0B);
        }
    }

    public final void A0D() {
        Tracer.A01("CacheManager.initializeCacheInstrumentation");
        try {
            C09870gt A002 = C09870gt.A00();
            C126346Nm r4 = this.A07;
            C16820u1 r3 = this.A0B;
            Handler handler = this.A0A;
            AnonymousClass8Kz r0 = this.A0D.cache;
            A002.A01(handler, r3, r4, r0.cacheInstrumentationEventBatchPeriodS, r0.enableOnlyCacheEvictionInstrumentation);
        } finally {
            Tracer.A00();
        }
    }

    static {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(AnonymousClass0Xd.class.getSimpleName());
        A0G = AnonymousClass000.A0X("_default", A0o);
    }

    public AnonymousClass0Xd(Context context, Handler handler, C16820u1 r4, C161397pY r5, AnonymousClass8LG r6, Map map) {
        try {
            this.A0F = map;
            this.A0D = r6;
            this.A0C = r5;
            this.A0B = r4;
            this.A0E = new WeakHashMap();
            this.A09 = context;
            this.A0A = handler;
            if (!r6.cache.delayInitCache) {
                A0B();
            }
        } finally {
            C153827c5.A00();
        }
    }

    public static int A00(Object obj, Map map) {
        return Integer.parseInt((String) map.get(obj));
    }

    public void A0A() {
        C187478xH A082 = A08();
        if (A082 != null) {
            AnonymousClass0N5 r2 = this.A06;
            if (r2 == null) {
                r2 = A01();
                this.A06 = r2;
            }
            r2.A00(A082, this.A0D.cache.timeToLiveMs);
            this.A0A.postDelayed(new C11270jN(this), A04());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005d, code lost:
        if (r0.A09() == false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bc, code lost:
        if (A00("progressive.enable_throttling_data_source", r5) != 0) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0160, code lost:
        if (r12 != false) goto L_0x00be;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C187438xD A05(com.facebook.exoplayer.monitor.VpsEventCallback r27, X.C187458xF r28, X.C142866xv r29, X.C160777oI r30, X.C1445071v r31, java.util.Map r32, java.util.concurrent.atomic.AtomicBoolean r33, int r34, int r35, int r36, boolean r37, boolean r38, boolean r39) {
        /*
            r26 = this;
            r7 = r26
            X.8LG r6 = r7.A0D
            boolean r0 = r6.enableTransferListenerCallbackPerfFix
            X.82f r15 = new X.82f
            r15.<init>(r0)
            r17 = r30
            r9 = r35
            r8 = r36
            r24 = r37
            r25 = r39
            if (r39 == 0) goto L_0x007c
            java.lang.String r0 = r6.userAgent
            X.6KP r14 = new X.6KP
            r14.<init>(r0, r9, r8)
        L_0x001e:
            r7.A09()
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r1 = r28
            if (r28 == 0) goto L_0x002c
            r0.add(r1)
        L_0x002c:
            r15.A00(r0)
            r2 = r29
            int r1 = r2.value
            boolean r0 = r6.cancelOngoingRequest
            r23 = r33
            r23.get()
            r3 = r27
            X.0LZ r16 = r7.A06(r3)
            com.facebook.exoplayer.datasource.FbHttpProxyDataSource r13 = new com.facebook.exoplayer.datasource.FbHttpProxyDataSource
            r19 = r34
            r20 = r1
            r21 = r0
            r18 = r6
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            X.8Kz r0 = r6.cache
            boolean r0 = r0.skipCacheBeforeInited
            if (r0 == 0) goto L_0x0060
            if (r37 != 0) goto L_0x0060
            X.6Nm r0 = r7.A07
            if (r0 == 0) goto L_0x0060
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x0060
        L_0x005f:
            return r13
        L_0x0060:
            r18 = r7
            r19 = r13
            r20 = r15
            r21 = r2
            r22 = r17
            X.0gv r13 = r18.A07(r19, r20, r21, r22, r23, r24, r25)
            r1 = r32
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x005f
            X.0gu r0 = new X.0gu
            r0.<init>(r13, r1)
            return r0
        L_0x007c:
            java.util.Map r5 = r7.A0F
            java.lang.String r1 = "dash.use_liger_for_vod"
            boolean r0 = r5.containsKey(r1)
            r2 = 0
            if (r0 == 0) goto L_0x008e
            int r0 = A00(r1, r5)
            if (r0 == 0) goto L_0x008e
            r2 = 1
        L_0x008e:
            java.lang.String r13 = "Apache"
            r3 = 0
            r1 = 1
            if (r2 != 0) goto L_0x011d
            boolean r0 = r6.enableLocalSocketProxy
            if (r0 != 0) goto L_0x011d
            boolean r0 = r6.enableIgHttpDataSource
            if (r0 != 0) goto L_0x011d
            boolean r0 = r6.enableFBLiteHttpDataSource
            if (r0 != 0) goto L_0x011d
            java.lang.String r2 = A0G
            java.lang.String r1 = "using default data source for apache"
            java.lang.Object[] r0 = new java.lang.Object[r3]
            X.C161157p6.A01(r2, r1, r0)
            java.lang.String r0 = r6.userAgent
            X.6KP r14 = new X.6KP
            r14.<init>(r0, r9, r8)
            java.lang.String r1 = "progressive.enable_throttling_data_source"
            boolean r0 = r5.containsKey(r1)
            if (r0 == 0) goto L_0x00f8
            int r0 = A00(r1, r5)
            if (r0 == 0) goto L_0x00f8
        L_0x00be:
            if (r37 != 0) goto L_0x00f8
            if (r38 == 0) goto L_0x00f8
            java.lang.String r2 = "progressive.throttling_buffer_low"
            boolean r0 = r5.containsKey(r2)
            if (r0 == 0) goto L_0x00d0
            int r0 = A00(r2, r5)
            if (r0 <= 0) goto L_0x00f8
        L_0x00d0:
            java.lang.String r1 = "progressive.throttling_buffer_high"
            boolean r0 = r5.containsKey(r1)
            if (r0 == 0) goto L_0x00de
            int r0 = A00(r1, r5)
            if (r0 <= 0) goto L_0x00f8
        L_0x00de:
            boolean r0 = r5.containsKey(r2)
            if (r0 == 0) goto L_0x0119
            int r2 = A00(r2, r5)
        L_0x00e8:
            boolean r0 = r5.containsKey(r1)
            if (r0 == 0) goto L_0x0116
            int r1 = A00(r1, r5)
        L_0x00f2:
            X.81s r0 = new X.81s
            r0.<init>(r14, r2, r1)
            r14 = r0
        L_0x00f8:
            java.lang.String r3 = A0G
            r0 = 4
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r0 = 0
            r2[r0] = r13
            java.lang.String r1 = r17.A05()
            r0 = 1
            r2[r0] = r1
            r0 = 2
            X.AnonymousClass000.A1P(r2, r9, r0)
            r0 = 3
            X.AnonymousClass000.A1P(r2, r8, r0)
            java.lang.String r0 = "Created %s Data Source for video %s (timeout_ms connect=%d read=%d)"
            X.C161157p6.A01(r3, r0, r2)
            goto L_0x001e
        L_0x0116:
            r1 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00f2
        L_0x0119:
            r2 = 32768(0x8000, float:4.5918E-41)
            goto L_0x00e8
        L_0x011d:
            java.lang.String r0 = r6.userAgent
            X.8xE r14 = X.AnonymousClass71D.A00(r0, r9, r8)
            boolean r0 = r6.enableFBLiteHttpDataSource
            if (r0 == 0) goto L_0x0135
            java.lang.String r2 = "progressive.enable_throttling_data_source"
            boolean r0 = r5.containsKey(r2)
            if (r0 == 0) goto L_0x0167
            int r0 = A00(r2, r5)
            if (r0 == 0) goto L_0x0167
        L_0x0135:
            r12 = 1
        L_0x0136:
            boolean r0 = r6.logOnApacheFallback
            if (r0 == 0) goto L_0x0160
            boolean r0 = r7.A08
            if (r0 != 0) goto L_0x0160
            r7.A08 = r1
            if (r31 == 0) goto L_0x0164
            java.lang.String r10 = "dummy"
        L_0x0144:
            X.0u1 r11 = r7.A0B
            java.lang.String r4 = r17.A05()
            java.lang.String r3 = "CACHE"
            java.lang.String r2 = "FALL_BACK_TO_APACHE"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "apache fallback: "
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r10, r1)
            X.6Nr r0 = new X.6Nr
            r0.<init>(r4, r3, r2, r1)
            r11.B2p(r0)
        L_0x0160:
            if (r12 == 0) goto L_0x00f8
            goto L_0x00be
        L_0x0164:
            java.lang.String r10 = "null helper"
            goto L_0x0144
        L_0x0167:
            r12 = 0
            goto L_0x0136
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Xd.A05(com.facebook.exoplayer.monitor.VpsEventCallback, X.8xF, X.6xv, X.7oI, X.71v, java.util.Map, java.util.concurrent.atomic.AtomicBoolean, int, int, int, boolean, boolean, boolean):X.8xD");
    }
}
