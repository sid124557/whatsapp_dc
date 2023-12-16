package X;

import java.security.cert.CertificateEncodingException;

/* renamed from: X.8ed  reason: invalid class name and case insensitive filesystem */
public class C177448ed extends C174008Sp {
    public final byte[] encoding;

    public C177448ed(String str, C176398cw r9, C176368ct r10, C180128kX r11, byte[] bArr, byte[] bArr2, boolean[] zArr) {
        super(str, r9, r10, r11, bArr, zArr);
        this.encoding = bArr2;
    }

    public byte[] getEncoded() {
        byte[] bArr = this.encoding;
        if (bArr != null) {
            return bArr;
        }
        throw new CertificateEncodingException();
    }
}
