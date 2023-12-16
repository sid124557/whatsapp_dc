package X;

import java.util.Map;

/* renamed from: X.2kM  reason: invalid class name and case insensitive filesystem */
public final class C51772kM {
    public final Map A00;
    public final Map A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51772kM) {
                C51772kM r5 = (C51772kM) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, C18300x5.A04(this.A01));
    }

    public C51772kM(Map map, Map map2) {
        this.A01 = map;
        this.A00 = map2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MessageRanks(individualRanks=");
        A0o.append(this.A01);
        A0o.append(", groupRanks=");
        return C18260x0.A04(this.A00, A0o);
    }
}
