package X;

import java.util.concurrent.Callable;

/* renamed from: X.8OU  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8OU implements Callable {
    public final AnonymousClass8KR A00;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0092, code lost:
        if (r3.read() != -1) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0094, code lost:
        r6 = new byte[2147483639];
        r8 = 2147483639;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0099, code lost:
        r3 = (byte[]) r10.removeFirst();
        r2 = java.lang.Math.min(r8, r3.length);
        java.lang.System.arraycopy(r3, 0, r6, 2147483639 - r8, r2);
        r8 = r8 - r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ab, code lost:
        if (r8 <= 0) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0124, code lost:
        throw new java.lang.OutOfMemoryError("input is too large to fit in a byte array");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0127, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0128, code lost:
        if (r9 != null) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012d, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x012e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x012f, code lost:
        X.C1457076y.A00.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0134, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r13 = this;
            X.8KR r3 = r13.A00
            java.net.URL r5 = r3.A01
            java.lang.String r2 = java.lang.String.valueOf(r5)
            int r0 = r2.length()
            int r0 = r0 + 22
            java.lang.StringBuilder r1 = X.AnonymousClass6CA.A0Y(r0)
            java.lang.String r0 = "Starting download of: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r2, r1)
            java.lang.String r4 = "FirebaseMessaging"
            android.util.Log.i(r4, r0)
            java.net.URLConnection r1 = r5.openConnection()
            int r0 = r1.getContentLength()
            r7 = 1048576(0x100000, float:1.469368E-39)
            if (r0 > r7) goto L_0x0135
            java.io.InputStream r9 = r1.getInputStream()
            r3.A02 = r9     // Catch:{ all -> 0x0125 }
            X.6tX r3 = new X.6tX     // Catch:{ all -> 0x0125 }
            r3.<init>(r9)     // Catch:{ all -> 0x0125 }
            r0 = 20
            java.util.ArrayDeque r10 = new java.util.ArrayDeque     // Catch:{ all -> 0x0125 }
            r10.<init>(r0)     // Catch:{ all -> 0x0125 }
            r6 = 8192(0x2000, float:1.14794E-41)
            r8 = 0
        L_0x003e:
            r12 = -1
            r11 = 2147483639(0x7ffffff7, float:NaN)
            if (r8 >= r11) goto L_0x008e
            int r11 = X.AnonymousClass6C9.A0A(r11, r8, r6)     // Catch:{ all -> 0x0125 }
            byte[] r2 = new byte[r11]     // Catch:{ all -> 0x0125 }
            r10.add(r2)     // Catch:{ all -> 0x0125 }
            r1 = 0
        L_0x004e:
            if (r1 >= r11) goto L_0x005f
            int r0 = r11 - r1
            int r0 = r3.read(r2, r1, r0)     // Catch:{ all -> 0x0125 }
            if (r0 != r12) goto L_0x005c
            byte[] r6 = new byte[r8]     // Catch:{ all -> 0x0125 }
            r11 = r8
            goto L_0x0079
        L_0x005c:
            int r1 = r1 + r0
            int r8 = r8 + r0
            goto L_0x004e
        L_0x005f:
            long r0 = (long) r6     // Catch:{ all -> 0x0125 }
            r2 = 1
            long r0 = r0 << r2
            r11 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 <= 0) goto L_0x006d
            r6 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x003e
        L_0x006d:
            r11 = -2147483648(0xffffffff80000000, double:NaN)
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 >= 0) goto L_0x0077
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x003e
        L_0x0077:
            int r6 = (int) r0     // Catch:{ all -> 0x0125 }
            goto L_0x003e
        L_0x0079:
            if (r11 <= 0) goto L_0x00ae
            java.lang.Object r3 = r10.removeFirst()     // Catch:{ all -> 0x0125 }
            byte[] r3 = (byte[]) r3     // Catch:{ all -> 0x0125 }
            int r0 = r3.length     // Catch:{ all -> 0x0125 }
            int r2 = java.lang.Math.min(r11, r0)     // Catch:{ all -> 0x0125 }
            int r1 = r8 - r11
            r0 = 0
            java.lang.System.arraycopy(r3, r0, r6, r1, r2)     // Catch:{ all -> 0x0125 }
            int r11 = r11 - r2
            goto L_0x0079
        L_0x008e:
            int r0 = r3.read()     // Catch:{ all -> 0x0125 }
            if (r0 != r12) goto L_0x011d
            byte[] r6 = new byte[r11]     // Catch:{ all -> 0x0125 }
            r8 = 2147483639(0x7ffffff7, float:NaN)
        L_0x0099:
            java.lang.Object r3 = r10.removeFirst()     // Catch:{ all -> 0x0125 }
            byte[] r3 = (byte[]) r3     // Catch:{ all -> 0x0125 }
            int r0 = r3.length     // Catch:{ all -> 0x0125 }
            int r2 = java.lang.Math.min(r8, r0)     // Catch:{ all -> 0x0125 }
            int r1 = r11 - r8
            r0 = 0
            java.lang.System.arraycopy(r3, r0, r6, r1, r2)     // Catch:{ all -> 0x0125 }
            int r8 = r8 - r2
            if (r8 <= 0) goto L_0x00ae
            goto L_0x0099
        L_0x00ae:
            if (r9 == 0) goto L_0x00b3
            r9.close()
        L_0x00b3:
            r0 = 2
            boolean r0 = android.util.Log.isLoggable(r4, r0)
            if (r0 == 0) goto L_0x00d9
            int r3 = r6.length
            java.lang.String r2 = java.lang.String.valueOf(r5)
            int r0 = r2.length()
            int r0 = r0 + 34
            java.lang.StringBuilder r1 = X.AnonymousClass6CA.A0Y(r0)
            java.lang.String r0 = "Downloaded "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " bytes from "
            r1.append(r0)
            X.AnonymousClass000.A1E(r2, r4, r1)
        L_0x00d9:
            int r1 = r6.length
            if (r1 > r7) goto L_0x0116
            r0 = 0
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeByteArray(r6, r0, r1)
            if (r3 == 0) goto L_0x00fd
            boolean r0 = X.AnonymousClass6C9.A1Q(r4)
            if (r0 == 0) goto L_0x00fc
            java.lang.String r2 = java.lang.String.valueOf(r5)
            int r0 = r2.length()
            int r0 = r0 + 31
            java.lang.StringBuilder r1 = X.AnonymousClass6CA.A0Y(r0)
            java.lang.String r0 = "Successfully downloaded image: "
            X.AnonymousClass6C7.A1G(r0, r2, r4, r1)
        L_0x00fc:
            return r3
        L_0x00fd:
            java.lang.String r2 = java.lang.String.valueOf(r5)
            int r0 = r2.length()
            int r0 = r0 + 24
            java.lang.StringBuilder r1 = X.AnonymousClass6CA.A0Y(r0)
            java.lang.String r0 = "Failed to decode image: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r2, r1)
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)
            throw r0
        L_0x0116:
            java.lang.String r0 = "Image exceeds max size of 1048576"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)
            throw r0
        L_0x011d:
            java.lang.String r1 = "input is too large to fit in a byte array"
            java.lang.OutOfMemoryError r0 = new java.lang.OutOfMemoryError     // Catch:{ all -> 0x0125 }
            r0.<init>(r1)     // Catch:{ all -> 0x0125 }
            throw r0     // Catch:{ all -> 0x0125 }
        L_0x0125:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0127 }
        L_0x0127:
            r2 = move-exception
            if (r9 == 0) goto L_0x0134
            r9.close()     // Catch:{ all -> 0x012e }
            throw r2
        L_0x012e:
            r1 = move-exception
            X.7Qh r0 = X.C1457076y.A00
            r0.A00(r3, r1)
        L_0x0134:
            throw r2
        L_0x0135:
            java.lang.String r0 = "Content-Length exceeds max size of 1048576"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8OU.call():java.lang.Object");
    }

    public AnonymousClass8OU(AnonymousClass8KR r1) {
        this.A00 = r1;
    }
}
