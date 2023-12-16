package X;

import java.util.List;

/* renamed from: X.7Yf  reason: invalid class name and case insensitive filesystem */
public final class C152267Yf {
    public final List A00;
    public final List A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C152267Yf) {
                C152267Yf r5 = (C152267Yf) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A02, AnonymousClass000.A08(this.A00, C18300x5.A04(this.A01)));
    }

    public C152267Yf(List list, List list2, List list3) {
        this.A01 = list;
        this.A00 = list2;
        this.A02 = list3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BusinessApiHomeResult(popularBiz=");
        A0o.append(this.A01);
        A0o.append(", bizCategories=");
        A0o.append(this.A00);
        A0o.append(", popularBizCustomLists=");
        return C18260x0.A04(this.A02, A0o);
    }
}
