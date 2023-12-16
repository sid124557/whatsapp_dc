package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1T5  reason: invalid class name */
public final class AnonymousClass1T5 extends AnonymousClass2GH {
    public final AnonymousClass20X A00;
    public final C95814uZ A01;
    public final UserJid A02;
    public final Long A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1T5(AnonymousClass20X r2, C95814uZ r3, UserJid userJid, Long l) {
        super(C370620u.USER);
        C18270x1.A11(userJid, 1, r2);
        this.A02 = userJid;
        this.A03 = l;
        this.A01 = r3;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass1T5) {
                AnonymousClass1T5 r5 = (AnonymousClass1T5) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, AnonymousClass000.A08(this.A01, (C18300x5.A04(this.A02) + AnonymousClass000.A07(this.A03)) * 31));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UserItem(userJid=");
        C18310x6.A1J(this.A02, A0o);
        A0o.append(this.A03);
        A0o.append(", chatJid=");
        A0o.append(this.A01);
        A0o.append(", role=");
        return C18260x0.A04(this.A00, A0o);
    }
}
