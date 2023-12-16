package X;

/* renamed from: X.0Ph  reason: invalid class name */
public final class AnonymousClass0Ph {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0Ph) {
                AnonymousClass0Ph r5 = (AnonymousClass0Ph) obj;
                if (!(this.A00 == r5.A00 && this.A03 == r5.A03 && this.A01 == r5.A01 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.A00;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        boolean z2 = this.A03;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.A01;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        if (!this.A02) {
            i = 0;
        }
        return i4 + i;
    }

    public AnonymousClass0Ph(boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = z;
        this.A03 = z2;
        this.A01 = z3;
        this.A02 = z4;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("NetworkState(isConnected=");
        A0o.append(this.A00);
        A0o.append(", isValidated=");
        A0o.append(this.A03);
        A0o.append(", isMetered=");
        A0o.append(this.A01);
        A0o.append(", isNotRoaming=");
        A0o.append(this.A02);
        return AnonymousClass000.A0c(A0o);
    }
}
