package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1dg  reason: invalid class name and case insensitive filesystem */
public abstract class C27351dg extends C67303Ot {
    public final AnonymousClass3FI A00;
    public final String A01;
    public final String A02;

    public C27351dg(C56492s4 r14, AnonymousClass33p r15, AnonymousClass1VX r16, AnonymousClass28T r17, AnonymousClass3FI r18, C183538qC r19, String str, String str2, String str3, AnonymousClass4C1 r23, AnonymousClass4C1 r24, long j) {
        super(r14, r15, r16, r17, r19, str, (Map) null, r23, r24, j);
        this.A01 = str2;
        this.A00 = r18;
        this.A02 = str3;
    }

    public String A08() {
        if (this instanceof AnonymousClass1MU) {
            return "bloks_version";
        }
        if ((this instanceof AnonymousClass1MO) || (this instanceof AnonymousClass1MS) || (this instanceof AnonymousClass1MT) || (this instanceof AnonymousClass1MQ) || (this instanceof AnonymousClass1MP)) {
            return "version";
        }
        return "versioning_id";
    }

    public void A09(JSONObject jSONObject) {
        JSONObject A1H;
        jSONObject.put("app_id", this.A01);
        jSONObject.put(A08(), "6c404196454966428d798beeeffa89a9ea5cf915e4ff8a7448ab0b8135b0a3f9");
        String str = this.A02;
        if (TextUtils.isEmpty(str)) {
            str = "{}";
        }
        C162457s7.A0J(str, 0);
        if (C1001059l.A01) {
            try {
                if (str.length() == 0) {
                    A1H = AnonymousClass0x9.A1G();
                } else {
                    A1H = AnonymousClass0x9.A1H(str);
                }
                JSONObject optJSONObject = A1H.optJSONObject("params");
                if (optJSONObject == null) {
                    optJSONObject = AnonymousClass0x9.A1G();
                }
                if (optJSONObject.length() == 0) {
                    JSONObject optJSONObject2 = A1H.optJSONObject("server_params");
                    if (optJSONObject2 == null) {
                        optJSONObject2 = AnonymousClass0x9.A1G();
                    }
                    if (optJSONObject2.length() != 0) {
                        optJSONObject2.accumulate("use_new_colors", Boolean.valueOf(C1001059l.A03));
                        str = C18280x3.A0c(optJSONObject2, "server_params", A1H);
                    }
                }
                JSONObject optJSONObject3 = optJSONObject.optJSONObject("server_params");
                if (optJSONObject3 == null) {
                    optJSONObject3 = AnonymousClass0x9.A1G();
                }
                if (optJSONObject3.length() == 0 && optJSONObject.length() != 0 && !optJSONObject.has("server_params")) {
                    Iterator<String> keys = optJSONObject.keys();
                    C162457s7.A0D(keys);
                    while (keys.hasNext()) {
                        String A0m = AnonymousClass001.A0m(keys);
                        optJSONObject3.accumulate(A0m, optJSONObject.get(A0m));
                    }
                }
                optJSONObject3.accumulate("use_new_colors", Boolean.valueOf(C1001059l.A03));
                optJSONObject.put("server_params", optJSONObject3);
                String A0y = AnonymousClass0x9.A0y(optJSONObject, "params", A1H);
                C162457s7.A0H(A0y);
                str = A0y;
            } catch (JSONException unused) {
                Log.d("Could not parse Bloks params, returning without change");
            }
        }
        jSONObject.put("params", str);
    }

    public String A03() {
        String A0o = C18290x4.A0o(Locale.getDefault());
        Map A05 = A05();
        if (!A05.containsKey(A0o)) {
            return A0o;
        }
        String A0o2 = C18310x6.A0o(A0o, A05);
        if (A0o2 == null) {
            return "en_US";
        }
        return A0o2;
    }
}
