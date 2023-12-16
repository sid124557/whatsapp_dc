package com.whatsapp.location;

import X.C162457s7;
import X.C165527xD;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;

public final class PlaceInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C165527xD();
    public double A00;
    public double A01;
    public double A02;
    public int A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public transient Location A0C;
    public transient Object A0D;

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A08);
        parcel.writeDouble(this.A01);
        parcel.writeDouble(this.A02);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A07);
        parcel.writeString(this.A04);
        parcel.writeString(this.A09);
        parcel.writeString(this.A05);
        parcel.writeDouble(this.A00);
        parcel.writeInt(this.A03);
    }

    public int describeContents() {
        return 0;
    }

    public PlaceInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, double d, double d2, double d3, int i) {
        this.A06 = str;
        this.A0B = str2;
        this.A08 = str3;
        this.A01 = d;
        this.A02 = d2;
        this.A0A = str4;
        this.A07 = str5;
        this.A04 = str6;
        this.A09 = str7;
        this.A05 = str8;
        this.A00 = d3;
        this.A03 = i;
    }

    public PlaceInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0.0d, 0.0d, 0.0d, 0);
    }
}
