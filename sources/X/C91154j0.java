package X;

/* renamed from: X.4j0  reason: invalid class name and case insensitive filesystem */
public final class C91154j0 extends AnonymousClass5AG {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C91154j0) && this.A00 == ((C91154j0) obj).A00);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public C91154j0(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Fetching(shouldApplyLoadingState=");
        return C18260x0.A0A(A0o, this.A00);
    }

    public C91154j0() {
        this(true);
    }
}
