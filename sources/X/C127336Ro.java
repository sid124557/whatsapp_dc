package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6Ro  reason: invalid class name and case insensitive filesystem */
public final class C127336Ro extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164077uq();
    public final String A00;
    public final byte[] A01;

    public C127336Ro(String str, byte[] bArr) {
        C162177rO.A02(str);
        this.A00 = str;
        C162177rO.A02(bArr);
        this.A01 = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 1, 1);
        C162417s1.A0E(parcel, this.A01, 3, C1695389r.A07(parcel, this.A00));
        C162417s1.A06(parcel, A002);
    }
}
