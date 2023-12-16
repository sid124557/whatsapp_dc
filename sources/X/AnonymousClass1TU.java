package X;

import java.util.List;

/* renamed from: X.1TU  reason: invalid class name */
public final class AnonymousClass1TU extends AnonymousClass26V {
    public final C43952Uc A00;
    public final List A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass1TU) {
                AnonymousClass1TU r5 = (AnonymousClass1TU) obj;
                if (!(C162457s7.A0P(this.A01, r5.A01) && C162457s7.A0P(this.A00, r5.A00) && this.A03 == r5.A03 && this.A04 == r5.A04 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass000.A08(this.A00, C18300x5.A04(this.A01)), this.A03), this.A04), this.A02);
    }

    public AnonymousClass1TU(C43952Uc r1, List list, boolean z, boolean z2, boolean z3) {
        this.A01 = list;
        this.A00 = r1;
        this.A03 = z;
        this.A04 = z2;
        this.A02 = z3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ShowItems(items=");
        A0o.append(this.A01);
        A0o.append(", selectedCategory=");
        A0o.append(this.A00);
        A0o.append(", recentEnabled=");
        A0o.append(this.A03);
        A0o.append(", starredEnabled=");
        A0o.append(this.A04);
        A0o.append(", moveToSelectedCategory=");
        return C18260x0.A0A(A0o, this.A02);
    }
}
