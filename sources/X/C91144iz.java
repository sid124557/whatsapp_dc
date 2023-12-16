package X;

/* renamed from: X.4iz  reason: invalid class name and case insensitive filesystem */
public final class C91144iz extends AnonymousClass5AG {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C91144iz) && this.A00 == ((C91144iz) obj).A00);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public C91144iz(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Enabled(shouldClearLoadingState=");
        return C18260x0.A0A(A0o, this.A00);
    }

    public C91144iz() {
        this(false);
    }
}
