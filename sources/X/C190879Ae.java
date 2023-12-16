package X;

import android.text.TextUtils;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.ECGenParameterSpec;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.crypto.KeyAgreement;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9Ae  reason: invalid class name and case insensitive filesystem */
public class C190879Ae extends AnonymousClass9ST {
    public String A00;
    public final C193829Qf A01;
    public final JniBridge A02;
    public final JSONObject A03;
    public final JSONObject A04;
    public final byte[] A05 = C627236i.A0I(12);

    public AnonymousClass9ST A00(PublicKey... publicKeyArr) {
        C626936e.A0B(AnonymousClass000.A1X(this.A00));
        super.A00(publicKeyArr);
        try {
            String A002 = AnonymousClass9UD.A00(this.A04.toString());
            byte[] bArr = this.A05;
            byte[] bArr2 = bArr;
            String encodeToString = Base64.encodeToString(bArr, 11);
            ECGenParameterSpec eCGenParameterSpec = new ECGenParameterSpec("secp256r1");
            KeyPairGenerator instance = KeyPairGenerator.getInstance("EC");
            instance.initialize(eCGenParameterSpec);
            KeyPair generateKeyPair = instance.generateKeyPair();
            PublicKey publicKey = generateKeyPair.getPublic();
            JSONObject A1G = AnonymousClass0x9.A1G();
            JSONObject put = A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_ALG, "ECDH-ES").put("enc", "A256GCM");
            List list = this.A00;
            C626936e.A06(list);
            Collections.sort(list);
            put.put("apu", AnonymousClass9UD.A00(TextUtils.join(";", list))).put("apv", AnonymousClass9UD.A00(AnonymousClass9UD.A01((PublicKey) null))).put("epk", AnonymousClass0x9.A1G().put("kty", "EC").put("crv", "P-256").put("der", Base64.encodeToString(publicKey.getEncoded(), 2)));
            String A003 = AnonymousClass9UD.A00(A1G.toString());
            byte[] bytes = TextUtils.join(".", new String[]{A003, A002}).getBytes();
            PrivateKey privateKey = generateKeyPair.getPrivate();
            KeyAgreement instance2 = KeyAgreement.getInstance("ECDH");
            instance2.init(privateKey);
            instance2.doPhase((Key) null, true);
            byte[] generateSecret = instance2.generateSecret();
            List list2 = this.A00;
            C626936e.A06(list2);
            Collections.sort(list2);
            byte[] bytes2 = TextUtils.join(";", list2).getBytes();
            byte[] bytes3 = AnonymousClass9UD.A01((PublicKey) null).getBytes();
            boolean z = true;
            byte[] A012 = AnonymousClass36A.A01(1);
            byte[] bytes4 = "A256GCM".getBytes(C58152un.A0B);
            byte[] A013 = AnonymousClass36A.A01(256);
            int length = generateSecret.length;
            int i = length;
            int i2 = length + 4;
            int i3 = i2 + 4;
            int length2 = bytes4.length;
            int i4 = length2;
            int i5 = i3 + length2;
            int i6 = i5 + 4;
            int length3 = bytes2.length;
            int i7 = i6 + length3;
            int i8 = i7 + 4;
            int length4 = bytes3.length;
            int i9 = i8 + length4;
            int i10 = i9 + 4;
            byte[] bArr3 = new byte[i10];
            System.arraycopy(A012, 0, bArr3, 0, 4);
            System.arraycopy(generateSecret, 0, bArr3, 4, i);
            System.arraycopy(AnonymousClass36A.A01(i4), 0, bArr3, i2, 4);
            System.arraycopy(bytes4, 0, bArr3, i3, i4);
            System.arraycopy(AnonymousClass36A.A01(length3), 0, bArr3, i5, 4);
            System.arraycopy(bytes2, 0, bArr3, i6, length3);
            System.arraycopy(AnonymousClass36A.A01(length4), 0, bArr3, i7, 4);
            System.arraycopy(bytes3, 0, bArr3, i8, length4);
            System.arraycopy(A013, 0, bArr3, i9, 4);
            if (i10 != i10) {
                z = false;
            }
            C626936e.A0E(z, "length doesn't match");
            byte[] WCIAPIGcmAesCreateEncryptedCiphertext = this.A02.WCIAPIGcmAesCreateEncryptedCiphertext(MessageDigest.getInstance("SHA-256").digest(bArr3), bArr2, this.A03.toString().getBytes(), bytes, 16);
            if (WCIAPIGcmAesCreateEncryptedCiphertext == null) {
                throw new AnonymousClass9KN(AnonymousClass001.A0e("cipher failed"));
            }
            int length5 = WCIAPIGcmAesCreateEncryptedCiphertext.length;
            int i11 = length5 - 16;
            AnonymousClass0PJ A0G = AnonymousClass0x9.A0G(Arrays.copyOfRange(WCIAPIGcmAesCreateEncryptedCiphertext, 0, i11), Arrays.copyOfRange(WCIAPIGcmAesCreateEncryptedCiphertext, i11, length5));
            Object obj = A0G.A00;
            C626936e.A06(obj);
            String encodeToString2 = Base64.encodeToString((byte[]) obj, 11);
            Object obj2 = A0G.A01;
            C626936e.A06(obj2);
            String encodeToString3 = Base64.encodeToString((byte[]) obj2, 11);
            String[] strArr = new String[6];
            strArr[0] = A002;
            strArr[1] = A003;
            strArr[2] = "";
            C18280x3.A1A(encodeToString, encodeToString2, strArr);
            strArr[5] = encodeToString3;
            this.A00 = TextUtils.join(".", strArr);
            return this;
        } catch (UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | JSONException e) {
            Log.w("PAY: EncryptedTrustTokenBuilder/declareSigningKeys", e);
            throw new AnonymousClass9KN(e);
        }
    }

    public C190879Ae(C193829Qf r2, JniBridge jniBridge, JSONObject jSONObject, JSONObject jSONObject2) {
        C626936e.A0B(AnonymousClass001.A1W(jSONObject2.length()));
        this.A02 = jniBridge;
        this.A01 = r2;
        this.A04 = jSONObject;
        this.A03 = jSONObject2;
    }
}
