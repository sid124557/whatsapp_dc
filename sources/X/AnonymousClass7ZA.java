package X;

import java.util.List;

/* renamed from: X.7ZA  reason: invalid class name */
public final class AnonymousClass7ZA {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7ZA) {
                AnonymousClass7ZA r5 = (AnonymousClass7ZA) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(this.A02, AnonymousClass000.A08(this.A03, AnonymousClass0x2.A07(this.A01, C18310x6.A09(this.A00))));
    }

    public AnonymousClass7ZA(String str, String str2, String str3, List list) {
        C18260x0.A0Q(str, str2);
        this.A00 = str;
        this.A01 = str2;
        this.A03 = list;
        this.A02 = str3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PopularBizCustomListInfo(categoryId=");
        A0o.append(this.A00);
        A0o.append(", listName=");
        A0o.append(this.A01);
        A0o.append(", minifiedBusinessProfileList=");
        A0o.append(this.A03);
        A0o.append(", moduleName=");
        return C18260x0.A07(this.A02, A0o);
    }
}
