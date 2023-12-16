package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6hq  reason: invalid class name and case insensitive filesystem */
public class C133726hq extends C166587yw {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(105);
    public final String A00;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        super.writeToParcel(parcel, i);
    }

    public C133726hq(String str, String str2) {
        this.A00 = str;
        A0D(str2);
    }

    public C133726hq(Parcel parcel) {
        this.A00 = parcel.readString();
        A0C(parcel);
    }

    public C133726hq(C161357pU r1, C133796hx r2, String str, String str2, String str3) {
        this.A00 = str;
        C626936e.A06(r1);
        this.A07 = r1;
        this.A08 = r2;
        A0D(str3);
        this.A0A = str2;
    }
}
