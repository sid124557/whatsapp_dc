package X;

/* renamed from: X.5Sc  reason: invalid class name and case insensitive filesystem */
public final class C104725Sc {
    public final float A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C104725Sc) {
                C104725Sc r5 = (C104725Sc) obj;
                if (!(this.A03 == r5.A03 && this.A01 == r5.A01 && Float.compare(this.A00, r5.A00) == 0 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00((((AnonymousClass0x9.A04(this.A03) + this.A01) * 31) + Float.floatToIntBits(this.A00)) * 31, this.A02);
    }

    public C104725Sc(float f, int i, boolean z, boolean z2) {
        this.A03 = z;
        this.A01 = i;
        this.A00 = f;
        this.A02 = z2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CommandData(isBusinessThirdPartyBot=");
        A0o.append(this.A03);
        A0o.append(", botProfileSize=");
        A0o.append(this.A01);
        A0o.append(", botProfileRadius=");
        A0o.append(this.A00);
        A0o.append(", isBusinessAccount=");
        return C18260x0.A0A(A0o, this.A02);
    }
}
