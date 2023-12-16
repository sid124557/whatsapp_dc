package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7vu  reason: invalid class name and case insensitive filesystem */
public final class C164717vu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C127426Rx[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                z = C162447s6.A0M(parcel, c, 3, readInt, z);
            } else {
                i = C162447s6.A03(parcel, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new C127426Rx(i, z);
    }
}
