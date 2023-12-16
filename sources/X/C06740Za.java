package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Za  reason: invalid class name and case insensitive filesystem */
public class C06740Za implements Parcelable {
    public static final Parcelable.Creator CREATOR = C17960wW.A00(18);
    public int A00;
    public String A01;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
    }

    public C06740Za(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }

    public C06740Za(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = parcel.readInt();
    }
}
