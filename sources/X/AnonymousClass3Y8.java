package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: X.3Y8  reason: invalid class name */
public final class AnonymousClass3Y8 implements C84314Bw {
    public C56982ss A00;

    public AnonymousClass3Y8(C56982ss r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public boolean AxE(AnonymousClass2PJ r7, C833648c r8, C833748d r9) {
        C52672lr r0;
        C162457s7.A0J(r9, 0);
        ArrayList A0s = AnonymousClass001.A0s();
        C41062Iu r02 = ((AnonymousClass3YL) r9).A06;
        if (r02 != null) {
            Map map = r02.A00;
            if (map.get("wa_push_psa_recently_joined_contacts_wids") != null) {
                JSONArray jSONArray = new JSONArray(C18310x6.A0o("wa_push_psa_recently_joined_contacts_wids", map));
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj = jSONArray.get(i);
                    C162457s7.A0K(obj, "null cannot be cast to non-null type kotlin.String");
                    UserJid A08 = AnonymousClass32Y.A08((String) obj);
                    if (A08 != null && !this.A00.A0L(A08)) {
                        A0s.add(A08);
                    }
                }
                if ((r8 instanceof AnonymousClass3Y7) && (r0 = ((AnonymousClass3Y7) r8).A00) != null) {
                    r0.A00 = A0s;
                }
                return AnonymousClass0x7.A1S(A0s);
            }
        }
        return false;
    }
}
