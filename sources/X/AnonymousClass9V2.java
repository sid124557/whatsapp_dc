package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9V2  reason: invalid class name */
public class AnonymousClass9V2 {
    public C194809Uo A00;
    public String A01;

    public AnonymousClass9V2(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject A1H = AnonymousClass0x9.A1H(str);
                this.A01 = A1H.optString("invoice-number");
                if (A1H.has("fx-detail")) {
                    this.A00 = new C194809Uo(A1H.optString("fx-detail"));
                }
            } catch (JSONException e) {
                Log.w("PAY: IndiaUpiTransactionComplaintData threw: ", e);
            }
        }
    }

    public String A00() {
        String str;
        try {
            JSONObject A1G = AnonymousClass0x9.A1G();
            String str2 = this.A01;
            if (str2 != null) {
                A1G.put("invoice-number", str2);
            }
            C194809Uo r5 = this.A00;
            if (r5 != null) {
                try {
                    JSONObject A1G2 = AnonymousClass0x9.A1G();
                    C166557yt r1 = r5.A00;
                    if (r1 != null) {
                        C1899693i.A0r(r1, "base-amount", A1G2);
                    }
                    String str3 = r5.A01;
                    if (!TextUtils.isEmpty(str3)) {
                        A1G2.put("base-currency", str3);
                    }
                    BigDecimal bigDecimal = r5.A02;
                    if (bigDecimal != null) {
                        C18300x5.A1L(bigDecimal, "currency-fx", A1G2);
                    }
                    BigDecimal bigDecimal2 = r5.A03;
                    if (bigDecimal2 != null) {
                        C18300x5.A1L(bigDecimal2, "currency-markup", A1G2);
                    }
                    str = A1G2.toString();
                } catch (JSONException e) {
                    Log.w("PAY: IndiaUpiTransactionMetadata toDBString threw: ", e);
                    str = null;
                }
                A1G.put("fx-detail", str);
            }
            return A1G.toString();
        } catch (JSONException e2) {
            Log.w("PAY: IndiaUpiInternationalTransactionDetailData toDBString threw: ", e2);
            return null;
        }
    }

    public AnonymousClass9V2(AnonymousClass36K r3) {
        String A0L = AnonymousClass36K.A0L(r3, "invoice-number");
        if (!TextUtils.isEmpty(A0L)) {
            this.A01 = A0L;
        }
        AnonymousClass36K A0l = r3.A0l("fx-detail");
        if (A0l != null) {
            this.A00 = new C194809Uo(A0l);
        }
    }
}
