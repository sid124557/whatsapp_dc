package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0ZY  reason: invalid class name */
public class AnonymousClass0ZY implements Parcelable {
    public static final Parcelable.Creator CREATOR = C17960wW.A00(13);
    public int A00;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
    }

    public AnonymousClass0ZY(Parcel parcel) {
        this.A00 = parcel.readInt();
    }

    public AnonymousClass0ZY() {
    }
}
