package X;

/* renamed from: X.8eI  reason: invalid class name and case insensitive filesystem */
public class C177238eI extends C158467k1 {
    public C185978uY A00;
    public byte[] A01;

    public final byte[] A04(int i) {
        C185978uY r13 = this.A00;
        int B9H = r13.B9H();
        int i2 = ((i + B9H) - 1) / B9H;
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[(i2 * B9H)];
        r13.BFu(new AnonymousClass8QN(this.A01));
        int i3 = 0;
        int i4 = 1;
        while (i4 <= i2) {
            int i5 = 3;
            while (true) {
                byte b = (byte) (bArr[i5] + 1);
                bArr[i5] = b;
                if (b != 0) {
                    break;
                }
                i5--;
            }
            byte[] bArr3 = this.A02;
            int i6 = this.A00;
            if (i6 != 0) {
                if (bArr3 != null) {
                    r13.update(bArr3, 0, bArr3.length);
                }
                r13.update(bArr, 0, 4);
                byte[] bArr4 = this.A01;
                r13.B24(bArr4, 0);
                int length = bArr4.length;
                System.arraycopy(bArr4, 0, bArr2, i3, length);
                for (int i7 = 1; i7 < i6; i7++) {
                    r13.update(bArr4, 0, length);
                    r13.B24(bArr4, 0);
                    for (int i8 = 0; i8 != length; i8++) {
                        int i9 = i3 + i8;
                        AnonymousClass6CA.A0e(bArr4[i8], bArr2, bArr2[i9], i9);
                    }
                }
                i3 += B9H;
                i4++;
            } else {
                throw AnonymousClass001.A0c("iteration count must be at least 1.");
            }
        }
        return bArr2;
    }

    public C177238eI(C185968uX r2) {
        AnonymousClass8QV r0 = new AnonymousClass8QV(r2);
        this.A00 = r0;
        this.A01 = new byte[r0.A01];
    }

    public C177238eI() {
        this(new C177338eS());
    }
}
