package X;

/* renamed from: X.5Sd  reason: invalid class name and case insensitive filesystem */
public final class C104735Sd {
    public AnonymousClass59Q A00;
    public AnonymousClass59Q A01;
    public boolean A02;
    public boolean A03;

    public C104735Sd(AnonymousClass59Q r2, AnonymousClass59Q r3, boolean z, boolean z2) {
        C18270x1.A11(r2, 3, r3);
        this.A02 = z;
        this.A03 = z2;
        this.A00 = r2;
        this.A01 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C104735Sd) {
                C104735Sd r5 = (C104735Sd) obj;
                if (!(this.A02 == r5.A02 && this.A03 == r5.A03 && this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, AnonymousClass000.A08(this.A00, AnonymousClass0x2.A01(AnonymousClass0x9.A04(this.A02), this.A03)));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CrosspostContextualShareViewStateV2(isVisible=");
        A0o.append(this.A02);
        A0o.append(", shouldAnimate=");
        A0o.append(this.A03);
        A0o.append(", fbIconState=");
        A0o.append(this.A00);
        A0o.append(", igIconState=");
        return C18260x0.A04(this.A01, A0o);
    }
}
