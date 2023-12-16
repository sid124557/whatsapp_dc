package X;

/* renamed from: X.8eF  reason: invalid class name and case insensitive filesystem */
public class C177208eF extends C158467k1 {
    public C185968uX A00 = new C177348eT();

    public final byte[] A04(int i) {
        C185968uX r7 = this.A00;
        int B74 = r7.B74();
        byte[] bArr = new byte[B74];
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        while (true) {
            byte[] bArr3 = this.A01;
            r7.update(bArr3, 0, bArr3.length);
            byte[] bArr4 = this.A02;
            r7.update(bArr4, 0, bArr4.length);
            r7.B24(bArr, 0);
            int i3 = i;
            if (i > B74) {
                i3 = B74;
            }
            System.arraycopy(bArr, 0, bArr2, i2, i3);
            i2 += i3;
            i -= i3;
            if (i == 0) {
                return bArr2;
            }
            r7.reset();
            r7.update(bArr, 0, B74);
        }
    }
}
