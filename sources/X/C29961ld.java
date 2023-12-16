package X;

/* renamed from: X.1ld  reason: invalid class name and case insensitive filesystem */
public final class C29961ld extends C44622Wu {
    public final AnonymousClass28M A00;
    public final Throwable A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29961ld(AnonymousClass28M r2, Throwable th) {
        super(r2);
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
        this.A01 = th;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C29961ld) {
                C29961ld r5 = (C29961ld) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, C18300x5.A04(this.A00));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Error(searchType=");
        A0o.append(this.A00);
        A0o.append(", error=");
        return C18260x0.A04(this.A01, A0o);
    }
}
