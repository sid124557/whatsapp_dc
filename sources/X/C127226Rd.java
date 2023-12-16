package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6Rd  reason: invalid class name and case insensitive filesystem */
public final class C127226Rd extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164067up();
    public final String A00;

    public C127226Rd(String str) {
        C162177rO.A02(str);
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 1, 1);
        C1695389r.A04(parcel, this.A00, A002);
    }
}
