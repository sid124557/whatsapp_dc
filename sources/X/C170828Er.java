package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.8Er  reason: invalid class name and case insensitive filesystem */
public final class C170828Er implements C184098rF {
    public final C105405Uu A00;
    public final C184018r7 A01;
    public final C51202jR A02;

    public C170828Er(C105405Uu r2, C184018r7 r3, C51202jR r4) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
        this.A02 = r4;
        this.A01 = r3;
    }

    public void BT4(AnonymousClass7PB r4, String str) {
        C162457s7.A0J(str, 1);
        UserJid userJid = r4.A01;
        C162457s7.A0C(userJid);
        C109015dw A08 = this.A00.A08(userJid, str);
        if (A08 != null) {
            this.A01.BdC(this.A02, A08);
        } else {
            BT2(r4, 404);
        }
    }

    public void BT2(AnonymousClass7PB r3, int i) {
        this.A01.BSs(this.A02, i);
    }
}
