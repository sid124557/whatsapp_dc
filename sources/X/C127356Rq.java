package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6Rq  reason: invalid class name and case insensitive filesystem */
public final class C127356Rq extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164397vO();
    public final int A00;
    public final AnonymousClass6SL A01;

    public C127356Rq(AnonymousClass6SL r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 1, this.A00);
        C162417s1.A0A(parcel, this.A01, 2, i, false);
        C162417s1.A06(parcel, A002);
    }
}
