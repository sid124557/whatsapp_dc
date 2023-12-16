package X;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.2XI  reason: invalid class name */
public class AnonymousClass2XI {
    public byte[] A00;

    public AnonymousClass2XI(byte[] bArr) {
        try {
            this.A00 = bArr.length > 32 ? AnonymousClass0x7.A0t().digest(bArr) : bArr;
        } catch (NoSuchAlgorithmException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }

    public void A00(byte[] bArr) {
        try {
            MessageDigest A0t = AnonymousClass0x7.A0t();
            A0t.update(this.A00);
            this.A00 = A0t.digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }
}
