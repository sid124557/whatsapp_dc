package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7vY  reason: invalid class name and case insensitive filesystem */
public final class C164497vY implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6TO[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                d = C162447s6.A00(parcel, readInt);
            } else if (c != 3) {
                C162447s6.A0I(parcel, readInt);
            } else {
                d2 = C162447s6.A00(parcel, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6TO(d, d2);
    }
}
