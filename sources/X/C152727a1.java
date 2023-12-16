package X;

/* renamed from: X.7a1  reason: invalid class name and case insensitive filesystem */
public final class C152727a1 {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public C152727a1(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, int i2) {
        C18260x0.A0a(str, str2, str3, 2);
        C162457s7.A0J(str5, 7);
        C162457s7.A0J(str7, 9);
        C162457s7.A0J(str9, 11);
        this.A00 = i;
        this.A06 = str;
        this.A07 = str2;
        this.A03 = str3;
        this.A01 = i2;
        this.A08 = str4;
        this.A02 = str5;
        this.A0A = str6;
        this.A05 = str7;
        this.A09 = str8;
        this.A04 = str9;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C152727a1) {
                C152727a1 r5 = (C152727a1) obj;
                if (this.A00 != r5.A00 || !C162457s7.A0P(this.A06, r5.A06) || !C162457s7.A0P(this.A07, r5.A07) || !C162457s7.A0P(this.A03, r5.A03) || this.A01 != r5.A01 || !C162457s7.A0P(this.A08, r5.A08) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A0A, r5.A0A) || !C162457s7.A0P(this.A05, r5.A05) || !C162457s7.A0P(this.A09, r5.A09) || !C162457s7.A0P(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A072 = AnonymousClass0x2.A07(this.A07, AnonymousClass0x2.A07(this.A06, this.A00 * 31));
        String str = this.A02;
        String str2 = this.A05;
        return AnonymousClass0x7.A08(this.A04, (AnonymousClass0x2.A07(str2, (AnonymousClass0x2.A07(str, (((AnonymousClass0x2.A07(this.A03, A072) + this.A01) * 31) + C18270x1.A00(this.A08)) * 31) + C18270x1.A00(this.A0A)) * 31) + AnonymousClass0x7.A07(this.A09)) * 31);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BehaviorGraphStateUpdatedInfo(errorCode=");
        A0o.append(this.A00);
        A0o.append(", previousState=");
        A0o.append(this.A06);
        A0o.append(", toState=");
        A0o.append(this.A07);
        A0o.append(", actualCurrentState=");
        A0o.append(this.A03);
        A0o.append(", trigger=");
        A0o.append(this.A01);
        A0o.append(", triggeringAction=");
        A0o.append(this.A08);
        A0o.append(", actualAction=");
        A0o.append(this.A02);
        A0o.append(", triggeringSentiment=");
        A0o.append(this.A0A);
        A0o.append(", actualSentiment=");
        A0o.append(this.A05);
        A0o.append(", triggeringIntensity=");
        A0o.append(this.A09);
        A0o.append(", actualIntensity=");
        return C18260x0.A07(this.A04, A0o);
    }
}
