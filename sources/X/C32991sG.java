package X;

/* renamed from: X.1sG  reason: invalid class name and case insensitive filesystem */
public final class C32991sG extends AnonymousClass29D {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C32991sG) && C162457s7.A0P(this.A00, ((C32991sG) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C32991sG(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Success(username=");
        return C18260x0.A07(this.A00, A0o);
    }
}
