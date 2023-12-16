package X;

/* renamed from: X.536  reason: invalid class name */
public final class AnonymousClass536 extends AnonymousClass5C8 {
    public AnonymousClass3ZH A00;
    public final long A01;
    public final long A02;
    public final AnonymousClass1RL A03;
    public final C624134x A04;
    public final CharSequence A05;
    public final boolean A06;

    public AnonymousClass536(AnonymousClass1RL r2, AnonymousClass3ZH r3, C624134x r4, CharSequence charSequence, long j, long j2, boolean z) {
        C162457s7.A0J(charSequence, 5);
        this.A03 = r2;
        this.A00 = r3;
        this.A04 = r4;
        this.A01 = j;
        this.A05 = charSequence;
        this.A06 = z;
        this.A02 = j2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass536) {
                AnonymousClass536 r8 = (AnonymousClass536) obj;
                if (!C162457s7.A0P(this.A03, r8.A03) || !C162457s7.A0P(this.A00, r8.A00) || !C162457s7.A0P(this.A04, r8.A04) || this.A01 != r8.A01 || !C162457s7.A0P(this.A05, r8.A05) || this.A06 != r8.A06 || this.A02 != r8.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x2.A00(AnonymousClass0x2.A01(AnonymousClass000.A08(this.A05, AnonymousClass000.A00((AnonymousClass000.A08(this.A00, C18300x5.A04(this.A03)) + AnonymousClass000.A07(this.A04)) * 31, this.A01)), this.A06), this.A02);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("NewsletterDataItem(newsletterInfo=");
        A0o.append(this.A03);
        A0o.append(", contact=");
        A0o.append(this.A00);
        A0o.append(", latestMessage=");
        A0o.append(this.A04);
        A0o.append(", displayTimestamp=");
        A0o.append(this.A01);
        A0o.append(", elapsedTimeString=");
        A0o.append(this.A05);
        A0o.append(", isLatestMessageTransferred=");
        A0o.append(this.A06);
        A0o.append(", unseenMessageCount=");
        return C18270x1.A0U(A0o, this.A02);
    }
}
