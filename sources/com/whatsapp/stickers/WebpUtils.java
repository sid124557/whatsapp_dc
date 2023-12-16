package com.whatsapp.stickers;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass6C7;
import X.C134116iT;
import X.C153407bG;
import X.C18290x4;
import X.C58152un;
import X.C627536m;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Random;

public class WebpUtils {
    public Random A00 = new Random();
    public final C153407bG A01;

    public class ExifMetadata {
        public final int length;
        public final byte[] metadata;
        public final int returnCode;

        private byte[] getMetadata() {
            return this.metadata;
        }

        public ExifMetadata(int i) {
            this.metadata = null;
            this.returnCode = i;
            this.length = 0;
        }

        public ExifMetadata(byte[] bArr) {
            this.metadata = bArr;
            this.returnCode = 0;
            this.length = bArr.length;
        }
    }

    public static native int createFirstThumbnail(byte[] bArr, int i, String str);

    public static native ExifMetadata fetchWebpMetadata(String str);

    public static native int getFirstWebpThumbnailMinimumFileLength(String str);

    public static native int insertWebpMetadata(String str, String str2, byte[] bArr);

    public static native WebpInfoResult verifyWebpFileIntegrity(String str);

    public class WebpInfoResult {
        public final int returnCode;
        public final WebpInfo webpInfo;

        public WebpInfoResult(int i) {
            this.webpInfo = null;
            this.returnCode = i;
        }

        public WebpInfoResult(int i, int i2, int i3, int i4, long j) {
            this.webpInfo = new WebpInfo(i, i2, i3, i4, j);
            this.returnCode = 0;
        }
    }

    public int A01(String str) {
        C134116iT r2;
        C153407bG r4 = this.A01;
        Integer A0d = C18290x4.A0d();
        if (!r4.A07(A0d)) {
            r2 = null;
        } else {
            r2 = new C134116iT();
            File A0B = AnonymousClass002.A0B(str);
            Long A0T = AnonymousClass0x2.A0T();
            C134116iT.A00(r2, A0B, A0T);
            r2.A06 = A0T;
            C134116iT.A01(r2, A0d, A0T);
        }
        int firstWebpThumbnailMinimumFileLength = getFirstWebpThumbnailMinimumFileLength(str);
        if (r2 != null) {
            r2.A0B = AnonymousClass0x9.A0m(firstWebpThumbnailMinimumFileLength);
        }
        r4.A06(r2);
        if (firstWebpThumbnailMinimumFileLength < 0) {
            return -1;
        }
        return firstWebpThumbnailMinimumFileLength;
    }

    public boolean A04(String str, byte[] bArr, int i) {
        C134116iT r5;
        C153407bG r6 = this.A01;
        long j = (long) i;
        Integer A0g = AnonymousClass0x7.A0g();
        if (!r6.A07(A0g)) {
            r5 = null;
        } else {
            r5 = new C134116iT();
            File A0B = AnonymousClass002.A0B(str);
            Long A0T = AnonymousClass0x2.A0T();
            C134116iT.A00(r5, A0B, A0T);
            r5.A06 = AnonymousClass0x9.A0n(A0B.length(), j);
            C134116iT.A01(r5, A0g, A0T);
        }
        int createFirstThumbnail = createFirstThumbnail(bArr, i, str);
        if (r5 != null) {
            r5.A0B = AnonymousClass0x9.A0m(createFirstThumbnail);
        }
        r6.A06(r5);
        if (createFirstThumbnail != 0) {
            return false;
        }
        return true;
    }

    public byte[] A05(String str) {
        C134116iT r5;
        C153407bG r6 = this.A01;
        Integer A0b = C18290x4.A0b();
        if (!r6.A07(A0b)) {
            r5 = null;
        } else {
            r5 = new C134116iT();
            File A0B = AnonymousClass002.A0B(str);
            Long A0T = AnonymousClass0x2.A0T();
            C134116iT.A00(r5, A0B, A0T);
            r5.A06 = A0T;
            C134116iT.A01(r5, A0b, A0T);
        }
        ExifMetadata fetchWebpMetadata = fetchWebpMetadata(str);
        int i = fetchWebpMetadata.returnCode;
        long j = (long) fetchWebpMetadata.length;
        if (r5 != null) {
            r5.A0B = AnonymousClass0x9.A0m(i);
            r5.A06 = Long.valueOf(j);
        }
        r6.A06(r5);
        if (fetchWebpMetadata.returnCode != 0) {
            return null;
        }
        return fetchWebpMetadata.metadata;
    }

