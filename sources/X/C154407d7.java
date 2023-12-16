package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7d7  reason: invalid class name and case insensitive filesystem */
public final class C154407d7 {
    public static final C165897xo A00(AnonymousClass36K r9) {
        C165817xg r4;
        try {
            String A0q = r9.A0q("step_up_id");
            String A0q2 = r9.A0q("service");
            boolean A1U = AnonymousClass000.A1U(r9.A0b("sticky_service_hub_cta", 1), 1);
            String A0r = r9.A0r("step_up_reason", (String) null);
            AnonymousClass36K A0m = r9.A0m("step_up_challenge");
            String A0q3 = A0m.A0q("challenge_id");
            AnonymousClass36K A0j = A0m.A0j();
            String str = A0j.A00;
            if (str.equals("webview")) {
                boolean z = true;
                try {
                    if (A0j.A0b("auth_required", 1) != 1) {
                        z = false;
                    }
                    r4 = new C137086nl(A0q3, z);
                } catch (AnonymousClass24Y e) {
                    Log.e("PAY: Can't build WebViewChallenge ", e);
                }
            } else {
                if (str.equals("document_upload")) {
                    r4 = new C137076nk(A0q3);
                }
                r4 = null;
            }
            return new C165897xo(r4, A0q2, A0q, A0r, A1U);
        } catch (AnonymousClass24Y e2) {
            Log.e("PAY: PaymentStepUpInfo/fromProtocolTreeNode ", e2);
            return null;
        }
    }

    public static final C165897xo A01(String str) {
        C165817xg r4;
        if (!C175738Zn.A0V(str)) {
            try {
                JSONObject A1H = AnonymousClass0x9.A1H(str);
                String string = A1H.getString("service");
                String string2 = A1H.getString("step_up_id");
                boolean optBoolean = A1H.optBoolean("sticky_service_hub_cta", true);
                JSONObject jSONObject = A1H.getJSONObject("step_up_challenge");
                try {
                    String string3 = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                    if (string3.equals("WEBVIEW")) {
                        try {
                            r4 = new C137086nl(jSONObject.getString("challenge_id"), jSONObject.getBoolean("auth_required"));
                        } catch (JSONException e) {
                            Log.e("PAY: WebViewChallenge fromJsonObject threw exception ", e);
                        }
                        String optString = A1H.optString("step_up_reason", (String) null);
                        C162457s7.A0H(string);
                        C162457s7.A0H(string2);
                        return new C165897xo(r4, string, string2, optString, optBoolean);
                    }
                    if (string3.equals("DOC_UPLOAD")) {
                        try {
                            r4 = new C137076nk(jSONObject.getString("challenge_id"));
                        } catch (JSONException e2) {
                            Log.e("PAY: DocumentUploadChallenge fromJsonObject threw exception ", e2);
                        }
                        String optString2 = A1H.optString("step_up_reason", (String) null);
                        C162457s7.A0H(string);
                        C162457s7.A0H(string2);
                        return new C165897xo(r4, string, string2, optString2, optBoolean);
                    }
                    r4 = null;
                    String optString22 = A1H.optString("step_up_reason", (String) null);
                    C162457s7.A0H(string);
                    C162457s7.A0H(string2);
                    return new C165897xo(r4, string, string2, optString22, optBoolean);
                } catch (JSONException e3) {
                    Log.e("PAY: PaymentStepUpChallenge fromJsonObject threw exception ", e3);
                }
            } catch (JSONException e4) {
                Log.e("PAY: PaymentStepUpInfo fromJsonString threw exception ", e4);
            }
        }
        return null;
    }
}
