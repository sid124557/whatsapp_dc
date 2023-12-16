package X;

/* renamed from: X.5Rd  reason: invalid class name and case insensitive filesystem */
public final class C104485Rd {
    public final int A00;
    public final Integer A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C104485Rd) {
                C104485Rd r5 = (C104485Rd) obj;
                if (this.A00 != r5.A00 || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + AnonymousClass000.A07(this.A01);
    }

    public C104485Rd(int i, Integer num) {
        this.A00 = i;
        this.A01 = num;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CommunityParticipantsState(state=");
        A0o.append(this.A00);
        A0o.append(", communityParticipantSize=");
        return C18260x0.A04(this.A01, A0o);
    }
}
