package X;

import java.util.List;

/* renamed from: X.5TI  reason: invalid class name */
public final class AnonymousClass5TI {
    public final C158367jr A00;
    public final Double A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final List A07;
    public final List A08;
    public final List A09;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5TI) {
                AnonymousClass5TI r5 = (AnonymousClass5TI) obj;
                if (!C162457s7.A0P(this.A07, r5.A07) || !C162457s7.A0P(this.A06, r5.A06) || !C162457s7.A0P(this.A09, r5.A09) || !C162457s7.A0P(this.A08, r5.A08) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A05, r5.A05) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A082 = AnonymousClass000.A08(this.A09, AnonymousClass000.A08(this.A06, C18300x5.A04(this.A07)));
        return AnonymousClass002.A02(this.A00, (((((((((AnonymousClass000.A08(this.A08, A082) + C18270x1.A00(this.A03)) * 31) + C18270x1.A00(this.A05)) * 31) + AnonymousClass000.A07(this.A01)) * 31) + C18270x1.A00(this.A04)) * 31) + AnonymousClass0x7.A07(this.A02)) * 31);
    }

    public AnonymousClass5TI(C158367jr r1, Double d, String str, String str2, String str3, String str4, List list, List list2, List list3, List list4) {
        this.A07 = list;
        this.A06 = list2;
        this.A09 = list3;
        this.A08 = list4;
        this.A03 = str;
        this.A05 = str2;
        this.A01 = d;
        this.A04 = str3;
        this.A02 = str4;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BusinessSearchResult(categories=");
        A0o.append(this.A07);
        A0o.append(", apiBusinesses=");
        A0o.append(this.A06);
        A0o.append(", localBusinesses=");
        A0o.append(this.A09);
        A0o.append(", filterCategories=");
        A0o.append(this.A08);
        A0o.append(", pageId=");
        A0o.append(this.A03);
        A0o.append(", requestId=");
        A0o.append(this.A05);
        A0o.append(", proximityWeight=");
        A0o.append(this.A01);
        A0o.append(", rankingLogicVer=");
        A0o.append(this.A04);
        A0o.append(", csvmConfig=");
        A0o.append(this.A02);
        A0o.append(", serpMapViewResult=");
        return C18260x0.A04(this.A00, A0o);
    }
}
