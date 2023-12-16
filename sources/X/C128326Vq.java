package X;

/* renamed from: X.6Vq  reason: invalid class name and case insensitive filesystem */
public class C128326Vq extends C128346Vs {
    public int A00;
    public final int A01;
    public final int A02;
    public final byte[] A03;

    public C128326Vq(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            int length = bArr.length;
            int i3 = i + i2;
            if ((i | i2 | (length - i3)) >= 0) {
                this.A03 = bArr;
                this.A02 = i;
                this.A00 = i;
                this.A01 = i3;
                return;
            }
            Object[] A1X = AnonymousClass0x9.A1X();
            AnonymousClass000.A1L(A1X, length);
            AnonymousClass6C7.A1U(A1X, i, i2);
            throw AnonymousClass6C7.A0W("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", A1X);
        }
        throw AnonymousClass001.A0g("buffer");
    }
}
