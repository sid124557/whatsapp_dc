package X;

import java.io.File;

/* renamed from: X.1LW  reason: invalid class name */
public class AnonymousClass1LW extends C153117ah {
    public final C56492s4 A00;
    public final AnonymousClass33K A01;

    public AnonymousClass1LW(C69263Wi r9, C56492s4 r10, C185398ta r11, AnonymousClass33K r12, File file, String str, long j) {
        super(r9, r11, file, str, 4, j);
        this.A00 = r10;
        this.A01 = r12;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x003c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A00(X.AnonymousClass7PR r9) {
        /*
            r8 = this;
            java.lang.String r0 = r9.A03
            java.lang.String r7 = X.C627236i.A04(r0)
            java.lang.StringBuilder r1 = X.C18290x4.A0u(r7)
            java.lang.String r0 = "thumbloader/download "
            r1.append(r0)
            java.lang.String r4 = r9.A04
            X.C18260x0.A1L(r1, r4)
            r0 = 11
            android.net.TrafficStats.setThreadStatsTag(r0)
            r3 = 0
            X.33K r0 = r8.A01     // Catch:{ IOException -> 0x0068 }
            X.4GL r6 = r0.A03(r4)     // Catch:{ IOException -> 0x0068 }
            X.2s4 r1 = r8.A00     // Catch:{ IOException -> 0x003c }
            r0 = 30
            java.io.InputStream r2 = X.C18310x6.A0b(r1, r6, r3, r0)     // Catch:{ IOException -> 0x003c }
            X.30R r0 = r8.A03     // Catch:{ all -> 0x0032 }
            r0.A04(r2, r7)     // Catch:{ all -> 0x0032 }
            r2.close()     // Catch:{ IOException -> 0x003c }
            goto L_0x003c
        L_0x0032:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0037 }
            goto L_0x003b
        L_0x0037:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x003c }
        L_0x003b:
            throw r1     // Catch:{ IOException -> 0x003c }
        L_0x003c:
            X.30R r5 = r8.A03     // Catch:{ all -> 0x005e }
            int r2 = r9.A01     // Catch:{ all -> 0x005e }
            int r1 = r9.A00     // Catch:{ all -> 0x005e }
            boolean r0 = r9.A06     // Catch:{ all -> 0x005e }
            android.graphics.Bitmap r2 = r5.A01(r7, r2, r1, r0)     // Catch:{ all -> 0x005e }
            if (r2 != 0) goto L_0x0054
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x005e }
            java.lang.String r0 = "thumbloader/decode failed "
            X.C18260x0.A0r(r0, r4, r1)     // Catch:{ all -> 0x005e }
        L_0x0054:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x005e }
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r0, r2)     // Catch:{ all -> 0x005e }
            r6.close()     // Catch:{ IOException -> 0x0068 }
            goto L_0x0079
        L_0x005e:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0063 }
            goto L_0x0067
        L_0x0063:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0068 }
        L_0x0067:
            throw r1     // Catch:{ IOException -> 0x0068 }
        L_0x0068:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x007d }
            java.lang.String r0 = "thumbloader/error downloading "
            X.C18260x0.A0u(r0, r4, r1, r2)     // Catch:{ all -> 0x007d }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x007d }
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r0, r3)     // Catch:{ all -> 0x007d }
        L_0x0079:
            android.net.TrafficStats.clearThreadStatsTag()
            return r0
        L_0x007d:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1LW.A00(X.7PR):android.util.Pair");
    }
}
