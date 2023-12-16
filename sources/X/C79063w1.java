package X;

import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3w1  reason: invalid class name and case insensitive filesystem */
public final class C79063w1 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C55532qV this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79063w1(C55532qV r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        LinkedHashMap A0r = C18320x8.A0r();
        C56002rG r0 = this.this$0.A04;
        HashMap A0t = AnonymousClass001.A0t();
        String A0Z = C18280x3.A0Z(r0.A01(), "user_notices_metadata");
        if (A0Z != null) {
            try {
                JSONObject A1H = AnonymousClass0x9.A1H(A0Z);
                Iterator<String> keys = A1H.keys();
                while (keys.hasNext()) {
                    String A0m = AnonymousClass001.A0m(keys);
                    C622234e A00 = C622234e.A00(AnonymousClass0x9.A1H(A1H.get(A0m).toString()));
                    if (A00 == null || A00.A02 == 1) {
                        A0t.put(Integer.valueOf(A0m), A00);
                    } else {
                        A0t.put(Integer.valueOf(A0m), new C622234e(A00.A01, A00.A00, A00.A03, A00.A04, 1));
                    }
                }
            } catch (JSONException e) {
                Log.e("UserNoticeSharedPreferences/getUserNoticeMap/parsing failed", e);
            }
        }
        A0r.putAll(A0t);
        return A0r;
    }
}
