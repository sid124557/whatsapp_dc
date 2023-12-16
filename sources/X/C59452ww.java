package X;

import java.io.File;

/* renamed from: X.2ww  reason: invalid class name and case insensitive filesystem */
public final class C59452ww {
    public final C56352rq A00;
    public final C56492s4 A01;
    public final C48092eK A02;

    public static final AnonymousClass39M A00(File file, String str, String str2) {
        AnonymousClass39M r4 = new AnonymousClass39M((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, false, false, false, false, false);
        r4.A0G = str2;
        String str3 = str;
        r4.A0D = str3;
        r4.A0A = str3;
        r4.A0C = "image/webp";
        File file2 = file;
        r4.A00 = (int) file2.length();
        r4.A03 = 512;
        r4.A02 = 512;
        AnonymousClass39M.A02(r4, file2);
        return r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0080, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0084, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass39M A01(java.lang.String r9, boolean r10) {
        /*
            r8 = this;
            r3 = 0
            X.C162457s7.A0J(r9, r3)
            byte[] r0 = X.AnonymousClass0x2.A1a(r9)
            java.lang.String r0 = X.C18290x4.A0t(r0)
            java.lang.String r0 = X.C627236i.A04(r0)
            java.lang.String r6 = java.lang.String.valueOf(r0)
            if (r10 == 0) goto L_0x0031
            X.2eK r2 = r8.A02
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            X.AnonymousClass0x2.A1M(r1, r6)
            java.lang.String r0 = ".webp"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            java.io.File r7 = r2.A01(r0)
        L_0x0029:
            boolean r0 = r7.exists()
            if (r0 != 0) goto L_0x00b3
            r2 = 0
            goto L_0x0038
        L_0x0031:
            X.2rq r0 = r8.A00
            java.io.File r7 = r0.A02(r6)
            goto L_0x0029
        L_0x0038:
            java.net.URL r1 = X.C18330xA.A0B(r9)     // Catch:{ Exception -> 0x008b }
            r0 = 9
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ Exception -> 0x008b }
            java.net.URLConnection r5 = r1.openConnection()     // Catch:{ Exception -> 0x008b }
            java.lang.String r0 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            X.C162457s7.A0K(r5, r0)     // Catch:{ Exception -> 0x008b }
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ Exception -> 0x008b }
            r5.connect()     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            X.2s4 r0 = r8.A01     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            X.1zz r4 = X.C36851zz.A01(r0, r5, r3)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            java.lang.String r0 = ".webp"
            boolean r0 = X.C175728Zm.A0S(r9, r0, r3)     // Catch:{ all -> 0x007e }
            if (r0 == 0) goto L_0x0062
            X.C627536m.A0R(r7, r4)     // Catch:{ all -> 0x007e }
            goto L_0x007a
        L_0x0062:
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r4)     // Catch:{ all -> 0x007e }
            X.C162457s7.A0H(r3)     // Catch:{ all -> 0x007e }
            r2 = 80
            java.io.FileOutputStream r1 = X.AnonymousClass0x9.A0h(r7)     // Catch:{ all -> 0x007e }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.WEBP     // Catch:{ all -> 0x007e }
            r3.compress(r0, r2, r1)     // Catch:{ all -> 0x007e }
            r1.flush()     // Catch:{ all -> 0x007e }
            r1.close()     // Catch:{ all -> 0x007e }
        L_0x007a:
            r4.close()     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            goto L_0x00ad
        L_0x007e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0080 }
        L_0x0080:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            throw r0     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
        L_0x0085:
            r0 = move-exception
            r2 = r5
            goto L_0x0091
        L_0x0088:
            r0 = move-exception
            r2 = r5
            goto L_0x008c
        L_0x008b:
            r0 = move-exception
        L_0x008c:
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x0090 }
            goto L_0x009a
        L_0x0090:
            r0 = move-exception
        L_0x0091:
            if (r2 == 0) goto L_0x0096
            r2.disconnect()
        L_0x0096:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x009a:
            if (r2 == 0) goto L_0x009f
            r2.disconnect()
        L_0x009f:
            android.net.TrafficStats.clearThreadStatsTag()
            java.lang.String r0 = "StickerMaker/createFromUrl/local file cannot be created"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.io.IOException r0 = new java.io.IOException
            r0.<init>()
            throw r0
        L_0x00ad:
            r5.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
        L_0x00b3:
            X.39M r0 = A00(r7, r6, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59452ww.A01(java.lang.String, boolean):X.39M");
    }

    public C59452ww(C56352rq r1, C56492s4 r2, C48092eK r3) {
        C18260x0.A0V(r2, r1, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
