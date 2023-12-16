package X;

import android.content.Context;
import android.content.Intent;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.9Au  reason: invalid class name and case insensitive filesystem */
public final class C191039Au extends C55212pz implements C202679mP, AnonymousClass4GA {
    public C56612sH A00;
    public C47062ce A01;
    public C195039Vq A02;
    public final AnonymousClass2E2 A03;
    public final C54292oU A04;

    public void AxJ(String str) {
        C162457s7.A0J(str, 0);
        this.A02 = new C195039Vq(this, C1899693i.A0V(this.A03.A00.A01), str);
    }

    public void A04() {
        C195039Vq r2 = this.A02;
        if (r2 == null) {
            throw C18270x1.A0S("activityResultManager");
        }
        r2.A01.A02(r2.A02).A03(r2);
    }

    public void A06(C53952nw r8, AnonymousClass4DK r9, C60752z6 r10, Map map) {
        AnonymousClass0PJ A002;
        if ((map.containsKey("app_to_app_partner_app_package") || map.containsKey("app_to_app_partner_intent_action")) && (A002 = AnonymousClass9UN.A00(C18310x6.A0o("app_to_app_partner_app_package", map), C18310x6.A0o("app_to_app_partner_intent_action", map))) != null) {
            HashMap hashMap = new HashMap(map);
            hashMap.put("app_to_app_partner_app_package", A002.A00);
            hashMap.put("app_to_app_partner_intent_action", A002.A01);
            map = hashMap;
        }
        Intent intent = new Intent("com.whatsapp.payments.phoenix.action.launch_activity_for_phoenix_result");
        Context context = this.A04.A00;
        intent.setPackage(context.getPackageName());
        intent.putExtra("app_to_app_partner_app_package", C18310x6.A0o("app_to_app_partner_app_package", map));
        intent.putExtra("app_to_app_partner_intent_action", C18310x6.A0o("app_to_app_partner_intent_action", map));
        intent.putExtra("app_to_app_request_payload", C18310x6.A0o("app_to_app_request_payload", map));
        context.sendBroadcast(intent);
        r9.BdH((Map) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C191039Au(AnonymousClass2E2 r1, C54292oU r2, AnonymousClass1j2 r3) {
        super(r3);
        C18260x0.A0V(r2, r1, r3);
        this.A04 = r2;
        this.A03 = r1;
    }

    public void A03() {
        super.A03();
        C195039Vq r3 = this.A02;
        if (r3 == null) {
            throw C18270x1.A0S("activityResultManager");
        }
        r3.A01.A02(r3.A02).A00(new C204149ot(r3, 1), C197959e9.class, r3);
    }

    public String A02() {
        return "br_verify_card_deeplink";
    }
}
