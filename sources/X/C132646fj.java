package X;

/* renamed from: X.6fj  reason: invalid class name and case insensitive filesystem */
public final class C132646fj extends C150417Qq {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C132646fj) && this.A00 == ((C132646fj) obj).A00);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public C132646fj(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("OpenNowChip(isSelected=");
        return C18260x0.A0A(A0o, this.A00);
    }

    public C132646fj() {
        this(false);
    }
}
