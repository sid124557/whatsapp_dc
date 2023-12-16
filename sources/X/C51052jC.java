package X;

/* renamed from: X.2jC  reason: invalid class name and case insensitive filesystem */
public final class C51052jC {
    public final String A00;

    public C51052jC(String str) {
        C162457s7.A0J(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C51052jC) && C162457s7.A0P(this.A00, ((C51052jC) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass0x2.A00((C18310x6.A09(this.A00) + 1231) * 31, -1);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PhoenixSessionConfig(sessionId=");
        A0o.append(this.A00);
        A0o.append(", isResumable=");
        A0o.append(true);
        A0o.append(", ttl=");
        return C18270x1.A0U(A0o, -1);
    }
}
