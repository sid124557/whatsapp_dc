package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6SH  reason: invalid class name */
public final class AnonymousClass6SH extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164877wA();
    public final long A00;
    public final String A01;
    public final String A02;

    public AnonymousClass6SH(long j, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0B(parcel, this.A02, 3, C1695389r.A07(parcel, this.A01));
        C162417s1.A08(parcel, 4, this.A00);
        C162417s1.A06(parcel, A002);
    }
}
