package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.32n  reason: invalid class name and case insensitive filesystem */
public class C618532n {
    public int A00;
    public int A01;
    public int A02;
    public String A03;
    public JSONObject A04;
    public final String A05;
    public final String A06;
    public final JSONArray A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public C618532n(JSONObject jSONObject) {
        String str;
        try {
            this.A01 = jSONObject.getInt("code");
        } catch (JSONException unused) {
            this.A01 = 0;
        }
        try {
            this.A02 = jSONObject.getInt("error_subcode");
        } catch (JSONException unused2) {
            this.A02 = 0;
        }
        try {
            this.A00 = jSONObject.getInt("api_error_code");
        } catch (JSONException unused3) {
            this.A00 = 0;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("path");
        this.A07 = optJSONArray;
        String A032 = AnonymousClass355.A03("message", jSONObject);
        this.A06 = A032;
        this.A09 = jSONObject.optBoolean("is_silent");
        this.A0A = jSONObject.optBoolean("is_transient");
        this.A05 = AnonymousClass355.A03("description", jSONObject);
        this.A0B = jSONObject.optBoolean("requires_reauth");
        this.A08 = jSONObject.optBoolean("allow_user_retry");
        try {
            if (jSONObject.has(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE)) {
                str = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            } else if (jSONObject.has("exception")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("exception");
                C162457s7.A0J(jSONObject2, 0);
                str = AnonymousClass355.A03("class", jSONObject2);
                if (jSONObject.getJSONObject("exception").has("message")) {
                    StringBuilder A0l = AnonymousClass000.A0l(str);
                    A0l.append("::");
                    JSONObject jSONObject3 = jSONObject.getJSONObject("exception");
                    C162457s7.A0J(jSONObject3, 0);
                    str = AnonymousClass000.A0X(AnonymousClass355.A03("message", jSONObject3), A0l);
                }
            } else {
                str = null;
            }
        } catch (JSONException e) {
            e.printStackTrace();
            str = null;
        }
        this.A03 = str;
        this.A04 = AnonymousClass0x9.A1G();
        String A033 = AnonymousClass355.A03("www_request_id", jSONObject);
        if (AnonymousClass355.A03("fbtrace_id", jSONObject) != null) {
            this.A04.put("fbtrace_id", AnonymousClass355.A03("fbtrace_id", jSONObject));
        }
        if (A033 != null) {
            this.A04.put("www_request_id", AnonymousClass355.A03("www_request_id", jSONObject));
        }
        if (optJSONArray != null) {
            JSONObject jSONObject4 = this.A04;
            StringBuilder A0o = AnonymousClass001.A0o();
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    A0o.append(optJSONArray.get(i));
                    if (i < optJSONArray.length() - 1) {
                        C18320x8.A1K(A0o);
                    }
                } catch (JSONException e2) {
                    Log.e(e2.getMessage());
                }
            }
            C18300x5.A1L(A0o, "path", jSONObject4);
        }
        if (this.A03 == null) {
            this.A03 = A032;
        }
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("GraphqlError{code=");
        A0o.append(this.A01);
        A0o.append(", errorSubCode='");
        A0o.append(this.A02);
        A0o.append('\'');
        A0o.append(", message='");
        A0o.append(this.A06);
        A0o.append('\'');
        A0o.append(", isSilent=");
        A0o.append(this.A09);
        A0o.append(", description='");
        A0o.append(this.A05);
        A0o.append('\'');
        A0o.append(", isTransient=");
        A0o.append(this.A0A);
        A0o.append(", requiresReAuth=");
        A0o.append(this.A0B);
        A0o.append(", allowUserRetry=");
        A0o.append(this.A08);
        return AnonymousClass000.A0d(A0o);
    }

    public C618532n(String str, String str2) {
        this.A03 = str;
        this.A01 = -20;
        this.A07 = null;
        this.A09 = false;
        this.A0A = false;
        this.A0B = false;
        this.A08 = false;
        this.A06 = null;
        this.A05 = null;
    }

    public C618532n(String str) {
        this.A01 = -1;
        this.A06 = str;
        this.A05 = str;
        this.A07 = null;
        this.A09 = false;
        this.A0A = false;
        this.A0B = false;
        this.A08 = false;
    }
}
