package X;

import java.util.List;

/* renamed from: X.5T3  reason: invalid class name */
public final class AnonymousClass5T3 {
    public boolean A00;
    public final int A01;
    public final AnonymousClass5ZO A02;
    public final C181948nc A03;
    public final Double A04;
    public final String A05;
    public final List A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5T3) {
                AnonymousClass5T3 r5 = (AnonymousClass5T3) obj;
                if (!C162457s7.A0P(this.A06, r5.A06) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A05, r5.A05) || this.A01 != r5.A01 || !C162457s7.A0P(this.A04, r5.A04) || this.A00 != r5.A00 || !C162457s7.A0P(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A03, AnonymousClass0x2.A01((((((AnonymousClass000.A08(this.A02, C18300x5.A04(this.A06)) + C18270x1.A00(this.A05)) * 31) + this.A01) * 31) + C18310x6.A07(this.A04)) * 31, this.A00));
    }

    public AnonymousClass5T3(AnonymousClass5ZO r2, C181948nc r3, Double d, String str, List list, int i) {
        boolean A1a = C86654Ky.A1a(r2);
        this.A06 = list;
        this.A02 = r2;
        this.A05 = str;
        this.A01 = i;
        this.A04 = d;
        this.A00 = A1a;
        this.A03 = r3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BusinessRankingRequest(rankerCandidates=");
        A0o.append(this.A06);
        A0o.append(", searchLocation=");
        A0o.append(this.A02);
        A0o.append(", csvmConfig=");
        A0o.append(this.A05);
        A0o.append(", endpoint=");
        A0o.append(this.A01);
        A0o.append(", proximityWeight=");
        A0o.append(this.A04);
        A0o.append(", isCancelled=");
        A0o.append(this.A00);
        A0o.append(", rankingCallback=");
        return C18260x0.A04(this.A03, A0o);
    }
}
