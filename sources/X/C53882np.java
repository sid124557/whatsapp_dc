package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.2np  reason: invalid class name and case insensitive filesystem */
public final class C53882np {
    public final C835248t A00;
    public final C835248t A01;
    public final C835248t A02;
    public final C835248t A03;
    public final String A04;
    public final Map A05;
    public final Set A06;
    public final boolean A07;
    public final boolean A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53882np) {
                C53882np r5 = (C53882np) obj;
                if (!C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A06, r5.A06) || !C162457s7.A0P(this.A05, r5.A05) || !C162457s7.A0P(this.A01, r5.A01) || this.A07 != r5.A07 || this.A08 != r5.A08) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A082 = (((((((((AnonymousClass000.A08(this.A00, C18310x6.A09(this.A04)) + AnonymousClass000.A07(this.A03)) * 31) + AnonymousClass000.A07(this.A02)) * 31) + AnonymousClass000.A07(this.A06)) * 31) + AnonymousClass000.A07(this.A05)) * 31) + C18310x6.A07(this.A01)) * 31;
        boolean z = this.A07;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (A082 + (z ? 1 : 0)) * 31;
        if (!this.A08) {
            i = 0;
        }
        return i2 + i;
    }

    public C53882np(C835248t r1, C835248t r2, C835248t r3, C835248t r4, String str, Map map, Set set, boolean z, boolean z2) {
        this.A04 = str;
        this.A00 = r1;
        this.A03 = r2;
        this.A02 = r3;
        this.A06 = set;
        this.A05 = map;
        this.A01 = r4;
        this.A07 = z;
        this.A08 = z2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ScopedBloksComponentQueryDefinition(id=");
        A0o.append(this.A04);
        A0o.append(", appIdExpression=");
        A0o.append(this.A00);
        A0o.append(", paramsExpression=");
        A0o.append(this.A03);
        A0o.append(", clientParamsExpression=");
        A0o.append(this.A02);
        A0o.append(", dependencies=");
        A0o.append(this.A06);
        A0o.append(", targets=");
        A0o.append(this.A05);
        A0o.append(", cacheTTLExpression=");
        A0o.append(this.A01);
        A0o.append(", isDiskCacheEnabled=");
        A0o.append(this.A07);
        A0o.append(", isScoped=");
        return C18260x0.A0A(A0o, this.A08);
    }
}
