package X;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* renamed from: X.6SD  reason: invalid class name */
public final class AnonymousClass6SD extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164187v1();
    public final String A00;
    public final String A01;
    public final String A02;

    public AnonymousClass6SD(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0B(parcel, this.A00, 1, false);
        C162417s1.A0B(parcel, this.A01, 2, false);
        C162417s1.A0B(parcel, this.A02, 5, false);
        C162417s1.A06(parcel, A002);
    }
}
