package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7yU  reason: invalid class name and case insensitive filesystem */
public class C166317yU implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(84);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A03);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public C166317yU(Parcel parcel) {
        this.A03 = parcel.readInt();
        this.A05 = C18310x6.A0l(parcel);
        this.A06 = AnonymousClass001.A1T(parcel.readInt());
        this.A04 = C18310x6.A0l(parcel);
        this.A02 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public C166317yU(String str, String str2, int i, int i2, int i3, int i4, boolean z) {
        this.A03 = i;
        this.A05 = str;
        this.A06 = z;
        this.A04 = str2;
        this.A02 = i2;
        this.A00 = i3;
        this.A01 = i4;
    }
}
