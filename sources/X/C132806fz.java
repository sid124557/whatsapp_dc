package X;

/* renamed from: X.6fz  reason: invalid class name and case insensitive filesystem */
public final class C132806fz extends C152087Xm {
    public final boolean A00;

    public C132806fz(boolean z) {
        super(6);
        this.A00 = z;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C132806fz) && this.A00 == ((C132806fz) obj).A00);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("NotConnectedHeaderViewState(shouldShowRingAllButton=");
        return C18260x0.A0A(A0o, this.A00);
    }
}
