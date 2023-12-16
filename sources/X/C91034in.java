package X;

/* renamed from: X.4in  reason: invalid class name and case insensitive filesystem */
public final class C91034in extends AnonymousClass5AD {
    public final Boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C91034in) && C162457s7.A0P(this.A00, ((C91034in) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass000.A07(this.A00);
    }

    public C91034in(Boolean bool) {
        this.A00 = bool;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Success(consentResult=");
        return C18260x0.A04(this.A00, A0o);
    }
}
