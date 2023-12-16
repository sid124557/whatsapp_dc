package X;

import java.util.Map;

/* renamed from: X.7Yc  reason: invalid class name and case insensitive filesystem */
public final class C152237Yc {
    public final String A00;
    public final Map A01;
    public final Map A02;

    public C152237Yc(String str, Map map, Map map2) {
        C162457s7.A0J(str, 1);
        this.A00 = str;
        this.A01 = map;
        this.A02 = map2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C152237Yc) {
                C152237Yc r5 = (C152237Yc) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A02, AnonymousClass000.A08(this.A01, C18310x6.A09(this.A00)));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AIBotEmbodimentStateData(state=");
        A0o.append(this.A00);
        A0o.append(", actions=");
        A0o.append(this.A01);
        A0o.append(", transitions=");
        return C18260x0.A04(this.A02, A0o);
    }
}
