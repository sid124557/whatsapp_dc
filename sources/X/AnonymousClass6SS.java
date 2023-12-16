package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6SS  reason: invalid class name */
public final class AnonymousClass6SS extends C1695389r {
    public static final Parcelable.Creator CREATOR = new AnonymousClass7v4();
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public AnonymousClass6SS(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A00 = z;
        this.A01 = z2;
        this.A02 = z3;
        this.A03 = z4;
        this.A04 = z5;
        this.A05 = z6;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A09(parcel, 1, this.A00);
        C162417s1.A09(parcel, 2, this.A01);
        C162417s1.A09(parcel, 3, this.A02);
        C162417s1.A09(parcel, 4, this.A03);
        C162417s1.A09(parcel, 5, this.A04);
        C162417s1.A09(parcel, 6, this.A05);
        C162417s1.A06(parcel, A002);
    }
}
