package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6S7  reason: invalid class name */
public final class AnonymousClass6S7 extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164857w8();
    public final int A00;
    public final C127886Tr A01;

    public AnonymousClass6S7(C127886Tr r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 2, this.A00);
        C1695389r.A03(parcel, this.A01, i, A002);
    }
}
