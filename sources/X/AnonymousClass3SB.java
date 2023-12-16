package X;

/* renamed from: X.3SB  reason: invalid class name */
public final class AnonymousClass3SB implements AnonymousClass48P {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass3SB) && C162457s7.A0P(this.A00, ((AnonymousClass3SB) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass3SB(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ReportDetailScreen(reportId=");
        return C18260x0.A07(this.A00, A0o);
    }
}
