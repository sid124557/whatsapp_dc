package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* renamed from: X.4lC  reason: invalid class name and case insensitive filesystem */
public class C91824lC extends C166447yh {
    public static final Parcelable.Creator CREATOR = new AnonymousClass91V(116);
    public String A00;
    public boolean A01;
    public final String A02;
    public final String A03;

    public static C91824lC A00(JSONObject jSONObject) {
        String string = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        C626936e.A05(string);
        String string2 = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        C626936e.A05(string2);
        return new C91824lC(string, string2, jSONObject.optString("icon_url", ""), jSONObject.optString("bg_color"), jSONObject.optString("parent_name"), jSONObject.optBoolean("is_root", false));
    }

    public C91824lC(Parcel parcel) {
        super(parcel);
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
    }

    public C91824lC(String str, String str2) {
        super(str, str2);
        this.A03 = "";
        this.A02 = null;
    }

    public C91824lC(String str, String str2, String str3, String str4, String str5, boolean z) {
        super(str, str2);
        this.A03 = str3;
        this.A00 = str5;
        this.A01 = z;
        this.A02 = str4;
    }
}
