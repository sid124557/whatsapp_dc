package X;

/* renamed from: X.2yX  reason: invalid class name and case insensitive filesystem */
public final class C60422yX {
    public final String A00;

    public C60422yX(String str) {
        C162457s7.A0J(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C60422yX) && C162457s7.A0P(this.A00, ((C60422yX) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PhoenixFlowInfo(config=");
        return C18260x0.A07(this.A00, A0o);
    }

    public C60422yX() {
        this("");
    }
}
