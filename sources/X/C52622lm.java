package X;

import java.util.Map;

/* renamed from: X.2lm  reason: invalid class name and case insensitive filesystem */
public final class C52622lm {
    public final String A00;
    public final String A01;
    public final Map A02;

    public C52622lm(String str, String str2, Map map) {
        C162457s7.A0J(str, 1);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = map;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52622lm) {
                C52622lm r5 = (C52622lm) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C18310x6.A09(this.A00) + C18270x1.A00(this.A01)) * 31) + C18310x6.A07(this.A02);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PhoenixRequestNode(config=");
        A0o.append(this.A00);
        A0o.append(", state=");
        A0o.append(this.A01);
        A0o.append(", params=");
        return C18260x0.A04(this.A02, A0o);
    }
}
