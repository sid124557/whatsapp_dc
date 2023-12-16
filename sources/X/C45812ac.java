package X;

import com.whatsapp.jid.DeviceJid;

/* renamed from: X.2ac  reason: invalid class name and case insensitive filesystem */
public final class C45812ac {
    public final C56972sr A00;
    public final AnonymousClass5IP A01;
    public final AnonymousClass3FH A02;
    public final AnonymousClass4FS A03;

    public final void A00(AnonymousClass3ZF r4) {
        if (!r4.A0E.A03) {
            if (r4.A0I != null) {
                DeviceJid deviceJid = r4.A0C;
                C56972sr r1 = this.A00;
                if ((!C162457s7.A0P(deviceJid, C56972sr.A03(r1)) && !C162457s7.A0P(deviceJid, r1.A0G())) || r4.A08().size() <= 1) {
                    return;
                }
            } else {
                return;
            }
        }
        if (r4.A07 == null) {
            this.A03.BkM(new C70183a5(this, 39, r4));
        }
    }

    public C45812ac(C56972sr r1, AnonymousClass5IP r2, AnonymousClass3FH r3, AnonymousClass4FS r4) {
        C18260x0.A0c(r4, r1, r3, r2);
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
