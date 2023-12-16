package X;

/* renamed from: X.2jJ  reason: invalid class name and case insensitive filesystem */
public final class C51122jJ {
    public final C108895dj A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C51122jJ) && C162457s7.A0P(this.A00, ((C51122jJ) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C51122jJ(C108895dj r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("NativeAuthTokenExchangeResult(limitedScopedAccessToken=");
        return C18260x0.A04(this.A00, A0o);
    }
}
