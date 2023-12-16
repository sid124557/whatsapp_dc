package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2wn  reason: invalid class name and case insensitive filesystem */
public class C59362wn {
    public static final Set A02 = Collections.unmodifiableSet(new C73393fQ());
    public final SimpleDateFormat A00 = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss Z", Locale.ENGLISH);
    public final boolean A01;

    public List A00(JSONArray jSONArray) {
        long j;
        if (!this.A01 || jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                Date parse = this.A00.parse(jSONObject.getString("expires"));
                C43442Sd r3 = new C43442Sd();
                r3.A00 = Boolean.valueOf(jSONObject.optBoolean("secure"));
                if (parse == null) {
                    j = 0;
                } else {
                    j = parse.getTime();
                }
                r3.A01 = Long.valueOf(j);
                r3.A03 = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                r3.A05 = jSONObject.getString("value");
                r3.A02 = jSONObject.getString("domain");
                r3.A04 = jSONObject.getString("path");
                r3.A00.getClass();
                r3.A01.getClass();
                r3.A02.getClass();
                r3.A03.getClass();
                r3.A04.getClass();
                r3.A05.getClass();
                A0s.add(new AnonymousClass2AV());
            } catch (NullPointerException | ParseException | JSONException unused) {
            }
        }
        return A0s;
    }

    public C59362wn(String str) {
        this.A01 = A02.contains(str);
    }
}
