package X;

/* renamed from: X.7dr  reason: invalid class name and case insensitive filesystem */
public final class C154857dr {
    public static volatile AnonymousClass8L7 A00;

    /* JADX WARNING: Can't wrap try/catch for region: R(2:64|65) */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        throw r4;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x0143 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass8L7 A00(android.content.Context r14) {
        /*
            java.lang.Class<X.7dr> r13 = X.C154857dr.class
            monitor-enter(r13)
            X.8L7 r1 = A00     // Catch:{ all -> 0x015c }
            if (r1 != 0) goto L_0x015a
            java.lang.String r2 = android.os.Build.TYPE     // Catch:{ all -> 0x015c }
            java.lang.String r1 = android.os.Build.TAGS     // Catch:{ all -> 0x015c }
            java.lang.String r0 = "eng"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x015c }
            if (r0 != 0) goto L_0x001b
            java.lang.String r0 = "userdebug"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x015c }
            if (r0 == 0) goto L_0x0152
        L_0x001b:
            java.lang.String r0 = "dev-keys"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x015c }
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "test-keys"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x015c }
            if (r0 == 0) goto L_0x0152
        L_0x002b:
            boolean r0 = X.C161167p7.A00()     // Catch:{ all -> 0x015c }
            if (r0 == 0) goto L_0x003b
            boolean r0 = r14.isDeviceProtectedStorage()     // Catch:{ all -> 0x015c }
            if (r0 != 0) goto L_0x003b
            android.content.Context r14 = r14.createDeviceProtectedStorageContext()     // Catch:{ all -> 0x015c }
        L_0x003b:
            android.os.StrictMode$ThreadPolicy r12 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ all -> 0x015c }
            android.os.StrictMode.allowThreadDiskWrites()     // Catch:{ all -> 0x014d }
            r5 = 0
            java.lang.String r0 = "phenotype_hermetic"
            java.io.File r1 = r14.getDir(r0, r5)     // Catch:{ RuntimeException -> 0x005e }
            java.lang.String r0 = "overrides.txt"
            java.io.File r2 = X.AnonymousClass002.A0A(r1, r0)     // Catch:{ RuntimeException -> 0x005e }
            boolean r0 = r2.exists()     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x005b
            X.6V1 r1 = new X.6V1     // Catch:{ all -> 0x014d }
            r1.<init>(r2)     // Catch:{ all -> 0x014d }
            goto L_0x0068
        L_0x005b:
            X.6V2 r1 = X.AnonymousClass6V2.A00     // Catch:{ all -> 0x014d }
            goto L_0x0068
        L_0x005e:
            r2 = move-exception
            java.lang.String r1 = "HermeticFileOverrides"
            java.lang.String r0 = "no data dir"
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x014d }
            X.6V2 r1 = X.AnonymousClass6V2.A00     // Catch:{ all -> 0x014d }
        L_0x0068:
            boolean r0 = r1 instanceof X.AnonymousClass6V1     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x014a
            X.6V1 r1 = (X.AnonymousClass6V1) r1     // Catch:{ all -> 0x014d }
            java.lang.Object r10 = r1.zza     // Catch:{ all -> 0x014d }
            java.io.File r10 = (java.io.File) r10     // Catch:{ all -> 0x014d }
            java.io.FileInputStream r1 = X.AnonymousClass0x9.A0g(r10)     // Catch:{ IOException -> 0x0144 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0144 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0144 }
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0144 }
            r7.<init>(r0)     // Catch:{ IOException -> 0x0144 }
            r6 = 1
            X.0Wz r4 = new X.0Wz     // Catch:{ all -> 0x012a }
            r4.<init>()     // Catch:{ all -> 0x012a }
            java.util.HashMap r9 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x012a }
        L_0x008a:
            java.lang.String r3 = r7.readLine()     // Catch:{ all -> 0x012a }
            if (r3 == 0) goto L_0x00fb
            java.lang.String r0 = " "
            r1 = 3
            java.lang.String[] r2 = r3.split(r0, r1)     // Catch:{ all -> 0x012a }
            int r0 = r2.length     // Catch:{ all -> 0x012a }
            if (r0 == r1) goto L_0x00b0
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x012a }
            java.lang.String r0 = "Invalid: "
            r2.append(r0)     // Catch:{ all -> 0x012a }
            r2.append(r3)     // Catch:{ all -> 0x012a }
            java.lang.String r1 = "HermeticFileOverrides"
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x012a }
            android.util.Log.e(r1, r0)     // Catch:{ all -> 0x012a }
            goto L_0x008a
        L_0x00b0:
            r0 = r2[r5]     // Catch:{ all -> 0x012a }
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x012a }
            r11.<init>(r0)     // Catch:{ all -> 0x012a }
            r1 = r2[r6]     // Catch:{ all -> 0x012a }
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x012a }
            r0.<init>(r1)     // Catch:{ all -> 0x012a }
            java.lang.String r8 = android.net.Uri.decode(r0)     // Catch:{ all -> 0x012a }
            r1 = 2
            r0 = r2[r1]     // Catch:{ all -> 0x012a }
            java.lang.String r3 = X.C18320x8.A0e(r0, r9)     // Catch:{ all -> 0x012a }
            if (r3 != 0) goto L_0x00e3
            r0 = r2[r1]     // Catch:{ all -> 0x012a }
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x012a }
            r2.<init>(r0)     // Catch:{ all -> 0x012a }
            java.lang.String r3 = android.net.Uri.decode(r2)     // Catch:{ all -> 0x012a }
            int r1 = r3.length()     // Catch:{ all -> 0x012a }
            r0 = 1024(0x400, float:1.435E-42)
            if (r1 < r0) goto L_0x00e0
            if (r3 != r2) goto L_0x00e3
        L_0x00e0:
            r9.put(r2, r3)     // Catch:{ all -> 0x012a }
        L_0x00e3:
            boolean r0 = r4.containsKey(r11)     // Catch:{ all -> 0x012a }
            if (r0 != 0) goto L_0x00f1
            X.0Wz r0 = new X.0Wz     // Catch:{ all -> 0x012a }
            r0.<init>()     // Catch:{ all -> 0x012a }
            r4.put(r11, r0)     // Catch:{ all -> 0x012a }
        L_0x00f1:
            java.lang.Object r0 = r4.get(r11)     // Catch:{ all -> 0x012a }
            X.0Wz r0 = (X.C06290Wz) r0     // Catch:{ all -> 0x012a }
            r0.put(r8, r3)     // Catch:{ all -> 0x012a }
            goto L_0x008a
        L_0x00fb:
            java.lang.String r3 = r10.toString()     // Catch:{ all -> 0x012a }
            java.lang.String r2 = r14.getPackageName()     // Catch:{ all -> 0x012a }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x012a }
            java.lang.String r0 = "Parsed "
            r1.append(r0)     // Catch:{ all -> 0x012a }
            r1.append(r3)     // Catch:{ all -> 0x012a }
            java.lang.String r0 = " for Android package "
            r1.append(r0)     // Catch:{ all -> 0x012a }
            r1.append(r2)     // Catch:{ all -> 0x012a }
            java.lang.String r0 = "HermeticFileOverrides"
            X.AnonymousClass6C7.A1A(r1, r0)     // Catch:{ all -> 0x012a }
            X.7BS r0 = new X.7BS     // Catch:{ all -> 0x012a }
            r0.<init>(r4)     // Catch:{ all -> 0x012a }
            r7.close()     // Catch:{ IOException -> 0x0144 }
            X.6V1 r1 = new X.6V1     // Catch:{ all -> 0x014d }
            r1.<init>(r0)     // Catch:{ all -> 0x014d }
            goto L_0x0155
        L_0x012a:
            r4 = move-exception
            r7.close()     // Catch:{ all -> 0x012f }
            goto L_0x0143
        L_0x012f:
            r3 = move-exception
            java.lang.Class[] r2 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x0143 }
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            r2[r5] = r1     // Catch:{ Exception -> 0x0143 }
            java.lang.String r0 = "addSuppressed"
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r0, r2)     // Catch:{ Exception -> 0x0143 }
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0143 }
            r0[r5] = r3     // Catch:{ Exception -> 0x0143 }
            r1.invoke(r4, r0)     // Catch:{ Exception -> 0x0143 }
        L_0x0143:
            throw r4     // Catch:{ IOException -> 0x0144 }
        L_0x0144:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C18330xA.A09(r0)     // Catch:{ all -> 0x014d }
            throw r0     // Catch:{ all -> 0x014d }
        L_0x014a:
            X.6V2 r1 = X.AnonymousClass6V2.A00     // Catch:{ all -> 0x014d }
            goto L_0x0155
        L_0x014d:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r12)     // Catch:{ all -> 0x015c }
            throw r0     // Catch:{ all -> 0x015c }
        L_0x0152:
            X.6V2 r1 = X.AnonymousClass6V2.A00     // Catch:{ all -> 0x015c }
            goto L_0x0158
        L_0x0155:
            android.os.StrictMode.setThreadPolicy(r12)     // Catch:{ all -> 0x015c }
        L_0x0158:
            A00 = r1     // Catch:{ all -> 0x015c }
        L_0x015a:
            monitor-exit(r13)     // Catch:{ all -> 0x015c }
            return r1
        L_0x015c:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x015c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C154857dr.A00(android.content.Context):X.8L7");
    }
}
