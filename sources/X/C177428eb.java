package X;

import java.security.cert.CRLException;

/* renamed from: X.8eb  reason: invalid class name and case insensitive filesystem */
public class C177428eb extends C173958Sk {
    public final byte[] A00;

    public C177428eb(String str, C176268cj r8, C180128kX r9, byte[] bArr, byte[] bArr2, boolean z) {
        super(str, r8, r9, bArr, z);
        this.A00 = bArr2;
    }

    public byte[] getEncoded() {
        byte[] bArr = this.A00;
        if (bArr != null) {
            return bArr;
        }
        throw new CRLException();
    }
}
