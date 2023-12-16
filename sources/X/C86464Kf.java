package X;

/* renamed from: X.4Kf  reason: invalid class name and case insensitive filesystem */
public class C86464Kf implements C182538oa {
    public Object A00;
    public final int A01;

    public C86464Kf(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: X.7US} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: X.2nD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: X.7US} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: X.7US} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: X.7US} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C161997qy BkH(X.AnonymousClass7US r19) {
        /*
            r18 = this;
            r2 = r19
            r1 = r18
            int r0 = r1.A01
            java.lang.Object r3 = r1.A00
            if (r0 == 0) goto L_0x00d0
            X.1i8 r3 = (X.C29011i8) r3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "routeselector/prewarm/route = "
            r1.append(r0)
            java.lang.String r4 = r2.A02
            X.C18260x0.A1J(r1, r4)
            X.2M6 r5 = r3.A0F
            java.lang.String r9 = r2.A06
            r7 = 0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "prewarmer/sendrequest/checking authority "
            X.C18260x0.A0s(r0, r4, r1)
            r0 = 2
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ MalformedURLException -> 0x00b5, IOException -> 0x00a2 }
            android.net.Uri$Builder r3 = new android.net.Uri$Builder     // Catch:{ MalformedURLException -> 0x00b5, IOException -> 0x00a2 }
            r3.<init>()     // Catch:{ MalformedURLException -> 0x00b5, IOException -> 0x00a2 }
            java.lang.String r0 = "https"
            android.net.Uri$Builder r0 = r3.scheme(r0)     // Catch:{ MalformedURLException -> 0x00b5, IOException -> 0x00a2 }
            android.net.Uri$Builder r1 = r0.encodedAuthority(r4)     // Catch:{ MalformedURLException -> 0x00b5, IOException -> 0x00a2 }
            java.lang.String r0 = "prewarm"
            r1.appendPath(r0)     // Catch:{ MalformedURLException -> 0x00b5, IOException -> 0x00a2 }
            java.lang.String r0 = X.C18300x5.A0f(r3)     // Catch:{ MalformedURLException -> 0x00b5, IOException -> 0x00a2 }
            java.net.URL r8 = X.C18330xA.A0B(r0)     // Catch:{ MalformedURLException -> 0x00b5, IOException -> 0x00a2 }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ MalformedURLException -> 0x00b5, IOException -> 0x00a2 }
            X.2pd r6 = r5.A00     // Catch:{ MalformedURLException -> 0x00b5, IOException -> 0x00a2 }
            X.2zJ r1 = r6.A02     // Catch:{ MalformedURLException -> 0x00b5, IOException -> 0x00a2 }
            boolean r0 = r1.A02()     // Catch:{ MalformedURLException -> 0x00b5, IOException -> 0x00a2 }
            boolean r0 = X.AnonymousClass000.A1S(r0)
            java.lang.String r3 = "POST"
            if (r0 == 0) goto L_0x0085
            X.6hg r0 = r1.A02     // Catch:{ MalformedURLException -> 0x00b5, IOException -> 0x00a2 }
            org.chromium.net.CronetEngine r0 = r0.A01()     // Catch:{ MalformedURLException -> 0x00b5, IOException -> 0x00a2 }
            java.net.URLConnection r1 = r0.openConnection(r8)     // Catch:{ MalformedURLException -> 0x00b5, IOException -> 0x00a2 }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ MalformedURLException -> 0x00b5, IOException -> 0x00a2 }
            r0 = 30000(0x7530, float:4.2039E-41)
            r1.setReadTimeout(r0)     // Catch:{ MalformedURLException -> 0x00b5, IOException -> 0x00a2 }
            r1.setRequestMethod(r3)     // Catch:{ MalformedURLException -> 0x00b5, IOException -> 0x00a2 }
            java.lang.String r0 = "Host"
            r1.setRequestProperty(r0, r9)     // Catch:{ MalformedURLException -> 0x00b5, IOException -> 0x00a2 }
            X.3FI r0 = r6.A07     // Catch:{ MalformedURLException -> 0x00b5, IOException -> 0x00a2 }
            X.C18280x3.A0z(r0, r1)     // Catch:{ MalformedURLException -> 0x00b5, IOException -> 0x00a2 }
            r1.connect()     // Catch:{ MalformedURLException -> 0x00b5, IOException -> 0x00a2 }
            X.3PZ r3 = new X.3PZ     // Catch:{ MalformedURLException -> 0x00b5, IOException -> 0x00a2 }
            r3.<init>(r7, r1)     // Catch:{ MalformedURLException -> 0x00b5, IOException -> 0x00a2 }
            goto L_0x0089
        L_0x0085:
            X.4GL r3 = r6.A02(r9, r3, r8)     // Catch:{ MalformedURLException -> 0x00b5, IOException -> 0x00a2 }
        L_0x0089:
            android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0098 }
            r0 = r3
            X.3PZ r0 = (X.AnonymousClass3PZ) r0     // Catch:{ all -> 0x0098 }
            java.net.HttpURLConnection r0 = r0.A01     // Catch:{ all -> 0x0098 }
            r0.getResponseCode()     // Catch:{ all -> 0x0098 }
            r3.close()     // Catch:{ MalformedURLException -> 0x00b5, IOException -> 0x00a2 }
            goto L_0x00bc
        L_0x0098:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x009d }
            goto L_0x00a1
        L_0x009d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ MalformedURLException -> 0x00b5, IOException -> 0x00a2 }
        L_0x00a1:
            throw r1     // Catch:{ MalformedURLException -> 0x00b5, IOException -> 0x00a2 }
        L_0x00a2:
            r3 = move-exception
            X.2p6 r1 = r5.A01     // Catch:{ all -> 0x00cb }
            boolean r0 = r1.A02(r3)     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x00ae
            r1.A00()     // Catch:{ all -> 0x00cb }
        L_0x00ae:
            java.lang.String r0 = "prewarmer/sendrequest/error opening connection"
            com.whatsapp.util.Log.w(r0, r3)     // Catch:{ all -> 0x00cb }
            goto L_0x00bc
        L_0x00b5:
            r1 = move-exception
            java.lang.String r0 = "prewarmer/sendrequest/error forming URL"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00cb }
        L_0x00bc:
            android.net.TrafficStats.clearThreadStatsTag()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "routeselector/prewarm/finished; route = "
            X.C18260x0.A0q(r0, r4, r1)
            goto L_0x01ea
        L_0x00cb:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x00d0:
            X.2dD r3 = (X.C47412dD) r3
            X.5Ie r1 = r3.A07
            X.2pd r5 = r3.A02
            int r4 = r2.A00
            boolean r0 = X.AnonymousClass000.A1T(r4)
            r5.A00(r2, r0)
            X.1qP r0 = r3.A08
            android.net.Uri$Builder r6 = r0.A03(r2)
            java.lang.String r5 = "resume"
            java.lang.String r0 = "1"
            r6.appendQueryParameter(r5, r0)
            java.lang.String r13 = X.C18300x5.A0f(r6)
            X.2zJ r9 = r3.A00
            X.2p6 r11 = r3.A03
            X.2cX r10 = r3.A01
            X.5Js r12 = r3.A06
            java.lang.String r14 = r3.A0A
            X.3Pc r8 = new X.3Pc
            r8.<init>(r9, r10, r11, r12, r13, r14)
            X.2nD r0 = new X.2nD
            r0.<init>()
            r8.A00 = r0
            X.2cX r12 = r8.A02
            java.lang.String r14 = r8.A05
            r16 = 10
            boolean r17 = X.AnonymousClass000.A1T(r4)
            java.lang.String r0 = r8.A06
            r13 = r8
            r15 = r0
            X.30q r0 = r12.A00(r13, r14, r15, r16, r17)
            int r6 = r0.A03(r2)     // Catch:{ IOException -> 0x0152 }
            X.5Js r7 = r8.A04     // Catch:{ IOException -> 0x0152 }
            long r4 = r0.A00     // Catch:{ IOException -> 0x0152 }
            r7.A00 = r4     // Catch:{ IOException -> 0x0152 }
            long r4 = r0.A01     // Catch:{ IOException -> 0x0152 }
            r7.A02 = r4     // Catch:{ IOException -> 0x0152 }
            long r4 = (long) r6     // Catch:{ IOException -> 0x0152 }
            r7.A01 = r4     // Catch:{ IOException -> 0x0152 }
            java.lang.String r2 = r0.A03     // Catch:{ IOException -> 0x0152 }
            r7.A04 = r2     // Catch:{ IOException -> 0x0152 }
            java.lang.Boolean r2 = r0.A02     // Catch:{ IOException -> 0x0152 }
            r7.A03 = r2     // Catch:{ IOException -> 0x0152 }
            if (r6 < 0) goto L_0x0138
            r2 = 400(0x190, float:5.6E-43)
            if (r6 < r2) goto L_0x0190
        L_0x0138:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0152 }
            java.lang.String r2 = "mediaupload/MMS upload resume form post failed/error="
            r4.append(r2)     // Catch:{ IOException -> 0x0152 }
            r4.append(r6)     // Catch:{ IOException -> 0x0152 }
            java.lang.String r2 = "; url="
            X.C18260x0.A0t(r2, r14, r4)     // Catch:{ IOException -> 0x0152 }
            X.2nD r4 = r8.A00     // Catch:{ IOException -> 0x0152 }
            r4.A00 = r6     // Catch:{ IOException -> 0x0152 }
            X.580 r2 = X.AnonymousClass580.FAILURE     // Catch:{ IOException -> 0x0152 }
            r4.A02 = r2     // Catch:{ IOException -> 0x0152 }
            goto L_0x0190
        L_0x0152:
            r5 = move-exception
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "mediaupload/MMS upload resume form post failed; url="
            X.C18260x0.A0v(r2, r14, r4, r5)
            X.2p6 r2 = r8.A03
            boolean r2 = r2.A02(r5)
            X.2nD r4 = r8.A00
            if (r2 == 0) goto L_0x01db
            X.580 r2 = X.AnonymousClass580.WATLS_ERROR
        L_0x0168:
            r4.A02 = r2
            boolean r2 = X.C154457dC.A01(r5)
            if (r2 != 0) goto L_0x0182
            boolean r2 = r5 instanceof org.chromium.net.CronetException
            if (r2 == 0) goto L_0x0182
            r2 = 0
            java.lang.String r5 = X.C60872zJ.A00(r5, r2)
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "CronetException"
            X.C18260x0.A0r(r2, r5, r4)
        L_0x0182:
            X.5Js r2 = r8.A04
            long r4 = r0.A00
            r2.A00 = r4
            long r4 = r0.A01
            r2.A02 = r4
            java.lang.Boolean r0 = r0.A02
            r2.A03 = r0
        L_0x0190:
            X.2nD r2 = r8.A00
            X.2WV r5 = r3.A04
            java.lang.String r4 = r2.A03
            r0 = 0
            java.lang.String r0 = r5.A00(r4, r0)
            r2.A03 = r0
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "resumecheck/http/result="
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = "; hash="
            r4.append(r0)
            java.lang.String r0 = r3.A09
            X.C18260x0.A1J(r4, r0)
            X.580 r3 = r2.A02
            if (r3 != 0) goto L_0x01bc
            X.580 r3 = X.AnonymousClass580.FAILURE
            r2.A02 = r3
        L_0x01bc:
            X.580 r0 = X.AnonymousClass580.WATLS_ERROR
            if (r3 != r0) goto L_0x01d0
            java.lang.String r0 = "resumecheck/attempting fallback MMS upload form post - watls error"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r11.A00()
        L_0x01c9:
            int r0 = r2.A00
            X.7qy r0 = X.C161997qy.A03(r2, r0)
            return r0
        L_0x01d0:
            X.580 r0 = X.AnonymousClass580.FAILURE
            if (r3 != r0) goto L_0x01de
            java.lang.String r0 = "resumecheck/attempting fallback MMS upload form post"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x01c9
        L_0x01db:
            X.580 r2 = X.AnonymousClass580.FAILURE
            goto L_0x0168
        L_0x01de:
            X.580 r0 = X.AnonymousClass580.RESUME
            if (r3 != r0) goto L_0x01ea
            int r0 = r2.A01
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r1.A02 = r0
        L_0x01ea:
            X.7qy r0 = X.C161997qy.A02(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86464Kf.BkH(X.7US):X.7qy");
    }
}
