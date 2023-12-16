package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.39U  reason: invalid class name */
public class AnonymousClass39U implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass4IW.A00(4);
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public AnonymousClass39U(long j, String str, String str2) {
        this(str, str2, (String) null, (String) null, (List) null, j);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A04);
        parcel.writeList(this.A05);
        parcel.writeString(this.A03);
    }

    public final List A00() {
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass39V.A03(PublicKeyCredentialControllerUtility.JSON_KEY_ID, this.A01, A0s);
        AnonymousClass39V.A03("message_id", this.A02, A0s);
        String str = this.A04;
        if (!TextUtils.isEmpty(str)) {
            AnonymousClass39V.A03("payment_config_id", str, A0s);
        }
        return A0s;
    }

    public int describeContents() {
        return 0;
    }

    public AnonymousClass39U(JSONObject jSONObject) {
        ArrayList arrayList;
        this.A01 = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        this.A02 = jSONObject.optString("message_id");
        this.A00 = jSONObject.optLong("expiry_ts");
        this.A04 = jSONObject.optString("payment_config_id");
        JSONArray optJSONArray = jSONObject.optJSONArray("beneficiaries");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            arrayList = null;
        } else {
            arrayList = AnonymousClass001.A0s();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject A13 = AnonymousClass0x7.A13(optJSONArray, i);
                String optString = A13.optString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                String optString2 = A13.optString("address_line1");
                String optString3 = A13.optString("address_line2");
                String optString4 = A13.optString("city");
                String optString5 = A13.optString("state");
                String optString6 = A13.optString("country");
                String optString7 = A13.optString("postal_code");
                C18280x3.A16(optString, optString2, optString3);
                C18280x3.A16(optString4, optString5, optString6);
                C162457s7.A0H(optString7);
                arrayList.add(new AnonymousClass38Y(optString, optString2, optString3, optString4, optString5, optString6, optString7));
            }
        }
        this.A05 = arrayList;
        this.A03 = jSONObject.optString("order-type");
    }

    public AnonymousClass39U(Parcel parcel) {
        this.A01 = C18310x6.A0l(parcel);
        this.A02 = C18310x6.A0l(parcel);
        this.A00 = parcel.readLong();
        this.A04 = parcel.readString();
        ArrayList A0s = AnonymousClass001.A0s();
        this.A05 = A0s;
        C18320x8.A12(parcel, AnonymousClass38Y.class, A0s);
        this.A03 = parcel.readString();
    }

    public AnonymousClass39U(String str, String str2, String str3, String str4, List list, long j) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = j;
        this.A04 = str3;
        this.A05 = list;
        this.A03 = str4;
    }
}
