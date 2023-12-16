package X;

/* renamed from: X.7ZE  reason: invalid class name */
public final class AnonymousClass7ZE {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7ZE) {
                AnonymousClass7ZE r5 = (AnonymousClass7ZE) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && this.A03 == r5.A03 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass0x2.A01(((this.A00 * 31) + this.A01) * 31, this.A03), this.A02);
    }

    public AnonymousClass7ZE(int i, int i2, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = z;
        this.A02 = z2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PipState(deviceRotation=");
        A0o.append(this.A00);
        A0o.append(", participantCount=");
        A0o.append(this.A01);
        A0o.append(", shouldShowSSPipIndicator=");
        A0o.append(this.A03);
        A0o.append(", shouldShowParticipantCount=");
        return C18260x0.A0A(A0o, this.A02);
    }
}
