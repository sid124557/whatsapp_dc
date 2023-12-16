package X;

/* renamed from: X.2kG  reason: invalid class name and case insensitive filesystem */
public final class C51712kG {
    public final boolean A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51712kG) {
                C51712kG r5 = (C51712kG) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass0x9.A04(this.A00), this.A01);
    }

    public C51712kG(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CheckUiState(isChecked=");
        A0o.append(this.A00);
        A0o.append(", isEnabled=");
        return C18260x0.A0A(A0o, this.A01);
    }
}
