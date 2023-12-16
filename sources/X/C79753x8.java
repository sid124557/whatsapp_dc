package X;

import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* renamed from: X.3x8  reason: invalid class name and case insensitive filesystem */
public final class C79753x8 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C60092xz this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79753x8(C60092xz r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Object obj;
        AnonymousClass1VX r1 = this.this$0.A00;
        LinkedHashMap A0r = C18320x8.A0r();
        try {
            JSONObject A1H = AnonymousClass0x9.A1H(C56952sp.A08(r1, 1320));
            Iterator<String> keys = A1H.keys();
            C162457s7.A0D(keys);
            Iterator it = C829345m.A04(new AnonymousClass43O(A1H), C829545o.A06(keys)).iterator();
            while (it.hasNext()) {
                String A0m = AnonymousClass001.A0m(it);
                JSONObject optJSONObject = A1H.optJSONObject(A0m);
                C162457s7.A0H(optJSONObject);
                String optString = optJSONObject.optString("app_id");
                boolean optBoolean = optJSONObject.optBoolean("enabled", true);
                long A06 = C18320x8.A06("expiration_secs", optJSONObject);
                String optString2 = optJSONObject.optString("version", "");
                C162457s7.A0H(A0m);
                A0r.put(A0m, new AnonymousClass9PF(A06, optString, optBoolean, optString2));
            }
            obj = C59022wD.A00;
        } catch (Throwable th) {
            obj = AnonymousClass3Z0.A01(th);
        }
        Throwable A00 = AnonymousClass3Z9.A00(obj);
        if (A00 != null) {
            Log.d(AnonymousClass000.A0a("CommerceBloksAppIdMapper/initBloksIds ", AnonymousClass001.A0o(), A00));
        }
        return A0r;
    }
}
