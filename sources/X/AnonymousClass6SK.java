package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6SK  reason: invalid class name */
public class AnonymousClass6SK extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163267tX();
    public long A00;
    public boolean A01;
    public final int A02;
    public final boolean A03;

    public AnonymousClass6SK(int i, long j, boolean z, boolean z2) {
        this.A02 = i;
        this.A01 = z;
        this.A00 = j;
        this.A03 = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 1, this.A02);
        C162417s1.A09(parcel, 2, this.A01);
        C162417s1.A08(parcel, 3, this.A00);
        C162417s1.A09(parcel, 4, this.A03);
        C162417s1.A06(parcel, A002);
    }
}
