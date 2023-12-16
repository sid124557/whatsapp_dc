package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6SP  reason: invalid class name */
public class AnonymousClass6SP extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163547tz();
    public final int A00;
    public final int A01;
    public final int A02;
    public final boolean A03;
    public final boolean A04;

    public AnonymousClass6SP(int i, int i2, int i3, boolean z, boolean z2) {
        this.A00 = i;
        this.A03 = z;
        this.A04 = z2;
        this.A01 = i2;
        this.A02 = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 1, this.A00);
        C162417s1.A09(parcel, 2, this.A03);
        C162417s1.A09(parcel, 3, this.A04);
        C162417s1.A07(parcel, 4, this.A01);
        C162417s1.A07(parcel, 5, this.A02);
        C162417s1.A06(parcel, A002);
    }
}
