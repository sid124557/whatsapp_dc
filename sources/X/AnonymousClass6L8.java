package X;

import android.os.Parcel;

/* renamed from: X.6L8  reason: invalid class name */
public class AnonymousClass6L8 extends C165847xj {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public AnonymousClass6L8(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }

    public AnonymousClass6L8(String str, String str2, String str3, int i, int i2) {
        this.A02 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A01 = i;
        this.A00 = i2;
    }
}
