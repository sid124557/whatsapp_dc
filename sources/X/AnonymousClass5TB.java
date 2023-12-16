package X;

/* renamed from: X.5TB  reason: invalid class name */
public final class AnonymousClass5TB {
    public final C104765Sg A00;
    public final AnonymousClass3ZH A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Boolean A05;
    public final String A06;
    public final String A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5TB) {
                AnonymousClass5TB r5 = (AnonymousClass5TB) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A07, r5.A07) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A06, r5.A06) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A05, r5.A05) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, (((((((((((C18300x5.A04(this.A01) + AnonymousClass000.A07(this.A04)) * 31) + C18270x1.A00(this.A07)) * 31) + AnonymousClass000.A07(this.A03)) * 31) + C18270x1.A00(this.A06)) * 31) + AnonymousClass000.A07(this.A02)) * 31) + AnonymousClass000.A07(this.A05)) * 31);
    }

    public AnonymousClass5TB(C104765Sg r1, AnonymousClass3ZH r2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, String str2) {
        this.A01 = r2;
        this.A04 = bool;
        this.A07 = str;
        this.A03 = bool2;
        this.A06 = str2;
        this.A02 = bool3;
        this.A05 = bool4;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ContactInfoUiState(contact=");
        A0o.append(this.A01);
        A0o.append(", shouldShowAsVerified=");
        A0o.append(this.A04);
        A0o.append(", titleText=");
        A0o.append(this.A07);
        A0o.append(", setTitleTextMessageYourself=");
        A0o.append(this.A03);
        A0o.append(", pushName=");
        A0o.append(this.A06);
        A0o.append(", isChatPSAJid=");
        A0o.append(this.A02);
        A0o.append(", shouldShowBusinessLayout=");
        A0o.append(this.A05);
        A0o.append(", encryptionInfoViewState=");
        return C18260x0.A04(this.A00, A0o);
    }
}
