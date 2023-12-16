package X;

/* renamed from: X.2j4  reason: invalid class name and case insensitive filesystem */
public final class C50972j4 {
    public final C371120z A00;

    public C50972j4(C371120z r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C50972j4) && this.A00 == ((C50972j4) obj).A00);
    }

    public int hashCode() {
        return C18300x5.A04(this.A00) + 1237;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ParseHistorySyncParams(historySyncUsage=");
        A0o.append(this.A00);
        A0o.append(", strictMode=");
        return C18260x0.A0A(A0o, false);
    }
}
