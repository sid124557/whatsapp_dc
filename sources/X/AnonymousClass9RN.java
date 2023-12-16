package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9RN  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9RN {
    public final /* synthetic */ C52792m3 A00;
    public final /* synthetic */ BrazilPayBloksActivity A01;
    public final /* synthetic */ Map A02;

    public final void A00(AnonymousClass9Q0 r17) {
        String str;
        BrazilPayBloksActivity brazilPayBloksActivity = this.A01;
        Map map = this.A02;
        C52792m3 r2 = this.A00;
        AnonymousClass9Q0 r5 = r17;
        if (r17 != null) {
            map.put("network_name", C133736hr.A02(r5.A00));
        }
        r2.A01("on_success", map);
        AnonymousClass9SD r1 = brazilPayBloksActivity.A0F;
        r1.A00 = r5;
        if (r17 == null || r5.A00 != 5 || (str = r5.A04) == null || !str.equals("0")) {
            r1.A0B.A08(r5);
            r1.A03 = false;
            return;
        }
        String str2 = r5.A06;
        if (str2 != null) {
            C620933l r52 = r1.A0E;
            String A0Z = C18280x3.A0Z(r52.A03(), "payment_trusted_device_elo_wallet_store");
            JSONObject jSONObject = null;
            if (A0Z != null) {
                try {
                    jSONObject = AnonymousClass0x9.A1H(A0Z);
                } catch (JSONException unused) {
                    r52.A02.A06("Failed to updated the wallet_id");
                }
            } else {
                jSONObject = AnonymousClass0x9.A1G();
            }
            jSONObject.put("wallet_id", str2);
            C18270x1.A0e(C620933l.A00(r52), jSONObject, "payment_trusted_device_elo_wallet_store");
        }
        C56612sH r7 = r1.A07;
        AnonymousClass9S7 r3 = new AnonymousClass9S7(r1.A08.A00, r1.A04, r1.A05, r7, r1.A0A, r1.A0C, r1.A0D, r1.A0E, r1.A0F, r1.A0G, new C193839Qg(r1), r1.A0H);
        AnonymousClass9VU r9 = r3.A09;
        C67993Rl A012 = r9.A01("ELO", "ADD-CARD");
        if (A012 == null) {
            new C194149Rt(r3.A00, r3.A01, r3.A06, r3.A08, r9, "ADD-CARD").A00(new C204899q6(r3, 0), "ELO");
            return;
        }
        r3.A00((AnonymousClass34V) null, A012);
    }

    public /* synthetic */ AnonymousClass9RN(C52792m3 r1, BrazilPayBloksActivity brazilPayBloksActivity, Map map) {
        this.A01 = brazilPayBloksActivity;
        this.A02 = map;
        this.A00 = r1;
    }
}
