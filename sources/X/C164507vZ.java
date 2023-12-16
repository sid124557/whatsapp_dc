package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7vZ  reason: invalid class name and case insensitive filesystem */
public final class C164507vZ implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6TQ[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                str2 = C162447s6.A0E(parcel, str2, c, 3, readInt);
            } else {
                str = C162447s6.A0D(parcel, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6TQ(str, str2);
    }
}
