package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6Th  reason: invalid class name and case insensitive filesystem */
public class C127786Th extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164477vW();
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;

    public C127786Th(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.A05 = str;
        this.A07 = str2;
        this.A0D = str3;
        this.A0B = str4;
        this.A08 = str5;
        this.A02 = str6;
        this.A00 = str7;
        this.A01 = str8;
        this.A03 = str9;
        this.A0C = str10;
        this.A09 = str11;
        this.A06 = str12;
        this.A04 = str13;
        this.A0A = str14;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        boolean A072 = C1695389r.A07(parcel, this.A05);
        C162417s1.A0B(parcel, this.A07, 3, A072);
        C162417s1.A0B(parcel, this.A0D, 4, A072);
        C162417s1.A0B(parcel, this.A0B, 5, A072);
        C162417s1.A0B(parcel, this.A08, 6, A072);
        C162417s1.A0B(parcel, this.A02, 7, A072);
        C162417s1.A0B(parcel, this.A00, 8, A072);
        C162417s1.A0B(parcel, this.A01, 9, A072);
        C162417s1.A0B(parcel, this.A03, 10, A072);
        C162417s1.A0B(parcel, this.A0C, 11, A072);
        C162417s1.A0B(parcel, this.A09, 12, A072);
        C162417s1.A0B(parcel, this.A06, 13, A072);
        C162417s1.A0B(parcel, this.A04, 14, A072);
        C162417s1.A0B(parcel, this.A0A, 15, A072);
        C162417s1.A06(parcel, A002);
    }

    public C127786Th() {
    }
}
