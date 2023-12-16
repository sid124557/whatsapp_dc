package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

/* renamed from: X.2yQ  reason: invalid class name and case insensitive filesystem */
public abstract class C60352yQ {
    public static C60352yQ A00(int i) {
        if (i == 2) {
            return new AnonymousClass47p();
        }
        if (i == 3) {
            return new AnonymousClass47q();
        }
        throw AnonymousClass0x9.A0i(AnonymousClass000.A0Y("Unknown version: ", AnonymousClass001.A0o(), i));
    }

    public byte[] A01(byte[] bArr, byte[] bArr2, int i) {
        try {
            return A02(AnonymousClass0x2.A0k(DefaultCrypto.HMAC_SHA256, new byte[32]).doFinal(bArr), bArr2, i);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }

    public final byte[] A02(byte[] bArr, byte[] bArr2, int i) {
        int i2;
        try {
            int ceil = (int) Math.ceil(((double) i) / 32.0d);
            byte[] bArr3 = new byte[0];
            ByteArrayOutputStream A0e = AnonymousClass0x9.A0e();
            if (this instanceof AnonymousClass47q) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            int i3 = i2;
            while (i2 < i3 + ceil) {
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
                i2++;
            }
            return A0e.toByteArray();
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }
}
