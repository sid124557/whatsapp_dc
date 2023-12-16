package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9Uw  reason: invalid class name and case insensitive filesystem */
public final class C194889Uw {
    public final JSONArray A00(List list) {
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C195299Xa r3 = (C195299Xa) it.next();
                C162457s7.A0J(r3, 0);
                JSONObject A1G = AnonymousClass0x9.A1G();
                A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r3.A00);
                jSONArray.put(A1G);
            }
            return jSONArray;
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiTransactionOfferData/toJsonArray threw: ", e);
            return jSONArray;
        }
    }
}
