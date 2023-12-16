package X;

import java.security.SecureRandom;

/* renamed from: X.7W0  reason: invalid class name */
public class AnonymousClass7W0 {
    public int A00;
    public SecureRandom A01;

    public void A00(C148407Ig r2) {
        this.A01 = r2.A01;
        this.A00 = (r2.A00 + 7) / 8;
    }

    public byte[] A01() {
        byte[] bArr = new byte[this.A00];
        this.A01.nextBytes(bArr);
        return bArr;
    }
}
