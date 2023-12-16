package X;

/* renamed from: X.2ZX  reason: invalid class name */
public class AnonymousClass2ZX {
    public final int A00;
    public final byte[] A01;
    public final byte[] A02;

    public AnonymousClass2ZX(byte[] bArr, byte[] bArr2, int i) {
        this.A00 = i;
        this.A02 = bArr;
        this.A01 = bArr2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("GetCipherKeyResult [code=");
        A0o.append(this.A00);
        A0o.append(", key=");
        C18280x3.A1J(A0o, this.A02);
        A0o.append(", accountHash=");
        C18280x3.A1J(A0o, this.A01);
        return AnonymousClass000.A0f(A0o);
    }
}
