package X;

/* renamed from: X.322  reason: invalid class name */
public class AnonymousClass322 {
    public static volatile String A00;

    /* JADX WARNING: Can't wrap try/catch for region: R(5:32|33|34|36|37) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0098 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00a2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A01(android.content.Context r9) {
        /*
            boolean r0 = r9 instanceof android.content.ContextWrapper
            r8 = 0
            if (r0 == 0) goto L_0x000f
            r0 = r9
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            if (r0 != 0) goto L_0x000f
        L_0x000e:
            return r8
        L_0x000f:
            long r6 = android.os.SystemClock.uptimeMillis()
            java.lang.String r0 = A00
            if (r0 != 0) goto L_0x00c0
            java.lang.String r3 = "ProcessNameUtil"
            r5 = 0
            java.lang.String r0 = "getMyProcessName"
            android.util.Log.i(r3, r0)     // Catch:{ Exception -> 0x00a3 }
            boolean r0 = X.C107385bE.A06()     // Catch:{ Exception -> 0x00a3 }
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = android.app.Application.getProcessName()     // Catch:{ Exception -> 0x00a3 }
            goto L_0x00be
        L_0x002b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r0 = "getMyProcessName/1"
            r1.append(r0)     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r0 = A00(r6)     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ Exception -> 0x00a3 }
            android.util.Log.i(r3, r0)     // Catch:{ Exception -> 0x00a3 }
            int r4 = android.os.Process.myPid()     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r9.getSystemService(r0)     // Catch:{ Exception -> 0x00a3 }
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch:{ Exception -> 0x00a3 }
            java.util.List r0 = r0.getRunningAppProcesses()     // Catch:{ Exception -> 0x00a3 }
            if (r0 == 0) goto L_0x0068
            java.util.Iterator r2 = r0.iterator()     // Catch:{ Exception -> 0x00a3 }
        L_0x0055:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x00a3 }
            if (r0 == 0) goto L_0x0068
            java.lang.Object r1 = r2.next()     // Catch:{ Exception -> 0x00a3 }
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1     // Catch:{ Exception -> 0x00a3 }
            int r0 = r1.pid     // Catch:{ Exception -> 0x00a3 }
            if (r0 != r4) goto L_0x0055
            java.lang.String r0 = r1.processName     // Catch:{ Exception -> 0x00a3 }
            goto L_0x00be
        L_0x0068:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r0 = "getMyProcessName/2"
            r1.append(r0)     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r0 = A00(r6)     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ Exception -> 0x00a3 }
            android.util.Log.i(r3, r0)     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r0 = "/proc/self/cmdline"
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ all -> 0x00a1 }
            r2.<init>(r0)     // Catch:{ all -> 0x00a1 }
            r0 = 128(0x80, float:1.794E-43)
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x00a1 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x00a1 }
            java.lang.String r0 = r1.readLine()     // Catch:{ IOException -> 0x0098, all -> 0x009c }
            if (r0 == 0) goto L_0x0098
            java.lang.String r0 = r0.trim()     // Catch:{ IOException -> 0x0098, all -> 0x009c }
            r1.close()     // Catch:{ IOException -> 0x00be }
            goto L_0x00be
        L_0x0098:
            r1.close()     // Catch:{ IOException -> 0x00a9 }
            goto L_0x00a9
        L_0x009c:
            r0 = move-exception
            r1.close()     // Catch:{ IOException -> 0x00a2 }
            goto L_0x00a2
        L_0x00a1:
            r0 = move-exception
        L_0x00a2:
            throw r0     // Catch:{ Exception -> 0x00a3 }
        L_0x00a3:
            r1 = move-exception
            java.lang.String r0 = "exception"
            android.util.Log.e(r3, r0, r1)
        L_0x00a9:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "getMyProcessName/3"
            r1.append(r0)
            java.lang.String r0 = A00(r6)
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            android.util.Log.i(r3, r0)
            r0 = r5
        L_0x00be:
            A00 = r0
        L_0x00c0:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "isSecondaryProcess/process name: "
            r1.append(r0)
            java.lang.String r0 = A00
            r1.append(r0)
            java.lang.String r0 = A00(r6)
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r0 = "ProcessNameUtil"
            android.util.Log.i(r0, r1)
            java.lang.StringBuilder r1 = X.C18320x8.A0k(r9)
            java.lang.String r0 = ":"
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r0 = A00
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = A00
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = A00
            int r1 = r0.length()
            int r0 = r2.length()
            if (r1 <= r0) goto L_0x000e
            r8 = 1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass322.A01(android.content.Context):boolean");
    }

    public static String A00(long j) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("/processing time: ");
        A0o.append(C18310x6.A0A(j));
        return AnonymousClass000.A0X(" ms", A0o);
    }
}
