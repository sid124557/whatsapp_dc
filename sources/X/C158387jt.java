package X;

/* renamed from: X.7jt  reason: invalid class name and case insensitive filesystem */
public final class C158387jt {
    public final C152407Yt A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C158387jt) {
                C158387jt r5 = (C158387jt) obj;
                if (this.A01 != r5.A01 || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x9.A04(this.A01) + AnonymousClass000.A07(this.A00);
    }

    public C158387jt(C152407Yt r1, boolean z) {
        this.A01 = z;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ViewState(isLoading=");
        A0o.append(this.A01);
        A0o.append(", errorMessage=");
        return C18260x0.A04(this.A00, A0o);
    }

    public C158387jt() {
        this((C152407Yt) null, false);
    }
}
