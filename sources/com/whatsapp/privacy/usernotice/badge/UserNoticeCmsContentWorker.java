package com.whatsapp.privacy.usernotice.badge;

import X.AnonymousClass33K;
import X.AnonymousClass3S8;
import X.C18260x0;
import X.C389229y;
import X.C51922kb;
import X.C55132pq;
import X.C55532qV;
import X.C56492s4;
import X.C61112zj;
import X.C64333Db;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public final class UserNoticeCmsContentWorker extends Worker {
    public final C56492s4 A00;
    public final AnonymousClass33K A01;
    public final C61112zj A02;
    public final C51922kb A03;
    public final C55532qV A04;
    public final AnonymousClass3S8 A05;
    public final C55132pq A06;

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x020f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        X.AnonymousClass2A8.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0213, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e1 A[Catch:{ IOException | JSONException -> 0x00d3, all -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fd A[Catch:{ IOException | JSONException -> 0x00d3, all -> 0x01fa }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C03070Is A0C() {
        /*
            r32 = this;
            r9 = r32
            androidx.work.WorkerParameters r2 = r9.A01
            X.0Xq r1 = r2.A01
            java.lang.String r0 = "notices_id"
            int[] r10 = r1.A04(r0)
            if (r10 == 0) goto L_0x0231
            int r0 = r10.length
            boolean r0 = X.AnonymousClass000.A1T(r0)
            if (r0 != 0) goto L_0x0231
            java.lang.String r0 = "url"
            java.lang.String r3 = r1.A03(r0)
            if (r3 == 0) goto L_0x0231
            int r1 = r2.A00
            r0 = 4
            if (r1 > r0) goto L_0x0231
            r0 = 16
            android.net.TrafficStats.setThreadStatsTag(r0)
            X.33K r1 = r9.A01     // Catch:{ IOException -> 0x0214 }
            X.2pq r0 = r9.A06     // Catch:{ IOException -> 0x0214 }
            r2 = 0
            X.4GL r8 = r1.A01(r0, r3, r2)     // Catch:{ IOException -> 0x0214 }
            X.C162457s7.A0H(r8)     // Catch:{ all -> 0x020d }
            r0 = r8
            X.3PZ r0 = (X.AnonymousClass3PZ) r0     // Catch:{ all -> 0x01fa }
            java.net.HttpURLConnection r0 = r0.A01     // Catch:{ all -> 0x01fa }
            int r1 = r0.getResponseCode()     // Catch:{ all -> 0x01fa }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x0055
            X.2kb r1 = r9.A03     // Catch:{ all -> 0x01fa }
            java.lang.Integer r0 = X.C18280x3.A0S()     // Catch:{ all -> 0x01fa }
            r1.A02(r0)     // Catch:{ all -> 0x01fa }
            r8.close()     // Catch:{ all -> 0x01fa }
            X.0An r0 = new X.0An     // Catch:{ all -> 0x01fa }
            r0.<init>()     // Catch:{ all -> 0x01fa }
            goto L_0x0209
        L_0x0055:
            X.2s4 r1 = r9.A00     // Catch:{ all -> 0x01fa }
            r0 = 27
            java.io.InputStream r0 = X.C18310x6.A0b(r1, r8, r2, r0)     // Catch:{ all -> 0x01fa }
            byte[] r0 = X.C624535b.A05(r0)     // Catch:{ all -> 0x01fa }
            X.C162457s7.A0D(r0)     // Catch:{ all -> 0x01fa }
            java.io.ByteArrayInputStream r1 = X.AnonymousClass0x9.A0d(r0)     // Catch:{ all -> 0x01fa }
            X.2zj r14 = r9.A02     // Catch:{ all -> 0x01fa }
            java.lang.String r2 = "results"
            java.lang.String r13 = "Failed to parse user notice content list"
            r0 = 6
            X.6A6 r12 = new X.6A6     // Catch:{ all -> 0x01fa }
            r12.<init>(r0)     // Catch:{ all -> 0x01fa }
            java.util.LinkedHashMap r11 = X.C18320x8.A0r()     // Catch:{ all -> 0x01fa }
            org.json.JSONObject r1 = X.C624535b.A02(r1)     // Catch:{ IOException | JSONException -> 0x00d3 }
            X.C626936e.A06(r1)     // Catch:{ IOException | JSONException -> 0x00d3 }
            boolean r0 = r1.has(r2)     // Catch:{ IOException | JSONException -> 0x00d3 }
            if (r0 != 0) goto L_0x008b
            java.util.Map r1 = X.C73813g7.A0D(r11)     // Catch:{ IOException | JSONException -> 0x00d3 }
            goto L_0x00db
        L_0x008b:
            org.json.JSONArray r7 = r1.getJSONArray(r2)     // Catch:{ IOException | JSONException -> 0x00d3 }
            int r6 = r7.length()     // Catch:{ IOException | JSONException -> 0x00d3 }
            r5 = 0
        L_0x0094:
            if (r5 >= r6) goto L_0x00d7
            org.json.JSONObject r2 = r7.getJSONObject(r5)     // Catch:{ IOException | JSONException -> 0x00d3 }
            java.lang.String r0 = "notice_id"
            int r1 = r2.getInt(r0)     // Catch:{ IOException | JSONException -> 0x00d3 }
            java.lang.String r0 = "channel"
            java.lang.String r4 = r2.optString(r0)     // Catch:{ IOException | JSONException -> 0x00d3 }
            if (r4 != 0) goto L_0x00ab
            java.lang.String r4 = "default"
        L_0x00ab:
            X.2nY r3 = r14.A01(r2, r1)     // Catch:{ IOException | JSONException -> 0x00d3 }
            if (r3 == 0) goto L_0x00d0
            java.lang.Object r2 = r11.get(r4)     // Catch:{ IOException | JSONException -> 0x00d3 }
            r1 = 1
            if (r2 != 0) goto L_0x00bd
            java.util.PriorityQueue r2 = new java.util.PriorityQueue     // Catch:{ IOException | JSONException -> 0x00d3 }
            r2.<init>(r1, r12)     // Catch:{ IOException | JSONException -> 0x00d3 }
        L_0x00bd:
            java.util.PriorityQueue r2 = (java.util.PriorityQueue) r2     // Catch:{ IOException | JSONException -> 0x00d3 }
            java.lang.Object r0 = r11.get(r4)     // Catch:{ IOException | JSONException -> 0x00d3 }
            if (r0 != 0) goto L_0x00ca
            java.util.PriorityQueue r0 = new java.util.PriorityQueue     // Catch:{ IOException | JSONException -> 0x00d3 }
            r0.<init>(r1, r12)     // Catch:{ IOException | JSONException -> 0x00d3 }
        L_0x00ca:
            r2.offer(r3)     // Catch:{ IOException | JSONException -> 0x00d3 }
            r11.put(r4, r2)     // Catch:{ IOException | JSONException -> 0x00d3 }
        L_0x00d0:
            int r5 = r5 + 1
            goto L_0x0094
        L_0x00d3:
            r0 = move-exception
            com.whatsapp.util.Log.e(r13, r0)     // Catch:{ all -> 0x01fa }
        L_0x00d7:
            java.util.Map r1 = X.C73813g7.A0D(r11)     // Catch:{ all -> 0x01fa }
        L_0x00db:
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x01fa }
            if (r0 == 0) goto L_0x00fd
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01fa }
            java.lang.String r0 = "UserNoticeCmsContentWorker/storeUserNoticeContent/cannot parse response for notice: "
            X.C18260x0.A1Q(r1, r0, r10)     // Catch:{ all -> 0x01fa }
            X.2kb r1 = r9.A03     // Catch:{ all -> 0x01fa }
            java.lang.Integer r0 = X.C18290x4.A0a()     // Catch:{ all -> 0x01fa }
            r1.A02(r0)     // Catch:{ all -> 0x01fa }
            r8.close()     // Catch:{ all -> 0x01fa }
            X.0An r0 = new X.0An     // Catch:{ all -> 0x01fa }
            r0.<init>()     // Catch:{ all -> 0x01fa }
            goto L_0x0209
        L_0x00fd:
            X.2qV r7 = r9.A04     // Catch:{ all -> 0x01fa }
            r13 = 0
            java.util.ArrayList r12 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x01fa }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x01fa }
            if (r0 != 0) goto L_0x01cf
            X.66R r0 = r7.A07     // Catch:{ all -> 0x01fa }
            r31 = r0
            java.util.Map r0 = X.AnonymousClass0x7.A10(r31)     // Catch:{ all -> 0x01fa }
            r0.clear()     // Catch:{ all -> 0x01fa }
            X.66R r0 = r7.A06     // Catch:{ all -> 0x01fa }
            r30 = r0
            java.util.Map r0 = X.AnonymousClass0x7.A10(r30)     // Catch:{ all -> 0x01fa }
            r0.clear()     // Catch:{ all -> 0x01fa }
            X.66R r0 = r7.A08     // Catch:{ all -> 0x01fa }
            r29 = r0
            java.util.Map r0 = X.AnonymousClass0x7.A10(r29)     // Catch:{ all -> 0x01fa }
            r0.clear()     // Catch:{ all -> 0x01fa }
            java.util.Iterator r16 = X.AnonymousClass000.A0q(r1)     // Catch:{ all -> 0x01fa }
        L_0x012f:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x01fa }
            if (r0 == 0) goto L_0x01b6
            java.util.Map$Entry r11 = X.AnonymousClass001.A0w(r16)     // Catch:{ all -> 0x01fa }
            java.lang.Object r1 = r11.getValue()     // Catch:{ all -> 0x01fa }
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ all -> 0x01fa }
            r6 = 0
            X.2nY[] r0 = new X.C53722nY[r13]     // Catch:{ all -> 0x01fa }
            java.lang.Object[] r5 = r1.toArray(r0)     // Catch:{ all -> 0x01fa }
            int r10 = r5.length     // Catch:{ all -> 0x01fa }
        L_0x0147:
            if (r6 >= r10) goto L_0x012f
            r4 = r5[r6]     // Catch:{ all -> 0x01fa }
            X.2nY r4 = (X.C53722nY) r4     // Catch:{ all -> 0x01fa }
            java.util.Map r0 = X.AnonymousClass0x7.A10(r29)     // Catch:{ all -> 0x01fa }
            java.lang.Object r2 = X.AnonymousClass0x7.A0k(r11, r0)     // Catch:{ all -> 0x01fa }
            if (r2 != 0) goto L_0x015d
            r0 = 1
            java.util.PriorityQueue r2 = new java.util.PriorityQueue     // Catch:{ all -> 0x01fa }
            r2.<init>(r0)     // Catch:{ all -> 0x01fa }
        L_0x015d:
            java.util.PriorityQueue r2 = (java.util.PriorityQueue) r2     // Catch:{ all -> 0x01fa }
            int r0 = r4.A00     // Catch:{ all -> 0x01fa }
            r21 = r0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r21)     // Catch:{ all -> 0x01fa }
            r2.offer(r3)     // Catch:{ all -> 0x01fa }
            java.util.Map r1 = X.AnonymousClass0x7.A10(r29)     // Catch:{ all -> 0x01fa }
            java.lang.Object r0 = r11.getKey()     // Catch:{ all -> 0x01fa }
            r1.put(r0, r2)     // Catch:{ all -> 0x01fa }
            X.2mP r2 = r4.A05     // Catch:{ all -> 0x01fa }
            if (r2 == 0) goto L_0x01ac
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x01fa }
            X.2sH r0 = r7.A01     // Catch:{ all -> 0x01fa }
            long r0 = r0.A0H()     // Catch:{ all -> 0x01fa }
            long r25 = r14.toSeconds(r0)     // Catch:{ all -> 0x01fa }
            java.lang.String r0 = r2.A03     // Catch:{ all -> 0x01fa }
            r19 = r0
            java.lang.String r15 = r2.A02     // Catch:{ all -> 0x01fa }
            r27 = -1
            r22 = 100
            r23 = 1
            int r14 = r2.A00     // Catch:{ all -> 0x01fa }
            X.2zs r1 = r2.A01     // Catch:{ all -> 0x01fa }
            X.2yC r0 = new X.2yC     // Catch:{ all -> 0x01fa }
            r17 = r0
            r18 = r1
            r20 = r15
            r24 = r14
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r27)     // Catch:{ all -> 0x01fa }
            r12.add(r0)     // Catch:{ all -> 0x01fa }
            java.util.Map r1 = X.AnonymousClass0x7.A10(r30)     // Catch:{ all -> 0x01fa }
            r1.put(r3, r0)     // Catch:{ all -> 0x01fa }
        L_0x01ac:
            java.util.Map r0 = X.AnonymousClass0x7.A10(r31)     // Catch:{ all -> 0x01fa }
            r0.put(r3, r4)     // Catch:{ all -> 0x01fa }
            int r6 = r6 + 1
            goto L_0x0147
        L_0x01b6:
            X.2rG r1 = r7.A04     // Catch:{ all -> 0x01fa }
            X.66R r0 = r7.A09     // Catch:{ all -> 0x01fa }
            java.util.Collection r0 = X.C18300x5.A0w(r0)     // Catch:{ all -> 0x01fa }
            r1.A06(r0)     // Catch:{ all -> 0x01fa }
            java.util.Collection r0 = X.C18300x5.A0w(r30)     // Catch:{ all -> 0x01fa }
            r1.A04(r0)     // Catch:{ all -> 0x01fa }
            java.util.Collection r0 = X.C18300x5.A0w(r31)     // Catch:{ all -> 0x01fa }
            r1.A05(r0)     // Catch:{ all -> 0x01fa }
        L_0x01cf:
            r8.close()     // Catch:{ all -> 0x01fa }
            java.util.Iterator r6 = r12.iterator()     // Catch:{ all -> 0x01fa }
        L_0x01d6:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x01fa }
            if (r0 == 0) goto L_0x0204
            java.lang.Object r5 = r6.next()     // Catch:{ all -> 0x01fa }
            X.2yC r5 = (X.C60222yC) r5     // Catch:{ all -> 0x01fa }
            X.3S8 r4 = r9.A05     // Catch:{ all -> 0x01fa }
            X.7NA r0 = r5.A05     // Catch:{ all -> 0x01fa }
            int r3 = r0.A00     // Catch:{ all -> 0x01fa }
            r2 = 1
            X.2lk r1 = r4.A04     // Catch:{ all -> 0x01fa }
            r1.A00(r3, r2)     // Catch:{ all -> 0x01fa }
            r0 = 100
            r1.A00(r3, r0)     // Catch:{ all -> 0x01fa }
            r4.A00(r5, r2)     // Catch:{ all -> 0x01fa }
            r4.A00(r5, r0)     // Catch:{ all -> 0x01fa }
            goto L_0x01d6
        L_0x01fa:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x020d }
            java.lang.String r0 = "UserNoticeCmsContentWorker/parseResponse caught throwable "
            X.C18260x0.A1Q(r1, r0, r2)     // Catch:{ all -> 0x020d }
        L_0x0204:
            X.0Ap r0 = new X.0Ap     // Catch:{ all -> 0x020d }
            r0.<init>()     // Catch:{ all -> 0x020d }
        L_0x0209:
            r8.close()     // Catch:{ IOException -> 0x0214 }
            goto L_0x0228
        L_0x020d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x020f }
        L_0x020f:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r8, r1)     // Catch:{ IOException -> 0x0214 }
            throw r0     // Catch:{ IOException -> 0x0214 }
        L_0x0214:
            r1 = move-exception
            java.lang.String r0 = "UserNoticeContentWorker/doWork/fetch failed "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x022c }
            X.2kb r1 = r9.A03     // Catch:{ all -> 0x022c }
            java.lang.Integer r0 = X.C18280x3.A0S()     // Catch:{ all -> 0x022c }
            r1.A02(r0)     // Catch:{ all -> 0x022c }
            X.0Ao r0 = new X.0Ao     // Catch:{ all -> 0x022c }
            r0.<init>()     // Catch:{ all -> 0x022c }
        L_0x0228:
            android.net.TrafficStats.clearThreadStatsTag()
            return r0
        L_0x022c:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x0231:
            X.2kb r1 = r9.A03
            java.lang.Integer r0 = X.C18280x3.A0S()
            r1.A02(r0)
            X.0Ao r0 = new X.0Ao
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.privacy.usernotice.badge.UserNoticeCmsContentWorker.A0C():X.0Is");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserNoticeCmsContentWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18260x0.A0Q(context, workerParameters);
        C64333Db A012 = C389229y.A01(context);
        this.A00 = A012.Bq6();
        this.A03 = (C51922kb) A012.AZZ.get();
        this.A06 = (C55132pq) A012.AU8.get();
        this.A01 = (AnonymousClass33K) A012.AaW.get();
        this.A05 = (AnonymousClass3S8) A012.AZV.get();
        this.A04 = (C55532qV) A012.AZU.get();
        this.A02 = (C61112zj) A012.AZY.get();
    }
}
