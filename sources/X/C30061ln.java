package X;

/* renamed from: X.1ln  reason: invalid class name and case insensitive filesystem */
public final class C30061ln extends AnonymousClass28P {
    public final boolean A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C30061ln) {
                C30061ln r5 = (C30061ln) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass0x9.A04(this.A01), this.A00);
    }

    public C30061ln(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AvatarUpdated(isCreation=");
        A0o.append(this.A01);
        A0o.append(", isAutogen=");
        return C18260x0.A0A(A0o, this.A00);
    }
}
