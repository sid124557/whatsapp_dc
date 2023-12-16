package X;

import java.util.List;

/* renamed from: X.5T8  reason: invalid class name */
public final class AnonymousClass5T8 {
    public final Double A00;
    public final Double A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5T8) {
                AnonymousClass5T8 r5 = (AnonymousClass5T8) obj;
                if (!C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A06, r5.A06) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A05, r5.A05) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A07, r5.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A072 = AnonymousClass0x2.A07(this.A04, C18310x6.A09(this.A03));
        return AnonymousClass002.A02(this.A07, (((((((AnonymousClass0x2.A07(this.A06, A072) + AnonymousClass000.A07(this.A02)) * 31) + C18270x1.A00(this.A05)) * 31) + AnonymousClass000.A07(this.A00)) * 31) + C18310x6.A07(this.A01)) * 31);
    }

    public AnonymousClass5T8(Double d, Double d2, Integer num, String str, String str2, String str3, String str4, List list) {
        C18260x0.A0V(str, str2, str3);
        this.A03 = str;
        this.A04 = str2;
        this.A06 = str3;
        this.A02 = num;
        this.A05 = str4;
        this.A00 = d;
        this.A01 = d2;
        this.A07 = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BusinessSearchProfile(id=");
        A0o.append(this.A03);
        A0o.append(", jid=");
        A0o.append(this.A04);
        A0o.append(", verifiedName=");
        A0o.append(this.A06);
        A0o.append(", verificationLevel=");
        A0o.append(this.A02);
        A0o.append(", subTitle=");
        A0o.append(this.A05);
        A0o.append(", latitude=");
        A0o.append(this.A00);
        A0o.append(", longitude=");
        A0o.append(this.A01);
        A0o.append(", verifiedNameHighlightRanges=");
        return C18260x0.A04(this.A07, A0o);
    }
}
