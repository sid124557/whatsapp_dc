package X;

import javax.crypto.SecretKey;

/* renamed from: X.8Ox  reason: invalid class name and case insensitive filesystem */
public class C173258Ox implements SecretKey {
    public final C184648sI converter;
    public final char[] password;

    public String getAlgorithm() {
        return "PBKDF2";
    }

    public byte[] getEncoded() {
        C184648sI r0 = this.converter;
        char[] cArr = this.password;
        switch (((C126186Mu) r0).A00) {
            case 0:
                if (cArr == null) {
                    return new byte[0];
                }
                int length = cArr.length;
                byte[] bArr = new byte[length];
                for (int i = 0; i != length; i = AnonymousClass6CA.A0A(bArr, cArr[i], i)) {
                }
                return bArr;
            case 1:
                if (cArr != null) {
                    return C162077rB.A04(cArr);
                }
                return new byte[0];
            default:
                return C158467k1.A00(cArr);
        }
    }

    public String getFormat() {
        switch (((C126186Mu) this.converter).A00) {
            case 0:
                return "ASCII";
            case 1:
                return "UTF8";
            default:
                return "PKCS12";
        }
    }

    public C173258Ox(C184648sI r2, char[] cArr) {
        this.password = C161007oo.A03(cArr);
        this.converter = r2;
    }
}
