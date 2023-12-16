package X;

/* renamed from: X.5XX  reason: invalid class name */
public final class AnonymousClass5XX {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5XX) {
                AnonymousClass5XX r5 = (AnonymousClass5XX) obj;
                if (!(this.A04 == r5.A04 && this.A01 == r5.A01 && this.A00 == r5.A00 && this.A03 == r5.A03 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass0x9.A04(this.A04), this.A01), this.A00), this.A03), this.A02);
    }

    public AnonymousClass5XX(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A04 = z;
        this.A01 = z2;
        this.A00 = z3;
        this.A03 = z4;
        this.A02 = z5;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("State(toolTipVisible=");
        A0o.append(this.A04);
        A0o.append(", entryIsBlank=");
        A0o.append(this.A01);
        A0o.append(", canSendPushToVideoMessages=");
        A0o.append(this.A00);
        A0o.append(", isPushToVideoNuxEnabled=");
        A0o.append(this.A03);
        A0o.append(", isCameraEntryPointEnabled=");
        return C18260x0.A0A(A0o, this.A02);
    }

    public AnonymousClass5XX() {
        this(false, true, false, false, false);
    }
}
