package X;

/* renamed from: X.9FC  reason: invalid class name */
public final class AnonymousClass9FC extends AnonymousClass9FE {
    public final C95814uZ A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass9FC) && C162457s7.A0P(this.A00, ((AnonymousClass9FC) obj).A00));
    }

    public AnonymousClass9FC(C95814uZ r2) {
        super(1008);
        this.A00 = r2;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("IndiaUpiTransactionDetailContactMerchantViewData(merchantJid=");
        return C18260x0.A04(this.A00, A0o);
    }
}
