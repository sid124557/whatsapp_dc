package X;

/* renamed from: X.2zF  reason: invalid class name and case insensitive filesystem */
public class C60832zF {
    public static final byte[] A04 = {78, 111, 105, 115, 101, 95, 88, 88, 102, 97, 108, 108, 98, 97, 99, 107, 95, 50, 53, 53, 49, 57, 95, 65, 69, 83, 71, 67, 77, 95, 83, 72, 65, 50, 53, 54};
    public static final byte[] A05 = {78, 111, 105, 115, 101, 95, 88, 88, 95, 50, 53, 53, 49, 57, 95, 65, 69, 83, 71, 67, 77, 95, 83, 72, 65, 50, 53, 54, 0, 0, 0, 0};
    public static final byte[] A06 = {78, 111, 105, 115, 101, 95, 73, 75, 95, 50, 53, 53, 49, 57, 95, 65, 69, 83, 71, 67, 77, 95, 83, 72, 65, 50, 53, 54, 0, 0, 0, 0};
    public long A00;
    public C152127Xq A01;
    public byte[] A02;
    public final AnonymousClass2XI A03;

    public byte[] A02(byte[] bArr) {
        byte[] bArr2 = bArr;
        C152127Xq r2 = this.A01;
        if (r2 != null) {
            long j = this.A00;
            this.A00 = 1 + j;
            bArr2 = r2.A01(this.A03.A00, bArr2, bArr.length, j);
        }
        this.A03.A00(bArr2);
        return bArr2;
    }

    public void A00(byte[] bArr) {
        byte[][] A032 = AnonymousClass31Q.A03(bArr, this.A02);
        this.A02 = A032[0];
        this.A01 = new C152127Xq(A032[1]);
        this.A00 = 0;
    }

    public byte[] A01(byte[] bArr) {
        byte[] bArr2;
        C152127Xq r5 = this.A01;
        if (r5 != null) {
            long j = this.A00;
            this.A00 = 1 + j;
            bArr2 = r5.A02(this.A03.A00, bArr, j);
        } else {
            bArr2 = bArr;
        }
        this.A03.A00(bArr);
        return bArr2;
    }

    public C60832zF(byte[] bArr, byte[] bArr2) {
        AnonymousClass2XI r1 = new AnonymousClass2XI(bArr);
        this.A03 = r1;
        this.A02 = r1.A00;
        r1.A00(bArr2);
    }
}
