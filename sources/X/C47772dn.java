package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.2dn  reason: invalid class name and case insensitive filesystem */
public final class C47772dn {
    public final C58682ve A00(JSONObject jSONObject) {
        AnonymousClass21H r5;
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        JSONObject jSONObject2 = jSONObject;
        String string = jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        if (string == null) {
            try {
                r5 = AnonymousClass21H.UNKNOWN;
            } catch (IllegalArgumentException unused) {
                r5 = AnonymousClass21H.UNKNOWN;
            }
        } else {
            Locale locale = Locale.US;
            C162457s7.A0F(locale);
            String upperCase = string.toUpperCase(locale);
            C162457s7.A0D(upperCase);
            r5 = AnonymousClass21H.valueOf(upperCase);
        }
        JSONArray jSONArray = jSONObject2.getJSONArray("filters");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(i);
            C162457s7.A0D(jSONObject3);
            boolean optBoolean = jSONObject3.optBoolean("passIfNotSupported", false);
            JSONObject optJSONObject = jSONObject3.optJSONObject("extra_data");
            HashMap A0t = AnonymousClass001.A0t();
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String A0m = AnonymousClass001.A0m(keys);
                    A0t.put(A0m, optJSONObject.getString(A0m));
                }
            }
            A0s.add(new AnonymousClass2PJ(new C41052It(C18290x4.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, jSONObject3)), A0t, optBoolean));
        }
        JSONArray jSONArray2 = jSONObject2.getJSONArray("clauses");
        int length2 = jSONArray2.length();
        for (int i2 = 0; i2 < length2; i2++) {
            JSONObject jSONObject4 = jSONArray2.getJSONObject(i2);
            C162457s7.A0D(jSONObject4);
            A0s2.add(A00(jSONObject4));
        }
        return new C58682ve(r5, A0s, A0s2);
    }

    public final JSONObject A01(C58682ve r9) {
        JSONObject A1G = AnonymousClass0x9.A1G();
        String name = r9.A00.name();
        if (name == null) {
            name = "UNKNOWN";
        }
        A1G.putOpt(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, name);
        JSONArray A1F = AnonymousClass0x9.A1F();
        Iterator it = r9.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass2PJ r4 = (AnonymousClass2PJ) it.next();
            JSONObject A0l = AnonymousClass0x2.A0l(r4);
            A0l.putOpt("passIfNotSupported", Boolean.valueOf(r4.A02));
            A0l.putOpt("extra_data", new JSONObject(r4.A01));
            A0l.putOpt(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r4.A00.A00);
            A1F.put(A0l);
        }
        A1G.putOpt("filters", A1F);
        JSONArray A1F2 = AnonymousClass0x9.A1F();
        Iterator it2 = r9.A01.iterator();
        while (it2.hasNext()) {
            A1F2.put(A01((C58682ve) it2.next()));
        }
        A1G.putOpt("clauses", A1F2);
        return A1G;
    }
}
