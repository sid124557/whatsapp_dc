package X;

/* renamed from: X.7Xo  reason: invalid class name and case insensitive filesystem */
public final class C152107Xo {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C152107Xo) && this.A00 == ((C152107Xo) obj).A00);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public C152107Xo(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PushToVideoCameraEntryPointToolTipUiState(toolTipVisible=");
        return C18260x0.A0A(A0o, this.A00);
    }
}
