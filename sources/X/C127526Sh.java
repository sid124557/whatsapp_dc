package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6Sh  reason: invalid class name and case insensitive filesystem */
public final class C127526Sh extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C163737uI();
    public final String A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C127526Sh)) {
            return false;
        }
        return this.A00.equals(((C127526Sh) obj).A00);
    }

    public C127526Sh(String str) {
        C162177rO.A02(str);
        this.A00 = str;
    }

    public final int hashCode() {
        return C18310x6.A08(this.A00, AnonymousClass002.A0L(), 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0B(parcel, this.A00, 1, false);
        C162417s1.A06(parcel, A002);
    }
}
