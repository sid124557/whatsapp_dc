package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.398  reason: invalid class name */
public class AnonymousClass398 implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass4IW.A00(33);
    public final String A00;
    public final String A01;

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public AnonymousClass398(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public AnonymousClass398(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
