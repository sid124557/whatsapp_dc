package X;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9TR  reason: invalid class name */
public class AnonymousClass9TR {
    public final C620933l A00;
    public final C160757oG A01 = C160757oG.A00("PaymentPinSharedPrefs", "infra", "COMMON");

    public synchronized long A00() {
        long j;
        JSONObject optJSONObject;
        j = 0;
        try {
            String A06 = this.A00.A06();
            if (!TextUtils.isEmpty(A06) && (optJSONObject = AnonymousClass0x9.A1H(A06).optJSONObject("pin")) != null) {
                j = optJSONObject.optLong("pin_next_retry_ts");
            }
        } catch (JSONException e) {
            C1899593h.A1G(this.A01, e, "getNextRetryTs threw: ", AnonymousClass001.A0o());
        }
        return j;
    }

    public synchronized void A01() {
        try {
            C620933l r5 = this.A00;
            JSONObject A0g = C1899593h.A0g(r5);
            JSONObject optJSONObject = A0g.optJSONObject("pin");
            if (optJSONObject == null) {
                optJSONObject = AnonymousClass0x9.A1G();
            }
            optJSONObject.put("v", "1");
            optJSONObject.put("pinSet", true);
            A0g.put("pin", optJSONObject);
            C1899593h.A1D(r5, A0g);
        } catch (JSONException e) {
            C1899593h.A1G(this.A01, e, "setPinSet threw: ", AnonymousClass001.A0o());
        }
        return;
    }

    public synchronized void A02(long j) {
        try {
            C620933l r5 = this.A00;
            JSONObject A0g = C1899593h.A0g(r5);
            JSONObject optJSONObject = A0g.optJSONObject("pin");
            if (optJSONObject == null) {
                optJSONObject = AnonymousClass0x9.A1G();
            }
            optJSONObject.put("v", "1");
            optJSONObject.put("pin_next_retry_ts", j);
            A0g.put("pin", optJSONObject);
            C1899593h.A1D(r5, A0g);
        } catch (JSONException e) {
            C1899593h.A1G(this.A01, e, "setPinSet threw: ", AnonymousClass001.A0o());
        }
        return;
    }

    public synchronized boolean A03() {
        boolean z;
        JSONObject optJSONObject;
        z = false;
        try {
            String A06 = this.A00.A06();
            if (!TextUtils.isEmpty(A06) && (optJSONObject = AnonymousClass0x9.A1H(A06).optJSONObject("pin")) != null) {
                z = optJSONObject.optBoolean("pinSet");
            }
        } catch (JSONException e) {
            C1899593h.A1G(this.A01, e, "isPinSet threw: ", AnonymousClass001.A0o());
        }
        return z;
    }

    public AnonymousClass9TR(C620933l r4) {
        this.A00 = r4;
    }
}
