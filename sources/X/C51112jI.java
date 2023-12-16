package X;

/* renamed from: X.2jI  reason: invalid class name and case insensitive filesystem */
public final class C51112jI {
    public final String A00;

    public C51112jI(String str) {
        C162457s7.A0J(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C51112jI) && C162457s7.A0P(this.A00, ((C51112jI) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AccountLinkingAuthBlobResult(authBlob=");
        return C18260x0.A07(this.A00, A0o);
    }
}
