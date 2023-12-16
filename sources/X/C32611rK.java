package X;

/* renamed from: X.1rK  reason: invalid class name and case insensitive filesystem */
public final class C32611rK extends C387328x {
    public final String A00;

    public C32611rK(String str) {
        C162457s7.A0J(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C32611rK) && C162457s7.A0P(this.A00, ((C32611rK) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Error(error=");
        return C18260x0.A07(this.A00, A0o);
    }
}
