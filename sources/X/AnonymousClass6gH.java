package X;

import java.util.Map;

/* renamed from: X.6gH  reason: invalid class name */
public final class AnonymousClass6gH extends AnonymousClass7DP {
    public boolean A00;
    public final Map A01;

    public AnonymousClass6gH(Map map, boolean z) {
        super(true);
        this.A01 = map;
        this.A00 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6gH) {
                AnonymousClass6gH r5 = (AnonymousClass6gH) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(C18300x5.A04(this.A01), this.A00);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("FetchGroupedCategoriesSuccess(categories=");
        A0o.append(this.A01);
        A0o.append(", cached=");
        return C18260x0.A0A(A0o, this.A00);
    }
}
