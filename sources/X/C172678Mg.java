package X;

/* renamed from: X.8Mg  reason: invalid class name and case insensitive filesystem */
public final class C172678Mg implements Runnable {
    public static final C151737Wc A02 = new C151737Wc("RevokeAccessOperation", new String[0]);
    public final C127176Qx A00 = new C127176Qx((C159087l6) null);
    public final String A01;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            com.google.android.gms.common.api.Status r5 = com.google.android.gms.common.api.Status.A07
            r3 = 0
            java.lang.String r2 = r6.A01     // Catch:{ IOException -> 0x0049, Exception -> 0x0059 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0049, Exception -> 0x0059 }
            java.lang.String r0 = "https://accounts.google.com/o/oauth2/revoke?token="
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r2, r1)     // Catch:{ IOException -> 0x0049, Exception -> 0x0059 }
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x0049, Exception -> 0x0059 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0049, Exception -> 0x0059 }
            java.net.URLConnection r2 = r0.openConnection()     // Catch:{ IOException -> 0x0049, Exception -> 0x0059 }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ IOException -> 0x0049, Exception -> 0x0059 }
            java.lang.String r1 = "Content-Type"
            java.lang.String r0 = "application/x-www-form-urlencoded"
            r2.setRequestProperty(r1, r0)     // Catch:{ IOException -> 0x0049, Exception -> 0x0059 }
            int r4 = r2.getResponseCode()     // Catch:{ IOException -> 0x0049, Exception -> 0x0059 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r4 != r0) goto L_0x003d
            com.google.android.gms.common.api.Status r5 = com.google.android.gms.common.api.Status.A09     // Catch:{ IOException -> 0x0049, Exception -> 0x0059 }
        L_0x002b:
            X.7Wc r2 = A02     // Catch:{ IOException -> 0x0049, Exception -> 0x0059 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0049, Exception -> 0x0059 }
            java.lang.String r0 = "Response Code: "
            java.lang.String r1 = X.AnonymousClass000.A0Y(r0, r1, r4)     // Catch:{ IOException -> 0x0049, Exception -> 0x0059 }
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x0049, Exception -> 0x0059 }
            r2.A00(r1, r0)     // Catch:{ IOException -> 0x0049, Exception -> 0x0059 }
            goto L_0x007c
        L_0x003d:
            X.7Wc r0 = A02     // Catch:{ IOException -> 0x0049, Exception -> 0x0059 }
            java.lang.String r2 = "Unable to revoke access!"
            java.lang.String r1 = "RevokeAccessOperation"
            java.lang.String r0 = r0.A03     // Catch:{ IOException -> 0x0049, Exception -> 0x0059 }
            X.AnonymousClass6C9.A14(r0, r2, r1)     // Catch:{ IOException -> 0x0049, Exception -> 0x0059 }
            goto L_0x002b
        L_0x0049:
            r0 = move-exception
            X.7Wc r4 = A02
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r0 = "IOException when revoking access: "
            goto L_0x0068
        L_0x0059:
            r0 = move-exception
            X.7Wc r4 = A02
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r0 = "Exception when revoking access: "
        L_0x0068:
            java.lang.String r2 = r0.concat(r1)
            java.lang.String r1 = "RevokeAccessOperation"
            int r0 = r3.length
            if (r0 <= 0) goto L_0x0077
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = java.lang.String.format(r0, r2, r3)
        L_0x0077:
            java.lang.String r0 = r4.A03
            X.AnonymousClass6C9.A14(r0, r2, r1)
        L_0x007c:
            X.6Qx r0 = r6.A00
            r0.A05(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172678Mg.run():void");
    }

    public C172678Mg(String str) {
        C162177rO.A05(str);
        this.A01 = str;
    }
}
