package X;

/* renamed from: X.2Zs  reason: invalid class name and case insensitive filesystem */
public class C45352Zs {
    public final String A00;
    public final String A01;
    public final String A02;

    public C45352Zs(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("KeyInfo{version='");
        char A012 = C18300x5.A01(this.A02, A0o);
        A0o.append(", accountHashBase64='");
        A0o.append(this.A00);
        A0o.append(A012);
        A0o.append(", serverSaltBase64='");
        A0o.append(this.A01);
        A0o.append(A012);
        return AnonymousClass000.A0d(A0o);
    }
}
