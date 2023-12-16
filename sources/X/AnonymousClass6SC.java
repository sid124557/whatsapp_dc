package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6SC  reason: invalid class name */
public class AnonymousClass6SC extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163377ti();
    public int A00;
    public Bundle A01;
    public final int A02;

    public AnonymousClass6SC(Bundle bundle, int i, int i2) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 1, this.A02);
        C162417s1.A07(parcel, 2, this.A00);
        C162417s1.A02(this.A01, parcel, 3);
        C162417s1.A06(parcel, A002);
    }
}
