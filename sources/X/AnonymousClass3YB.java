package X;

/* renamed from: X.3YB  reason: invalid class name */
public final class AnonymousClass3YB implements C84314Bw {
    public final AnonymousClass4FZ A00;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean AxE(X.AnonymousClass2PJ r6, X.C833648c r7, X.C833748d r8) {
        /*
            r5 = this;
            X.4FZ r0 = r5.A00
            X.3Wg r0 = (X.C69243Wg) r0
            android.content.Context r0 = r0.A00
            android.content.pm.PackageManager r4 = r0.getPackageManager()
            android.content.Intent r1 = X.C18320x8.A07()
            java.lang.String r0 = "com.facebook.GET_PHONE_ID"
            r1.setAction(r0)
            r0 = 128(0x80, float:1.794E-43)
            java.util.List r0 = r4.queryBroadcastReceivers(r1, r0)
            X.C162457s7.A0D(r0)
            java.lang.String r3 = "com.facebook.katana"
            java.util.Iterator r1 = r0.iterator()
        L_0x0022:
            boolean r0 = r1.hasNext()
            r2 = 0
            if (r0 == 0) goto L_0x0045
            java.lang.Object r0 = r1.next()
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            X.C626936e.A06(r0)
            java.lang.String r0 = r0.taskAffinity
            if (r0 == 0) goto L_0x0022
            boolean r0 = X.C175728Zm.A0S(r0, r3, r2)
            if (r0 == 0) goto L_0x0022
            android.content.pm.PackageInfo r0 = r4.getPackageInfo(r3, r2)     // Catch:{ NameNotFoundException -> 0x0047 }
            int r2 = r0.versionCode     // Catch:{ NameNotFoundException -> 0x0047 }
            goto L_0x004d
        L_0x0045:
            r1 = 0
            goto L_0x004f
        L_0x0047:
            r1 = move-exception
            java.lang.String r0 = "FacebookAppInfoHelper/getFacebookAppInfo/ failed to retrieve version code for FB app"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x004d:
            r1 = r2
            r2 = 1
        L_0x004f:
            X.2ko r0 = new X.2ko
            r0.<init>(r2, r1)
            boolean r0 = r0.A01
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3YB.AxE(X.2PJ, X.48c, X.48d):boolean");
    }

    public AnonymousClass3YB(AnonymousClass4FZ r1) {
        this.A00 = r1;
    }
}
