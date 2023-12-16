package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationAvailability;

/* renamed from: X.7uy  reason: invalid class name and case insensitive filesystem */
public final class C164157uy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LocationAvailability[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        AnonymousClass6TD[] r5 = null;
        long j = 0;
        int i = 1000;
        int i2 = 1;
        int i3 = 1;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i2 = C162447s6.A03(parcel, readInt);
            } else if (c == 2) {
                i3 = C162447s6.A03(parcel, readInt);
            } else if (c == 3) {
                j = C162447s6.A07(parcel, readInt);
            } else if (c == 4) {
                C162447s6.A0K(parcel, readInt, 4);
                i = parcel.readInt();
            } else if (c != 5) {
                C162447s6.A0I(parcel, readInt);
            } else {
                r5 = (AnonymousClass6TD[]) C162447s6.A0R(parcel, AnonymousClass6TD.CREATOR, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new LocationAvailability(r5, i, i2, i3, j);
    }
}
