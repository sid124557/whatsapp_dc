package X;

/* renamed from: X.7T8  reason: invalid class name */
public class AnonymousClass7T8 {
    public final int A00;
    public final int A01;
    public final byte[] A02;

    public AnonymousClass7T8(byte[] bArr, int i, int i2) {
        byte[] bArr2;
        if (bArr != null) {
            bArr2 = (byte[]) bArr.clone();
        } else {
            bArr2 = null;
        }
        this.A02 = bArr2;
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WtWriteParams{offset=");
        A0o.append(this.A01);
        A0o.append(", len=");
        A0o.append(this.A00);
        return AnonymousClass000.A0d(A0o);
    }
}
