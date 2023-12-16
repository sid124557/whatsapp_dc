package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9T6  reason: invalid class name */
public class AnonymousClass9T6 {
    public SharedPreferences A00;
    public final C160757oG A01 = C160757oG.A00("PaymentProviderKeySharedPrefs", "infra", "COMMON");
    public final C60152y5 A02;

    public final synchronized SharedPreferences A00() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A02.A03("com.whatsapp_payment_provider_key_preferences");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public AnonymousClass9T6(C60152y5 r4) {
        this.A02 = r4;
    }

    public C67993Rl A01(String str, String str2) {
        Long l;
        String str3 = str;
        String str4 = str2;
        String string = A00().getString(AnonymousClass000.A0V("::", str2, AnonymousClass000.A0l(str)), (String) null);
        if (TextUtils.isEmpty(string)) {
            this.A01.A04(AnonymousClass000.A0X(" is null", AnonymousClass000.A0m("getProviderKey/provider=", str)));
            return null;
        }
        try {
            JSONObject A1H = AnonymousClass0x9.A1H(string);
            String optString = A1H.optString("key_type");
            String optString2 = A1H.optString("key_version");
            String optString3 = A1H.optString("key_data");
            if (!TextUtils.isEmpty(optString)) {
                if (!TextUtils.isEmpty(optString2) && ("none".equals(optString) || !TextUtils.isEmpty(optString3))) {
                    String optString4 = A1H.optString("key_expiry");
                    byte[] decode = Base64.decode(optString3, 2);
                    if (TextUtils.isEmpty(optString4)) {
                        l = null;
                    } else {
                        l = Long.valueOf(C615531h.A03(optString4));
                    }
                    return new C67993Rl(l, str3, str4, optString, optString2, decode);
                }
            }
            StringBuilder sb = new StringBuilder(C160757oG.A01("PaymentProviderKeySharedPrefs", AnonymousClass000.A0X(" providerKey is null", AnonymousClass000.A0m("getProviderKey/provider=", str))));
            if (TextUtils.isEmpty(optString)) {
                sb.append(" keyType is null");
            }
            if (TextUtils.isEmpty(optString2)) {
                sb.append(" keyVersion is null");
            }
            if (!"none".equals(optString) && TextUtils.isEmpty(optString3)) {
                sb.append(" keyData is null");
            }
            C18280x3.A13(sb);
            return null;
        } catch (JSONException e) {
            this.A01.A0A(AnonymousClass000.A0X(" threw: ", AnonymousClass000.A0m("getProviderKey/provider=", str)), e);
            return null;
        }
    }

    public void A02(String str, String str2) {
        A00().edit().remove(AnonymousClass000.A0V("::", str2, AnonymousClass000.A0l(str))).apply();
    }
}
