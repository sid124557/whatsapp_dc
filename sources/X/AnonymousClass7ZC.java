package X;

import java.util.List;

/* renamed from: X.7ZC  reason: invalid class name */
public final class AnonymousClass7ZC {
    public final String A00;
    public final String A01;
    public final List A02;
    public final List A03;

    public AnonymousClass7ZC(String str, String str2, List list, List list2) {
        C162457s7.A0J(str, 1);
        this.A01 = str;
        this.A00 = str2;
        this.A03 = list;
        this.A02 = list2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7ZC) {
                AnonymousClass7ZC r5 = (AnonymousClass7ZC) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A02, AnonymousClass000.A08(this.A03, (C18310x6.A09(this.A01) + C18270x1.A00(this.A00)) * 31));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MapViewBusinessSearchResult(viewType=");
        A0o.append(this.A01);
        A0o.append(", requestId=");
        A0o.append(this.A00);
        A0o.append(", clusters=");
        A0o.append(this.A03);
        A0o.append(", businesses=");
        return C18260x0.A04(this.A02, A0o);
    }
}
