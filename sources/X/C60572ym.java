package X;

import java.util.List;

/* renamed from: X.2ym  reason: invalid class name and case insensitive filesystem */
public final class C60572ym {
    public final C30461mU A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60572ym) {
                C60572ym r5 = (C60572ym) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, AnonymousClass000.A07(this.A00) * 31);
    }

    public C60572ym(C30461mU r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UiState(message=");
        A0o.append(this.A00);
        A0o.append(", responses=");
        return C18260x0.A04(this.A01, A0o);
    }

    public C60572ym() {
        this((C30461mU) null, AnonymousClass001.A0s());
    }
}
