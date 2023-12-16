package X;

/* renamed from: X.2ae  reason: invalid class name and case insensitive filesystem */
public class C45832ae {
    public final int A00;
    public final C42732Ph A01;
    public final String A02;
    public final String A03;

    public C45832ae(C42732Ph r1, String str, String str2, int i) {
        this.A00 = i;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CollectionError{code=");
        A0o.append(this.A00);
        A0o.append(", text='");
        A0o.append(this.A03);
        A0o.append(", collection='");
        A0o.append(this.A02);
        return AnonymousClass000.A0d(A0o);
    }
}
