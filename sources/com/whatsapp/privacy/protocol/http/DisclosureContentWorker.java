package com.whatsapp.privacy.protocol.http;

import X.AnonymousClass001;
import X.AnonymousClass0PW;
import X.AnonymousClass28C;
import X.AnonymousClass33K;
import X.C107385bE;
import X.C162457s7;
import X.C18260x0;
import X.C389229y;
import X.C44592Wq;
import X.C48212eX;
import X.C55132pq;
import X.C56492s4;
import X.C64333Db;
import android.app.Notification;
import android.content.Context;
import android.os.Build;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public final class DisclosureContentWorker extends Worker {
    public final C56492s4 A00;
    public final AnonymousClass33K A01;
    public final C48212eX A02;
    public final C44592Wq A03;
    public final C55132pq A04;

    public final void A0D(int[] iArr, int i) {
        for (int A002 : iArr) {
            this.A02.A00(A002, Integer.valueOf(i));
        }
    }

    public AnonymousClass0PW A0B() {
        int i = Build.VERSION.SDK_INT;
        if (i < 31 && i >= 23) {
            Context context = this.A00;
            C162457s7.A0D(context);
            Notification A002 = AnonymousClass28C.A00(context);
            if (A002 != null) {
                return new AnonymousClass0PW(59, A002, C107385bE.A07() ? 1 : 0);
            }
        }
        throw AnonymousClass001.A0e("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00cc, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C03070Is A0C() {
        /*
            r12 = this;
            androidx.work.WorkerParameters r1 = r12.A01
            X.0Xq r2 = r1.A01
            java.lang.String r0 = "disclosure_ids"
            int[] r3 = r2.A04(r0)
            if (r3 == 0) goto L_0x0111
            int r0 = r3.length
            boolean r0 = X.AnonymousClass000.A1T(r0)
            if (r0 != 0) goto L_0x0111
            java.lang.String r0 = "url"
            java.lang.String r5 = r2.A03(r0)
            r4 = 2
            if (r5 == 0) goto L_0x00f9
            int r1 = r1.A00
            r0 = 4
            if (r1 > r0) goto L_0x00f9
            java.lang.String r1 = "handler"
            r0 = -1
            int r6 = r2.A02(r1, r0)
            r0 = 16
            android.net.TrafficStats.setThreadStatsTag(r0)
            X.33K r1 = r12.A01     // Catch:{ IOException -> 0x00cd }
            X.2pq r0 = r12.A04     // Catch:{ IOException -> 0x00cd }
            r2 = 0
            X.4GL r5 = r1.A01(r0, r5, r2)     // Catch:{ IOException -> 0x00cd }
            X.C162457s7.A0H(r5)     // Catch:{ all -> 0x00c6 }
            r0 = r5
            X.3PZ r0 = (X.AnonymousClass3PZ) r0     // Catch:{ all -> 0x00c6 }
            java.net.HttpURLConnection r0 = r0.A01     // Catch:{ all -> 0x00c6 }
            int r1 = r0.getResponseCode()     // Catch:{ all -> 0x00c6 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x0053
            r12.A0D(r3, r4)     // Catch:{ all -> 0x00c6 }
            r5.close()     // Catch:{ all -> 0x00c6 }
            X.0An r0 = new X.0An     // Catch:{ all -> 0x00c6 }
            r0.<init>()     // Catch:{ all -> 0x00c6 }
            goto L_0x00c2
        L_0x0053:
            X.2Wq r0 = r12.A03     // Catch:{ all -> 0x00c6 }
            java.util.concurrent.ConcurrentHashMap r7 = r0.A00     // Catch:{ all -> 0x00c6 }
            java.lang.Object r11 = X.C18290x4.A0j(r7, r6)     // Catch:{ all -> 0x00c6 }
            X.66Y r11 = (X.AnonymousClass66Y) r11     // Catch:{ all -> 0x00c6 }
            java.lang.String r6 = "null cannot be cast to non-null type com.whatsapp.privacy.protocol.xmpp.DisclosureHandler"
            X.C162457s7.A0K(r11, r6)     // Catch:{ all -> 0x00c6 }
            X.2s4 r1 = r12.A00     // Catch:{ all -> 0x00c6 }
            r0 = 27
            java.io.InputStream r0 = X.C18310x6.A0b(r1, r5, r2, r0)     // Catch:{ all -> 0x00c6 }
            byte[] r0 = X.C624535b.A05(r0)     // Catch:{ all -> 0x00c6 }
            X.C162457s7.A0D(r0)     // Catch:{ all -> 0x00c6 }
            java.io.ByteArrayInputStream r10 = X.AnonymousClass0x9.A0d(r0)     // Catch:{ all -> 0x00c6 }
            java.io.BufferedReader r9 = X.C18310x6.A0Z(r10)     // Catch:{ JSONException -> 0x00a5 }
            java.io.StringWriter r8 = new java.io.StringWriter     // Catch:{ JSONException -> 0x00a5 }
            r8.<init>()     // Catch:{ JSONException -> 0x00a5 }
            r0 = 8192(0x2000, float:1.14794E-41)
            r2 = 0
            char[] r1 = new char[r0]     // Catch:{ JSONException -> 0x00a5 }
        L_0x0084:
            int r0 = r9.read(r1)     // Catch:{ JSONException -> 0x00a5 }
            if (r0 < 0) goto L_0x008e
            r8.write(r1, r2, r0)     // Catch:{ JSONException -> 0x00a5 }
            goto L_0x0084
        L_0x008e:
            java.lang.String r0 = X.C18290x4.A0o(r8)     // Catch:{ JSONException -> 0x00a5 }
            org.json.JSONObject r0 = X.AnonymousClass0x9.A1H(r0)     // Catch:{ JSONException -> 0x00a5 }
            r11.BEw(r0, r3)     // Catch:{ JSONException -> 0x00a5 }
            r10.close()     // Catch:{ all -> 0x00c6 }
            r5.close()     // Catch:{ all -> 0x00c6 }
            X.0Ap r0 = new X.0Ap     // Catch:{ all -> 0x00c6 }
            r0.<init>()     // Catch:{ all -> 0x00c6 }
            goto L_0x00c2
        L_0x00a5:
            r1 = move-exception
            java.lang.String r0 = "disclosureContentWorker/handleResponse malformed downloaded content"
            com.whatsapp.util.Log.i(r0, r1)     // Catch:{ all -> 0x00c6 }
            r0 = 3
            r12.A0D(r3, r0)     // Catch:{ all -> 0x00c6 }
            r1 = 410(0x19a, float:5.75E-43)
            java.lang.Object r0 = X.C18290x4.A0j(r7, r4)     // Catch:{ all -> 0x00c6 }
            X.66Y r0 = (X.AnonymousClass66Y) r0     // Catch:{ all -> 0x00c6 }
            X.C162457s7.A0K(r0, r6)     // Catch:{ all -> 0x00c6 }
            r0.BRF(r3, r1)     // Catch:{ all -> 0x00c6 }
            X.0Ao r0 = new X.0Ao     // Catch:{ all -> 0x00c6 }
            r0.<init>()     // Catch:{ all -> 0x00c6 }
        L_0x00c2:
            r5.close()     // Catch:{ IOException -> 0x00cd }
            goto L_0x00f0
        L_0x00c6:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c8 }
        L_0x00c8:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)     // Catch:{ IOException -> 0x00cd }
            throw r0     // Catch:{ IOException -> 0x00cd }
        L_0x00cd:
            r1 = move-exception
            java.lang.String r0 = "disclosureContentWorker/doWork/fetch failed "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00f4 }
            r12.A0D(r3, r4)     // Catch:{ all -> 0x00f4 }
            r2 = 400(0x190, float:5.6E-43)
            X.2Wq r0 = r12.A03     // Catch:{ all -> 0x00f4 }
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00     // Catch:{ all -> 0x00f4 }
            java.lang.Object r1 = X.C18290x4.A0j(r0, r4)     // Catch:{ all -> 0x00f4 }
            X.66Y r1 = (X.AnonymousClass66Y) r1     // Catch:{ all -> 0x00f4 }
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.privacy.protocol.xmpp.DisclosureHandler"
            X.C162457s7.A0K(r1, r0)     // Catch:{ all -> 0x00f4 }
            r1.BRF(r3, r2)     // Catch:{ all -> 0x00f4 }
            X.0Ao r0 = new X.0Ao     // Catch:{ all -> 0x00f4 }
            r0.<init>()     // Catch:{ all -> 0x00f4 }
        L_0x00f0:
            android.net.TrafficStats.clearThreadStatsTag()
            return r0
        L_0x00f4:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x00f9:
            r12.A0D(r3, r4)
            r2 = 400(0x190, float:5.6E-43)
            X.2Wq r0 = r12.A03
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            java.lang.Object r1 = X.C18290x4.A0j(r0, r4)
            X.66Y r1 = (X.AnonymousClass66Y) r1
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.privacy.protocol.xmpp.DisclosureHandler"
            X.C162457s7.A0K(r1, r0)
            r1.BRF(r3, r2)
        L_0x0111:
            X.0Ao r0 = new X.0Ao
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.privacy.protocol.http.DisclosureContentWorker.A0C():X.0Is");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DisclosureContentWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18260x0.A0Q(context, workerParameters);
        C64333Db A012 = C389229y.A01(context);
        this.A00 = A012.Bq6();
        this.A01 = (AnonymousClass33K) A012.AaW.get();
        this.A04 = (C55132pq) A012.AU8.get();
        this.A02 = (C48212eX) A012.ARN.get();
        this.A03 = (C44592Wq) A012.A8U.get();
    }
}
