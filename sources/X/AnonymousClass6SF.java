package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6SF  reason: invalid class name */
public final class AnonymousClass6SF extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164407vP();
    public final int A00;
    public final C127866Tp A01;
    public final AnonymousClass6T1 A02;

    public AnonymousClass6SF(C127866Tp r1, AnonymousClass6T1 r2, int i) {
        this.A00 = i;
        this.A01 = r1;
        this.A02 = r2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 1, this.A00);
        C162417s1.A0A(parcel, this.A02, 3, i, C1695389r.A06(parcel, this.A01, i));
        C162417s1.A06(parcel, A002);
    }
}
