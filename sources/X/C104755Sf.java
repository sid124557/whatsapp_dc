package X;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.5Sf  reason: invalid class name and case insensitive filesystem */
public final class C104755Sf {
    public int A00;
    public final AnonymousClass7Y3 A01;
    public final AnonymousClass7QA A02;
    public final String A03;
    public final Set A04;

    public /* synthetic */ C104755Sf(AnonymousClass7Y3 r5, String str, int i) {
        AnonymousClass7QA r2 = null;
        LinkedHashSet A17 = (i & 4) != 0 ? AnonymousClass0x9.A17() : null;
        r5 = (i & 8) != 0 ? null : r5;
        r2 = (i & 16) != 0 ? new AnonymousClass7UR().A00() : r2;
        C18260x0.A0R(str, A17);
        C162457s7.A0J(r2, 5);
        this.A03 = str;
        this.A00 = 0;
        this.A04 = A17;
        this.A01 = r5;
        this.A02 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C104755Sf) {
                C104755Sf r5 = (C104755Sf) obj;
                if (!C162457s7.A0P(this.A03, r5.A03) || this.A00 != r5.A00 || !C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Set set = this.A04;
        return AnonymousClass002.A02(this.A02, (AnonymousClass000.A08(set, (C18310x6.A09(this.A03) + this.A00) * 31) + AnonymousClass000.A07(this.A01)) * 31);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("TextSearchResult(query=");
        A0o.append(this.A03);
        A0o.append(", statusCode=");
        A0o.append(this.A00);
        A0o.append(", fulfilledRequests=");
        A0o.append(this.A04);
        A0o.append(", recentSearch=");
        A0o.append(this.A01);
        A0o.append(", response=");
        return C18260x0.A04(this.A02, A0o);
    }
}
