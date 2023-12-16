package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.6dB  reason: invalid class name and case insensitive filesystem */
public final class C131186dB extends AnonymousClass7RT {
    public final AnonymousClass7r0 A00;
    public final C160367nW A01;
    public final List A02;
    public final Map A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C131186dB) {
                C131186dB r5 = (C131186dB) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final AnonymousClass7r0 A01() {
        return this.A00;
    }

    public final List A02() {
        return this.A02;
    }

    public final Map A03() {
        return this.A03;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, AnonymousClass000.A08(this.A03, AnonymousClass000.A08(this.A02, C18300x5.A04(this.A00))));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C131186dB(AnonymousClass7r0 r3, C160367nW r4) {
        super(r4);
        C18260x0.A0Q(r3, r4);
        C72023d3 r1 = C72023d3.A00;
        Map A0A = C73813g7.A0A();
        this.A00 = r3;
        this.A02 = r1;
        this.A03 = A0A;
        this.A01 = r4;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Success(data=");
        A0o.append(this.A00);
        A0o.append(", actions=");
        A0o.append(this.A02);
        A0o.append(", externalVariables=");
        A0o.append(this.A03);
        A0o.append(", fetchSummaryData=");
        return C18260x0.A04(this.A01, A0o);
    }
}
