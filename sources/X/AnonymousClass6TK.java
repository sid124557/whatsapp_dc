package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6TK  reason: invalid class name */
public final class AnonymousClass6TK extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163577u2();
    public final int A00;
    public final AnonymousClass6UC A01;

    public AnonymousClass6TK(AnonymousClass6UC r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 1, this.A00);
        C162417s1.A0A(parcel, this.A01, 2, i, false);
        C162417s1.A06(parcel, A002);
    }

    public AnonymousClass6TK(AnonymousClass6UC r2) {
        this.A00 = 1;
        this.A01 = r2;
    }
}
