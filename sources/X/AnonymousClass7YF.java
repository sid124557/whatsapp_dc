package X;

import java.util.List;

/* renamed from: X.7YF  reason: invalid class name */
public final class AnonymousClass7YF {
    public final C171378Gv A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7YF) {
                AnonymousClass7YF r5 = (AnonymousClass7YF) obj;
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

    public AnonymousClass7YF(C171378Gv r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("RequestSection(headingRow=");
        A0o.append(this.A00);
        A0o.append(", requestRows=");
        return C18260x0.A04(this.A01, A0o);
    }
}
