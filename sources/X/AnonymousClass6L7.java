package X;

import android.os.Parcel;

/* renamed from: X.6L7  reason: invalid class name */
public class AnonymousClass6L7 extends C165847xj {
    public String A00;

    public AnonymousClass6L7(Parcel parcel) {
        this.A00 = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
    }

    public AnonymousClass6L7(String str) {
        this.A00 = str;
    }
}
