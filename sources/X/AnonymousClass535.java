package X;

import java.util.List;

/* renamed from: X.535  reason: invalid class name */
public final class AnonymousClass535 extends AnonymousClass5C8 {
    public final List A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass535) {
                AnonymousClass535 r5 = (AnonymousClass535) obj;
                if (!(C162457s7.A0P(this.A00, r5.A00) && this.A01 == r5.A01 && this.A02 == r5.A02 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass0x2.A01(AnonymousClass0x2.A01(C18300x5.A04(this.A00), this.A01), this.A02), this.A03);
    }

    public AnonymousClass535(List list, boolean z, boolean z2, boolean z3) {
        this.A00 = list;
        this.A01 = z;
        this.A02 = z2;
        this.A03 = z3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("RecommendedNewslettersListDataItem(recommendedNewsletters=");
        A0o.append(this.A00);
        A0o.append(", hasNewsletterSubscriptions=");
        A0o.append(this.A01);
        A0o.append(", isCollapsed=");
        A0o.append(this.A02);
        A0o.append(", isCollapsingAvailable=");
        return C18260x0.A0A(A0o, this.A03);
    }
}
