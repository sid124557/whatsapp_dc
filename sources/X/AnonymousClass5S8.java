package X;

/* renamed from: X.5S8  reason: invalid class name */
public final class AnonymousClass5S8 {
    public final int A00;
    public final int A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5S8) {
                AnonymousClass5S8 r5 = (AnonymousClass5S8) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(((this.A01 * 31) + this.A00) * 31, this.A02);
    }

    public AnonymousClass5S8(int i, int i2, boolean z) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PushToVideoSendingEnabledDefaultInfo(sendsThreshold=");
        A0o.append(this.A01);
        A0o.append(", durationThresholdSeconds=");
        A0o.append(this.A00);
        A0o.append(", sendingEnabled=");
        return C18260x0.A0A(A0o, this.A02);
    }
}
