package X;

/* renamed from: X.0P9  reason: invalid class name */
public final class AnonymousClass0P9 {
    public final long A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass0P9) && this.A00 == ((AnonymousClass0P9) obj).A00);
    }

    public int hashCode() {
        long j = this.A00;
        return (int) (j ^ (j >>> 32));
    }

    public AnonymousClass0P9(long j) {
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("RenderSummary(createdAt=");
        A0o.append(this.A00);
        return AnonymousClass000.A0c(A0o);
    }
}
