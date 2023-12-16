package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7ux  reason: invalid class name and case insensitive filesystem */
public final class C164147ux implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C127846Tn[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = C162447s6.A03(parcel, readInt);
            } else if (c == 3) {
                i2 = C162447s6.A03(parcel, readInt);
            } else if (c == 4) {
                C162447s6.A0K(parcel, readInt, 4);
                i3 = parcel.readInt();
            } else if (c != 5) {
                i4 = C162447s6.A06(parcel, c, 6, readInt, i4);
            } else {
                j = C162447s6.A07(parcel, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new C127846Tn(i, i2, i3, j, i4);
    }
}
