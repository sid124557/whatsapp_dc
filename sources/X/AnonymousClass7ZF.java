package X;

/* renamed from: X.7ZF  reason: invalid class name */
public final class AnonymousClass7ZF {
    public final float A00;
    public final int A01;
    public final int A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7ZF) {
                AnonymousClass7ZF r5 = (AnonymousClass7ZF) obj;
                if (!(this.A01 == r5.A01 && this.A02 == r5.A02 && this.A03 == r5.A03 && Float.compare(this.A00, r5.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x2.A01(((this.A01 * 31) + this.A02) * 31, this.A03) + Float.floatToIntBits(this.A00);
    }

    public AnonymousClass7ZF(float f, int i, int i2, boolean z) {
        this.A01 = i;
        this.A02 = i2;
        this.A03 = z;
        this.A00 = f;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AddParticipantUiState(buttonDrawableRes=");
        A0o.append(this.A01);
        A0o.append(", visibility=");
        A0o.append(this.A02);
        A0o.append(", clickable=");
        A0o.append(this.A03);
        A0o.append(", alpha=");
        A0o.append(this.A00);
        return AnonymousClass000.A0c(A0o);
    }
}
