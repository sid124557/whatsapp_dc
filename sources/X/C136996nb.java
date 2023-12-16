package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import org.json.JSONObject;

/* renamed from: X.6nb  reason: invalid class name and case insensitive filesystem */
public final class C136996nb extends AnonymousClass9OC {
    public final C69263Wi A00;
    public final C54292oU A01;
    public final C56662sM A02;
    public final AnonymousClass1VX A03;
    public final AnonymousClass31C A04;
    public final C40602Ha A05;
    public final AnonymousClass4FS A06;

    public static /* synthetic */ void A00(AnonymousClass39L r9, UserJid userJid, C184518rx r11, C136996nb r12, Long l, String str, String str2, String str3, String str4, String str5, String str6, JSONObject jSONObject) {
        String str7 = str4;
        C162457s7.A0J(str7, 6);
        r12.A01(r9, userJid, r11, l, str, str2, str3, str7, str5, str6, jSONObject);
    }

    public final void A01(AnonymousClass39L r19, UserJid userJid, C184518rx r21, Long l, String str, String str2, String str3, String str4, String str5, String str6, JSONObject jSONObject) {
        String str7;
        AnonymousClass39L r1 = r19;
        C35371wl r8 = new C35371wl(String.valueOf(r1.A00()), String.valueOf(r1.A00), ((AnonymousClass3H6) r1.A01).A04, 14);
        AnonymousClass31C r12 = this.A04;
        String A032 = r12.A03();
        UserJid A002 = C192819Ls.A00(this.A02, this.A03, userJid);
        C184518rx r2 = r21;
        if (A002 != null) {
            if (jSONObject != null) {
                str7 = jSONObject.toString();
            } else {
                str7 = null;
            }
            C35681xG r6 = new C35681xG(A002, r8, new C35371wl(A032, 12), l, str3, str, str2, str5, str6, str7, str4);
            C153607bd r11 = this.A00;
            if (r11 != null) {
                r11.A03("upi-get-p2m-checkout-session");
            }
            AnonymousClass36K r4 = r6.A00;
            C162457s7.A0D(r4);
            r12.A0D(new AnonymousClass907(this.A01.A00, this.A00, this.A05, r11, r2, r6), r4, A032, 204, 0);
            return;
        }
        Log.e("PAY: IndiaUpiGetP2mCheckoutSessionAction/getCheckoutSession: lidCompatibleJid is null");
        r2.BS6(new AnonymousClass34V());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C136996nb(C69263Wi r2, C54292oU r3, C56662sM r4, AnonymousClass1VX r5, AnonymousClass31C r6, AnonymousClass9U1 r7, C40602Ha r8, AnonymousClass9U5 r9, AnonymousClass4FS r10) {
        super(r7.A03(), r9);
        C18260x0.A0f(r5, r2, r3, r10, r6);
        C18260x0.A0W(r4, r8, r7);
        C162457s7.A0J(r9, 9);
        this.A03 = r5;
        this.A00 = r2;
        this.A01 = r3;
        this.A06 = r10;
        this.A04 = r6;
        this.A02 = r4;
        this.A05 = r8;
    }
}
