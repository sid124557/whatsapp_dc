package X;

import android.os.Parcel;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3H6  reason: invalid class name */
public abstract class AnonymousClass3H6 implements C85204Fi {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final String A05;

    public /* synthetic */ String B3V(C620733j r7, AnonymousClass39Q r8) {
        String str = this.A04;
        BigDecimal bigDecimal = r8.A00;
        return AnonymousClass359.A01(r7, str, this.A05, bigDecimal, bigDecimal.scale(), true);
    }

    public /* synthetic */ String B3W(C620733j r4, BigDecimal bigDecimal) {
        return AnonymousClass359.A02(r4, this.A04, this.A05, bigDecimal, true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass3H6)) {
            return false;
        }
        AnonymousClass3H6 r4 = (AnonymousClass3H6) obj;
        return this.A04.equals(r4.A04) && this.A05.equals(r4.A05) && this.A00 == r4.A00 && this.A02 == r4.A02 && this.A01 == r4.A01 && this.A03 == r4.A03;
    }

    public int hashCode() {
        return C18310x6.A09(this.A04) + C18310x6.A09(this.A05) + this.A00 + this.A02 + this.A01 + this.A03;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
    }

    public AnonymousClass3H6(JSONObject jSONObject) {
        this.A04 = jSONObject.optString("code");
        this.A05 = jSONObject.optString("symbol");
        this.A00 = jSONObject.optInt("currencyType");
        this.A02 = jSONObject.optInt("offset");
        this.A03 = jSONObject.optInt("weight");
        this.A01 = jSONObject.optInt("displayExponent");
    }

    public JSONObject Bqs() {
        JSONObject A1G = AnonymousClass0x9.A1G();
        try {
            A1G.put("code", this.A04);
            A1G.put("symbol", this.A05);
            A1G.put("offset", this.A02);
            A1G.put("displayExponent", this.A01);
            A1G.put("weight", this.A03);
            A1G.put("currencyType", this.A00);
            return A1G;
        } catch (JSONException e) {
            Log.e("PAY: BasePaymentCurrency toJsonObject threw: ", e);
            return A1G;
        }
    }

    public AnonymousClass3H6(Parcel parcel) {
        this.A00 = 0;
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A03 = parcel.readInt();
    }

    public AnonymousClass3H6(String str, String str2, int i, int i2, int i3, int i4) {
        boolean z = false;
        C626936e.A0D(C18280x3.A1U(i2, 1), "BasePaymentCurrency offset should be >= 1");
        C626936e.A0D(i3 >= 0 ? true : z, "BasePaymentCurrency display exponent should be >= 0");
        this.A04 = str;
        this.A05 = str2;
        this.A00 = i;
        this.A02 = i2;
        this.A03 = i4;
        this.A01 = i3;
    }
}
