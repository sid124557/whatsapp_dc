package X;

/* renamed from: X.1kT  reason: invalid class name */
public class AnonymousClass1kT extends C151227Tx {
    public final C61202zs A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass1kT r5 = (AnonymousClass1kT) obj;
            if (!this.A04.equals(r5.A04) || !this.A03.equals(r5.A03) || !this.A02.equals(r5.A02) || !this.A01.equals(r5.A01) || !this.A00.equals(r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A04;
        objArr[1] = this.A03;
        objArr[2] = this.A02;
        objArr[3] = this.A01;
        return C18310x6.A08(this.A00, objArr, 4);
    }

    public AnonymousClass1kT(C61202zs r1, C142396x8 r2, C142406x9 r3, String str, String str2, String str3, String str4, String str5) {
        super(r2, r3, str4);
        this.A04 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A01 = str5;
        this.A00 = r1;
    }

    public String toString() {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UserNoticeBanner{text='");
        char A012 = C18300x5.A01(this.A04, A0o);
        A0o.append(", lightUrl='");
        A0o.append(this.A03);
        A0o.append(A012);
        A0o.append(", lightIconFile='");
        A0o.append(this.A01);
        A0o.append(A012);
        A0o.append(", darkUrl='");
        A0o.append(this.A02);
        A0o.append(A012);
        A0o.append(", darkIconFile='");
        A0o.append(this.A00);
        A0o.append(A012);
        A0o.append("iconRole='");
        C142396x8 r0 = this.A02;
        String str2 = "null";
        if (r0 != null) {
            str = r0.name();
        } else {
            str = str2;
        }
        A0o.append(str);
        A0o.append(A012);
        A0o.append(", iconStyle='");
        C142406x9 r02 = this.A03;
        if (r02 != null) {
            str2 = r02.name();
        }
        A0o.append(str2);
        A0o.append(A012);
        A0o.append(", iconDescription='");
        A0o.append(this.A04);
        A0o.append(A012);
        A0o.append(", action='");
        A0o.append(this.A01);
        A0o.append(A012);
        A0o.append(", timing=");
        return AnonymousClass000.A0Q(this.A00, A0o);
    }
}
