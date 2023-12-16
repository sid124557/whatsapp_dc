package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6SG  reason: invalid class name */
public final class AnonymousClass6SG extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164727vv();
    public final int A00;
    public final boolean A01;
    public final boolean A02;

    public AnonymousClass6SG(int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = z;
        this.A02 = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 2, this.A00);
        C162417s1.A09(parcel, 3, this.A01);
        C162417s1.A09(parcel, 4, this.A02);
        C162417s1.A06(parcel, A002);
    }
}
