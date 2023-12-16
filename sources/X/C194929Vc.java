package X;

import android.text.TextUtils;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9Vc  reason: invalid class name and case insensitive filesystem */
public class C194929Vc {
    public final C56612sH A00;
    public final C620933l A01;
    public final C194669Ua A02;
    public final AnonymousClass9Tq A03;
    public final JniBridge A04;

    public String A04(String str) {
        String A012 = A01(1);
        if (!TextUtils.isEmpty(A012)) {
            byte[] bArr = (byte[]) JniBridge.jvidispatchOOO(13, A012.getBytes(), AnonymousClass000.A0V("C=US,ST=California,L=Menlo Park,O=Facebook,OU=WhatsApp,CN=", str, AnonymousClass001.A0o()).getBytes());
            if (bArr != null) {
                return new String(bArr).split("\u0000")[0];
            }
        }
        return null;
    }

    public final String A01(int i) {
        PrivateKey A002 = this.A03.A00(i);
        if (A002 == null) {
            return null;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("-----BEGIN PRIVATE KEY-----\r\n");
        A0o.append(Base64.encodeToString(A002.getEncoded(), 0));
        return AnonymousClass000.A0X("-----END PRIVATE KEY-----\r\n\u0000", A0o);
    }

    public String A02(C67973Rj r24, String str) {
        String str2;
        try {
            ECGenParameterSpec eCGenParameterSpec = new ECGenParameterSpec("secp256r1");
            KeyPairGenerator instance = KeyPairGenerator.getInstance("EC");
            instance.initialize(eCGenParameterSpec);
            KeyPair generateKeyPair = instance.generateKeyPair();
            byte[] A0I = C627236i.A0I(12);
            String encodeToString = Base64.encodeToString(A0I, 11);
            JSONObject A1G = AnonymousClass0x9.A1G();
            ECPoint w = ((ECPublicKey) generateKeyPair.getPublic()).getW();
            try {
                A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_ALG, "ECDH-ES").put("enc", "A256GCM").put("epk", AnonymousClass0x9.A1G().put("kty", "EC").put("crv", "P-256").put("x", Base64.encodeToString(w.getAffineX().toByteArray(), 2)).put("y", Base64.encodeToString(w.getAffineY().toByteArray(), 2)));
            } catch (JSONException e) {
                Log.e("PAY: BrazilTokenizationHelper/generateEncodedEloHeader failed: ", e);
            }
            try {
                str2 = Base64.encodeToString(A1G.toString().getBytes(C58152un.A0B), 11);
            } catch (UnsupportedEncodingException e2) {
                Log.e("PAY: BrazilTokenizationHelper/generateEncodedEloHeader failed: ", e2);
                str2 = "";
            }
            byte[] bArr = new byte[0];
            try {
                bArr = str2.getBytes("US-ASCII");
            } catch (UnsupportedEncodingException e3) {
                Log.e("PAY: BrazilTokenizationHelper/fetchBindingInfo failed generating aad: ", e3);
            }
            try {
                PublicKey generatePublic = KeyFactory.getInstance("EC").generatePublic(new X509EncodedKeySpec(r24.A00));
                if (generatePublic != null) {
                    byte[] bArr2 = new byte[0];
                    try {
                        PrivateKey privateKey = generateKeyPair.getPrivate();
                        KeyAgreement instance2 = KeyAgreement.getInstance("ECDH");
                        instance2.init(privateKey);
                        instance2.doPhase(generatePublic, true);
                        bArr2 = instance2.generateSecret();
                    } catch (InvalidKeyException | NoSuchAlgorithmException e4) {
                        Log.e("PAY: BrazilTokenizationHelper/fetchBindingInfo failed generating sharedSecret: ", e4);
                    }
                    byte[] bArr3 = new byte[0];
                    try {
                        byte[] A012 = AnonymousClass36A.A01(0);
                        byte[] A013 = AnonymousClass36A.A01(0);
                        boolean z = true;
                        byte[] A014 = AnonymousClass36A.A01(1);
                        byte[] bytes = "A256GCM".getBytes(C58152un.A0B);
                        byte[] A015 = AnonymousClass36A.A01(256);
                        int length = A014.length;
                        int length2 = bArr2.length;
                        int i = length + length2;
                        int length3 = bytes.length;
                        int length4 = A012.length;
                        int length5 = A013.length;
                        int length6 = A015.length;
                        int length7 = i + AnonymousClass36A.A01(length3).length + length3 + length4 + length5 + length6;
                        byte[] bArr4 = new byte[length7];
                        System.arraycopy(A014, 0, bArr4, 0, length);
                        System.arraycopy(bArr2, 0, bArr4, length, length2);
                        System.arraycopy(AnonymousClass36A.A01(length3), 0, bArr4, i, AnonymousClass36A.A01(length3).length);
                        int length8 = i + AnonymousClass36A.A01(length3).length;
                        System.arraycopy(bytes, 0, bArr4, length8, length3);
                        int i2 = length8 + length3;
                        System.arraycopy(A012, 0, bArr4, i2, length4);
                        int i3 = i2 + length4;
                        System.arraycopy(A013, 0, bArr4, i3, length5);
                        int i4 = i3 + length5;
                        System.arraycopy(A015, 0, bArr4, i4, length6);
                        if (i4 + length6 != length7) {
                            z = false;
                        }
                        C626936e.A0E(z, "length doesn't match");
                        bArr3 = MessageDigest.getInstance("SHA-256").digest(bArr4);
                    } catch (UnsupportedEncodingException | NoSuchAlgorithmException e5) {
                        Log.e("PAY: BrazilTokenizationHelper/fetchBindingInfo failed symmetric key generation: ", e5);
                    }
                    byte[] bArr5 = new byte[0];
                    try {
                        bArr5 = this.A04.WCIAPIGcmAesCreateEncryptedCiphertext(bArr3, A0I, str.getBytes(C58152un.A0B), bArr, 16);
                    } catch (UnsupportedEncodingException e6) {
                        Log.e("PAY: BrazilTokenizationHelper/fetchBindingInfo failed: ", e6);
                    }
                    if (bArr5 != null) {
                        int length9 = bArr5.length;
                        int i5 = length9 - 16;
                        byte[] copyOfRange = Arrays.copyOfRange(bArr5, 0, i5);
                        C626936e.A06(copyOfRange);
                        String encodeToString2 = Base64.encodeToString(copyOfRange, 11);
                        byte[] copyOfRange2 = Arrays.copyOfRange(bArr5, i5, length9);
                        C626936e.A06(copyOfRange2);
                        String encodeToString3 = Base64.encodeToString(copyOfRange2, 11);
                        String[] strArr = new String[5];
                        strArr[0] = str2;
                        strArr[1] = "";
                        AnonymousClass6C7.A19(encodeToString, encodeToString2, encodeToString3, strArr);
                        return TextUtils.join(".", strArr);
                    }
                }
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e7) {
                throw new AssertionError(e7);
            }
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException e8) {
            Log.e("PAY: BrazilTokenizationHelper/fetchBindingInfo failed generating ephemeral key: ", e8);
        }
        return null;
    }

