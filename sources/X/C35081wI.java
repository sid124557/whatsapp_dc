package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1wI  reason: invalid class name and case insensitive filesystem */
public final class C35081wI extends C41022Iq implements C84254Bq {
    public final UserJid A00;

    public void Aw1(AnonymousClass2N7 r5) {
        C41122Ja r3 = new C41122Ja(this.A00, (String) null);
        r5.A02.element = new C41142Jc(r3, C162457s7.A0P(r5.A01, "unblock") ? 1 : 0);
    }

    public C35081wI(AnonymousClass36K r9) {
        AnonymousClass36K r1 = r9;
        this.A00 = (UserJid) C626836d.A06(r1, UserJid.class, AnonymousClass0x2.A0R(), AnonymousClass0x2.A0S(), (Object) null, new String[]{"biz_opt_out_jid"}, false);
        this.A00 = r9;
    }
}
