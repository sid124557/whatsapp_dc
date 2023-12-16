package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6Rj  reason: invalid class name and case insensitive filesystem */
public final class C127286Rj extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164867w9();
    public final int A00;

    public C127286Rj(int i) {
        this.A00 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 2, this.A00);
        C162417s1.A06(parcel, A002);
    }
}
