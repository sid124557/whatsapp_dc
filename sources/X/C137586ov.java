package X;

/* renamed from: X.6ov  reason: invalid class name and case insensitive filesystem */
public final class C137586ov extends AnonymousClass7SW {
    public final AnonymousClass7YQ A00;
    public final AnonymousClass7YQ A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C137586ov) {
                C137586ov r5 = (C137586ov) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
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

    public C137586ov(AnonymousClass7YQ r1, AnonymousClass7YQ r2) {
        super(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("NestedChipVariant(leftIcon=");
        A0o.append(this.A00);
        A0o.append(", rightIcon=");
        return C18260x0.A04(this.A01, A0o);
    }
}
