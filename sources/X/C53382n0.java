package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2n0  reason: invalid class name and case insensitive filesystem */
public final class C53382n0 {
    public final long A00;
    public final C27991fJ A01;
    public final C27991fJ A02;
    public final UserJid A03;
    public final UserJid A04;
    public final String A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53382n0) {
                C53382n0 r8 = (C53382n0) obj;
                if (!C162457s7.A0P(this.A01, r8.A01) || !C162457s7.A0P(this.A04, r8.A04) || this.A00 != r8.A00 || !C162457s7.A0P(this.A05, r8.A05) || !C162457s7.A0P(this.A02, r8.A02) || !C162457s7.A0P(this.A03, r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass0x2.A07(this.A05, AnonymousClass000.A00(AnonymousClass000.A08(this.A04, C18300x5.A04(this.A01)), this.A00)) + AnonymousClass000.A07(this.A02)) * 31) + C18310x6.A07(this.A03);
    }

    public C53382n0(C27991fJ r2, C27991fJ r3, UserJid userJid, UserJid userJid2, String str, long j) {
        C18260x0.A0Q(r2, userJid);
        C162457s7.A0J(str, 4);
        this.A01 = r2;
        this.A04 = userJid;
        this.A00 = j;
        this.A05 = str;
        this.A02 = r3;
        this.A03 = userJid2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("GroupMembershipApprovalRequest(groupJid=");
        A0o.append(this.A01);
        A0o.append(", requesterJid=");
        A0o.append(this.A04);
        A0o.append(", creationTimeMillis=");
        A0o.append(this.A00);
        A0o.append(", requestMethod=");
        A0o.append(this.A05);
        A0o.append(", parentGroupJid=");
        A0o.append(this.A02);
        A0o.append(", requestedByJid=");
        return C18260x0.A04(this.A03, A0o);
    }
}
