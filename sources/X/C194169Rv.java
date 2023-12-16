package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.9Rv  reason: invalid class name and case insensitive filesystem */
public class C194169Rv {
    public C72183dJ A00;
    public final C64393Dh A01;
    public final C56492s4 A02;
    public final AnonymousClass33p A03;
    public final AnonymousClass33K A04;
    public final C85134Fb A05;
    public final C55132pq A06;
    public final AtomicBoolean A07 = C18280x3.A0l();

    /* JADX WARNING: Removed duplicated region for block: B:81:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0175  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:52:0x012a=Splitter:B:52:0x012a, B:59:0x013d=Splitter:B:59:0x013d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set A00() {
        /*
            r15 = this;
            java.util.concurrent.atomic.AtomicBoolean r4 = r15.A07
            r0 = 1
            r3 = 0
            boolean r0 = r4.compareAndSet(r3, r0)
            if (r0 == 0) goto L_0x017e
            X.3dJ r0 = new X.3dJ
            r0.<init>()
            r15.A00 = r0
            java.lang.String r6 = "PaymentBackgroundBatchFetcher: "
            r0 = 18
            android.net.TrafficStats.setThreadStatsTag(r0)
            java.lang.String r2 = ""
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x004e
            r1 = 0
        L_0x0021:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x004b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r1)
            java.lang.String r0 = "/payments/background"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
        L_0x0035:
            r2.append(r0)
            java.lang.String r0 = "/all.zip"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r2)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.net.Uri$Builder r0 = r0.buildUpon()
            java.lang.String r5 = r0.toString()
            goto L_0x0061
        L_0x004b:
            java.lang.String r0 = "https://static.whatsapp.net/payments/background"
            goto L_0x0035
        L_0x004e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "https://www."
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ".facebook.com/cdn/cacheable/whatsapp"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            goto L_0x0021
        L_0x0061:
            X.33K r2 = r15.A04     // Catch:{ Exception -> 0x0155 }
            X.2pq r1 = r15.A06     // Catch:{ Exception -> 0x0155 }
            X.33p r10 = r15.A03     // Catch:{ Exception -> 0x0155 }
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r10)     // Catch:{ Exception -> 0x0155 }
            java.lang.String r9 = "payment_background_batch_etag"
            java.lang.String r0 = X.C18280x3.A0Z(r0, r9)     // Catch:{ Exception -> 0x0155 }
            X.4GL r2 = r2.A00(r1, r5, r0)     // Catch:{ Exception -> 0x0155 }
            r0 = r2
            X.3PZ r0 = (X.AnonymousClass3PZ) r0     // Catch:{ all -> 0x014b }
            java.net.HttpURLConnection r12 = r0.A01     // Catch:{ all -> 0x014b }
            int r1 = r12.getResponseCode()     // Catch:{ all -> 0x014b }
            r0 = 304(0x130, float:4.26E-43)
            java.lang.String r13 = "payment_backgrounds_batch_last_fetch_timestamp"
            if (r1 != r0) goto L_0x0096
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r6, r5)     // Catch:{ all -> 0x014b }
            java.lang.String r0 = " ETag cached."
            X.C18260x0.A1J(r1, r0)     // Catch:{ all -> 0x014b }
            r10.A1Y(r13)     // Catch:{ all -> 0x014b }
            java.util.HashSet r8 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x014b }
            goto L_0x012a
        L_0x0096:
            int r1 = r12.getResponseCode()     // Catch:{ all -> 0x014b }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x00b0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r6, r5)     // Catch:{ all -> 0x014b }
            java.lang.String r0 = " Request fails, response code: "
            r1.append(r0)     // Catch:{ all -> 0x014b }
            int r0 = r12.getResponseCode()     // Catch:{ all -> 0x014b }
            X.C18260x0.A1F(r1, r0)     // Catch:{ all -> 0x014b }
            goto L_0x013d
        L_0x00b0:
            X.2s4 r7 = r15.A02     // Catch:{ all -> 0x014b }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x014b }
            java.lang.Integer r0 = X.C18320x8.A0W()     // Catch:{ all -> 0x014b }
            java.io.InputStream r0 = r2.B47(r7, r1, r0)     // Catch:{ all -> 0x014b }
            byte[] r0 = X.C624535b.A05(r0)     // Catch:{ all -> 0x014b }
            java.io.ByteArrayInputStream r7 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x014b }
            r7.<init>(r0)     // Catch:{ all -> 0x014b }
            java.lang.String r11 = "PAY: PaymentBackgroundBatchFetcher/unzipBatchBackgrounds"
            java.util.zip.ZipInputStream r14 = new java.util.zip.ZipInputStream     // Catch:{ FileNotFoundException | IOException -> 0x00f1 }
            r14.<init>(r7)     // Catch:{ FileNotFoundException | IOException -> 0x00f1 }
            X.3Dh r0 = r15.A01     // Catch:{ all -> 0x00e7 }
            java.io.File r1 = r0.A0F()     // Catch:{ all -> 0x00e7 }
            X.99d r0 = new X.99d     // Catch:{ all -> 0x00e7 }
            r0.<init>(r1)     // Catch:{ all -> 0x00e7 }
            r0.A02(r14)     // Catch:{ all -> 0x00e7 }
            java.util.Set r0 = r0.A01     // Catch:{ all -> 0x00e7 }
            java.util.HashSet r8 = new java.util.HashSet     // Catch:{ all -> 0x00e7 }
            r8.<init>(r0)     // Catch:{ all -> 0x00e7 }
            r14.close()     // Catch:{ FileNotFoundException | IOException -> 0x00f1 }
            goto L_0x00f6
        L_0x00e7:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x00ec }
            goto L_0x00f0
        L_0x00ec:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ FileNotFoundException | IOException -> 0x00f1 }
        L_0x00f0:
            throw r1     // Catch:{ FileNotFoundException | IOException -> 0x00f1 }
        L_0x00f1:
            r0 = move-exception
            com.whatsapp.util.Log.e(r11, r0)     // Catch:{ all -> 0x0141 }
            r8 = 0
        L_0x00f6:
            if (r8 == 0) goto L_0x0131
            r10.A1Y(r13)     // Catch:{ all -> 0x0141 }
            java.lang.String r0 = "etag"
            java.lang.String r1 = r12.getHeaderField(r0)     // Catch:{ all -> 0x0141 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0141 }
            if (r0 != 0) goto L_0x011e
            if (r1 != 0) goto L_0x010a
            goto L_0x0113
        L_0x010a:
            android.content.SharedPreferences$Editor r0 = r10.A0U()     // Catch:{ all -> 0x0141 }
            android.content.SharedPreferences$Editor r0 = r0.putString(r9, r1)     // Catch:{ all -> 0x0141 }
            goto L_0x011b
        L_0x0113:
            android.content.SharedPreferences$Editor r0 = r10.A0U()     // Catch:{ all -> 0x0141 }
            android.content.SharedPreferences$Editor r0 = r0.remove(r9)     // Catch:{ all -> 0x0141 }
        L_0x011b:
            r0.apply()     // Catch:{ all -> 0x0141 }
        L_0x011e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r6, r5)     // Catch:{ all -> 0x0141 }
            java.lang.String r0 = " Store succeeds."
            X.C18260x0.A1J(r1, r0)     // Catch:{ all -> 0x0141 }
            r7.close()     // Catch:{ all -> 0x014b }
        L_0x012a:
            r2.close()     // Catch:{ Exception -> 0x0155 }
            android.net.TrafficStats.clearThreadStatsTag()
            goto L_0x0163
        L_0x0131:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r6, r5)     // Catch:{ all -> 0x0141 }
            java.lang.String r0 = " Store fails."
            X.C18260x0.A1J(r1, r0)     // Catch:{ all -> 0x0141 }
            r7.close()     // Catch:{ all -> 0x014b }
        L_0x013d:
            r2.close()     // Catch:{ Exception -> 0x0155 }
            goto L_0x015f
        L_0x0141:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0146 }
            goto L_0x014a
        L_0x0146:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x014b }
        L_0x014a:
            throw r1     // Catch:{ all -> 0x014b }
        L_0x014b:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0150 }
            goto L_0x0154
        L_0x0150:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x0155 }
        L_0x0154:
            throw r1     // Catch:{ Exception -> 0x0155 }
        L_0x0155:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r6, r5)     // Catch:{ all -> 0x0179 }
            java.lang.String r0 = " Exception: "
            X.C18260x0.A1Q(r1, r0, r2)     // Catch:{ all -> 0x0179 }
        L_0x015f:
            android.net.TrafficStats.clearThreadStatsTag()
            r8 = 0
        L_0x0163:
            X.3dJ r2 = r15.A00
            if (r8 != 0) goto L_0x0175
            java.lang.String r1 = "PAY: PaymentBackgroundBatchFetcher/batch background download failed"
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            r2.BQr(r0)
        L_0x0171:
            r4.set(r3)
            return r8
        L_0x0175:
            r2.BQt(r8)
            goto L_0x0171
        L_0x0179:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x017e:
            r1 = 0
            X.3dJ r0 = r15.A00     // Catch:{ InterruptedException | ExecutionException -> 0x018a }
            if (r0 == 0) goto L_0x018a
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x018a }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ InterruptedException | ExecutionException -> 0x018a }
            return r0
        L_0x018a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194169Rv.A00():java.util.Set");
    }

    public C194169Rv(C64393Dh r2, C56492s4 r3, AnonymousClass33p r4, AnonymousClass33K r5, C85134Fb r6, C55132pq r7) {
        this.A01 = r2;
        this.A02 = r3;
        this.A06 = r7;
        this.A04 = r5;
        this.A03 = r4;
        this.A05 = r6;
    }
}
