package X;

/* renamed from: X.5Sz  reason: invalid class name and case insensitive filesystem */
public final class C104955Sz {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C104955Sz) {
                C104955Sz r5 = (C104955Sz) obj;
                if (!(this.A00 == r5.A00 && C162457s7.A0P(this.A02, r5.A02) && this.A05 == r5.A05 && this.A04 == r5.A04 && C162457s7.A0P(this.A03, r5.A03) && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass0x2.A01(AnonymousClass0x2.A01(((this.A00 * 31) + C18270x1.A00(this.A02)) * 31, this.A05), this.A04) + AnonymousClass0x7.A07(this.A03)) * 31) + this.A01;
    }

    public C104955Sz(String str, String str2, int i, int i2, boolean z, boolean z2) {
        this.A00 = i;
        this.A02 = str;
        this.A05 = z;
        this.A04 = z2;
        this.A03 = str2;
        this.A01 = i2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("FetchDeviceConfirmationResult(status=");
        A0o.append(this.A00);
        A0o.append(", login=");
        A0o.append(this.A02);
        A0o.append(", newJid=");
        A0o.append(this.A05);
        A0o.append(", firstPartyMigrationInitiated=");
        A0o.append(this.A04);
        A0o.append(", retryAfter=");
        A0o.append(this.A03);
        A0o.append(", wamsysFailureReason=");
        return C18260x0.A09(A0o, this.A01);
    }
}
