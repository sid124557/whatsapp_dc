package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6TW  reason: invalid class name */
public final class AnonymousClass6TW extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163557u0();
    public int A00;
    public Bundle A01;
    public AnonymousClass6SQ A02;
    public C127806Tj[] A03;

    public AnonymousClass6TW(Bundle bundle, AnonymousClass6SQ r2, C127806Tj[] r3, int i) {
        this.A01 = bundle;
        this.A03 = r3;
        this.A00 = i;
        this.A02 = r2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A02(this.A01, parcel, 1);
        C162417s1.A0F(parcel, this.A03, 2, i);
        C162417s1.A07(parcel, 3, this.A00);
        C162417s1.A0A(parcel, this.A02, 4, i, false);
        C162417s1.A06(parcel, A002);
    }

    public AnonymousClass6TW() {
    }
}
