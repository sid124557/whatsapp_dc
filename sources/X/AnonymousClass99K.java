package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.99K  reason: invalid class name */
public class AnonymousClass99K extends C133776hv {
    public static final Parcelable.Creator CREATOR = new C204589pb(10);
    public C166557yt A00;
    public AnonymousClass99H A01;
    public String A02;

    public void A04(C617332a r4, AnonymousClass36K r5, int i) {
        String A0r = r5.A0r("display-state", (String) null);
        if (TextUtils.isEmpty(A0r)) {
            A0r = "ACTIVE";
        }
        this.A07 = A0r;
        this.A09 = r5.A0r("merchant-id", (String) null);
        this.A03 = r5.A0r("business-name", (String) null);
        this.A04 = r5.A0r("country", (String) null);
        this.A05 = r5.A0r("credential-id", (String) null);
        this.A00 = C161527pr.A01(r5.A0r("vpa", (String) null), "upiHandle");
        this.A02 = r5.A0r("vpa-id", (String) null);
        AnonymousClass36K A0l = r5.A0l("bank");
        if (A0l != null) {
            AnonymousClass99H r0 = new AnonymousClass99H();
            this.A01 = r0;
            r0.A04(r4, A0l, i);
        }
    }

    public void A05(String str) {
        if (str != null) {
            try {
                A0D(AnonymousClass0x9.A1H(str));
            } catch (JSONException unused) {
                Log.e("PAY: IndiaUpiMerchantMethodData fromDBString threw JSONException");
            }
        }
    }

    public void A06(List list, int i) {
        throw AnonymousClass002.A0G("PAY: IndiaUpiMerchantData toNetwork unsupported");
    }

    public C166587yw A07() {
        return new C133706ho(C161357pU.A00("IN"), this, this.A05, this.A08, this.A09, this.A03, 0, this.A0E, this.A0F);
    }

    public LinkedHashSet A0A() {
        return new LinkedHashSet(Collections.singletonList(AnonymousClass1S3.A05));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A09);
        parcel.writeString(this.A03);
        parcel.writeString(this.A07);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A01, i);
    }

    public String A03() {
        return A0C().toString();
    }

    public JSONObject A0C() {
        JSONObject A0C = super.A0C();
        try {
            C166557yt r1 = this.A00;
            if (!C161527pr.A03(r1)) {
                C1899693i.A0r(r1, "vpaHandle", A0C);
            }
            String str = this.A02;
            if (str != null) {
                A0C.put("vpaId", str);
            }
            if (this.A01 != null) {
                JSONObject A1G = AnonymousClass0x9.A1G();
                C166557yt r12 = this.A01.A02;
                if (r12 != null) {
                    C1899693i.A0r(r12, "accountNumber", A1G);
                }
                C166557yt r13 = this.A01.A01;
                if (r13 != null) {
                    C1899693i.A0r(r13, "bankName", A1G);
                }
                A0C.put("bank", A1G);
                return A0C;
            }
        } catch (JSONException unused) {
            Log.e("PAY: IndiaUpiMerchantMethodData toJSONObject threw JSONException");
        }
        return A0C;
    }

    public void A0D(JSONObject jSONObject) {
        super.A0D(jSONObject);
        this.A00 = C161527pr.A01(jSONObject.optString("vpaHandle"), "upiHandle");
        this.A02 = jSONObject.optString("vpaId");
        JSONObject optJSONObject = jSONObject.optJSONObject("bank");
        if (optJSONObject != null) {
            AnonymousClass99H r2 = new AnonymousClass99H();
            this.A01 = r2;
            r2.A02 = C161527pr.A01(optJSONObject.optString("accountNumber", (String) null), "bankAccountNumber");
            this.A01.A01 = C161527pr.A01(optJSONObject.optString("bankName"), "bankName");
        }
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("IndiaUpiMerchantMethodData{version=");
        A0o.append(1);
        A0o.append(", vpaId='");
        A0o.append(this.A02);
        A0o.append('\'');
        A0o.append(", vpaHandle=");
        A0o.append(this.A00);
        A0o.append("} ");
        return AnonymousClass000.A0X(super.toString(), A0o);
    }

    public int describeContents() {
        return 0;
    }
}
