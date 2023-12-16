package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.4hI  reason: invalid class name and case insensitive filesystem */
public final class C90424hI extends C134636jN {
    public final C620433g A00;
    public final C60852zH A01;
    public final String A02;

    public void A07(JSONObject jSONObject) {
        JSONObject A0l = AnonymousClass0x2.A0l(jSONObject);
        C60852zH r5 = this.A01;
        UserJid userJid = r5.A01;
        A0l.put("jid", userJid.getRawString());
        JSONArray A1F = AnonymousClass0x9.A1F();
        for (Object next : r5.A04) {
            JSONObject A1G = AnonymousClass0x9.A1G();
            A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, next);
            A1F.put(A1G);
        }
        A0l.put("products", A1F);
        A0l.put("width", r5.A03);
        A0l.put("height", r5.A02);
        String str = this.A02;
        if (str != null) {
            A0l.put("catalog_session_id", str);
        }
        C52332lJ r0 = r5.A00;
        if (r0 != null) {
            AnonymousClass5V1.A01(r0, A0l);
        }
        AnonymousClass5V1.A00(this.A00, userJid, "product_list", jSONObject, A0l);
    }

    public C90424hI(C56492s4 r12, C620433g r13, C60852zH r14, AnonymousClass33p r15, AnonymousClass1VX r16, AnonymousClass28T r17, C183538qC r18, String str, AnonymousClass4C1 r20, AnonymousClass4C1 r21) {
        super(r12, r15, r16, r17, r18, r20, r21, 6300966313316846L);
        this.A01 = r14;
        this.A00 = r13;
        this.A02 = str;
    }
}
