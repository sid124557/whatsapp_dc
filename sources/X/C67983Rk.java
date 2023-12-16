package X;

import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* renamed from: X.3Rk  reason: invalid class name and case insensitive filesystem */
public class C67983Rk implements C84054Av {
    public final byte[] A00;

    public byte[] B2R(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.A00;
        int length = bArr3.length;
        int length2 = bArr.length;
        if (length >= length2) {
            try {
                PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr3));
                Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                instance.init(1, generatePublic);
                return instance.doFinal(bArr);
            } catch (Exception e) {
                throw C18330xA.A09(e);
            }
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("PAY: RsaKey encrypt: payload length is ");
            A0o.append(length2);
            A0o.append(" bytes while key can encrypt at most ");
            A0o.append(length);
            throw AnonymousClass0x9.A0i(C160757oG.A01("RsaKey", AnonymousClass000.A0X(" bytes", A0o)));
        }
    }

    public C67983Rk(byte[] bArr) {
        this.A00 = bArr;
    }
}
