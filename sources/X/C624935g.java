package X;

import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.35g  reason: invalid class name and case insensitive filesystem */
public final class C624935g {
    public static final Map A00;
    public static final Map A01;
    public static final Map A02;
    public static final Map A03;
    public static final Map A04;

    public static Integer A00(AnonymousClass1VX r4, String str) {
        Pair pair;
        Map map;
        Object obj = null;
        if (str == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            pair = null;
        } else {
            try {
                JSONObject A1H = AnonymousClass0x9.A1H(str);
                pair = AnonymousClass0x9.A0C(A1H.getString("payment_method"), Long.valueOf(A1H.getLong("payment_timestamp")));
            } catch (JSONException e) {
                Log.e("CheckoutInfoContentParser/getCustomPaymentMethodStr failed to parse parameters json", e);
                pair = null;
            }
        }
        if (pair != null) {
            obj = pair.first;
        }
        if (AnonymousClass2BO.A00.A01(r4)) {
            map = A02;
        } else if (A03(r4)) {
            map = A01;
        } else {
            map = A00;
        }
        return (Integer) map.get(obj);
    }

    public static String A01(AnonymousClass1EU r2) {
        int i = r2.bitField1_;
        if ((i & 8) != 0) {
            AnonymousClass1ER r0 = r2.interactiveMessage_;
            if (r0 == null) {
                r0 = AnonymousClass1ER.DEFAULT_INSTANCE;
            }
            AnonymousClass1AN r02 = r0.body_;
            if (r02 == null) {
                r02 = AnonymousClass1AN.DEFAULT_INSTANCE;
            }
            return r02.text_;
        } else if ((i & 1) == 0) {
            return null;
        } else {
            C21801Df r03 = r2.buttonsMessage_;
            if (r03 == null) {
                r03 = C21801Df.DEFAULT_INSTANCE;
            }
            return r03.contentText_;
        }
    }

    public static boolean A03(AnonymousClass1VX r3) {
        JSONObject A0T = r3.A0T(C58422vE.A02, 4252);
        if (A0T.has("buyer_ed_order_message_content_update_enabled")) {
            try {
                return C18310x6.A1W(A0T.getInt("buyer_ed_order_message_content_update_enabled"));
            } catch (JSONException e) {
                Log.e("failed to parse config for ab prop BR_BUYER_ED_CAPABILITIES_CODE#buyer_ed_order_message_content_update_enabled", e);
            }
        }
        return false;
    }

    static {
        HashMap A0t = AnonymousClass001.A0t();
        A03 = A0t;
        HashMap A0t2 = AnonymousClass001.A0t();
        A04 = A0t2;
        HashMap A0t3 = AnonymousClass001.A0t();
        A00 = A0t3;
        HashMap A0t4 = AnonymousClass001.A0t();
        A01 = A0t4;
        HashMap A0t5 = AnonymousClass001.A0t();
        A02 = A0t5;
        Integer valueOf = Integer.valueOf(R.string.f11nameremoved);
        A0t5.put("payment_instruction", valueOf);
        Integer valueOf2 = Integer.valueOf(R.string.f11nameremoved);
        A0t5.put("pix", valueOf2);
        A0t5.put("confirm", Integer.valueOf(R.string.f11nameremoved));
        Integer valueOf3 = Integer.valueOf(R.string.f11nameremoved);
        A0t5.put("captured", valueOf3);
        Integer valueOf4 = Integer.valueOf(R.string.f11nameremoved);
        A0t5.put("pending", valueOf4);
        A0t4.put("payment_instruction", valueOf);
        A0t4.put("pix", valueOf2);
        AnonymousClass0x2.A1I("confirm", A0t4, R.string.f11nameremoved);
        A0t4.put("captured", valueOf3);
        A0t4.put("pending", valueOf4);
        A0t3.put("payment_instruction", valueOf);
        A0t3.put("pix", valueOf2);
        AnonymousClass0x2.A1I("confirm", A0t3, R.string.f11nameremoved);
        A0t3.put("captured", valueOf3);
        A0t3.put("pending", valueOf4);
        AnonymousClass0x2.A1I("pending", A0t, R.string.f11nameremoved);
        A0t.put("processing", Integer.valueOf(R.string.f11nameremoved));
        A0t.put("completed", Integer.valueOf(R.string.f11nameremoved));
        A0t.put("canceled", Integer.valueOf(R.string.f11nameremoved));
        A0t.put("partially_shipped", Integer.valueOf(R.string.f11nameremoved));
        A0t.put("shipped", Integer.valueOf(R.string.f11nameremoved));
        A0t.put("payment_requested", Integer.valueOf(R.string.f11nameremoved));
        A0t.put("preparing_to_ship", Integer.valueOf(R.string.f11nameremoved));
        A0t.put("delivered", Integer.valueOf(R.string.f11nameremoved));
        AnonymousClass0x2.A1I("pending", A0t2, R.string.f11nameremoved);
        AnonymousClass0x2.A1I("processing", A0t2, R.string.f11nameremoved);
        AnonymousClass0x2.A1I("completed", A0t2, R.string.f11nameremoved);
        AnonymousClass0x2.A1I("canceled", A0t2, R.string.f11nameremoved);
        AnonymousClass0x2.A1I("partially_shipped", A0t2, R.string.f11nameremoved);
        AnonymousClass0x2.A1I("shipped", A0t2, R.string.f11nameremoved);
        AnonymousClass0x2.A1I("payment_requested", A0t2, R.string.f11nameremoved);
        AnonymousClass0x2.A1I("preparing_to_ship", A0t2, R.string.f11nameremoved);
        AnonymousClass0x2.A1I("delivered", A0t2, R.string.f11nameremoved);
    }

    public static String A02(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return AnonymousClass0x9.A1H(str).getJSONObject("order").getString("status");
        } catch (JSONException e) {
            Log.e("CheckoutInfoContentParser/getOrderStatusStr failed to parse parameters json", e);
            return null;
        }
    }
}
