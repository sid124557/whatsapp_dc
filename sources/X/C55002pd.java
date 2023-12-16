package X;

import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: X.2pd  reason: invalid class name and case insensitive filesystem */
public class C55002pd {
    public final C29441ip A00;
    public final C57162tC A01;
    public final C60872zJ A02;
    public final AnonymousClass1VX A03;
    public final C54672p6 A04;
    public final AnonymousClass2OR A05;
    public final C55132pq A06;
    public final AnonymousClass3FI A07;

    public int A00(AnonymousClass7US r2, boolean z) {
        if (!z || r2.A00 != 0 || !this.A02.A02()) {
            return AnonymousClass0x9.A00(this.A04.A01() ? 1 : 0);
        }
        return 5;
    }

    /* JADX WARNING: type inference failed for: r10v3, types: [X.3fm] */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        X.AnonymousClass2A8.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d7, code lost:
        throw r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass4GL A01(X.AnonymousClass7US r20, java.lang.String r21, java.net.URL r22, long r23, long r25, boolean r27) {
        /*
            r19 = this;
            r8 = r19
            X.1VX r1 = r8.A03
            r0 = 72
            X.2vE r9 = X.C58422vE.A02
            boolean r18 = r1.A0Y(r9, r0)
            r6 = r22
            r2 = r23
            r0 = r25
            r11 = r20
            r7 = r21
            if (r27 == 0) goto L_0x0114
            int r4 = r11.A00
            if (r4 != 0) goto L_0x0114
            X.2zJ r5 = r8.A02
            boolean r4 = r5.A02()
            if (r4 == 0) goto L_0x0114
            X.2OR r9 = r8.A05
            X.6hg r4 = r5.A02
            org.chromium.net.CronetEngine r4 = r4.A01()
            r5 = 0
            X.AnonymousClass0x2.A1A(r6, r5, r4)
            java.net.URLConnection r4 = r4.openConnection(r6)     // Catch:{ IOException -> 0x00fd }
            java.lang.String r8 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            X.C162457s7.A0K(r4, r8)     // Catch:{ IOException -> 0x00fd }
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ IOException -> 0x00fd }
            r8 = 30000(0x7530, float:4.2039E-41)
            r4.setReadTimeout(r8)     // Catch:{ IOException -> 0x00fd }
            java.lang.String r10 = "User-Agent"
            X.3FI r8 = r9.A02     // Catch:{ IOException -> 0x00fd }
            java.lang.String r8 = r8.A00()     // Catch:{ IOException -> 0x00fd }
            r4.setRequestProperty(r10, r8)     // Catch:{ IOException -> 0x00fd }
            java.lang.String r10 = "Host"
            java.lang.String r8 = r11.A06     // Catch:{ IOException -> 0x00fd }
            r4.setRequestProperty(r10, r8)     // Catch:{ IOException -> 0x00fd }
            r13 = 0
            r11 = -1
            int r8 = (r23 > r13 ? 1 : (r23 == r13 ? 0 : -1))
            if (r8 != 0) goto L_0x005f
            int r8 = (r25 > r11 ? 1 : (r25 == r11 ? 0 : -1))
            if (r8 == 0) goto L_0x0082
        L_0x005f:
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x00fd }
            java.lang.String r8 = "bytes="
            r10.append(r8)     // Catch:{ IOException -> 0x00fd }
            r10.append(r2)     // Catch:{ IOException -> 0x00fd }
            r2 = 45
            java.lang.String r3 = X.AnonymousClass001.A0j(r10, r2)     // Catch:{ IOException -> 0x00fd }
            int r2 = (r25 > r11 ? 1 : (r25 == r11 ? 0 : -1))
            if (r2 == 0) goto L_0x007d
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x00fd }
            java.lang.String r3 = X.AnonymousClass000.A0Z(r3, r2, r0)     // Catch:{ IOException -> 0x00fd }
        L_0x007d:
            java.lang.String r0 = "Range"
            r4.setRequestProperty(r0, r3)     // Catch:{ IOException -> 0x00fd }
        L_0x0082:
            if (r18 == 0) goto L_0x008b
            java.lang.String r1 = "X-FB-Socket-Option"
            java.lang.String r0 = "TCP_CONGESTION=bbr"
            r4.setRequestProperty(r1, r0)     // Catch:{ IOException -> 0x00fd }
        L_0x008b:
            if (r21 == 0) goto L_0x0092
            java.lang.String r0 = "X-FB-Request-Analytics-Tags"
            r4.setRequestProperty(r0, r7)     // Catch:{ IOException -> 0x00fd }
        L_0x0092:
            X.46Q r0 = X.AnonymousClass2C4.A00
            X.4C6 r2 = X.AnonymousClass349.A02(r0)
            r8 = 0
            r3 = 0
            com.whatsapp.media.download.cronet.CronetMediaDownload$getDownloadResponse$timeoutJob$1 r1 = new com.whatsapp.media.download.cronet.CronetMediaDownload$getDownloadResponse$timeoutJob$1
            r1.<init>(r9, r4, r8)
            r0 = 3
            X.4Gj r7 = X.C616131n.A02(r8, r1, r2, r8, r0)
            int r2 = r4.getResponseCode()     // Catch:{ Exception -> 0x00d8 }
            r7.AyX(r8)
            r7.AyX(r8)
            java.lang.String r0 = "CronetMediaDownload/connect successful"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 200(0xc8, float:2.8E-43)
            if (r2 == r0) goto L_0x0285
            r0 = 206(0xce, float:2.89E-43)
            if (r2 == r0) goto L_0x0285
            java.io.InputStream r8 = r4.getErrorStream()
            if (r8 == 0) goto L_0x024e
            r0 = 1024(0x400, double:5.06E-321)
            X.6uL r7 = new X.6uL     // Catch:{ IOException -> 0x0248 }
            r7.<init>(r8, r0)     // Catch:{ IOException -> 0x0248 }
            java.lang.String r3 = X.C624535b.A00(r7)     // Catch:{ all -> 0x00d1 }
            r7.close()     // Catch:{ IOException -> 0x0248 }
            goto L_0x024e
        L_0x00d1:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00d3 }
        L_0x00d3:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r7, r1)     // Catch:{ IOException -> 0x0248 }
            throw r0     // Catch:{ IOException -> 0x0248 }
        L_0x00d8:
            r2 = move-exception
            X.1ip r0 = r9.A00     // Catch:{ all -> 0x00f8 }
            boolean r0 = r0.A0F()     // Catch:{ all -> 0x00f8 }
            if (r0 == 0) goto L_0x00f2
            boolean r0 = r2 instanceof java.io.IOException     // Catch:{ all -> 0x00f8 }
            if (r0 == 0) goto L_0x00ea
            java.net.SocketTimeoutException r2 = new java.net.SocketTimeoutException     // Catch:{ all -> 0x00f8 }
            r2.<init>()     // Catch:{ all -> 0x00f8 }
        L_0x00ea:
            java.lang.String r1 = "failed with Exception while retrieving response"
            X.1fo r0 = new X.1fo     // Catch:{ all -> 0x00f8 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x00f8 }
        L_0x00f1:
            throw r0     // Catch:{ all -> 0x00f8 }
        L_0x00f2:
            X.1fo r0 = new X.1fo     // Catch:{ all -> 0x00f8 }
            r0.<init>()     // Catch:{ all -> 0x00f8 }
            goto L_0x00f1
        L_0x00f8:
            r2 = move-exception
            r7.AyX(r8)
            throw r2
        L_0x00fd:
            r2 = move-exception
            X.1ip r0 = r9.A00
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x010c
            X.1fo r0 = new X.1fo
            r0.<init>()
            throw r0
        L_0x010c:
            java.lang.String r1 = "failed to open http url connection"
            X.1fo r0 = new X.1fo
            r0.<init>(r1, r2)
            throw r0
        L_0x0114:
            X.2p6 r5 = r8.A04
            boolean r10 = r5.A01()
            boolean r4 = r5.A01()
            if (r4 != 0) goto L_0x012e
            r12 = 0
        L_0x0121:
            X.3FI r4 = r8.A07
            java.lang.String r14 = r4.A00()
            X.2pq r9 = r8.A06
            X.1ip r8 = r8.A00
            java.lang.String r13 = "-"
            goto L_0x0137
        L_0x012e:
            X.1VX r5 = r5.A03
            r4 = 58
            boolean r12 = r5.A0Y(r9, r4)
            goto L_0x0121
        L_0x0137:
            java.net.URLConnection r4 = r6.openConnection()     // Catch:{ IOException -> 0x02c7 }
            javax.net.ssl.HttpsURLConnection r4 = (javax.net.ssl.HttpsURLConnection) r4     // Catch:{ IOException -> 0x02c7 }
            r5 = 0
            if (r10 == 0) goto L_0x0141
            goto L_0x0146
        L_0x0141:
            X.1r8 r10 = r9.A02()
            goto L_0x0151
        L_0x0146:
            X.3fm r10 = r9.A01(r5)
            if (r12 == 0) goto L_0x0151
            java.lang.String r9 = r11.A06
            X.C72353da.A00(r9, r4)
        L_0x0151:
            int r9 = r10.B5o()
            r4.setSSLSocketFactory(r10)
            X.C18270x1.A1J(r4)
            java.lang.String r12 = "User-Agent"
            r4.setRequestProperty(r12, r14)
            java.lang.String r14 = "Accept-Encoding"
            java.lang.String r12 = "identity"
            r4.setRequestProperty(r14, r12)
            java.lang.String r12 = "Host"
            java.lang.String r11 = r11.A06
            r4.setRequestProperty(r12, r11)
            r16 = 0
            r14 = -1
            int r11 = (r23 > r16 ? 1 : (r23 == r16 ? 0 : -1))
            if (r11 != 0) goto L_0x017a
            int r11 = (r25 > r14 ? 1 : (r25 == r14 ? 0 : -1))
            if (r11 == 0) goto L_0x019b
        L_0x017a:
            java.lang.StringBuilder r12 = X.AnonymousClass001.A0o()
            java.lang.String r11 = "bytes="
            r12.append(r11)
            r12.append(r2)
            java.lang.String r3 = X.AnonymousClass000.A0X(r13, r12)
            int r2 = (r25 > r14 ? 1 : (r25 == r14 ? 0 : -1))
            if (r2 == 0) goto L_0x0196
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r3 = X.AnonymousClass000.A0Z(r3, r2, r0)
        L_0x0196:
            java.lang.String r0 = "Range"
            r4.setRequestProperty(r0, r3)
        L_0x019b:
            if (r18 == 0) goto L_0x01a4
            java.lang.String r1 = "X-FB-Socket-Option"
            java.lang.String r0 = "TCP_CONGESTION=bbr"
            r4.setRequestProperty(r1, r0)
        L_0x01a4:
            if (r21 == 0) goto L_0x01ab
            java.lang.String r0 = "X-FB-Request-Analytics-Tags"
            r4.setRequestProperty(r0, r7)
        L_0x01ab:
            int r7 = r4.getResponseCode()     // Catch:{ IllegalArgumentException -> 0x02be, IOException -> 0x02a4 }
            int r0 = r10.B5o()
            if (r0 != r9) goto L_0x01b6
            r5 = 1
        L_0x01b6:
            r0 = 200(0xc8, float:2.8E-43)
            if (r7 == r0) goto L_0x0237
            r0 = 206(0xce, float:2.89E-43)
            if (r7 == r0) goto L_0x0237
            java.io.InputStream r0 = r4.getErrorStream()
            r3 = 0
            if (r0 == 0) goto L_0x0202
            java.io.InputStream r8 = r4.getErrorStream()     // Catch:{ IOException -> 0x01fc }
            r0 = 1024(0x400, double:5.06E-321)
            X.6uL r2 = new X.6uL     // Catch:{ all -> 0x01f0 }
            r2.<init>(r8, r0)     // Catch:{ all -> 0x01f0 }
            java.lang.String r3 = X.C624535b.A00(r2)     // Catch:{ all -> 0x01e6 }
            java.lang.String r1 = ""
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x01e6 }
            if (r0 != 0) goto L_0x01dd
            r3 = r1
        L_0x01dd:
            r2.close()     // Catch:{ all -> 0x01f0 }
            if (r8 == 0) goto L_0x0202
            r8.close()     // Catch:{ IOException -> 0x01fc }
            goto L_0x0202
        L_0x01e6:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x01eb }
            goto L_0x01ef
        L_0x01eb:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01f0 }
        L_0x01ef:
            throw r1     // Catch:{ all -> 0x01f0 }
        L_0x01f0:
            r1 = move-exception
            if (r8 == 0) goto L_0x01fb
            r8.close()     // Catch:{ all -> 0x01f7 }
            goto L_0x01fb
        L_0x01f7:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x01fc }
        L_0x01fb:
            throw r1     // Catch:{ IOException -> 0x01fc }
        L_0x01fc:
            r1 = move-exception
            java.lang.String r0 = "MediaDownloadConnection/download/can't get string from error stream"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0202:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaDownloadConnection/download failed; url="
            r1.append(r0)
            java.lang.String r0 = X.C57392tZ.A01(r6)
            r1.append(r0)
            java.lang.String r0 = " responseCode="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " responseBody="
            X.C18260x0.A0t(r0, r3, r1)
            r0 = 416(0x1a0, float:5.83E-43)
            if (r7 != r0) goto L_0x029e
            java.lang.String r0 = "Content-Range"
            java.lang.String r1 = r4.getHeaderField(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0298
            java.lang.String r0 = "*/"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0298
        L_0x0237:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r4, r0)
            java.lang.Object r4 = r0.first
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4
            java.lang.Object r1 = r0.second
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            goto L_0x0286
        L_0x0248:
            r1 = move-exception
            java.lang.String r0 = "CronetMediaDownload/download/can't get string from error stream"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x024e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CronetMediaDownload/download failed; url="
            r1.append(r0)
            java.lang.String r0 = X.C57392tZ.A01(r6)
            r1.append(r0)
            r0 = 32
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " body: "
            X.C18260x0.A0t(r0, r3, r1)
            r0 = 416(0x1a0, float:5.83E-43)
            if (r2 != r0) goto L_0x0292
            java.lang.String r0 = "Content-Range"
            java.lang.String r1 = r4.getHeaderField(r0)
            if (r1 == 0) goto L_0x028c
            int r0 = r1.length()
            if (r0 == 0) goto L_0x028c
            java.lang.String r0 = "*/"
            boolean r0 = X.C175728Zm.A0S(r1, r0, r5)
            if (r0 == 0) goto L_0x028c
        L_0x0285:
            r1 = 0
        L_0x0286:
            X.3PZ r0 = new X.3PZ
            r0.<init>(r1, r4)
            return r0
        L_0x028c:
            X.4uq r0 = new X.4uq
            r0.<init>(r2, r3)
            throw r0
        L_0x0292:
            X.4uq r0 = new X.4uq
            r0.<init>(r2, r3)
            throw r0
        L_0x0298:
            X.4uq r2 = new X.4uq
            r2.<init>(r7, r3)
            throw r2
        L_0x029e:
            X.4uq r2 = new X.4uq
            r2.<init>(r7, r3)
            throw r2
        L_0x02a4:
            r1 = move-exception
            java.lang.String r0 = "MediaDownloadConnection/exception while getting response code"
            com.whatsapp.util.Log.w(r0, r1)
            boolean r0 = r8.A0F()
            if (r0 != 0) goto L_0x02b6
            X.1fo r2 = new X.1fo
            r2.<init>()
            throw r2
        L_0x02b6:
            java.lang.String r0 = "failed with IOException while retrieving response"
            X.1fo r2 = new X.1fo
            r2.<init>(r0, r1)
            throw r2
        L_0x02be:
            r1 = move-exception
            java.lang.String r0 = "failed with IllegalArgumentException while retrieving response"
            X.1fo r2 = new X.1fo
            r2.<init>(r0, r1)
            throw r2
        L_0x02c7:
            r1 = move-exception
            boolean r0 = r8.A0F()
            if (r0 != 0) goto L_0x02d4
            X.1fo r2 = new X.1fo
            r2.<init>()
            throw r2
        L_0x02d4:
            java.lang.String r0 = "failed to open http url connection"
            X.1fo r2 = new X.1fo
            r2.<init>(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55002pd.A01(X.7US, java.lang.String, java.net.URL, long, long, boolean):X.4GL");
    }

