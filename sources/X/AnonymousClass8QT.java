package X;

/* renamed from: X.8QT  reason: invalid class name */
public class AnonymousClass8QT implements C185978uY {
    public int A00;
    public C185968uX A01;
    public byte[] A02 = new byte[64];
    public byte[] A03 = new byte[64];

    public int B24(byte[] bArr, int i) {
        int i2 = this.A00;
        byte[] bArr2 = new byte[i2];
        C185968uX r3 = this.A01;
        r3.B24(bArr2, 0);
        byte[] bArr3 = this.A03;
        r3.update(bArr3, 0, bArr3.length);
        r3.update(bArr2, 0, i2);
        int B24 = r3.B24(bArr, i);
        reset();
        return B24;
    }

    public int B9H() {
        return this.A00;
    }

    public void BFu(C834748n r8) {
        byte[] bArr;
        int i;
        C185968uX r6 = this.A01;
        r6.reset();
        byte[] bArr2 = ((AnonymousClass8QN) r8).A00;
        int length = bArr2.length;
        if (length <= 64) {
            bArr = this.A02;
            System.arraycopy(bArr2, 0, bArr, 0, length);
            while (true) {
                i = bArr.length;
                if (length >= i) {
                    break;
                }
                bArr[length] = 0;
                length++;
            }
        } else {
            r6.update(bArr2, 0, length);
            bArr = this.A02;
            r6.B24(bArr, 0);
            int i2 = this.A00;
            while (true) {
                i = bArr.length;
                if (i2 >= i) {
                    break;
                }
                bArr[i2] = 0;
                i2++;
            }
        }
        byte[] bArr3 = new byte[i];
        this.A03 = bArr3;
        System.arraycopy(bArr, 0, bArr3, 0, i);
        for (int i3 = 0; i3 < i; i3 = AnonymousClass6CA.A0A(bArr, bArr[i3] ^ 54, i3)) {
        }
        int i4 = 0;
        while (true) {
            byte[] bArr4 = this.A03;
            if (i4 < bArr4.length) {
                i4 = AnonymousClass6CA.A0A(bArr4, bArr4[i4] ^ 92, i4);
            } else {
                r6.update(bArr, 0, i);
                return;
            }
        }
    }

    public void BrT(byte b) {
        this.A01.BrT(b);
    }

    public void reset() {
        C185968uX r3 = this.A01;
        r3.reset();
        byte[] bArr = this.A02;
        r3.update(bArr, 0, bArr.length);
    }

    public void update(byte[] bArr, int i, int i2) {
        this.A01.update(bArr, i, i2);
    }

    public AnonymousClass8QT(C185968uX r3) {
        this.A01 = r3;
        this.A00 = r3.B74();
    }
}
