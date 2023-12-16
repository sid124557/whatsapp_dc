package X;

import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6hu  reason: invalid class name and case insensitive filesystem */
public abstract class C133766hu extends C133796hx {
    public long A00;
    public C166557yt A01;
    public C166557yt A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public byte[] A09;

    public String A0C() {
        Object obj;
        C166557yt r0 = this.A01;
        if (r0 == null) {
            obj = null;
        } else {
            obj = r0.A00;
        }
        return (String) obj;
    }

    public JSONObject A0D() {
        JSONObject A1G = AnonymousClass0x9.A1G();
        try {
            String str = this.A03;
            if (str != null) {
                A1G.put("bankImageURL", str);
            }
            String str2 = this.A04;
            if (str2 != null) {
                A1G.put("bankPhoneNumber", str2);
                return A1G;
            }
        } catch (JSONException e) {
            Log.w("PAY: PaymentMethodBankAccountCountryData toJSONObject threw: ", e);
        }
        return A1G;
    }
}
