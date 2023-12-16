package X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.2fW  reason: invalid class name and case insensitive filesystem */
public class C48812fW {
    public Context A00;
    public final SharedPreferences A01;

    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|5|6|(1:8)(4:9|(2:10|(1:12)(1:20))|13|(1:15))|16|17) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x00b1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A00() {
        /*
            r16 = this;
            java.lang.String r11 = "NPCI"
            java.lang.String r4 = ""
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            r0 = r16
            android.content.SharedPreferences r1 = r0.A01     // Catch:{ Exception -> 0x0102 }
            java.lang.String r0 = "id"
            java.lang.String r10 = r1.getString(r0, r4)     // Catch:{ Exception -> 0x0102 }
            java.lang.String r0 = "k0"
            java.lang.String r3 = r1.getString(r0, r4)     // Catch:{ Exception -> 0x0102 }
            java.lang.String r0 = "date"
            java.lang.String r9 = r1.getString(r0, r4)     // Catch:{ Exception -> 0x0102 }
            java.lang.String r0 = "token"
            java.lang.String r2 = r1.getString(r0, r4)     // Catch:{ Exception -> 0x0102 }
            java.lang.String r0 = "datak"
            java.lang.String r6 = r1.getString(r0, r4)     // Catch:{ Exception -> 0x0102 }
            java.lang.String r0 = "random"
            java.lang.String r0 = r1.getString(r0, r4)     // Catch:{ Exception -> 0x0102 }
            r8 = 2
            byte[] r7 = android.util.Base64.decode(r0, r8)     // Catch:{ Exception -> 0x0102 }
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyStore r4 = java.security.KeyStore.getInstance(r0)     // Catch:{ Exception -> 0x0102 }
            r1 = 0
            r4.load(r1)     // Catch:{ Exception -> 0x0102 }
            boolean r0 = r4.containsAlias(r11)     // Catch:{ Exception -> 0x0102 }
            if (r0 == 0) goto L_0x0102
            java.security.KeyStore$Entry r0 = r4.getEntry(r11, r1)     // Catch:{ Exception -> 0x0102 }
            java.security.KeyStore$PrivateKeyEntry r0 = (java.security.KeyStore.PrivateKeyEntry) r0     // Catch:{ Exception -> 0x0102 }
            java.security.PrivateKey r13 = r0.getPrivateKey()     // Catch:{ Exception -> 0x0102 }
            byte[] r12 = android.util.Base64.decode(r6, r8)     // Catch:{ Exception -> 0x0102 }
            r6 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00b1 }
            r0 = 23
            if (r1 < r0) goto L_0x0077
            java.lang.String r0 = "RSA/ECB/OAEPwithSHA-256andMGF1Padding"
            javax.crypto.Cipher r15 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ Exception -> 0x00b1 }
            java.lang.String r14 = "SHA-256"
            java.lang.String r11 = "MGF1"
            java.security.spec.MGF1ParameterSpec r4 = java.security.spec.MGF1ParameterSpec.SHA1     // Catch:{ Exception -> 0x00b1 }
            javax.crypto.spec.PSource$PSpecified r1 = javax.crypto.spec.PSource.PSpecified.DEFAULT     // Catch:{ Exception -> 0x00b1 }
            javax.crypto.spec.OAEPParameterSpec r0 = new javax.crypto.spec.OAEPParameterSpec     // Catch:{ Exception -> 0x00b1 }
            r0.<init>(r14, r11, r4, r1)     // Catch:{ Exception -> 0x00b1 }
            r15.init(r8, r13, r0)     // Catch:{ Exception -> 0x00b1 }
            byte[] r6 = r15.doFinal(r12)     // Catch:{ Exception -> 0x00b1 }
            goto L_0x00b1
        L_0x0077:
            java.lang.String r0 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ Exception -> 0x00b1 }
            r1.init(r8, r13)     // Catch:{ Exception -> 0x00b1 }
            java.io.ByteArrayInputStream r0 = X.AnonymousClass0x9.A0d(r12)     // Catch:{ Exception -> 0x00b1 }
            javax.crypto.CipherInputStream r4 = new javax.crypto.CipherInputStream     // Catch:{ Exception -> 0x00b1 }
            r4.<init>(r0, r1)     // Catch:{ Exception -> 0x00b1 }
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()     // Catch:{ Exception -> 0x00b1 }
        L_0x008d:
            int r1 = r4.read()     // Catch:{ Exception -> 0x00b1 }
            r0 = -1
            if (r1 == r0) goto L_0x0099
            byte r0 = (byte) r1     // Catch:{ Exception -> 0x00b1 }
            X.AnonymousClass001.A1O(r11, r0)     // Catch:{ Exception -> 0x00b1 }
            goto L_0x008d
        L_0x0099:
            int r4 = r11.size()     // Catch:{ Exception -> 0x00b1 }
            byte[] r6 = new byte[r4]     // Catch:{ Exception -> 0x00b1 }
            r1 = 0
        L_0x00a0:
            if (r1 >= r4) goto L_0x00b1
            java.lang.Object r0 = r11.get(r1)     // Catch:{ Exception -> 0x00b1 }
            java.lang.Byte r0 = (java.lang.Byte) r0     // Catch:{ Exception -> 0x00b1 }
            byte r0 = r0.byteValue()     // Catch:{ Exception -> 0x00b1 }
            r6[r1] = r0     // Catch:{ Exception -> 0x00b1 }
            int r1 = r1 + 1
            goto L_0x00a0
        L_0x00b1:
            X.36B r0 = new X.36B     // Catch:{ Exception -> 0x0102 }
            r0.<init>()     // Catch:{ Exception -> 0x0102 }
            byte[] r0 = android.util.Base64.decode(r10, r8)     // Catch:{ Exception -> 0x0102 }
            byte[] r1 = X.AnonymousClass36B.A06(r0, r6, r7)     // Catch:{ Exception -> 0x0102 }
            java.lang.String r0 = new java.lang.String     // Catch:{ Exception -> 0x0102 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0102 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0102 }
            int r4 = r0.intValue()     // Catch:{ Exception -> 0x0102 }
            byte[] r0 = android.util.Base64.decode(r3, r8)     // Catch:{ Exception -> 0x0102 }
            byte[] r0 = X.AnonymousClass36B.A06(r0, r6, r7)     // Catch:{ Exception -> 0x0102 }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x0102 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x0102 }
            byte[] r0 = android.util.Base64.decode(r2, r8)     // Catch:{ Exception -> 0x0102 }
            byte[] r0 = X.AnonymousClass36B.A06(r0, r6, r7)     // Catch:{ Exception -> 0x0102 }
            java.lang.String r2 = new java.lang.String     // Catch:{ Exception -> 0x0102 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0102 }
            byte[] r0 = android.util.Base64.decode(r9, r8)     // Catch:{ Exception -> 0x0102 }
            byte[] r0 = X.AnonymousClass36B.A06(r0, r6, r7)     // Catch:{ Exception -> 0x0102 }
            java.lang.String r1 = new java.lang.String     // Catch:{ Exception -> 0x0102 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0102 }
            X.7gy r0 = new X.7gy     // Catch:{ Exception -> 0x0102 }
            r0.<init>()     // Catch:{ Exception -> 0x0102 }
            r0.A00 = r4     // Catch:{ Exception -> 0x0102 }
            r0.A02 = r3     // Catch:{ Exception -> 0x0102 }
            r0.A01 = r2     // Catch:{ Exception -> 0x0102 }
            r0.A03 = r1     // Catch:{ Exception -> 0x0102 }
            r5.add(r0)     // Catch:{ Exception -> 0x0102 }
        L_0x0102:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48812fW.A00():java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0119, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x011e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0122, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0125, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x012e, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C156647gy r15) {
        /*
            r14 = this;
            java.lang.String r10 = "AndroidKeyStore"
            java.lang.String r8 = "NPCI"
            java.security.KeyStore r6 = java.security.KeyStore.getInstance(r10)     // Catch:{ Exception -> 0x01c0 }
            r4 = 0
            r6.load(r4)     // Catch:{ Exception -> 0x01c0 }
            boolean r0 = r6.containsAlias(r8)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r9 = "SHA-256"
            r2 = 23
            r7 = 1
            if (r0 != 0) goto L_0x00b9
            java.util.Calendar r13 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x01c0 }
            java.util.Calendar r3 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x01c0 }
            r0 = 999(0x3e7, float:1.4E-42)
            r3.add(r7, r0)     // Catch:{ Exception -> 0x01c0 }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x01c0 }
            r11 = 2048(0x800, float:2.87E-42)
            java.lang.String r12 = "CN=NPCI_CERT"
            java.lang.String r5 = "RSA"
            if (r0 < r2) goto L_0x002f
            goto L_0x0070
        L_0x002f:
            android.content.Context r1 = r14.A00     // Catch:{ Exception -> 0x01c0 }
            android.security.KeyPairGeneratorSpec$Builder r0 = new android.security.KeyPairGeneratorSpec$Builder     // Catch:{ Exception -> 0x01c0 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x01c0 }
            android.security.KeyPairGeneratorSpec$Builder r1 = r0.setAlias(r8)     // Catch:{ Exception -> 0x01c0 }
            javax.security.auth.x500.X500Principal r0 = new javax.security.auth.x500.X500Principal     // Catch:{ Exception -> 0x01c0 }
            r0.<init>(r12)     // Catch:{ Exception -> 0x01c0 }
            android.security.KeyPairGeneratorSpec$Builder r1 = r1.setSubject(r0)     // Catch:{ Exception -> 0x01c0 }
            java.math.BigInteger r0 = java.math.BigInteger.ONE     // Catch:{ Exception -> 0x01c0 }
            android.security.KeyPairGeneratorSpec$Builder r1 = r1.setSerialNumber(r0)     // Catch:{ Exception -> 0x01c0 }
            java.util.Date r0 = r13.getTime()     // Catch:{ Exception -> 0x01c0 }
            android.security.KeyPairGeneratorSpec$Builder r1 = r1.setStartDate(r0)     // Catch:{ Exception -> 0x01c0 }
            java.util.Date r0 = r3.getTime()     // Catch:{ Exception -> 0x01c0 }
            android.security.KeyPairGeneratorSpec$Builder r3 = r1.setEndDate(r0)     // Catch:{ Exception -> 0x01c0 }
            java.math.BigInteger r1 = java.security.spec.RSAKeyGenParameterSpec.F4     // Catch:{ Exception -> 0x01c0 }
            java.security.spec.RSAKeyGenParameterSpec r0 = new java.security.spec.RSAKeyGenParameterSpec     // Catch:{ Exception -> 0x01c0 }
            r0.<init>(r11, r1)     // Catch:{ Exception -> 0x01c0 }
            android.security.KeyPairGeneratorSpec$Builder r0 = r3.setAlgorithmParameterSpec(r0)     // Catch:{ Exception -> 0x01c0 }
            android.security.KeyPairGeneratorSpec r0 = r0.build()     // Catch:{ Exception -> 0x01c0 }
            java.security.KeyPairGenerator r1 = java.security.KeyPairGenerator.getInstance(r5, r10)     // Catch:{ Exception -> 0x01c0 }
            r1.initialize(r0)     // Catch:{ Exception -> 0x01c0 }
            goto L_0x00b6
        L_0x0070:
            java.security.KeyPairGenerator r1 = java.security.KeyPairGenerator.getInstance(r5, r10)     // Catch:{ Exception -> 0x01c0 }
            r0 = 3
            android.security.keystore.KeyGenParameterSpec$Builder r5 = new android.security.keystore.KeyGenParameterSpec$Builder     // Catch:{ Exception -> 0x01c0 }
            r5.<init>(r8, r0)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String[] r0 = new java.lang.String[]{r9}     // Catch:{ Exception -> 0x01c0 }
            android.security.keystore.KeyGenParameterSpec$Builder r5 = r5.setDigests(r0)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r0 = "OAEPPadding"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ Exception -> 0x01c0 }
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r5.setEncryptionPaddings(r0)     // Catch:{ Exception -> 0x01c0 }
            android.security.keystore.KeyGenParameterSpec$Builder r5 = r0.setKeySize(r11)     // Catch:{ Exception -> 0x01c0 }
            java.util.Date r0 = r13.getTime()     // Catch:{ Exception -> 0x01c0 }
            android.security.keystore.KeyGenParameterSpec$Builder r5 = r5.setKeyValidityStart(r0)     // Catch:{ Exception -> 0x01c0 }
            java.util.Date r0 = r3.getTime()     // Catch:{ Exception -> 0x01c0 }
            android.security.keystore.KeyGenParameterSpec$Builder r3 = r5.setKeyValidityEnd(r0)     // Catch:{ Exception -> 0x01c0 }
            javax.security.auth.x500.X500Principal r0 = new javax.security.auth.x500.X500Principal     // Catch:{ Exception -> 0x01c0 }
            r0.<init>(r12)     // Catch:{ Exception -> 0x01c0 }
            android.security.keystore.KeyGenParameterSpec$Builder r3 = r3.setCertificateSubject(r0)     // Catch:{ Exception -> 0x01c0 }
            java.math.BigInteger r0 = java.math.BigInteger.ONE     // Catch:{ Exception -> 0x01c0 }
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r3.setCertificateSerialNumber(r0)     // Catch:{ Exception -> 0x01c0 }
            android.security.keystore.KeyGenParameterSpec r0 = r0.build()     // Catch:{ Exception -> 0x01c0 }
            r1.initialize(r0)     // Catch:{ Exception -> 0x01c0 }
        L_0x00b6:
            r1.generateKeyPair()     // Catch:{ Exception -> 0x01c0 }
        L_0x00b9:
            java.security.KeyStore$Entry r0 = r6.getEntry(r8, r4)     // Catch:{ Exception -> 0x01c0 }
            java.security.KeyStore$PrivateKeyEntry r0 = (java.security.KeyStore.PrivateKeyEntry) r0     // Catch:{ Exception -> 0x01c0 }
            java.security.cert.Certificate r0 = r0.getCertificate()     // Catch:{ Exception -> 0x01c0 }
            java.security.PublicKey r6 = r0.getPublicKey()     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r0 = "AES"
            javax.crypto.KeyGenerator r1 = javax.crypto.KeyGenerator.getInstance(r0)     // Catch:{ Exception -> 0x01c0 }
            r0 = 256(0x100, float:3.59E-43)
            r1.init(r0)     // Catch:{ Exception -> 0x01c0 }
            javax.crypto.SecretKey r0 = r1.generateKey()     // Catch:{ Exception -> 0x01c0 }
            byte[] r8 = r0.getEncoded()     // Catch:{ Exception -> 0x01c0 }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x012f }
            if (r0 < r2) goto L_0x00f7
            java.lang.String r0 = "RSA/ECB/OAEPwithSHA-256andMGF1Padding"
            javax.crypto.Cipher r5 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ Exception -> 0x012f }
            java.lang.String r3 = "MGF1"
            java.security.spec.MGF1ParameterSpec r2 = java.security.spec.MGF1ParameterSpec.SHA1     // Catch:{ Exception -> 0x012f }
            javax.crypto.spec.PSource$PSpecified r1 = javax.crypto.spec.PSource.PSpecified.DEFAULT     // Catch:{ Exception -> 0x012f }
            javax.crypto.spec.OAEPParameterSpec r0 = new javax.crypto.spec.OAEPParameterSpec     // Catch:{ Exception -> 0x012f }
            r0.<init>(r9, r3, r2, r1)     // Catch:{ Exception -> 0x012f }
            r5.init(r7, r6, r0)     // Catch:{ Exception -> 0x012f }
            byte[] r4 = r5.doFinal(r8)     // Catch:{ Exception -> 0x012f }
            goto L_0x012f
        L_0x00f7:
            java.lang.String r0 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ Exception -> 0x012f }
            r1.init(r7, r6)     // Catch:{ Exception -> 0x012f }
            java.io.ByteArrayOutputStream r3 = X.AnonymousClass0x9.A0e()     // Catch:{ Exception -> 0x012f }
            javax.crypto.CipherOutputStream r0 = new javax.crypto.CipherOutputStream     // Catch:{ all -> 0x0123 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x0123 }
            r0.write(r8)     // Catch:{ all -> 0x0117 }
            r0.close()     // Catch:{ all -> 0x0123 }
            byte[] r4 = r3.toByteArray()     // Catch:{ all -> 0x0123 }
            r3.close()     // Catch:{ Exception -> 0x012f }
            goto L_0x012f
        L_0x0117:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0119 }
        L_0x0119:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x011e }
            goto L_0x0122
        L_0x011e:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch:{ all -> 0x0123 }
        L_0x0122:
            throw r1     // Catch:{ all -> 0x0123 }
        L_0x0123:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0125 }
        L_0x0125:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x012a }
            goto L_0x012e
        L_0x012a:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch:{ Exception -> 0x012f }
        L_0x012e:
            throw r1     // Catch:{ Exception -> 0x012f }
        L_0x012f:
            r2 = 2
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r2)     // Catch:{ Exception -> 0x01c0 }
            X.36B r0 = new X.36B     // Catch:{ Exception -> 0x01c0 }
            r0.<init>()     // Catch:{ Exception -> 0x01c0 }
            java.security.SecureRandom r3 = new java.security.SecureRandom     // Catch:{ Exception -> 0x01c0 }
            r3.<init>()     // Catch:{ Exception -> 0x01c0 }
            javax.crypto.Cipher r0 = X.C18320x8.A0v()     // Catch:{ Exception -> 0x01c0 }
            int r0 = r0.getBlockSize()     // Catch:{ Exception -> 0x01c0 }
            byte[] r1 = new byte[r0]     // Catch:{ Exception -> 0x01c0 }
            r3.nextBytes(r1)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r3 = android.util.Base64.encodeToString(r1, r2)     // Catch:{ Exception -> 0x01c0 }
            int r0 = r15.A00     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x01c0 }
            byte[] r0 = r0.getBytes()     // Catch:{ Exception -> 0x01c0 }
            byte[] r0 = X.AnonymousClass36B.A05(r0, r8, r1)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r7 = android.util.Base64.encodeToString(r0, r2)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r0 = r15.A02     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x01c0 }
            byte[] r0 = r0.getBytes()     // Catch:{ Exception -> 0x01c0 }
            byte[] r0 = X.AnonymousClass36B.A05(r0, r8, r1)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r6 = android.util.Base64.encodeToString(r0, r2)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r0 = r15.A03     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x01c0 }
            byte[] r0 = r0.getBytes()     // Catch:{ Exception -> 0x01c0 }
            byte[] r0 = X.AnonymousClass36B.A05(r0, r8, r1)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r5 = android.util.Base64.encodeToString(r0, r2)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r0 = r15.A01     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x01c0 }
            byte[] r0 = r0.getBytes()     // Catch:{ Exception -> 0x01c0 }
            byte[] r0 = X.AnonymousClass36B.A05(r0, r8, r1)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r2 = android.util.Base64.encodeToString(r0, r2)     // Catch:{ Exception -> 0x01c0 }
            android.content.SharedPreferences r0 = r14.A01     // Catch:{ Exception -> 0x01c0 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r0 = "id"
            r1.putString(r0, r7)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r0 = "k0"
            r1.putString(r0, r6)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r0 = "date"
            r1.putString(r0, r5)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r0 = "token"
            r1.putString(r0, r2)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r0 = "datak"
            r1.putString(r0, r4)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r0 = "random"
            r1.putString(r0, r3)     // Catch:{ Exception -> 0x01c0 }
            r1.commit()     // Catch:{ Exception -> 0x01c0 }
        L_0x01c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48812fW.A01(X.7gy):void");
    }

    public C48812fW(Context context) {
        this.A01 = context.getSharedPreferences("Data", 0);
        this.A00 = context;
    }
}
