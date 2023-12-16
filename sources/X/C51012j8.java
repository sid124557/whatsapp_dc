package X;

import java.util.Set;

/* renamed from: X.2j8  reason: invalid class name and case insensitive filesystem */
public final class C51012j8 {
    public final Set A00;

    public C51012j8(Set set) {
        C162457s7.A0J(set, 1);
        this.A00 = set;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C51012j8) && C162457s7.A0P(this.A00, ((C51012j8) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("NewsletterGeosuspendedInfo(countries=");
        return C18260x0.A04(this.A00, A0o);
    }
}
