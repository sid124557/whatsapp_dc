package X;

/* renamed from: X.6i0  reason: invalid class name and case insensitive filesystem */
public final class C133826i0 extends AnonymousClass74T {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C133826i0) && C162457s7.A0P(this.A00, ((C133826i0) obj).A00));
    }

    public int hashCode() {
        return C18270x1.A00(this.A00);
    }

    public C133826i0(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VerificationError(message=");
        return C18260x0.A07(this.A00, A0o);
    }
}
