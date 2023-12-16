package X;

import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.7Ux  reason: invalid class name and case insensitive filesystem */
public class C151467Ux {
    public static byte[] A00(C151467Ux r2, C171558Hn r3, String str, byte[] bArr, byte[] bArr2) {
        return r2.A02(bArr2, C162257rX.A0A(str, bArr, r3.A02), r3.A02);
    }

    public byte[] A01(byte[] bArr, byte[] bArr2) {
        String replace = "SHA-256".replace("-", "");
        try {
            Mac instance = Mac.getInstance(AnonymousClass000.A0T("Hmac", replace));
            instance.init(new SecretKeySpec(bArr, AnonymousClass000.A0T("Hmac", replace)));
            return instance.doFinal(bArr2);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }

    public byte[] A02(byte[] bArr, byte[] bArr2, int i) {
        String replace = "SHA-256".replace("-", "");
        try {
            int ceil = (int) Math.ceil(((double) i) / ((double) 32));
            byte[] bArr3 = new byte[0];
            ByteArrayOutputStream A0e = AnonymousClass0x9.A0e();
            for (int i2 = 1; i2 < ceil + 1; i2++) {
                Mac instance = Mac.getInstance(AnonymousClass000.A0T("Hmac", replace));
                instance.init(new SecretKeySpec(bArr, AnonymousClass000.A0T("Hmac", replace)));
                instance.update(bArr3);
                if (bArr2 != null) {
                    instance.update(bArr2);
                }
                instance.update((byte) i2);
                bArr3 = instance.doFinal();
                int min = Math.min(i, bArr3.length);
                A0e.write(bArr3, 0, min);
                i -= min;
            }
            return A0e.toByteArray();
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }
}
