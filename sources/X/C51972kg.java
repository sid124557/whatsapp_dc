package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2kg  reason: invalid class name and case insensitive filesystem */
public final class C51972kg {
    public AnonymousClass3ZH A00;
    public final UserJid A01;

    public C51972kg(AnonymousClass3ZH r2, UserJid userJid) {
        C162457s7.A0J(userJid, 1);
        this.A01 = userJid;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51972kg) {
                C51972kg r5 = (C51972kg) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C18300x5.A04(this.A01) + AnonymousClass000.A07(this.A00);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BusinessMessageForwardInfo(businessOwnerJid=");
        A0o.append(this.A01);
        A0o.append(", businessOwnerContact=");
        return C18260x0.A04(this.A00, A0o);
    }
}
