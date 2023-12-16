package X;

/* renamed from: X.7Yl  reason: invalid class name and case insensitive filesystem */
public final class C152327Yl {
    public final AnonymousClass7ZF A00;
    public final C150477Qw A01;
    public final Integer A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C152327Yl) {
                C152327Yl r5 = (C152327Yl) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, (C18300x5.A04(this.A01) + AnonymousClass000.A07(this.A02)) * 31);
    }

    public C152327Yl(AnonymousClass7ZF r1, C150477Qw r2, Integer num) {
        this.A01 = r2;
        this.A02 = num;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CallControlHeaderUiState(title=");
        A0o.append(this.A01);
        A0o.append(", participantCount=");
        A0o.append(this.A02);
        A0o.append(", addParticipantUiState=");
        return C18260x0.A04(this.A00, A0o);
    }
}
