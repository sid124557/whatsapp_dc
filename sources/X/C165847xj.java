package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7xj  reason: invalid class name and case insensitive filesystem */
public abstract class C165847xj implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(18);

    public int describeContents() {
        C142536xM r0;
        if (this instanceof AnonymousClass6L5) {
            r0 = C142536xM.DATABASE_FULL;
        } else if (this instanceof AnonymousClass6L4) {
            r0 = C142536xM.PREFETCH_START;
        } else if (this instanceof AnonymousClass6L7) {
            r0 = C142536xM.PREFETCH_CACHE_EVICT;
        } else if (this instanceof AnonymousClass6L6) {
            r0 = C142536xM.MANIFEST_PARSE_ERROR;
        } else {
            r0 = C142536xM.CACHE_ERROR;
        }
        return r0.mValue;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(describeContents());
    }
}
