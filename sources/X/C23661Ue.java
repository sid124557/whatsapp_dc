package X;

/* renamed from: X.1Ue  reason: invalid class name and case insensitive filesystem */
public final class C23661Ue extends AnonymousClass26m {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C23661Ue) && C162457s7.A0P(this.A00, ((C23661Ue) obj).A00));
    }

    public int hashCode() {
        return C18270x1.A00(this.A00);
    }

    public C23661Ue(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Failure(errorMessage=");
        return C18260x0.A07(this.A00, A0o);
    }
}
