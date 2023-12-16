package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2lC  reason: invalid class name and case insensitive filesystem */
public final class C52262lC {
    public final C27991fJ A00;
    public final C27991fJ A01;
    public final UserJid A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52262lC) {
                C52262lC r5 = (C52262lC) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A00, C18300x5.A04(this.A01)) + AnonymousClass000.A07(this.A02);
    }

    public C52262lC(C27991fJ r1, C27991fJ r2, UserJid userJid) {
        C18260x0.A0Q(r1, r2);
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = userJid;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SubgroupSuggestionKey(parentGroupJid=");
        A0o.append(this.A01);
        A0o.append(", groupJid=");
        A0o.append(this.A00);
        A0o.append(", creatorJid=");
        return C18260x0.A04(this.A02, A0o);
    }
}
