package X;

/* renamed from: X.6dA  reason: invalid class name and case insensitive filesystem */
public final class C131176dA extends AnonymousClass7RT {
    public final C160367nW A00;
    public final Throwable A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C131176dA(C160367nW r2, Throwable th) {
        super(r2);
        C162457s7.A0J(th, 1);
        this.A01 = th;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C131176dA) {
                C131176dA r5 = (C131176dA) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Throwable A01() {
        return this.A01;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, C18300x5.A04(this.A01));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Failure(exception=");
        A0o.append(this.A01);
        A0o.append(", fetchSummaryData=");
        return C18260x0.A04(this.A00, A0o);
    }
}
