package X;

/* renamed from: X.8QP  reason: invalid class name */
public class AnonymousClass8QP implements C834748n {
    public C834748n A00;
    public byte[] A01;

    public AnonymousClass8QP(C834748n r3, byte[] bArr) {
        this(r3, bArr, 0, bArr.length);
    }

    public AnonymousClass8QP(C834748n r3, byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.A01 = bArr2;
        this.A00 = r3;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }
}
