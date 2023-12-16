package X;

import android.os.Parcel;

/* renamed from: X.6L6  reason: invalid class name */
public class AnonymousClass6L6 extends C165847xj {
    public Exception A00;
    public String A01;

    public AnonymousClass6L6(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = (Exception) parcel.readSerializable();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A01);
        parcel.writeSerializable(this.A00);
    }
}
