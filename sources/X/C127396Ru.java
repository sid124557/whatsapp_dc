package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6Ru  reason: invalid class name and case insensitive filesystem */
public final class C127396Ru extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164687vr();
    public final int A00;
    public final AnonymousClass6T9 A01;

    public C127396Ru(AnonymousClass6T9 r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 2, this.A00);
        C1695389r.A03(parcel, this.A01, i, A002);
    }
}
