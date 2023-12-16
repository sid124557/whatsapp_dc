package X;

import java.util.List;

/* renamed from: X.7Yb  reason: invalid class name and case insensitive filesystem */
public final class C152227Yb {
    public int A00 = 0;
    public List A01;
    public final String A02;

    public C152227Yb(String str, List list) {
        this.A02 = str;
        this.A01 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C152227Yb) {
                C152227Yb r5 = (C152227Yb) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || this.A00 != r5.A00 || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, (C18310x6.A09(this.A02) + this.A00) * 31);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AIBotEmbodimentSentimentIntensityData(intensity=");
        A0o.append(this.A02);
        A0o.append(", videoIndex=");
        A0o.append(this.A00);
        A0o.append(", videos=");
        return C18260x0.A04(this.A01, A0o);
    }
}
