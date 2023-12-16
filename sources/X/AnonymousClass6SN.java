package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6SN  reason: invalid class name */
public final class AnonymousClass6SN extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164337vI();
    public final int A00;
    public final long A01;
    public final boolean A02;
    public final AnonymousClass6SE[] A03;

    public AnonymousClass6SN(AnonymousClass6SE[] r2, int i, long j, boolean z) {
        this.A01 = j;
        this.A03 = r2;
        this.A02 = z;
        if (z) {
            this.A00 = i;
        } else {
            this.A00 = -1;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A08(parcel, 2, this.A01);
        C162417s1.A0F(parcel, this.A03, 3, i);
        C162417s1.A07(parcel, 4, this.A00);
        C162417s1.A09(parcel, 5, this.A02);
        C162417s1.A06(parcel, A002);
    }
}
