package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6Te  reason: invalid class name and case insensitive filesystem */
public class C127756Te extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164437vS();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public String A06;
    public boolean A07;

    public C127756Te(String str, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        this.A05 = i;
        this.A03 = i2;
        this.A00 = i3;
        this.A01 = i4;
        this.A02 = i5;
        this.A04 = i6;
        this.A07 = z;
        this.A06 = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 2, this.A05);
        C162417s1.A07(parcel, 3, this.A03);
        C162417s1.A07(parcel, 4, this.A00);
        C162417s1.A07(parcel, 5, this.A01);
        C162417s1.A07(parcel, 6, this.A02);
        C162417s1.A07(parcel, 7, this.A04);
        C162417s1.A09(parcel, 8, this.A07);
        C162417s1.A0B(parcel, this.A06, 9, false);
        C162417s1.A06(parcel, A002);
    }

    public C127756Te() {
    }
}
