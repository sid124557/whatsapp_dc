package X;

import com.whatsapp.util.Log;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.2iY  reason: invalid class name and case insensitive filesystem */
public class C50652iY {
    public C46402bZ A00(String str, byte[] bArr) {
        try {
            byte[] A01 = AnonymousClass29O.A01(4);
            byte[] A012 = AnonymousClass29O.A01(16);
            String A0i = C18320x8.A0i(AnonymousClass29O.A01(16));
            return new C46402bZ(A0i, C18310x6.A1Y(new SecretKeySpec(A02(A01, AnonymousClass000.A0T(str, A0i)), "AES/OFB/NoPadding"), C18330xA.A0D(A012), Cipher.getInstance("AES/OFB/NoPadding"), bArr, 1), A012, A01, 2);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            Log.e("SymmetricEncryptionUtil/decryptData/issue encrypting", e);
            return null;
        }
    }

    public byte[] A01(C46402bZ r7, String str) {
        if (r7.A00 != 2) {
            Log.e("SymmetricEncryptionUtil/decryptData/invalid type");
            return null;
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(A02(r7.A04, AnonymousClass000.A0X(r7.A01, AnonymousClass000.A0l(str))), "AES/OFB/NoPadding");
            Cipher instance = Cipher.getInstance("AES/OFB/NoPadding");
            instance.init(2, secretKeySpec, C18330xA.A0D(r7.A03));
            return instance.doFinal(r7.A02);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            Log.e("SymmetricEncryptionUtil/decryptData/issue decrypting", e);
            return null;
        }
    }

    public final byte[] A02(byte[] bArr, String str) {
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = (char) bytes[i];
        }
        return C18300x5.A0y(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1And8BIT").generateSecret(new PBEKeySpec(cArr, bArr, 16, 128)).getEncoded()).getEncoded();
    }
}
