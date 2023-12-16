package com.whatsapp.privacy.protocol.http;

import X.AnonymousClass001;
import X.AnonymousClass0PW;
import X.AnonymousClass28C;
import X.AnonymousClass33K;
import X.C107385bE;
import X.C162457s7;
import X.C18260x0;
import X.C389229y;
import X.C44582Wp;
import X.C55132pq;
import X.C55952rB;
import X.C56492s4;
import X.C59992xp;
import X.C64333Db;
import android.app.Notification;
import android.content.Context;
import android.os.Build;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public final class DisclosureIconsWorker extends Worker {
    public final C56492s4 A00;
    public final AnonymousClass33K A01;
    public final C55952rB A02;
    public final C44582Wp A03;
    public final C59992xp A04;
    public final C55132pq A05;

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

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (r2.length() == 0) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C03070Is A0C() {
        /*
            r13 = this;
            androidx.work.WorkerParameters r2 = r13.A01
            X.0Xq r1 = r2.A01
            java.lang.String r0 = "disclosure_ids"
            int[] r6 = r1.A04(r0)
            if (r6 == 0) goto L_0x001f
            int r5 = r6.length
            if (r5 == 0) goto L_0x001f
            int r1 = r2.A00
            r0 = 4
            if (r1 <= r0) goto L_0x0022
            java.lang.String r0 = "disclosureiconworker/dowork exceed retry limit"
        L_0x0016:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0Ao r0 = new X.0Ao
            r0.<init>()
            return r0
        L_0x001f:
            java.lang.String r0 = "disclosureiconworker/dowork no disclosureIds"
            goto L_0x0016
        L_0x0022:
            r4 = 0
            r0 = 1
        L_0x0024:
            if (r4 >= r5) goto L_0x00e0
            r8 = r6[r4]
            if (r0 == 0) goto L_0x0050
            X.2rB r0 = r13.A02
            r0.A01()
            X.2rs r0 = r0.A06
            java.lang.String r2 = r0.A03(r8)
            r12 = 0
            if (r2 == 0) goto L_0x003f
            int r1 = r2.length()
            r0 = 0
            if (r1 != 0) goto L_0x0040
        L_0x003f:
            r0 = 1
        L_0x0040:
            java.lang.String r7 = "disclosureiconworker/downloadDisclosureIcons/"
            if (r0 == 0) goto L_0x0054
            java.lang.StringBuilder r1 = X.C18270x1.A0W(r8, r7)
            java.lang.String r0 = " notice content not found"
            X.C18260x0.A1K(r1, r0)
        L_0x004d:
            r0 = 1
            if (r12 != 0) goto L_0x0051
        L_0x0050:
            r0 = 0
        L_0x0051:
            int r4 = r4 + 1
            goto L_0x0024
        L_0x0054:
            X.2xp r1 = r13.A04     // Catch:{ 59h -> 0x00d5 }
            org.json.JSONObject r0 = X.AnonymousClass0x9.A1H(r2)     // Catch:{ 59h -> 0x00d5 }
            X.5Rs r0 = r1.A00(r0, r8)     // Catch:{ 59h -> 0x00d5 }
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()     // Catch:{ 59h -> 0x00d5 }
            java.util.List r0 = r0.A01     // Catch:{ 59h -> 0x00d5 }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ 59h -> 0x00d5 }
        L_0x0068:
            boolean r0 = r11.hasNext()     // Catch:{ 59h -> 0x00d5 }
            if (r0 == 0) goto L_0x009d
            java.lang.Object r1 = r11.next()     // Catch:{ 59h -> 0x00d5 }
            X.38y r1 = (X.C633638y) r1     // Catch:{ 59h -> 0x00d5 }
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()     // Catch:{ 59h -> 0x00d5 }
            X.38v r0 = r1.A02     // Catch:{ 59h -> 0x00d5 }
            if (r0 == 0) goto L_0x007f
            r9.add(r0)     // Catch:{ 59h -> 0x00d5 }
        L_0x007f:
            X.38q[] r3 = r1.A0A     // Catch:{ 59h -> 0x00d5 }
            int r2 = r3.length     // Catch:{ 59h -> 0x00d5 }
            r1 = 0
        L_0x0083:
            if (r1 >= r2) goto L_0x0099
            r0 = r3[r1]     // Catch:{ 59h -> 0x00d5 }
            X.38v r0 = r0.A00     // Catch:{ 59h -> 0x00d5 }
            if (r0 == 0) goto L_0x0093
            java.util.List r0 = X.C18290x4.A12(r0)     // Catch:{ 59h -> 0x00d5 }
        L_0x008f:
            r9.addAll(r0)     // Catch:{ 59h -> 0x00d5 }
            goto L_0x0096
        L_0x0093:
            X.3d3 r0 = X.C72023d3.A00     // Catch:{ 59h -> 0x00d5 }
            goto L_0x008f
        L_0x0096:
            int r1 = r1 + 1
            goto L_0x0083
        L_0x0099:
            r10.addAll(r9)     // Catch:{ 59h -> 0x00d5 }
            goto L_0x0068
        L_0x009d:
            java.util.Iterator r3 = r10.iterator()     // Catch:{ 59h -> 0x00d5 }
            r2 = 1
        L_0x00a2:
            boolean r0 = r3.hasNext()     // Catch:{ 59h -> 0x00d5 }
            if (r0 == 0) goto L_0x00d2
            java.lang.Object r1 = r3.next()     // Catch:{ 59h -> 0x00d5 }
            X.38v r1 = (X.C633338v) r1     // Catch:{ 59h -> 0x00d5 }
            if (r2 == 0) goto L_0x00c4
            java.lang.String r0 = r1.A03     // Catch:{ 59h -> 0x00d5 }
            boolean r0 = r13.A0D(r8, r0)     // Catch:{ 59h -> 0x00d5 }
            if (r0 == 0) goto L_0x00c4
            java.lang.String r0 = r1.A02     // Catch:{ 59h -> 0x00d5 }
            if (r0 == 0) goto L_0x00c2
            boolean r0 = r13.A0D(r8, r0)     // Catch:{ 59h -> 0x00d5 }
            if (r0 == 0) goto L_0x00c4
        L_0x00c2:
            r2 = 1
            goto L_0x00c5
        L_0x00c4:
            r2 = 0
        L_0x00c5:
            java.lang.StringBuilder r1 = X.C18270x1.A0W(r8, r7)     // Catch:{ 59h -> 0x00d5 }
            r0 = 32
            r1.append(r0)     // Catch:{ 59h -> 0x00d5 }
            X.C18260x0.A1U(r1, r2)     // Catch:{ 59h -> 0x00d5 }
            goto L_0x00a2
        L_0x00d2:
            r12 = r2
            goto L_0x004d
        L_0x00d5:
            java.lang.StringBuilder r1 = X.C18270x1.A0W(r8, r7)
            java.lang.String r0 = " failed to parse notice"
            X.C18260x0.A1K(r1, r0)
            goto L_0x004d
        L_0x00e0:
            if (r0 == 0) goto L_0x00e8
            X.0Ap r0 = new X.0Ap
            r0.<init>()
            return r0
        L_0x00e8:
            X.0An r0 = new X.0An
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.privacy.protocol.http.DisclosureIconsWorker.A0C():X.0Is");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DisclosureIconsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18260x0.A0Q(context, workerParameters);
        C64333Db A012 = C389229y.A01(context);
        this.A00 = A012.Bq6();
        this.A01 = (AnonymousClass33K) A012.AaW.get();
        this.A05 = (C55132pq) A012.AU8.get();
        this.A02 = (C55952rB) A012.ARK.get();
        this.A04 = (C59992xp) A012.AcK.A00.A9I.get();
        this.A03 = (C44582Wp) A012.ARL.get();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0090, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0094, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00bb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00bf, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0D(int r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "disclosureiconworker/downloadAndSave/"
            r2.append(r1)
            r2.append(r8)
            r0 = 32
            r2.append(r0)
            X.C18260x0.A1J(r2, r9)
            X.2Wp r5 = r7.A03
            java.io.File r0 = r5.A00(r9, r8)
            if (r0 == 0) goto L_0x002d
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x002d
            java.lang.StringBuilder r1 = X.C18270x1.A0W(r8, r1)
            java.lang.String r0 = " icon already saved"
            X.C18260x0.A1J(r1, r0)
            r0 = 1
            return r0
        L_0x002d:
            r0 = 16
            android.net.TrafficStats.setThreadStatsTag(r0)
            r6 = 0
            X.33K r1 = r7.A01     // Catch:{ IOException -> 0x00c7, Exception -> 0x00c0 }
            X.2pq r0 = r7.A05     // Catch:{ IOException -> 0x00c7, Exception -> 0x00c0 }
            r4 = 0
            X.4GL r3 = r1.A01(r0, r9, r4)     // Catch:{ IOException -> 0x00c7, Exception -> 0x00c0 }
            r0 = r3
            X.3PZ r0 = (X.AnonymousClass3PZ) r0     // Catch:{ all -> 0x00b9 }
            java.net.HttpURLConnection r2 = r0.A01     // Catch:{ all -> 0x00b9 }
            int r1 = r2.getResponseCode()     // Catch:{ all -> 0x00b9 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x005d
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00b9 }
            java.lang.String r0 = "disclosureiconworker/downloadAndSave/createDownloadableFilesConnection failed "
            r1.append(r0)     // Catch:{ all -> 0x00b9 }
            int r0 = r2.getResponseCode()     // Catch:{ all -> 0x00b9 }
            X.C18270x1.A1F(r1, r0)     // Catch:{ all -> 0x00b9 }
            r3.close()     // Catch:{ IOException -> 0x00c7, Exception -> 0x00c0 }
            goto L_0x00cd
        L_0x005d:
            X.2s4 r1 = r7.A00     // Catch:{ all -> 0x00b9 }
            r0 = 27
            java.io.InputStream r4 = X.C18310x6.A0b(r1, r3, r4, r0)     // Catch:{ all -> 0x00b9 }
            X.C162457s7.A0H(r4)     // Catch:{ all -> 0x00b2 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = "PrivacyDisclosureFileCache/saveDisclosureIcon "
            r1.append(r0)     // Catch:{ all -> 0x00b2 }
            r1.append(r8)     // Catch:{ all -> 0x00b2 }
            r0 = 32
            r1.append(r0)     // Catch:{ all -> 0x00b2 }
            X.C18260x0.A1J(r1, r9)     // Catch:{ all -> 0x00b2 }
            java.io.File r0 = r5.A00(r9, r8)     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x00a7
            java.io.FileOutputStream r2 = X.AnonymousClass0x9.A0h(r0)     // Catch:{ IOException -> 0x009d, Exception -> 0x0095 }
            X.C627536m.A0I(r4, r2)     // Catch:{ all -> 0x008e }
            r2.close()     // Catch:{ IOException -> 0x009d, Exception -> 0x0095 }
            r0 = 1
            goto L_0x00a8
        L_0x008e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0090 }
        L_0x0090:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ IOException -> 0x009d, Exception -> 0x0095 }
            throw r0     // Catch:{ IOException -> 0x009d, Exception -> 0x0095 }
        L_0x0095:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = "PrivacyDisclosureFileCache/saveDisclosureIcon exception: "
            goto L_0x00a4
        L_0x009d:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = "PrivacyDisclosureFileCache/saveDisclosureIcon can not write to file "
        L_0x00a4:
            X.C18260x0.A1Q(r1, r0, r2)     // Catch:{ all -> 0x00b2 }
        L_0x00a7:
            r0 = 0
        L_0x00a8:
            r4.close()     // Catch:{ all -> 0x00b9 }
            r3.close()     // Catch:{ IOException -> 0x00c7, Exception -> 0x00c0 }
            android.net.TrafficStats.clearThreadStatsTag()
            return r0
        L_0x00b2:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b4 }
        L_0x00b4:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)     // Catch:{ all -> 0x00b9 }
            throw r0     // Catch:{ all -> 0x00b9 }
        L_0x00b9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00bb }
        L_0x00bb:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ IOException -> 0x00c7, Exception -> 0x00c0 }
            throw r0     // Catch:{ IOException -> 0x00c7, Exception -> 0x00c0 }
        L_0x00c0:
            r1 = move-exception
            java.lang.String r0 = "disclosureiconworker/downloadAndSave failed "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00d1 }
            goto L_0x00cd
        L_0x00c7:
            r1 = move-exception
            java.lang.String r0 = "disclosureiconworker/downloadAndSave io failed "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00d1 }
        L_0x00cd:
            android.net.TrafficStats.clearThreadStatsTag()
            return r6
        L_0x00d1:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.privacy.protocol.http.DisclosureIconsWorker.A0D(int, java.lang.String):boolean");
    }
}
