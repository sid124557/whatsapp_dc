package X;

import java.util.List;

/* renamed from: X.5Ra  reason: invalid class name and case insensitive filesystem */
public final class C104455Ra {
    public final List A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C104455Ra) {
                C104455Ra r5 = (C104455Ra) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(C18300x5.A04(this.A00), this.A01);
    }

    public C104455Ra(List list, boolean z) {
        this.A00 = list;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BusinessResult(searchItems=");
        A0o.append(this.A00);
        A0o.append(", isFetchedFromNetwork=");
        return C18260x0.A0A(A0o, this.A01);
    }
}
