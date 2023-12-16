package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2kS  reason: invalid class name and case insensitive filesystem */
public final class C51832kS {
    public final UserJid A00;
    public final C45442a1 A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51832kS) {
                C51832kS r5 = (C51832kS) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, (C18300x5.A04(this.A00) + 1) * 31);
    }

    public C51832kS(UserJid userJid, C45442a1 r2) {
        this.A00 = userJid;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AdditionalEncryptedMessage(toJid=");
        A0o.append(this.A00);
        A0o.append(", encryptedMessageType=");
        A0o.append(1);
        A0o.append(", encryptedMessage=");
        return C18260x0.A04(this.A01, A0o);
    }
}
