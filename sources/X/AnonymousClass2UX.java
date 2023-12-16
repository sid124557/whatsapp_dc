package X;

/* renamed from: X.2UX  reason: invalid class name */
public final class AnonymousClass2UX {
    /* JADX WARNING: Can't wrap try/catch for region: R(8:2|3|(1:7)|8|(4:10|11|12|(1:14))|15|16|17) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C60732z4 A00(java.lang.String r7) {
        /*
            r6 = this;
            r5 = 0
            if (r7 == 0) goto L_0x005a
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1H(r7)     // Catch:{ Exception -> 0x0044 }
            java.lang.String r0 = "pub_key"
            java.lang.String r4 = X.C18290x4.A0r(r0, r2)     // Catch:{ Exception -> 0x0044 }
            java.lang.String r0 = "prev_pub_key"
            r1 = 1
            java.lang.String r3 = X.C57282tO.A00(r0, r2, r1)     // Catch:{ Exception -> 0x0044 }
            if (r3 == 0) goto L_0x001e
            int r0 = r3.length()     // Catch:{ Exception -> 0x0044 }
            if (r0 != 0) goto L_0x001f
        L_0x001e:
            r3 = r5
        L_0x001f:
            java.lang.String r0 = "prev_pub_key_expiry"
            java.lang.String r1 = X.C57282tO.A00(r0, r2, r1)     // Catch:{ Exception -> 0x0044 }
            r2 = r5
            if (r1 == 0) goto L_0x003e
            java.lang.String r0 = "yyyyMMdd'T'HHmmss'Z'"
            java.text.SimpleDateFormat r0 = X.AnonymousClass0x7.A0u(r0)     // Catch:{ ParseException -> 0x003e }
            java.util.Date r0 = r0.parse(r1)     // Catch:{ ParseException -> 0x003e }
            if (r0 == 0) goto L_0x003e
            long r0 = r0.getTime()     // Catch:{ ParseException -> 0x003e }
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch:{ ParseException -> 0x003e }
        L_0x003e:
            X.2z4 r0 = new X.2z4     // Catch:{ Exception -> 0x0044 }
            r0.<init>(r2, r4, r3)     // Catch:{ Exception -> 0x0044 }
            return r0
        L_0x0044:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ExtensionsLogger/ExtensionsAssetVerification/toExtensionsAssetVerification : failed parsing asset verification response. Json : "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ". Exception:"
            java.lang.String r0 = X.AnonymousClass000.A0a(r0, r1, r2)
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x005a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2UX.A00(java.lang.String):X.2z4");
    }
}
