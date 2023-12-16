package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.5d7  reason: invalid class name and case insensitive filesystem */
public final class C108515d7 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C108285ck();
    public final String A00;
    public final String A01;

    public C108515d7(String str, String str2) {
        C162457s7.A0J(str, 1);
        this.A00 = str;
        this.A01 = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public int describeContents() {
        return 0;
    }
}
