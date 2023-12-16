package X;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* renamed from: X.8Hm  reason: invalid class name and case insensitive filesystem */
public class C171548Hm implements C179528jI {
    public Cipher A00;
    public SecretKey A01;
    public byte[] A02;

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4.A00 = javax.crypto.Cipher.getInstance("AES/GCM/NoPadding");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003d, code lost:
        throw X.C143806zV.A02("No such padding", r1, (byte) 80);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        throw X.C143806zV.A02("AES/GCM/NoPadding not found", r1, (byte) 80);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x002f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(byte[] r5, byte[] r6) {
        /*
            r4 = this;
            java.lang.String r3 = "AES/GCM/NoPadding"
            r2 = 80
            if (r5 == 0) goto L_0x004d
            int r1 = r5.length
            r0 = 16
            if (r1 != r0) goto L_0x004d
            if (r6 == 0) goto L_0x0046
            int r1 = r6.length
            r0 = 12
            if (r1 != r0) goto L_0x0046
            r4.A02 = r6
            java.lang.String r1 = "AES"
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec
            r0.<init>(r5, r1)
            r4.A01 = r0
            java.lang.String r0 = "AndroidOpenSSL"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r3, r0)     // Catch:{ NoSuchAlgorithmException | NoSuchProviderException | NoSuchPaddingException -> 0x0026 }
            r4.A00 = r0     // Catch:{ NoSuchAlgorithmException | NoSuchProviderException | NoSuchPaddingException -> 0x0026 }
            return
        L_0x0026:
            java.lang.String r0 = "SC"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r3, r0)     // Catch:{ NoSuchAlgorithmException | NoSuchProviderException | NoSuchPaddingException -> 0x002f }
            r4.A00 = r0     // Catch:{ NoSuchAlgorithmException | NoSuchProviderException | NoSuchPaddingException -> 0x002f }
            return
        L_0x002f:
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r3)     // Catch:{ NoSuchAlgorithmException -> 0x003e, NoSuchPaddingException -> 0x0036 }
            r4.A00 = r0     // Catch:{ NoSuchAlgorithmException -> 0x003e, NoSuchPaddingException -> 0x0036 }
            return
        L_0x0036:
            r1 = move-exception
            java.lang.String r0 = "No such padding"
            X.6zV r0 = X.C143806zV.A02(r0, r1, r2)
            throw r0
        L_0x003e:
            r1 = move-exception
            java.lang.String r0 = "AES/GCM/NoPadding not found"
            X.6zV r0 = X.C143806zV.A02(r0, r1, r2)
            throw r0
        L_0x0046:
            java.lang.String r0 = "Invalid iv length."
            X.6zV r0 = X.C143806zV.A01(r0, r2)
            throw r0
        L_0x004d:
            java.lang.String r0 = "Invalid key length."
            X.6zV r0 = X.C143806zV.A01(r0, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C171548Hm.A00(byte[], byte[]):void");
    }
}
