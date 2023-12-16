package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.7pJ  reason: invalid class name and case insensitive filesystem */
public class C161257pJ {
    public Cipher A00 = Cipher.getInstance("AES/CBC/PKCS5Padding");

    public static byte[] A01(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
        instance.init(1, secretKeySpec, new GCMParameterSpec(128, bArr3));
        return instance.doFinal(bArr);
    }

    public static byte[] A00(String str, String str2) {
        byte[] A01 = C154487dF.A01(str2.getBytes());
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        instance.update(A01);
        return instance.digest(str.getBytes(DefaultCrypto.UTF_8));
    }
}
