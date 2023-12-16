package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7yR  reason: invalid class name and case insensitive filesystem */
public class C166287yR implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(76);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
    }

    public C166287yR(Parcel parcel) {
        this.A01 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A00 = parcel.readInt();
    }

    public C166287yR(int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
    }
}
