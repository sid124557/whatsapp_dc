package X;

/* renamed from: X.5Sb  reason: invalid class name and case insensitive filesystem */
public final class C104715Sb {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C104715Sb) {
                C104715Sb r5 = (C104715Sb) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && this.A03 == r5.A03 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass0x9.A04(this.A01), this.A00), this.A03), this.A02);
    }

    public C104715Sb(boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = z;
        this.A00 = z2;
        this.A03 = z3;
        this.A02 = z4;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CrossPostingViewModelState(shareViewVisible=");
        A0o.append(this.A01);
        A0o.append(", shareViewShouldAnimate=");
        A0o.append(this.A00);
        A0o.append(", upsellViewVisible=");
        A0o.append(this.A03);
        A0o.append(", upsellViewShouldAnimate=");
        return C18260x0.A0A(A0o, this.A02);
    }
}
