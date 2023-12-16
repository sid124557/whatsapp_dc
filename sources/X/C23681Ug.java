package X;

/* renamed from: X.1Ug  reason: invalid class name and case insensitive filesystem */
public final class C23681Ug extends AnonymousClass26n {
    public final String A00;

    public C23681Ug(String str) {
        C162457s7.A0J(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C23681Ug) && C162457s7.A0P(this.A00, ((C23681Ug) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Failure(errorMessage=");
        return C18260x0.A07(this.A00, A0o);
    }
}
