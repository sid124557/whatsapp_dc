package X;

import java.util.Set;

/* renamed from: X.2dM  reason: invalid class name and case insensitive filesystem */
public class C47502dM {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final Set A09;
    public final Set A0A;
    public final Set A0B;
    public final boolean A0C;

    public C47502dM(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Set set, Set set2, Set set3, boolean z) {
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A00 = str5;
        this.A01 = str6;
        this.A02 = str7;
        this.A03 = str8;
        this.A0B = set;
        this.A09 = set2;
        this.A0A = set3;
        String str10 = "fallback";
        this.A08 = !str10.equals(str9) ? "primary" : str10;
        this.A0C = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("RouteHost{hostname='");
        C18320x8.A1M(A0o, this.A04);
        A0o.append(", upload=");
        Object obj = this.A0B;
        Object obj2 = "all";
        if (obj == null) {
            obj = obj2;
        }
        A0o.append(obj);
        A0o.append(", download=");
        Object obj3 = this.A09;
        if (obj3 != null) {
            obj2 = obj3;
        }
        A0o.append(obj2);
        A0o.append(", downloadBuckets=");
        Object obj4 = this.A0A;
        if (obj4 == null) {
            obj4 = "null";
        }
        A0o.append(obj4);
        A0o.append(", type=");
        A0o.append(this.A08);
        A0o.append(", forceIp=");
        A0o.append(this.A0C);
        A0o.append(", targetRegion=");
        A0o.append((String) null);
        A0o.append(", targetTask=");
        A0o.append((String) null);
        return AnonymousClass000.A0d(A0o);
    }
}
