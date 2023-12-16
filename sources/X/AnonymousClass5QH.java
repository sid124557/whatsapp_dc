package X;

/* renamed from: X.5QH  reason: invalid class name */
public final class AnonymousClass5QH {
    public final C56492s4 A00;
    public final C29441ip A01;
    public final AnonymousClass5GH A02;
    public final AnonymousClass33K A03;

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        X.AnonymousClass2A8.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass5JM A00(X.AnonymousClass4GL r8) {
        /*
            r7 = this;
            r0 = 34
            r3 = 0
            X.2s4 r1 = r7.A00     // Catch:{ Exception -> 0x0041 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0041 }
            java.io.InputStream r6 = r8.B46(r1, r3, r0)     // Catch:{ Exception -> 0x0041 }
            org.json.JSONObject r1 = X.C624535b.A02(r6)     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0035
            java.lang.String r0 = "error"
            org.json.JSONObject r5 = r1.getJSONObject(r0)     // Catch:{ all -> 0x003a }
            r4 = 2
            r2 = 0
            if (r5 == 0) goto L_0x002f
            java.lang.String r0 = "code"
            int r1 = r5.optInt(r0)     // Catch:{ all -> 0x003a }
            java.lang.String r0 = "error_subcode"
            int r2 = r5.optInt(r0)     // Catch:{ all -> 0x003a }
        L_0x0029:
            X.5JM r0 = new X.5JM     // Catch:{ all -> 0x003a }
            r0.<init>(r5, r4, r1, r2)     // Catch:{ all -> 0x003a }
            goto L_0x0031
        L_0x002f:
            r1 = 0
            goto L_0x0029
        L_0x0031:
            r6.close()     // Catch:{ Exception -> 0x0041 }
            return r0
        L_0x0035:
            java.lang.IllegalStateException r0 = X.C18290x4.A0Y()     // Catch:{ all -> 0x003a }
            throw r0     // Catch:{ all -> 0x003a }
        L_0x003a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r6, r1)     // Catch:{ Exception -> 0x0041 }
            throw r0     // Catch:{ Exception -> 0x0041 }
        L_0x0041:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Failed to parse the error response: "
            X.C18260x0.A1Q(r1, r0, r2)
            r2 = 1
            r1 = 0
            X.5JM r0 = new X.5JM
            r0.<init>(r3, r2, r1, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5QH.A00(X.4GL):X.5JM");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0092, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.AnonymousClass2A8.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0096, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r3 = A00(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009e, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a5, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0097 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass5JM A01(java.lang.String r18, java.util.List r19) {
        /*
            r17 = this;
            java.lang.String r1 = "me"
            r7 = 34
            r14 = 0
            r3 = r18
            X.C162457s7.A0J(r3, r14)
            r2 = 1
            r4 = r17
            X.1ip r0 = r4.A01
            boolean r0 = r0.A0F()
            r11 = 0
            if (r0 != 0) goto L_0x001d
            r0 = -1
            X.5JM r3 = new X.5JM
            r3.<init>(r11, r0, r14, r14)
            return r3
        L_0x001d:
            java.lang.StringBuilder r3 = X.C86664Kz.A1N(r1, r3)
            java.lang.String r1 = ","
            X.63f r0 = X.C1221363f.A00
            r5 = r19
            java.lang.String r1 = X.C73723fy.A0A(r1, r5, r0)
            java.lang.String r0 = "&fields="
            r3.append(r0)
            java.lang.StringBuilder r6 = X.C18290x4.A0w(r1, r3)
            r0 = 24
            android.net.TrafficStats.setThreadStatsTag(r0)
            X.33K r8 = r4.A03     // Catch:{ IOException -> 0x00a6 }
            java.lang.String r10 = r3.toString()     // Catch:{ IOException -> 0x00a6 }
            java.lang.String r12 = "WhatsApp"
            java.util.Map r13 = X.C58152un.A0E     // Catch:{ IOException -> 0x00a6 }
            java.lang.Integer r9 = X.C18290x4.A0c()     // Catch:{ IOException -> 0x00a6 }
            r16 = r14
            r15 = r14
            X.4GL r5 = r8.A02(r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ IOException -> 0x00a6 }
            X.2s4 r1 = r4.A00     // Catch:{ IOException -> 0x0097 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x0097 }
            java.io.InputStream r7 = r5.B47(r1, r11, r0)     // Catch:{ IOException -> 0x0097 }
            java.lang.String r0 = X.C58152un.A0B     // Catch:{ all -> 0x0090 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x0090 }
            r3.<init>(r7, r0)     // Catch:{ all -> 0x0090 }
            r0 = 4096(0x1000, float:5.74E-42)
            char[] r1 = new char[r0]     // Catch:{ all -> 0x0090 }
        L_0x0063:
            int r0 = r3.read(r1)     // Catch:{ all -> 0x0090 }
            if (r0 < 0) goto L_0x006d
            r6.append(r1, r14, r0)     // Catch:{ all -> 0x0090 }
            goto L_0x0063
        L_0x006d:
            r0 = r5
            X.3PZ r0 = (X.AnonymousClass3PZ) r0     // Catch:{ all -> 0x0090 }
            java.net.HttpURLConnection r0 = r0.A01     // Catch:{ all -> 0x0090 }
            int r3 = r0.getResponseCode()     // Catch:{ all -> 0x0090 }
            r0 = 200(0xc8, float:2.8E-43)
            r1 = 1
            if (r3 != r0) goto L_0x007c
            r1 = 0
        L_0x007c:
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0090 }
            org.json.JSONObject r0 = X.AnonymousClass0x9.A1H(r0)     // Catch:{ all -> 0x0090 }
            X.5JM r3 = new X.5JM     // Catch:{ all -> 0x0090 }
            r3.<init>(r0, r1, r14, r14)     // Catch:{ all -> 0x0090 }
            r7.close()     // Catch:{ IOException -> 0x0097 }
            r5.close()     // Catch:{ IOException -> 0x00a6 }
            return r3
        L_0x0090:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0092 }
        L_0x0092:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r7, r1)     // Catch:{ IOException -> 0x0097 }
            throw r0     // Catch:{ IOException -> 0x0097 }
        L_0x0097:
            X.5JM r3 = r4.A00(r5)     // Catch:{ all -> 0x009f }
            r5.close()     // Catch:{ IOException -> 0x00a6 }
            return r3
        L_0x009f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a1 }
        L_0x00a1:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)     // Catch:{ IOException -> 0x00a6 }
            throw r0     // Catch:{ IOException -> 0x00a6 }
        L_0x00a6:
            X.5JM r0 = new X.5JM
            r0.<init>(r11, r2, r14, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5QH.A01(java.lang.String, java.util.List):X.5JM");
    }

    public AnonymousClass5QH(C56492s4 r1, C29441ip r2, AnonymousClass5GH r3, AnonymousClass33K r4) {
        C18260x0.A0c(r4, r1, r2, r3);
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
