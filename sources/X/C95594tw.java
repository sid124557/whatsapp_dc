package X;

import com.whatsapp.jid.UserJid;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.4tw  reason: invalid class name and case insensitive filesystem */
public final class C95594tw extends C67303Ot {
    public final C620433g A00;
    public final AnonymousClass7PB A01;

    public C95594tw(C56492s4 r14, C620433g r15, AnonymousClass33p r16, AnonymousClass7PB r17, AnonymousClass1VX r18, AnonymousClass28T r19, C183538qC r20, AnonymousClass4C1 r21, AnonymousClass4C1 r22) {
        super(r14, r16, r18, r19, r20, "WA|787118555984857|7bb1544a3599aa180ac9a3f7688ba243", (Map) null, r22, r21, 6529639947120031L);
        this.A01 = r17;
        this.A00 = r15;
        A06("/catalog");
    }

    public void A07(JSONObject jSONObject) {
        JSONObject A0l = AnonymousClass0x2.A0l(jSONObject);
        AnonymousClass7PB r4 = this.A01;
        UserJid userJid = r4.A01;
        C162457s7.A0C(userJid);
        A0l.put("jid", userJid.getRawString());
        A0l.put("product_id", r4.A04);
        A0l.put("width", String.valueOf(r4.A03));
        A0l.put("height", String.valueOf(r4.A02));
        A0l.put("catalog_session_id", r4.A05);
        if (r4.A06) {
            A0l.put("fetch_compliance_info", "true");
        }
        C52332lJ r0 = r4.A00;
        if (r0 != null) {
            AnonymousClass5V1.A01(r0, A0l);
        }
        AnonymousClass5V1.A00(this.A00, userJid, "product", jSONObject, A0l);
    }
}