    public WebpUtils(C153407bG r2) {
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0091, code lost:
        r10.update(r8, r1, r12);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(java.io.File r17) {
        /*
            X.C626936e.A00()
            r5 = r17
            java.io.FileInputStream r0 = X.AnonymousClass0x9.A0g(r5)     // Catch:{ FileNotFoundException -> 0x00b4, IOException -> 0x00bc, NoSuchAlgorithmException -> 0x00ad }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x00b4, IOException -> 0x00bc, NoSuchAlgorithmException -> 0x00ad }
            r7.<init>(r0)     // Catch:{ FileNotFoundException -> 0x00b4, IOException -> 0x00bc, NoSuchAlgorithmException -> 0x00ad }
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r10 = java.security.MessageDigest.getInstance(r0)     // Catch:{ all -> 0x00a3 }
            r0 = 4
            byte[] r9 = new byte[r0]     // Catch:{ all -> 0x00a3 }
            byte[] r8 = new byte[r0]     // Catch:{ all -> 0x00a3 }
            r0 = 8
            r7.skip(r0)     // Catch:{ all -> 0x00a3 }
            r17 = 1
            r0 = 0
            r12 = 0
            r16 = 1
            r11 = 0
        L_0x0025:
            int r15 = r7.read(r9)     // Catch:{ all -> 0x00a3 }
            r2 = 2
            if (r15 <= 0) goto L_0x0090
            byte r14 = r9[r0]     // Catch:{ all -> 0x00a3 }
            r1 = 3
            r13 = 70
            r6 = 73
            r4 = 88
            r0 = 69
            if (r14 != r0) goto L_0x0047
            byte r0 = r9[r17]     // Catch:{ all -> 0x00a3 }
            if (r0 != r4) goto L_0x0047
            byte r0 = r9[r2]     // Catch:{ all -> 0x00a3 }
            if (r0 != r6) goto L_0x0047
            byte r0 = r9[r1]     // Catch:{ all -> 0x00a3 }
            if (r0 != r13) goto L_0x0047
            r11 = 4
            goto L_0x0075
        L_0x0047:
            byte r3 = r8[r1]     // Catch:{ all -> 0x00a3 }
            r0 = 69
            if (r3 != r0) goto L_0x0058
            if (r14 != r4) goto L_0x0058
            byte r0 = r9[r17]     // Catch:{ all -> 0x00a3 }
            if (r0 != r6) goto L_0x0058
            byte r0 = r9[r2]     // Catch:{ all -> 0x00a3 }
            if (r0 != r13) goto L_0x0058
            goto L_0x0074
        L_0x0058:
            byte r2 = r8[r2]     // Catch:{ all -> 0x00a3 }
            r1 = 69
            if (r2 != r1) goto L_0x0068
            if (r3 != r4) goto L_0x0068
            if (r14 != r6) goto L_0x0068
            byte r0 = r9[r17]     // Catch:{ all -> 0x00a3 }
            if (r0 != r13) goto L_0x0068
            r11 = 2
            goto L_0x0075
        L_0x0068:
            byte r0 = r8[r17]     // Catch:{ all -> 0x00a3 }
            if (r0 != r1) goto L_0x0075
            if (r2 != r4) goto L_0x0075
            if (r3 != r6) goto L_0x0075
            if (r14 != r13) goto L_0x0075
            r11 = 1
            goto L_0x0075
        L_0x0074:
            r11 = 3
        L_0x0075:
            r1 = 0
            if (r16 != 0) goto L_0x0080
            if (r11 <= 0) goto L_0x007b
            goto L_0x008c
        L_0x007b:
            r10.update(r8, r1, r12)     // Catch:{ all -> 0x00a3 }
            r0 = 4
            goto L_0x0084
        L_0x0080:
            r0 = 4
            if (r11 != r0) goto L_0x0084
            goto L_0x0091
        L_0x0084:
            java.lang.System.arraycopy(r9, r1, r8, r1, r0)     // Catch:{ all -> 0x00a3 }
            r12 = r15
            r0 = 0
            r16 = 0
            goto L_0x0025
        L_0x008c:
            r10.update(r8, r1, r11)     // Catch:{ all -> 0x00a3 }
            goto L_0x0094
        L_0x0090:
            r1 = 0
        L_0x0091:
            r10.update(r8, r1, r12)     // Catch:{ all -> 0x00a3 }
        L_0x0094:
            byte[] r0 = r10.digest()     // Catch:{ all -> 0x00a3 }
            java.lang.String r0 = X.C18290x4.A0t(r0)     // Catch:{ all -> 0x00a3 }
            r5.getAbsolutePath()     // Catch:{ all -> 0x00a3 }
            r7.close()     // Catch:{ FileNotFoundException -> 0x00b4, IOException -> 0x00bc, NoSuchAlgorithmException -> 0x00ad }
            return r0
        L_0x00a3:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x00a8 }
            goto L_0x00ac
        L_0x00a8:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ FileNotFoundException -> 0x00b4, IOException -> 0x00bc, NoSuchAlgorithmException -> 0x00ad }
        L_0x00ac:
            throw r1     // Catch:{ FileNotFoundException -> 0x00b4, IOException -> 0x00bc, NoSuchAlgorithmException -> 0x00ad }
        L_0x00ad:
            r1 = move-exception
            java.lang.String r0 = "WebpUtils/getFileHashExcludingMetadata/no such algorithms exception"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x00cd
        L_0x00b4:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "WebpUtils/getFileHashExcludingMetadata/file not found:"
            goto L_0x00c3
        L_0x00bc:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "WebpUtils/getFileHashExcludingMetadata/io exception, file path:"
        L_0x00c3:
            X.AnonymousClass000.A10(r5, r0, r1)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
        L_0x00cd:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.WebpUtils.A00(java.io.File):java.lang.String");
    }

    public WebpInfo A02(String str) {
        C134116iT r2;
        WebpInfoResult verifyWebpFileIntegrity = verifyWebpFileIntegrity(str);
        C153407bG r3 = this.A01;
        Integer A0Z = C18290x4.A0Z();
        if (!r3.A07(A0Z)) {
            r2 = null;
        } else {
            r2 = new C134116iT();
            File A0B = AnonymousClass002.A0B(str);
            Long A0T = AnonymousClass0x2.A0T();
            C134116iT.A00(r2, A0B, A0T);
            r2.A06 = A0T;
            C134116iT.A01(r2, A0Z, A0T);
            r2.A0B = AnonymousClass0x9.A0m(verifyWebpFileIntegrity.returnCode);
            WebpInfo webpInfo = verifyWebpFileIntegrity.webpInfo;
            if (webpInfo != null) {
                r2.A09 = AnonymousClass0x9.A0m(webpInfo.width);
                r2.A08 = AnonymousClass0x9.A0m(webpInfo.height);
                r2.A07 = AnonymousClass0x9.A0m(webpInfo.minFrameDurationMS);
                r2.A0A = AnonymousClass0x9.A0m(webpInfo.numFrames);
            }
        }
        r3.A06(r2);
        if (verifyWebpFileIntegrity.returnCode != 0) {
            return null;
        }
        return verifyWebpFileIntegrity.webpInfo;
    }

    public boolean A03(File file, byte[] bArr) {
        int length;
        C134116iT r6;
        if (!file.exists()) {
            return false;
        }
        if (bArr == null || (length = bArr.length) == 0) {
            return true;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(file.getAbsolutePath());
        A0o.append(".");
        A0o.append(this.A00.nextLong());
        File A0S = AnonymousClass6C7.A0S(".tmp", A0o);
        try {
            new String(bArr, C58152un.A0B);
            int insertWebpMetadata = insertWebpMetadata(file.getAbsolutePath(), A0S.getAbsolutePath(), bArr);
            file.getAbsolutePath();
            C153407bG r8 = this.A01;
            String absolutePath = file.getAbsolutePath();
            long j = (long) length;
            Integer A0a = C18290x4.A0a();
            if (!r8.A07(A0a)) {
                r6 = null;
            } else {
                r6 = new C134116iT();
                File A0B = AnonymousClass002.A0B(absolutePath);
                Long A0T = AnonymousClass0x2.A0T();
                C134116iT.A00(r6, A0B, A0T);
                r6.A06 = AnonymousClass0x9.A0n(A0B.length(), j);
                C134116iT.A01(r6, A0a, A0T);
                r6.A0B = AnonymousClass0x9.A0m(insertWebpMetadata);
            }
            r8.A06(r6);
            if (insertWebpMetadata == 0) {
                boolean renameTo = A0S.renameTo(file);
                A0S.getAbsolutePath();
                file.getAbsolutePath();
                C627536m.A0O(A0S);
                return renameTo;
            }
        } catch (UnsupportedEncodingException e) {
            Log.e(AnonymousClass000.A0P(file, "WebpUtils/insertWebpMetadata/error when converting bytes to string, input file:", AnonymousClass001.A0o()), e);
        } catch (Throwable th) {
            C627536m.A0O(A0S);
            throw th;
        }
        C627536m.A0O(A0S);
        return false;
    }
}
