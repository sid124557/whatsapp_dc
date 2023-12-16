package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.4hE  reason: invalid class name and case insensitive filesystem */
public final class C90384hE extends C134636jN {
    public final C620433g A00;
    public final C151157Tq A01;

    public void A07(JSONObject jSONObject) {
        C162457s7.A0J(jSONObject, 0);
        C151157Tq r10 = this.A01;
        UserJid userJid = r10.A02;
        C162457s7.A0C(userJid);
        JSONObject A1G = AnonymousClass0x9.A1G();
        A1G.put("width", r10.A01);
        A1G.put("height", r10.A00);
        JSONObject A1G2 = AnonymousClass0x9.A1G();
        A1G2.put("biz_jid", userJid.getRawString());
        A1G2.put("image_dimensions", A1G);
        Set set = r10.A04;
        if (C18310x6.A1X(set)) {
            ArrayList A0J = AnonymousClass002.A0J(set);
            JSONArray A1F = AnonymousClass0x9.A1F();
            int size = A0J.size();
            for (int i = 0; i < size; i++) {
                JSONObject A1G3 = AnonymousClass0x9.A1G();
                A1G3.put("category_id", A0J.get(i));
                A1F.put(A1G3);
            }
            A1G2.put("category_ids", A1F);
        }
        A1G2.put("catalog_session_id", r10.A03);
        AnonymousClass5V1.A00(this.A00, userJid, "categories", jSONObject, A1G2);
    }

    public C90384hE(C56492s4 r11, C620433g r12, C151157Tq r13, AnonymousClass33p r14, AnonymousClass1VX r15, AnonymousClass28T r16, C183538qC r17, AnonymousClass4C1 r18, AnonymousClass4C1 r19) {
        super(r11, r14, r15, r16, r17, r18, r19, 4761338647311214L);
        this.A00 = r12;
        this.A01 = r13;
    }
}
