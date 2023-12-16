package X;

import java.util.Map;

/* renamed from: X.2n6  reason: invalid class name and case insensitive filesystem */
public final class C53442n6 {
    public final String A00;
    public final Map A01;
    public final Map A02;
    public final Map A03;
    public final Map A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53442n6) {
                C53442n6 r5 = (C53442n6) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || this.A05 != r5.A05 || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, AnonymousClass000.A08(this.A02, AnonymousClass000.A08(this.A04, AnonymousClass000.A08(this.A03, AnonymousClass0x2.A01(C18310x6.A09(this.A00), this.A05)))));
    }

    public C53442n6(String str, Map map, Map map2, Map map3, Map map4, boolean z) {
        this.A00 = str;
        this.A05 = z;
        this.A03 = map;
        this.A04 = map2;
        this.A02 = map3;
        this.A01 = map4;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Stats(codePathName=");
        A0o.append(this.A00);
        A0o.append(", hasDetailedStats=");
        A0o.append(this.A05);
        A0o.append(", readCounters=");
        A0o.append(this.A03);
        A0o.append(", writeCounters=");
        A0o.append(this.A04);
        A0o.append(", queryCounters=");
        A0o.append(this.A02);
        A0o.append(", mainThreadCounters=");
        return C18260x0.A04(this.A01, A0o);
    }
}
