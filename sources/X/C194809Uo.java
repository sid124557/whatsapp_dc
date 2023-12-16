package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9Uo  reason: invalid class name and case insensitive filesystem */
public final class C194809Uo {
    public C166557yt A00;
    public String A01;
    public BigDecimal A02;
    public BigDecimal A03;

    public C194809Uo(String str) {
        Object obj;
        BigDecimal bigDecimal;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject A1H = AnonymousClass0x9.A1H(str);
                AnonymousClass3QD A002 = AnonymousClass3QD.A00();
                Class<String> cls = String.class;
                C166557yt r0 = this.A00;
                if (r0 == null) {
                    obj = null;
                } else {
                    obj = r0.A00;
                }
                this.A00 = C1899693i.A0F(A002, cls, A1H.optString("base-amount", (String) obj), "moneyStringValue");
                this.A01 = A1H.optString("base-currency");
                BigDecimal bigDecimal2 = null;
                if (A1H.has("currency-fx")) {
                    bigDecimal = new BigDecimal(A1H.optString("currency-fx"));
                } else {
                    bigDecimal = null;
                }
                this.A02 = bigDecimal;
                this.A03 = A1H.has("currency-markup") ? new BigDecimal(A1H.optString("currency-markup")) : bigDecimal2;
            } catch (JSONException e) {
                Log.w("PAY: IndiaUpiInternationalTransactionDetailData:FxDetail threw: ", e);
            }
        }
    }

    public C194809Uo(AnonymousClass36K r6) {
        String A0r = r6.A0r("base-currency", (String) null);
        if (!TextUtils.isEmpty(A0r)) {
            this.A01 = A0r;
        }
        String A0r2 = r6.A0r("base-amount", (String) null);
        if (!TextUtils.isEmpty(A0r2)) {
            this.A00 = C1899693i.A0F(AnonymousClass3QD.A00(), String.class, A0r2, "moneyStringValue");
        }
        String A0r3 = r6.A0r("currency-fx", (String) null);
        if (!TextUtils.isEmpty(A0r3)) {
            this.A02 = new BigDecimal(A0r3);
        }
        String A0r4 = r6.A0r("currency-markup", (String) null);
        if (!TextUtils.isEmpty(A0r4)) {
            this.A03 = new BigDecimal(A0r4);
        }
    }
}
