package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7xn  reason: invalid class name and case insensitive filesystem */
public final class C165887xn implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C165737xY();
    public final long A00;
    public final long A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeLong(this.A02);
        parcel.writeString(this.A08);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
    }

    public int describeContents() {
        return 0;
    }

    public C165887xn(String str, String str2, String str3, String str4, String str5, String str6, long j, long j2, long j3) {
        this.A02 = j;
        this.A08 = str;
        this.A00 = j2;
        this.A01 = j3;
        this.A03 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A05 = str5;
        this.A04 = str6;
    }
}
