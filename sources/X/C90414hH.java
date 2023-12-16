package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.4hH  reason: invalid class name and case insensitive filesystem */
public final class C90414hH extends C134636jN {
    public final C620433g A00;
    public final AnonymousClass258 A01;
    public final C160157n8 A02;

    public void A07(JSONObject jSONObject) {
        JSONObject A0l = AnonymousClass0x2.A0l(jSONObject);
        C160157n8 r7 = this.A02;
        UserJid userJid = r7.A07;
        C162457s7.A0C(userJid);
        A0l.put("jid", userJid.getRawString());
        A0l.put("limit", String.valueOf(r7.A04));
        A0l.put("width", String.valueOf(r7.A06));
        A0l.put("height", String.valueOf(r7.A05));
        String str = r7.A08;
        if (str != null) {
            A0l.put("after", str);
        }
        String str2 = r7.A09;
        if (str2 != null) {
            A0l.put("catalog_session_id", str2);
        }
        if (Boolean.TRUE.equals(r7.A02)) {
            A0l.put("allow_shop_source", "ALLOWSHOPSOURCE_TRUE");
        }
        C42222Ng r6 = r7.A00;
        if (r6 != null) {
            JSONObject A1G = AnonymousClass0x9.A1G();
            A1G.put("value", r6.A00);
            A1G.put("version", r6.A01);
            A0l.put("query", A1G);
        }
        if (r7.A03) {
            A0l.put("skip_direct_connection_encrypted_info_check", true);
        }
        C52332lJ r0 = r7.A01;
        if (r0 != null) {
            AnonymousClass5V1.A01(r0, A0l);
        }
        AnonymousClass5V1.A02("product_catalog", this.A00.A07.A01(userJid), jSONObject, A0l, true);
    }

    public C90414hH(C56492s4 r11, C620433g r12, AnonymousClass258 r13, AnonymousClass33p r14, C160157n8 r15, AnonymousClass1VX r16, AnonymousClass28T r17, C183538qC r18, AnonymousClass4C1 r19, AnonymousClass4C1 r20) {
        super(r11, r14, r16, r17, r18, r19, r20, 6285325601582715L);
        this.A02 = r15;
        this.A00 = r12;
        this.A01 = r13;
    }
}
