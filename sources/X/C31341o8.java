package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1o8  reason: invalid class name and case insensitive filesystem */
public class C31341o8 extends C30341mI {
    public UserJid A00;
    public UserJid A01;
    public transient long A02;
    public transient C55682qk A03;

    public void A1w(UserJid userJid) {
        if (this.A03 != null && (userJid == null || C627336j.A0L(userJid))) {
            this.A03.A0A("InvalidNumberChangeJid", true, AnonymousClass000.A0P(userJid, "newJid = ", AnonymousClass001.A0o()));
        }
        this.A00 = userJid;
    }

    public C31341o8(AnonymousClass2z0 r1, int i, long j) {
        super(r1, i, j);
    }
}
