package X;

import java.util.List;

/* renamed from: X.2yq  reason: invalid class name and case insensitive filesystem */
public final class C60612yq {
    public final long A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60612yq) {
                C60612yq r8 = (C60612yq) obj;
                if (this.A00 != r8.A00 || !C162457s7.A0P(this.A01, r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, AnonymousClass0x2.A02(this.A00));
    }

    public C60612yq(List list, long j) {
        this.A00 = j;
        this.A01 = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ToSAcceptanceResponse(refreshRateMS=");
        A0o.append(this.A00);
        A0o.append(", userNotices=");
        return C18260x0.A04(this.A01, A0o);
    }

    public C60612yq() {
        this(C72023d3.A00, 864000000);
    }
}
