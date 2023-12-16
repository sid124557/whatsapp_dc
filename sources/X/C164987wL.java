package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7wL  reason: invalid class name and case insensitive filesystem */
public final class C164987wL implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6SB[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                C162447s6.A0I(parcel, readInt);
            } else {
                bundle = C162447s6.A08(parcel, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6SB(bundle);
    }
}
