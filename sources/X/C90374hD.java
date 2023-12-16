package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.4hD  reason: invalid class name and case insensitive filesystem */
public final class C90374hD extends C134636jN {
    public final C620433g A00;
    public final C148077Gv A01;

    public void A07(JSONObject jSONObject) {
        C162457s7.A0J(jSONObject, 0);
        JSONObject A1G = AnonymousClass0x9.A1G();
        C148077Gv r6 = this.A01;
        UserJid userJid = r6.A00;
        JSONObject A0z = C18300x5.A0z(userJid.getRawString(), "biz_jid", A1G);
        A0z.put("width", 100);
        A0z.put("height", 100);
        A1G.put("image_dimensions", A0z);
        String str = r6.A01;
        if (str != null) {
            A1G.put("catalog_session_id", str);
        }
        AnonymousClass5V1.A02("promotions", this.A00.A07.A01(userJid), jSONObject, A1G, false);
    }

    public C90374hD(C56492s4 r11, C620433g r12, C148077Gv r13, AnonymousClass33p r14, AnonymousClass1VX r15, AnonymousClass28T r16, C183538qC r17, AnonymousClass4C1 r18, AnonymousClass4C1 r19) {
        super(r11, r14, r15, r16, r17, r18, r19, 6822474477840363L);
        this.A01 = r13;
        this.A00 = r12;
    }
}
