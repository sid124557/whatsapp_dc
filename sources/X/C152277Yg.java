package X;

import java.util.List;

/* renamed from: X.7Yg  reason: invalid class name and case insensitive filesystem */
public final class C152277Yg {
    public final String A00;
    public final String A01;
    public final List A02;

    public C152277Yg(String str, String str2, List list) {
        C162457s7.A0J(str, 1);
        this.A01 = str;
        this.A02 = list;
        this.A00 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C152277Yg) {
                C152277Yg r5 = (C152277Yg) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A02, C18310x6.A09(this.A01)) + C18270x1.A00(this.A00);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BusinessApiSearchResult(usecase=");
        A0o.append(this.A01);
        A0o.append(", businesses=");
        A0o.append(this.A02);
        A0o.append(", pageId=");
        return C18260x0.A07(this.A00, A0o);
    }
}
