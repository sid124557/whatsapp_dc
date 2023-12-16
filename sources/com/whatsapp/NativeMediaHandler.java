package com.whatsapp;

import X.C620633i;

public class NativeMediaHandler {
    public final C620633i A00;

    public static native void initFileHandlingCallbacks(NativeMediaHandler nativeMediaHandler);

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053 A[SYNTHETIC, Splitter:B:16:0x0053] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064 A[Catch:{ all -> 0x006c, all -> 0x0073, Exception -> 0x0078 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int openFile(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r5 = "; path="
            java.lang.String r4 = "; mode="
            r6 = 0
            if (r8 == 0) goto L_0x008a
            if (r9 == 0) goto L_0x008a
            r1 = r8
            java.lang.String r0 = "/mnt/content/"
            boolean r0 = r8.startsWith(r0)
            if (r0 == 0) goto L_0x0036
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "content://"
            r1.append(r0)
            r0 = 13
            java.lang.String r0 = r8.substring(r0)
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
        L_0x0025:
            android.net.Uri r3 = android.net.Uri.parse(r1)
        L_0x0029:
            java.lang.String r0 = "r+"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0047
            java.lang.String r9 = "rw"
            goto L_0x0047
        L_0x0036:
            java.lang.String r0 = "/"
            boolean r0 = r8.startsWith(r0)
            if (r0 == 0) goto L_0x0025
            java.io.File r0 = X.AnonymousClass002.A0B(r8)
            android.net.Uri r3 = android.net.Uri.fromFile(r0)
            goto L_0x0029
        L_0x0047:
            X.33i r0 = r7.A00     // Catch:{ Exception -> 0x0078 }
            X.5UR r0 = X.C620633i.A02(r0)     // Catch:{ Exception -> 0x0078 }
            android.os.ParcelFileDescriptor r2 = r0.A05(r3, r9)     // Catch:{ Exception -> 0x0078 }
            if (r2 != 0) goto L_0x0064
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x006c }
            java.lang.String r0 = "nativemediahandler/openFile failed, not opened; uri="
            X.AnonymousClass000.A17(r3, r0, r4, r1)     // Catch:{ all -> 0x006c }
            r1.append(r9)     // Catch:{ all -> 0x006c }
            X.C18260x0.A0r(r5, r8, r1)     // Catch:{ all -> 0x006c }
            return r6
        L_0x0064:
            int r0 = r2.detachFd()     // Catch:{ all -> 0x006c }
            r2.close()     // Catch:{ Exception -> 0x0078 }
            return r0
        L_0x006c:
            r1 = move-exception
            if (r2 == 0) goto L_0x0077
            r2.close()     // Catch:{ all -> 0x0073 }
            goto L_0x0077
        L_0x0073:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x0078 }
        L_0x0077:
            throw r1     // Catch:{ Exception -> 0x0078 }
        L_0x0078:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "nativemediahandler/openFile failed; uri="
            X.AnonymousClass000.A17(r3, r0, r4, r1)
            r1.append(r9)
            X.C18260x0.A0u(r5, r8, r1, r2)
            return r6
        L_0x008a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "nativemediahandler/openFile wrong arguments; path="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " mode="
            X.C18260x0.A0r(r0, r9, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.NativeMediaHandler.openFile(java.lang.String, java.lang.String):int");
    }

    public NativeMediaHandler(C620633i r1) {
        this.A00 = r1;
    }
}
