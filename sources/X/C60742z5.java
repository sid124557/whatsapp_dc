package X;

import java.util.Map;

/* renamed from: X.2z5  reason: invalid class name and case insensitive filesystem */
public final class C60742z5 {
    public static final C59832xZ A03 = new C59832xZ();
    public final Map A00;
    public final Map A01;
    public final Map A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60742z5) {
                C60742z5 r5 = (C60742z5) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, AnonymousClass000.A08(this.A00, C18300x5.A04(this.A02)));
    }

    public C60742z5(Map map, Map map2, Map map3) {
        this.A02 = map;
        this.A00 = map2;
        this.A01 = map3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ExtensionCompatibility(welj=");
        A0o.append(this.A02);
        A0o.append(", dataChannel=");
        A0o.append(this.A00);
        A0o.append(", flowMessage=");
        return C18260x0.A04(this.A01, A0o);
    }
}
