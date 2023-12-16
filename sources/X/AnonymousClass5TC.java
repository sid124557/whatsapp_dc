package X;

/* renamed from: X.5TC  reason: invalid class name */
public final class AnonymousClass5TC {
    public final long A00;
    public final C372821q A01;
    public final AnonymousClass3ZH A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5TC) {
                AnonymousClass5TC r8 = (AnonymousClass5TC) obj;
                if (!(C162457s7.A0P(this.A02, r8.A02) && C162457s7.A0P(this.A04, r8.A04) && C162457s7.A0P(this.A03, r8.A03) && this.A05 == r8.A05 && this.A01 == r8.A01 && this.A07 == r8.A07 && this.A06 == r8.A06 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x2.A00(AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass000.A08(this.A01, AnonymousClass0x2.A01((((C18300x5.A04(this.A02) + C18270x1.A00(this.A04)) * 31) + AnonymousClass0x7.A07(this.A03)) * 31, this.A05)), this.A07), this.A06), this.A00);
    }

    public AnonymousClass5TC(C372821q r1, AnonymousClass3ZH r2, String str, String str2, long j, boolean z, boolean z2, boolean z3) {
        this.A02 = r2;
        this.A04 = str;
        this.A03 = str2;
        this.A05 = z;
        this.A01 = r1;
        this.A07 = z2;
        this.A06 = z3;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("NewsletterUiState(contact=");
        A0o.append(this.A02);
        A0o.append(", title=");
        A0o.append(this.A04);
        A0o.append(", description=");
        A0o.append(this.A03);
        A0o.append(", isMuted=");
        A0o.append(this.A05);
        A0o.append(", membership=");
        A0o.append(this.A01);
        A0o.append(", isVerified=");
        A0o.append(this.A07);
        A0o.append(", isSuspended=");
        A0o.append(this.A06);
        A0o.append(", subscribersCount=");
        return C18270x1.A0U(A0o, this.A00);
    }
}
