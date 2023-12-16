package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* renamed from: X.3sO  reason: invalid class name and case insensitive filesystem */
public final class C76813sO extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AnonymousClass30S this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76813sO(AnonymousClass30S r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass30S r0 = this.this$0;
        LinkedHashMap A0r = C18320x8.A0r();
        String A0R = r0.A04.A0R(C58422vE.A02, 1320);
        if (A0R != null) {
            try {
                JSONObject A1H = AnonymousClass0x9.A1H(A0R);
                Iterator<String> keys = A1H.keys();
                C162457s7.A0D(keys);
                Iterator it = C829345m.A04(new AnonymousClass41B(A1H), C829545o.A06(keys)).iterator();
                while (it.hasNext()) {
                    JSONObject optJSONObject = A1H.optJSONObject(AnonymousClass001.A0m(it));
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("app_id");
                        String optString2 = optJSONObject.optString("version", "");
                        C162457s7.A0H(optString);
                        C162457s7.A0H(optString2);
                        A0r.put(optString, optString2);
                    }
                }
            } catch (Throwable th) {
                AnonymousClass3Z0.A01(th);
            }
        }
        return A0r;
    }
}
