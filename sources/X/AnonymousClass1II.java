package X;

/* renamed from: X.1II  reason: invalid class name */
public final class AnonymousClass1II extends AnonymousClass252 {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass1II) && this.A00 == ((AnonymousClass1II) obj).A00);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public AnonymousClass1II(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("NewUser(isDeleted=");
        return C18260x0.A0A(A0o, this.A00);
    }

    public AnonymousClass1II() {
        this(false);
    }
}
