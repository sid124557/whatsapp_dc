package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.5ig  reason: invalid class name and case insensitive filesystem */
public class C111785ig implements C184028r8 {
    public final /* synthetic */ C87614Tz A00;
    public final /* synthetic */ UserJid A01;

    public C111785ig(C87614Tz r1, UserJid userJid) {
        this.A00 = r1;
        this.A01 = userJid;
    }

    public void BT7(C151157Tq r3, int i) {
        if (406 == i) {
            this.A00.A0Q.A04(r3.A02);
        }
        this.A00.A0B.A0G(AnonymousClass001.A0s());
    }

    public void BT8(C151157Tq r5, C64553Dy r6) {
        C87614Tz r3 = this.A00;
        C55752qr r2 = r3.A0Q;
        UserJid userJid = this.A01;
        r2.A03(r6, userJid, true);
        r3.A0B.A0G(r2.A01(userJid, "catalog_category_dummy_root_id"));
    }
}
