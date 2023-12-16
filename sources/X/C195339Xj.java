package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.9Xj  reason: invalid class name and case insensitive filesystem */
public class C195339Xj implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C204589pb(23);
    public final int A00;
    public final C51872kW A01;
    public final C51882kX A02;
    public final C51892kY A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final boolean A0C;

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0A);
        parcel.writeList(this.A0B);
        parcel.writeString(this.A09);
        parcel.writeString(this.A08);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        C51892kY r1 = this.A03;
        parcel.writeByte(r1.A01 ? (byte) 1 : 0);
        TextUtils.writeToParcel(r1.A00, parcel, i);
        parcel.writeInt(this.A00);
        C51872kW r12 = this.A01;
        parcel.writeByte(r12.A01 ? (byte) 1 : 0);
        TextUtils.writeToParcel(r12.A00, parcel, i);
        C51882kX r13 = this.A02;
        parcel.writeByte(r13.A01 ? (byte) 1 : 0);
        TextUtils.writeToParcel(r13.A00, parcel, i);
        parcel.writeInt(this.A0C ? 1 : 0);
    }

    public C195339Xj(Parcel parcel) {
        this.A0A = parcel.readString();
        ArrayList A0s = AnonymousClass001.A0s();
        this.A0B = A0s;
        parcel.readList(A0s, String.class.getClassLoader());
        this.A09 = parcel.readString();
        this.A08 = parcel.readString();
        this.A07 = parcel.readString();
        this.A06 = parcel.readString();
        this.A05 = parcel.readString();
        this.A04 = parcel.readString();
        boolean z = false;
        this.A03 = new C51892kY((SpannableString) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), AnonymousClass000.A1S(parcel.readByte()));
        this.A00 = parcel.readInt();
        this.A01 = new C51872kW((SpannableString) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), AnonymousClass000.A1S(parcel.readByte()));
        this.A02 = new C51882kX((SpannableString) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), AnonymousClass000.A1S(parcel.readByte()));
        this.A0C = parcel.readInt() == 1 ? true : z;
    }

    public int describeContents() {
        return 0;
    }

    public C195339Xj(JSONObject jSONObject) {
        this.A0A = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        JSONArray jSONArray = jSONObject.getJSONArray("url_regex_list");
        this.A0B = AnonymousClass001.A0s();
        for (int i = 0; i < jSONArray.length(); i++) {
            this.A0B.add(jSONArray.getString(i));
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("title");
        this.A09 = jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        this.A08 = jSONObject2.getString("default_text");
        JSONObject jSONObject3 = jSONObject.getJSONObject("subtitle");
        this.A07 = jSONObject3.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        this.A06 = jSONObject3.getString("default_text");
        JSONObject jSONObject4 = jSONObject.getJSONObject("button");
        this.A05 = jSONObject4.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        this.A04 = jSONObject4.getString("default_text");
        this.A03 = new C51892kY((SpannableString) null, false);
        this.A00 = 0;
        this.A01 = new C51872kW((SpannableString) null, false);
        this.A02 = new C51882kX((SpannableString) null, false);
        this.A0C = true;
    }

    public C195339Xj(C51872kW r4, C51882kX r5, C51892kY r6, String str, String str2, String str3, String str4, int i) {
        this.A0A = str;
        this.A0B = null;
        this.A09 = "";
        this.A08 = str2;
        this.A07 = "";
        this.A06 = str3;
        this.A05 = "";
        this.A04 = str4;
        this.A03 = r6;
        this.A01 = r4;
        this.A02 = r5;
        this.A00 = i;
        this.A0C = false;
    }
}
