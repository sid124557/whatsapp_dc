package X;

import java.util.List;

/* renamed from: X.1UI  reason: invalid class name */
public final class AnonymousClass1UI extends C381926c {
    public final String A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass1UI) {
                AnonymousClass1UI r5 = (AnonymousClass1UI) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(this.A00, C18300x5.A04(this.A01));
    }

    public AnonymousClass1UI(String str, List list) {
        C18260x0.A0Q(list, str);
        this.A01 = list;
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ShowSearchResults(funStickers=");
        A0o.append(this.A01);
        A0o.append(", prompt=");
        return C18260x0.A07(this.A00, A0o);
    }
}
