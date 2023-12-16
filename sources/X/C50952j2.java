package X;

/* renamed from: X.2j2  reason: invalid class name and case insensitive filesystem */
public final class C50952j2 {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C50952j2) && C162457s7.A0P(this.A00, ((C50952j2) obj).A00));
    }

    public C50952j2(String str) {
        this.A00 = str;
    }

    public int hashCode() {
        return -656875146 + C18270x1.A00(this.A00);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CriticalEvent(criticalEvent=");
        A0o.append("participant-attribute-parser");
        A0o.append(", debugInfo=");
        return C18260x0.A07(this.A00, A0o);
    }
}
