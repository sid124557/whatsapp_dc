package X;

/* renamed from: X.8QI  reason: invalid class name */
public class AnonymousClass8QI implements C834748n {
    public byte[] A00;

    public AnonymousClass8QI(byte[] bArr) {
        int length = bArr.length;
        if (length <= 255) {
            byte[] bArr2 = new byte[length];
            this.A00 = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return;
        }
        throw AnonymousClass001.A0c("RC5 key length can be no greater than 255");
    }
}
