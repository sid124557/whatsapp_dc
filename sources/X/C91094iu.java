package X;

/* renamed from: X.4iu  reason: invalid class name and case insensitive filesystem */
public final class C91094iu extends AnonymousClass5AG {
    public final String A00;

    public C91094iu(String str) {
        C162457s7.A0J(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C91094iu) && C162457s7.A0P(this.A00, ((C91094iu) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("RequestingConsent(productSessionId=");
        return C18260x0.A07(this.A00, A0o);
    }
}
