package com.facebook.exoplayer.datasource;

import X.AnonymousClass0LZ;
import X.AnonymousClass8LG;
import X.C142866xv;
import X.C160777oI;
import X.C1676982d;
import X.C184768sU;
import X.C187438xD;
import X.C187448xE;
import X.C187458xF;
import android.net.Uri;
import java.util.List;
import java.util.Map;

public class FbHttpProxyDataSource implements C187448xE, C187438xD {
    public int A00;
    public long A01 = 0;
    public C187448xE A02;
    public C187458xF A03;
    public boolean A04;
    public final AnonymousClass0LZ A05;
    public final C142866xv A06;
    public final C160777oI A07;
    public final AnonymousClass8LG A08;

    public static void A00(FbHttpProxyDataSource fbHttpProxyDataSource, String str, Map map) {
        List list = (List) map.get(str);
        if (list != null) {
            fbHttpProxyDataSource.A03.BeZ(str, list.get(0));
        }
    }

    public synchronized void close() {
        this.A02.close();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read(byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            long r0 = r6.A01     // Catch:{ all -> 0x0027 }
            r3 = 0
            r5 = -1
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x000c
            monitor-exit(r6)
            return r5
        L_0x000c:
            r3 = -1
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0017
            long r2 = (long) r9
            int r9 = X.AnonymousClass6CA.A02(r2, r0)     // Catch:{ all -> 0x0027 }
        L_0x0017:
            X.8xE r0 = r6.A02     // Catch:{ all -> 0x0027 }
            int r4 = r0.read(r7, r8, r9)     // Catch:{ all -> 0x0027 }
            if (r4 == r5) goto L_0x0025
            long r2 = r6.A01     // Catch:{ all -> 0x0027 }
            long r0 = (long) r4     // Catch:{ all -> 0x0027 }
            long r2 = r2 - r0
            r6.A01 = r2     // Catch:{ all -> 0x0027 }
        L_0x0025:
            monitor-exit(r6)
            return r4
        L_0x0027:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.exoplayer.datasource.FbHttpProxyDataSource.read(byte[], int, int):int");
    }

    public Map BCF() {
        return this.A02.BCF();
    }

    public Uri BE6() {
        return this.A02.BE6();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0050 A[Catch:{ IOException -> 0x0288 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005c A[Catch:{ IOException -> 0x0288 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0095 A[Catch:{ IOException -> 0x0288 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0154 A[Catch:{ IOException -> 0x0288 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized long Bfw(X.C161387pX r63) {
        /*
            r62 = this;
            r4 = r62
            monitor-enter(r4)
            r5 = r63
            android.net.Uri r0 = r5.A04     // Catch:{ all -> 0x028a }
            r61 = r0
            X.7ni r6 = r5.A05     // Catch:{ all -> 0x028a }
            X.7n1 r0 = r6.A0F     // Catch:{ all -> 0x028a }
            boolean r7 = r0.A02     // Catch:{ all -> 0x028a }
            java.lang.String r2 = r0.A00     // Catch:{ all -> 0x028a }
            java.lang.String r1 = r0.A01     // Catch:{ all -> 0x028a }
            X.7oI r0 = r4.A07     // Catch:{ all -> 0x028a }
            java.lang.String r10 = r0.A07     // Catch:{ all -> 0x028a }
            X.7n1 r9 = new X.7n1     // Catch:{ all -> 0x028a }
            r9.<init>(r2, r7, r1)     // Catch:{ all -> 0x028a }
            X.7nU r3 = r6.A0E     // Catch:{ all -> 0x028a }
            if (r3 != 0) goto L_0x0024
            X.6uk r0 = X.C140926uk.A00     // Catch:{ all -> 0x028a }
            X.7nU r3 = r0.mHttpPriority     // Catch:{ all -> 0x028a }
        L_0x0024:
            if (r7 == 0) goto L_0x005f
            X.8LG r2 = r4.A08     // Catch:{ all -> 0x028a }
            boolean r0 = r2.enableHttpPriorityForPrefetch     // Catch:{ all -> 0x028a }
            if (r0 == 0) goto L_0x0038
            boolean r0 = r2.useHttpPriorityIncrementalForPrefetch     // Catch:{ all -> 0x028a }
            if (r0 == 0) goto L_0x0047
            byte r1 = r3.A00     // Catch:{ all -> 0x028a }
            r0 = 1
        L_0x0033:
            X.7nU r3 = new X.7nU     // Catch:{ all -> 0x028a }
            r3.<init>(r1, r0)     // Catch:{ all -> 0x028a }
        L_0x0038:
            boolean r0 = r2.useLowerHttpPriorityForUnimportantPrefetch     // Catch:{ all -> 0x028a }
            if (r0 == 0) goto L_0x004b
            long r0 = r5.A03     // Catch:{ all -> 0x028a }
            r11 = 50000(0xc350, double:2.47033E-319)
            int r8 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            r1 = 1
            if (r8 > 0) goto L_0x004c
            goto L_0x004b
        L_0x0047:
            byte r1 = r3.A00     // Catch:{ all -> 0x028a }
            r0 = 0
            goto L_0x0033
        L_0x004b:
            r1 = 0
        L_0x004c:
            boolean r0 = r2.useLowerHttpPriorityForAllPrefetch     // Catch:{ all -> 0x028a }
            if (r0 == 0) goto L_0x005c
            if (r1 == 0) goto L_0x0091
            boolean r0 = r2.useHttpPriorityIncrementalForPrefetch     // Catch:{ all -> 0x028a }
            if (r0 == 0) goto L_0x0059
            X.6uk r0 = X.C140926uk.A09     // Catch:{ all -> 0x028a }
            goto L_0x0097
        L_0x0059:
            X.6uk r0 = X.C140926uk.A08     // Catch:{ all -> 0x028a }
            goto L_0x0097
        L_0x005c:
            if (r1 == 0) goto L_0x0099
            goto L_0x0091
        L_0x005f:
            X.8LG r2 = r4.A08     // Catch:{ all -> 0x028a }
            boolean r0 = r2.enableHttpPriorityForStreaming     // Catch:{ all -> 0x028a }
            if (r0 == 0) goto L_0x0099
            boolean r0 = r2.useHttpPriorityIncrementalForStreaming     // Catch:{ all -> 0x028a }
            if (r0 == 0) goto L_0x007c
            X.6uk r0 = X.C140926uk.A05     // Catch:{ all -> 0x028a }
        L_0x006b:
            X.7nU r3 = r0.mHttpPriority     // Catch:{ all -> 0x028a }
            int r1 = r2.bufferedDurationBasedHttpPriorityUpperBoundMs     // Catch:{ all -> 0x028a }
            if (r1 <= 0) goto L_0x0099
            int r0 = r6.A00     // Catch:{ all -> 0x028a }
            if (r0 <= r1) goto L_0x0099
            boolean r1 = r2.useHttpPriorityWarmupForLongBufferedStreaming     // Catch:{ all -> 0x028a }
            boolean r0 = r2.useHttpPriorityIncrementalForLongBufferedStreaming     // Catch:{ all -> 0x028a }
            if (r1 == 0) goto L_0x0084
            goto L_0x007f
        L_0x007c:
            X.6uk r0 = X.C140926uk.A04     // Catch:{ all -> 0x028a }
            goto L_0x006b
        L_0x007f:
            if (r0 == 0) goto L_0x008c
            X.6uk r0 = X.C140926uk.A0B     // Catch:{ all -> 0x028a }
            goto L_0x008e
        L_0x0084:
            if (r0 == 0) goto L_0x0089
            X.6uk r0 = X.C140926uk.A03     // Catch:{ all -> 0x028a }
            goto L_0x008e
        L_0x0089:
            X.6uk r0 = X.C140926uk.A02     // Catch:{ all -> 0x028a }
            goto L_0x008e
        L_0x008c:
            X.6uk r0 = X.C140926uk.A0A     // Catch:{ all -> 0x028a }
        L_0x008e:
            X.7nU r3 = r0.mHttpPriority     // Catch:{ all -> 0x028a }
            goto L_0x0099
        L_0x0091:
            boolean r0 = r2.useHttpPriorityIncrementalForPrefetch     // Catch:{ all -> 0x028a }
            if (r0 == 0) goto L_0x0154
            X.6uk r0 = X.C140926uk.A07     // Catch:{ all -> 0x028a }
        L_0x0097:
            X.7nU r3 = r0.mHttpPriority     // Catch:{ all -> 0x028a }
        L_0x0099:
            byte[] r0 = r5.A08     // Catch:{ all -> 0x028a }
            r60 = r0
            long r0 = r5.A01     // Catch:{ all -> 0x028a }
            r58 = r0
            long r0 = r5.A03     // Catch:{ all -> 0x028a }
            r56 = r0
            long r0 = r5.A02     // Catch:{ all -> 0x028a }
            r54 = r0
            java.lang.String r0 = r5.A06     // Catch:{ all -> 0x028a }
            r53 = r0
            int r0 = r5.A00     // Catch:{ all -> 0x028a }
            r52 = r0
            int r0 = r4.A00     // Catch:{ all -> 0x028a }
            r33 = r0
            r8 = 0
            r24 = 0
            r11 = 0
            java.lang.String r0 = r6.A0J     // Catch:{ all -> 0x028a }
            r21 = r0
            long r0 = r6.A09     // Catch:{ all -> 0x028a }
            r40 = r0
            boolean r0 = r6.A0P     // Catch:{ all -> 0x028a }
            r48 = r0
            int r0 = r6.A07     // Catch:{ all -> 0x028a }
            r29 = r0
            int r0 = r6.A06     // Catch:{ all -> 0x028a }
            r30 = r0
            int r0 = r6.A00     // Catch:{ all -> 0x028a }
            r31 = r0
            int r0 = r6.A08     // Catch:{ all -> 0x028a }
            r32 = r0
            boolean r0 = r6.A0R     // Catch:{ all -> 0x028a }
            r49 = r0
            boolean r0 = r6.A0O     // Catch:{ all -> 0x028a }
            r50 = r0
            long r0 = r6.A0B     // Catch:{ all -> 0x028a }
            r42 = r0
            long r0 = r6.A0D     // Catch:{ all -> 0x028a }
            r44 = r0
            boolean r0 = r6.A0Q     // Catch:{ all -> 0x028a }
            r51 = r0
            int r0 = r6.A05     // Catch:{ all -> 0x028a }
            r34 = r0
            int r0 = r6.A02     // Catch:{ all -> 0x028a }
            r35 = r0
            long r14 = r6.A0C     // Catch:{ all -> 0x028a }
            long r0 = r6.A0A     // Catch:{ all -> 0x028a }
            int r12 = r6.A01     // Catch:{ all -> 0x028a }
            r36 = r12
            java.util.Map r12 = r6.A0N     // Catch:{ all -> 0x028a }
            int r13 = r6.A03     // Catch:{ all -> 0x028a }
            r37 = r13
            java.lang.String r13 = r6.A0H     // Catch:{ all -> 0x028a }
            r22 = r13
            java.lang.String r13 = r6.A0G     // Catch:{ all -> 0x028a }
            r23 = r13
            java.lang.String r13 = r6.A0I     // Catch:{ all -> 0x028a }
            r25 = r13
            java.lang.String r13 = r6.A0M     // Catch:{ all -> 0x028a }
            java.lang.String r6 = r6.A0K     // Catch:{ all -> 0x028a }
            r16 = -1
            X.7ni r18 = new X.7ni     // Catch:{ all -> 0x028a }
            r19 = r3
            r20 = r9
            r26 = r13
            r27 = r6
            r28 = r12
            r38 = r40
            r40 = r42
            r42 = r44
            r44 = r14
            r46 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r40, r42, r44, r46, r48, r49, r50, r51)     // Catch:{ all -> 0x028a }
            X.7pX r9 = new X.7pX     // Catch:{ all -> 0x028a }
            r19 = r9
            r20 = r61
            r21 = r18
            r22 = r53
            r23 = r60
            r24 = r52
            r25 = r58
            r27 = r56
            r29 = r54
            r19.<init>(r20, r21, r22, r23, r24, r25, r27, r29)     // Catch:{ all -> 0x028a }
            boolean r0 = r2.enableVideoPlayerServerSideBweAnnotations     // Catch:{ all -> 0x028a }
            if (r0 == 0) goto L_0x016c
            X.6xv r1 = r4.A06     // Catch:{ all -> 0x028a }
            X.6xv r0 = X.C142866xv.A03     // Catch:{ all -> 0x028a }
            if (r1 == r0) goto L_0x0158
            X.6xv r0 = X.C142866xv.A05     // Catch:{ all -> 0x028a }
            if (r1 == r0) goto L_0x0158
            X.6xv r0 = X.C142866xv.A04     // Catch:{ all -> 0x028a }
            if (r1 != r0) goto L_0x016c
            goto L_0x0158
        L_0x0154:
            X.6uk r0 = X.C140926uk.A06     // Catch:{ all -> 0x028a }
            goto L_0x0097
        L_0x0158:
            if (r7 == 0) goto L_0x015d
            X.6ww r0 = X.C142276ww.ANDROID_PREFETCH_VIDEO     // Catch:{ all -> 0x028a }
            goto L_0x015f
        L_0x015d:
            X.6ww r0 = X.C142276ww.ANDROID_PLAYING_VIDEO     // Catch:{ all -> 0x028a }
        L_0x015f:
            java.lang.String r3 = "x-fb-ssbwe-annotation-request-type"
            java.lang.String r1 = r0.value     // Catch:{ all -> 0x028a }
            if (r1 == 0) goto L_0x016c
            X.7ni r0 = r9.A05     // Catch:{ all -> 0x028a }
            java.util.Map r0 = r0.A0N     // Catch:{ all -> 0x028a }
            r0.put(r3, r1)     // Catch:{ all -> 0x028a }
        L_0x016c:
            com.facebook.video.heroplayer.setting.FbAutogeneratedSettings r0 = r2.autogenSettings     // Catch:{ all -> 0x028a }
            if (r0 == 0) goto L_0x019a
            boolean r0 = r0.enableSloHttpHeaderLogging     // Catch:{ all -> 0x028a }
            if (r0 == 0) goto L_0x019a
            if (r10 == 0) goto L_0x0183
            X.7nT r0 = X.C160337nT.A01     // Catch:{ all -> 0x028a }
            java.lang.Boolean r0 = r0.A01(r10)     // Catch:{ all -> 0x028a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x028a }
            if (r0 == 0) goto L_0x0183
            goto L_0x019a
        L_0x0183:
            boolean r0 = X.C161477pj.A04(r5)     // Catch:{ all -> 0x028a }
            if (r0 != 0) goto L_0x018c
            X.C161477pj.A03(r5)     // Catch:{ all -> 0x028a }
        L_0x018c:
            java.lang.String r1 = X.C161477pj.A01(r5)     // Catch:{ all -> 0x028a }
            if (r1 == 0) goto L_0x019a
            r9.A00(r12)     // Catch:{ all -> 0x028a }
            X.7nT r0 = X.C160337nT.A01     // Catch:{ all -> 0x028a }
            r0.A02(r10, r1)     // Catch:{ all -> 0x028a }
        L_0x019a:
            X.8xF r1 = r4.A03     // Catch:{ IOException -> 0x0288 }
            if (r1 == 0) goto L_0x01a3
            X.6xX r0 = X.C142646xX.A03     // Catch:{ IOException -> 0x0288 }
            r1.Bea(r9, r0)     // Catch:{ IOException -> 0x0288 }
        L_0x01a3:
            X.8xE r1 = r4.A02     // Catch:{ IOException -> 0x0288 }
            long r5 = r1.Bfw(r9)     // Catch:{ IOException -> 0x0288 }
            r7 = 1
            boolean r0 = r2.enableCaseInsensitiveHttpResponseHeaderKey     // Catch:{ all -> 0x028a }
            boolean r12 = X.AnonymousClass000.A1S(r0)
            java.util.Map r3 = r1.BCF()     // Catch:{ all -> 0x028a }
            if (r3 == 0) goto L_0x024a
            X.8xF r0 = r4.A03     // Catch:{ all -> 0x028a }
            if (r0 == 0) goto L_0x024a
            java.lang.String r2 = "X-FB-Connection-Quality"
            java.util.List r0 = X.C161477pj.A02(r2, r3, r12)     // Catch:{ all -> 0x028a }
            if (r0 == 0) goto L_0x01cb
            java.lang.String r1 = X.AnonymousClass001.A0n(r0, r8)     // Catch:{ all -> 0x028a }
            X.8xF r0 = r4.A03     // Catch:{ all -> 0x028a }
            r0.BeZ(r2, r1)     // Catch:{ all -> 0x028a }
        L_0x01cb:
            java.lang.String r2 = "x-fb-cec-video-limit"
            java.util.List r0 = X.C18320x8.A0s(r2, r3)     // Catch:{ all -> 0x028a }
            if (r0 == 0) goto L_0x01dc
            java.lang.String r1 = X.AnonymousClass001.A0n(r0, r8)     // Catch:{ all -> 0x028a }
            X.8xF r0 = r4.A03     // Catch:{ all -> 0x028a }
            r0.BeZ(r2, r1)     // Catch:{ all -> 0x028a }
        L_0x01dc:
            java.lang.String r0 = "up-ttfb"
            A00(r4, r0, r3)     // Catch:{ all -> 0x028a }
            java.lang.String r0 = "x-fb-log-session-id"
            A00(r4, r0, r3)     // Catch:{ all -> 0x028a }
            java.lang.String r0 = "x-fb-log-transaction-id"
            A00(r4, r0, r3)     // Catch:{ all -> 0x028a }
            java.lang.String r0 = "x-fb-session-id"
            A00(r4, r0, r3)     // Catch:{ all -> 0x028a }
            java.lang.String r0 = "x-fb-response-time-ms"
            A00(r4, r0, r3)     // Catch:{ all -> 0x028a }
            java.lang.String r0 = "x-bwe-mean"
            A00(r4, r0, r3)     // Catch:{ all -> 0x028a }
            java.lang.String r0 = "x-bwe-std-dev"
            A00(r4, r0, r3)     // Catch:{ all -> 0x028a }
            java.lang.String r0 = "x-fb-dynamic-predictive-response-chunk-size"
            A00(r4, r0, r3)     // Catch:{ all -> 0x028a }
            java.util.Iterator r14 = X.AnonymousClass000.A0q(r3)     // Catch:{ all -> 0x028a }
        L_0x0208:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x028a }
            if (r0 == 0) goto L_0x024a
            java.util.Map$Entry r13 = X.AnonymousClass001.A0w(r14)     // Catch:{ all -> 0x028a }
            java.lang.Object r0 = r13.getKey()     // Catch:{ all -> 0x028a }
            if (r0 == 0) goto L_0x0208
            java.lang.Object r0 = r13.getValue()     // Catch:{ all -> 0x028a }
            if (r0 == 0) goto L_0x0208
            java.lang.Object r0 = r13.getValue()     // Catch:{ all -> 0x028a }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x028a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x028a }
            if (r0 != 0) goto L_0x0208
            java.lang.String r1 = X.C18310x6.A0q(r13)     // Catch:{ all -> 0x028a }
            java.lang.String r0 = "x-fb-ull-"
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x028a }
            if (r0 == 0) goto L_0x0208
            X.8xF r2 = r4.A03     // Catch:{ all -> 0x028a }
            java.lang.String r1 = X.C18310x6.A0q(r13)     // Catch:{ all -> 0x028a }
            java.lang.Object r0 = r13.getValue()     // Catch:{ all -> 0x028a }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x028a }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x028a }
            r2.BeZ(r1, r0)     // Catch:{ all -> 0x028a }
            goto L_0x0208
        L_0x024a:
            long r2 = X.C161477pj.A00(r3, r12)     // Catch:{ all -> 0x028a }
            long r0 = r9.A03     // Catch:{ all -> 0x028a }
            long r2 = X.AnonymousClass6C8.A0Q(r2, r0)     // Catch:{ all -> 0x028a }
            int r8 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r8 == 0) goto L_0x025f
            int r8 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r8 > 0) goto L_0x025f
            r4.A01 = r5     // Catch:{ all -> 0x028a }
            goto L_0x0261
        L_0x025f:
            r4.A01 = r2     // Catch:{ all -> 0x028a }
        L_0x0261:
            java.lang.String r13 = "com.facebook.exoplayer.datasource.FbHttpProxyDataSource"
            java.lang.String r12 = "Opening data spec Offset: %d, Length %d Open Length %d Videoid %s Key %s"
            r8 = 5
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x028a }
            X.AnonymousClass000.A1Q(r8, r11, r0)     // Catch:{ all -> 0x028a }
            long r0 = r9.A02     // Catch:{ all -> 0x028a }
            X.AnonymousClass000.A1Q(r8, r7, r0)     // Catch:{ all -> 0x028a }
            X.AnonymousClass0x2.A1U(r8, r2)     // Catch:{ all -> 0x028a }
            r7 = 3
            r8[r7] = r10     // Catch:{ all -> 0x028a }
            java.lang.String r9 = r9.A06     // Catch:{ all -> 0x028a }
            r7 = 4
            r8[r7] = r9     // Catch:{ all -> 0x028a }
            X.C161157p6.A01(r13, r12, r8)     // Catch:{ all -> 0x028a }
            int r7 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r7 == 0) goto L_0x0286
            long r2 = java.lang.Math.min(r5, r2)     // Catch:{ all -> 0x028a }
        L_0x0286:
            monitor-exit(r4)
            return r2
        L_0x0288:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x028a }
        L_0x028a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.exoplayer.datasource.FbHttpProxyDataSource.Bfw(X.7pX):long");
    }

    public void cancel() {
        if (this.A04) {
            this.A02.cancel();
        }
    }

    public FbHttpProxyDataSource(C187448xE r6, C187458xF r7, AnonymousClass0LZ r8, C160777oI r9, AnonymousClass8LG r10, int i, int i2, boolean z) {
        C142866xv r1;
        this.A07 = r9;
        this.A02 = r6;
        this.A00 = i;
        this.A03 = r7;
        C142866xv[] values = C142866xv.values();
        int length = values.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                r1 = C142866xv.A06;
                break;
            }
            r1 = values[i3];
            if (r1.value == i2) {
                break;
            }
            i3++;
        }
        this.A06 = r1;
        this.A04 = z;
        this.A08 = r10;
        this.A05 = r8;
    }

    public void Awq(C184768sU r2) {
        r2.getClass();
        if (r2 instanceof C187458xF) {
            this.A03 = (C187458xF) r2;
        } else {
            this.A03 = new C1676982d(r2);
        }
    }
}
