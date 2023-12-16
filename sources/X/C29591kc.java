package X;

/* renamed from: X.1kc  reason: invalid class name and case insensitive filesystem */
public final class C29591kc extends AnonymousClass28G {
    public final C28521hF A00;

    public C29591kc(C28521hF r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C29591kc) && C162457s7.A0P(this.A00, ((C29591kc) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Response(response=");
        return C18260x0.A04(this.A00, A0o);
    }
}
