package X;

import java.util.Map;

/* renamed from: X.5S4  reason: invalid class name */
public final class AnonymousClass5S4 {
    public final String A00;
    public final Map A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5S4) {
                AnonymousClass5S4 r5 = (AnonymousClass5S4) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || this.A02 != r5.A02 || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, AnonymousClass0x2.A01(C18310x6.A09(this.A00), this.A02));
    }

    public AnonymousClass5S4(String str, Map map, boolean z) {
        this.A00 = str;
        this.A02 = z;
        this.A01 = map;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AIBotEmbodimentSentimentData(sentiment=");
        A0o.append(this.A00);
        A0o.append(", isDefault=");
        A0o.append(this.A02);
        A0o.append(", intensities=");
        return C18260x0.A04(this.A01, A0o);
    }
}
