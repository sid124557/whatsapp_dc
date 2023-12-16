package X;

/* renamed from: X.7SN  reason: invalid class name */
public class AnonymousClass7SN {
    public C158537k8 A00;
    public byte[] A01;

    public AnonymousClass7SN(C158537k8 r1, byte[] bArr) {
        this.A01 = bArr;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WtCertificateEntry{certData=");
        A0o.append(C162257rX.A04(this.A01));
        A0o.append(", wtExtensions=");
        return AnonymousClass000.A0Q(this.A00, A0o);
    }
}
