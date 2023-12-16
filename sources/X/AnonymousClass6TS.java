package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6TS  reason: invalid class name */
public final class AnonymousClass6TS extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163597u4();
    public final int A00;
    public final int A01;
    public final String A02;

    public AnonymousClass6TS(int i, String str, int i2) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 1, this.A00);
        C162417s1.A0B(parcel, this.A02, 2, false);
        C162417s1.A07(parcel, 3, this.A01);
        C162417s1.A06(parcel, A002);
    }

    public AnonymousClass6TS(String str, int i) {
        this.A00 = 1;
        this.A02 = str;
        this.A01 = i;
    }
}
