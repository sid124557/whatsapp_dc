package X;

import java.util.List;

/* renamed from: X.5qv  reason: invalid class name and case insensitive filesystem */
public final class C116825qv implements AnonymousClass64C {
    public final C27991fJ A00;
    public final String A01;
    public final List A02;
    public final AnonymousClass66R A03 = C154517dI.A01(new C119325wn(this));

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C116825qv) {
                C116825qv r5 = (C116825qv) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A02, AnonymousClass000.A08(this.A00, C18310x6.A09(this.A01)));
    }

    public C116825qv(C27991fJ r2, String str, List list) {
        this.A01 = str;
        this.A00 = r2;
        this.A02 = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("RemoveCommunityParticipantsRequest(iqId=");
        A0o.append(this.A01);
        A0o.append(", parentGroupJid=");
        A0o.append(this.A00);
        A0o.append(", listOfUsers=");
        return C18260x0.A04(this.A02, A0o);
    }
}
