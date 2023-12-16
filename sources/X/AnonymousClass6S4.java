package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6S4  reason: invalid class name */
public final class AnonymousClass6S4 extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164807w3();
    public final int A00;
    public final String A01;

    public AnonymousClass6S4(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 2, this.A00);
        C162417s1.A0B(parcel, this.A01, 3, false);
        C162417s1.A06(parcel, A002);
    }
}
