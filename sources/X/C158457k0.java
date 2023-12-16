package X;

/* renamed from: X.7k0  reason: invalid class name and case insensitive filesystem */
public final class C158457k0 {
    public final C152397Ys A00;
    public final C166467yj A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C158457k0) {
                C158457k0 r5 = (C158457k0) obj;
                if (this.A02 != r5.A02 || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass0x9.A04(this.A02) + AnonymousClass000.A07(this.A00)) * 31) + C18310x6.A07(this.A01);
    }

    public C158457k0(C152397Ys r1, C166467yj r2, boolean z) {
        this.A02 = z;
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ViewState(isLoading=");
        A0o.append(this.A02);
        A0o.append(", errorMessage=");
        A0o.append(this.A00);
        A0o.append(", methodDetailsState=");
        return C18260x0.A04(this.A01, A0o);
    }

    public C158457k0() {
        this((C152397Ys) null, (C166467yj) null, false);
    }
}
