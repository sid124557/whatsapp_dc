package X;

/* renamed from: X.6fi  reason: invalid class name and case insensitive filesystem */
public final class C132636fi extends C150417Qq {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C132636fi) && this.A00 == ((C132636fi) obj).A00);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public C132636fi(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("HasCatalogChip(isSelected=");
        return C18260x0.A0A(A0o, this.A00);
    }

    public C132636fi() {
        this(false);
    }
}
