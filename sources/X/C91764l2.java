package X;

/* renamed from: X.4l2  reason: invalid class name and case insensitive filesystem */
public final class C91764l2 extends C100225Ab {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C91764l2) && this.A00 == ((C91764l2) obj).A00);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public C91764l2(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("QrDataExpiredState(expired=");
        return C18260x0.A0A(A0o, this.A00);
    }
}
