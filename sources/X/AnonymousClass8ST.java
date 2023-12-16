package X;

import java.security.MessageDigest;

/* renamed from: X.8ST  reason: invalid class name */
public class AnonymousClass8ST extends MessageDigest {
    public int A00;
    public C185968uX A01;

    public byte[] engineDigest() {
        byte[] bArr = new byte[this.A00];
        this.A01.B24(bArr, 0);
        return bArr;
    }

    public int engineGetDigestLength() {
        return this.A00;
    }

    public void engineReset() {
        this.A01.reset();
    }

    public void engineUpdate(byte[] bArr, int i, int i2) {
        this.A01.update(bArr, i, i2);
    }

    public AnonymousClass8ST(C185968uX r2) {
        super(r2.B4N());
        this.A01 = r2;
        this.A00 = r2.B74();
    }

    public void engineUpdate(byte b) {
        this.A01.BrT(b);
    }
}
