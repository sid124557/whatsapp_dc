package X;

/* renamed from: X.8eG  reason: invalid class name and case insensitive filesystem */
public class C177218eG extends C158467k1 {
    public C185968uX A00;

    public final byte[] A04() {
        C185968uX r5 = this.A00;
        int B74 = r5.B74();
        byte[] bArr = new byte[B74];
        byte[] bArr2 = this.A01;
        r5.update(bArr2, 0, bArr2.length);
        byte[] bArr3 = this.A02;
        r5.update(bArr3, 0, bArr3.length);
        r5.B24(bArr, 0);
        for (int i = 1; i < this.A00; i++) {
            r5.update(bArr, 0, B74);
            r5.B24(bArr, 0);
        }
        return bArr;
    }

    public C177218eG(C185968uX r1) {
        this.A00 = r1;
    }
}
