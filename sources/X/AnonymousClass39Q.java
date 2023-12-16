package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.39Q  reason: invalid class name */
public class AnonymousClass39Q implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass4IW.A00(0);
    public final BigDecimal A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                BigDecimal bigDecimal = this.A00;
                BigDecimal bigDecimal2 = ((AnonymousClass39Q) obj).A00;
                if (bigDecimal == null) {
                    if (bigDecimal2 != null) {
                        return false;
                    }
                } else if (bigDecimal.compareTo(bigDecimal2) != 0) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static AnonymousClass39Q A00(String str, int i) {
        try {
            return new AnonymousClass39Q(new BigDecimal(str), i);
        } catch (NumberFormatException e) {
            Log.i("Pay: PaymentTransactionInfo.MethodInfo createFromParcel threw: ", e);
            return null;
        }
    }

    public boolean A02() {
        BigDecimal bigDecimal = this.A00;
        if (bigDecimal == null || bigDecimal.compareTo(BigDecimal.ZERO) < 0) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return 31 + AnonymousClass000.A07(this.A00);
    }

    public String toString() {
        return this.A00.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.A00);
    }

    public AnonymousClass39Q(Parcel parcel) {
        this.A00 = (BigDecimal) parcel.readSerializable();
    }

    public JSONObject A01() {
        JSONObject A1G = AnonymousClass0x9.A1G();
        try {
            C18300x5.A1L(this, "amount", A1G);
            return A1G;
        } catch (JSONException e) {
            Log.e("PAY: BasePaymentCurrency toJsonObject threw: ", e);
            return A1G;
        }
    }

    public int describeContents() {
        return 0;
    }

    public AnonymousClass39Q(BigDecimal bigDecimal, int i) {
        this.A00 = bigDecimal.setScale(i, 6);
    }
}
