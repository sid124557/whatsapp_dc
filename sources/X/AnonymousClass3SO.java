package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3SO  reason: invalid class name */
public class AnonymousClass3SO implements C85184Fg {
    public static final Parcelable.Creator CREATOR = AnonymousClass4IW.A00(17);
    public final String A00;
    public final String A01;
    public final JSONObject A02;

    public void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        JSONObject jSONObject = this.A02;
        if (jSONObject != null) {
            str = jSONObject.toString();
        } else {
            str = "";
        }
        parcel.writeString(str);
    }

    public AnonymousClass3SO(String str, String str2, JSONObject jSONObject) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = jSONObject;
    }

    public JSONObject Bqs() {
        JSONObject A1G = AnonymousClass0x9.A1G();
        String str = this.A01;
        A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        A1G.put("configuration_name", this.A00);
        A1G.put(str, this.A02);
        return A1G;
    }

    public int describeContents() {
        return 0;
    }

    public AnonymousClass3SO(Parcel parcel) {
        this.A01 = C18310x6.A0l(parcel);
        this.A00 = C18310x6.A0l(parcel);
        String readString = parcel.readString();
        JSONObject jSONObject = null;
        if (!TextUtils.isEmpty(readString)) {
            try {
                jSONObject = AnonymousClass0x9.A1H(readString);
            } catch (JSONException unused) {
                Log.w("Error parsing json string");
            }
        }
        this.A02 = jSONObject;
    }
}
