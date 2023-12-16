package X;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;

/* renamed from: X.39N  reason: invalid class name */
public class AnonymousClass39N implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass4IW.A00(31);
    public AnonymousClass22W A00;
    public AnonymousClass397 A01;
    public String A02;
    public String A03;
    public String A04;
    public final int A05;

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A05);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A01, i);
        AnonymousClass22W r0 = this.A00;
        if (r0 != null) {
            i2 = r0.value;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
    }

    public AnonymousClass39N(AnonymousClass22W r3, AnonymousClass397 r4, String str) {
        String str2;
        String str3;
        this.A04 = str;
        this.A01 = r4;
        this.A05 = 2;
        this.A00 = r3;
        if (r4 != null && (str2 = r4.A01) != null) {
            try {
                str3 = AnonymousClass0x9.A1H(str2).optString("description");
            } catch (JSONException unused) {
                str3 = null;
            }
            this.A02 = str3;
        }
    }

    public int describeContents() {
        return 0;
    }

    public AnonymousClass39N(Parcel parcel) {
        AnonymousClass22W r0;
        this.A04 = parcel.readString();
        this.A02 = parcel.readString();
        this.A05 = parcel.readInt();
        this.A03 = parcel.readString();
        this.A01 = (AnonymousClass397) C18280x3.A0C(parcel, AnonymousClass397.class);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            r0 = AnonymousClass22W.DEFAULT;
        } else if (readInt != 1) {
            r0 = null;
        } else {
            r0 = AnonymousClass22W.EXTENSIONS_1;
        }
        this.A00 = r0;
    }

    public AnonymousClass39N(String str, String str2, String str3, int i) {
        this.A04 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A05 = i;
    }
}
