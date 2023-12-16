package X;

/* renamed from: X.7jq  reason: invalid class name and case insensitive filesystem */
public final class C158357jq {
    public final AnonymousClass5TF A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C158357jq) {
                C158357jq r5 = (C158357jq) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass000.A07(this.A00) * 31, this.A01);
    }

    public C158357jq(AnonymousClass5TF r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UIModel(appliedPromotion=");
        A0o.append(this.A00);
        A0o.append(", hasPromotions=");
        return C18260x0.A0A(A0o, this.A01);
    }

    public C158357jq() {
        this((AnonymousClass5TF) null, false);
    }
}
