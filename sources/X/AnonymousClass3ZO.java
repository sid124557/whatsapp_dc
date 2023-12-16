package X;

/* renamed from: X.3ZO  reason: invalid class name */
public final class AnonymousClass3ZO implements Comparable {
    public boolean A00 = true;
    public final int A01;
    public final C60422yX A02;
    public final C165897xo A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    public AnonymousClass3ZO(C60422yX r2, C165897xo r3, String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        C162457s7.A0J(str, 1);
        C18260x0.A0e(str2, str3, str4, str5);
        this.A06 = str;
        this.A08 = str2;
        this.A05 = str3;
        this.A04 = str4;
        this.A07 = str5;
        this.A01 = i;
        this.A09 = z;
        this.A02 = r2;
        this.A03 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3ZO) {
                AnonymousClass3ZO r5 = (AnonymousClass3ZO) obj;
                if (!C162457s7.A0P(this.A06, r5.A06) || !C162457s7.A0P(this.A08, r5.A08) || !C162457s7.A0P(this.A05, r5.A05) || !C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A07, r5.A07) || this.A01 != r5.A01 || this.A09 != r5.A09 || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A03, r5.A03) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AnonymousClass3ZO r3 = (AnonymousClass3ZO) obj;
        C162457s7.A0J(r3, 0);
        return this.A01 - r3.A01;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00((((AnonymousClass0x2.A01((AnonymousClass0x2.A07(this.A07, AnonymousClass0x2.A07(this.A04, AnonymousClass0x2.A07(this.A05, AnonymousClass0x2.A07(this.A08, C18310x6.A09(this.A06))))) + this.A01) * 31, this.A09) + AnonymousClass000.A07(this.A02)) * 31) + C18310x6.A07(this.A03)) * 31, this.A00);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AlertInfo(id=");
        A0o.append(this.A06);
        A0o.append(", title=");
        A0o.append(this.A08);
        A0o.append(", description=");
        A0o.append(this.A05);
        A0o.append(", ctaText=");
        A0o.append(this.A04);
        A0o.append(", scope=");
        A0o.append(this.A07);
        A0o.append(", type=");
        A0o.append(this.A01);
        A0o.append(", isCancelable=");
        A0o.append(this.A09);
        A0o.append(", phoenix=");
        A0o.append(this.A02);
        A0o.append(", legacyPaymentStepUpInfo=");
        A0o.append(this.A03);
        A0o.append(", shouldShowNotification=");
        return C18260x0.A0A(A0o, this.A00);
    }
}
