package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2ji  reason: invalid class name and case insensitive filesystem */
public final class C51372ji {
    public final C27991fJ A00;
    public final UserJid A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51372ji) {
                C51372ji r5 = (C51372ji) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, C18300x5.A04(this.A00));
    }

    public C51372ji(C27991fJ r1, UserJid userJid) {
        this.A00 = r1;
        this.A01 = userJid;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ActionContainer(groupJid=");
        A0o.append(this.A00);
        A0o.append(", creator=");
        return C18260x0.A04(this.A01, A0o);
    }
}
