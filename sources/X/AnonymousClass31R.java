package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;

/* renamed from: X.31R  reason: invalid class name */
public abstract class AnonymousClass31R {
    public static C42162Na A00(byte[] bArr) {
        int length = bArr.length;
        if (length == 80) {
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArr, 0, bArr2, 0, 16);
            byte[] bArr3 = new byte[32];
            System.arraycopy(bArr, 16, bArr3, 0, 32);
            byte[] bArr4 = new byte[32];
            System.arraycopy(bArr, 48, bArr4, 0, 32);
            return new C42162Na(bArr3, bArr4, bArr2);
        }
        throw AnonymousClass0x9.A0i(AnonymousClass000.A0Y("Invalid length of derived secret; length=", AnonymousClass001.A0o(), length));
    }

    public static Cipher A01(byte[] bArr, byte[] bArr2, int i) {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(i, C18300x5.A0y(bArr2), C18330xA.A0D(bArr));
            return instance;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }

    public static Mac A02(byte[] bArr, byte[] bArr2) {
        try {
            Mac A0k = AnonymousClass0x2.A0k(DefaultCrypto.HMAC_SHA256, bArr2);
            A0k.update(bArr);
            return A0k;
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }
}
