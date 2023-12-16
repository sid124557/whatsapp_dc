package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9Up  reason: invalid class name and case insensitive filesystem */
public class C194819Up {
    public final List A00 = AnonymousClass001.A0s();
    public final List A01 = AnonymousClass001.A0s();
    public final List A02 = AnonymousClass001.A0s();
    public final boolean A03;

    public C194819Up(AnonymousClass1VX r5) {
        this.A03 = r5.A0X(5480);
        String A0Q = r5.A0Q(5481);
        if (!TextUtils.isEmpty(A0Q)) {
            try {
                JSONObject A1H = AnonymousClass0x9.A1H(A0Q);
                List<C198169eU> A002 = A00(A1H.optJSONArray("merchant_list"));
                Collections.sort(A002);
                for (C198169eU r0 : A002) {
                    this.A00.add(r0.A01);
                }
                List<C198169eU> A003 = A00(A1H.optJSONArray("explore_merchants"));
                Collections.sort(A003);
                for (C198169eU r02 : A003) {
                    this.A02.add(r02.A01);
                }
                List<C198169eU> A004 = A00(A1H.optJSONArray("chat_with_merchants"));
                Collections.sort(A004);
                for (C198169eU r03 : A004) {
                    this.A01.add(r03.A01);
                }
            } catch (JSONException unused) {
                Log.e("PaymentMerchantServerExperimentData/getServerMerchantList can't construct from abprops");
            }
        }
    }

    public static final List A00(JSONArray jSONArray) {
        ArrayList A0s = AnonymousClass001.A0s();
        if (jSONArray != null) {
            int i = 0;
            while (i < jSONArray.length()) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    C198169eU r2 = new C198169eU();
                    String optString = jSONObject.optString("merchant_number");
                    r2.A01 = optString;
                    if (!TextUtils.isEmpty(optString)) {
                        r2.A00 = jSONObject.optInt("rank", -1);
                        A0s.add(r2);
                    }
                    i++;
                } catch (JSONException unused) {
                    Log.e("PaymentMerchantServerExperimentData/getServerMerchantList can't construct merchant list");
                }
            }
        }
        return A0s;
    }
}
