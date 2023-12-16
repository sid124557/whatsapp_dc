package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6Re  reason: invalid class name and case insensitive filesystem */
public final class C127236Re extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164317vG();
    public final String A00;

    public C127236Re(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C1695389r.A04(parcel, this.A00, C162417s1.A00(parcel));
    }
}
