package X;

/* renamed from: X.2x6  reason: invalid class name and case insensitive filesystem */
public class C59552x6 {
    public final C45352Zs A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C59552x6(C45352Zs r1, String str, String str2, String str3) {
        this.A02 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("EncMetadata{scheme='");
        char A012 = C18300x5.A01(this.A02, A0o);
        A0o.append(", dataId='");
        A0o.append(this.A01);
        A0o.append(A012);
        A0o.append(", sourceId='");
        A0o.append(this.A03);
        A0o.append(A012);
        A0o.append(", keyInfo=");
        return AnonymousClass000.A0Q(this.A00, A0o);
    }
}
