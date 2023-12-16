package X;

import java.util.List;

/* renamed from: X.6lu  reason: invalid class name and case insensitive filesystem */
public final class C136136lu extends C136186lz {
    public final AnonymousClass5ZO A00;
    public final C147127Cx A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136136lu) {
                C136136lu r5 = (C136136lu) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, AnonymousClass000.A08(this.A02, C18300x5.A04(this.A00)));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C136136lu(AnonymousClass5ZO r2, C147127Cx r3, List list) {
        super(46);
        C18260x0.A0R(r2, r3);
        this.A00 = r2;
        this.A02 = list;
        this.A01 = r3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("NearbyBusinessWidgetListItemData(searchLocation=");
        A0o.append(this.A00);
        A0o.append(", businessProfiles=");
        A0o.append(this.A02);
        A0o.append(", nearbyBusinessClickListener=");
        return C18260x0.A04(this.A01, A0o);
    }
}
