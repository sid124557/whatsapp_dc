package X;

/* renamed from: X.7Ya  reason: invalid class name and case insensitive filesystem */
public final class C152217Ya {
    public long A00;
    public long A01;
    public final C109015dw A02;

    public C152217Ya(C109015dw r2, long j, long j2) {
        C162457s7.A0J(r2, 1);
        this.A02 = r2;
        this.A00 = j;
        this.A01 = j2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C152217Ya) {
                C152217Ya r8 = (C152217Ya) obj;
                if (!(C162457s7.A0P(this.A02, r8.A02) && this.A00 == r8.A00 && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x2.A00(AnonymousClass000.A00(C18300x5.A04(this.A02), this.A00), this.A01);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CartItem(product=");
        A0o.append(this.A02);
        A0o.append(", quantity=");
        A0o.append(this.A00);
        A0o.append(", totalVariantQuantity=");
        return C18270x1.A0U(A0o, this.A01);
    }
}
