package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6Tn  reason: invalid class name and case insensitive filesystem */
public final class C127846Tn extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164147ux();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;

    public C127846Tn(int i, int i2, int i3, long j, int i4) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A04 = j;
        this.A03 = i4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 2, this.A00);
        C162417s1.A07(parcel, 3, this.A01);
        C162417s1.A07(parcel, 4, this.A02);
        C162417s1.A08(parcel, 5, this.A04);
        C162417s1.A07(parcel, 6, this.A03);
        C162417s1.A06(parcel, A002);
    }

    public C127846Tn() {
    }
}
