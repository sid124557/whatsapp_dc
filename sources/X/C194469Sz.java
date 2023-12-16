package X;

/* renamed from: X.9Sz  reason: invalid class name and case insensitive filesystem */
public final class C194469Sz {
    public final String A00;

    public C194469Sz(String str) {
        C162457s7.A0J(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C194469Sz) && C162457s7.A0P(this.A00, ((C194469Sz) obj).A00));
    }

    public int hashCode() {
        return (this.A00.hashCode() * 31) + 1237;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UpiIndiaWithdrawInputSummaryViewData(conversionSummary=");
        A0o.append(this.A00);
        A0o.append(", isShimmering=");
        A0o.append(false);
        return AnonymousClass000.A0c(A0o);
    }
}
