package com.whatsapp.bonsai.sync.discovery;

import X.AnonymousClass0x2;
import X.AnonymousClass31K;
import X.AnonymousClass3EL;
import X.AnonymousClass3EN;
import X.AnonymousClass3Z6;
import X.AnonymousClass4E1;
import X.C162457s7;
import X.C18310x6;
import X.C35821xU;
import X.C52822m6;
import X.C72023d3;
import com.whatsapp.jid.UserJid;
import java.util.List;
import org.json.JSONObject;

public final class DiscoveryBotsSerializer implements AnonymousClass4E1 {
    public static final DiscoveryBotsSerializer A00 = new DiscoveryBotsSerializer();

    /* renamed from: A00 */
    public DiscoveryBots B3b(AnonymousClass3Z6 r11) {
        C52822m6 r4;
        C162457s7.A0J(r11, 0);
        C35821xU r0 = (C35821xU) r11.first;
        C162457s7.A0J(r0, 0);
        UserJid userJid = (UserJid) r0.A00;
        C72023d3 r7 = C72023d3.A00;
        String str = r0.A05;
        if (userJid == null) {
            r4 = null;
        } else {
            r4 = new C52822m6(userJid, str, r7, 0);
        }
        List A002 = AnonymousClass31K.A00(AnonymousClass3EL.A00, (List) ((C35821xU) r11.first).A03);
        long A0B = C18310x6.A0B(r11.second);
        if (r4 != null) {
            return new DiscoveryBots(r4, A002, A0B);
        }
        return null;
    }

    /* renamed from: A01 */
    public DiscoveryBots B3a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C52822m6 A01 = AnonymousClass3EN.A00.B3a(jSONObject.optJSONObject("default_bot"));
        List A012 = AnonymousClass31K.A01(AnonymousClass3EL.A00, jSONObject.optJSONArray("sections"));
        long optLong = jSONObject.optLong("timestamp_ms");
        if (A01 != null) {
            return new DiscoveryBots(A01, A012, optLong);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ JSONObject Bqt(Object obj) {
        DiscoveryBots discoveryBots = (DiscoveryBots) obj;
        JSONObject A0l = AnonymousClass0x2.A0l(discoveryBots);
        A0l.put("default_bot", AnonymousClass3EN.A00(discoveryBots.A01));
        A0l.put("sections", AnonymousClass31K.A02(AnonymousClass3EL.A00, discoveryBots.A02));
        A0l.put("timestamp_ms", discoveryBots.A00);
        return A0l;
    }
}
