package X;

/* renamed from: X.6lx  reason: invalid class name and case insensitive filesystem */
public final class C136166lx extends C136186lz {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C136166lx) && C162457s7.A0P(this.A00, ((C136166lx) obj).A00));
    }

    public C136166lx(String str) {
        super(14);
        this.A00 = str;
    }

    public int hashCode() {
        return C18270x1.A00(this.A00);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("NoResultViewData(query=");
        return C18260x0.A07(this.A00, A0o);
    }

    public C136166lx() {
        this((String) null);
    }
}
