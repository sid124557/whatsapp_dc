package X;

import android.os.Parcel;
import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6hy  reason: invalid class name and case insensitive filesystem */
public final class C133806hy extends AnonymousClass1S4 {
    public static final C165547xF CREATOR = new C165547xF();
    public long A00;
    public String A01;

    public void A06(List list, int i) {
        C162457s7.A0J(list, 1);
        String str = this.A01;
        if (str != null) {
            list.add(new AnonymousClass39V("psp_transaction_id", str));
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A01);
    }

    public String A03() {
        return null;
    }

    public void A04(C617332a r3, AnonymousClass36K r4, int i) {
        String A0r;
        if (r4 != null && (A0r = r4.A0r("psp_transaction_id", (String) null)) != null) {
            this.A01 = A0r;
        }
    }

    public int A07() {
        return 0;
    }

    public int A08() {
        return 0;
    }

    public int A09() {
        return 0;
    }

    public long A0B() {
        return this.A00;
    }

    public String A0K() {
        return null;
    }

    public String A0L() {
        return null;
    }

    public String A0M() {
        return null;
    }

    public String A0O() {
        return null;
    }

    public void A0Q(int i) {
    }

    public void A0R(int i) {
    }

    public void A0S(int i) {
    }

    public void A0U(long j) {
        this.A00 = j;
    }

    public void A0Y(String str) {
    }

    public void A0Z(String str) {
    }

    public void A0a(String str) {
    }

    public String A0N() {
        try {
            JSONObject A0P = A0P();
            A0P.put("expiryTs", this.A00);
            String str = this.A01;
            if (str != null) {
                A0P.put("pspTransactionId", str);
            }
            return A0P.toString();
        } catch (JSONException e) {
            Log.w("PAY: BrazilTransactionCountryData toDBString threw: ", e);
            return null;
        }
    }
}
