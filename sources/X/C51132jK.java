package X;

/* renamed from: X.2jK  reason: invalid class name and case insensitive filesystem */
public final class C51132jK {
    public final C108895dj A00;

    public C51132jK(C108895dj r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C51132jK) && C162457s7.A0P(this.A00, ((C51132jK) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("XFamilyFbUserEntity(accessToken=");
        return C18260x0.A04(this.A00, A0o);
    }
}
