package X;

import android.os.Parcel;
import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6hz  reason: invalid class name and case insensitive filesystem */
public final class C133816hz extends AnonymousClass1S4 {
    public static final C165557xG CREATOR = new C165557xG();
    public int A00;
    public int A01;
    public long A02;
    public String A03;
    public String A04;

    public void A06(List list, int i) {
        C162457s7.A0J(list, 1);
        String str = this.A04;
        if (str != null) {
            list.add(new AnonymousClass39V("psp_transaction_id", str));
        }
        String str2 = this.A03;
        if (str2 != null) {
            list.add(new AnonymousClass39V("psp_receipt_url", str2));
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
    }

    public String A03() {
        return null;
    }

    public void A04(C617332a r3, AnonymousClass36K r4, int i) {
        if (r4 != null) {
            String A0r = r4.A0r("psp_transaction_id", (String) null);
            if (A0r != null) {
                this.A04 = A0r;
            }
            String A0r2 = r4.A0r("psp_receipt_url", (String) null);
            if (A0r2 != null) {
                this.A03 = A0r2;
            }
        }
    }

    public int A07() {
        return this.A00;
    }

    public int A08() {
        return this.A01;
    }

    public int A09() {
        return 0;
    }

    public long A0B() {
        return this.A02;
    }

    public String A0J() {
        return this.A04;
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
        this.A00 = i;
    }

    public void A0R(int i) {
        this.A01 = i;
    }

    public void A0S(int i) {
    }

    public void A0U(long j) {
        this.A02 = j;
    }

    public void A0Y(String str) {
    }

    public void A0Z(String str) {
    }

    public void A0a(String str) {
    }

    public void A05(String str) {
        super.A05(str);
        JSONObject A1H = AnonymousClass0x9.A1H(str);
        this.A04 = A1H.optString("pspTransactionId", this.A04);
        this.A03 = A1H.optString("pspReceiptURL", this.A03);
    }

    public String A0N() {
        try {
            JSONObject A0P = A0P();
            String str = this.A04;
            if (str != null) {
                A0P.put("pspTransactionId", str);
            }
            String str2 = this.A03;
            if (str2 != null) {
                A0P.put("pspReceiptURL", str2);
            }
            return A0P.toString();
        } catch (JSONException e) {
            Log.w("PAY: P2mLiteTransactionMetadata metaDataToDbString threw: ", e);
            return null;
        }
    }

    public void A0W(AnonymousClass1S4 r2) {
        super.A0W(r2);
        C133816hz r22 = (C133816hz) r2;
        String str = r22.A04;
        if (str != null) {
            this.A04 = str;
        }
        String str2 = r22.A03;
        if (str2 != null) {
            this.A03 = str2;
        }
    }
}
