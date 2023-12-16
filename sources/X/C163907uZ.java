package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7uZ  reason: invalid class name and case insensitive filesystem */
public final class C163907uZ implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass6TC[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        C127496Se r1 = null;
        C127606Sp r2 = null;
        AnonymousClass6T6 r3 = null;
        C127616Sq r4 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                r1 = (C127496Se) C162447s6.A0A(parcel, C127496Se.CREATOR, readInt);
            } else if (c == 2) {
                r2 = (C127606Sp) C162447s6.A0A(parcel, C127606Sp.CREATOR, readInt);
            } else if (c == 3) {
                r3 = (AnonymousClass6T6) C162447s6.A0A(parcel, AnonymousClass6T6.CREATOR, readInt);
            } else if (c != 4) {
                C162447s6.A0I(parcel, readInt);
            } else {
                r4 = (C127616Sq) C162447s6.A0A(parcel, C127616Sq.CREATOR, readInt);
            }
        }
        C162447s6.A0H(parcel, A02);
        return new AnonymousClass6TC(r3, r1, r2, r4);
    }
}
