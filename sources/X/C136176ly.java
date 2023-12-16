package X;

/* renamed from: X.6ly  reason: invalid class name and case insensitive filesystem */
public final class C136176ly extends C136186lz {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C136176ly) && this.A00 == ((C136176ly) obj).A00);
    }

    public C136176ly(int i) {
        super(C141966wQ.SECONDARY_TEXT_HEADER);
        this.A00 = i;
    }

    public int hashCode() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SecondaryTextHeaderListItemData(headerType=");
        return C18260x0.A09(A0o, this.A00);
    }

    public C136176ly() {
        this(0);
    }
}
