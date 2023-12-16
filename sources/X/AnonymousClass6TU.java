package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6TU  reason: invalid class name */
public final class AnonymousClass6TU extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163617u6();
    public final int A00;
    public final C127856To A01;
    public final String A02;

    public AnonymousClass6TU(C127856To r1, String str, int i) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = r1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 1, this.A00);
        C162417s1.A0A(parcel, this.A01, 3, i, C1695389r.A07(parcel, this.A02));
        C162417s1.A06(parcel, A002);
    }

    public AnonymousClass6TU(C127856To r2, String str) {
        this.A00 = 1;
        this.A02 = str;
        this.A01 = r2;
    }
}
