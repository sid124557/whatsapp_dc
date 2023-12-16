package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9XX  reason: invalid class name */
public class AnonymousClass9XX implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C204589pb(7);
    public final double A00;
    public final double A01;
    public final double A02;
    public final double A03;
    public final double A04;

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
        parcel.writeDouble(this.A02);
        parcel.writeDouble(this.A03);
        parcel.writeDouble(this.A04);
    }

    public AnonymousClass9XX(Parcel parcel) {
        this.A00 = parcel.readDouble();
        this.A01 = parcel.readDouble();
        this.A02 = parcel.readDouble();
        this.A03 = parcel.readDouble();
        this.A04 = parcel.readDouble();
    }

    public int describeContents() {
        return 0;
    }
}
