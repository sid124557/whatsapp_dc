package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2a8  reason: invalid class name and case insensitive filesystem */
public final class C45512a8 {
    public final AnonymousClass33p A00;
    public final AnonymousClass1VX A01;
    public final AnonymousClass31C A02;

    public final void A00(UserJid userJid) {
        C162457s7.A0J(userJid, 0);
        long j = AnonymousClass0x2.A0F(this.A00).getLong("pref_ctwa_ep_config_sync_last_time", 0);
        if (j != 0) {
            if (AnonymousClass0x9.A05(j) <= ((long) this.A01.A0O(C58422vE.A02, 6214))) {
                return;
            }
        }
        AnonymousClass31C r3 = this.A02;
        String A03 = r3.A03();
        C35721xK r2 = new C35721xK(new C35381wm(userJid, new C35381wm(A03, 5), 6));
        r3.A0K(new C35571x5(r2, new AnonymousClass2I7(this), 4), C41032Ir.A05(r2), A03, 437, C625635p.A0L);
    }

    public C45512a8(AnonymousClass33p r1, AnonymousClass1VX r2, AnonymousClass31C r3) {
        C18260x0.A0V(r3, r1, r2);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
