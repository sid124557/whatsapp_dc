package X;

/* renamed from: X.6jy  reason: invalid class name and case insensitive filesystem */
public final class C135006jy extends C1451174f {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C135006jy) && C162457s7.A0P(this.A00, ((C135006jy) obj).A00));
    }

    public int hashCode() {
        return C18270x1.A00(this.A00);
    }

    public C135006jy(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("LogsInfo(logsId=");
        return C18260x0.A07(this.A00, A0o);
    }
}
