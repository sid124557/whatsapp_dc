package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.5dB  reason: invalid class name and case insensitive filesystem */
public final class C108555dB implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C108215cd();
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A05);
    }

    public int describeContents() {
        return 0;
    }

    public C108555dB(String str, String str2, String str3, String str4, String str5, String str6) {
        this.A04 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A00 = str4;
        this.A02 = str5;
        this.A05 = str6;
    }
}
