package X;

import java.util.List;

/* renamed from: X.7YC  reason: invalid class name */
public final class AnonymousClass7YC {
    public final String A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7YC) {
                AnonymousClass7YC r5 = (AnonymousClass7YC) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, C18310x6.A09(this.A00));
    }

    public AnonymousClass7YC(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SubgroupSuggestions(view=");
        A0o.append(this.A00);
        A0o.append(", suggestions=");
        return C18260x0.A04(this.A01, A0o);
    }
}
