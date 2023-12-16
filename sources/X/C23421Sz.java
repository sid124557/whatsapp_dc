package X;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Collections;
import java.util.Enumeration;
import javax.crypto.SecretKey;

/* renamed from: X.1Sz  reason: invalid class name and case insensitive filesystem */
public class C23421Sz extends C61172zp {
    public KeyStore A00;
    public final AnonymousClass1VX A01;

    public static StringBuilder A00() {
        StringBuilder sb = new StringBuilder();
        sb.append("EncryptedKeyHelperAESKeyStore/");
        return sb;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C46402bZ A02(byte[] r11) {
        /*
            r10 = this;
            java.lang.String r3 = "ged"
            java.security.KeyStore r1 = r10.A05()     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007d, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0085 }
            java.lang.String r2 = "aes_auth_key"
            boolean r0 = r1.containsAlias(r2)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007d, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0085 }
            if (r0 == 0) goto L_0x001b
            java.lang.Class<java.security.KeyStore$SecretKeyEntry> r0 = java.security.KeyStore.SecretKeyEntry.class
            boolean r0 = r1.entryInstanceOf(r2, r0)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007d, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0085 }
            if (r0 == 0) goto L_0x001b
            javax.crypto.SecretKey r2 = r10.A06()     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007d, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0085 }
            goto L_0x005a
        L_0x001b:
            java.lang.String r1 = "AES"
            java.lang.String r0 = "AndroidKeyStore"
            javax.crypto.KeyGenerator r4 = javax.crypto.KeyGenerator.getInstance(r1, r0)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007d, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0085 }
            r0 = 3
            android.security.keystore.KeyGenParameterSpec$Builder r1 = new android.security.keystore.KeyGenParameterSpec$Builder     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007d, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0085 }
            r1.<init>(r2, r0)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007d, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0085 }
            java.lang.String r0 = "GCM"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007d, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0085 }
            android.security.keystore.KeyGenParameterSpec$Builder r1 = r1.setBlockModes(r0)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007d, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0085 }
            java.lang.String r0 = "NoPadding"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007d, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0085 }
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r1.setEncryptionPaddings(r0)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007d, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0085 }
            r2 = 0
            android.security.keystore.KeyGenParameterSpec$Builder r1 = r0.setUserAuthenticationRequired(r2)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007d, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0085 }
            boolean r0 = X.C107385bE.A06()     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007d, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0085 }
            if (r0 == 0) goto L_0x004f
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r1.setUserConfirmationRequired(r2)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007d, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0085 }
            r0.setUserPresenceRequired(r2)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007d, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0085 }
        L_0x004f:
            android.security.keystore.KeyGenParameterSpec r0 = r1.build()     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007d, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0085 }
            r4.init(r0)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007d, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0085 }
            javax.crypto.SecretKey r2 = r4.generateKey()     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007d, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0085 }
        L_0x005a:
            if (r2 == 0) goto L_0x0075
            javax.crypto.Cipher r1 = X.C18320x8.A0v()     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007d, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0085 }
            r0 = 1
            r1.init(r0, r2)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007d, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0085 }
            byte[] r7 = r1.getIV()     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007d, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0085 }
            byte[] r6 = r1.doFinal(r11)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007d, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0085 }
            r9 = 0
            r5 = 0
            X.2bZ r4 = new X.2bZ     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007d, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0085 }
            r8 = r5
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007d, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0085 }
            return r4
        L_0x0075:
            java.lang.String r1 = "could not get key store entry"
            java.security.KeyStoreException r0 = new java.security.KeyStoreException     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007d, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0085 }
            r0.<init>(r1)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007d, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0085 }
            throw r0     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007d, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0085 }
        L_0x007d:
            r2 = move-exception
            java.lang.StringBuilder r1 = A00()
            java.lang.String r0 = "crypto issue on encryption"
            goto L_0x008c
        L_0x0085:
            r2 = move-exception
            java.lang.StringBuilder r1 = A00()
            java.lang.String r0 = "key store issue on decryption"
        L_0x008c:
            X.C18260x0.A15(r0, r1, r2)
            java.lang.Throwable r0 = r2.getCause()
            if (r0 == 0) goto L_0x0099
            java.lang.Throwable r2 = r2.getCause()
        L_0x0099:
            r10.A01(r3, r2)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23421Sz.A02(byte[]):X.2bZ");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A04(X.AnonymousClass20A r8, X.C46402bZ r9) {
        /*
            r7 = this;
            java.lang.String r6 = "gd-"
            int r0 = r9.A00
            r5 = 0
            if (r0 == 0) goto L_0x0011
            java.lang.StringBuilder r1 = A00()
            java.lang.String r0 = "getDecrypted invalid type"
            X.C18260x0.A1K(r1, r0)
            return r5
        L_0x0011:
            javax.crypto.SecretKey r4 = r7.A06()     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0037, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x003f }
            if (r4 == 0) goto L_0x002f
            javax.crypto.Cipher r3 = X.C18320x8.A0v()     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0037, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x003f }
            byte[] r2 = r9.A03     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0037, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x003f }
            r0 = 128(0x80, float:1.794E-43)
            javax.crypto.spec.GCMParameterSpec r1 = new javax.crypto.spec.GCMParameterSpec     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0037, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x003f }
            r1.<init>(r0, r2)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0037, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x003f }
            r0 = 2
            r3.init(r0, r4, r1)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0037, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x003f }
            byte[] r0 = r9.A02     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0037, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x003f }
            byte[] r0 = r3.doFinal(r0)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0037, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x003f }
            return r0
        L_0x002f:
            java.lang.String r1 = "could not get key store entry"
            java.security.KeyStoreException r0 = new java.security.KeyStoreException     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0037, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x003f }
            r0.<init>(r1)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0037, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x003f }
            throw r0     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0037, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x003f }
        L_0x0037:
            r3 = move-exception
            java.lang.StringBuilder r1 = A00()
            java.lang.String r0 = "crypto issue on decryption"
            goto L_0x0046
        L_0x003f:
            r3 = move-exception
            java.lang.StringBuilder r1 = A00()
            java.lang.String r0 = "key store issue on decryption"
        L_0x0046:
            X.C18260x0.A15(r0, r1, r3)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0l(r6)
            int r1 = r8.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x0069
            java.lang.String r0 = "selftest"
        L_0x0057:
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r2)
            java.lang.Throwable r0 = r3.getCause()
            if (r0 == 0) goto L_0x0065
            java.lang.Throwable r3 = r3.getCause()
        L_0x0065:
            r7.A01(r1, r3)
            return r5
        L_0x0069:
            java.lang.String r0 = "active"
            goto L_0x0057
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23421Sz.A04(X.20A, X.2bZ):byte[]");
    }

    public final KeyStore A05() {
        if (this.A00 == null || !this.A01.A0Y(C58422vE.A02, 1862)) {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            this.A00 = instance;
            instance.load((KeyStore.LoadStoreParameter) null);
        }
        return this.A00;
    }

    public final SecretKey A07(KeyStore keyStore) {
        KeyStore.SecretKeyEntry secretKeyEntry = (KeyStore.SecretKeyEntry) keyStore.getEntry("aes_auth_key", (KeyStore.ProtectionParameter) null);
        if (secretKeyEntry != null) {
            return secretKeyEntry.getSecretKey();
        }
        Enumeration<String> aliases = keyStore.aliases();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Missing key alias ");
        A0o.append("aes_auth_key");
        A0o.append("; available aliases = ");
        throw new KeyStoreException(AnonymousClass000.A0X(TextUtils.join(",", Collections.list(aliases)), A0o));
    }

    public C23421Sz(C55682qk r1, C66663Mh r2, AnonymousClass1VX r3, C60152y5 r4) {
        super(r1, r2, r4);
        this.A01 = r3;
    }

    public void A03() {
        try {
            A05().deleteEntry("aes_auth_key");
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            C18260x0.A1K(A00(), "failed to clear keyStore");
        }
    }

    public final SecretKey A06() {
        try {
            return A07(A05());
        } catch (UnrecoverableKeyException e) {
            e = e;
            C18260x0.A1K(A00(), " KeyStore error, will wait and retry with new keystore");
            if (e.getCause() != null) {
                e = e.getCause();
            }
            A01("gd", e);
            SystemClock.sleep(50);
            return A07(A05());
        }
    }
}
