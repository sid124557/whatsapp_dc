package X;

/* renamed from: X.7Tb  reason: invalid class name and case insensitive filesystem */
public class C151007Tb {
    public String A00;
    public boolean A01;
    public boolean A02;
    public final String A03;

    public C151007Tb(String str, boolean z, String str2) {
        this.A03 = str;
        this.A00 = str2;
        this.A01 = z;
    }

    public String toString() {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A03);
        A0o.append("=");
        if (this.A02) {
            str = "skipped";
        } else {
            str = this.A00;
        }
        return AnonymousClass000.A0X(str, A0o);
    }
}
