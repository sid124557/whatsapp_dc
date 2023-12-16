package X;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* renamed from: X.3SP  reason: invalid class name */
public class AnonymousClass3SP implements C85184Fg {
    public static final Parcelable.Creator CREATOR = AnonymousClass4IW.A00(18);
    public final String A00;
    public final String A01;
    public final String A02;

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public AnonymousClass3SP(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public JSONObject Bqs() {
        JSONObject A1G = AnonymousClass0x9.A1G();
        A1G.put("uri", this.A02);
        A1G.put("cancel_url", this.A00);
        A1G.put("success_url", this.A01);
        return A1G;
    }

    public int describeContents() {
        return 0;
    }

    public AnonymousClass3SP(Parcel parcel) {
        this.A02 = C18310x6.A0l(parcel);
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
