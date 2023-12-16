package X;

/* renamed from: X.2hc  reason: invalid class name and case insensitive filesystem */
public class C50092hc {
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public C50092hc(String str, String str2, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A06 = z;
        this.A04 = z2;
        this.A00 = i;
        this.A03 = z3;
        this.A05 = z4;
        this.A02 = str;
        this.A01 = str2;
    }

    public boolean A00() {
        return this.A06;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("NetworkInformation{wifi=");
        A0o.append(this.A06);
        A0o.append(", mobile=");
        A0o.append(this.A04);
        A0o.append(", subType=");
        A0o.append(this.A00);
        A0o.append(", connected=");
        A0o.append(this.A03);
        A0o.append(", roaming=");
        A0o.append(this.A05);
        A0o.append(", typeName='");
        char A012 = C18300x5.A01(this.A02, A0o);
        A0o.append(", subTypeName='");
        A0o.append(this.A01);
        A0o.append(A012);
        return AnonymousClass000.A0d(A0o);
    }
}
