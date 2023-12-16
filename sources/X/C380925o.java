package X;

/* renamed from: X.25o  reason: invalid class name and case insensitive filesystem */
public class C380925o {
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C42162Na r16, java.io.InputStream r17, java.io.OutputStream r18, byte[] r19, int r20, long r21, long r23, long r25) {
        /*
            r3 = 0
            r9 = 0
            r4 = r23
            int r0 = (r23 > r9 ? 1 : (r23 == r9 ? 0 : -1))
            r15 = r17
            r6 = r16
            if (r0 != 0) goto L_0x008d
            byte[] r2 = r6.A01
        L_0x000f:
            byte[] r0 = r6.A02
            javax.crypto.Mac r13 = X.AnonymousClass31R.A02(r2, r0)
            int r0 = (r23 > r21 ? 1 : (r23 == r21 ? 0 : -1))
            if (r0 < 0) goto L_0x006c
            r7 = 0
        L_0x001a:
            r6 = 0
        L_0x001b:
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r8 = new byte[r0]
            r2 = r25
        L_0x0021:
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            r14 = r18
            if (r0 <= 0) goto L_0x00a5
            r0 = 8192(0x2000, double:4.0474E-320)
            long r0 = java.lang.Math.min(r2, r0)
            int r9 = (int) r0
            long r0 = (long) r9
            long r2 = r2 - r0
            r11 = 0
        L_0x0031:
            if (r11 >= r9) goto L_0x003e
            int r10 = r9 - r11
            int r10 = r15.read(r8, r11, r10)
            r12 = -1
            if (r10 == r12) goto L_0x009e
            int r11 = r11 + r10
            goto L_0x0031
        L_0x003e:
            r10 = 0
            r13.update(r8, r10, r9)
            long r16 = r25 - r2
            long r11 = r23 + r16
            int r10 = (r11 > r21 ? 1 : (r11 == r21 ? 0 : -1))
            if (r10 <= 0) goto L_0x004e
            long r11 = r11 - r21
            long r0 = r0 - r11
            int r9 = (int) r0
        L_0x004e:
            if (r9 <= 0) goto L_0x0060
            java.lang.String r0 = "cipher should not be null"
            X.C626936e.A07(r7, r0)
            r1 = 0
            byte[] r9 = r7.update(r8, r1, r9)
            if (r9 == 0) goto L_0x0063
            int r0 = r9.length
            r14.write(r9, r1, r0)
        L_0x0060:
            r9 = 0
            goto L_0x0021
        L_0x0063:
            if (r6 != 0) goto L_0x0060
            java.lang.String r0 = "decryption failed"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)
            throw r0
        L_0x006c:
            long r7 = r23 + r25
            r3 = 2
            int r0 = (r7 > r21 ? 1 : (r7 == r21 ? 0 : -1))
            byte[] r1 = r6.A00
            if (r0 < 0) goto L_0x007b
            javax.crypto.Cipher r7 = X.AnonymousClass31R.A01(r2, r1, r3)
            r6 = 1
            goto L_0x001b
        L_0x007b:
            java.lang.String r0 = "AES/CBC/NoPadding"
            javax.crypto.Cipher r7 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00fd }
            javax.crypto.spec.SecretKeySpec r1 = X.C18300x5.A0y(r1)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00fd }
            javax.crypto.spec.IvParameterSpec r0 = X.C18330xA.A0D(r2)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00fd }
            r7.init(r3, r1, r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00fd }
            goto L_0x001a
        L_0x008d:
            r1 = 16
            byte[] r2 = new byte[r1]
            int r0 = r15.read(r2, r3, r1)
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)
            X.C626936e.A0C(r0)
            goto L_0x000f
        L_0x009e:
            java.lang.String r0 = "Stream unexpectedly closed!"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)
            throw r0
        L_0x00a5:
            if (r6 == 0) goto L_0x00c7
            if (r7 == 0) goto L_0x00c7
            byte[] r0 = r7.doFinal()     // Catch:{ IllegalBlockSizeException -> 0x00bc, BadPaddingException -> 0x00b1 }
            r14.write(r0)     // Catch:{ IllegalBlockSizeException -> 0x00bc, BadPaddingException -> 0x00b1 }
            goto L_0x00c7
        L_0x00b1:
            r0 = move-exception
            com.whatsapp.util.Log.w((java.lang.Throwable) r0)
            java.lang.String r0 = "Bad padding!"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)
            throw r0
        L_0x00bc:
            r0 = move-exception
            com.whatsapp.util.Log.w((java.lang.Throwable) r0)
            java.lang.String r0 = "Bad block size!"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)
            throw r0
        L_0x00c7:
            byte[] r1 = r13.doFinal()
            r0 = 10
            byte[] r1 = X.C18320x8.A1Z(r1, r0)
            r2 = r20
            int r0 = r20 + 10
            r3 = r19
            byte[] r0 = java.util.Arrays.copyOfRange(r3, r2, r0)
            boolean r0 = java.security.MessageDigest.isEqual(r0, r1)
            if (r0 == 0) goto L_0x00e2
            return
        L_0x00e2:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ChunkCipherDecrypter/match failed at byte_offset="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", end_of_payload="
            java.lang.String r0 = X.AnonymousClass000.A0b(r0, r1, r6)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.6yf r0 = new X.6yf
            r0.<init>()
            throw r0
        L_0x00fd:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass0x9.A0i(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C380925o.A00(X.2Na, java.io.InputStream, java.io.OutputStream, byte[], int, long, long, long):void");
    }
}
