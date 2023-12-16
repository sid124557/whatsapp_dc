package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.5OF  reason: invalid class name */
public final class AnonymousClass5OF {
    public final int A00;
    public final int A01;
    public final UserJid A02;
    public final boolean A03;
    public final boolean A04;

    public AnonymousClass5OF(C623534r r2, boolean z) {
        C162457s7.A0J(r2, 1);
        this.A04 = z;
        UserJid userJid = r2.A0A;
        C162457s7.A0D(userJid);
        this.A02 = userJid;
        this.A00 = r2.A02();
        this.A01 = r2.A03();
        this.A03 = r2.A0B();
    }

    public final boolean A00() {
        if (this.A00 <= 0 || this.A04 || this.A03) {
            return false;
        }
        return true;
    }
}
