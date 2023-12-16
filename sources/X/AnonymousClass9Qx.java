package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9Qx  reason: invalid class name */
public class AnonymousClass9Qx {
    public JSONObject A00;
    public final AnonymousClass1VX A01;

    public String A00(String str, String str2, boolean z) {
        AnonymousClass1VX r1 = this.A01;
        if (!r1.A0X(1955)) {
            return null;
        }
        int A0N = r1.A0N(1956);
        Integer valueOf = Integer.valueOf(A0N);
        String str3 = "";
        String str4 = str3;
        if (r1.A0X(1955)) {
            if (str != null) {
                if (str2 != null) {
                    Object[] A0M = AnonymousClass002.A0M();
                    AnonymousClass000.A16(str, str2, A0M);
                    str3 = String.format("%s,%s", A0M);
                } else {
                    str3 = str;
                }
            }
            try {
                JSONObject jSONObject = this.A00;
                if (jSONObject == null || jSONObject.get(str3) == null) {
                    str3 = str4;
                } else {
                    str3 = jSONObject.get(str3).toString();
                }
            } catch (JSONException unused) {
                str3 = null;
            }
            if (C107575bX.A0F(str3)) {
                try {
                    JSONObject jSONObject2 = this.A00;
                    if (jSONObject2 == null || jSONObject2.get(str) == null) {
                        str3 = str4;
                    } else {
                        str3 = jSONObject2.get(str).toString();
                    }
                } catch (JSONException unused2) {
                    str3 = null;
                }
            }
        }
        if (!C107575bX.A0F(str3)) {
            return str3;
        }
        if (!z || valueOf == null || A0N == 0) {
            return null;
        }
        return valueOf.toString();
    }

    public AnonymousClass9Qx(AnonymousClass1VX r3) {
        this.A01 = r3;
        if (r3.A0X(1955)) {
            String A0Q = r3.A0Q(2659);
            if (!TextUtils.isEmpty(A0Q)) {
                try {
                    this.A00 = AnonymousClass0x9.A1H(A0Q);
                } catch (JSONException e) {
                    Log.e("Fail to fetch merchantCodePurposeCodeMaxAmountMap ", e);
                }
            }
        }
    }
}
