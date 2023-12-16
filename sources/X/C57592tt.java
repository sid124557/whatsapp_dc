package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2tt  reason: invalid class name and case insensitive filesystem */
public class C57592tt {
    public static String A00(AnonymousClass1VX r6, C95814uZ r7, String str) {
        JSONArray optJSONArray;
        C58422vE r1 = C58422vE.A02;
        if (r6.A0Y(r1, 4603)) {
            String A0R = r6.A0R(r1, 4602);
            String str2 = r7.user;
            if (!TextUtils.isEmpty(A0R)) {
                try {
                    JSONObject optJSONObject = AnonymousClass0x9.A1H(A0R).optJSONObject("merchant_config");
                    if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray(str2)) != null) {
                        int i = 0;
                        while (true) {
                            if (i >= optJSONArray.length()) {
                                break;
                            }
                            JSONObject jSONObject = optJSONArray.getJSONObject(i);
                            String optString = jSONObject.optString("url");
                            if (C107575bX.A0F(optString) || !C18280x3.A1X(str, Pattern.compile(optString))) {
                                i++;
                            } else {
                                String optString2 = jSONObject.optString("experience");
                                if ("webview".equalsIgnoreCase(optString2)) {
                                    return optString2;
                                }
                                if ("browser_tab".equalsIgnoreCase(optString2)) {
                                    return optString2;
                                }
                            }
                        }
                    }
                } catch (JSONException e) {
                    Log.e("TemplateMessageUrlWebViewUtils/isExperienceEnabled json exception", e);
                }
            }
        }
        return "external_browser";
    }

    @Deprecated
    public static boolean A01(AnonymousClass1VX r6, C95814uZ r7, String str) {
        C58422vE r1 = C58422vE.A02;
        if (r6.A0Y(r1, 3609)) {
            try {
                String A0R = r6.A0R(r1, 3606);
                if (!TextUtils.isEmpty(A0R)) {
                    JSONObject A1H = AnonymousClass0x9.A1H(A0R);
                    JSONArray jSONArray = A1H.getJSONArray("merchant_list");
                    JSONArray jSONArray2 = A1H.getJSONArray("url_regex_list");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        if (r7.user.equals(jSONArray.getString(i))) {
                            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                                if (C18280x3.A1X(str, Pattern.compile(jSONArray2.getString(i2)))) {
                                    return true;
                                }
                            }
                            continue;
                        }
                    }
                }
            } catch (PatternSyntaxException | JSONException e) {
                Log.e("TemplateMessageUrlWebViewUtils/isButtonUrlOpenInWebviewEnabled exception", e);
            }
        }
        return false;
    }
}
