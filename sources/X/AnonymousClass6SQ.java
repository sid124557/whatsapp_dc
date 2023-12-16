package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6SQ  reason: invalid class name */
public class AnonymousClass6SQ extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163567u1();
    public final int A00;
    public final AnonymousClass6SP A01;
    public final boolean A02;
    public final boolean A03;
    public final int[] A04;
    public final int[] A05;

    public AnonymousClass6SQ(AnonymousClass6SP r1, int[] iArr, int[] iArr2, int i, boolean z, boolean z2) {
        this.A01 = r1;
        this.A02 = z;
        this.A03 = z2;
        this.A04 = iArr;
        this.A00 = i;
        this.A05 = iArr2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0A(parcel, this.A01, 1, i, false);
        C162417s1.A09(parcel, 2, this.A02);
        C162417s1.A09(parcel, 3, this.A03);
        C1695389r.A05(parcel, this.A04, 4);
        C162417s1.A07(parcel, 5, this.A00);
        C1695389r.A05(parcel, this.A05, 6);
        C162417s1.A06(parcel, A002);
    }
}
