package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.392  reason: invalid class name */
public class AnonymousClass392 implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass4IW.A00(28);
    public final String A00;

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }

    public AnonymousClass392(Parcel parcel) {
        this.A00 = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public AnonymousClass392(String str) {
        this.A00 = str;
    }
}
