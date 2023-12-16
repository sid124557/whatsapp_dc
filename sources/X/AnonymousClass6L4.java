package X;

import android.os.Parcel;

/* renamed from: X.6L4  reason: invalid class name */
public class AnonymousClass6L4 extends C165847xj {
    public String A00;

    public AnonymousClass6L4(Parcel parcel) {
        this.A00 = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
    }
}
