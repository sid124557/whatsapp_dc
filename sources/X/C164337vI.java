package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7vI  reason: invalid class name and case insensitive filesystem */
public final class C164337vI implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6SN[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        AnonymousClass6SE[] r4 = null;
        long j = 0;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                j = C162447s6.A07(parcel, readInt);
            } else if (c == 3) {
                r4 = (AnonymousClass6SE[]) C162447s6.A0R(parcel, AnonymousClass6SE.CREATOR, readInt);
            } else if (c != 4) {
                z = C162447s6.A0M(parcel, c, 5, readInt, z);
            } else {
                C162447s6.A0K(parcel, readInt, 4);
                i = parcel.readInt();
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6SN(r4, i, j, z);
    }
}
