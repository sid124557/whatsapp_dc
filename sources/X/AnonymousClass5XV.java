package X;

import java.util.List;

/* renamed from: X.5XV  reason: invalid class name */
public final class AnonymousClass5XV {
    public final C52882mC A00;
    public final C27991fJ A01;
    public final List A02;
    public final List A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5XV) {
                AnonymousClass5XV r5 = (AnonymousClass5XV) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A03, AnonymousClass000.A08(this.A02, ((AnonymousClass000.A07(this.A01) * 31) + C18310x6.A07(this.A00)) * 31));
    }

    public AnonymousClass5XV(C52882mC r1, C27991fJ r2, List list, List list2) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = list;
        this.A03 = list2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CommunityGroups(parent=");
        A0o.append(this.A01);
        A0o.append(", cag=");
        A0o.append(this.A00);
        A0o.append(", joinedSubgroups=");
        A0o.append(this.A02);
        A0o.append(", unJoinedSubgroups=");
        return C18260x0.A04(this.A03, A0o);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5XV() {
        /*
            r2 = this;
            r1 = 0
            X.3d3 r0 = X.C72023d3.A00
            r2.<init>(r1, r1, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5XV.<init>():void");
    }
}
