package X;

/* renamed from: X.7X6  reason: invalid class name */
public class AnonymousClass7X6 {
    public final C620633i A00;
    public final AnonymousClass1VX A01;
    public final C53652nR A02;
    public final AnonymousClass5I6 A03;
    public final String A04;
    public final C160077mz A05;
    public final C186398vF A06;
    public final boolean A07;

    public AnonymousClass7X6(C620633i r3, C54292oU r4, AnonymousClass1VX r5, C53652nR r6, String str, C186398vF r8, boolean z) {
        this.A05 = new C160077mz(r4.A00);
        this.A06 = r8;
        this.A01 = r5;
        this.A02 = r6;
        this.A00 = r3;
        this.A04 = str;
        this.A07 = z;
        this.A03 = new AnonymousClass5I6(r3, r4, new C138306q6());
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0090 A[Catch:{ SecurityException -> 0x00c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[Catch:{ SecurityException -> 0x00c4 }, ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.ContentProviderClient A00(android.content.Context r7, X.C151917Wu r8) {
        /*
            r6 = this;
            java.lang.String r4 = "app_not_installed"
            r5 = 0
            android.content.pm.PackageManager r3 = r7.getPackageManager()     // Catch:{ SecurityException -> 0x00c4 }
            if (r3 == 0) goto L_0x0031
            java.util.HashMap r2 = X.AnonymousClass001.A0t()     // Catch:{ SecurityException -> 0x00c4 }
            java.lang.String r1 = r8.A02     // Catch:{ NameNotFoundException -> 0x0023 }
            r0 = 0
            android.content.pm.ApplicationInfo r0 = r3.getApplicationInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x0023 }
            boolean r0 = r0.enabled     // Catch:{ NameNotFoundException -> 0x0023 }
            if (r0 != 0) goto L_0x0031
            java.lang.String r0 = "app_disabled"
            r2.put(r4, r0)     // Catch:{ NameNotFoundException -> 0x0023 }
            X.8vF r0 = r6.A06     // Catch:{ NameNotFoundException -> 0x0023 }
            r0.Bc0(r2, r8)     // Catch:{ NameNotFoundException -> 0x0023 }
            return r5
        L_0x0023:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ SecurityException -> 0x00c4 }
            r2.put(r4, r0)     // Catch:{ SecurityException -> 0x00c4 }
            X.8vF r0 = r6.A06     // Catch:{ SecurityException -> 0x00c4 }
            r0.Bc0(r2, r8)     // Catch:{ SecurityException -> 0x00c4 }
            return r5
        L_0x0031:
            android.net.Uri r3 = r8.A00     // Catch:{ SecurityException -> 0x00c4 }
            java.lang.String r4 = r6.A04     // Catch:{ SecurityException -> 0x00c4 }
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ SecurityException -> 0x00c4 }
            if (r0 != 0) goto L_0x008b
            boolean r0 = r6.A07     // Catch:{ SecurityException -> 0x00c4 }
            if (r0 == 0) goto L_0x0051
            X.2nR r2 = r6.A02     // Catch:{ SecurityException -> 0x00c4 }
            r1 = 6025(0x1789, float:8.443E-42)
            monitor-enter(r2)     // Catch:{ SecurityException -> 0x00c4 }
            r2.A01()     // Catch:{ all -> 0x004e }
            X.1VX r0 = r2.A02     // Catch:{ all -> 0x004e }
            java.lang.String r1 = r0.A0Q(r1)     // Catch:{ all -> 0x004e }
            goto L_0x005a
        L_0x004e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ SecurityException -> 0x00c4 }
            throw r0     // Catch:{ SecurityException -> 0x00c4 }
        L_0x0051:
            X.1VX r1 = r6.A01     // Catch:{ SecurityException -> 0x00c4 }
            r0 = 1010(0x3f2, float:1.415E-42)
            java.lang.String r1 = r1.A0Q(r0)     // Catch:{ SecurityException -> 0x00c4 }
            goto L_0x005b
        L_0x005a:
            monitor-exit(r2)     // Catch:{ SecurityException -> 0x00c4 }
        L_0x005b:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ SecurityException -> 0x00c4 }
            if (r0 != 0) goto L_0x008b
            X.C626936e.A06(r1)     // Catch:{ JSONException -> 0x0087 }
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1H(r1)     // Catch:{ JSONException -> 0x0087 }
            java.lang.String r0 = "access_library"
            org.json.JSONArray r2 = r1.getJSONArray(r0)     // Catch:{ JSONException -> 0x0087 }
            r1 = 0
        L_0x006f:
            int r0 = r2.length()     // Catch:{ SecurityException -> 0x00c4 }
            if (r1 >= r0) goto L_0x008b
            java.lang.String r0 = r2.getString(r1)     // Catch:{ JSONException -> 0x0080 }
            boolean r0 = r4.equalsIgnoreCase(r0)     // Catch:{ JSONException -> 0x0080 }
            if (r0 == 0) goto L_0x0084
            goto L_0x008d
        L_0x0080:
            r0 = move-exception
            X.C626936e.A0A(r0)     // Catch:{ SecurityException -> 0x00c4 }
        L_0x0084:
            int r1 = r1 + 1
            goto L_0x006f
        L_0x0087:
            r0 = move-exception
            X.C626936e.A0A(r0)     // Catch:{ SecurityException -> 0x00c4 }
        L_0x008b:
            r0 = 0
            goto L_0x008e
        L_0x008d:
            r0 = 1
        L_0x008e:
            if (r0 == 0) goto L_0x00c2
            X.5I6 r2 = r6.A03     // Catch:{ SecurityException -> 0x00c4 }
            java.lang.String r3 = r3.getAuthority()     // Catch:{ SecurityException -> 0x00c4 }
            if (r3 == 0) goto L_0x00c2
            android.content.pm.PackageManager r1 = r7.getPackageManager()     // Catch:{ SecurityException -> 0x00c4 }
            if (r1 == 0) goto L_0x00c2
            r0 = 0
            android.content.pm.ProviderInfo r0 = r1.resolveContentProvider(r3, r0)     // Catch:{ SecurityException -> 0x00c4 }
            if (r0 == 0) goto L_0x00c2
            X.2kp r1 = r2.A01     // Catch:{ SecurityException -> 0x00c4 }
            java.lang.String r0 = r0.packageName     // Catch:{ SecurityException -> 0x00c4 }
            r1.A02(r0)     // Catch:{ SecurityException -> 0x00c4 }
            X.33i r0 = r2.A00     // Catch:{ SecurityException -> 0x00c4 }
            X.5UR r0 = r0.A0R()     // Catch:{ SecurityException -> 0x00c4 }
            android.content.ContentResolver r2 = r0.A02()     // Catch:{ SecurityException -> 0x00c4 }
            X.2wm r1 = r0.A01     // Catch:{ SecurityException -> 0x00c4 }
            X.58S r0 = X.AnonymousClass58S.ACQUIRE_CONTENT_PROVIDER_CLIENT     // Catch:{ SecurityException -> 0x00c4 }
            r1.A00(r0, r3)     // Catch:{ SecurityException -> 0x00c4 }
            android.content.ContentProviderClient r0 = r2.acquireUnstableContentProviderClient(r3)     // Catch:{ SecurityException -> 0x00c4 }
            return r0
        L_0x00c2:
            r0 = 0
            return r0
        L_0x00c4:
            X.8vF r0 = r6.A06
            r0.Bbz(r8)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7X6.A00(android.content.Context, X.7Wu):android.content.ContentProviderClient");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0123, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 24) goto L_0x0125;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0103 A[Catch:{ RemoteException -> 0x0139, SecurityException -> 0x0134 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0119 A[Catch:{ RemoteException -> 0x0139, SecurityException -> 0x0134 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A01(android.content.Context r12, java.util.Set r13, boolean r14) {
        /*
            r11 = this;
            X.8vF r3 = r11.A06
            r3.Bc5()
            java.util.ArrayList r0 = X.AnonymousClass002.A0J(r13)
            r3.BMU(r0)
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            if (r14 == 0) goto L_0x0034
            java.util.List r0 = X.C1462379g.A0A
            java.util.Iterator r4 = X.AnonymousClass6C7.A0u(r0)
        L_0x001c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0052
            java.lang.Object r1 = r4.next()
            X.7Wu r1 = (X.C151917Wu) r1
            X.6xj r0 = r1.A04
            boolean r0 = r13.contains(r0)
            if (r0 == 0) goto L_0x001c
            r5.add(r1)
            goto L_0x001c
        L_0x0034:
            java.util.List r0 = X.C1462379g.A0B
            java.util.Iterator r4 = X.AnonymousClass6C7.A0u(r0)
        L_0x003a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0052
            java.lang.Object r1 = r4.next()
            X.7Wu r1 = (X.C151917Wu) r1
            X.6xj r0 = r1.A04
            boolean r0 = r13.contains(r0)
            if (r0 == 0) goto L_0x003a
            r5.add(r1)
            goto L_0x003a
        L_0x0052:
            java.util.Iterator r10 = r5.iterator()
        L_0x0056:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0145
            java.lang.Object r4 = r10.next()
            X.7Wu r4 = (X.C151917Wu) r4
            r3.BMw(r4)
            android.content.ContentProviderClient r5 = r11.A00(r12, r4)
            if (r14 == 0) goto L_0x00b4
            if (r5 == 0) goto L_0x013f
            r3.Bc1(r4)
            X.7mz r0 = r11.A05     // Catch:{ RemoteException -> 0x0139, SecurityException -> 0x0134 }
            android.database.Cursor r7 = X.C160077mz.A00(r5, r4, r3)     // Catch:{ RemoteException -> 0x0139, SecurityException -> 0x0134 }
            if (r7 == 0) goto L_0x00af
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()     // Catch:{ RemoteException -> 0x0139, SecurityException -> 0x0134 }
            X.7Ev r0 = r0.A01     // Catch:{ RemoteException -> 0x0139, SecurityException -> 0x0134 }
            X.6xj r9 = r4.A04     // Catch:{ RemoteException -> 0x0139, SecurityException -> 0x0134 }
            java.util.Map r0 = r0.A00     // Catch:{ RemoteException -> 0x0139, SecurityException -> 0x0134 }
            java.lang.Object r6 = r0.get(r9)     // Catch:{ RemoteException -> 0x0139, SecurityException -> 0x0134 }
            X.8tD r6 = (X.C185178tD) r6     // Catch:{ RemoteException -> 0x0139, SecurityException -> 0x0134 }
            if (r6 == 0) goto L_0x00af
        L_0x008a:
            boolean r0 = r7.moveToNext()     // Catch:{ 8RZ -> 0x00a8 }
            if (r0 == 0) goto L_0x0110
            X.6xj r0 = X.C142766xj.A01     // Catch:{ 8RZ -> 0x00a8 }
            if (r9 != r0) goto L_0x0099
            X.7nb r1 = r6.Br3(r7)     // Catch:{ 8RZ -> 0x00a8 }
            goto L_0x009d
        L_0x0099:
            X.7nb r1 = r6.Br2(r7)     // Catch:{ 8RZ -> 0x00a8 }
        L_0x009d:
            if (r1 == 0) goto L_0x008a
            X.2fV r0 = new X.2fV     // Catch:{ 8RZ -> 0x00a8 }
            r0.<init>(r4, r1)     // Catch:{ 8RZ -> 0x00a8 }
            r8.add(r0)     // Catch:{ 8RZ -> 0x00a8 }
            goto L_0x008a
        L_0x00a8:
            r0 = move-exception
            r3.Bec(r4, r0)     // Catch:{ all -> 0x00ed }
            r7.close()     // Catch:{ RemoteException -> 0x0139, SecurityException -> 0x0134 }
        L_0x00af:
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()     // Catch:{ RemoteException -> 0x0139, SecurityException -> 0x0134 }
            goto L_0x0113
        L_0x00b4:
            if (r5 == 0) goto L_0x013f
            r3.Bc1(r4)
            X.7mz r0 = r11.A05     // Catch:{ RemoteException -> 0x0139, SecurityException -> 0x0134 }
            android.database.Cursor r7 = X.C160077mz.A00(r5, r4, r3)     // Catch:{ RemoteException -> 0x0139, SecurityException -> 0x0134 }
            if (r7 == 0) goto L_0x00f5
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()     // Catch:{ RemoteException -> 0x0139, SecurityException -> 0x0134 }
            X.7Ev r0 = r0.A01     // Catch:{ RemoteException -> 0x0139, SecurityException -> 0x0134 }
            X.6xj r1 = r4.A04     // Catch:{ RemoteException -> 0x0139, SecurityException -> 0x0134 }
            java.util.Map r0 = r0.A00     // Catch:{ RemoteException -> 0x0139, SecurityException -> 0x0134 }
            java.lang.Object r6 = r0.get(r1)     // Catch:{ RemoteException -> 0x0139, SecurityException -> 0x0134 }
            X.8tD r6 = (X.C185178tD) r6     // Catch:{ RemoteException -> 0x0139, SecurityException -> 0x0134 }
            if (r6 == 0) goto L_0x00f5
        L_0x00d3:
            boolean r0 = r7.moveToNext()     // Catch:{ 8RZ -> 0x00e8 }
            if (r0 == 0) goto L_0x00fa
            X.7nb r1 = r6.Br2(r7)     // Catch:{ 8RZ -> 0x00e8 }
            if (r1 == 0) goto L_0x00d3
            X.2fV r0 = new X.2fV     // Catch:{ 8RZ -> 0x00e8 }
            r0.<init>(r4, r1)     // Catch:{ 8RZ -> 0x00e8 }
            r8.add(r0)     // Catch:{ 8RZ -> 0x00e8 }
            goto L_0x00d3
        L_0x00e8:
            r0 = move-exception
            r3.Bec(r4, r0)     // Catch:{ all -> 0x00ed }
            goto L_0x00f2
        L_0x00ed:
            r0 = move-exception
            r7.close()     // Catch:{ RemoteException -> 0x0139, SecurityException -> 0x0134 }
            throw r0     // Catch:{ RemoteException -> 0x0139, SecurityException -> 0x0134 }
        L_0x00f2:
            r7.close()     // Catch:{ RemoteException -> 0x0139, SecurityException -> 0x0134 }
        L_0x00f5:
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()     // Catch:{ RemoteException -> 0x0139, SecurityException -> 0x0134 }
            goto L_0x00fd
        L_0x00fa:
            r7.close()     // Catch:{ RemoteException -> 0x0139, SecurityException -> 0x0134 }
        L_0x00fd:
            boolean r0 = r8.isEmpty()     // Catch:{ RemoteException -> 0x0139, SecurityException -> 0x0134 }
            if (r0 != 0) goto L_0x012f
            r2.addAll(r8)     // Catch:{ RemoteException -> 0x0139, SecurityException -> 0x0134 }
            r3.Bby(r4)     // Catch:{ RemoteException -> 0x0139, SecurityException -> 0x0134 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ RemoteException -> 0x0139, SecurityException -> 0x0134 }
            r0 = 24
            if (r1 < r0) goto L_0x012a
            goto L_0x0125
        L_0x0110:
            r7.close()     // Catch:{ RemoteException -> 0x0139, SecurityException -> 0x0134 }
        L_0x0113:
            boolean r0 = r8.isEmpty()     // Catch:{ RemoteException -> 0x0139, SecurityException -> 0x0134 }
            if (r0 != 0) goto L_0x012f
            r2.addAll(r8)     // Catch:{ RemoteException -> 0x0139, SecurityException -> 0x0134 }
            r3.Bby(r4)     // Catch:{ RemoteException -> 0x0139, SecurityException -> 0x0134 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ RemoteException -> 0x0139, SecurityException -> 0x0134 }
            r0 = 24
            if (r1 < r0) goto L_0x012a
        L_0x0125:
            r5.close()     // Catch:{ RemoteException -> 0x0139, SecurityException -> 0x0134 }
            goto L_0x0056
        L_0x012a:
            r5.release()     // Catch:{ RemoteException -> 0x0139, SecurityException -> 0x0134 }
            goto L_0x0056
        L_0x012f:
            r3.Bbx(r4)     // Catch:{ RemoteException -> 0x0139, SecurityException -> 0x0134 }
            goto L_0x0056
        L_0x0134:
            r3.Bbz(r4)
            goto L_0x0056
        L_0x0139:
            r0 = move-exception
            r3.Bbw(r0, r4)
            goto L_0x0056
        L_0x013f:
            r0 = 0
            r3.Bc0(r0, r4)
            goto L_0x0056
        L_0x0145:
            java.util.List r0 = java.util.Collections.unmodifiableList(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7X6.A01(android.content.Context, java.util.Set, boolean):java.util.List");
    }
}
