package X;

/* renamed from: X.8Es  reason: invalid class name and case insensitive filesystem */
public final class C170838Es implements C179068iY {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C170838Es) && this.A00 == ((C170838Es) obj).A00);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public C170838Es(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ProductBottomSheetUiStateLoading(showVariantCarouselGlimmeringState=");
        return C18260x0.A0A(A0o, this.A00);
    }
}
