package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2sx  reason: invalid class name and case insensitive filesystem */
public final class C57032sx {
    public static final String A00(List list) {
        JSONArray A1F = AnonymousClass0x9.A1F();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass3ZL r3 = (AnonymousClass3ZL) it.next();
            JSONObject A1G = AnonymousClass0x9.A1G();
            A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r3.A01);
            A1G.put("description", r3.A00);
            A1F.put(A1G);
        }
        return C18290x4.A0o(A1F);
    }

    public static final List A01(String str) {
        ArrayList A0s = AnonymousClass001.A0s();
        if (str != null) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    C18320x8.A1E(jSONObject);
                    A0s.add(new AnonymousClass3ZL(C18300x5.A0l(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, jSONObject), C18300x5.A0l("description", jSONObject)));
                }
            } catch (JSONException e) {
                Log.e("BotCommand/createCommands", e);
            }
        }
        return A0s;
    }
}
