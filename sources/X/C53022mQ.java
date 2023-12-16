package X;

import com.whatsapp.jid.PhoneUserJid;
import java.util.Map;

/* renamed from: X.2mQ  reason: invalid class name and case insensitive filesystem */
public final class C53022mQ {
    public final C64773Ex A00;
    public final C55302q8 A01;
    public final C56662sM A02;
    public final AnonymousClass4FS A03;

    public final void A00(C27981fH r2, PhoneUserJid phoneUserJid) {
        C162457s7.A0J(r2, 0);
        A01(C57692u3.A04(r2, phoneUserJid));
    }

    public final void A02(Map map) {
        this.A03.BkV(C70133a0.A00(this, map, 2), "PrivacyPhoneNumberHidingHelper/updateLidPhoneMappingAndDisplayName");
    }

    public C53022mQ(C64773Ex r1, C55302q8 r2, C56662sM r3, AnonymousClass4FS r4) {
        C18260x0.A0c(r4, r1, r3, r2);
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void A01(Map map) {
        if (!map.isEmpty()) {
            this.A03.BkV(C70133a0.A00(this, map, 1), "PrivacyPhoneNumberHidingHelper/updateLidPhoneMapping");
        }
    }
}
