package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1t5  reason: invalid class name and case insensitive filesystem */
public class C33451t5 extends AnonymousClass5ZM {
    public final C56602sG A00 = new AnonymousClass4H9(this, 0);
    public final /* synthetic */ C65193Go A01;
    public final /* synthetic */ C51972kg A02;
    public final /* synthetic */ C624134x A03;

    public C33451t5(C65193Go r3, C51972kg r4, C624134x r5) {
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C65193Go r5 = this.A01;
        C64773Ex r4 = r5.A0C;
        UserJid userJid = this.A02.A01;
        AnonymousClass3ZH A07 = r4.A07(userJid);
        if (A07 != null && A07.A0u) {
            return A07;
        }
        r5.A05.A0S(new C117645sG((Object) this, 47));
        C60982zU r1 = new C60982zU(AnonymousClass227.A05);
        r1.A02 = true;
        r1.A00 = C59812xW.A0F;
        r1.A07.add(userJid);
        AnonymousClass304 A012 = r5.A0E.A01(r1.A02());
        C18260x0.A1P(AnonymousClass001.A0o(), "onBusinessMessageAdded result = ", A012);
        if (A012 == AnonymousClass304.A03) {
            Log.e("Unable to fetch the verified name");
        }
        return r4.A07(userJid);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass3ZH r4 = (AnonymousClass3ZH) obj;
        if (r4 != null) {
            this.A02.A00 = r4;
            this.A01.A0S.A0C(this.A03, 38);
        }
    }
}
