package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2sy  reason: invalid class name and case insensitive filesystem */
public final class C57042sy {
    public static final String A00(List list) {
        JSONArray A1F = AnonymousClass0x9.A1F();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C51142jL r3 = (C51142jL) it.next();
            JSONObject A1G = AnonymousClass0x9.A1G();
            A1G.put("text", r3.A01);
            A1G.put("emoji", r3.A00);
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
                    A0s.add(new C51142jL(C18300x5.A0l("text", jSONObject), C18300x5.A0l("emoji", jSONObject)));
                }
            } catch (JSONException e) {
                Log.e("BotProfile/createPrompts", e);
            }
        }
        return A0s;
    }
}
