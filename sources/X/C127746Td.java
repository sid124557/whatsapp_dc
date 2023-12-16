package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6Td  reason: invalid class name and case insensitive filesystem */
public class C127746Td extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164487vX();
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;

    public C127746Td(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.A01 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A00 = str4;
        this.A03 = str5;
        this.A02 = str6;
        this.A06 = str7;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        boolean A07 = C1695389r.A07(parcel, this.A01);
        C162417s1.A0B(parcel, this.A05, 3, A07);
        C162417s1.A0B(parcel, this.A04, 4, A07);
        C162417s1.A0B(parcel, this.A00, 5, A07);
        C162417s1.A0B(parcel, this.A03, 6, A07);
        C162417s1.A0B(parcel, this.A02, 7, A07);
        C162417s1.A0B(parcel, this.A06, 8, A07);
        C162417s1.A06(parcel, A002);
    }

    public C127746Td() {
    }
}