    public final String A07(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            try {
                String str3 = C58152un.A0B;
                String join = TextUtils.join(".", new String[]{Base64.encodeToString(str.getBytes(str3), 11), Base64.encodeToString(str2.getBytes(str3), 11)});
                String A012 = A01(1);
                if (!TextUtils.isEmpty(A012)) {
                    return AnonymousClass000.A0X(Base64.encodeToString((byte[]) JniBridge.jvidispatchOOO(12, join.getBytes(), A012.getBytes()), 11), AnonymousClass000.A0m(join, "."));
                }
            } catch (UnsupportedEncodingException e) {
                Log.w("PAY: generateJwsToken threw UnsupportedEncoding Exception: ", e);
            }
        }
        return null;
    }

    public C194929Vc(C56612sH r1, C620933l r2, C194669Ua r3, AnonymousClass9Tq r4, JniBridge jniBridge) {
        this.A00 = r1;
        this.A04 = jniBridge;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }

    public static final String A00(String str, String str2, String str3) {
        JSONObject A1G = AnonymousClass0x9.A1G();
        A1G.put("clientDeviceID", str);
        if (!TextUtils.isEmpty(str2)) {
            A1G.put("clientReferenceID", str2);
        }
        A1G.put("vProvisionedTokenID", str3);
        return AnonymousClass0x9.A0y(String.valueOf(new SecureRandom().nextInt(100000)), "nonce", A1G);
    }

    public String A03(C67993Rl r20, String str) {
        BigInteger bigInteger;
        try {
            String A0y = AnonymousClass0x9.A0y("PS256", PublicKeyCredentialControllerUtility.JSON_KEY_ALG, AnonymousClass0x9.A1G());
            PrivateKey A002 = this.A03.A00(1);
            String str2 = null;
            if (A002 != null) {
                try {
                    JSONObject put = AnonymousClass0x9.A1G().put("otp", str).put("certID", C194669Ua.A00(((RSAKey) A002).getModulus()));
                    C194669Ua r6 = this.A02;
                    String obj = put.toString();
                    C67993Rl r8 = r20;
                    try {
                        bigInteger = ((RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(r8.A06))).getModulus();
                    } catch (Exception e) {
                        try {
                            Log.w("PAY: JweCompactSerializer/getModulusFromProviderKey failed: ", e);
                            bigInteger = null;
                        } catch (Exception e2) {
                            StringBuilder A0o = AnonymousClass001.A0o();
                            C18270x1.A1H(A0o, "PAY: JweCompactSerializer/encryptCek", e2);
                            Log.w(A0o.toString());
                            throw new RuntimeException(e2);
                        } catch (Exception e3) {
                            Log.w("PAY: JweCompactSerializer/generateStepUpJweToken failed: ", e3);
                        }
                    }
                    String obj2 = AnonymousClass0x9.A1G().put(PublicKeyCredentialControllerUtility.JSON_KEY_ALG, "RSA-OAEP-256").put("enc", "A256GCM").put("typ", "JOSE").put("kid", C194669Ua.A00(bigInteger)).toString();
                    String str3 = C58152un.A0B;
                    String encodeToString = Base64.encodeToString(obj2.getBytes(str3), 11);
                    byte[] bArr = new byte[32];
                    SecureRandom secureRandom = new SecureRandom();
                    secureRandom.nextBytes(bArr);
                    PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(r8.A06));
                    Cipher instance = Cipher.getInstance("RSA/ECB/OAEPwithSHA-256andMGF1Padding");
                    instance.init(1, generatePublic);
                    String encodeToString2 = Base64.encodeToString(instance.doFinal(bArr), 11);
                    byte[] bArr2 = new byte[12];
                    secureRandom.nextBytes(bArr2);
                    String encodeToString3 = Base64.encodeToString(bArr2, 11);
                    byte[] bytes = obj.getBytes(str3);
                    byte[] WCIAPIGcmAesCreateEncryptedCiphertext = r6.A00.WCIAPIGcmAesCreateEncryptedCiphertext(bArr, bArr2, bytes, encodeToString.getBytes("US-ASCII"), 16);
                    if (WCIAPIGcmAesCreateEncryptedCiphertext != null) {
                        int length = bytes.length;
                        byte[] copyOfRange = Arrays.copyOfRange(WCIAPIGcmAesCreateEncryptedCiphertext, 0, length);
                        byte[] copyOfRange2 = Arrays.copyOfRange(WCIAPIGcmAesCreateEncryptedCiphertext, length, WCIAPIGcmAesCreateEncryptedCiphertext.length);
                        String encodeToString4 = Base64.encodeToString(copyOfRange, 11);
                        String encodeToString5 = Base64.encodeToString(copyOfRange2, 11);
                        String[] strArr = new String[5];
                        strArr[0] = encodeToString;
                        strArr[1] = encodeToString2;
                        AnonymousClass6C7.A19(encodeToString3, encodeToString4, encodeToString5, strArr);
                        str2 = TextUtils.join(".", strArr);
                    }
                } catch (JSONException e4) {
                    Log.w("PAY: BrazilTokenizationHelper/generateStepUpJweToken failed: ", e4);
                }
            }
            return A07(A0y, str2);
        } catch (JSONException e5) {
            Log.w("PAY: generateJwsTokenForCode failed: ", e5);
            return null;
        }
    }

    public String A05(String str) {
        if (!TextUtils.isEmpty(str)) {
            String A012 = A01(5);
            if (!TextUtils.isEmpty(A012)) {
                return Base64.encodeToString((byte[]) JniBridge.jvidispatchOOO(14, str.getBytes(), A012.getBytes()), 2);
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r2.A02.A06("Failed to get the wallet_secret");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0084, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        com.whatsapp.util.Log.e("PAY: BrazilTokenizationHelper/fetchEloWalletSecret failed: ", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a5, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a6, code lost:
        com.whatsapp.util.Log.e("PAY: BrazilTokenizationHelper/signEloDataWithWalletSecret failed: ", r1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002a */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008d A[Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0093 A[Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a5 A[ExcHandler: InvalidKeyException | NoSuchAlgorithmException (r1v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:3:0x000b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A06(java.lang.String r11) {
        /*
            r10 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r3 = 0
            if (r0 != 0) goto L_0x00ab
            java.lang.String r9 = "SHA-256"
            java.lang.String r4 = ""
            X.33l r2 = r10.A01     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a5 }
            android.content.SharedPreferences r1 = r2.A03()     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a5 }
            java.lang.String r0 = "payment_trusted_device_elo_wallet_store"
            r8 = 0
            java.lang.String r0 = r1.getString(r0, r3)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a5 }
            if (r0 == 0) goto L_0x001f
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1H(r0)     // Catch:{ JSONException -> 0x002a, InvalidKeyException | NoSuchAlgorithmException -> 0x00a5 }
            goto L_0x0023
        L_0x001f:
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x002a, InvalidKeyException | NoSuchAlgorithmException -> 0x00a5 }
        L_0x0023:
            java.lang.String r0 = "wallet_secret"
            java.lang.String r8 = r1.getString(r0)     // Catch:{ JSONException -> 0x002a, InvalidKeyException | NoSuchAlgorithmException -> 0x00a5 }
            goto L_0x0031
        L_0x002a:
            X.7oG r1 = r2.A02     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a5 }
            java.lang.String r0 = "Failed to get the wallet_secret"
            r1.A06(r0)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a5 }
        L_0x0031:
            X.9Tq r1 = r10.A03     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a5 }
            r0 = 5
            java.security.PrivateKey r7 = r1.A00(r0)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a5 }
            if (r7 == 0) goto L_0x008a
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a5 }
            if (r0 != 0) goto L_0x008a
            java.lang.String r0 = "RSA/ECB/OAEPPadding"
            javax.crypto.Cipher r6 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0084, InvalidKeyException | NoSuchAlgorithmException -> 0x00a5 }
            java.lang.String r5 = "MGF1"
            java.security.spec.MGF1ParameterSpec r2 = new java.security.spec.MGF1ParameterSpec     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0084, InvalidKeyException | NoSuchAlgorithmException -> 0x00a5 }
            r2.<init>(r9)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0084, InvalidKeyException | NoSuchAlgorithmException -> 0x00a5 }
            javax.crypto.spec.PSource$PSpecified r0 = javax.crypto.spec.PSource.PSpecified.DEFAULT     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0084, InvalidKeyException | NoSuchAlgorithmException -> 0x00a5 }
            javax.crypto.spec.OAEPParameterSpec r1 = new javax.crypto.spec.OAEPParameterSpec     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0084, InvalidKeyException | NoSuchAlgorithmException -> 0x00a5 }
            r1.<init>(r9, r5, r2, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0084, InvalidKeyException | NoSuchAlgorithmException -> 0x00a5 }
            r0 = 2
            r6.init(r0, r7, r1)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0084, InvalidKeyException | NoSuchAlgorithmException -> 0x00a5 }
            byte[] r0 = android.util.Base64.decode(r8, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0084, InvalidKeyException | NoSuchAlgorithmException -> 0x00a5 }
            byte[] r2 = r6.doFinal(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0084, InvalidKeyException | NoSuchAlgorithmException -> 0x00a5 }
            java.lang.String r0 = X.C58152un.A0B     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0084, InvalidKeyException | NoSuchAlgorithmException -> 0x00a5 }
            java.lang.String r1 = new java.lang.String     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0084, InvalidKeyException | NoSuchAlgorithmException -> 0x00a5 }
            r1.<init>(r2, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0084, InvalidKeyException | NoSuchAlgorithmException -> 0x00a5 }
            java.lang.String r0 = "-----BEGIN (.*)-----"
            java.lang.String r1 = r1.replaceAll(r0, r4)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0084, InvalidKeyException | NoSuchAlgorithmException -> 0x00a5 }
            java.lang.String r0 = "-----END (.*)----"
            java.lang.String r1 = r1.replaceAll(r0, r4)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0084, InvalidKeyException | NoSuchAlgorithmException -> 0x00a5 }
            java.lang.String r0 = "\r\n"
            java.lang.String r1 = r1.replaceAll(r0, r4)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0084, InvalidKeyException | NoSuchAlgorithmException -> 0x00a5 }
            java.lang.String r0 = "\n"
            java.lang.String r0 = r1.replaceAll(r0, r4)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0084, InvalidKeyException | NoSuchAlgorithmException -> 0x00a5 }
            java.lang.String r0 = r0.trim()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0084, InvalidKeyException | NoSuchAlgorithmException -> 0x00a5 }
            goto L_0x008b
        L_0x0084:
            r1 = move-exception
            java.lang.String r0 = "PAY: BrazilTokenizationHelper/fetchEloWalletSecret failed: "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a5 }
        L_0x008a:
            r0 = 0
        L_0x008b:
            if (r0 != 0) goto L_0x0093
            java.lang.String r0 = "PAY: BrazilTokenizationHelper/signEloDataWithWalletSecret failed because secret is empty"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a5 }
            return r3
        L_0x0093:
            r2 = 2
            byte[] r1 = android.util.Base64.decode(r0, r2)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a5 }
            byte[] r0 = r11.getBytes()     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a5 }
            byte[] r0 = X.C380825n.A00(r0, r1)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a5 }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r2)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a5 }
            return r0
        L_0x00a5:
            r1 = move-exception
            java.lang.String r0 = "PAY: BrazilTokenizationHelper/signEloDataWithWalletSecret failed: "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00ab:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194929Vc.A06(java.lang.String):java.lang.String");
    }

    public String A08(String str, String str2, String str3) {
        try {
            JSONObject A1G = AnonymousClass0x9.A1G();
            A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_ALG, "PS256");
            A1G.put("typ", "JOSE");
            return A07(AnonymousClass0x9.A0y(str, "kid", A1G), A00(str, str2, str3));
        } catch (JSONException e) {
            Log.w("PAY: generateDeviceBindingJwsToken threw creating json string: ", e);
            return null;
        }
    }
}
