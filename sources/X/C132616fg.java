package X;

import java.util.Set;

/* renamed from: X.6fg  reason: invalid class name and case insensitive filesystem */
public final class C132616fg extends C150417Qq {
    public final Set A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C132616fg) {
                C132616fg r5 = (C132616fg) obj;
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

    public C132616fg(Set set, boolean z) {
        this.A00 = set;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("GroupedCategoriesChip(categories=");
        A0o.append(this.A00);
        A0o.append(", isSelected=");
        return C18260x0.A0A(A0o, this.A01);
    }
}
