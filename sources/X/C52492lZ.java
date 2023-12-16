package X;

import java.util.Set;

/* renamed from: X.2lZ  reason: invalid class name and case insensitive filesystem */
public final class C52492lZ {
    public final int A00;
    public final AnonymousClass4D3 A01;
    public final Set A02;

    public C52492lZ(AnonymousClass4D3 r2, Set set, int i) {
        C162457s7.A0J(set, 2);
        this.A00 = i;
        this.A02 = set;
        this.A01 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52492lZ) {
                C52492lZ r5 = (C52492lZ) obj;
                if (this.A00 != r5.A00 || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, AnonymousClass000.A08(this.A02, this.A00 * 31));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("StubMessageParserInfo(messageType=");
        A0o.append(this.A00);
        A0o.append(", stubTypes=");
        A0o.append(this.A02);
        A0o.append(", parser=");
        return C18260x0.A04(this.A01, A0o);
    }
}
