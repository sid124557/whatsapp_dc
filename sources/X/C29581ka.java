package X;

/* renamed from: X.1ka  reason: invalid class name and case insensitive filesystem */
public final class C29581ka extends AnonymousClass28F {
    public final AnonymousClass38T A00;

    public C29581ka(AnonymousClass38T r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C29581ka) && C162457s7.A0P(this.A00, ((C29581ka) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ReviewDataItem(newsletterAppeal=");
        return C18260x0.A04(this.A00, A0o);
    }
}
