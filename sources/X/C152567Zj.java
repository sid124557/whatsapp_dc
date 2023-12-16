package X;

/* renamed from: X.7Zj  reason: invalid class name and case insensitive filesystem */
public final class C152567Zj {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C152567Zj) {
                C152567Zj r5 = (C152567Zj) obj;
                if (!(this.A05 == r5.A05 && this.A00 == r5.A00 && this.A01 == r5.A01 && this.A02 == r5.A02 && this.A04 == r5.A04 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass0x2.A01(AnonymousClass0x2.A01((((AnonymousClass0x9.A04(this.A05) + this.A00) * 31) + this.A01) * 31, this.A02), this.A04), this.A03);
    }

    public C152567Zj(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A05 = z;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = z2;
        this.A04 = z3;
        this.A03 = z4;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ToolTipUiState(toolTipVisible=");
        A0o.append(this.A05);
        A0o.append(", recorderMode=");
        A0o.append(this.A00);
        A0o.append(", toolTipType=");
        A0o.append(this.A01);
        A0o.append(", canToggleRecorderMode=");
        A0o.append(this.A02);
        A0o.append(", isToolTipAnimationEnabled=");
        A0o.append(this.A04);
        A0o.append(", isSimplifiedRecorderModeAnimationEnabled=");
        return C18260x0.A0A(A0o, this.A03);
    }
}
