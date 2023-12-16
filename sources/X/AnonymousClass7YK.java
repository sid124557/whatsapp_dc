package X;

import java.util.List;

/* renamed from: X.7YK  reason: invalid class name */
public final class AnonymousClass7YK {
    public final long A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7YK) {
                AnonymousClass7YK r8 = (AnonymousClass7YK) obj;
                if (this.A00 != r8.A00 || !C162457s7.A0P(this.A01, r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, AnonymousClass0x2.A02(this.A00));
    }

    public AnonymousClass7YK(List list, long j) {
        this.A00 = j;
        this.A01 = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AllReactionsListUpdate(total=");
        A0o.append(this.A00);
        A0o.append(", reactions=");
        return C18260x0.A04(this.A01, A0o);
    }
}
