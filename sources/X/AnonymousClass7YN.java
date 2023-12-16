package X;

import java.util.Map;

/* renamed from: X.7YN  reason: invalid class name */
public final class AnonymousClass7YN {
    public final String A00;
    public final Map A01;

    public AnonymousClass7YN(String str, Map map) {
        C162457s7.A0J(str, 1);
        this.A00 = str;
        this.A01 = map;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7YN) {
                AnonymousClass7YN r5 = (AnonymousClass7YN) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C18310x6.A09(this.A00) + AnonymousClass000.A07(this.A01);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("FcsJitPrefetchNextScreenData(appId=");
        A0o.append(this.A00);
        A0o.append(", bloksServerParams=");
        return C18260x0.A04(this.A01, A0o);
    }
}
