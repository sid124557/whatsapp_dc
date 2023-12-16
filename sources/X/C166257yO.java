package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7yO  reason: invalid class name and case insensitive filesystem */
public class C166257yO implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(103);
    public final String A00;
    public final String A01;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public C166257yO(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public C166257yO(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
