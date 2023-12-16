package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2lz  reason: invalid class name and case insensitive filesystem */
public final class C52752lz {
    public final long A00;
    public final C27991fJ A01;
    public final UserJid A02;
    public final UserJid A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52752lz) {
                C52752lz r8 = (C52752lz) obj;
                if (!C162457s7.A0P(this.A01, r8.A01) || !C162457s7.A0P(this.A02, r8.A02) || !C162457s7.A0P(this.A03, r8.A03) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x2.A00(AnonymousClass000.A08(this.A03, AnonymousClass000.A08(this.A02, C18300x5.A04(this.A01))), this.A00);
    }

    public C52752lz(C27991fJ r1, UserJid userJid, UserJid userJid2, long j) {
        C18260x0.A0V(r1, userJid, userJid2);
        this.A01 = r1;
        this.A02 = userJid;
        this.A03 = userJid2;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("NonAdminGJR(groupJid=");
        A0o.append(this.A01);
        A0o.append(", requestedByJid=");
        A0o.append(this.A02);
        A0o.append(", requestedForJid=");
        A0o.append(this.A03);
        A0o.append(", creationTimeMillis=");
        return C18270x1.A0U(A0o, this.A00);
    }
}
