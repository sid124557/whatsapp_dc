package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.38Y  reason: invalid class name */
public class AnonymousClass38Y implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C629637k();
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A06);
        parcel.writeString(this.A03);
        parcel.writeString(this.A05);
    }

    public AnonymousClass38Y(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C18260x0.A0f(str, str2, str3, str4, str5);
        C18260x0.A0U(str6, str7);
        this.A04 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A02 = str4;
        this.A06 = str5;
        this.A03 = str6;
        this.A05 = str7;
    }

    public static void A00(AnonymousClass38Y r2, Object obj, JSONArray jSONArray, JSONObject jSONObject) {
        jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, obj);
        jSONObject.put("address_line1", r2.A00);
        jSONObject.put("address_line2", r2.A01);
        jSONObject.put("city", r2.A02);
        jSONObject.put("state", r2.A06);
        jSONObject.put("country", r2.A03);
        jSONObject.put("postal_code", r2.A05);
        jSONArray.put(jSONObject);
    }

    public int describeContents() {
        return 0;
    }
}
