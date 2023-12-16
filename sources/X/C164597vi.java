package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7vi  reason: invalid class name and case insensitive filesystem */
public final class C164597vi implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6T0[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        C127886Tr r1 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                r1 = (C127886Tr) C162447s6.A0A(parcel, C127886Tr.CREATOR, readInt);
            } else if (c == 3) {
                i = C162447s6.A03(parcel, readInt);
            } else if (c != 4) {
                i3 = C162447s6.A06(parcel, c, 5, readInt, i3);
            } else {
                C162447s6.A0K(parcel, readInt, 4);
                i2 = parcel.readInt();
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6T0(r1, i, i2, i3);
    }
}
