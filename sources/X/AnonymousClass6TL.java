package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6TL  reason: invalid class name */
public final class AnonymousClass6TL extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164087ur();
    public String A00;
    public final int A01;

    public AnonymousClass6TL(int i, String str) {
        this.A01 = i;
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 1, this.A01);
        C1695389r.A04(parcel, this.A00, A002);
    }

    public AnonymousClass6TL() {
        this.A01 = 1;
    }
}
