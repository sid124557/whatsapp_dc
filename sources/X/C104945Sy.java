package X;

/* renamed from: X.5Sy  reason: invalid class name and case insensitive filesystem */
public final class C104945Sy {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public C104945Sy(String str, String str2, int i, int i2, boolean z, boolean z2) {
        AnonymousClass0x2.A1A(str, 2, str2);
        this.A00 = i;
        this.A02 = str;
        this.A05 = z;
        this.A04 = z2;
        this.A03 = str2;
        this.A01 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C104945Sy) {
                C104945Sy r5 = (C104945Sy) obj;
                if (!(this.A00 == r5.A00 && C162457s7.A0P(this.A02, r5.A02) && this.A05 == r5.A05 && this.A04 == r5.A04 && C162457s7.A0P(this.A03, r5.A03) && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x2.A07(this.A03, AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass0x2.A07(this.A02, this.A00 * 31), this.A05), this.A04)) + this.A01;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("DeviceConfirmationResult(status=");
        A0o.append(this.A00);
        A0o.append(", login=");
        A0o.append(this.A02);
        A0o.append(", newJid=");
        A0o.append(this.A05);
        A0o.append(", netNewJid=");
        A0o.append(this.A04);
        A0o.append(", retryAfter=");
        A0o.append(this.A03);
        A0o.append(", wamsysFailureReason=");
        return C18260x0.A09(A0o, this.A01);
    }
}
