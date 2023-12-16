package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.5SQ  reason: invalid class name */
public final class AnonymousClass5SQ {
    public final int A00;
    public final UserJid A01;
    public final boolean A02;
    public final boolean A03;

    public AnonymousClass5SQ(UserJid userJid, int i, boolean z, boolean z2) {
        C162457s7.A0J(userJid, 1);
        this.A01 = userJid;
        this.A03 = z;
        this.A00 = i;
        this.A02 = z2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5SQ) {
                AnonymousClass5SQ r5 = (AnonymousClass5SQ) obj;
                if (!(C162457s7.A0P(this.A01, r5.A01) && this.A03 == r5.A03 && this.A00 == r5.A00 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00((((AnonymousClass0x2.A01(C18300x5.A04(this.A01), this.A03) + this.A00) * 31) + 1237) * 31, this.A02);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ParticipantListInfo(jid=");
        A0o.append(this.A01);
        A0o.append(", pendingJoin=");
        A0o.append(this.A03);
        A0o.append(", state=");
        A0o.append(this.A00);
        A0o.append(", isSelf=");
        A0o.append(false);
        A0o.append(", isInvitedBySelf=");
        return C18260x0.A0A(A0o, this.A02);
    }
}
