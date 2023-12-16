package com.facebook.cameracore.ardelivery.compression.zip;

import X.C194879Uv;
import X.C202239lb;
import java.io.InputStream;

public final class ZipDecompressor implements C202239lb {
    public static final C194879Uv Companion = new C194879Uv();
    public static final int UNZIP_BUFFER_SIZE = 4096;

    public static final int unZipToFolderBuffered(InputStream inputStream, String str) {
        return Companion.A01(inputStream, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C194739Uh decompress(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r3 = "Failed to unzip:"
            X.C18260x0.A0O(r5, r6)
            X.9JA r0 = new X.9JA     // Catch:{ IOException | IllegalArgumentException -> 0x0034 }
            r0.<init>((java.lang.String) r5)     // Catch:{ IOException | IllegalArgumentException -> 0x0034 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException | IllegalArgumentException -> 0x0034 }
            r2.<init>(r0)     // Catch:{ IOException | IllegalArgumentException -> 0x0034 }
            X.9Uv r0 = Companion     // Catch:{ all -> 0x002d }
            int r0 = r0.A01(r2, r6)     // Catch:{ all -> 0x002d }
            if (r0 <= 0) goto L_0x0022
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x002d }
            r0.<init>(r6)     // Catch:{ all -> 0x002d }
            X.9Uh r1 = new X.9Uh     // Catch:{ all -> 0x002d }
            r1.<init>((java.io.File) r0)     // Catch:{ all -> 0x002d }
            goto L_0x0029
        L_0x0022:
            java.lang.String r0 = "Failed to unzip: file size is 0"
            X.9Uh r1 = new X.9Uh     // Catch:{ all -> 0x002d }
            r1.<init>((java.lang.String) r0)     // Catch:{ all -> 0x002d }
        L_0x0029:
            r2.close()     // Catch:{ IOException | IllegalArgumentException -> 0x0034 }
            return r1
        L_0x002d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002f }
        L_0x002f:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ IOException | IllegalArgumentException -> 0x0034 }
            throw r0     // Catch:{ IOException | IllegalArgumentException -> 0x0034 }
        L_0x0034:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            java.lang.String r1 = X.AnonymousClass000.A0a(r3, r0, r1)
            X.9Uh r0 = new X.9Uh
            r0.<init>((java.lang.String) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor.decompress(java.lang.String, java.lang.String):X.9Uh");
    }

    public static final void createDirIfNotExist(String str, String str2) {
        C194879Uv.A00(str, str2);
    }
}
