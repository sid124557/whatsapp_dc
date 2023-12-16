package X;

/* renamed from: X.8QN  reason: invalid class name */
public class AnonymousClass8QN implements C834748n {
    public byte[] A00;

    public AnonymousClass8QN(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.A00 = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }

    public AnonymousClass8QN(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }
}
