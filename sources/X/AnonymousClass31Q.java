package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

/* renamed from: X.31Q  reason: invalid class name */
public class AnonymousClass31Q {
    public static byte[][] A03(byte[] bArr, byte[] bArr2) {
        return AnonymousClass36A.A07(A02(bArr, bArr2, (byte[]) null, 64), 32, 32);
    }

    public static byte[] A00(byte[] bArr, byte[] bArr2, int i) {
        try {
            return A01(C380825n.A00(bArr, new byte[32]), bArr2, i);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }

    public static byte[] A01(byte[] bArr, byte[] bArr2, int i) {
        try {
            int ceil = (int) Math.ceil(((double) i) / 32.0d);
            byte[] bArr3 = new byte[0];
            ByteArrayOutputStream A0e = AnonymousClass0x9.A0e();
            for (int i2 = 1; i2 < ceil + 1; i2++) {
                Mac A0k = AnonymousClass0x2.A0k(DefaultCrypto.HMAC_SHA256, bArr);
                A0k.update(bArr3);
                if (bArr2 != null) {
                    A0k.update(bArr2);
                }
                A0k.update((byte) i2);
                bArr3 = A0k.doFinal();
                int min = Math.min(i, bArr3.length);
                A0e.write(bArr3, 0, min);
                i -= min;
            }
            return A0e.toByteArray();
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }

    public static byte[] A02(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        try {
            return A01(C380825n.A00(bArr, bArr2), bArr3, i);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }
}
