package X;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* renamed from: X.3SQ  reason: invalid class name */
public class AnonymousClass3SQ implements C85184Fg {
    public static final Parcelable.Creator CREATOR = AnonymousClass4IW.A00(20);
    public final AnonymousClass3SP A00;
    public final String A01;
    public final String A02;

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }

    public AnonymousClass3SQ(AnonymousClass3SP r1, String str, String str2) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = r1;
    }

    public JSONObject Bqs() {
        JSONObject A1G = AnonymousClass0x9.A1G();
        A1G.put("tr", this.A02);
        A1G.put("configuration_name", this.A01);
        AnonymousClass3SP r0 = this.A00;
        if (r0 != null) {
            A1G.put("payment_link", r0.Bqs());
        }
        return A1G;
    }

    public int describeContents() {
        return 0;
    }

    public AnonymousClass3SQ(Parcel parcel) {
        this.A02 = C18310x6.A0l(parcel);
        this.A01 = C18310x6.A0l(parcel);
        this.A00 = (AnonymousClass3SP) C18280x3.A0C(parcel, AnonymousClass3SP.class);
    }
}
