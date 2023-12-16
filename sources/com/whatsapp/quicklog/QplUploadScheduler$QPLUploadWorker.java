package com.whatsapp.quicklog;

import X.C389229y;
import X.C43692Tc;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.whatsapp.util.Log;

public class QplUploadScheduler$QPLUploadWorker extends Worker {
    public final C43692Tc A00;

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01aa, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r8.A04.BJT(-1, r0.getMessage());
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01c7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r5.A05.B2g(r0.getMessage());
        r5.A00 = false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01c7 A[ExcHandler: Exception | OutOfMemoryError (r0v15 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:31:0x009a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C03070Is A0C() {
        /*
            r28 = this;
            r0 = r28
            X.2Tc r5 = r0.A00
            X.2yF r4 = r5.A03
            java.util.concurrent.Semaphore r3 = r4.A05     // Catch:{ InterruptedException -> 0x0011 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0011 }
            r0 = 5
            boolean r0 = r3.tryAcquire(r0, r2)     // Catch:{ InterruptedException -> 0x0011 }
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 != 0) goto L_0x001a
            X.0An r1 = new X.0An
            r1.<init>()
            return r1
        L_0x001a:
            r3 = 0
            r5.A00 = r3     // Catch:{ all -> 0x0212 }
            java.lang.String r10 = ".txt"
            java.io.File[] r9 = r4.A01(r10)     // Catch:{ all -> 0x0212 }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0212 }
            long r0 = X.C60252yF.A07     // Catch:{ all -> 0x0212 }
            long r7 = r7 - r0
            r6 = 0
        L_0x002b:
            int r0 = r9.length     // Catch:{ all -> 0x0212 }
            if (r6 >= r0) goto L_0x0040
            r0 = r9[r6]     // Catch:{ all -> 0x0212 }
            long r1 = r0.lastModified()     // Catch:{ all -> 0x0212 }
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x003d
            r0 = r9[r6]     // Catch:{ all -> 0x0212 }
            r4.A00(r0)     // Catch:{ all -> 0x0212 }
        L_0x003d:
            int r6 = r6 + 1
            goto L_0x002b
        L_0x0040:
            java.io.File[] r9 = r4.A01(r10)     // Catch:{ all -> 0x0212 }
            X.2oU r0 = r4.A01     // Catch:{ all -> 0x0212 }
            java.io.File r1 = X.C54292oU.A02(r0)     // Catch:{ all -> 0x0212 }
            java.lang.String r0 = "qpl"
            java.io.File r7 = X.AnonymousClass002.A0A(r1, r0)     // Catch:{ all -> 0x0212 }
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0212 }
            int r11 = r9.length     // Catch:{ all -> 0x0212 }
            r2 = 0
        L_0x0057:
            if (r2 >= r11) goto L_0x0076
            r1 = r9[r2]     // Catch:{ all -> 0x0212 }
            java.lang.String r0 = r1.getName()     // Catch:{ IOException -> 0x0069 }
            java.io.File r0 = X.C627536m.A05(r1, r7, r0)     // Catch:{ IOException -> 0x0069 }
            if (r0 == 0) goto L_0x0073
            r6.add(r0)     // Catch:{ IOException -> 0x0069 }
            goto L_0x0073
        L_0x0069:
            r0 = move-exception
            X.4FX r1 = r4.A04     // Catch:{ all -> 0x0212 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0212 }
            r1.B2d(r0)     // Catch:{ all -> 0x0212 }
        L_0x0073:
            int r2 = r2 + 1
            goto L_0x0057
        L_0x0076:
            java.io.File[] r0 = new java.io.File[r3]     // Catch:{ all -> 0x0212 }
            java.lang.Object[] r6 = r6.toArray(r0)     // Catch:{ all -> 0x0212 }
            java.io.File[] r6 = (java.io.File[]) r6     // Catch:{ all -> 0x0212 }
            int r7 = r6.length     // Catch:{ all -> 0x0212 }
            if (r7 != 0) goto L_0x009a
            X.2a6 r0 = r5.A06     // Catch:{ all -> 0x0212 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0212 }
            X.8qC r0 = r0.A01     // Catch:{ all -> 0x0212 }
            android.content.SharedPreferences$Editor r1 = X.C18300x5.A0A(r0)     // Catch:{ all -> 0x0212 }
            java.lang.String r0 = "qpl_last_upload_ts"
            X.C18270x1.A0i(r1, r0, r2)     // Catch:{ all -> 0x0212 }
            X.0Ap r1 = new X.0Ap     // Catch:{ all -> 0x0212 }
            r1.<init>()     // Catch:{ all -> 0x0212 }
            goto L_0x020c
        L_0x009a:
            android.os.ConditionVariable r10 = new android.os.ConditionVariable     // Catch:{ Exception | OutOfMemoryError -> 0x01c7 }
            r10.<init>()     // Catch:{ Exception | OutOfMemoryError -> 0x01c7 }
            r0 = 5
            X.4JV r8 = new X.4JV     // Catch:{ Exception | OutOfMemoryError -> 0x01c7 }
            r8.<init>(r10, r0, r5)     // Catch:{ Exception | OutOfMemoryError -> 0x01c7 }
            r0 = 17
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x01c7 }
            X.2pq r1 = r5.A07     // Catch:{ Exception | OutOfMemoryError -> 0x01c7 }
            java.lang.String r21 = "https://graph.whatsapp.net/wa_qpl_data"
            X.3FI r0 = r5.A08     // Catch:{ Exception | OutOfMemoryError -> 0x01c7 }
            java.lang.String r22 = r0.A00()     // Catch:{ Exception | OutOfMemoryError -> 0x01c7 }
            X.2s4 r0 = r5.A01     // Catch:{ Exception | OutOfMemoryError -> 0x01c7 }
            r24 = 8
            r16 = 0
            X.30q r2 = new X.30q     // Catch:{ Exception | OutOfMemoryError -> 0x01c7 }
            r26 = r3
            r27 = r3
            r19 = r8
            r20 = r1
            r23 = r16
            r25 = r3
            r17 = r2
            r18 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ Exception | OutOfMemoryError -> 0x01c7 }
            java.lang.String r1 = "access_token"
            java.lang.String r0 = "1063127757113399|745146ffa34413f9dbb5469f5370b7af"
            r2.A08(r1, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x01c7 }
            X.2SW r8 = r5.A04     // Catch:{ Exception | OutOfMemoryError -> 0x01c7 }
            java.lang.String r1 = X.C58172up.A0B     // Catch:{ Exception | OutOfMemoryError -> 0x01c7 }
            java.lang.String r0 = "app_id"
            r2.A08(r0, r1)     // Catch:{ Exception | OutOfMemoryError -> 0x01c7 }
            r0 = 0
        L_0x00e0:
            if (r0 >= r7) goto L_0x0110
            r1 = r6[r0]     // Catch:{ Exception | OutOfMemoryError -> 0x01c7 }
            java.io.FileInputStream r18 = X.AnonymousClass0x9.A0g(r1)     // Catch:{ FileNotFoundException -> 0x0103, Exception | OutOfMemoryError -> 0x01c7 }
            java.lang.String r19 = "batches[]"
            java.lang.String r20 = r1.getName()     // Catch:{ FileNotFoundException -> 0x0103, Exception | OutOfMemoryError -> 0x01c7 }
            long r24 = r1.length()     // Catch:{ FileNotFoundException -> 0x0103, Exception | OutOfMemoryError -> 0x01c7 }
            r22 = 0
            java.util.List r12 = r2.A0C     // Catch:{ FileNotFoundException -> 0x0103, Exception | OutOfMemoryError -> 0x01c7 }
            X.5KF r1 = new X.5KF     // Catch:{ FileNotFoundException -> 0x0103, Exception | OutOfMemoryError -> 0x01c7 }
            r17 = r1
            r21 = r3
            r17.<init>(r18, r19, r20, r21, r22, r24)     // Catch:{ FileNotFoundException -> 0x0103, Exception | OutOfMemoryError -> 0x01c7 }
            r12.add(r1)     // Catch:{ FileNotFoundException -> 0x0103, Exception | OutOfMemoryError -> 0x01c7 }
            goto L_0x010d
        L_0x0103:
            r1 = move-exception
            X.4FX r12 = r5.A05     // Catch:{ Exception | OutOfMemoryError -> 0x01c7 }
            java.lang.String r1 = r1.getMessage()     // Catch:{ Exception | OutOfMemoryError -> 0x01c7 }
            r12.B2g(r1)     // Catch:{ Exception | OutOfMemoryError -> 0x01c7 }
        L_0x010d:
            int r0 = r0 + 1
            goto L_0x00e0
        L_0x0110:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception | OutOfMemoryError -> 0x01c7 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x01c7 }
            java.lang.String r0 = "upload_time"
            r2.A08(r0, r1)     // Catch:{ Exception | OutOfMemoryError -> 0x01c7 }
            X.2a6 r0 = r8.A05     // Catch:{ Exception | OutOfMemoryError -> 0x01c7 }
            long r0 = r0.A00()     // Catch:{ Exception | OutOfMemoryError -> 0x01c7 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x01c7 }
            java.lang.String r0 = "user_id"
            r2.A08(r0, r1)     // Catch:{ Exception | OutOfMemoryError -> 0x01c7 }
            org.json.JSONObject r13 = X.AnonymousClass0x9.A1G()     // Catch:{ Exception -> 0x01aa, Exception | OutOfMemoryError -> 0x01c7 }
            X.33i r12 = r8.A00     // Catch:{ Exception -> 0x01aa, Exception | OutOfMemoryError -> 0x01c7 }
            android.telephony.TelephonyManager r14 = r12.A0N()     // Catch:{ Exception -> 0x01aa, Exception | OutOfMemoryError -> 0x01c7 }
            if (r14 == 0) goto L_0x014c
            java.lang.String r1 = "carrier"
            java.lang.String r0 = r14.getNetworkOperatorName()     // Catch:{ Exception -> 0x01aa, Exception | OutOfMemoryError -> 0x01c7 }
            r13.put(r1, r0)     // Catch:{ Exception -> 0x01aa, Exception | OutOfMemoryError -> 0x01c7 }
            java.lang.String r1 = "country"
            java.lang.String r0 = r14.getSimCountryIso()     // Catch:{ Exception -> 0x01aa, Exception | OutOfMemoryError -> 0x01c7 }
            r13.put(r1, r0)     // Catch:{ Exception -> 0x01aa, Exception | OutOfMemoryError -> 0x01c7 }
        L_0x014c:
            java.lang.String r15 = "device_name"
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x01aa, Exception | OutOfMemoryError -> 0x01c7 }
            java.lang.String r14 = android.os.Build.MANUFACTURER     // Catch:{ Exception -> 0x01aa, Exception | OutOfMemoryError -> 0x01c7 }
            r0.append(r14)     // Catch:{ Exception -> 0x01aa, Exception | OutOfMemoryError -> 0x01c7 }
            java.lang.String r1 = "-"
            r0.append(r1)     // Catch:{ Exception -> 0x01aa, Exception | OutOfMemoryError -> 0x01c7 }
            java.lang.String r1 = android.os.Build.MODEL     // Catch:{ Exception -> 0x01aa, Exception | OutOfMemoryError -> 0x01c7 }
            java.lang.String r0 = X.AnonymousClass000.A0X(r1, r0)     // Catch:{ Exception -> 0x01aa, Exception | OutOfMemoryError -> 0x01c7 }
            r13.put(r15, r0)     // Catch:{ Exception -> 0x01aa, Exception | OutOfMemoryError -> 0x01c7 }
            java.lang.String r15 = "device_code_name"
            java.lang.String r0 = android.os.Build.DEVICE     // Catch:{ Exception -> 0x01aa, Exception | OutOfMemoryError -> 0x01c7 }
            r13.put(r15, r0)     // Catch:{ Exception -> 0x01aa, Exception | OutOfMemoryError -> 0x01c7 }
            java.lang.String r0 = "device_manufacturer"
            r13.put(r0, r14)     // Catch:{ Exception -> 0x01aa, Exception | OutOfMemoryError -> 0x01c7 }
            java.lang.String r0 = "device_model"
            r13.put(r0, r1)     // Catch:{ Exception -> 0x01aa, Exception | OutOfMemoryError -> 0x01c7 }
            java.lang.String r1 = "year_class"
            X.2y5 r0 = r8.A03     // Catch:{ Exception -> 0x01aa, Exception | OutOfMemoryError -> 0x01c7 }
            int r0 = X.AnonymousClass34G.A02(r12, r0)     // Catch:{ Exception -> 0x01aa, Exception | OutOfMemoryError -> 0x01c7 }
            r13.put(r1, r0)     // Catch:{ Exception -> 0x01aa, Exception | OutOfMemoryError -> 0x01c7 }
            java.lang.String r1 = "mem_class"
            int r0 = X.AnonymousClass34L.A00(r12)     // Catch:{ Exception -> 0x01aa, Exception | OutOfMemoryError -> 0x01c7 }
            r13.put(r1, r0)     // Catch:{ Exception -> 0x01aa, Exception | OutOfMemoryError -> 0x01c7 }
            java.lang.String r1 = "device_os_version"
            java.lang.String r0 = android.os.Build.VERSION.RELEASE     // Catch:{ Exception -> 0x01aa, Exception | OutOfMemoryError -> 0x01c7 }
            r13.put(r1, r0)     // Catch:{ Exception -> 0x01aa, Exception | OutOfMemoryError -> 0x01c7 }
            java.lang.String r0 = "is_employee"
            r13.put(r0, r3)     // Catch:{ Exception -> 0x01aa, Exception | OutOfMemoryError -> 0x01c7 }
            java.lang.String r12 = "oc_version"
            X.2oU r0 = r8.A01     // Catch:{ Exception -> 0x01aa, Exception | OutOfMemoryError -> 0x01c7 }
            android.content.Context r0 = r0.A00     // Catch:{ Exception -> 0x01aa, Exception | OutOfMemoryError -> 0x01c7 }
            long r0 = X.AnonymousClass2BN.A00(r0)     // Catch:{ Exception -> 0x01aa, Exception | OutOfMemoryError -> 0x01c7 }
            r13.put(r12, r0)     // Catch:{ Exception -> 0x01aa, Exception | OutOfMemoryError -> 0x01c7 }
            java.lang.String r1 = r13.toString()     // Catch:{ Exception -> 0x01aa, Exception | OutOfMemoryError -> 0x01c7 }
            goto L_0x01b6
        L_0x01aa:
            r0 = move-exception
            X.4FX r8 = r8.A04     // Catch:{ Exception | OutOfMemoryError -> 0x01c7 }
            r1 = -1
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception | OutOfMemoryError -> 0x01c7 }
            r8.BJT(r1, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x01c7 }
            r1 = 0
        L_0x01b6:
            java.lang.String r0 = "batch_info"
            r2.A08(r0, r1)     // Catch:{ Exception | OutOfMemoryError -> 0x01c7 }
            r0 = r16
            r2.A03(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x01c7 }
            r0 = 100000(0x186a0, double:4.94066E-319)
            r10.block(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x01c7 }
            goto L_0x01d3
        L_0x01c7:
            r0 = move-exception
            X.4FX r1 = r5.A05     // Catch:{ all -> 0x0212 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0212 }
            r1.B2g(r0)     // Catch:{ all -> 0x0212 }
            r5.A00 = r3     // Catch:{ all -> 0x0212 }
        L_0x01d3:
            android.net.TrafficStats.clearThreadStatsTag()     // Catch:{ all -> 0x0212 }
            r1 = 0
        L_0x01d7:
            if (r1 >= r7) goto L_0x01e1
            r0 = r6[r1]     // Catch:{ all -> 0x0212 }
            r4.A00(r0)     // Catch:{ all -> 0x0212 }
            int r1 = r1 + 1
            goto L_0x01d7
        L_0x01e1:
            boolean r0 = r5.A00     // Catch:{ all -> 0x0212 }
            if (r0 != 0) goto L_0x01eb
            X.0An r1 = new X.0An     // Catch:{ all -> 0x0212 }
            r1.<init>()     // Catch:{ all -> 0x0212 }
            goto L_0x020c
        L_0x01eb:
            if (r3 >= r11) goto L_0x01f5
            r0 = r9[r3]     // Catch:{ all -> 0x0212 }
            r4.A00(r0)     // Catch:{ all -> 0x0212 }
            int r3 = r3 + 1
            goto L_0x01eb
        L_0x01f5:
            X.2a6 r0 = r5.A06     // Catch:{ all -> 0x0212 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0212 }
            X.8qC r0 = r0.A01     // Catch:{ all -> 0x0212 }
            android.content.SharedPreferences$Editor r1 = X.C18300x5.A0A(r0)     // Catch:{ all -> 0x0212 }
            java.lang.String r0 = "qpl_last_upload_ts"
            X.C18270x1.A0i(r1, r0, r2)     // Catch:{ all -> 0x0212 }
            X.0Ap r1 = new X.0Ap     // Catch:{ all -> 0x0212 }
            r1.<init>()     // Catch:{ all -> 0x0212 }
        L_0x020c:
            java.util.concurrent.Semaphore r0 = r4.A05
            r0.release()
            return r1
        L_0x0212:
            r1 = move-exception
            java.util.concurrent.Semaphore r0 = r4.A05
            r0.release()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.quicklog.QplUploadScheduler$QPLUploadWorker.A0C():X.0Is");
    }

    public QplUploadScheduler$QPLUploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        Log.d("qplupload/hilt");
        this.A00 = (C43692Tc) C389229y.A01(context).AcK.A00.A9y.get();
    }
}
