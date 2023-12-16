package X;

/* renamed from: X.2a1  reason: invalid class name and case insensitive filesystem */
public class C45442a1 {
    public final int A00;
    public final int A01;
    public final byte[] A02;

    public C45442a1(byte[] bArr, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = bArr;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("EncryptedMessage{ciphertextVersion=");
        A0o.append(this.A01);
        A0o.append(", ciphertextType=");
        A0o.append(this.A00);
        return AnonymousClass000.A0d(A0o);
    }
}
