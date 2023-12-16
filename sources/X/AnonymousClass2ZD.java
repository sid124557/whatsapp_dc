package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.2ZD  reason: invalid class name */
public class AnonymousClass2ZD {
    public final C60352yQ A00;
    public final byte[] A01;

    public C48832fY A00(AnonymousClass3ZK r7, C42012Ml r8) {
        byte[] A03 = C616431q.A03(r8.A00, r7);
        C60352yQ r4 = this.A00;
        byte[] bArr = this.A01;
        try {
            byte[][] A012 = C616531r.A01(r4.A02(AnonymousClass0x2.A0k(DefaultCrypto.HMAC_SHA256, bArr).doFinal(A03), "WhisperRatchet".getBytes(), 64), 32, 32);
            return new C48832fY(new AnonymousClass2ZD(r4, A012[0]), new C60112y1(r4, A012[1], 0));
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }

    public AnonymousClass2ZD(C60352yQ r1, byte[] bArr) {
        this.A00 = r1;
        this.A01 = bArr;
    }
}
