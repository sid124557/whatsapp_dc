package X;

import java.util.concurrent.Executor;

/* renamed from: X.7Tn  reason: invalid class name and case insensitive filesystem */
public final class C151127Tn {
    public final C161757qO A00;
    public final C160637o2 A01;
    public final AnonymousClass7X1 A02;
    public final C156047fw A03;
    public final Executor A04;

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0122, code lost:
        if (r7 != null) goto L_0x0139;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0111 A[Catch:{ all -> 0x0187 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011e A[SYNTHETIC, Splitter:B:48:0x011e] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x018d A[SYNTHETIC, Splitter:B:88:0x018d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.tasks.Task A00(android.os.Bundle r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
        /*
            r11 = this;
            java.lang.String r0 = "scope"
            r12.putString(r0, r15)
            java.lang.String r0 = "sender"
            r12.putString(r0, r14)
            java.lang.String r0 = "subtype"
            r12.putString(r0, r14)
            java.lang.String r0 = "appid"
            r12.putString(r0, r13)
            X.7qO r0 = r11.A00
            r0.A02()
            X.7Zo r0 = r0.A01
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "gmp_app_id"
            r12.putString(r0, r1)
            X.7o2 r2 = r11.A01
            int r0 = r2.A03()
            java.lang.String r1 = java.lang.Integer.toString(r0)
            java.lang.String r0 = "gmsv"
            r12.putString(r0, r1)
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r1 = java.lang.Integer.toString(r0)
            java.lang.String r0 = "osv"
            r12.putString(r0, r1)
            java.lang.String r1 = r2.A05()
            java.lang.String r0 = "app_ver"
            r12.putString(r0, r1)
            monitor-enter(r2)
            java.lang.String r0 = r2.A03     // Catch:{ all -> 0x0191 }
            if (r0 != 0) goto L_0x004d
            r2.A06()     // Catch:{ all -> 0x0191 }
        L_0x004d:
            java.lang.String r1 = r2.A03     // Catch:{ all -> 0x0191 }
            monitor-exit(r2)
            java.lang.String r0 = "app_ver_name"
            r12.putString(r0, r1)
            X.7fn r1 = X.C155957fn.A01
            java.lang.String r5 = "firebase-iid"
            java.lang.String r9 = "Failed to get app version for libraryName: "
            java.lang.String r4 = "LibraryVersion"
            java.lang.String r0 = "Please provide a valid libraryName"
            X.C162177rO.A07(r5, r0)
            java.util.concurrent.ConcurrentHashMap r3 = r1.A00
            boolean r0 = r3.containsKey(r5)
            if (r0 == 0) goto L_0x00a1
            java.lang.Object r7 = r3.get(r5)
        L_0x006e:
            java.lang.String r0 = "UNKNOWN"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0085
            r2 = 12451000(0xbdfcb8, float:1.7447567E-38)
            r0 = 19
            java.lang.StringBuilder r1 = X.AnonymousClass6CA.A0Y(r0)
            java.lang.String r0 = "unknown_"
            java.lang.String r7 = X.AnonymousClass000.A0Y(r0, r1, r2)
        L_0x0085:
            java.lang.String r2 = java.lang.String.valueOf(r7)
            int r1 = r2.length()
            java.lang.String r0 = "fiid-"
            java.lang.String r1 = X.AnonymousClass6C7.A0k(r0, r2, r1)
            java.lang.String r0 = "cliv"
            r12.putString(r0, r1)
            X.7fw r3 = r11.A03
            X.7F0 r0 = r3.A00
            java.util.Set r2 = r0.A00
            monitor-enter(r2)
            goto L_0x013e
        L_0x00a1:
            java.util.Properties r6 = new java.util.Properties
            r6.<init>()
            r0 = 1
            r7 = 0
            java.lang.Object[] r2 = X.AnonymousClass6C9.A1Z(r5, r0)     // Catch:{ IOException -> 0x0102 }
            java.lang.Class<X.7fn> r1 = X.C155957fn.class
            java.lang.String r0 = "/%s.properties"
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ IOException -> 0x0102 }
            java.io.InputStream r8 = r1.getResourceAsStream(r0)     // Catch:{ IOException -> 0x0102 }
            if (r8 == 0) goto L_0x00e5
            r6.load(r8)     // Catch:{ IOException -> 0x00fe, all -> 0x0189 }
            java.lang.String r0 = "version"
            java.lang.String r7 = r6.getProperty(r0, r7)     // Catch:{ IOException -> 0x00fe, all -> 0x0189 }
            X.7BP r6 = X.C155957fn.A02     // Catch:{ IOException -> 0x00fe, all -> 0x0189 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r5)     // Catch:{ IOException -> 0x00fe, all -> 0x0189 }
            java.lang.String r0 = " version is "
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r7, r1)     // Catch:{ IOException -> 0x00fe, all -> 0x0189 }
            r0 = 2
            boolean r0 = android.util.Log.isLoggable(r4, r0)     // Catch:{ IOException -> 0x00fe, all -> 0x0189 }
            if (r0 == 0) goto L_0x00e1
            java.lang.String r0 = r6.A00     // Catch:{ IOException -> 0x00fe, all -> 0x0189 }
            if (r0 == 0) goto L_0x00de
            java.lang.String r1 = r0.concat(r1)     // Catch:{ IOException -> 0x00fe, all -> 0x0189 }
        L_0x00de:
            android.util.Log.v(r4, r1)     // Catch:{ IOException -> 0x00fe, all -> 0x0189 }
        L_0x00e1:
            r8.close()     // Catch:{ IOException -> 0x0122 }
            goto L_0x0122
        L_0x00e5:
            X.7BP r6 = X.C155957fn.A02     // Catch:{ IOException -> 0x00fe, all -> 0x0189 }
            java.lang.String r1 = X.AnonymousClass000.A0T(r9, r5)     // Catch:{ IOException -> 0x00fe, all -> 0x0189 }
            r0 = 5
            boolean r0 = android.util.Log.isLoggable(r4, r0)     // Catch:{ IOException -> 0x00fe, all -> 0x0189 }
            if (r0 == 0) goto L_0x0124
            java.lang.String r0 = r6.A00     // Catch:{ IOException -> 0x00fe, all -> 0x0189 }
            if (r0 == 0) goto L_0x00fa
            java.lang.String r1 = r0.concat(r1)     // Catch:{ IOException -> 0x00fe, all -> 0x0189 }
        L_0x00fa:
            android.util.Log.w(r4, r1)     // Catch:{ IOException -> 0x00fe, all -> 0x0189 }
            goto L_0x0124
        L_0x00fe:
            r2 = move-exception
            r10 = r7
            r7 = r8
            goto L_0x0104
        L_0x0102:
            r2 = move-exception
            r10 = r7
        L_0x0104:
            X.7BP r6 = X.C155957fn.A02     // Catch:{ all -> 0x0187 }
            java.lang.String r1 = X.AnonymousClass000.A0T(r9, r5)     // Catch:{ all -> 0x0187 }
            r0 = 6
            boolean r0 = android.util.Log.isLoggable(r4, r0)     // Catch:{ all -> 0x0187 }
            if (r0 == 0) goto L_0x011c
            java.lang.String r0 = r6.A00     // Catch:{ all -> 0x0187 }
            if (r0 == 0) goto L_0x0119
            java.lang.String r1 = r0.concat(r1)     // Catch:{ all -> 0x0187 }
        L_0x0119:
            android.util.Log.e(r4, r1, r2)     // Catch:{ all -> 0x0187 }
        L_0x011c:
            if (r7 == 0) goto L_0x0121
            r7.close()     // Catch:{ IOException -> 0x0121 }
        L_0x0121:
            r7 = r10
        L_0x0122:
            if (r7 != 0) goto L_0x0139
        L_0x0124:
            java.lang.String r1 = ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used"
            boolean r0 = X.AnonymousClass6C9.A1Q(r4)
            if (r0 == 0) goto L_0x0137
            java.lang.String r0 = r6.A00
            if (r0 == 0) goto L_0x0134
            java.lang.String r1 = r0.concat(r1)
        L_0x0134:
            android.util.Log.d(r4, r1)
        L_0x0137:
            java.lang.String r7 = "UNKNOWN"
        L_0x0139:
            r3.put(r5, r7)
            goto L_0x006e
        L_0x013e:
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r2)     // Catch:{ all -> 0x0184 }
            monitor-exit(r2)     // Catch:{ all -> 0x0184 }
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0164
            java.lang.String r1 = r3.A01
        L_0x014b:
            java.lang.String r0 = "Firebase-Client"
            r12.putString(r0, r1)
            X.7Xf r3 = new X.7Xf
            r3.<init>()
            java.util.concurrent.Executor r2 = r11.A04
            r1 = 12
            X.8Mj r0 = new X.8Mj
            r0.<init>(r11, r12, r3, r1)
            r2.execute(r0)
            X.6YV r0 = r3.A00
            return r0
        L_0x0164:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r3.A01
            r1.append(r0)
            r0 = 32
            r1.append(r0)
            monitor-enter(r2)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r2)     // Catch:{ all -> 0x0181 }
            monitor-exit(r2)     // Catch:{ all -> 0x0181 }
            java.lang.String r0 = X.C156047fw.A00(r0)
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            goto L_0x014b
        L_0x0181:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0181 }
            throw r0
        L_0x0184:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0184 }
            throw r0
        L_0x0187:
            r0 = move-exception
            goto L_0x018b
        L_0x0189:
            r0 = move-exception
            r7 = r8
        L_0x018b:
            if (r7 == 0) goto L_0x0190
            r7.close()     // Catch:{ IOException -> 0x0190 }
        L_0x0190:
            throw r0
        L_0x0191:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C151127Tn.A00(android.os.Bundle, java.lang.String, java.lang.String, java.lang.String):com.google.android.gms.tasks.Task");
    }

    public C151127Tn(C161757qO r3, C160637o2 r4, C156047fw r5, Executor executor) {
        r3.A02();
        AnonymousClass7X1 r0 = new AnonymousClass7X1(r3.A00, r4);
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = r0;
        this.A04 = executor;
        this.A03 = r5;
    }
}
