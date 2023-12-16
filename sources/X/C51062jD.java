package X;

/* renamed from: X.2jD  reason: invalid class name and case insensitive filesystem */
public final class C51062jD {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C51062jD) && this.A00 == ((C51062jD) obj).A00);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public C51062jD(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("DataSharingDisclosureMetadata(showMarketingMessageDisclosure=");
        return C18260x0.A0A(A0o, this.A00);
    }
}
