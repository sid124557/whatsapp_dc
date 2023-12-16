package X;

import java.util.Date;

/* renamed from: X.5TF  reason: invalid class name */
public final class AnonymousClass5TF {
    public final int A00;
    public final C108815db A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final Date A07;
    public final Date A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5TF) {
                AnonymousClass5TF r5 = (AnonymousClass5TF) obj;
                if (!C162457s7.A0P(this.A06, r5.A06) || !C162457s7.A0P(this.A05, r5.A05) || !C162457s7.A0P(this.A03, r5.A03) || this.A00 != r5.A00 || !C162457s7.A0P(this.A08, r5.A08) || !C162457s7.A0P(this.A07, r5.A07) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A072 = AnonymousClass0x2.A07(this.A05, C18310x6.A09(this.A06));
        return AnonymousClass0x2.A07(this.A04, AnonymousClass0x2.A07(this.A02, (((((AnonymousClass0x2.A07(this.A03, A072) + this.A00) * 31) + AnonymousClass000.A07(this.A08)) * 31) + AnonymousClass000.A07(this.A07)) * 31)) + C18310x6.A07(this.A01);
    }

    public AnonymousClass5TF(C108815db r1, String str, String str2, String str3, String str4, String str5, Date date, Date date2, int i) {
        AnonymousClass0x2.A1B(str4, str5);
        this.A06 = str;
        this.A05 = str2;
        this.A03 = str3;
        this.A00 = i;
        this.A08 = date;
        this.A07 = date2;
        this.A02 = str4;
        this.A04 = str5;
        this.A01 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Promotion(promotionId=");
        A0o.append(this.A06);
        A0o.append(", name=");
        A0o.append(this.A05);
        A0o.append(", discount=");
        A0o.append(this.A03);
        A0o.append(", discountType=");
        A0o.append(this.A00);
        A0o.append(", startDate=");
        A0o.append(this.A08);
        A0o.append(", endDate=");
        A0o.append(this.A07);
        A0o.append(", description=");
        A0o.append(this.A02);
        A0o.append(", moreInfo=");
        A0o.append(this.A04);
        A0o.append(", media=");
        return C18260x0.A04(this.A01, A0o);
    }
}
