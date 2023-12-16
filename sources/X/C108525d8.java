package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.5d8  reason: invalid class name and case insensitive filesystem */
public final class C108525d8 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C108295cl();
    public final Integer A00;
    public final Integer A01;
    public final String A02;

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A02);
        Integer num = this.A00;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.A01;
        if (num2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(num2.intValue());
    }

    public int describeContents() {
        return 0;
    }

    public C108525d8(Integer num, Integer num2, String str) {
        this.A02 = str;
        this.A00 = num;
        this.A01 = num2;
    }
}
