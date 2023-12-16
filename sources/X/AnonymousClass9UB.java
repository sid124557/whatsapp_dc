package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9UB  reason: invalid class name */
public class AnonymousClass9UB {
    public static boolean A00(C193149Ni r12, String str, String str2) {
        JSONObject A1G;
        try {
            JSONObject A1H = AnonymousClass0x9.A1H(str2);
            JSONArray jSONArray = A1H.getJSONArray("url");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString("regex");
                HashMap A0t = AnonymousClass001.A0t();
                Matcher matcher = Pattern.compile(string, 2).matcher(str);
                if (matcher.find()) {
                    int groupCount = matcher.groupCount();
                    if (groupCount >= 1) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("param");
                        int i2 = 0;
                        while (true) {
                            i2++;
                            A0t.put(jSONArray2.getJSONObject(i2).getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME), matcher.group(i2));
                            if (i2 >= groupCount) {
                                break;
                            }
                        }
                    }
                    if (A1H.has("opts")) {
                        A1G = A1H.getJSONObject("opts");
                    } else {
                        A1G = AnonymousClass0x9.A1G();
                    }
                    if (jSONObject.has("opts")) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("opts");
                        Iterator<String> keys = jSONObject2.keys();
                        while (keys.hasNext()) {
                            String A0m = AnonymousClass001.A0m(keys);
                            A1G.put(A0m, jSONObject2.get(A0m));
                        }
                    }
                    r12.A00 = new JSONObject(A0t);
                    return true;
                }
            }
        } catch (JSONException e) {
            Log.e((Throwable) e);
        }
        return false;
    }
}
