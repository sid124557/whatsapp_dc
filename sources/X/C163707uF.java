package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7uF  reason: invalid class name and case insensitive filesystem */
public final class C163707uF implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C127506Sf[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        long j = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                C162447s6.A0I(parcel, readInt);
            } else {
                j = C162447s6.A07(parcel, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new C127506Sf(j);
    }
}
