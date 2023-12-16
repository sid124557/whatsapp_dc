package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* renamed from: X.34c  reason: invalid class name */
public class AnonymousClass34c {
    public static final byte[] A01 = new byte[0];
    public final C44392Vw A00;

    public byte[] A02(C60542yj r4, String str, byte[] bArr, long j) {
        byte[][] bArr2 = new byte[3][];
        bArr2[0] = bArr;
        bArr2[1] = C18320x8.A1X(j);
        return A00(DefaultCrypto.HMAC_SHA256, AnonymousClass36A.A04(str.getBytes(C58152un.A0D), bArr2, 2), this.A00.A00(r4.A00).A02);
    }

    public final byte[] A03(AnonymousClass33J r8, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[][] bArr4 = new byte[2][];
        bArr4[0] = bArr;
        byte[] A04 = AnonymousClass36A.A04(r8.A00, bArr4, 1);
        ByteBuffer order = ByteBuffer.allocate(8).order(ByteOrder.BIG_ENDIAN);
        order.putLong((long) A04.length);
        byte[] array = order.array();
        byte[][] bArr5 = new byte[3][];
        bArr5[0] = A04;
        byte[] bArr6 = new byte[32];
        System.arraycopy(A00("HmacSHA512", AnonymousClass36A.A03(bArr3, array, bArr5, 1, 2), bArr2), 0, bArr6, 0, 32);
        return bArr6;
    }

    public AnonymousClass34c(C44392Vw r1) {
        this.A00 = r1;
    }

    public static final byte[] A00(String str, byte[] bArr, byte[] bArr2) {
        try {
            return AnonymousClass0x2.A0k(str, bArr2).doFinal(bArr);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new C23361Sh(e);
        }
    }

    public static final byte[] A01(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        try {
            return C18310x6.A1Y(C18300x5.A0y(bArr3), C18330xA.A0D(bArr), Cipher.getInstance("AES/CBC/PKCS5Padding"), bArr2, i);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new C23361Sh(e);
        }
    }
}
