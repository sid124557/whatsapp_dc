package X;

/* renamed from: X.5Ru  reason: invalid class name and case insensitive filesystem */
public final class C104645Ru {
    public final AnonymousClass58P A00;
    public final Throwable A01;

    public C104645Ru(AnonymousClass58P r2, Throwable th) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
        this.A01 = th;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C104645Ru) {
                C104645Ru r5 = (C104645Ru) obj;
                if (this.A00 != r5.A00 || !C162457s7.A0P(this.A01, r5.A01)) {
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
        A0o.append("CreatePasskeyError(kind=");
        A0o.append(this.A00);
        A0o.append(", throwable=");
        return C18260x0.A04(this.A01, A0o);
    }
}
