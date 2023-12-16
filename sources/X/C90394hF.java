package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.4hF  reason: invalid class name and case insensitive filesystem */
public final class C90394hF extends C134636jN {
    public final C620433g A00;
    public final AnonymousClass7PS A01;

    public void A07(JSONObject jSONObject) {
        JSONObject A0l = AnonymousClass0x2.A0l(jSONObject);
        AnonymousClass7PS r4 = this.A01;
        UserJid userJid = r4.A05;
        A0l.put("biz_jid", userJid.getRawString());
        A0l.put("collection_limit", r4.A01);
        A0l.put("item_limit", 3);
        A0l.put("width", r4.A03);
        A0l.put("height", r4.A02);
        String str = r4.A07;
        if (str != null) {
            A0l.put("catalog_session_id", str);
        }
        String str2 = r4.A06;
        if (str2 != null) {
            A0l.put("after", str2);
        }
        C52332lJ r0 = r4.A00;
        if (r0 != null) {
            AnonymousClass5V1.A01(r0, A0l);
        }
        AnonymousClass5V1.A00(this.A00, userJid, "collections", jSONObject, A0l);
    }

    public C90394hF(C56492s4 r11, C620433g r12, AnonymousClass7PS r13, AnonymousClass33p r14, AnonymousClass1VX r15, AnonymousClass28T r16, C183538qC r17, AnonymousClass4C1 r18, AnonymousClass4C1 r19) {
        super(r11, r14, r15, r16, r17, r18, r19, 6525934317460326L);
        this.A01 = r13;
        this.A00 = r12;
    }
}
