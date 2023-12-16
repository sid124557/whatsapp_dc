package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6Rn  reason: invalid class name and case insensitive filesystem */
public final class C127326Rn extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164057uo();
    public final int A00;
    public final String A01;

    public C127326Rn(String str, int i) {
        C162177rO.A02(str);
        this.A01 = str;
        this.A00 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 1, 1);
        C162417s1.A0B(parcel, this.A01, 2, false);
        C162417s1.A07(parcel, 3, this.A00);
        C162417s1.A06(parcel, A002);
    }
}
