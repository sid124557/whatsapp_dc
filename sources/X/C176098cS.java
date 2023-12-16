package X;

/* renamed from: X.8cS  reason: invalid class name and case insensitive filesystem */
public class C176098cS extends C176758dW {
    public C177088e3 A0O() {
        return this;
    }

    public final byte[] A0b() {
        byte[] bArr;
        byte[] bArr2;
        byte[] A03;
        int i;
        byte[] bArr3 = this.A00;
        int length = bArr3.length;
        int i2 = length - 1;
        if (bArr3[i2] == 90) {
            if (!A0Y()) {
                bArr2 = new byte[(length + 4)];
                System.arraycopy(bArr3, 0, bArr2, 0, i2);
                A03 = C162077rB.A03("0000Z");
                i = 5;
            } else if (!A0Z()) {
                bArr2 = new byte[(length + 2)];
                System.arraycopy(bArr3, 0, bArr2, 0, i2);
                A03 = C162077rB.A03("00Z");
                i = 3;
            } else if (A0X()) {
                int i3 = length - 2;
                while (i3 > 0 && bArr3[i3] == 48) {
                    i3--;
                }
                if (bArr3[i3] == 46) {
                    bArr = new byte[(i3 + 1)];
                } else {
                    bArr = new byte[(i3 + 2)];
                    i3++;
                }
                System.arraycopy(bArr3, 0, bArr, 0, i3);
                bArr[i3] = 90;
                return bArr;
            }
            System.arraycopy(A03, 0, bArr2, i2, i);
            return bArr2;
        }
        return bArr3;
    }

    public C176098cS(String str) {
        super(str);
    }

    public C176098cS(byte[] bArr) {
        super(bArr);
    }
}
