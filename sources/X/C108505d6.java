package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.5d6  reason: invalid class name and case insensitive filesystem */
public final class C108505d6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C108275cj();
    public final String A00;
    public final String A01;

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public int describeContents() {
        return 0;
    }

    public C108505d6(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
