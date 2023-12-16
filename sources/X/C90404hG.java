package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.4hG  reason: invalid class name and case insensitive filesystem */
public final class C90404hG extends C134636jN {
    public final C620433g A00;
    public final AnonymousClass5TG A01;

    public void A07(JSONObject jSONObject) {
        JSONObject A0l = AnonymousClass0x2.A0l(jSONObject);
        AnonymousClass5TG r4 = this.A01;
        UserJid userJid = r4.A04;
        A0l.put("biz_jid", userJid.getRawString());
        A0l.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r4.A06);
        A0l.put("limit", r4.A01);
        A0l.put("width", r4.A02);
        A0l.put("height", r4.A00);
        A0l.put("is_category", r4.A08);
        String str = r4.A07;
        if (str != null) {
            A0l.put("catalog_session_id", str);
        }
        String str2 = r4.A05;
        if (str2 != null) {
            A0l.put("after", str2);
        }
        if (r4.A09) {
            A0l.put("skip_direct_connection_encrypted_info_check", true);
        }
        C52332lJ r0 = r4.A03;
        if (r0 != null) {
            AnonymousClass5V1.A01(r0, A0l);
        }
        AnonymousClass5V1.A00(this.A00, userJid, "collection", jSONObject, A0l);
    }

    public C90404hG(C56492s4 r11, C620433g r12, AnonymousClass5TG r13, AnonymousClass33p r14, AnonymousClass1VX r15, AnonymousClass28T r16, C183538qC r17, AnonymousClass4C1 r18, AnonymousClass4C1 r19) {
        super(r11, r14, r15, r16, r17, r18, r19, 9507656222642921L);
        this.A01 = r13;
        this.A00 = r12;
    }
}
