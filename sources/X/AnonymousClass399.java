package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.399  reason: invalid class name */
public class AnonymousClass399 implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass4IW.A00(11);
    public String A00;
    public final String A01;
    public final String A02;

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public AnonymousClass399(String str, String str2, String str3) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
    }

    public int describeContents() {
        return 0;
    }

    public AnonymousClass399(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
    }
}
