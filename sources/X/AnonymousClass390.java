package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.390  reason: invalid class name */
public class AnonymousClass390 implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass4IW.A00(13);
    public final int A00;

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
    }

    public AnonymousClass390(Parcel parcel) {
        this.A00 = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public AnonymousClass390(int i) {
        this.A00 = i;
    }
}
