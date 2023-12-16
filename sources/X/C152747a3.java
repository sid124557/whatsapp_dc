package X;

/* renamed from: X.7a3  reason: invalid class name and case insensitive filesystem */
public final class C152747a3 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C152747a3) {
                C152747a3 r5 = (C152747a3) obj;
                if (!C162457s7.A0P(this.A08, r5.A08) || !C162457s7.A0P(this.A05, r5.A05) || !C162457s7.A0P(this.A07, r5.A07) || !C162457s7.A0P(this.A06, r5.A06) || this.A00 != r5.A00 || !C162457s7.A0P(this.A09, r5.A09) || !C162457s7.A0P(this.A0A, r5.A0A) || !C162457s7.A0P(this.A0C, r5.A0C) || !C162457s7.A0P(this.A0B, r5.A0B) || !C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A072 = AnonymousClass0x2.A07(this.A07, AnonymousClass0x2.A07(this.A05, C18310x6.A09(this.A08)));
        String str = this.A09;
        return AnonymousClass0x7.A08(this.A02, AnonymousClass0x2.A07(this.A03, AnonymousClass0x2.A07(this.A01, AnonymousClass0x2.A07(this.A04, (((((AnonymousClass0x2.A07(str, (AnonymousClass0x2.A07(this.A06, A072) + this.A00) * 31) + C18270x1.A00(this.A0A)) * 31) + C18270x1.A00(this.A0C)) * 31) + AnonymousClass0x7.A07(this.A0B)) * 31))));
    }

    public C152747a3(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i) {
        C18260x0.A0c(str, str2, str3, str4);
        C162457s7.A0J(str5, 6);
        C18270x1.A13(str10, str11);
        C162457s7.A0J(str12, 13);
        this.A08 = str;
        this.A05 = str2;
        this.A07 = str3;
        this.A06 = str4;
        this.A00 = i;
        this.A09 = str5;
        this.A0A = str6;
        this.A0C = str7;
        this.A0B = str8;
        this.A04 = str9;
        this.A01 = str10;
        this.A03 = str11;
        this.A02 = str12;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VideoQueuedContext(previousState=");
        A0o.append(this.A08);
        A0o.append(", previousAction=");
        A0o.append(this.A05);
        A0o.append(", previousSentiment=");
        A0o.append(this.A07);
        A0o.append(", previousIntensity=");
        A0o.append(this.A06);
        A0o.append(", trigger=");
        A0o.append(this.A00);
        A0o.append(", targetState=");
        A0o.append(this.A09);
        A0o.append(", triggeringAction=");
        A0o.append(this.A0A);
        A0o.append(", triggeringSentiment=");
        A0o.append(this.A0C);
        A0o.append(", triggeringIntensity=");
        A0o.append(this.A0B);
        A0o.append(", currentState=");
        A0o.append(this.A04);
        A0o.append(", currentAction=");
        A0o.append(this.A01);
        A0o.append(", currentSentiment=");
        A0o.append(this.A03);
        A0o.append(", currentIntensity=");
        return C18260x0.A07(this.A02, A0o);
    }
}
