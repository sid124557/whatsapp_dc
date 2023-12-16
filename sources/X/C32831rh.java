package X;

/* renamed from: X.1rh  reason: invalid class name and case insensitive filesystem */
public final class C32831rh extends AnonymousClass294 {
    public final String A00;

    public C32831rh(String str) {
        C162457s7.A0J(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C32831rh) && C162457s7.A0P(this.A00, ((C32831rh) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Error(reason=");
        return C18260x0.A07(this.A00, A0o);
    }
}
