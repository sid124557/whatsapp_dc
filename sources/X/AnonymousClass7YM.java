package X;

import java.util.List;

/* renamed from: X.7YM  reason: invalid class name */
public final class AnonymousClass7YM {
    public final int A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7YM) {
                AnonymousClass7YM r5 = (AnonymousClass7YM) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C18300x5.A04(this.A01) + this.A00;
    }

    public AnonymousClass7YM(List list, int i) {
        this.A01 = list;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("TabsListUpdate(tabs=");
        A0o.append(this.A01);
        A0o.append(", selectedTabPosition=");
        return C18260x0.A09(A0o, this.A00);
    }
}
