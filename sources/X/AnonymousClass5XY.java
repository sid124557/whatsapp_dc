package X;

/* renamed from: X.5XY  reason: invalid class name */
public final class AnonymousClass5XY {
    public int A00;
    public int A01;
    public long A02;
    public String A03;
    public boolean A04;
    public boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5XY) {
                AnonymousClass5XY r8 = (AnonymousClass5XY) obj;
                if (!(this.A01 == r8.A01 && this.A02 == r8.A02 && C162457s7.A0P(this.A03, r8.A03) && this.A04 == r8.A04 && this.A05 == r8.A05 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public AnonymousClass5XY(String str, int i, int i2, long j, boolean z, boolean z2) {
        this.A01 = 0;
        this.A02 = 0;
        this.A03 = "";
        this.A04 = false;
        this.A05 = false;
        this.A00 = 0;
    }

    public int hashCode() {
        return AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass0x2.A07(this.A03, AnonymousClass000.A00(this.A01 * 31, this.A02)), this.A04), this.A05) + this.A00;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("GroupTrustSignalInfo(knownContacts=");
        A0o.append(this.A01);
        A0o.append(", sortTimestamp=");
        A0o.append(this.A02);
        A0o.append(", displayName=");
        A0o.append(this.A03);
        A0o.append(", isAdmin=");
        A0o.append(this.A04);
        A0o.append(", isCreatedByMe=");
        A0o.append(this.A05);
        A0o.append(", groupParticipantsCount=");
        return C18260x0.A09(A0o, this.A00);
    }

    public AnonymousClass5XY() {
        this("", 0, 0, 0, false, false);
    }
}
