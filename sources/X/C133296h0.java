package X;

/* renamed from: X.6h0  reason: invalid class name and case insensitive filesystem */
public final class C133296h0 extends C149397Mh {
    public final boolean A00;

    public C133296h0(boolean z) {
        super(C133256gw.A00, z, false, false);
        this.A00 = z;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C133296h0) && this.A00 == ((C133296h0) obj).A00);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CategoryList(isCategoriesEnabled=");
        return C18260x0.A0A(A0o, this.A00);
    }
}
