package X;

/* renamed from: X.5Xi  reason: invalid class name and case insensitive filesystem */
public final class C106025Xi {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C106025Xi) {
                C106025Xi r5 = (C106025Xi) obj;
                if (!(this.A07 == r5.A07 && this.A04 == r5.A04 && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A00 == r5.A00 && this.A01 == r5.A01 && this.A05 == r5.A05 && this.A06 == r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int A00() {
        if (!this.A04) {
            return 0;
        }
        if ((!this.A03 || this.A00 != 0) && (!this.A02 || this.A00 != 1)) {
            return 0;
        }
        return 1;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass0x2.A01((((AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass0x9.A04(this.A07), this.A04), this.A03), this.A02) + this.A00) * 31) + this.A01) * 31, this.A05), this.A06);
    }

    public C106025Xi(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A07 = z;
        this.A04 = z2;
        this.A03 = z3;
        this.A02 = z4;
        this.A00 = i;
        this.A01 = i2;
        this.A05 = z5;
        this.A06 = z6;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("State(toolTipVisible=");
        A0o.append(this.A07);
        A0o.append(", entryIsBlank=");
        A0o.append(this.A04);
        A0o.append(", canSendVoiceMessages=");
        A0o.append(this.A03);
        A0o.append(", canSendPushToVideoMessages=");
        A0o.append(this.A02);
        A0o.append(", recorderMode=");
        A0o.append(this.A00);
        A0o.append(", toolTipType=");
        A0o.append(this.A01);
        A0o.append(", isPushToVideoNuxEnabled=");
        A0o.append(this.A05);
        A0o.append(", isRecorderModeMenuVisible=");
        return C18260x0.A0A(A0o, this.A06);
    }

    public C106025Xi() {
        this(0, 0, false, true, false, false, false, false);
    }
}
