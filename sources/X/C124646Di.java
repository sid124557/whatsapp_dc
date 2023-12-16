package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.6Di  reason: invalid class name and case insensitive filesystem */
public class C124646Di extends Handler {
    public final /* synthetic */ C1674080y A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C124646Di(Looper looper, C1674080y r2) {
        super(looper);
        this.A00 = r2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Exception} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r10) {
        /*
            r9 = this;
            int r1 = r10.what     // Catch:{ Exception -> 0x00dd }
            if (r1 == 0) goto L_0x0010
            r0 = 1
            if (r1 != r0) goto L_0x0009
            goto L_0x00ad
        L_0x0009:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x00dd }
            r0.<init>()     // Catch:{ Exception -> 0x00dd }
            goto L_0x00dc
        L_0x0010:
            X.80y r0 = r9.A00     // Catch:{ Exception -> 0x00dd }
            X.7NZ r5 = r0.A0C     // Catch:{ Exception -> 0x00dd }
            java.lang.Object r1 = r10.obj     // Catch:{ Exception -> 0x00dd }
            X.7F4 r1 = (X.AnonymousClass7F4) r1     // Catch:{ Exception -> 0x00dd }
            boolean r4 = r5.A03     // Catch:{ Exception -> 0x00dd }
            r8 = 1
            r7 = 0
            java.lang.String r6 = "DrmSessionManagerHelper"
            r2 = 0
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x00dd }
            java.lang.String r0 = r1.A00     // Catch:{ Exception -> 0x00dd }
            r3.append(r0)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r0 = "&signedRequest="
            r3.append(r0)     // Catch:{ Exception -> 0x00dd }
            byte[] r1 = r1.A01     // Catch:{ Exception -> 0x00dd }
            java.lang.String r0 = new java.lang.String     // Catch:{ Exception -> 0x00dd }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r3)     // Catch:{ Exception -> 0x00dd }
            if (r4 == 0) goto L_0x0059
            android.net.Uri r0 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x00dd }
            r0.getQuery()     // Catch:{ Exception -> 0x00dd }
            boolean r0 = r5.A02     // Catch:{ Exception -> 0x00dd }
            java.lang.String r1 = "Failed to get provision data"
            if (r0 != 0) goto L_0x0052
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x00dd }
            java.lang.String r0 = java.lang.String.format(r1, r0)     // Catch:{ Exception -> 0x00dd }
            android.util.Log.e(r6, r0)     // Catch:{ Exception -> 0x00dd }
            goto L_0x00ff
        L_0x0052:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x00dd }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00dd }
            goto L_0x00dc
        L_0x0059:
            java.net.URL r0 = new java.net.URL     // Catch:{ all -> 0x00ab }
            r0.<init>(r1)     // Catch:{ all -> 0x00ab }
            java.net.URLConnection r5 = r0.openConnection()     // Catch:{ all -> 0x00ab }
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = "POST"
            r5.setRequestMethod(r0)     // Catch:{ all -> 0x00a4 }
            r5.setDoOutput(r7)     // Catch:{ all -> 0x00a4 }
            r5.setDoInput(r8)     // Catch:{ all -> 0x00a4 }
            java.io.InputStream r4 = r5.getInputStream()     // Catch:{ all -> 0x00a4 }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r3 = new byte[r0]     // Catch:{ all -> 0x009f }
            java.io.ByteArrayOutputStream r2 = X.AnonymousClass0x9.A0e()     // Catch:{ all -> 0x009f }
        L_0x007b:
            int r1 = r4.read(r3)     // Catch:{ all -> 0x009f }
            r0 = -1
            if (r1 == r0) goto L_0x0086
            r2.write(r3, r7, r1)     // Catch:{ all -> 0x009f }
            goto L_0x007b
        L_0x0086:
            byte[] r2 = r2.toByteArray()     // Catch:{ all -> 0x009f }
            r4.close()     // Catch:{ all -> 0x00a4 }
            r5.disconnect()     // Catch:{ Exception -> 0x00dd }
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x00dd }
            java.lang.String r0 = new java.lang.String     // Catch:{ Exception -> 0x00dd }
            r0.<init>(r2)     // Catch:{ Exception -> 0x00dd }
            r1[r7] = r0     // Catch:{ Exception -> 0x00dd }
            java.lang.String r0 = "Provisioning data from http is %s"
            X.C161157p6.A01(r6, r0, r1)     // Catch:{ Exception -> 0x00dd }
            goto L_0x00ff
        L_0x009f:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00a4 }
            throw r0     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r0 = move-exception
            if (r5 == 0) goto L_0x00dc
            r5.disconnect()     // Catch:{ Exception -> 0x00dd }
            goto L_0x00dc
        L_0x00ab:
            r0 = move-exception
            goto L_0x00dc
        L_0x00ad:
            X.80y r0 = r9.A00     // Catch:{ Exception -> 0x00dd }
            X.7NZ r3 = r0.A0C     // Catch:{ Exception -> 0x00dd }
            java.lang.Object r0 = r10.obj     // Catch:{ Exception -> 0x00dd }
            X.7F3 r0 = (X.AnonymousClass7F3) r0     // Catch:{ Exception -> 0x00dd }
            byte[] r1 = r0.A01     // Catch:{ Exception -> 0x00dd }
            r0 = 0
            android.util.Base64.encodeToString(r1, r0)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r2 = r3.A01     // Catch:{ Exception -> 0x00dd }
            boolean r0 = r3.A04     // Catch:{ Exception -> 0x00dd }
            if (r0 == 0) goto L_0x00cd
            java.lang.String r0 = "GIF:"
            boolean r0 = r2.startsWith(r0)     // Catch:{ Exception -> 0x00dd }
            if (r0 == 0) goto L_0x00cd
            r0 = 4
            r2.substring(r0)     // Catch:{ Exception -> 0x00dd }
        L_0x00cd:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x00dd }
            java.lang.String r0 = "Failed to get license for video "
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r2, r1)     // Catch:{ Exception -> 0x00dd }
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x00dd }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00dd }
        L_0x00dc:
            throw r0     // Catch:{ Exception -> 0x00dd }
        L_0x00dd:
            r2 = move-exception
            int r1 = r10.arg1
            r0 = 1
            if (r1 != r0) goto L_0x00ff
            int r0 = r10.arg2
            int r1 = r0 + 1
            r0 = 3
            if (r1 > r0) goto L_0x00ff
            android.os.Message r2 = android.os.Message.obtain(r10)
            r2.arg2 = r1
            int r0 = r1 + -1
            int r1 = r0 * 1000
            r0 = 5000(0x1388, float:7.006E-42)
            int r0 = java.lang.Math.min(r1, r0)
            long r0 = (long) r0
            r9.sendMessageDelayed(r2, r0)
            return
        L_0x00ff:
            X.80y r0 = r9.A00
            X.6Dj r1 = r0.A08
            int r0 = r10.what
            X.C18290x4.A1C(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C124646Di.handleMessage(android.os.Message):void");
    }
}
