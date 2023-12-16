package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: X.3SR  reason: invalid class name */
public class AnonymousClass3SR implements C85184Fg {
    public static final Parcelable.Creator CREATOR = AnonymousClass4IW.A00(19);
    public String A00;
    public String A01;
    public String A02;
    public String A03;

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
    }

    public AnonymousClass3SR(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public JSONObject Bqs() {
        JSONObject A1G = AnonymousClass0x9.A1G();
        String str = this.A00;
        if (!TextUtils.isEmpty(str)) {
            A1G.put("code", str);
        }
        A1G.put("merchant_name", this.A01);
        A1G.put("key", this.A02);
        A1G.put("key_type", this.A03);
        return A1G;
    }

    public int describeContents() {
        return 0;
    }

    public AnonymousClass3SR(String str, String str2, String str3, String str4) {
        this.A00 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A01 = str4;
    }
}