    public AnonymousClass4GL A03(String str, URL url) {
        C60872zJ r2 = this.A02;
        if (!AnonymousClass000.A1S(r2.A02() ? 1 : 0)) {
            return A02(str, "DELETE", url);
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) r2.A02.A01().openConnection(url);
        httpURLConnection.setReadTimeout(30000);
        httpURLConnection.setRequestMethod("DELETE");
        httpURLConnection.setRequestProperty("Host", str);
        C18280x3.A0z(this.A07, httpURLConnection);
        httpURLConnection.connect();
        return new AnonymousClass3PZ((Boolean) null, httpURLConnection);
    }

    public C55002pd(C29441ip r1, C57162tC r2, C60872zJ r3, AnonymousClass1VX r4, C54672p6 r5, AnonymousClass2OR r6, C55132pq r7, AnonymousClass3FI r8) {
        this.A03 = r4;
        this.A07 = r8;
        this.A02 = r3;
        this.A06 = r7;
        this.A05 = r6;
        this.A04 = r5;
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [X.3fm] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4GL A02(java.lang.String r7, java.lang.String r8, java.net.URL r9) {
        /*
            r6 = this;
            java.net.URLConnection r4 = r9.openConnection()
            javax.net.ssl.HttpsURLConnection r4 = (javax.net.ssl.HttpsURLConnection) r4
            X.2p6 r2 = r6.A04
            boolean r1 = r2.A01()
            r5 = 0
            X.2pq r0 = r6.A06
            if (r1 == 0) goto L_0x0042
            X.3fm r3 = r0.A01(r5)
            boolean r0 = r2.A01()
            if (r0 == 0) goto L_0x002a
            X.1VX r2 = r2.A03
            r1 = 58
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x002a
            X.C72353da.A00(r7, r4)
        L_0x002a:
            int r1 = r3.B5o()
            r4.setSSLSocketFactory(r3)
            X.C18270x1.A1J(r4)
            r4.setRequestMethod(r8)
            java.lang.String r0 = "Host"
            r4.setRequestProperty(r0, r7)
            X.3FI r0 = r6.A07
            X.C18280x3.A0z(r0, r4)
            goto L_0x0047
        L_0x0042:
            X.1r8 r3 = r0.A02()
            goto L_0x002a
        L_0x0047:
            r4.connect()     // Catch:{ IllegalArgumentException -> 0x005b }
            int r0 = r3.B5o()
            if (r0 != r1) goto L_0x0051
            r5 = 1
        L_0x0051:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            X.3PZ r0 = new X.3PZ
            r0.<init>(r1, r4)
            return r0
        L_0x005b:
            r1 = move-exception
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55002pd.A02(java.lang.String, java.lang.String, java.net.URL):X.4GL");
    }
}
