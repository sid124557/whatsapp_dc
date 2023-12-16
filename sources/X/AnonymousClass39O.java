package X;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* renamed from: X.39O  reason: invalid class name */
public class AnonymousClass39O implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass4IW.A00(2);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
    }

    public AnonymousClass39O(JSONObject jSONObject) {
        this.A02 = jSONObject.optString("offer-id");
        this.A01 = jSONObject.optString("offer-claim-id");
        this.A03 = jSONObject.optString("parent-transaction-id");
        this.A00 = jSONObject.optString("incentive-payment-id");
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PaymentIncentiveData{offerId='");
        char A012 = C18300x5.A01(this.A02, A0o);
        A0o.append(", offerClaimId='");
        A0o.append(this.A01);
        A0o.append(A012);
        A0o.append(", parentTransactionId='");
        A0o.append(this.A03);
        A0o.append(A012);
        A0o.append(", incentiveTransactionId='");
        A0o.append(this.A00);
        A0o.append(A012);
        return AnonymousClass000.A0d(A0o);
    }

    public AnonymousClass39O(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A03 = parcel.readString();
    }

    public AnonymousClass39O(String str, String str2, String str3, String str4) {
        this.A02 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A00 = str4;
    }
}
