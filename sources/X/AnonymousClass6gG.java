package X;

import java.util.List;

/* renamed from: X.6gG  reason: invalid class name */
public final class AnonymousClass6gG extends AnonymousClass7DP {
    public boolean A00;
    public final List A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6gG(List list, boolean z) {
        super(true);
        C162457s7.A0J(list, 1);
        this.A01 = list;
        this.A00 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6gG) {
                AnonymousClass6gG r5 = (AnonymousClass6gG) obj;
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
        A0o.append("FetchCategoriesSuccess(categories=");
        A0o.append(this.A01);
        A0o.append(", cached=");
        return C18260x0.A0A(A0o, this.A00);
    }
}
