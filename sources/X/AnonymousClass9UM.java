package X;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableString;
import com.whatsapp.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.9UM  reason: invalid class name */
public class AnonymousClass9UM {
    public static final C195339Xj A00(Context context, List list) {
        C85184Fg r0;
        if (list == null || list.size() <= 0) {
            return null;
        }
        AnonymousClass394 r2 = (AnonymousClass394) list.get(0);
        if (!r2.A01.equals("payment_link") || (r0 = r2.A00) == null) {
            return null;
        }
        String A0X = AnonymousClass0x2.A0X(context, Uri.parse(((AnonymousClass3SP) r0).A02).getHost(), 1, R.string.f11nameremoved);
        String string = context.getString(R.string.f11nameremoved);
        return new C195339Xj(new C51872kW((SpannableString) null, false), new C51882kX((SpannableString) null, false), new C51892kY((SpannableString) null, false), "checkout_lite", A0X, "", string, 0);
    }

    public static Map A01(Context context, C56952sp r2, List list) {
        Map A02 = A02(r2.A0Q(1767));
        C195339Xj A00 = A00(context, list);
        if (A00 != null) {
            A02.put("checkout_lite", A00);
        }
        return A02;
    }

    public static final Map A02(String str) {
        HashMap A0t = AnonymousClass001.A0t();
        if (str != null) {
            try {
                JSONArray jSONArray = AnonymousClass0x9.A1H(str).getJSONArray("payment_options");
                for (int i = 0; i < jSONArray.length(); i++) {
                    C195339Xj r1 = new C195339Xj(jSONArray.getJSONObject(i));
                    A0t.put(r1.A0A, r1);
                }
            } catch (JSONException e) {
                C18260x0.A16("OrderDetailsPaymentOptions/parseOptions failed to parse payment options json: ", AnonymousClass001.A0o(), e);
            }
        }
        return A0t;
    }
}
