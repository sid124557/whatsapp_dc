package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.99C  reason: invalid class name */
public final class AnonymousClass99C extends C133676hl {
    public static final Parcelable.Creator CREATOR = new C204589pb(19);
    public int A00 = 1;

    public void A06(List list, int i) {
        throw AnonymousClass002.A0G("BrazilContactData toNetwork not supported");
    }

    public AnonymousClass99C(Parcel parcel) {
        super(parcel);
    }

    public String A03() {
        JSONObject A1G;
        try {
            String A03 = super.A03();
            if (A03 != null) {
                A1G = AnonymousClass0x9.A1H(A03);
            } else {
                A1G = AnonymousClass0x9.A1G();
            }
            A1G.put("v", this.A00);
            long j = this.A01;
            if (j != -1) {
                A1G.put("nextSyncTimeMillis", j);
            }
            if (!TextUtils.isEmpty(this.A06)) {
                A1G.put("dataHash", this.A06);
            }
            return A1G.toString();
        } catch (JSONException e) {
            Log.w("PAY: BrazilContactData toDBString threw: ", e);
            return null;
        }
    }

    public void A05(String str) {
        super.A05(str);
        if (str != null) {
            try {
                JSONObject A1H = AnonymousClass0x9.A1H(str);
                int optInt = A1H.optInt("v", 1);
                this.A00 = optInt;
                if (optInt == 1) {
                    this.A01 = A1H.optLong("nextSyncTimeMillis", -1);
                }
                this.A06 = A1H.optString("dataHash");
            } catch (JSONException e) {
                Log.w("PAY: BrazilContactData fromDBString threw: ", e);
            }
        }
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[ ver: ");
        A0o.append(this.A00);
        A0o.append(" jid: ");
        A0o.append(this.A05);
        A0o.append(" isMerchant: ");
        A0o.append(this.A07);
        A0o.append(" defaultPaymentType: ");
        A0o.append(this.A00);
        return AnonymousClass000.A0X(" ]", A0o);
    }

    public AnonymousClass99C() {
    }
}
