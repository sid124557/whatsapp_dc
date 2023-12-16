package X;

/* renamed from: X.7SO  reason: invalid class name */
public class AnonymousClass7SO {
    public short A00;
    public byte[] A01;

    public AnonymousClass7SO(byte[] bArr, short s) {
        this.A00 = s;
        this.A01 = bArr;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WtExtension{extensionType=");
        A0o.append(this.A00);
        A0o.append(", extensionData=");
        A0o.append(C162257rX.A04(this.A01));
        return AnonymousClass000.A0d(A0o);
    }
}
