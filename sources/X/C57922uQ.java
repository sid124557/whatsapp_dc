package X;

import android.util.Base64;

/* renamed from: X.2uQ  reason: invalid class name and case insensitive filesystem */
public final class C57922uQ {
    public static final byte[] A00 = Base64.decode("PkTwKSZqUfAUyR0rPQ8hYJ0wNsQQ3dW1+3SCnyTXIfEAxxS75FwkDf47wNv/c8pP3p0GXKR6OOQmhyERwx74fw1RYSU10I4r1gyBVDbRJ40pidjM41G1I1oN", 0);

    /* JADX WARNING: Can't wrap try/catch for region: R(3:91|92|93) */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0147, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0148, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x014c, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x0142 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(android.content.Context r11, java.lang.String r12) {
        /*
            java.io.ByteArrayOutputStream r4 = X.AnonymousClass0x9.A0e()
            java.lang.String r1 = r11.getPackageName()
            java.lang.String r0 = "com.whatsapp"
            if (r1 == 0) goto L_0x015a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x015a
            java.lang.String r5 = X.C58152un.A0B     // Catch:{ IOException -> 0x0153 }
            X.AnonymousClass0x7.A1C(r4, r1, r5)     // Catch:{ IOException -> 0x0153 }
            java.lang.String r0 = "/res/drawable-hdpi/about_logo.png"
            java.lang.Class<X.2uQ> r1 = X.C57922uQ.class
            java.io.InputStream r3 = r1.getResourceAsStream(r0)
            if (r3 != 0) goto L_0x0027
            java.lang.String r0 = "/res/drawable-hdpi-v4/about_logo.png"
            java.io.InputStream r3 = r1.getResourceAsStream(r0)
        L_0x0027:
            if (r3 != 0) goto L_0x002f
            java.lang.String r0 = "/res/drawable-xxhdpi-v4/about_logo.png"
            java.io.InputStream r3 = r1.getResourceAsStream(r0)
        L_0x002f:
            if (r3 != 0) goto L_0x0060
            android.content.res.Resources r6 = r11.getResources()
            android.util.DisplayMetrics r3 = new android.util.DisplayMetrics
            r3.<init>()
            r3.setToDefaults()
            r1 = 1069547520(0x3fc00000, float:1.5)
            r3.density = r1
            r0 = 240(0xf0, float:3.36E-43)
            r3.densityDpi = r0
            r3.scaledDensity = r1
            float r0 = (float) r0
            r3.xdpi = r0
            r3.ydpi = r0
            android.content.res.AssetManager r2 = r6.getAssets()
            android.content.res.Configuration r0 = r6.getConfiguration()
            android.content.res.Resources r1 = new android.content.res.Resources
            r1.<init>(r2, r3, r0)
            r0 = 2131230951(0x7f0800e7, float:1.807797E38)
            java.io.InputStream r3 = r1.openRawResource(r0)
        L_0x0060:
            if (r3 == 0) goto L_0x014d
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r2 = new byte[r0]
            int r1 = r3.read(r2)     // Catch:{ IOException -> 0x0142 }
        L_0x006a:
            r0 = -1
            r6 = 0
            if (r1 == r0) goto L_0x0076
            r4.write(r2, r6, r1)     // Catch:{ IOException -> 0x0142 }
            int r1 = r3.read(r2)     // Catch:{ IOException -> 0x0142 }
            goto L_0x006a
        L_0x0076:
            r3.close()     // Catch:{ IOException -> 0x0079 }
        L_0x0079:
            byte[] r10 = r4.toByteArray()
            byte[] r9 = A00
            r8 = 128(0x80, float:1.794E-43)
            r7 = 512(0x200, float:7.175E-43)
            java.lang.String r4 = "PBKDF2WithHmacSHA1And8BIT"
            int r3 = r10.length
            char[] r2 = new char[r3]
            r1 = 0
        L_0x0089:
            if (r1 >= r3) goto L_0x0093
            byte r0 = r10[r1]
            char r0 = (char) r0
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x0089
        L_0x0093:
            javax.crypto.SecretKey r1 = X.C627236i.A08(r4, r9, r2, r8, r7)
            r1.getEncoded()
            java.lang.String r0 = "HMACSHA1"
            javax.crypto.Mac r4 = javax.crypto.Mac.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x013c }
            r4.init(r1)     // Catch:{ InvalidKeyException -> 0x0136 }
            android.content.pm.Signature[] r2 = X.AnonymousClass345.A03(r11)
            if (r2 == 0) goto L_0x0130
            int r1 = r2.length
            if (r1 == 0) goto L_0x0130
        L_0x00ac:
            if (r6 >= r1) goto L_0x00ba
            r0 = r2[r6]
            byte[] r0 = r0.toByteArray()
            r4.update(r0)
            int r6 = r6 + 1
            goto L_0x00ac
        L_0x00ba:
            java.lang.String r0 = r11.getPackageCodePath()     // Catch:{ Exception -> 0x0103 }
            java.util.zip.ZipFile r7 = new java.util.zip.ZipFile     // Catch:{ Exception -> 0x0103 }
            r7.<init>(r0)     // Catch:{ Exception -> 0x0103 }
            java.lang.String r0 = "classes.dex"
            java.util.zip.ZipEntry r0 = r7.getEntry(r0)     // Catch:{ all -> 0x00f9 }
            java.io.InputStream r6 = r7.getInputStream(r0)     // Catch:{ all -> 0x00f9 }
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r0)     // Catch:{ all -> 0x00ed }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x00ed }
        L_0x00d7:
            int r1 = r6.read(r2)     // Catch:{ all -> 0x00ed }
            if (r1 <= 0) goto L_0x00e2
            r0 = 0
            r3.update(r2, r0, r1)     // Catch:{ all -> 0x00ed }
            goto L_0x00d7
        L_0x00e2:
            byte[] r0 = r3.digest()     // Catch:{ all -> 0x00ed }
            r6.close()     // Catch:{ all -> 0x00f9 }
            r7.close()     // Catch:{ Exception -> 0x0103 }
            goto L_0x0110
        L_0x00ed:
            r1 = move-exception
            if (r6 == 0) goto L_0x00f8
            r6.close()     // Catch:{ all -> 0x00f4 }
            goto L_0x00f8
        L_0x00f4:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00f9 }
        L_0x00f8:
            throw r1     // Catch:{ all -> 0x00f9 }
        L_0x00f9:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x00fe }
            goto L_0x0102
        L_0x00fe:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x0103 }
        L_0x0102:
            throw r1     // Catch:{ Exception -> 0x0103 }
        L_0x0103:
            r1 = move-exception
            java.lang.String r0 = "app/md5/bytes/error "
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.String r0 = "null"
            byte[] r0 = r0.getBytes(r5)     // Catch:{ UnsupportedEncodingException -> 0x0129 }
        L_0x0110:
            r4.update(r0)
            byte[] r0 = r12.getBytes(r5)     // Catch:{ UnsupportedEncodingException -> 0x0123 }
            r4.update(r0)
            byte[] r0 = r4.doFinal()
            java.lang.String r0 = X.C18290x4.A0t(r0)
            return r0
        L_0x0123:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass0x9.A0i(r0)
            throw r0
        L_0x0129:
            r1 = move-exception
            java.lang.Error r0 = new java.lang.Error
            r0.<init>(r1)
            throw r0
        L_0x0130:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x0136:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass0x9.A0i(r0)
            throw r0
        L_0x013c:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass0x9.A0i(r0)
            throw r0
        L_0x0142:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x0148 }
            r0.<init>()     // Catch:{ all -> 0x0148 }
            throw r0     // Catch:{ all -> 0x0148 }
        L_0x0148:
            r0 = move-exception
            r3.close()     // Catch:{ IOException -> 0x014c }
        L_0x014c:
            throw r0
        L_0x014d:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x0153:
            r1 = move-exception
            java.lang.Error r0 = new java.lang.Error
            r0.<init>(r1)
            throw r0
        L_0x015a:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57922uQ.A00(android.content.Context, java.lang.String):java.lang.String");
    }
}
