package X;

import java.util.Map;

/* renamed from: X.7ZL  reason: invalid class name */
public final class AnonymousClass7ZL {
    public C996857p A00;
    public final String A01;
    public final Map A02;
    public final Map A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7ZL) {
                AnonymousClass7ZL r5 = (AnonymousClass7ZL) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02) || this.A00 != r5.A00 || !C162457s7.A0P(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A03, AnonymousClass000.A08(this.A00, (C18310x6.A09(this.A01) + AnonymousClass000.A07(this.A02)) * 31));
    }

    public AnonymousClass7ZL(C996857p r1, String str, Map map, Map map2) {
        this.A01 = str;
        this.A02 = map;
        this.A00 = r1;
        this.A03 = map2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("StateData(stateName=");
        A0o.append(this.A01);
        A0o.append(", input=");
        A0o.append(this.A02);
        A0o.append(", status=");
        A0o.append(this.A00);
        A0o.append(", resumableBloksData=");
        return C18260x0.A04(this.A03, A0o);
    }
}
