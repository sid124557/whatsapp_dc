package X;

/* renamed from: X.7U7  reason: invalid class name */
public class AnonymousClass7U7 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public AnonymousClass7U7(String str, String str2, String str3, int i, int i2, int i3) {
        this.A00 = i;
        this.A04 = str;
        this.A02 = i2;
        this.A01 = i3;
        this.A05 = str2;
        this.A03 = str3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamsysMMSUploadRequest{mediaType=");
        A0o.append(this.A00);
        A0o.append(", filePath='");
        char A012 = C18300x5.A01(this.A04, A0o);
        A0o.append(", uploadType=");
        A0o.append(this.A02);
        A0o.append(", uploadOptions=");
        A0o.append(this.A01);
        A0o.append(", transferOptions=");
        A0o.append(7);
        A0o.append(", loggingId='");
        A0o.append(this.A05);
        A0o.append(A012);
        A0o.append(", connBlockJSONStr='");
        A0o.append(this.A03);
        A0o.append(A012);
        return AnonymousClass000.A0d(A0o);
    }
}
