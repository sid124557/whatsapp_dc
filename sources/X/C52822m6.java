package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.2m6  reason: invalid class name and case insensitive filesystem */
public final class C52822m6 {
    public final long A00;
    public final UserJid A01;
    public final String A02;
    public final List A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52822m6) {
                C52822m6 r8 = (C52822m6) obj;
                if (!C162457s7.A0P(this.A01, r8.A01) || this.A00 != r8.A00 || !C162457s7.A0P(this.A03, r8.A03) || !C162457s7.A0P(this.A02, r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A03, AnonymousClass000.A00(C18300x5.A04(this.A01), this.A00)) + C18270x1.A00(this.A02);
    }

    public C52822m6(UserJid userJid, String str, List list, long j) {
        this.A01 = userJid;
        this.A00 = j;
        this.A03 = list;
        this.A02 = str;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Bot(jid=");
        A0o.append(this.A01);
        A0o.append(", count=");
        A0o.append(this.A00);
        A0o.append(", themes=");
        A0o.append(this.A03);
        A0o.append(", personaId=");
        return C18260x0.A07(this.A02, A0o);
    }
}
