package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7uw  reason: invalid class name and case insensitive filesystem */
public final class C164137uw implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6TM[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
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
        return new AnonymousClass6TM(i, z);
    }
}
