package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6Tb  reason: invalid class name and case insensitive filesystem */
public class C127726Tb extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164457vU();
    public C127756Te A00;
    public C127756Te A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;

    public C127726Tb(C127756Te r1, C127756Te r2, String str, String str2, String str3, String str4, String str5) {
        this.A06 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A01 = r1;
        this.A00 = r2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        boolean A07 = C1695389r.A07(parcel, this.A06);
        C162417s1.A0B(parcel, this.A02, 3, A07);
        C162417s1.A0B(parcel, this.A03, 4, A07);
        C162417s1.A0B(parcel, this.A04, 5, A07);
        C162417s1.A0B(parcel, this.A05, 6, A07);
        C162417s1.A0A(parcel, this.A01, 7, i, A07);
        C162417s1.A0A(parcel, this.A00, 8, i, A07);
        C162417s1.A06(parcel, A002);
    }

    public C127726Tb() {
    }
}
