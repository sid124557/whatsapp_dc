package X;

import android.security.KeyPairGeneratorSpec;
import android.text.TextUtils;
import android.util.Base64;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9Tq  reason: invalid class name */
public class AnonymousClass9Tq {
    public KeyStore A00;
    public JSONObject A01;
    public boolean A02;
    public final C54292oU A03;
    public final C620933l A04;
    public final C160757oG A05 = C160757oG.A00("PaymentTrustedDeviceManager", "infra", "COMMON");
    public final AnonymousClass28X A06;

    public final synchronized void A02() {
        byte[] decode;
        if (!this.A02) {
            A01();
            try {
                KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
                this.A00 = instance;
                instance.load((KeyStore.LoadStoreParameter) null);
                C620933l r2 = this.A04;
                if (!C18280x3.A1W(r2.A03(), "payment_trusted_device_credential_use_keystore") && !C18280x3.A1W(r2.A03(), "payment_trusted_device_credential_use_keystore")) {
                    try {
                        Calendar instance2 = Calendar.getInstance();
                        Calendar instance3 = Calendar.getInstance();
                        instance3.add(1, 50);
                        KeyPairGeneratorSpec A042 = C1899693i.A04(new KeyPairGeneratorSpec.Builder(this.A03.A00).setAlias("payment_trusted_device_key_alias"), "CN=payment_trusted_device_key_alias", instance2, instance3);
                        KeyPairGenerator instance4 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                        instance4.initialize(A042);
                        instance4.generateKeyPair();
                    } catch (Exception e) {
                        C160757oG r22 = this.A05;
                        StringBuilder A0o = AnonymousClass001.A0o();
                        C18270x1.A1H(A0o, "generate RSA key pairs fails: ", e);
                        C1899693i.A0t(r22, A0o);
                    }
                    A04();
                }
                this.A02 = true;
            } catch (Exception e2) {
                C160757oG r23 = this.A05;
                StringBuilder A0o2 = AnonymousClass001.A0o();
                C18270x1.A1H(A0o2, "keystore init fails: ", e2);
                C1899693i.A0t(r23, A0o2);
            }
            String A0Z = C18280x3.A0Z(this.A04.A03(), "payment_trusted_device_credential");
            if (!TextUtils.isEmpty(A0Z) && (decode = Base64.decode(A0Z, 3)) != null) {
                A03(decode, 1);
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0021 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A03(byte[] r4, int r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 3
            java.lang.String r2 = android.util.Base64.encodeToString(r4, r0)     // Catch:{ JSONException -> 0x0021 }
            org.json.JSONObject r1 = r3.A01     // Catch:{ JSONException -> 0x0021 }
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch:{ JSONException -> 0x0021 }
            r1.put(r0, r2)     // Catch:{ JSONException -> 0x0021 }
            X.33l r1 = r3.A04     // Catch:{ JSONException -> 0x0021 }
            org.json.JSONObject r0 = r3.A01     // Catch:{ JSONException -> 0x0021 }
            java.lang.String r2 = r0.toString()     // Catch:{ JSONException -> 0x0021 }
            android.content.SharedPreferences$Editor r1 = X.C620933l.A00(r1)     // Catch:{ JSONException -> 0x0021 }
            java.lang.String r0 = "payments_trusted_device_credential_network_map"
            X.C18270x1.A0j(r1, r0, r2)     // Catch:{ JSONException -> 0x0021 }
            goto L_0x0028
        L_0x0021:
            X.7oG r1 = r3.A05     // Catch:{ all -> 0x002a }
            java.lang.String r0 = "setNetworkCredential failed"
            r1.A05(r0)     // Catch:{ all -> 0x002a }
        L_0x0028:
            monitor-exit(r3)
            return
        L_0x002a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9Tq.A03(byte[], int):void");
    }

    public final byte[] A05(byte[] bArr) {
        byte[] bArr2;
        byte[] A062;
        try {
            String string = this.A04.A03().getString("payment_trusted_device_credential_encrypted_aes", (String) null);
            if (TextUtils.isEmpty(string) || (bArr2 = Base64.decode(string, 3)) == null) {
                bArr2 = A04();
            }
            if (bArr2 == null || (A062 = A06(bArr2)) == null) {
                return null;
            }
            byte[] bArr3 = new byte[16];
            new SecureRandom().nextBytes(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(A062, "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(1, secretKeySpec, new IvParameterSpec(bArr3));
            byte[] doFinal = instance.doFinal(bArr);
            int length = doFinal.length;
            byte[] bArr4 = new byte[(length + 16)];
            System.arraycopy(bArr3, 0, bArr4, 0, 16);
            System.arraycopy(doFinal, 0, bArr4, 16, length);
            return bArr4;
        } catch (Exception e) {
            C160757oG r2 = this.A05;
            StringBuilder A0o = AnonymousClass001.A0o();
            C18270x1.A1H(A0o, "encrypt key fails: ", e);
            C1899693i.A0t(r2, A0o);
            return null;
        }
    }

    public final byte[] A06(byte[] bArr) {
        CipherInputStream cipherInputStream;
        try {
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            instance.init(2, ((KeyStore.PrivateKeyEntry) this.A00.getEntry("payment_trusted_device_key_alias", (KeyStore.ProtectionParameter) null)).getPrivateKey());
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                cipherInputStream = new CipherInputStream(byteArrayInputStream, instance);
                ArrayList A0s = AnonymousClass001.A0s();
                while (true) {
                    int read = cipherInputStream.read();
                    if (read == -1) {
                        break;
                    }
                    A0s.add(Byte.valueOf((byte) read));
                }
                int size = A0s.size();
                byte[] bArr2 = new byte[size];
                for (int i = 0; i < size; i++) {
                    bArr2[i] = ((Byte) A0s.get(i)).byteValue();
                }
                cipherInputStream.close();
                byteArrayInputStream.close();
                return bArr2;
            } catch (Throwable th) {
                byteArrayInputStream.close();
                throw th;
            }
            throw th;
        } catch (Exception e) {
            C160757oG r2 = this.A05;
            StringBuilder A0o = AnonymousClass001.A0o();
            C18270x1.A1H(A0o, "RSA decrypt fails: ", e);
            C1899693i.A0t(r2, A0o);
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public void A01() {
        JSONObject A1G;
        try {
            String A0Z = C18280x3.A0Z(this.A04.A03(), "payments_trusted_device_credential_network_map");
            if (A0Z != null) {
                A1G = AnonymousClass0x9.A1H(A0Z);
            } else {
                A1G = AnonymousClass0x9.A1G();
            }
            this.A01 = A1G;
        } catch (JSONException e) {
            this.A05.A05(AnonymousClass000.A0a("JSONObject instantiation ", AnonymousClass001.A0o(), e));
            this.A01 = AnonymousClass0x9.A1G();
        }
    }

    public final byte[] A04() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        byte[] bArr2 = null;
        try {
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            instance.init(1, ((KeyStore.PrivateKeyEntry) this.A00.getEntry("payment_trusted_device_key_alias", (KeyStore.ProtectionParameter) null)).getCertificate().getPublicKey());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            CipherOutputStream cipherOutputStream = new CipherOutputStream(byteArrayOutputStream, instance);
            cipherOutputStream.write(bArr);
            cipherOutputStream.close();
            bArr2 = byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            C160757oG r2 = this.A05;
            StringBuilder A0o = AnonymousClass001.A0o();
            C18270x1.A1H(A0o, "RSA encrypt fails: ", e);
            C1899693i.A0t(r2, A0o);
        }
        if (bArr2 != null) {
            C620933l r1 = this.A04;
            C18270x1.A0j(C620933l.A00(r1), "payment_trusted_device_credential_encrypted_aes", Base64.encodeToString(bArr2, 3));
        }
        Arrays.fill(bArr, (byte) 0);
        return bArr2;
    }

    public AnonymousClass9Tq(C54292oU r4, C620933l r5, AnonymousClass28X r6) {
        this.A03 = r4;
        this.A04 = r5;
        this.A06 = r6;
    }

    public PrivateKey A00(int i) {
        byte[] bArr;
        byte[] A062;
        A02();
        A01();
        byte[] bArr2 = null;
        String optString = this.A01.optString(String.valueOf(i), (String) null);
        if (!TextUtils.isEmpty(optString)) {
            bArr2 = Base64.decode(optString, 3);
        }
        if (bArr2 == null) {
            A02();
            try {
                KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA");
                instance.initialize(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
                PrivateKey privateKey = instance.genKeyPair().getPrivate();
                byte[] A052 = A05(privateKey.getEncoded());
                if (A052 != null) {
                    A03(A052, i);
                    C620933l r3 = this.A04;
                    if (!C18280x3.A1W(r3.A03(), "payment_trusted_device_credential_use_keystore")) {
                        C18270x1.A0l(C620933l.A00(r3), "payment_trusted_device_credential_use_keystore", true);
                    }
                    Arrays.fill(A052, (byte) 0);
                    return privateKey;
                }
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                C160757oG r2 = this.A05;
                StringBuilder A0o = AnonymousClass001.A0o();
                C18270x1.A1H(A0o, "generate RSA key fails: ", e);
                C1899693i.A0t(r2, A0o);
            }
            return null;
        }
        try {
            C620933l r6 = this.A04;
            if (!C18280x3.A1W(r6.A03(), "payment_trusted_device_credential_use_keystore")) {
                byte[] A053 = A05(bArr2);
                if (A053 != null) {
                    A03(bArr2, i);
                    C18270x1.A0l(C620933l.A00(r6), "payment_trusted_device_credential_use_keystore", true);
                    Arrays.fill(A053, (byte) 0);
                }
            } else {
                try {
                    String string = r6.A03().getString("payment_trusted_device_credential_encrypted_aes", (String) null);
                    if (TextUtils.isEmpty(string) || (bArr = Base64.decode(string, 3)) == null) {
                        bArr = A04();
                    }
                    if (bArr == null || (A062 = A06(bArr)) == null) {
                        bArr2 = null;
                    } else {
                        byte[] bArr3 = new byte[16];
                        System.arraycopy(bArr2, 0, bArr3, 0, 16);
                        int length = bArr2.length - 16;
                        byte[] bArr4 = new byte[length];
                        System.arraycopy(bArr2, 16, bArr4, 0, length);
                        SecretKeySpec secretKeySpec = new SecretKeySpec(A062, "AES");
                        Cipher instance2 = Cipher.getInstance("AES/CBC/PKCS5Padding");
                        instance2.init(2, secretKeySpec, new IvParameterSpec(bArr3));
                        bArr2 = instance2.doFinal(bArr4);
                    }
                } catch (Exception e2) {
                    C160757oG r22 = this.A05;
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    C18270x1.A1H(A0o2, "decrypt key fails: ", e2);
                    C1899693i.A0t(r22, A0o2);
                    bArr2 = null;
                }
            }
            if (bArr2 == null) {
                return null;
            }
            PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(bArr2);
            KeyFactory instance3 = KeyFactory.getInstance("RSA");
            Arrays.fill(bArr2, (byte) 0);
            return instance3.generatePrivate(pKCS8EncodedKeySpec);
        } catch (Exception e3) {
            C160757oG r23 = this.A05;
            StringBuilder A0o3 = AnonymousClass001.A0o();
            C18270x1.A1H(A0o3, "loadRSAKey fails, ", e3);
            C1899693i.A0t(r23, A0o3);
            return null;
        }
    }
}
