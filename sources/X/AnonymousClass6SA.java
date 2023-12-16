package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6SA  reason: invalid class name */
public final class AnonymousClass6SA extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164927wF();
    public final int A00;
    public final int A01;

    public AnonymousClass6SA(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 2, this.A00);
        C162417s1.A07(parcel, 3, this.A01);
        C162417s1.A06(parcel, A002);
    }
}
