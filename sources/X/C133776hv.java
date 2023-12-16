package X;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6hv  reason: invalid class name and case insensitive filesystem */
public abstract class C133776hv extends C133796hx {
    public int A00;
    public int A01;
    public long A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public List A0D;
    public boolean A0E;
    public boolean A0F;

    public void A0D(JSONObject jSONObject) {
        this.A01 = jSONObject.optInt("state", 0);
        this.A09 = jSONObject.optString("merchantId", (String) null);
        this.A0C = jSONObject.optString("supportPhoneNumber", (String) null);
        this.A03 = jSONObject.optString("businessName", (String) null);
        String optString = jSONObject.optString("displayState", (String) null);
        if (TextUtils.isEmpty(optString)) {
            optString = "ACTIVE";
        }
        this.A07 = optString;
        this.A00 = jSONObject.optInt("maxInstallmentCount");
        this.A0A = jSONObject.optString("p2mReceive", "WAIT_ACTIVE");
    }

    public JSONObject A0C() {
        JSONObject A1G = AnonymousClass0x9.A1G();
        try {
            A1G.put("state", this.A01);
            if (!TextUtils.isEmpty(this.A09)) {
                A1G.put("merchantId", this.A09);
            }
            if (!TextUtils.isEmpty(this.A0C)) {
                A1G.put("supportPhoneNumber", this.A0C);
            }
            if (!TextUtils.isEmpty(this.A03)) {
                A1G.put("businessName", this.A03);
            }
            if (!TextUtils.isEmpty(this.A07)) {
                A1G.put("displayState", this.A07);
            }
            A1G.put("maxInstallmentCount", this.A00);
            try {
                A1G.put("p2mReceive", this.A0A);
                return A1G;
            } catch (JSONException e) {
                C18260x0.A1S(AnonymousClass001.A0o(), "PAY: PaymentMethodMerchantCountryData/addCapabilitiesToJson threw: ", e);
                return A1G;
            }
        } catch (JSONException e2) {
            C18260x0.A1S(AnonymousClass001.A0o(), "PAY: MerchantMethodData toDBJSONObject threw: ", e2);
            return A1G;
        }
    }
}
