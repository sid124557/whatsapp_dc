package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.39L  reason: invalid class name */
public class AnonymousClass39L implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass4IW.A00(3);
    public final int A00;
    public final C85204Fi A01;
    public final AnonymousClass39Q A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass39L r5 = (AnonymousClass39L) obj;
            if (this.A00 != r5.A00 || !this.A01.equals(r5.A01) || !this.A02.equals(r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int A00() {
        return (int) (this.A02.A00.doubleValue() * ((double) this.A00));
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, (31 * this.A02.hashCode()) + this.A00);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A02, 1);
        parcel.writeInt(this.A00);
        this.A01.writeToParcel(parcel, i);
    }

    public AnonymousClass39L(C85204Fi r6, int i, long j) {
        C626936e.A0E(AnonymousClass001.A1U(i), "offset must be a number greater or equal to zero");
        this.A00 = i;
        this.A01 = r6;
        this.A02 = new AnonymousClass39Q(new BigDecimal(((double) j) / ((double) i)), ((AnonymousClass3H6) r6).A01);
    }

    public JSONObject A01() {
        JSONObject A1G = AnonymousClass0x9.A1G();
        try {
            double doubleValue = this.A02.A00.doubleValue();
            int i = this.A00;
            A1G.put("value", (int) (doubleValue * ((double) i)));
            A1G.put("offset", i);
            C85204Fi r2 = this.A01;
            A1G.put("currencyType", ((AnonymousClass3H6) r2).A00);
            A1G.put("currency", r2.Bqs());
            return A1G;
        } catch (JSONException e) {
            Log.w("PAY: PaymentMoney toJson threw: ", e);
            return A1G;
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PaymentMoney{amount=");
        A0o.append(this.A02);
        A0o.append(", offset=");
        A0o.append(this.A00);
        A0o.append(", currency=");
        A0o.append(((AnonymousClass3H6) this.A01).A04);
        return AnonymousClass000.A0d(A0o);
    }

    public AnonymousClass39L(Parcel parcel) {
        this.A02 = (AnonymousClass39Q) C18280x3.A0C(parcel, AnonymousClass39Q.class);
        this.A00 = parcel.readInt();
        this.A01 = C617332a.A00(parcel);
    }
}
