package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4x7  reason: invalid class name and case insensitive filesystem */
public final class C96864x7 extends AnonymousClass5BN {
    public final long A00;
    public final UserJid A01;

    public C96864x7(UserJid userJid, long j) {
        C162457s7.A0J(userJid, 1);
        this.A01 = userJid;
        this.A00 = j;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C96864x7) {
                C96864x7 r8 = (C96864x7) obj;
                if (!C162457s7.A0P(this.A01, r8.A01) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x2.A00(C18300x5.A04(this.A01), this.A00);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Success(user=");
        A0o.append(this.A01);
        A0o.append(", expirationTimestamp=");
        return C18270x1.A0U(A0o, this.A00);
    }
}
