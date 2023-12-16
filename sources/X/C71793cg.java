package X;

import android.content.Context;
import java.lang.Thread;

/* renamed from: X.3cg  reason: invalid class name and case insensitive filesystem */
public class C71793cg implements Thread.UncaughtExceptionHandler {
    public final Thread.UncaughtExceptionHandler A00 = Thread.getDefaultUncaughtExceptionHandler();
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C18370xE A02;

    public C71793cg(Context context, C18370xE r3) {
        this.A02 = r3;
        this.A01 = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0049, code lost:
        if (r2 == null) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        r2.A00("OOM");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0050, code lost:
        r3 = X.C18330xA.A0A("Main Thread Looper queue:");
        r3.append("\n");
        r3.append(com.whatsapp.util.Log.stackTraceStartPhrase());
        android.os.Looper.getMainLooper().dump(new X.C109205eF(r3), "OOM/");
        X.C18260x0.A1L(r3, "### end stack trace");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0079, code lost:
        if (r8.A03() == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007c, code lost:
        r2 = (int) ((java.lang.System.currentTimeMillis() - 1702528694000L) / 86400000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008c, code lost:
        r2 = 120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008e, code lost:
        if (r2 <= r5) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0090, code lost:
        r0 = "OOMHandler/hprof dump not allowed";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0093, code lost:
        r8 = X.C58152un.A00;
        r5 = r7.A00;
        r1 = new android.os.StatFs(r5.getCacheDir().getPath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b4, code lost:
        if ((((long) r1.getBlockSize()) * ((long) r1.getAvailableBlocks())) <= (r8 * 3)) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00bc, code lost:
        if ((!X.AnonymousClass34L.A01()) == false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00be, code lost:
        r0 = X.AnonymousClass002.A0B(r5.getCacheDir().getPath()).listFiles(new X.C116965rA(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d3, code lost:
        if (r0 == null) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d6, code lost:
        if (r0.length <= 0) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d8, code lost:
        r0 = "OOMHandler/hprof dump conditions not met";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00da, code lost:
        com.whatsapp.util.Log.i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e2, code lost:
        if (X.C627236i.A0E(r6) != false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r3 = java.util.Locale.US;
        r2 = X.AnonymousClass002.A0L();
        r2[0] = r5.getCacheDir().getPath();
        android.os.Debug.dumpHprofData(java.lang.String.format(r3, "%s/dump.hprof", r2));
        com.whatsapp.util.Log.i("OOMHandler/dump successful");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        com.whatsapp.util.Log.w("OOMHandler/IOException trying to write dump", r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        r3 = r2.A07;
        r0 = r2.A05.A00;
        r8 = r2.A02;
        r6 = r2.A04;
        r2 = r2.A0A;
        r7 = new X.AnonymousClass32A(r0);
        r5 = r3.A0O(X.C58422vE.A02, 1360);
        r1 = X.AnonymousClass001.A0o();
        r1.append("OOM/WhatsAppWorkers state: ");
        X.C18260x0.A1L(r1, X.C69423Wy.A05.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void uncaughtException(java.lang.Thread r11, java.lang.Throwable r12) {
        /*
            r10 = this;
            android.content.Context r0 = r10.A01
            X.C38982Af.A00(r0, r12)
            java.lang.Thread$UncaughtExceptionHandler r4 = r10.A00
            java.lang.String r0 = "UNCAUGHT EXCEPTION"
            com.whatsapp.util.Log.e(r0, r12)     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            X.3DM r2 = X.C38982Af.A00     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            if (r2 == 0) goto L_0x0109
            r1 = r12
        L_0x0011:
            boolean r0 = r1 instanceof java.lang.OutOfMemoryError     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            if (r0 == 0) goto L_0x0041
            X.1VX r3 = r2.A07     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            X.2oU r0 = r2.A05     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            android.content.Context r0 = r0.A00     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            X.5XU r8 = r2.A02     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            X.33i r6 = r2.A04     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            X.2Un r2 = r2.A0A     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            X.32A r7 = new X.32A     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            r7.<init>(r0)     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            r1 = 1360(0x550, float:1.906E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            int r5 = r3.A0O(r0, r1)     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            java.lang.String r0 = "OOM/WhatsAppWorkers state: "
            r1.append(r0)     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            X.8Tz r0 = X.C69423Wy.A05     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            X.C18260x0.A1L(r1, r0)     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            goto L_0x0049
        L_0x0041:
            java.lang.Throwable r1 = r1.getCause()     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            if (r1 != 0) goto L_0x0011
            goto L_0x0109
        L_0x0049:
            if (r2 == 0) goto L_0x0050
            java.lang.String r0 = "OOM"
            r2.A00(r0)     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
        L_0x0050:
            java.lang.String r0 = "Main Thread Looper queue:"
            java.lang.StringBuilder r3 = X.C18330xA.A0A(r0)     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            java.lang.String r0 = "\n"
            r3.append(r0)     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            java.lang.String r0 = com.whatsapp.util.Log.stackTraceStartPhrase()     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            r3.append(r0)     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            X.5eF r1 = new X.5eF     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            java.lang.String r0 = "OOM/"
            r2.dump(r1, r0)     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            java.lang.String r0 = "### end stack trace"
            X.C18260x0.A1L(r3, r0)     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            boolean r0 = r8.A03()     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            if (r0 == 0) goto L_0x007c
            goto L_0x008c
        L_0x007c:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            r2 = 1702528694000(0x18c669e36f0, double:8.411609387644E-312)
            long r0 = r0 - r2
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 / r2
            int r2 = (int) r0     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            goto L_0x008e
        L_0x008c:
            r2 = 120(0x78, float:1.68E-43)
        L_0x008e:
            if (r2 <= r5) goto L_0x0093
            java.lang.String r0 = "OOMHandler/hprof dump not allowed"
            goto L_0x00da
        L_0x0093:
            long r8 = X.C58152un.A00     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            android.content.Context r5 = r7.A00     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            java.io.File r0 = r5.getCacheDir()     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            java.lang.String r0 = r0.getPath()     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            android.os.StatFs r1 = new android.os.StatFs     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            int r0 = r1.getBlockSize()     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            long r2 = (long) r0     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            int r0 = r1.getAvailableBlocks()     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            long r0 = (long) r0     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            long r2 = r2 * r0
            r0 = 3
            long r8 = r8 * r0
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d8
            boolean r0 = X.AnonymousClass34L.A01()     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00d8
            java.io.File r0 = r5.getCacheDir()     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            java.lang.String r0 = r0.getPath()     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            java.io.File r1 = X.AnonymousClass002.A0B(r0)     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            X.5rA r0 = new X.5rA     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            r0.<init>(r7)     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            java.io.File[] r0 = r1.listFiles(r0)     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            if (r0 == 0) goto L_0x00de
            int r0 = r0.length     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            if (r0 <= 0) goto L_0x00de
        L_0x00d8:
            java.lang.String r0 = "OOMHandler/hprof dump conditions not met"
        L_0x00da:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            goto L_0x0109
        L_0x00de:
            boolean r0 = X.C627236i.A0E(r6)     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
            if (r0 != 0) goto L_0x00d8
            java.util.Locale r3 = java.util.Locale.US     // Catch:{ IOException -> 0x0104 }
            java.lang.Object[] r2 = X.AnonymousClass002.A0L()     // Catch:{ IOException -> 0x0104 }
            java.io.File r0 = r5.getCacheDir()     // Catch:{ IOException -> 0x0104 }
            java.lang.String r1 = r0.getPath()     // Catch:{ IOException -> 0x0104 }
            r0 = 0
            r2[r0] = r1     // Catch:{ IOException -> 0x0104 }
            java.lang.String r0 = "%s/dump.hprof"
            java.lang.String r0 = java.lang.String.format(r3, r0, r2)     // Catch:{ IOException -> 0x0104 }
            android.os.Debug.dumpHprofData(r0)     // Catch:{ IOException -> 0x0104 }
            java.lang.String r0 = "OOMHandler/dump successful"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0104 }
            goto L_0x0109
        L_0x0104:
            java.lang.String r0 = "OOMHandler/IOException trying to write dump"
            com.whatsapp.util.Log.w(r0, r12)     // Catch:{ Exception -> 0x0109, all -> 0x0110 }
        L_0x0109:
            com.whatsapp.util.Log.flush()
            r4.uncaughtException(r11, r12)
            return
        L_0x0110:
            r0 = move-exception
            com.whatsapp.util.Log.flush()
            r4.uncaughtException(r11, r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71793cg.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
