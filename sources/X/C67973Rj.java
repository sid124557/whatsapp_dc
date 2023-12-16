package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;

/* renamed from: X.3Rj  reason: invalid class name and case insensitive filesystem */
public class C67973Rj implements C84054Av {
    public final byte[] A00;

    public C67973Rj(byte[] bArr) {
        this.A00 = bArr;
    }

    public byte[] B2R(byte[] bArr, byte[] bArr2) {
        C72423dh A002 = C72423dh.A00();
        byte[] bArr3 = A002.A02.A01;
        byte[][] A03 = AnonymousClass31Q.A03(C158317jm.A00().A02(new C72413dg(this.A00).A01, A002.A01.A01), bArr3);
        byte[] bArr4 = A03[0];
        byte[] bArr5 = A03[1];
        try {
            byte[] A1Y = C18310x6.A1Y(C18300x5.A0y(bArr4), C18330xA.A0D(bArr2), Cipher.getInstance("AES/CBC/PKCS5Padding"), bArr, 1);
            try {
                Mac A0k = AnonymousClass0x2.A0k(DefaultCrypto.HMAC_SHA256, bArr5);
                A0k.update(bArr2);
                byte[] doFinal = A0k.doFinal(A1Y);
                byte[][] bArr6 = new byte[4][];
                bArr6[0] = bArr2;
                bArr6[1] = bArr3;
                AnonymousClass001.A1H(doFinal, A1Y, bArr6);
                byte[] A06 = AnonymousClass36A.A06(bArr6);
                A002.destroy();
                return A06;
            } catch (InvalidKeyException | NoSuchAlgorithmException e) {
                throw AnonymousClass0x9.A0i(e);
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e2) {
            throw AnonymousClass0x9.A0i(e2);
        }
    }
}
