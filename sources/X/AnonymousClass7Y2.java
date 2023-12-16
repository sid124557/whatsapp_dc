package X;

import java.util.Map;

/* renamed from: X.7Y2  reason: invalid class name */
public final class AnonymousClass7Y2 {
    public final String A00;
    public final Map A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7Y2) {
                AnonymousClass7Y2 r5 = (AnonymousClass7Y2) obj;
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

    public AnonymousClass7Y2(String str, Map map) {
        this.A00 = str;
        this.A01 = map;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AIBotEmbodimentActionData(action=");
        A0o.append(this.A00);
        A0o.append(", sentiments=");
        return C18260x0.A04(this.A01, A0o);
    }
}
